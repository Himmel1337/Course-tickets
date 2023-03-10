package cz.coursetickets.backend.tickets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.*;
import cz.coursetickets.backend.common.TicketRepository;
import cz.coursetickets.backend.common.domain.Ticket;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public List<TicketDTO> getAllTickets() {
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

    public String deleteTickets() {
        ticketRepository.deleteAll();
        return "Tickets was deleted.";
    }
}
