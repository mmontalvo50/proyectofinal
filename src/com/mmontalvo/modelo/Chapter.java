/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmontalvo.modelo;

/**
 *
 * @author PC6-LAB2
 */
public class Chapter {
    private int ID;
    private String title;
    private int duration;
    private short year;
    private boolean viewed ;
    private int timeViewer;
    private int sessionNumber;

    public Chapter() {
    }

    public Chapter(int ID, String title, int duration, short year, boolean viewed, int timeViewer, int sessionNumber) {
        this.ID = ID;
        this.title = title;
        this.duration = duration;
        this.year = year;
        this.viewed = viewed;
        this.timeViewer = timeViewer;
        this.sessionNumber = sessionNumber;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(short year) {
        this.year = year;
    }

    /**
     * @return the viewed
     */
    public boolean isViewed() {
        return viewed;
    }

    /**
     * @param viewed the viewed to set
     */
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * @return the timeViewer
     */
    public int getTimeViewer() {
        return timeViewer;
    }

    /**
     * @param timeViewer the timeViewer to set
     */
    public void setTimeViewer(int timeViewer) {
        this.timeViewer = timeViewer;
    }

    /**
     * @return the sessionNumber
     */
    public int getSessionNumber() {
        return sessionNumber;
    }

    /**
     * @param sessionNumber the sessionNumber to set
     */
    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
    
}