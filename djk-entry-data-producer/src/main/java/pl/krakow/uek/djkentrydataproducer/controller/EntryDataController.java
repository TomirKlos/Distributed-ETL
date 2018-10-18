package pl.krakow.uek.djkentrydataproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.krakow.uek.djkentrydataproducer.entity.Website;
import pl.krakow.uek.djkentrydataproducer.service.EntryDataService;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class EntryDataController {

    private EntryDataService entryDataService;

    @Autowired
    EntryDataController(EntryDataService entryDataService) {
        this.entryDataService = entryDataService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/register")
    public ResponseEntity<Website> register(@RequestBody Website input) {
        Website result = entryDataService.scrap(input);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
