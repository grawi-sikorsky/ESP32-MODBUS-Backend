package pl.js.modbus.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pl.js.modbus.model.DataModel1;
import pl.js.modbus.service.DataService;

@RestController
public class ModbusController1 {

    private final DataService dataService;

    public ModbusController1(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/data")
    public List<DataModel1> showData(){
        return dataService.getData();
    }

    @PostMapping("/data")
    public DataModel1 receiveData(@RequestBody DataModel1 incomingDataModel){

        return dataService.saveData(incomingDataModel);
    }
    
}
