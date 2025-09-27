package com.validation.validation_service.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.validation.validation_service.model.ativities.ActivitiesRequest;
import com.validation.validation_service.model.ativities.Errors;
import com.validation.validation_service.model.ativities.ValidationIngestionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/risk")
public class ValidationController {
    @PostMapping(value = "/validation", produces = "application/json; charset=UTF-8")
    public ResponseEntity<String> activityIngestion(
            @RequestHeader(value = "x-svb-correlation-id", required = false) String apigeeCorrelationId,
            @RequestBody ActivitiesRequest activityRequest) throws JsonProcessingException {
        ResponseEntity<String> responseEntity = null;
        ObjectMapper objectMapper = new ObjectMapper();
        ValidationIngestionResponse validationIngestionResponse = new ValidationIngestionResponse();
        if (activityRequest.getId().contains("qwerty")) {
            validationIngestionResponse.setStatusCode("VALIDATION_SUCCESS");
            validationIngestionResponse.setValidationStatus("VALIDATION_SUCCESS");
            String json = objectMapper.writeValueAsString(validationIngestionResponse);
            responseEntity = new ResponseEntity<>(json, HttpStatus.ACCEPTED);
        } else {
            validationIngestionResponse.setStatusCode("PARTIAL_SUCCESS_CODE");
            validationIngestionResponse.setValidationStatus("PARTIAL_SUCCESS_CODE");
            Errors error = new Errors();
            error.setIn("qwerty missing");
            error.setMessage("qwerty missing");
            List<Errors> errorsList = new ArrayList<>();
            errorsList.add(error);
            validationIngestionResponse.setErrorJsonArray(errorsList);

            String json = objectMapper.writeValueAsString(validationIngestionResponse);
            responseEntity = new ResponseEntity<>(json, HttpStatus.ACCEPTED);
        }


        return responseEntity;
    }
}