package test;

import eu.tsystems.mms.tic.testframework.pageobjects.UiElement;
import eu.tsystems.mms.tic.testframework.testing.PageFactoryProvider;
import eu.tsystems.mms.tic.testframework.testing.TesterraTest;
import org.testng.annotations.Test;
import pages.ResultPage;
import pages.StartPage;

public class GoogleSearchTest extends TesterraTest implements PageFactoryProvider {

    @Test(invocationCount = 1, threadPoolSize = 1)
    public void test_Search() {
        StartPage startPage = pageFactory.createPage(StartPage.class);
        ResultPage resultPage = startPage.type("testerra").searchByEnter();
        Control.withTimeout(1, () -> {
            UiElement headline = resultPage.result().list().first().headline();
            headline.text().contains("Testerra");
            headline.click();
        });
    }

}
