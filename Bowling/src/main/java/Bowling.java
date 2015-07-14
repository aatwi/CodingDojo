import static java.lang.Integer.parseInt;

public class Bowling {


    public static int play(String gameScore) {
        String[] frames = gameScore.replace("-", "0").split("\\|");
        return scoreGame(frames, 0);
    }

    private static int scoreGame(String[] frames, int index) {
        if(index >= frames.length) {
            return 0;
        }
        int frameScore;
        
        String frame = frames[index];
        String firstKnockedPins = frame.substring(0, 1);
        String secondKnockedPins = frame.substring(1, 2);

        if(firstKnockedPins.equals("X")) {
            frameScore = 10;
        }
        else if(secondKnockedPins.equals("/")) {
            int nextBall = 0;
            if(index + 1 < frames.length) {
                nextBall = parseInt(frames[index+1].substring(0,1));
            }
            frameScore = 10 + nextBall;
        }
        else  {
            frameScore = parseInt(firstKnockedPins) + parseInt(secondKnockedPins);
        }

        return frameScore + scoreGame(frames, index + 1);
    }

}
