package com.example.venky.jokesllib;

import java.util.Random;

public class JokesClass {
    private String[] jokes =
            {"A family of mice were surprised by a big cat. Father Mouse jumped and and said, \"Bow-wow!\" The cat ran away. \"What was that, Father?\" asked Baby Mouse. \"Well, son, that's why it's important to learn a second language.\" ",
            "Patient: Doctor! You've got to help me! Nobody ever listens to me. No one ever pays any attention to what I have to say.\n" +
                    "Doctor: Next please! ","A snail walks into a bar and the barman tells him there's a strict policy about having snails in the bar and so kicks him out. A year later the same snail re-enters the bar and asks the barman \"What did you do that for?\" "};
    private Random random = new Random();

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
