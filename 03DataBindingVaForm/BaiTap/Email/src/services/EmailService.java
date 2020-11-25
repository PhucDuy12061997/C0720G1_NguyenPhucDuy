package services;

import model.Email;

public interface EmailService {
    Email create();

    Email update(Email email);
}
