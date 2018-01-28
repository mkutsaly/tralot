

package com.kutsal.instagram.integration.rest.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "low_resolution",
    "standard_resolution",
    "comments",
    "caption",
    "likes",
    "link",
    "created_time",
    "images",
    "type",
    "users_in_photo",
    "filter",
    "tags",
    "id",
    "user",
    "location"
})
public class Videos {

    @JsonProperty("low_resolution")
    private LowResolution lowResolution;
    @JsonProperty("standard_resolution")
    private StandardResolution standardResolution;
    @JsonProperty("comments")
    private Comments comments;
    @JsonProperty("caption")
    private Object caption;
    @JsonProperty("likes")
    private Likes likes;
    @JsonProperty("link")
    private String link;
    @JsonProperty("created_time")
    private String createdTime;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("type")
    private String type;
    @JsonProperty("users_in_photo")
    private Object usersInPhoto;
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("user")
    private User user;
    @JsonProperty("location")
    private Object location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("low_resolution")
    public LowResolution getLowResolution() {
        return lowResolution;
    }

    @JsonProperty("low_resolution")
    public void setLowResolution(LowResolution lowResolution) {
        this.lowResolution = lowResolution;
    }

    @JsonProperty("standard_resolution")
    public StandardResolution getStandardResolution() {
        return standardResolution;
    }

    @JsonProperty("standard_resolution")
    public void setStandardResolution(StandardResolution standardResolution) {
        this.standardResolution = standardResolution;
    }

    @JsonProperty("comments")
    public Comments getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    @JsonProperty("caption")
    public Object getCaption() {
        return caption;
    }

    @JsonProperty("caption")
    public void setCaption(Object caption) {
        this.caption = caption;
    }

    @JsonProperty("likes")
    public Likes getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("created_time")
    public String getCreatedTime() {
        return createdTime;
    }

    @JsonProperty("created_time")
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("users_in_photo")
    public Object getUsersInPhoto() {
        return usersInPhoto;
    }

    @JsonProperty("users_in_photo")
    public void setUsersInPhoto(Object usersInPhoto) {
        this.usersInPhoto = usersInPhoto;
    }

    @JsonProperty("filter")
    public String getFilter() {
        return filter;
    }

    @JsonProperty("filter")
    public void setFilter(String filter) {
        this.filter = filter;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
