package FilteringSystem;

public class TooLongTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int max){
        this.maxLength = max;
    }

    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
