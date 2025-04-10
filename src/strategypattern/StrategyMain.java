package strategypattern;

public class StrategyMain {
    public static void main(String[] args) {

        VideoPlayer videoPlayer1 = new VideoPlayer(new HighQualityStrategy());
        videoPlayer1.playVideo("design pattern tutorial");

        VideoPlayer videoPlayer2 = new VideoPlayer(new LowQualityStrategy());
        videoPlayer2.playVideo("solid principles");

        VideoPlayer videoPlayer3 = new VideoPlayer();
        videoPlayer3.playVideo("strategy pattern tutorial");

        videoPlayer3.setVideoQualityStrategy(new MediumQualityStrategy());
        videoPlayer3.playVideo("strategy pattern tutorial");
    }
}
