/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Trieu
 */
public class NENode extends ANode{
    private int value;
    private ANode[] left;
    private ANode[] right;
    
    public boolean isEmpty(){
        return true;
    }
    
    public int sum(){
        return value;
    }
}
