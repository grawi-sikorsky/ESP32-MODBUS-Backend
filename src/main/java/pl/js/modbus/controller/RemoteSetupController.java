package pl.js.modbus.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.js.modbus.model.SetupModel;
import pl.js.modbus.service.RemoteSetupService;

@CrossOrigin(origins = {"*", "http://localhost:4200", "https://modbuspanel.herokuapp.com:8080", "http://10.0.2.2:8080"}, exposedHeaders="Access-Control-Allow-Origin")

@RestController
@RequestMapping("/setup")
public class RemoteSetupController {
    
    private final RemoteSetupService remoteSetupService;

    public RemoteSetupController(RemoteSetupService rSetupService) {
        this.remoteSetupService = rSetupService;
    }

    @GetMapping(value = "{modbusID}")
    public SetupModel sendSetupToRemote(@PathVariable("modbusID") String modbusID){
        return remoteSetupService.getSetupModel(modbusID);
    }

    @PostMapping
    public SetupModel saveSetupFromFrontend(@RequestBody SetupModel setup){
        return remoteSetupService.saveSetupModel(setup);
    }
}
