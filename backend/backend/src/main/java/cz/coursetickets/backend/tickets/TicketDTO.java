package cz.coursetickets.backend.tickets;

import cz.coursetickets.backend.common.domain.Ticket;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import java.util.Date;

@Data
@Builder
public class TicketDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;
    private Double move;
    private Long amount;
    private Double valBuy;
    private Double valSell;
    private Double valMid;
    private Double currBuy;
    private Double currSell;
    private Double currMid;
    private Long version;
    private Double cnbMid;
    private Double ecbMid;
    private String shortName;
    private Date validFrom;

    public static TicketDTO fromDB(Ticket ticket) {
        if (ticket == null) return null;
        return TicketDTO.builder()
                .id(ticket.getId())
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
                .build();
    }

    // Getters and setters
}