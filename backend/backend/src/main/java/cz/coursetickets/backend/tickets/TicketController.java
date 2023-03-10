package cz.coursetickets.backend.tickets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    List<TicketDTO> getAllTickets(@RequestParam(value = "usedb", defaultValue = "false") boolean usedb) {
        if (usedb){
            return ticketService.getAllTickets();
        } else {
            deleteAgreement();
            JsonStream jsonStream = new JsonStream();
            for (TicketInDTO ticket : jsonStream.getTickets(jsonStream.stream())){
                createAgreement(ticket);
            }
            return ticketService.getAllTickets();
        }
    }

    @PostMapping
    TicketDTO createAgreement(@RequestBody TicketInDTO ticketData) {

        return ticketService.createTicket(ticketData);
    }

    @DeleteMapping()
    String deleteAgreement() {
            return ticketService.deleteTickets();
    }
}