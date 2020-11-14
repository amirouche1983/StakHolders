import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of user");
        int number_of_user = bf.read();
        Object [][] userArray = new Object[3][4];

       // String userName = bf.readLine();
        int i=0;

//        for( i =0; i<3;i++) {
//
//            System.out.println("Enter user detail ");
//            user.setName(bf.readLine());
//            user.setUserName(bf.readLine());
//            user.setPassword(bf.readLine());
//            user.setRole(bf.readLine());
//            user.setRole(bf.readLine());
//            for (int j = 0; j <userArray[i].length;j++) {
//                    userArray[i][j] = user.getName();}
//                for (int j = 0; j <userArray[i].length;j++) {
//                    userArray[i][j] = user.getUserName();}
//                    for (int j = 0; j <userArray[i].length;j++) {
//                    userArray[i][j] = user.getPassword();}
//                        for (int j = 0; j <userArray[i].length;j++) {
//                    userArray[i][j] = user.getRole();
//
//                }
//        }
//
//        bf.readLine();
//        System.out.println(Arrays.deepToString(userArray));
//
//
//
//

        String[]name = new String[3];
        String []userNma = new String[3];
        String [] passWor = new String[3];
        String[] role = new String[3];



        for( i =0; i<3;i++) {

            System.out.println("Enter user detail ");
            user.setName(bf.readLine());
            user.setUserName(bf.readLine());
            user.setPassword(bf.readLine());
            user.setRole(bf.readLine());
            //user.setRole(bf.readLine());

            name[i] = user.getName();

            userNma[i]= user.getUserName();

            passWor[i] = user.getPassword();

            role[i] = user.getRole();
            System.out.println(name[i] + "," + userNma[i] + "," + passWor[i] + "," + role[i]);

        }
//        for( i=0;i<3;i++) {
//            System.out.println(name[i] + "," + userNma[i] + "," + passWor[i] + "," + role[i]);
//        }
        //System.out.println(Arrays.deepToString(userArray));
        System.out.println("1. Login\n" + "\n" + "2. Exit");
        int choice = bf.read();
        choice = bf.read();
        if (choice==1){
            System.out.println("Enter the user name :");
            user.setUserName(bf.readLine());
          String username =  user.getUserName();
            System.out.println("Enter the password :");
            user.setPassword(bf.readLine());
           String password = user.getPassword();

           while (!username.equalsIgnoreCase(userNma[i])&& !password.equalsIgnoreCase(passWor[i])){
             i++;
           }
//            for (i =0 ; i <userNma.length;i++){
//                if (username.equalsIgnoreCase(userNma[i])){
//
//                }
//            }
        }

    }/*
    1. Create BackLog

        2. Count Requirements

        3. Assign Requirements

        4. Logout*/


   }

