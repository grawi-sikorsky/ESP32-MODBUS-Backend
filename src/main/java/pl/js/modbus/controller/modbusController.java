package pl.js.modbus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class modbusController {

    @GetMapping("/a")
    public String gecior(){
        return "aaa";
    }

    @PostMapping("/data")
    public String sendData(){

        return "sending data...";
    }
    
}
