package strategypattern;

public class HighQualityStrategy implements  QualityStrategy {
    @Override
    public void playVideo(String videoTitle) {
        System.out.println("playing '"+videoTitle+"' in high quality");
    }
}
