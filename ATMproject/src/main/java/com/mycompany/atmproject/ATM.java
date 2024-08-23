/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmproject;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author saiko_stores
 */
public final class ATM implements Serializable{
    private static final long serialVersionUID = 6529685098267757690L;
    public String accNum ;
    public String pinCode;
    public String balance;
    String [][] arr= new String[4][4]; 
    

   
    int c=0;
   public static ArrayList <ATM>  list = new ArrayList();
  // public static ArrayList<ATM> list2 = new ArrayList();
   public ATM()
   {
       //this.readDataInFile("G:\\jo.dat", accNum);
   }
    public ATM( String accNum , String pinCode , String balance )
    {
        this.accNum=accNum;
        this.pinCode=pinCode;
       //this.list=null;
        
    }
    public void setData(String accNum , String pinCode , String balance)
    {
        this.accNum=accNum;
        this.pinCode=pinCode;
        this.balance=balance;
    }
    public void addToList (ATM atm)
    {
        list.add(atm);
    }
    public void setPin(String pinCode)
    {
        this.pinCode=pinCode;
    }
    public boolean login(String FilePath , String accNum , String pinCode)
    {
        int flag=0;
      //  this.readDataInFile(FilePath);
        boolean m = false;
         int i=0;
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1).accNum);
        
       // for( i = 0 ; i < list.size() ; i++)
            while(i<list.size())
        {
            if(list.get(i).accNum.equalsIgnoreCase(accNum)  && list.get(i).pinCode.equalsIgnoreCase(pinCode))
            {
                m=true;
                System.out.println("succeed");
                flag=1;
            } 
            i++;
        }
