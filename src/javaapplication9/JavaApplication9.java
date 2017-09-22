/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import com.studio.design.singleton.SingletonPattern;
import java.util.Date;

/**
 *
 * @author Naveen
 */
public class JavaApplication9
{

    private static void singletonPattern()
    {
        SingletonPattern pattern = SingletonPattern.Instance();
        System.out.println(new Date() + " " + pattern);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        singletonPattern();
    }

}
