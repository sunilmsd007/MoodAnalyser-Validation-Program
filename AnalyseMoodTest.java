import org.junit.Assert;
import org.junit.Test;

public class AnalyseMoodTest {

	@Test
	public void givenMessageShouldReturnSad() {
		AnalyseMood analyse = new AnalyseMood("I am in Sad Mood");
		String actualResult = analyse.moodAnalyser();
		Assert.assertEquals("Sad", actualResult);
	}
        @Test
        public void givenMessageShouldReturnHappy() {
                AnalyseMood analyse = new AnalyseMood("I am in Happy Mood");
                String actualResult = analyse.moodAnalyser();
                Assert.assertEquals("Happy", actualResult);
        }
}
