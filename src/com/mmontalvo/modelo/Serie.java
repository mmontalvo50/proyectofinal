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
public class Serie {
     private int ID;
    private String title;
    private String genere;
    private String creator;
    private int duration;
    private short year;
    private boolean viewer;
    private int sesionQuantiy;
    private Chapter chapter;
     
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
     * @return the genere
     */
    public String getGenere() {
        return genere;
    }

    /**
     * @param genere the genere to set
     */
    public void setGenere(String genere) {
        this.genere = genere;
    }

    /**
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
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
     * @return the sessionQuantity
     */
    public int getSessionQuantity() {
        return sessionQuantity;
    }

    /**
     * @param sessionQuantity the sessionQuantity to set
     */
    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    /**
     * @return the chapter
     */
    public Chapter getChapter() {
        return chapter;
    }

    /**
     * @param chapter the chapter to set
     */
    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
    private boolean viewed ;
    private int sessionQuantity;
  
    

    public Serie() {
    }

    public Serie(int ID, String title, String genere, String creator, int duration, short year, boolean viewed, int sessionQuantity, Chapter chapter) {
        this.ID = ID;
        this.title = title;
        this.genere = genere;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.viewed = viewed;
        this.sessionQuantity = sessionQuantity;
        this.chapter = chapter;
    }
    
}
