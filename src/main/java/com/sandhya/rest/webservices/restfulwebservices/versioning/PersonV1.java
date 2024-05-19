package com.sandhya.rest.webservices.restfulwebservices.versioning;

import lombok.Getter;

@Getter
public class PersonV1 {
    private String name;

    public PersonV1(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
