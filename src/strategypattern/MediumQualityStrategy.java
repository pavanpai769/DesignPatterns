package strategypattern;

public class MediumQualityStrategy implements QualityStrategy {

    @Override
    public void playVideo(String videoTitle) {
        System.out.println("playing '"+videoTitle+"' in medium quality");
    }
}
