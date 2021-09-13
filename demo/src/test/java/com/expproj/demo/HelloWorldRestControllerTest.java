package com.expproj.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.expproj.demo.bean.Greetings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloWorldRestControllerTest {

    @Autowired
    TestRestTemplate template;

    /**
     * getForEntity will return you the entire response .
     */
    @Test
    public void testingRestReq()
    {
        ResponseEntity<Greetings> forEntity = template.getForEntity("/rest", Greetings.class);
        assertEquals(HttpStatus.OK,forEntity.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON,forEntity.getHeaders().getContentType());
        assertEquals("Hello World!",forEntity.getBody().getMessage());

    }

    /**
     * getForObject will return the message and map it to the bean model we used
     */
    @Test
    public void getwithname()
    {
        Greetings forEntity = template.getForObject("/rest?name=dolly", Greetings.class);
        assertEquals("Hello dolly!",forEntity.getMessage());

    }
}
