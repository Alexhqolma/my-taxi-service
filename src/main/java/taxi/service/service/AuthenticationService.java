package taxi.service.service;

import taxi.service.exception.AuthenticationException;
import taxi.service.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
