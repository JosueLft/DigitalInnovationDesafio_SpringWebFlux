package com.reign.lofty.goteiapi.repository;

import com.reign.lofty.goteiapi.document.Shinigamis;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ShinigamisRepository extends CrudRepository<Shinigamis, String> {
}