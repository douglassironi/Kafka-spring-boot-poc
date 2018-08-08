package com.douglassironi.impl;

import com.douglassironi.impl.database.ComandoSQL;
import lombok.Data;
import org.springframework.boot.jackson.JsonComponent;

@Data
public class SampleMessage {

    private final Integer id;

    private final String message;

    public SampleMessage(Integer id,
                         String message) {
        this.id = id;
        this.message = message;
    }


    @Override
    public String toString() {
        return "SampleMessage{id=" + this.id + ", message='" + this.message + "'}";
    }

}