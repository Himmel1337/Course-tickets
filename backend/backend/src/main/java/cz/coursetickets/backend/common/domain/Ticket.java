package cz.coursetickets.backend.common.domain;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

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

    @Column(name = "val_buy")
    private Double valBuy;

    @Column(name = "val_sell")
    private Double valSell;

    @Column(name = "val_mid")
    private Double valMid;

    @Column(name = "curr_buy")
    private Double currBuy;

    @Column(name = "curr_sell")
    private Double currSell;

    @Column(name = "curr_mid")
    private Double currMid;

    @Column(name = "version")
    private Long version;

    @Column(name = "cnb_mid")
    private Double cnbMid;

    @Column(name = "ecb_mid")
    private Double ecbMid;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "valid_from")
    private LocalDate validFrom;

}
