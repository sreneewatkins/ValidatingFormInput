package com.tts.ValidatingFormInput;

//https://spring.io/guides/gs/validating-form-input/

/*
The application involves validating a user’s name and age, so you first need to
create a class that backs the form used to create a person.
 */

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    //Does not allow a null value, which is what Spring MVC generates if the entry is empty.
    //Allows names between 2 and 30 characters long.
    @NotNull
    @Size(min=2, max=30)
    private String name;

    //Does not allow the age to be less than 18.
    @NotNull
    @Min(18)
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }

}//end PersonForm class
