package com.in28minutes.rest.webservices.restfullservice.controllers;


import com.in28minutes.rest.webservices.restfullservice.bean.User;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import com.in28minutes.rest.webservices.restfullservice.exceptionhanlders.UserNotCreatedException;
import com.in28minutes.rest.webservices.restfullservice.exceptionhanlders.UserNotFoundException;
import com.in28minutes.rest.webservices.restfullservice.serviceDAO.UserRepository;
import com.in28minutes.rest.webservices.restfullservice.serviceDAO.UserServiceDAO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping(path = "/basepath")
public class UserController {


    public MessageSource messageSource;

    public UserController(MessageSource messageSource,UserRepository userRepository){

        this.messageSource = messageSource;
        this.userRepository=userRepository;
    }

    @Autowired
    public UserServiceDAO userServiceDAO;

    @Autowired
    public UserRepository userRepository;

    @GetMapping(path = "/users")
    public List<User> getAllUsers(){
        return userServiceDAO.findAll();
    }

    @GetMapping(path = "/jpa/users")
    public List<User> getJpaAllUsers()
    {
        return userRepository.findAll();

    }

    @GetMapping(path = "/users/{id}")
    public EntityModel<User> getUser(@PathVariable int id){
        User user = userServiceDAO.findOne(id);
        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder webMvcLinkBuilder = linkTo(methodOn(this.getClass()).getAllUsers());
        entityModel.add(webMvcLinkBuilder.withRel("all-users"));
        if (user==null) {
            throw new UserNotFoundException("User id not found for :- " + id);
        }
        return entityModel;

    }
    @GetMapping(path = "/jpa/users/{id}")
    public EntityModel<User> getJpaUser(@PathVariable int id){
        User user = userRepository.findById(id).get();
        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder webMvcLinkBuilder = linkTo(methodOn(this.getClass()).getAllUsers());
        entityModel.add(webMvcLinkBuilder.withRel("all-users"));
        if (user==null) {
            throw new UserNotFoundException("User id not found for :- " + id);
        }
        return entityModel;

    }

    /**
     * Below post mapping is creating an object so we need to send correct http response code of 201
     * which is for object created
     * So return a ResponseEntity object in place of a string return
     * @param user
     * @return
     */
    @PostMapping(path = "/users")
    public ResponseEntity<Object> PostUser(@Valid @RequestBody User user ){
        if(userServiceDAO.saveUser(user)!=null){
            //return ResponseEntity.created(null).body("User created with id : - "+user.getId());
            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
            return ResponseEntity.created(location).body("!!! User Created !!!");
        }/*else{
            throw new UserNotCreatedException("User Not created :- " + user.getName());
        }*/
        return ResponseEntity.internalServerError().build();
    }
    @PostMapping(path = "/jpa/users")
    public ResponseEntity<Object> PostJpaUser(@Valid @RequestBody User user ){
        if(userRepository.save(user)!=null){
            //return ResponseEntity.created(null).body("User created with id : - "+user.getId());
            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
            return ResponseEntity.created(location).body("!!! User Created !!!");
        }/*else{
            throw new UserNotCreatedException("User Not created :- " + user.getName());
        }*/
        return ResponseEntity.internalServerError().build();
    }

    @DeleteMapping(path = "/users/remove/{id}")
    public String removeUser(@PathVariable int id){
        return userServiceDAO.deleteUserByID(id);
    }

    @DeleteMapping(path = "/jpa/users/remove/{id}")
    public String removeJpaUser(@PathVariable int id){
        userRepository.deleteById(id);

        return "deleted user";
    }

    @GetMapping(path = "/internationalization")
    public String sendInternationlizationMessage(){
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",null,null,locale);
    }

}
