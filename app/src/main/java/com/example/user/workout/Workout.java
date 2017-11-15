package com.example.user.workout;

/**
 * Created by User on 14.11.2017.
 */

public class Workout {

    private String name;
    private String descriprion;

    private Workout(String name, String descriprion) {
        this.name = name;
        this.descriprion = descriprion;
    }

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public String getDescriprion() {
        return descriprion;
    }
}
