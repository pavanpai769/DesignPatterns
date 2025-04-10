package strategypattern;

public class VideoPlayer {
    private QualityStrategy videoQualityStrategy;

    public VideoPlayer(QualityStrategy videoQualityStrategy) {
        this.videoQualityStrategy = videoQualityStrategy;
    }

    public VideoPlayer() {};

    public void playVideo(String videoTitle) {
        if(this.videoQualityStrategy == null){
            System.out.println("No video quality strategy provided");
        } else {
            this.videoQualityStrategy.playVideo(videoTitle);
        }
    }

    public void setVideoQualityStrategy(QualityStrategy videoQualityStrategy) {
        this.videoQualityStrategy = videoQualityStrategy;
    }
}
