import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class Main {

    public static void main(String[] args) throws IOException {
        boolean UNandPW =false;
        boolean logOut=true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number of users");
            Integer number_of_user = Integer.parseInt(br.readLine());
            User [] user= new User[number_of_user];
        for (Integer i=0; i <number_of_user; i++) {
                int j=i;
                System.out.println("Enter user " + (j+1) + " detail: ");
                String user_detail = br.readLine();
                String[] user_details = user_detail.split(",");
                user[i]=new User((user_details[0]),(user_details[1]),(user_details[2]),(user_details[3]));
               }
            for (User obj : user){
                System.out.println(obj.getName()+" "+obj.getPassword()+" "+obj.getUserName()+" "+obj.getRole());
            }
     do{
         System.out.println("1. Login");
         System.out.println("2. Exit");
         System.out.println("Enter your choice :");
         Integer choice = Integer.parseInt(br.readLine());
         if (choice == 1) {
             System.out.println("Enter the user name :");
             String EnteredUN = br.readLine();
             System.out.println("Enter the password :");
             String EnteredPW = br.readLine();
             int i;

             for ( i=0;i<number_of_user;i++) {
                 if ((user[i].getUserName().equals(EnteredUN)) && (user[i].getPassword().equals(EnteredPW))) {
                     UNandPW=true;
                     Requirement[] requirement = null;
                     user[i].display(br, requirement, user);
                 }
              }
             if(UNandPW && i<number_of_user){

             logOut=false;
             }
           }
           }while (logOut);

//          if(choice==2){return;}
           }
         }





