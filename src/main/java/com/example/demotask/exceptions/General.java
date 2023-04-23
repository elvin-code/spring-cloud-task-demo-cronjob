package com.example.demotask.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class General extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String message;
    private String code;
    private String errorOrigen;

    @Override
    public String toString() {
        return getMessage() + " - " + getCode() + " - " + getErrorOrigen();
    }

}