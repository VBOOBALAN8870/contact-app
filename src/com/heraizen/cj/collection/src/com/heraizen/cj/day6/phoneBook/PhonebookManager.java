package com.heraizen.cj.day6.phoneBook;

import java.util.Scanner;

public class PhonebookManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=1;
		PhonebookClient pbc = new PhoneBook();
		while(m==1)
		{
			
			System.out.println(" 1)Add new Phone number 2)search Phone Number 3)Quit");
			int i = sc.nextInt();
			switch(i)
			{
			case 1:{
				System.out.println("Enter the Phone NUmber");
				String phone = sc.next();
				System.out.println("ENter the Name");
				String name = sc.next();
				pbc.addDetails(phone, name);
				break;
			}
			case 2:{
				System.out.println("Enter Phone for Search");
				String search = sc.next();
				String find = pbc.getName(search);
			    System.out.println("Matched phone number name is "+find);
			    break;
			}
			case 3:{
				m = pbc.quit();
				System.out.println("Our Program has Teriminate");
			}
			}
			
		}

	}

}
