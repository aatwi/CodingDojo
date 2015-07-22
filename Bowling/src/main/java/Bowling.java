import static java.lang.Integer.parseInt;

public class Bowling {


    public static int play(String gameScore) {
        String[] frames = gameScore.replace("-", "0").split("\\|");
        return scoreFrames(frames, 0);
    }

    private static int scoreFrames(String[] frames, int index) {
        if (index >= frames.length) {
            return 0;
        }
        int frameScore;

        String frame = frames[index];
        String firstKnockedPin = frame.substring(0, 1);

        if (firstKnockedPin.equals("X")) {
            int next2BallsScore = nextFrameKnockedPins(frames, index, 0);
            next2BallsScore += nextFrameKnockedPins(frames, index, 1);
            frameScore = 10 + next2BallsScore;
        } else {
            String secondKnockedPin = frame.substring(1, 2);
            if (secondKnockedPin.equals("/")) {
                frameScore = 10 + nextFrameKnockedPins(frames, index, 0);
            } else {
                frameScore = parseInt(firstKnockedPin) + parseInt(secondKnockedPin);
            }
        }

        return frameScore + scoreFrames(frames, index + 1);
    }

    private static int nextFrameKnockedPins(String[] frames, int index, int pinIndex) {
        if (index + 1 < frames.length) {
            return parseInt(frames[index + 1].substring(pinIndex, pinIndex + 1));
        }
        return 0;
    }

}
