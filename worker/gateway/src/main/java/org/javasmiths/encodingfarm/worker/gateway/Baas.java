/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javasmiths.encodingfarm.worker.gateway;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Joris Peeters
 */
public class Baas implements Observer {

    @Override
    public void update(Observable o, Object o1) {
        System.out.println("JOEPIE UPDATE " + o1.toString());
    }
    
}
