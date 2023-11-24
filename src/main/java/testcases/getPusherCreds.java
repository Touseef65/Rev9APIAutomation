package testcases;

import helpers.PersonServiceHelper;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

public class getPusherCreds {
    @Test
    public void superKiwi()
    {
        Response response= PersonServiceHelper.GetPusherCreds();
        Assert.assertEquals(response.statusCode(),200);
    }
}
