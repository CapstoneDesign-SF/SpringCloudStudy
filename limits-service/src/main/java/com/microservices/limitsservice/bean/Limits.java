package com.microservices.limitsservice.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Limits {
    private int maximum;
    private int minimum;

    /*protected Limits(){
        super();
    }*/

    public Limits(int maximum, int minimum){
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }
}
