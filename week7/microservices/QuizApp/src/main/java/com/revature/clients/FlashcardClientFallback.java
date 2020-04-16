package com.revature.clients;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.revature.models.Flashcard;


@Component
public class FlashcardClientFallback implements FlashcardClient {

	@Override
	public List<Flashcard> findAll() {
		return null;
	}

	@Override
	public String retrievePort() {
		return null;
	}

//	@Override
//	public Optional<List<Flashcard>> findAll() {
//		return Optional.empty();
//	}
//
//	@Override
//	public Optional<String> retrievePort() {
//		return Optional.empty();
//	}
}
