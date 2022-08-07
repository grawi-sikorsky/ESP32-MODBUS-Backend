package pl.js.modbus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.js.modbus.model.dataModel;

@Repository
public interface dataRepository extends CrudRepository<dataModel, Long> {
    
}
