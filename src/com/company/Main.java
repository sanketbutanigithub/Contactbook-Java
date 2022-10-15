package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Phonenumber> phonenumberList = new ArrayList<>();
        List<Address> addressList = new ArrayList<>();
        phonenumberList.add(new Phonenumber("mydemo",1234567891));
        addressList.add((new Address("mydemoaddress","A-1 Strat strict plaza")));
        Contact contact = new Contact("Demo","DemoPvtLtd",phonenumberList,addressList);
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        do {
            System.out.println();
            System.out.println();
            System.out.println("1. Add Contact");
            System.out.println("2. SerachByName");
            System.out.println("3. SerachByOrganisation");
            System.out.println("4. UpdateContact");
            System.out.println("5. DeletContact");
            System.out.println("6. All Contact");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    String result = AddressBook.addcontact(contact);
                    System.out.println(result);
                    break;
                case 2 :
                    List<Contact> resultname = AddressBook.searchbyname("Demo");
                    if(resultname.size()!= 0){
                        for(int i = 0 ; i<resultname.size();i++){
                            System.out.println("Name  = "+resultname.get(i).getName());
                            System.out.println("Organazation  = "+resultname.get(i).getOrganization());
                        }
                    }else {
                        System.out.println("No data found");
                    }
                    break;
                case 3 :
                    List<Contact> resultorganaztion = AddressBook.searchbyorganisation("DemoPvtLtd");
                    if(resultorganaztion.size()!= 0){
                        for(int i = 0 ; i<resultorganaztion.size();i++){
                            System.out.println("Name  = "+resultorganaztion.get(i).getName());
                            System.out.println("Organazation  = "+resultorganaztion.get(i).getOrganization());
                        }
                    }else {
                        System.out.println("No data found");
                    }
                    break;
                case 4 :
                    Contact updatecontact = new Contact("Test","TestPvtLtd",phonenumberList,addressList);
                    String resultupdate = AddressBook.updatecontact("Demo",updatecontact);
                    System.out.println(resultupdate);
                    break;
                case 5 :
                    String resultdelete = AddressBook.deletecontact("Test");
                    System.out.println(resultdelete);
                    break;
                case 6 :
                    List<Contact> allcontact = AddressBook.allcontact();
                    if(allcontact.size()!= 0){
                        for(int i = 0 ; i<allcontact.size();i++){
                            System.out.println("Name  = "+allcontact.get(i).getName());
                            System.out.println("Organazation  = "+allcontact.get(i).getOrganization());
                            for(int j = 0 ;j <allcontact.get(i).addresses.size();j++){
                                System.out.println("Address = "+allcontact.get(i).addresses.get(j).getAddress());
                            }
                            for(int j = 0 ;j <allcontact.get(i).phonenumber.size();j++){
                                System.out.println("Phonenumber = "+(int)allcontact.get(i).phonenumber.get(j).getPhonnumber());
                            }
                        }
                    }else {
                        System.out.println("No data found");
                    }
                    break;
                case 7:
                    x = false;
                    System.out.println("Thank You :)");
                    break;
            }
        }while (x);
    }
}
