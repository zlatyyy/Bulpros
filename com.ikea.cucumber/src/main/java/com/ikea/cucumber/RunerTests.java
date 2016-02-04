package com.ikea.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"html:report/smokeTest.html"}, features = {"D:/Cucumber/Work/src/test/java/ikea.feature"},tags={"@smokeTest"})
public class RunerTests {
}