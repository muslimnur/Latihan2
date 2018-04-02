/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;

/**
 *
 * @author Rafli Putra
 */
public class jobgrade {
    private String gradelevel;
    private int lowestsalary;
    private int highestsalary;

    public String getGradelevel() {
        return gradelevel;
    }

    public jobgrade() {
    }

    public jobgrade(String gradelevel, int lowestsalary, int highestsalary) {
        this.gradelevel = gradelevel;
        this.lowestsalary = lowestsalary;
        this.highestsalary = highestsalary;
    }

    public void setGradelevel(String gradelevel) {
        this.gradelevel = gradelevel;
    }

    public void setLowestsalary(int lowestsalary) {
        this.lowestsalary = lowestsalary;
    }

    public void setHighestsalary(int highestsalary) {
        this.highestsalary = highestsalary;
    }

    public int getLowestsalary() {
        return lowestsalary;
    }

    public int getHighestsalary() {
        return highestsalary;
    }
    

}
