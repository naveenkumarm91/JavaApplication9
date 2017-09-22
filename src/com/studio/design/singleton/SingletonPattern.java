/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studio.design.singleton;

import java.util.Date;

/**
 *
 * @author 
 */
public class SingletonPattern
{

    final Date d;

    private SingletonPattern()
    {
        d = new Date();
    }
    private static final SingletonPattern SINGLETON_PATTERN = new SingletonPattern();

    public static SingletonPattern Instance()
    {
        return SINGLETON_PATTERN;
    }

    @Override
    public String toString()
    {
        return "SingletonPattern{" + "d=" + d + '}';
    }

}
