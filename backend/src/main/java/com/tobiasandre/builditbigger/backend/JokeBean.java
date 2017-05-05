package com.tobiasandre.builditbigger.backend;

import com.tobiasandre.JokeLib;

/**
 * Created by Tobias Andre Eggers on 04/05/2017.
 */

public class JokeBean {

    private JokeLib jokeTelling;

    public JokeBean() {
        jokeTelling = new JokeLib();
    }

    public String getJoke() {
        return jokeTelling.getRandomJoke();
    }
}
