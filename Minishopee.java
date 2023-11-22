/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minishopee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Minishopee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello!");
        JOptionPane.showMessageDialog(null, "Welcome sa lowkey na shopee ni tony");
        JOptionPane.showMessageDialog(null, "Una mao ni akong baligya \n Goldfish \n Shark \n Butanding \n Baki \n Siokoy ");
        
        
        while (true) {
        
        String[] oms = {"Goldfish - P10", "Shark - P20", "Butanding - P35", "Baki - P10", "Siokoy - P80"};
        int[] prices = {10, 20, 35, 10, 80};
        int sumatotal = 0;
        List<String> napalit = new ArrayList<>();

        while (true) {
            String[] oms2 = {"Goldfish - P10", "Shark - P20", "Butanding - P35", "Baki - P10", "Siokoy - P80"};

            String pili = (String) JOptionPane.showInputDialog(null, "Pili asa imo diri",
                    "pamalit na choi", JOptionPane.QUESTION_MESSAGE, null, oms2, oms2[0]);
            
            if (pili == null) {
                break;
            }

            String buok = null;
           
            while (buok == null || buok.isEmpty()) {
                buok = JOptionPane.showInputDialog(null, "Pila kabuok? ");

                if (buok == null) {

                    int dinasya = JOptionPane.showConfirmDialog(null, "Do u want to end ni nga transaction?", "🥹🥹🥹", JOptionPane.YES_NO_OPTION);

                    if (dinasya == JOptionPane.NO_OPTION) {
                        continue;
                    } else if (dinasya == JOptionPane.YES_OPTION) {
                       JOptionPane.showMessageDialog(null, "Matsalam!");
                        System.exit(0);
                    } else if (dinasya == JOptionPane.CANCEL_OPTION) {
                        JOptionPane.showMessageDialog(null, "U cancel da transaction");
               System.exit(0);
            }
                } 

                if (buok.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ngiii wa mn kay gi butang!");
                    JOptionPane.showMessageDialog(null, "Usaba");
                    continue;
                }

            }

            int quantity = Integer.parseInt(buok);
            napalit.add(pili + " x" + quantity);

            int napili = Arrays.asList(oms2).indexOf(pili);
            int itemPrice = prices[napili];

            int totalItemPrice = itemPrice * quantity;
            sumatotal += totalItemPrice;

            JOptionPane.showMessageDialog(null, "All goods: " + pili + " x" + quantity);
            break;
        } 

        while (true) {
            int limot = JOptionPane.showConfirmDialog(null, "mamalit paka?", "baligya", JOptionPane.YES_NO_OPTION);

            if (limot == JOptionPane.YES_OPTION) {

                String[] oms2 = {"Goldfish - P10", "Shark - P20", "Butanding - P35", "Baki - P10", "Siokoy - P80"};

                String pili = (String) JOptionPane.showInputDialog(null, "pili usab",
                        "pamalit na choi", JOptionPane.QUESTION_MESSAGE, null, oms2, oms2[0]);

                if (pili == null) {
                    break;
                }

                String buok = null;

                while (buok == null || buok.isEmpty()) {
                    buok = JOptionPane.showInputDialog(null, "Pila kabuok? ");

                    if (buok == null) {

                        int dinasya = JOptionPane.showConfirmDialog(null, "Do u want to end ni nga transaction?", "🥹🥹🥹", JOptionPane.YES_NO_OPTION);

                        if (dinasya == JOptionPane.NO_OPTION) {
                            continue;
                        } else if (dinasya == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "Matsalam!");
                            System.exit(0);
                        }
                    }

                    if (buok.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ngiii wa mn kay gi butang!");
                        JOptionPane.showMessageDialog(null, "Usaba");
                        continue;
                    }
                    
                }

                int quantity = Integer.parseInt(buok);
                napalit.add(pili + " x" + quantity);

                int napili = Arrays.asList(oms2).indexOf(pili);
                int itemPrice = prices[napili];

                int totalItemPrice = itemPrice * quantity;
                sumatotal += totalItemPrice;

                JOptionPane.showMessageDialog(null, "All goods: " + pili + " x" + quantity);

            } else if (limot == JOptionPane.NO_OPTION) {
                break;
            }
        }

        if (!napalit.isEmpty()) {
            String finalpalit = "Ari na tanan imo gi pili po:\n";
            for (String item : napalit) {
                finalpalit = finalpalit + item + "\n";
            }
            finalpalit = finalpalit + "Total po: P" + sumatotal;
            JOptionPane.showMessageDialog(null, finalpalit);
        } else {
            JOptionPane.showMessageDialog(null, "Ngi wa mn kay gi palit");
            JOptionPane.showMessageDialog(null, "HAHAHA okay");
           break;
        }

        //without discount 
        if (sumatotal < 200) {
            
            

            String bayad1 = null;

            while (bayad1 == null || bayad1.isEmpty()) {
                while (true) {
                bayad1 = JOptionPane.showInputDialog(null, "Butang bayad choi:");

                if (bayad1 == null) {
                    int dinasya = JOptionPane.showConfirmDialog(null, "Sure ka mo out ka?", "ngiii", JOptionPane.YES_NO_OPTION);

                    if (dinasya == JOptionPane.NO_OPTION) {
                        continue;
                    } else if (dinasya == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "babyee");
                        //break;
                        System.exit(0);
                    }
                } else if (bayad1.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ngiii wa mn kay gi butang!");
                    JOptionPane.showMessageDialog(null, "Usaba");
                    continue;
                }
                
                
                int balyu;

                if ((balyu = Integer.parseInt(bayad1)) > 0) {
                    if (balyu < sumatotal) {

                        JOptionPane.showMessageDialog(null, "Oppss, kulang imong kwarta");
                        int bleh = JOptionPane.showConfirmDialog(null, "Gusto pa ka mo padayun?", "CONFIRMATION", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (bleh == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "Enter a value again (kanang di na kulang)");
                            continue;
                        } else if (bleh == JOptionPane.NO_OPTION) {
                            break;
                        } else if (bleh == JOptionPane.CANCEL_OPTION) {
                            JOptionPane.showMessageDialog(null, "You cacnel the transaction");
                           System.exit(0);
                        }

                    } else if (balyu > sumatotal) {
                        int ngi = balyu - sumatotal;
                        JOptionPane.showMessageDialog(null, "Saksespuly Purchased✅: P" + sumatotal);
                        JOptionPane.showMessageDialog(null, "Sukli nimo boss paki claim lamat ❤ \n" + "                     " + "P" + ngi);
                        break;
                    } else if (balyu == sumatotal) {
                        JOptionPane.showMessageDialog(null, "Saksespuly Purchased✅: P" + sumatotal);
                        break;
                    }
                }
                
                
            }
            }
        }
            //with discount
             if (sumatotal >= 200) {
                 
               
                JOptionPane.showMessageDialog(null, "Nice boi abot 100 kapin imo gi palit");
                JOptionPane.showMessageDialog(null, "At dahil jan, may diskawnt ka sakin\n" + "                    " + "10%\n" + "                " + "yeheyyy!");
                JOptionPane.showMessageDialog(null, "Total ganina sa imo gipalit po is P" + sumatotal);
                int pinakafinal = (int) sumatotal / 10;
                int bayronon = (int) sumatotal - pinakafinal;
                JOptionPane.showMessageDialog(null, "Then mao nani imo final bayronon po P" + bayronon);

                
                
                String bayad = null;

                while (bayad == null || bayad.isEmpty()) {
                    while (true) {
                    bayad = JOptionPane.showInputDialog(null, "Butang bayad choi:");

                    if (bayad == null) {
                        int dinasya = JOptionPane.showConfirmDialog(null, "Sure ka mo out ka?", "ngiii", JOptionPane.YES_NO_OPTION);

                        if (dinasya == JOptionPane.NO_OPTION) {
                            continue;
                        } else if (dinasya == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "babyee");
                            System.exit(0);
                        }
                    } else if (bayad.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ngiii wa mn kay gi butang!");
                        JOptionPane.showMessageDialog(null, "Usaba");
                        continue;
                    }

                    int balyu;

                    if ((balyu = Integer.parseInt(bayad)) > 0) {
                         if (balyu < bayronon) {

                        JOptionPane.showMessageDialog(null, "Oppss, kulang imong kwarta");
                        int bleh = JOptionPane.showConfirmDialog(null, "Gusto pa ka mo padayun?", "CONFIRMATION", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (bleh == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "Enter a value again (kanang di na kulang)");
                            continue;
                        } else if (bleh == JOptionPane.NO_OPTION) {
                            break;
                        } else if (bleh == JOptionPane.CANCEL_OPTION) {
                            JOptionPane.showMessageDialog(null, "You cacnel the transaction");
                            System.exit(0);
                        }

                    } else if (balyu > bayronon) {
                            int ngi = balyu - bayronon;
                             JOptionPane.showMessageDialog(null, "Saksespuly Purchased✅: P" + bayronon);
                            JOptionPane.showMessageDialog(null, "Sukli nimo boss paki claim lamat ❤ \n" + "                     " + "P" + ngi);
                            break;
                        } else if (balyu == bayronon) {
                             JOptionPane.showMessageDialog(null, "Saksespuly Purchased✅: P" + bayronon);
                             break;
                        }
                    }
                }
             }
            }
                    int abs = JOptionPane.showConfirmDialog(null, "MAmalit pa ba ka?", "hehe", JOptionPane.YES_NO_CANCEL_OPTION);
                    
                    if (abs == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Noice!");
                        continue;
                    } else if (abs == JOptionPane.NO_OPTION) {
                      JOptionPane.showMessageDialog(null, "Thank you beri mats, come again:>");
                      System.exit(0);
                    } else if (abs == JOptionPane.CANCEL_OPTION) {
                        JOptionPane.showMessageDialog(null, "You cancel the transaction");
                      System.exit(0);
                    }   
                    JOptionPane.showMessageDialog(null, "oki, thank you");   
        }
    }
}
