package pl.js.modbus.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.js.modbus.model.DataModel;
import pl.js.modbus.service.DataService;

@RestController
public class ModbusController {

    private final DataService dataService;

    public ModbusController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/data")
    public List<DataModel> showData(){
        return dataService.getData();
    }

    @PostMapping("/data")
    public String receiveData(){

        return "sending data...";
    }
    
}
