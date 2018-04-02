/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import Model.jobgrade;
import dao.jobgradedao;
import java.util.List;

/**
 *
 * @author Rafli Putra
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new Koneksi().getKoneksi());
        //System.out.println(new jobgradedao().getAllData().size());
    List<jobgrade> datas = new jobgradedao().getAllData();
//            for (int i = 0; i < datas.size();i++) {
//                System.out.println(
//                        datas.get(i).getGradelevel()+", gaji tertinggi "+datas.get(i).getHighestsalary());
//            }
            datas.forEach(x -> System.out.println(x.getGradelevel()+", gaji tertinggi " + x.getHighestsalary()));
    }
    
}
