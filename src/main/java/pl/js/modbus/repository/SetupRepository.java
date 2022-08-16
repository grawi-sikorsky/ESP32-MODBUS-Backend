package pl.js.modbus.repository;

import org.springframework.data.repository.CrudRepository;

import pl.js.modbus.model.SetupModel;

public interface SetupRepository extends CrudRepository<SetupModel,Long> {

    SetupModel findByModbusID(String modbusID);
}
