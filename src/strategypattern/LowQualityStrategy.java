package strategypattern;

public class LowQualityStrategy implements QualityStrategy {

    @Override
    public void playVideo(String videoTitle) {
        System.out.println("playing '"+videoTitle+"' in low quality");
    }
}
