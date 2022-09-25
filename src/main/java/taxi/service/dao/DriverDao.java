package taxi.service.dao;

import java.util.Optional;
import taxi.service.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
