package com.efrei.tp3_efrei_spring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "library")
public class LibraryProperties {
    private int maxBooksByUser;
    private int maxLoanDurationInDays;

    public int getMaxBooksByUser() {
        return maxBooksByUser;
    }

    public void setMaxBooksByUser(int maxBooksByUser) {
        this.maxBooksByUser = maxBooksByUser;
    }

    public int getMaxLoanDurationInDays() {
        return maxLoanDurationInDays;
    }

    public void setMaxLoanDurationInDays(int maxLoanDurationInDays) {
        this.maxLoanDurationInDays = maxLoanDurationInDays;
    }
}
