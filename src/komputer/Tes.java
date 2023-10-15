/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komputer;

import javax.swing.JOptionPane;

/**
 *
 * @author ThinkPad X1 Carbon
 */
public class Tes {
    public static void main(String[] args) {
        DataKomputer data = new DataKomputer();
        do {
             int p = data.pilihanMenu();
             switch (p) {
                 case AppInterface.ADD_DATA_KOMPUTER -> {
                     data.add();
                 }
                 case AppInterface.SEARC_BY_BRAND -> {
                     String key = data.keyword("brand");
                     Komputer k = data.searchBybrand(key);
                     data.viewData(k);
                 }
                case AppInterface.SEARCH_BY_MODEL -> {
                    String key = data.keyword("model");
                    Komputer k = data.searchByModel(key);
                    data.viewData(k);
                 }
                 case AppInterface.EXIT -> {
                     data.exit();
                 }
                 default -> {
                     JOptionPane.showMessageDialog(null, "Pilihan salah!!");
                 }
             }
        } while (true);
    }
}