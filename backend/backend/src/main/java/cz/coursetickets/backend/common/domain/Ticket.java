package cz.coursetickets.backend.common.domain;

import lombok.*;
import jakarta.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tickets_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "move")
    private Double move;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "valBuy")
    private Double valBuy;

    @Column(name = "valSell")
    private Double valSell;

    @Column(name = "valMid")
    private Double valMid;

    @Column(name = "currBuy")
    private Double currBuy;

    @Column(name = "currSell")
    private Double currSell;

    @Column(name = "currMid")
    private Double currMid;

    @Column(name = "version")
    private Long version;

    @Column(name = "cnbMid")
    private Double cnbMid;

    @Column(name = "ecbMid")
    private Double ecbMid;

    @Column(name = "shortName")
    private String shortName;

    @Column(name = "validFrom")
    private Date validFrom;

}
