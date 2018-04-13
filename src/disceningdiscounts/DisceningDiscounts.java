/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disceningdiscounts;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class DisceningDiscounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int items=sc.nextInt();
        int threshold=sc.nextInt();
        int count=0;
        for (int i=0;i<items;i++) {
            int price=sc.nextInt();
            int discount=sc.nextInt();
            if (price*(1-(double)discount/100) <= threshold) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
