package taxi.service.dao;

import java.util.List;
import taxi.service.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
