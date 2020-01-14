package br.com.automacaoapi.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.automacaoapi.steps" }, features = {"src/main/java/br/com/automacaoapi/feature" }, tags = { "~@ignore", "@geral" })
public class Runner {

}
