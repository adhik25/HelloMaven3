import org.junit.Assert;
import org.junit.Test;

public class SearchBoxIsPresent {
    SearchBox sb;
    @Test
    public void verifySearchBoxIsPresent() {
        String name = "q";
        sb = new SearchBox();
        boolean result = sb.isPresent(name);
        Assert.assertTrue(result);
    }

}
