import cz.coursetickets.backend.tickets.TicketDTO;
import cz.coursetickets.backend.tickets.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping
    List<TicketDTO> getAllAgreements() {
        return agreementsService.getAllAgreements();
    }

    @GetMapping("/{agreementId}")
    AgreementDTO getAgreement(@PathVariable Long agreementId) {
        try {
            return agreementsService.getOneAgreement(agreementId);
        } catch (MyException myException) {
            throw myException.getResponseStatusException();
        }
    }
}