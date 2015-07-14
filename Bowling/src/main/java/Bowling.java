import static java.lang.Integer.parseInt;

public class Bowling {


    public static int play(String gameScore) {
        int score = 0;
        String[] frames = gameScore.replace("-", "0").split("\\|");
        for (String frame : frames) {
            score += scoreFrame(frame);
        }
        return score;
    }

    private static int scoreFrame(String frame) {
        int firstTry = parseInt(frame.substring(0, 1));
        int secondTry = parseInt(frame.substring(1, 2));
        return firstTry + secondTry;
    }

}
