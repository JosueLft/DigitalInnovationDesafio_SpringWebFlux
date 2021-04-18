package com.reign.lofty.goteiapi.controller;

import com.reign.lofty.goteiapi.document.Shinigamis;
import com.reign.lofty.goteiapi.repository.ShinigamisRepository;
import com.reign.lofty.goteiapi.service.ShinigamisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.reign.lofty.goteiapi.constants.GoteiConstant.SHINIGAMIS_ENDPOINT_LOCAL;

@RestController
@Slf4j
public class ShinigamisController {

    ShinigamisService shinigamisService;
    ShinigamisRepository shinigamisRepository;
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ShinigamisController.class);

    public ShinigamisController(ShinigamisService shinigamisService, ShinigamisRepository shinigamisRepository) {
        this.shinigamisService = shinigamisService;
        this.shinigamisRepository = shinigamisRepository;
    }

    @GetMapping(SHINIGAMIS_ENDPOINT_LOCAL)
    @ResponseStatus(HttpStatus.OK)
    public Flux<Shinigamis> getAllItems() {
        log.info("Requesting the list off all shinigamis");
        return shinigamisService.findAll();
    }

    @GetMapping(SHINIGAMIS_ENDPOINT_LOCAL +"/{id}")
    public Mono<ResponseEntity<Shinigamis>> findByIdShinigami(@PathVariable String id) {
        log.info("Requesting the Shinigami with id {}", id);
        return shinigamisService.findByIdShinigami(id)
                .map((item) -> new ResponseEntity<>(item, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(SHINIGAMIS_ENDPOINT_LOCAL)
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Shinigamis> createShinigami(@RequestBody Shinigamis shinigamis) {
        log.info("A new Shinigami was Created");
        return shinigamisService.save(shinigamis);
    }

    @DeleteMapping(SHINIGAMIS_ENDPOINT_LOCAL +"/{id}")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public Mono<HttpStatus> deleteByIdShinigami(@PathVariable String id) {
        shinigamisService.deleteByIdShinigami(id);
        log.info("Deleting the Shinigami with id {}", id);
        return Mono.just(HttpStatus.NOT_FOUND);
    }
}