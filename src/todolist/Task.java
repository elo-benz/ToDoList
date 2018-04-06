/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;
import java.util.Date;

/**
 *
 * @author lorenzobengzon
 */
public class Task {
    private String description;
    private String title;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    
    public String toString() {
        return title + "#" + description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
   
    
}
