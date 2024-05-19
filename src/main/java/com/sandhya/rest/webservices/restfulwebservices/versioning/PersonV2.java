package com.sandhya.rest.webservices.restfulwebservices.versioning;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PersonV2 {
    private Name name;
    public PersonV2(Name name) {
        this.name = name;
    }

}
