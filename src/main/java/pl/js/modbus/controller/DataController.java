package pl.js.modbus.controller;
import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.js.modbus.model.DataModel;
import pl.js.modbus.service.DataService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/data")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public List<DataModel> showAllData(){
        return dataService.getData();
    }

    @GetMapping("/range")
    public List<DataModel> showDataRange(@RequestParam String start, @RequestParam String end){
        return dataService.getDataInRange(start, end);
    }

    @PostMapping
    public DataModel receiveData(@RequestBody DataModel incomingDataModel){
        return dataService.saveData(incomingDataModel);
    }
    
}
