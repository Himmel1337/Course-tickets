package cz.coursetickets.backend.tickets;

import cz.coursetickets.backend.common.TicketRepository;
import cz.coursetickets.backend.common.domain.Ticket;
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

    public TicketDTO createTicket(TicketInDTO ticket) {
        ticketRepository.save(
            Ticket.builder()
                    .name(ticket.getName())
                    .country(ticket.getCountry())
                    .move(ticket.getMove())
                    .amount(ticket.getAmount())
                    .valBuy(ticket.getValBuy())
                    .valSell(ticket.getValSell())
                    .valMid(ticket.getValMid())
                    .currBuy(ticket.getCurrBuy())
                    .currSell(ticket.getCurrSell())
                    .currMid(ticket.getCurrMid())
                    .version(ticket.getVersion())
                    .cnbMid(ticket.getCnbMid())
                    .ecbMid(ticket.getEcbMid())
                    .shortName(ticket.getShortName())
                    .validFrom(ticket.getValidFrom())
                    .build()
        );

        return TicketDTO.fromDB(ticketRepository.findById(ticket.getId()).orElse(null));
    }
}
