package MotorsportWarehouse.repository;

import MotorsportWarehouse.domain.CarPart;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by Byron on 2015/05/11.
 */
public class CarPartRepository extends CrudRepository<CarPart,Long> {
    public CarPart findByCode (String code);
}
