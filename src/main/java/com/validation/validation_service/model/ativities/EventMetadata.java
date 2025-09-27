package com.validation.validation_service.model.ativities;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Objects;


public class EventMetadata {
    @JsonProperty("eventId")

    private String eventId;


    @JsonProperty("eventType")

    private String eventType;
    public EventMetadata() {
    }

    @Override
    public String toString() {
        return "EventMetadata{" +
                "eventId='" + eventId + '\'' +
                ", eventType='" + eventType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventMetadata that = (EventMetadata) o;
        return Objects.equals(eventId, that.eventId) && Objects.equals(eventType, that.eventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventType);
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
