package com.pei.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
