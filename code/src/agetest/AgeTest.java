/*
 * B10433006_張舒婷
 */
package agetest;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author zhangshuting
 */

public class AgeTest {
    public static void main(String[] args) throws AgeTooSmall, AgeTooBig {
        Scanner input=new Scanner(System.in);
        try{
            System.out.print("請輸入一個年紀:");
            int age = input.nextInt();
            CheckNum(age);
            System.out.println("你輸入的年紀是:"+age); 
        } catch (InputMismatchException e) {
            System.out.println("錯誤的數字格式");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("程式結束");
            System.exit(0);
        }
        
    }
    
    public static void CheckNum(int num) throws AgeTooSmall, AgeTooBig{
        if(num<20)throw new AgeTooSmall("你輸入的年紀太小了！");
        if(num>50)throw new AgeTooBig("你輸入的年紀太大了！");
    }    
  
}

