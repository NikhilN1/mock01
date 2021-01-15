package com.yoska.mock01;

public class Event {

    String topic;
    String description;
    int image;

    public Event(String topic, String description, int image) {
        this.topic = topic;
        this.description = description;
        this.image = image;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
