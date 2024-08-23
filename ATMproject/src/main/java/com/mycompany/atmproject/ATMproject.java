/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atmproject;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author saiko_stores
 */
public class ATMproject {

    public static void main(String[] args) {
        ATM atm = new ATM();
      ATM atm1 = new ATM();
       ATM m= new ATM();
       atm.accNum="100";
       atm.pinCode="2003";
        atm1.accNum="200";
        ArrayList<ATM> list = new ArrayList();
        String array[][]= new String[2][2];
        array[0][0]="mennz";
        System.out.println(Arrays.deepToString(array));
        
       // list.add(atm);
        //list.add(atm1);
       // System.out.println(atm.list);
   //atm.modifyBalance("G:\\jo.dat", "90", "100", "2003");  
        //System.out.println(atm.list);
  //  m.modifyFile("G:\\jo.dat", list);
        
        //atm.removeDuplicates(atm.list2);
       // atm.deleteFile("G:\\loop.dat");
  // atm.writeDataInFile("G:\\jo.dat", "mok", "200" , "109");
       // atm.login("G:\\k.dat", "mustafa", "2000");
      // ATM m = new ATM();
     // m.writeDataInFile("G:\\f.dat", "mustafa", "2000");
   atm.readDataInFile("G:\\jo.dat");
   // atm.login("G:\\you.dat", "menna", "2003");
    }
}
