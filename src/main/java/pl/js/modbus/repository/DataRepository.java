package pl.js.modbus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.js.modbus.model.DataModel;

@Repository
public interface DataRepository extends CrudRepository<DataModel, Long> {
    
    List<DataModel> findByModbusID(String modbusID);
    
}
