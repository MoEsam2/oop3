package com.oop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Data>list=new ArrayList<>();
        Scanner in=new Scanner(System.in);
int c=0;
        while(true)
        {
            displayMenu();
            int n=in.nextInt();
            switch (n)
            {
                case 1:
                   int id= in.nextInt();
                    String name=in.nextLine();
                   if( id!=-1)
                   {
                       for(Data data: list)
                       {
                           if (id == data.getId())
                               data.setName(name);
                           else
                               list.add(new Data(name,id));
                       }

                       System.out.println(id+" "+name);
                   }
                   else
                   {
                       id=c++;

                       list.add(new Data(name,id));
                       System.out.println(id+" "+name);
                   }

                   break;
                case 2 :
                    System.out.println("Enter the id : ");
                    int id1=in.nextInt();
                    for(Data data: list)
                    {
                        if (id1 == data.getId())
                            System.out.println(data.getName());
                        else
                            System.out.println("id does not exist");
                    }
                    break;
            }

        }

    }
    private static void displayMenu()
    {
        System.out.println();
        System.out.println("1.Add name to the list");
        System.out.println("2.Get name by id");
        System.out.println();
        System.out.println("Your choice : ");
    }

}
