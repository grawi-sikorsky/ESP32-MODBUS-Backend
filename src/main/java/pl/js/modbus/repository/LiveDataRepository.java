package pl.js.modbus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.js.modbus.model.LiveDataModel;

@Repository
public interface LiveDataRepository extends CrudRepository<LiveDataModel, Long> {

    LiveDataModel findByModbusID(String modbusID);
}
