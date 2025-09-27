package com.validation.validation_service.model.ativities;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;


import java.util.List;

public class ValidationIngestionResponse {
    String statusCode ;
    String validationStatus;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    public List<Errors> getErrorJsonArray() {
        return errorJsonArray;
    }

    public void setErrorJsonArray(List<Errors> errorJsonArray) {
        this.errorJsonArray = errorJsonArray;
    }

    List<Errors> errorJsonArray ;
}
