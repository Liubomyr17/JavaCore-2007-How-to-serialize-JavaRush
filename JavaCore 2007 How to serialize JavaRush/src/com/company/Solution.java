package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Solution {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) {

    }
    public static class User {
        private String firstName;
        private String lastName;
        private Date birthDate;
        private boolean isMale;
        private Country country;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

        public boolean isMale() {
            return isMale;
        }

        public void setMale(boolean male) {
            isMale = male;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public enum Country {
            UKRAINE("Ukraine"),
            RUSSIA("Russia"),
            OTHER("Other");

            private String name;

            private Country(String name) {
                this.name = name;
            }

            public String getDisplayedName() {
                return this.name;
            }
        }
    }}



