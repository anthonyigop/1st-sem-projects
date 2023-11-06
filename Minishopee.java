/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minishopee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sacil_CPE
 */
public class Minishopee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello!");
        JOptionPane.showMessageDialog(null, "Welcome sa lowkey na shopee ni tony");
        int imo = JOptionPane.showConfirmDialog(null, "Mamalit ka?", "baligya", JOptionPane.YES_NO_OPTION);
        if (imo == JOptionPane.YES_OPTION) {

        } else if (imo == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "K bye!");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Sige, una mao ni akong baligya");

        String[] oms = {"Goldfish - P10", "Shark - P20", "Butanding - P35", "Baki - P10", "Siokoy - P80"};
        int[] prices = {10, 20, 35, 10, 80,};
        int sumatotal = 0;
        List<String> napalit = new ArrayList<>();

        while (true) {

            String[] oms2 = {"Goldfish - P10", "Shark - P20", "Butanding - P35", "Baki - P10", "Siokoy - P80"};
            String pili = (String) JOptionPane.showInputDialog(null, "Pili asa imo diri",
                    "pamalit na choi", JOptionPane.QUESTION_MESSAGE, null, oms2, oms2[0]);

            if (pili == null) {
                // JOptionPane.showMessageDialog(null, "Wala mn kay gi palit boi");
                break;
            }
            napalit.add(pili);

            int napili = Arrays.asList(oms).indexOf(pili);
            int itemPrice = prices[napili];

            sumatotal = sumatotal + itemPrice;

            JOptionPane.showMessageDialog(null, "All goods: " + pili);
        }

        if (!napalit.isEmpty()) {
            String finalpalit = "Ari na tanan imo gi pili po:\n";
            for (String item : napalit) {
                finalpalit = finalpalit + item + "\n";
            }
            finalpalit = finalpalit + "Total po: P" + sumatotal;
            JOptionPane.showMessageDialog(null, finalpalit);
        } else {
            JOptionPane.showMessageDialog(null, "Ngi wa mn kay gi pili");
            JOptionPane.showMessageDialog(null, "HAHAHA okay");
            System.exit(0);
        }

        //without discount 
        if (sumatotal < 100) {
            int bayad1 = Integer.parseInt(JOptionPane.showInputDialog("Butang imong bayad choi"));

            if (bayad1 > sumatotal) {
                int ngi = bayad1 - sumatotal;
                JOptionPane.showMessageDialog(null, "Sukli nimo boss paki claim lamat ❤ \n" + "                     " + "P" + ngi);
            } else if (bayad1 < sumatotal) {
                JOptionPane.showMessageDialog(null, "Kulang mn imong kwarta choi");
                JOptionPane.showMessageDialog(null, "Pauli sa sa inyo");
                JOptionPane.showMessageDialog(null, "Pangayog kwarta mama nimo");
                JOptionPane.showMessageDialog(null, "Anga nimo uy");
                System.exit(0);
            } else if (bayad1 == sumatotal) {
                // wla lng for the char
            }
        }
        //with discount
        if (sumatotal >= 100) {
            JOptionPane.showMessageDialog(null, "Nice boi abot 100 kapin imo gi palit");
            JOptionPane.showMessageDialog(null, "At dahil jan, may diskawnt ka sakin\n" + "                    " + "10%\n" + "                " + "yeheyyy!");
            JOptionPane.showMessageDialog(null, "Total ganina sa imo gipalit po is P" + sumatotal);
            int pinakafinal = (int) sumatotal / 10;
            int bayronon = (int) sumatotal - pinakafinal;
            JOptionPane.showMessageDialog(null, "Then mao nani imo final bayronon po P" + bayronon);

            int bayad = Integer.parseInt(JOptionPane.showInputDialog("Butang imong bayad choi"));
            if (bayad > bayronon) {
                int ngi = bayad - bayronon;
                JOptionPane.showMessageDialog(null, "Sukli nimo boss paki claim lamat ❤ \n" + "                     " + "P" + ngi);
            } else if (bayad < bayronon) {
                JOptionPane.showMessageDialog(null, "Kulang mn imong kwarta choi");
                JOptionPane.showMessageDialog(null, "Pauli sa sa inyo");
                JOptionPane.showMessageDialog(null, "Pangayog kwarta mama nimo");
                JOptionPane.showMessageDialog(null, "Anga nimo uy");
                System.exit(0);
            } else if (bayad == bayronon) {
                // wla lng for the char
            }
        }

        JOptionPane.showMessageDialog(null, "oki salamat sa pag palit:)");
    }
    
}
