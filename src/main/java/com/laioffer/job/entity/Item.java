package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {


    public Item() {
    }

    public Item(String id, String title, String location, String companyLogo, String url, String description, Set<String> keywords, boolean favorite) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.companyLogo = companyLogo;
        this.url = url;
        this.description = description;
        this.keywords = keywords;
        this.favourite = favorite;
    }


    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("location")
    private String location;

    @JsonProperty("company_logo")
    private String companyLogo;

    @JsonProperty("url")
    private String url;

    @JsonProperty("description")
    private String description;

    private Set<String> keywords;

    private boolean favourite;

    public void setKeywords(Set<String> keywords) {
        this.keywords = keywords;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    public boolean isFavourite() {
        return favourite;
    }


}
