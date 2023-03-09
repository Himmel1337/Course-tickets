package cz.coursetickets.backend.tickets;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TicketServiceImpl {
    @Autowired
    private TicketRepository ticketRepository;

    public List<TicketDTO> getAllTicket() {

        return ticketRepository.findAll().stream().map(TicketDTO::fromDB).collect(Collectors.toList());
    }
}
