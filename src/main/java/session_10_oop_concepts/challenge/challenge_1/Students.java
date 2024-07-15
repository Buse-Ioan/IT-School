package session_10_oop_concepts.challenge.challenge_1;

//1. College Management System -  Design a system for a college to efficiently manage information about students, professors, and courses:
// - Store comprehensive profiles for every student, capturing their first name, last name, sex, age, date of birth, CNP, and address.


import session_10_oop_concepts.practice.bank_account.Address;

import java.time.LocalDate;

public class Students {

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String ID;
    private Address address;

    public Students(String firstName, String lastName, String gender, LocalDate dateOfBirth, String ID, Address address) {
        this.firstName = firstName;
    }

}
