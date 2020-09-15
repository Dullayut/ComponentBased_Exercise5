/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisefive;

import java.util.Scanner;

/**
 *
 * @author Au
 */
public class ExerciseFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExerciseFiveBean MySource = new ExerciseFiveBean();
        Listener1 list1 = new Listener1();
        Listener2 list2 = new Listener2();
        MySource.addPropertyChangeListener(list1);
        MySource.addPropertyChangeListener(list2);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score ");
        String football = sc.nextLine();
        
        while(!football.isEmpty()) {
            MySource.setScore(football);
            System.out.print("Enter Score ");
            football = sc.nextLine();
        }
        MySource.removePropertyChangeListener(list1);
        MySource.removePropertyChangeListener(list2);
    }
    
}
