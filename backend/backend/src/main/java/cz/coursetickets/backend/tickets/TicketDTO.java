package cz.coursetickets.backend.tickets;

import jakarta.persistence.*;

@Entity
@Table(name = "ticket")
public class TicketDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String status;

    // Getters and setters
}