package cz.coursetickets.backend.tickets;

import lombok.Builder;
import lombok.Data;
import java.util.Date;

@Data
@Builder
public class TicketInDTO {
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
}
