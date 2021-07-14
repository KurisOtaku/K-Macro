/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmacro;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.MouseInfo;
import java.awt.PointerInfo;

/**
 *
 * @author cristiano.rosa
 */
public class KMacro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HeadlessException, AWTException {
        Robot r = new Robot();
        PointerInfo pi = MouseInfo.getPointerInfo();
        for (int i = 0; i < 10000; i++) {
            r.mouseMove(i, i);
        }
        System.out.println("");
        while (true) {
            pi = MouseInfo.getPointerInfo();
            System.out.println(pi.toString());
            System.out.println(pi.getLocation());
        }
    }

}
