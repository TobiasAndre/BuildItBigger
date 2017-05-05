package com.tobiasandre;

import java.util.Random;

public class JokeLib {

    private String[] jokes;
    private Random random;

    public JokeLib() {
        jokes = new String[5];
        jokes[0] = "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"";
        jokes[1] = "Q: How many prolog programmers does it take to change a lightbulb? A: Yes.";
        jokes[2] = "Why do Java developers wear glasses? Because they can't C#";
        jokes[3] = "My girlfriend and I often laugh about how competitive we are. But I laugh more.";
        jokes[4] = "My friend thinks he is smart. He told me an onion is the only food that makes you cry, so I threw a coconut at his face.";
        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
