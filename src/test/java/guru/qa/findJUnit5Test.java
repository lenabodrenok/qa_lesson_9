package guru.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class findJUnit5Test {

    @Test
    void selenideGithubCodeJUnit5(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(By.linkText("SoftAssertions")).shouldBe(visible).click();
        $$(".markdown-body").findBy(visible).shouldHave(text("Using JUnit5 extend test class"));
    }
}
