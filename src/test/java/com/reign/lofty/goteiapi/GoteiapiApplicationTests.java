package com.reign.lofty.goteiapi;

import com.reign.lofty.goteiapi.repository.ShinigamisRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static com.reign.lofty.goteiapi.constants.GoteiConstant.SHINIGAMIS_ENDPOINT_LOCAL;

@RunWith(SpringRunner.class)
@DirtiesContext
@AutoConfigureWebTestClient
@SpringBootTest
public class GoteiapiApplicationTests {

	@Autowired
	WebTestClient webTestClient;

	@Autowired
	ShinigamisRepository shinigamisRepository;

	@Test
	public void getOneShinigamiById(){
		webTestClient.get().uri(SHINIGAMIS_ENDPOINT_LOCAL.concat("/{id}"),"10")
				.exchange()
				.expectStatus().isOk()
				.expectBody();
	}

	@Test
	public void getOneShinigaminotFound(){
		webTestClient.get().uri(SHINIGAMIS_ENDPOINT_LOCAL.concat("/{id}"),"101")
				.exchange()
				.expectStatus().isNotFound();
	}


	@Test
	public void deleteShinigami(){
		webTestClient.delete().uri(SHINIGAMIS_ENDPOINT_LOCAL.concat("/{id}"),"13")
				.accept(MediaType.APPLICATION_JSON)
				.exchange()
				.expectStatus().isNotFound()
				.expectBody(Void.class);
	}
}