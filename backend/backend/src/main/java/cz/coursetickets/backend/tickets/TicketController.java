package cz.coursetickets.backend.tickets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {

    private TicketService ticketService;

    @GetMapping
    List<TicketDTO> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @PostMapping
    TicketDTO createAgreement(@RequestBody TicketInDTO ticketData) {
        return ticketService.createTicket(ticketData);
    }
}