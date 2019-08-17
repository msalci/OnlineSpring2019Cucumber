package com.vytrack.step_definitions;

import com.vytrack.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class CalendarEventsStepDefinitions {
        Pages pages = new Pages();
    @Then("following table headers should be displayed")
    public void following_table_headers_should_be_displayed(List<String> values) {
        Assert.assertEquals(values, pages.calendarEventsPage().getTableHeaders());






        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    //    throw new cucumber.api.PendingException();
    }
}
