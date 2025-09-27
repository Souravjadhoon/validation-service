package com.validation.validation_service.model.ativities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import java.util.Objects;


@JsonPropertyOrder({"userId", "userActivity", "eventMetadata"})
public class Data {
    @JsonProperty("eventMetadata")

    private EventMetadata eventMetadata;

    @JsonProperty("userActivity")

    private String userActivity;

    @JsonProperty("userId")
    private String userId;

    @Override
    public String toString() {
        return "Data{" +
                "eventMetadata=" + eventMetadata +
                ", userActivity='" + userActivity + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(eventMetadata, data.eventMetadata) && Objects.equals(userActivity, data.userActivity) && Objects.equals(userId, data.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventMetadata, userActivity, userId);
    }

    public EventMetadata getEventMetadata() {
        return eventMetadata;
    }

    public void setEventMetadata(EventMetadata eventMetadata) {
        this.eventMetadata = eventMetadata;
    }

    public String getUserActivity() {
        return userActivity;
    }

    public void setUserActivity(String userActivity) {
        this.userActivity = userActivity;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Data() {
    }
}
