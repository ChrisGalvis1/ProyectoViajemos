package com.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "com/stepsdefinitions/definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@ReservaAuto"
)
public class RunnerViajemos {
}
