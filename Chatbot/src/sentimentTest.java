import org.junit.Test;
import static org.junit.Assert.*;


public class sentimentTest {
    


    @Test public void testSentimentInt(){

        String positive = "I'm feeling well today!";
        String negative = "I'm feeling very bad today!";
        sentimentAnalyzer sa = new sentimentAnalyzer();

        int res = sa.getSentimentInt(negative);
        assertEquals(1, res);
    }

}
