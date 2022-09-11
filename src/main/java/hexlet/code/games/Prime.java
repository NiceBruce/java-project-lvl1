package hexlet.code.games;

import java.util.Random;

public class Prime implements Game {
    private static final int RANGE = 20; // increase difficulty
    private static String generalQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public final String getGeneralQuestion() {
        return generalQuestion;
    }

    public static String isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }

        return (number < 2) ? "no" : "yes";
    }

    public final String[] getGameData() {

        String[] gameData = new String[GAME_DATA_LEN];
        Random random = new Random();

        int number = random.nextInt(RANGE);

        gameData[0] = Integer.toString(number);
        gameData[1] = isPrime(number);

        return gameData;
    }
}
