/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiskkeyword;

/**
 *
 * @author Arifeen Mahmud
 */
public class ThisKkeyword {

int a;
int b;

 public void setData(int a ,int b){
  this.a = a;
  this.b = b;
 }
 public void showData(){
   System.out.println("Value of A ="+a);
   System.out.println("Value of B ="+b);
 }
    public static void main(String[] args) {
   ThisKkeyword obj = new ThisKkeyword();
   obj.setData(2,3);
   obj.showData();

        
    }
    
}
