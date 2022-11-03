package com.in28minutes.rest.webservices.restfullservice.controllers;


import com.in28minutes.rest.webservices.restfullservice.configuration.TicketConfigurationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketConfigurationController {
    public TicketConfigurationService ticketConfigurationService;


    /**
     * Constructor initialization
     * We could have used @Autowired also to inject the instance
     *
     * @Autowired
     * public TicketConfigurationService ticketConfigurationService;
     *
     *
     * @param ticketConfigurationService
     */
    public TicketConfigurationController(TicketConfigurationService ticketConfigurationService){
        this.ticketConfigurationService=ticketConfigurationService;
    }

    @RequestMapping(method = RequestMethod.GET,path = "/getTicket")
    public TicketConfigurationService getConfiguredvalue(){
        return ticketConfigurationService;
    }
}
