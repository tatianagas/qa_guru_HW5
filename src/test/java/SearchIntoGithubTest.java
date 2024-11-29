import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.nio.file.Files.find;

public class SearchIntoGithubTest {

    @Test
    void searchIntoSoftAssertions() {

        // открыть главную страницу Github
        open("https://github.com");

        // выбрать в меню Solutions -> Enterprize
        $(byTagAndText("button","Solutions")).hover();
        $(byTagAndText("a","Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));

    }

}
