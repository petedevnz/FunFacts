package nz.co.androidmobile.funfacts;

import java.util.Random;

/**
 * Created by petet on 5/07/2015.
 */
public class FactBook {

    // Member variable (properties about the object)
    public String[] mFacts = new String[]{
            "The kea, a bird native to NZ, is known for pulling windscreen wipers off cars and eating the strips of rubber from windows.",
            "The longest place name in the world is Taumatawhakatangihangakoauauotamateapokaiwhenuakitanatahu, a hill in Hawkes Bay.",
            "No part of the country is more than 128km (79 miles) from the sea.",
            "In the scene of Star Trek: First Contact, where we see Earth from space, Australia and Papua New Guinea are clearly visible but New Zealand is missing.",
            "Wellington is the southernmost capital city in the world.",
            "Only 5% of NZ\'s population is human - the rest are animals.",
            "NZ is the least corrupt nation in the world (tied with Denmark), according to the Corruptions Perception Index.",
            "New Zealand has more Scottish pipe bands per capita than any other country in the world.",
            "Blue Lake, in Nelson Lakes National Park, has the clearest water in the world.",
            "New Zealand is home to the world\'s smallest dolphin species.",
            "Organised commercial bungee jumping first began in New Zealand.",
            "The first man to climb Mt. Everest, Sir Edmund Hillary, was a Kiwi.",
            "The lowest denomination in NZ currency is the 10 cent piece.",
            "More people die in New Zealand each year playing lawn bowls than scuba diving.",
            "NZ is home to more species of penguins than any other country.",
            "In 1893, New Zealand became the first country to give women the right to vote.",
            "Auckland is one of the most affordable cities in the world to live in.",
            "One in three Auckland households own a boat.",
            "The Maori name for NZ, Aoetaroa, means \'land of the long white cloud\'.",
            "In 2013, NZ legalised same-sex marriage.",
            "Lake Taupo was formed by a supervolcanic eruption 26,000 years ago. The dust from the eruption could be seen in modern day China.",
            "New Zealand is home to the giant weta, the heaviest insect in the world. It is heavier than a sparrow and looks like a giant cockroach.",
            "Baldwin Street, in Dunedin, is the world\'s steepest street. The road has a gradient of 1 in 2.86 at its steepest section, a 38 per cent grade.",
            "15% of NZ\'s population are Maori.",
            "New Zealand is similar in size to the UK, but only has a population of about 4 million (compared to 63 million in the UK).",
            "About one third of the country is protected national park.",
            "NZ was voted the world\'s best country in 2007 and 2008 by Wanderlust magazine.",
            "Pelorus Jack was a dolphin who guided ships through dangerous and rocky waters around NZ in the early 1900s.",
            "There are only two countries in the world where drug companies are permitted to advertise to the public: New Zealand and USA.",
            "Kiwi Nancy Wake was the Gestapo\'s most wanted person during World War II. She once killed a SS sentry with her bare hands.",
            "More people live in Auckland than in the whole of the South Island.",
            "The logo for the Royal New Zealand Air Force is a kiwi - a flightless bird.",
            "In the Lord of the Rings films, the beer drunk on camera was a custom NZ brew called \'Sobering Thought\'.",
            "The filming of the Lord of the Rings pumped around $200 million into the country\'s economy. The New Zealand government even created a Minister for Lord of the Rings, to ensure the most money could be made from the films.",
            "In 1996, a man broke into a radio station in Wanganui and took the manager hostage, demanding that they play the Muppet song \"Rainbow Connection\".",
            "Two NZ rescue dogs were taught to drive a car around a track, in order to prove the intelligence of shelter animals.",
            "The Kiwi badminton team name was \'The Black Cocks\', but after a year, had to change it due to complaints.",
            "In 2008, TripAdvisor named Milford Sound the world\'s top travel destination, based on an international survey."};

    // Method (abilities: things the object can do)
    public String getFact() {

        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
