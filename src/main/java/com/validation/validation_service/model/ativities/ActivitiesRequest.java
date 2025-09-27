package com.validation.validation_service.model.ativities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import java.util.Objects;

@JsonPropertyOrder({"id","time","data"})
public class ActivitiesRequest {
    @JsonProperty("id")
    private String id;


    @JsonProperty("time")
    private String time;


    @JsonProperty("data")

    private Data data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ActivityRequest{" +
                "id='" + id + '\'' +
                ", time='" + time + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivitiesRequest that = (ActivitiesRequest) o;
        return Objects.equals(id, that.id) && Objects.equals(time, that.time) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, data);
    }

    public ActivitiesRequest() {
    }
}
