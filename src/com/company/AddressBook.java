package com.company;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    static List<Contact> mycontact = new ArrayList<>();
    static List<Contact> searhcbynamelist = new ArrayList<>();
    static List<Contact> searhcbyorganisation = new ArrayList<>();
    public static List<Contact> allcontact(){
        return mycontact;
    }
    public static String addcontact(Contact contact){
        if(mycontact.size()!=0){
            for(int i =0 ; i< mycontact.size();i++){
                if(mycontact.get(i).getName().equals(contact.name)){
                    return "Duplicate data found";
                }else {
                    mycontact.add(contact);
                    return "Data Added Successfully";
                }
            }
        }else {
            mycontact.add(contact);
            return "Data Added Successfully";
        }
        return "Something went wrong";
    }

    public static List<Contact> searchbyname(String name){
        for(int i = 0 ;i<mycontact.size();i++){
            if(mycontact.get(i).getName().contains(name)){
                searhcbynamelist.add(mycontact.get(i));
            }
        }
        return searhcbynamelist;
    }

    public static List<Contact> searchbyorganisation(String organationname){
        for(int i = 0 ;i<mycontact.size();i++){
            if(mycontact.get(i).getOrganization().contains(organationname)){
                searhcbyorganisation.add(mycontact.get(i));
            }
        }
        return searhcbyorganisation;
    }

    public static String updatecontact(String updatename,Contact contact){

        for(int i = 0 ;i<mycontact.size();i++){
            if(mycontact.get(i).name.equals(updatename)){
                mycontact.remove(i);
                mycontact.add(i,contact);
                return "Update successfully";
            }
        }
        return "Data Not found";
    }

    public static String deletecontact(String name){
        System.out.println("get from user "+name);
        for(int i = 0 ;i<mycontact.size();i++){
            if(mycontact.get(i).name.equals(name)){
                mycontact.remove(i);
                return "Delete successfully";
            }
        }
        return "Data Not found";
    }

}
