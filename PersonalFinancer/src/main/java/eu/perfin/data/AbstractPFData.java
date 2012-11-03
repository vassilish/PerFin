/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.perfin.data;

import java.util.Date;

/**
 *
 * @author vassilish
 */
public abstract class AbstractPFData {
    private long id;
    private String description;
    private Date creationDate;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    
}
