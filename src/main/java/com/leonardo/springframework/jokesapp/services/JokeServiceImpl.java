package com.leonardo.springframework.jokesapp.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return jokes.getRandomQuote();
    }
}
