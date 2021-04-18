package com.reign.lofty.goteiapi.service;

import com.reign.lofty.goteiapi.document.Shinigamis;
import com.reign.lofty.goteiapi.repository.ShinigamisRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ShinigamisService {
    private final ShinigamisRepository shinigamisRepository;

    public ShinigamisService(ShinigamisRepository shinigamisRepository) {
        this.shinigamisRepository = shinigamisRepository;
    }

    public Flux<Shinigamis> findAll() {
        return Flux.fromIterable(this.shinigamisRepository.findAll());
    }

    public Mono<Shinigamis> findByIdShinigami(String id) {
        return Mono.justOrEmpty(this.shinigamisRepository.findById(id));
    }

    public Mono<Shinigamis> save(Shinigamis shinigamis) {
        return Mono.justOrEmpty(this.shinigamisRepository.save(shinigamis));
    }

    public Mono<Boolean> deleteByIdShinigami(String id) {
        shinigamisRepository.deleteById(id);
        return Mono.justOrEmpty(true);
    }
}