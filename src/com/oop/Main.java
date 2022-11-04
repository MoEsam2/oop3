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
                    int k=0;
                   if( id!=-1)
                   {
                       for(Data data: list)
                       {
                           if (id == data.getId()) {
                               data.setName(name);
                               k++;
                           }
                       }
                       if (k==0) {
                           list.add(new Data(name, id));
                           k=0;
                       }
                   }
                   else
                   {
                       id=c++;
                       for(Data data: list)
                       {
                           if (id == data.getId()) {
                               data.setName(name);
                               k++;
                           }
                       }
                       if (k==0) {
                           list.add(new Data(name, id));
                           k=0;
                       }

                   }

                   break;
                case 2 :
                    System.out.println("Enter the id : ");
                    int id1=in.nextInt();
                    int d=0;
                    for(Data data: list)
                    {
                        if (id1 == data.getId())
                            System.out.println(data.getName());
                        d++;
                    }
                    if(d==0)
                        System.out.println("id does not exist");
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
