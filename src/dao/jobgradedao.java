/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.jobgrade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import latihan2.Koneksi;

/**
 *
 * @author Rafli Putra
 */
public class jobgradedao {

    public Connection Kon;

    public jobgradedao() {
        this.Kon = new Koneksi().getKoneksi();
    }

    /**
      
      Fungsi untuk melihat semua data JobGrades
      @param parameternya jobgrades
    */
    
    public List<jobgrade> getAllData() {
        List<jobgrade> datas = new ArrayList<>();

        try {
            PreparedStatement pst = Kon.prepareStatement("select * from HR.job_grades");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                jobgrade jd = new jobgrade(rs.getString("grade_level"), rs.getInt("lowest_sal"),
                        rs.getInt("highest_sal"));
//            jd.setGradelevel(rs.getString("grade_level"));
//            jd.setLowestsalary(rs.getInt("lowest_sal"));
//            jd.setHighestsalary(rs.getInt("highest_sal"));
                datas.add(jd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(jobgradedao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }
}
