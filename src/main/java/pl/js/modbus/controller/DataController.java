package pl.js.modbus.controller;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.js.modbus.model.DataModel;
import pl.js.modbus.service.DataService;

@CrossOrigin(origins = {"*", "http://localhost:4200", "https://modbuspanel.herokuapp.com:8080", "http://10.0.2.2:8080"}, exposedHeaders="Access-Control-Allow-Origin")
@RestController
@RequestMapping("/data")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public List<DataModel> showData(){
        return dataService.getData();
    }

    @PostMapping
    public DataModel receiveData(@RequestBody DataModel incomingDataModel){
        return dataService.saveData(incomingDataModel);
    }
    
}
