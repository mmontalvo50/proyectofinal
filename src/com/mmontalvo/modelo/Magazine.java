/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmontalvo.modelo;

import java.util.Date;

/**
 *
 * @author PC6-LAB2
 */
public class Magazine {
     private int ID;
    private String title;
    private Date editonDate;
    private String editorial;
    private String authors[];

    public Magazine() {
    }

    public Magazine(int ID, String title, Date editonDate, String editorial, String[] authors) {
        this.ID = ID;
        this.title = title;
        this.editonDate = editonDate;
        this.editorial = editorial;
        this.authors = authors;
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
     * @return the editonDate
     */
    public Date getEditonDate() {
        return editonDate;
    }

    /**
     * @param editonDate the editonDate to set
     */
    public void setEditonDate(Date editonDate) {
        this.editonDate = editonDate;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the authors
     */
    public String[] getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
   
    
}
