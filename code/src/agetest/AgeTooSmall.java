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
public class AgeTooSmall extends Exception {

    public AgeTooSmall(String message) {
        super(message);
        //System.out.println("你輸入的年紀太小了！");
    }
    
}
