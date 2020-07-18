/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agetest;

/**
 *
 * @author zhangshuting
 */
public class AgeTooBig extends Exception {

    public AgeTooBig(String message) {
        super(message);
        //System.out.println("你輸入的年紀太大了！");
    }
    
}
