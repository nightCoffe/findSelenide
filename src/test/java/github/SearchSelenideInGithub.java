package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideInGithub {

    @Test
    void shouldFindSelenide() {

        //  open github.com
        open("https://github.com/");
        // input selenide in search field
        $("[name=q]").setValue("selenide").pressEnter();
        // click first search link
        $$(".repo-list li").get(0).$("a").click();
        $(byText("Go to file")).shouldBe(Condition.visible);
        //check: in title have text selenide/selenide
        $("h1").shouldHave(Condition.text("selenide"));

        sleep(5000);
    }
}
