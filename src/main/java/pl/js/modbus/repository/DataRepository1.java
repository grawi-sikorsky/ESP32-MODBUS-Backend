package pl.js.modbus.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.js.modbus.model.DataModel1;

@Repository
public interface DataRepository1 extends CrudRepository<DataModel1, Long> {
    
    List<DataModel1> findByModbusID(String modbusID);
    
}
