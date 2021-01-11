package com.example.voteservice.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Vote {
    @Id
    private int id;

    private String title;

    private String description;

    private String organizer;

    private Date startDate;

    private Date endDate;

    private int votingMethod;

    private int accessType;

    private List<String> options;

    public Vote(int id, String title, String description, String organizer, Date startDate, Date endDate, int votingMethod, int accessType, List<String> options) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.organizer = organizer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.votingMethod = votingMethod;
        this.accessType = accessType;
        this.options = options;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getVotingMethod() {
        return votingMethod;
    }

    public void setVotingMethod(int votingMethod) {
        this.votingMethod = votingMethod;
    }

    public int getAccessType() {
        return accessType;
    }

    public void setAccessType(int accessType) {
        this.accessType = accessType;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
