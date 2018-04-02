/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Rafli Putra
 */
public class Koneksi {
    public Connection Koneksi;
    
    public Connection getKoneksi() {
        try {
            OracleDataSource ods = new OracleDataSource();
                    ods.setServerName("Localhost");
                    ods.setPortNumber(1521);
                    ods.setServiceName("XE");
                    ods.setUser("System");
                    ods.setPassword("sariawan");
                    ods.setDriverType("thin");
                    Koneksi = ods.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return Koneksi;
    }
}
