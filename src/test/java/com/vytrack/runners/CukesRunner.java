package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = {"@storemanager or @negative"},
        features = {
            "src/test/resources/features" //to specify where are the features
        },
        //feature contains scenarios
        //every scenario is like a test
        //where is the implementation for features
        glue = {"com/vytrack/step_definitions"},
        //dry tun - to generate step definitions automatically
        //you will see them in the console output
        dryRun = false

)
public class CukesRunner {
}

// if dryRun = true gives generation below
//result
//"C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\jbr\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\lib\idea_rt.jar=60786:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\plugins\junit\lib\junit-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1.3\plugins\junit\lib\junit5-rt.jar;D:\Projects\OnlineSpring2019Cucumber\target\test-classes;C:\Users\Mms\.m2\repository\org\seleniumhq\selenium\selenium-java\3.141.59\selenium-java-3.141.59.jar;C:\Users\Mms\.m2\repository\org\seleniumhq\selenium\selenium-api\3.141.59\selenium-api-3.141.59.jar;C:\Users\Mms\.m2\repository\org\seleniumhq\selenium\selenium-chrome-driver\3.141.59\selenium-chrome-driver-3.141.59.jar;C:\Users\Mms\.m2\repository\org\seleniumhq\selenium\selenium-edge-driver\3.141.59\selenium-edge-driver-3.141.59.jar;C:\Users\Mms\.m2\repository\org\seleniumhq\selenium\selenium-firefox-driver\3.141.59\selenium-firefox-driver-3.141.59.jar;C:\Users\Mms\.m2\repository\org\seleniumhq\selenium\selenium-ie-driver\3.141.59\selenium-ie-driver-3.141.59.jar;C:\Users\Mms\.m2\repository\org\seleniumhq\selenium\selenium-opera-driver\3.141.59\selenium-opera-driver-3.141.59.jar;C:\Users\Mms\.m2\repository\org\seleniumhq\selenium\selenium-remote-driver\3.141.59\selenium-remote-driver-3.141.59.jar;C:\Users\Mms\.m2\repository\org\seleniumhq\selenium\selenium-safari-driver\3.141.59\selenium-safari-driver-3.141.59.jar;C:\Users\Mms\.m2\repository\org\seleniumhq\selenium\selenium-support\3.141.59\selenium-support-3.141.59.jar;C:\Users\Mms\.m2\repository\net\bytebuddy\byte-buddy\1.8.15\byte-buddy-1.8.15.jar;C:\Users\Mms\.m2\repository\org\apache\commons\commons-exec\1.3\commons-exec-1.3.jar;C:\Users\Mms\.m2\repository\com\google\guava\guava\25.0-jre\guava-25.0-jre.jar;C:\Users\Mms\.m2\repository\com\google\code\findbugs\jsr305\1.3.9\jsr305-1.3.9.jar;C:\Users\Mms\.m2\repository\org\checkerframework\checker-compat-qual\2.0.0\checker-compat-qual-2.0.0.jar;C:\Users\Mms\.m2\repository\com\google\errorprone\error_prone_annotations\2.1.3\error_prone_annotations-2.1.3.jar;C:\Users\Mms\.m2\repository\com\google\j2objc\j2objc-annotations\1.1\j2objc-annotations-1.1.jar;C:\Users\Mms\.m2\repository\org\codehaus\mojo\animal-sniffer-annotations\1.14\animal-sniffer-annotations-1.14.jar;C:\Users\Mms\.m2\repository\com\squareup\okhttp3\okhttp\3.11.0\okhttp-3.11.0.jar;C:\Users\Mms\.m2\repository\com\squareup\okio\okio\1.14.0\okio-1.14.0.jar;C:\Users\Mms\.m2\repository\io\github\bonigarcia\webdrivermanager\3.6.1\webdrivermanager-3.6.1.jar;C:\Users\Mms\.m2\repository\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;C:\Users\Mms\.m2\repository\commons-io\commons-io\2.6\commons-io-2.6.jar;C:\Users\Mms\.m2\repository\com\google\code\gson\gson\2.8.5\gson-2.8.5.jar;C:\Users\Mms\.m2\repository\org\apache\commons\commons-lang3\3.8.1\commons-lang3-3.8.1.jar;C:\Users\Mms\.m2\repository\org\apache\httpcomponents\httpclient\4.5.6\httpclient-4.5.6.jar;C:\Users\Mms\.m2\repository\org\apache\httpcomponents\httpcore\4.4.10\httpcore-4.4.10.jar;C:\Users\Mms\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\Mms\.m2\repository\commons-codec\commons-codec\1.10\commons-codec-1.10.jar;C:\Users\Mms\.m2\repository\org\rauschig\jarchivelib\1.0.0\jarchivelib-1.0.0.jar;C:\Users\Mms\.m2\repository\org\apache\commons\commons-compress\1.18\commons-compress-1.18.jar;C:\Users\Mms\.m2\repository\org\jsoup\jsoup\1.11.3\jsoup-1.11.3.jar;C:\Users\Mms\.m2\repository\com\github\javafaker\javafaker\0.18\javafaker-0.18.jar;C:\Users\Mms\.m2\repository\org\yaml\snakeyaml\1.23\snakeyaml-1.23-android.jar;C:\Users\Mms\.m2\repository\com\github\mifmif\generex\1.0.2\generex-1.0.2.jar;C:\Users\Mms\.m2\repository\dk\brics\automaton\automaton\1.11-8\automaton-1.11-8.jar;C:\Users\Mms\.m2\repository\org\apache\logging\log4j\log4j-api\2.12.0\log4j-api-2.12.0.jar;C:\Users\Mms\.m2\repository\org\apache\logging\log4j\log4j-core\2.12.0\log4j-core-2.12.0.jar;C:\Users\Mms\.m2\repository\org\slf4j\slf4j-simple\1.7.21\slf4j-simple-1.7.21.jar;C:\Users\Mms\.m2\repository\io\cucumber\cucumber-java\4.2.2\cucumber-java-4.2.2.jar;C:\Users\Mms\.m2\repository\io\cucumber\cucumber-core\4.2.2\cucumber-core-4.2.2.jar;C:\Users\Mms\.m2\repository\io\cucumber\cucumber-html\0.2.7\cucumber-html-0.2.7.jar;C:\Users\Mms\.m2\repository\io\cucumber\gherkin\5.1.0\gherkin-5.1.0.jar;C:\Users\Mms\.m2\repository\io\cucumber\tag-expressions\1.1.1\tag-expressions-1.1.1.jar;C:\Users\Mms\.m2\repository\io\cucumber\cucumber-expressions\6.2.0\cucumber-expressions-6.2.0.jar;C:\Users\Mms\.m2\repository\io\cucumber\datatable\1.1.12\datatable-1.1.12.jar;C:\Users\Mms\.m2\repository\io\cucumber\datatable-dependencies\1.1.12\datatable-dependencies-1.1.12.jar;C:\Users\Mms\.m2\repository\io\cucumber\cucumber-junit\4.2.2\cucumber-junit-4.2.2.jar;C:\Users\Mms\.m2\repository\junit\junit\4.12\junit-4.12.jar;C:\Users\Mms\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 com.vytrack.runners.CukesRunner
//
//
//        UUUUU
//
//        cucumber.runtime.junit.UndefinedThrowable: The step "Open Vytrack login page" is undefined
//
//
//        cucumber.runtime.junit.UndefinedThrowable: The step "Enter valid username and invalid password information" is undefined
//
//
//        cucumber.runtime.junit.UndefinedThrowable: The step "Click login" is undefined
//
//
//        cucumber.runtime.junit.UndefinedThrowable: The step "Message Invalid user name or password. should be displayed" is undefined
//
//
//        cucumber.runtime.junit.UndefinedThrowable: The step "Page title and url should be same" is undefined
//
//
//        Undefined scenarios:
//        src\test\resources\features\Login.feature:4 # Login test (negative)
//
//        1 Scenarios (1 undefined)
//        5 Steps (5 undefined)
//        0m0.254s
//
//
//        You can implement missing steps with the snippets below:
//
//@Given("Open Vytrack login page")
//public void open_Vytrack_login_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        }
//
//@When("Enter valid username and invalid password information")
//public void enter_valid_username_and_invalid_password_information() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        }
//
//@When("Click login")
//public void click_login() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        }
//
//@Then("Message Invalid user name or password. should be displayed")
//public void message_Invalid_user_name_or_password_should_be_displayed() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        }
//
//@Then("Page title and url should be same")
//public void page_title_and_url_should_be_same() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//        }
//
//
//
//
//        Process finished with exit code 0