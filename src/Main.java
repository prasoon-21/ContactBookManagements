import java.util.Scanner;

public class Main {
    public static void main(String[] xyz){
        System.out.println("-------------------------------Welcome!! To Phone book Managment system----------------------------");
        System.out.println("------------------------------------------Hi Master!!----------------------------------------------");
        System.out.println("Operation to perform on this Console based phoneBook system ");
        System.out.println("1) Add Contacts");
        System.out.println("2) Fetch Contacts");
        System.out.println("3) Wanna search Name in phoneBook (Provide number) ");
        System.out.println("4) wanna search Number in phoneBook (Provide name) ");
        // ** creating a static contactsBook **


        String [][] contacts={      {"Prasoon","7050514058"},
                {"Rajveer","0000000000"},
                {"Rajvardhan","1111111111"},
                {"Tushar","2222222222"},
                {"Sanu","3333333333"},
                {"Anuraj","4444444444"},
                {"Lokesh","55555555555"},
                {"vikas","66666666666"},
                {"Kausushal","77777777777"},
                {"Aditya","88888888888"}     };

        //size of string
        int size=contacts.length;



        //taking user input
        Scanner xy= new Scanner(System.in);
        System.out.print("Enter the option{(1) (2) (3) (4)} for their respective operation : ");
        int option = xy.nextInt();

        switch(option){
            case 1:
                System.out.println("You want to Add new Contact in phonebook : ");
                System.out.println("Type Yes/No to proceed forward : ");
                xy.nextLine();
                String w4t=" ";
                w4t=xy.nextLine();
                if(w4t.equalsIgnoreCase("Yes")){
                    addContacts(contacts,size);
                }else{
                    System.out.println("Thank yo u, but next time choose option carefully ");
                }
                break;
            case 2:
                System.out.println("You want to Display all contacts ");
                System.out.println("Type Yes/No to proceed forward : ");
                xy.nextLine();
                String w4it=" ";
                w4it=xy.nextLine();
                if(w4it.equalsIgnoreCase("Yes")){
                    fetchContacts(contacts,size);
                }else{
                    System.out.println("Thank you, but next time choose option carefully ");
                }
                break;
            case 3:
                System.out.println("You only want to display Name of provide phNo :");
                System.out.println("Type Yes/No to proceed forward : ");
                xy.nextLine();
                String wait=" ";
                wait=xy.nextLine();
                if(wait.equalsIgnoreCase("Yes")) {
                    displayName(contacts,size);
                }else {
                    System.out.println("Thank you, but next time choose option carefully ");
                }
                break;
            case 4:
                System.out.println("You only want to display Number of provide name");
                System.out.println("Type Yes/No to proceed forward : ");
                String w8=" ";
                xy.nextLine();
                w8=xy.nextLine();
                if(w8.equalsIgnoreCase("yes")) {
                    displayNumber(contacts,size);
                }else {
                    System.out.println("Thank you, but next time choose option carefully ");
                }
                break;
        }


    }

    //function for adding new contacts
    public static void addContacts(String[][] contacts, int size){
        Scanner xy= new Scanner(System.in);
        System.out.println("Enter the no of conctacts you wanted to add : ");
        int n= xy.nextInt();
        xy.nextLine();
        String [][] newContacts=new String[n][2];

        for(int i=0; i<n;i++){
            System.out.println("Enter details of contacts : "+(i+1));
            System.out.print("Name : ");
            contacts[i][0]=xy.nextLine().trim();
            System.out.println();
            System.out.print("Phone number : ");
            contacts[i][1]=xy.nextLine().trim();
        }
        System.out.println("New contacts saved are : ");
        for(int i=0;i<n;i++){
            System.out.println(contacts[i][0]+"-"+contacts[i][1]);
        }
        System.out.println();
        System.out.println();
        System.out.println("Wanna see all contact details ");
        String z=xy.nextLine();
        if(z.equalsIgnoreCase("Yes")) {
            fetchContacts(contacts, size);
        }
    }

    // function for displaying all contacts saved
    public static void fetchContacts( String[][]contacts,int size){
        Scanner xy= new Scanner(System.in);

        for (int i=0;i<size;i++){
            for (int j=0; j<contacts[i].length;j++){

                System.out.print(contacts[i][j]+"  ");

            }
            System.out.println();
        }
        // adding new contacts in phonebook!!
        System.out.println("Do you want to add new contacts: ");
        String ad="";
        ad=xy.nextLine();
        if (ad.equalsIgnoreCase("Yes")){
            addContacts(contacts,size);
        }else{
            System.out.println("   ");
        }

    }

    // function for showing only name
    public static void displayName(String[][]contacts,int size){

        Scanner xy= new Scanner(System.in);
        System.out.print("Enter the number : ");
        String number=xy.nextLine();
        boolean x=false;
        for (int i=0; i<size ;i++){
            if (contacts[i][1].equalsIgnoreCase(number)){
                System.out.print("The number "+number+" is of Mr/Mrs  : ");
                System.out.println(contacts[i][0] );
                x=true;
            }
        }
        if(!x) {
            System.out.println("No Contact for this Number " + number);

            // adding new contacts in phonebook!!
            System.out.println("Do you want to add new contacts for this particular number : " + number);
            String ad = "";
            ad = xy.nextLine();
            if (ad.equalsIgnoreCase("Yes")) {
                addContacts(contacts,size);
            } else {
                System.out.println("   ");
            }
        }
    }

    //function for showing only number
    public static void displayNumber(String [][] contacts,int size){
        Scanner xy= new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name=xy.nextLine();
        boolean y= false;
        for (int i=0; i<size;i++){
            if(contacts[i][0].equalsIgnoreCase(name)){
                System.out.print("Phone  number of Mr/Mrs "+name +" is : ");
                System.out.println(contacts[i][1]);
                y=true;
                break;
            }
        }
        if(!y) {
            System.out.println("No Contact for this name : " + name);

            // adding new contacts in phonebook!!
            System.out.println("Do you want to add new contacts for this particular name : " + name);
            String ad = "";
            ad = xy.nextLine();
            if (ad.equalsIgnoreCase("Yes")) {
                addContacts(contacts,size);
            } else {
                System.out.println("   ");
            }
        }

    }
}

