package taxi.service.service;

import java.util.Optional;
import taxi.service.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByLogin(String login);
}
