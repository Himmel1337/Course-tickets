package cz.coursetickets.backend.tickets;

import java.net.URL;
import java.util.List;

public interface TicketService {
    List<TicketDTO> getAllTickets();

    TicketDTO createTicket(TicketInDTO ticketData);

    String deleteTickets();

}
