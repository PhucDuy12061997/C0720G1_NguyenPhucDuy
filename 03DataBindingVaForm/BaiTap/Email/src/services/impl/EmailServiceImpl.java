package services.impl;

import model.Email;
import org.springframework.stereotype.Service;
import services.EmailService;
@Service
public class EmailServiceImpl implements EmailService {
    public Email create() {
        return new Email("Vietnamese", "25", true, "SuPea Jr");
    }

    @Override
    public Email update(Email email) {
        Email emailResult = new Email();

        emailResult.setLanguage(email.getLanguage());
        emailResult.setPageSize(email.getPageSize());
        emailResult.setSpamsFilter(email.isSpamsFilter());
        emailResult.setSignature(email.getSignature());

        return emailResult;
    }
}