//        if(flag==0)
//        {
//            //JOptionPane.showMessageDialog(null, "your Data is Wrong");
//            System.out.println("didnot succeed");
//            m=false;
//        }   
        
        return m;
    }
    public String getBalance(String FilePath , String accNum , String pinCode)
    {

         int i;
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1).accNum);
        for( i = 0 ; i < list.size() ; i++)
        {
            if(list.get(i).accNum.equals(accNum)  && list.get(i).pinCode.equals(pinCode))
            {
                System.out.println("hi");
                break;
            }     
        }
        return list.get(i).balance;
    }
    public void miniStatement(String FilePath , String accNum , String pinCode, String type , String date , String amount)
    {
        
         int i=0;
        for( i = 0 ; i < list.size() ; i++)
        {
            if(list.get(i).accNum.equals(accNum)  && list.get(i).pinCode.equals(pinCode))
            {
                System.out.println("hi");
               break;
            }     
        }
       // list.get(i).arr
            System.out.println(Arrays.deepToString(list.get(i).arr));
        if(list.get(i).c<4)
        {
            System.out.println("hommeeeeee");
            list.get(i).arr[list.get(i).c][0]=accNum;
            list.get(i).arr[list.get(i).c][1]=type;
            list.get(i).arr[list.get(i).c][2]=date;
            list.get(i).arr[list.get(i).c][3]=amount;
            list.get(i).c=list.get(i).c+1;
        }
        else if (list.get(i).c>=4)
        {
            list.get(i).c=0;
            list.get(i).arr[list.get(i).c][0]=accNum;
            list.get(i).arr[list.get(i).c][1]=type;
            list.get(i).arr[list.get(i).c][2]=date;
            list.get(i).arr[list.get(i).c][3]=amount;
            list.get(i).c=list.get(i).c+1;
        }
        System.out.println(Arrays.deepToString(list.get(i).arr));
        this.modifyFile(FilePath, list);
    }
    public String[][] returnMiniStatement(String FilePath , String accNum , String pinCode)
    {
      int i=0;
        for( i = 0 ; i < list.size() ; i++)
        {
            if(list.get(i).accNum.equals(accNum)  && list.get(i).pinCode.equals(pinCode))
            {
                System.out.println("hi");
               break;
            }     
        }
        return list.get(i).arr;
    }
    public void modifyFile(String FilePath , ArrayList<ATM> array )
    {
        
        try {
            new FileOutputStream(FilePath).close();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
         try (
            FileOutputStream fout = new FileOutputStream(FilePath);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
        ) {
             for( int i=0 ; i<array.size() ; i++){
            oout.writeObject(array.get(i)); 
             }
             fout.close();
             oout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void modifyBalance (String FilePath , String newBalance ,String accNum , String pinCode )
    {
        int i;
        for( i = 0 ; i < list.size() ; i++)
        {
            if(list.get(i).accNum.equals(accNum)  && list.get(i).pinCode.equals(pinCode))
            {
               break;
            }     
        }
        //list2.remove(list2.get(i));
     //  list2.remove(i);
        list.get(i).balance=newBalance;
//        this.setData(accNum, pinCode, newBalance);
//        list.set(i, this);
//        System.out.println(list2.get(i).balance); 
//        System.out.println(list2);
         // System.out.println(list);
      this.modifyFile(FilePath, list);
        
            //  System.out.println(list);
    }
    public void changePin (String FilePath , String newPin ,String accNum , String pinCode )
    {
        int i;
        for( i = 0 ; i < list.size() ; i++)
        {
            if(list.get(i).accNum.equals(accNum)  && list.get(i).pinCode.equals(pinCode))
            {
               break;
            }     
        }
        //this.setPin(newPin);
        //list.set(i, this);
        list.get(i).pinCode=newPin;
        this.modifyFile(FilePath, list);
    }
    public  <ATM> ArrayList<ATM> removeDuplicates(ArrayList<ATM> list)
    {
  
        // Create a new ArrayList
        ArrayList<ATM> newList = new ArrayList<ATM>();
  
        // Traverse through the first list
        for (ATM element : list) {
  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  
        // return the new list
        return newList;
    }
    
            
    public void writeDataInFile(String FilePath , String accNum , String pinCode , String balance ) {

    this.setData(accNum, pinCode , balance);

        File file = new File(FilePath);
        boolean append = file.exists(); // if file exists then append, otherwise create new

        try (
            FileOutputStream fout = new FileOutputStream(FilePath, append);
            AppendableObjectOutputStream oout = new AppendableObjectOutputStream(fout, append);
        ) {
            oout.writeObject(this); // replace "..." with serializable object to be written
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public void writeArrayInFile(String FilePath , ArrayList<ATM> array ) {

    this.setData(accNum, pinCode , balance);

        File file = new File(FilePath);
        boolean append = file.exists(); // if file exists then append, otherwise create new

        try (
            FileOutputStream fout = new FileOutputStream(FilePath, append);
            AppendableObjectOutputStream oout = new AppendableObjectOutputStream(fout, append);
        ) {
            for(int i =0 ; i < array.size() ; i++)
            {
            oout.writeObject(array.get(i)); 
            }// replace "..." with serializable object to be written
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    } 
    public void readDataInFile(String FilePath ) 
    {
       
        int size;
        ATM content = new ATM();
        ATM emp = new ATM();
       
        try (FileInputStream fis = new FileInputStream(FilePath );
     ObjectInputStream ois = new ObjectInputStream(fis)) {
         
      
for (;;) {
    try {
        
        content = (ATM) ois.readObject();
        list.add(content);
        
    }
    catch (EOFException exc) {
        break;
    }
}        
        ois.close();
        fis.close();      
        }catch(IOException | ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
//System.out.print(list.get(0));
       //list2=(ArrayList) list.clone();
        System.out.println(list);
        System.out.println(list.size());
      //return list2;
       
    }
     public int checkList(String FilePath ) 
    {
      // this.readDataInFile(FilePath, accNum);
       return list.size();
        
    }

    @Override
    public String toString() {
        return "ATM{" + "accNum=" + accNum + ", pinCode=" + pinCode + ", balance=" + balance + ", arr=" + Arrays.deepToString(arr) + ", c=" + c + '}';
    }

    
    

    
    
}
