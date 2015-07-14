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
        String firstKnockedPins = frame.substring(0, 1);
        if(firstKnockedPins.equals("X")) {
            return 10;
        }

        String secondKnockedPins = frame.substring(1, 2);
        if(secondKnockedPins.equals("/")) {
            return 10;
        }

        return parseInt(firstKnockedPins) + parseInt(secondKnockedPins);
    }

}
