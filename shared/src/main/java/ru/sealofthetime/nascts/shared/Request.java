package ru.sealofthetime.nascts.shared;

import java.io.Serializable;

public class Request implements Serializable {
    private static final long serialVersionUID = 1248934L;
    
    public final String[] data;
    public Request(String... data){
        this.data = data;
    }
}