package taxi.service.service;

import java.util.Optional;
import taxi.service.exception.AuthenticationException;
import taxi.service.lib.Inject;
import taxi.service.lib.Service;
import taxi.service.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isEmpty() || !driver.get().getPassword().equals(password)) {
            throw new AuthenticationException("Username or password was incorrect");
        }
        return driver.get();
    }
}
