import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        Requirement objRQ = new Requirement();

         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        InputStreamReader r = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(r);
        System.out.println("Enter number of user");
        int number_of_user = bf.read();
        Object[][] userArray = new Object[3][4];

        // String userName = bf.readLine();
        int i;

//        for( i =0; i<3;i++) {
//
//            System.out.println("Enter user detail ");
//
//            for (int j = 0; j <userArray[i].length;j++) {
//                user.setName(bf.readLine());
//                userArray[i][j] = user.getName();}
//
//            for (int j = 0; j <userArray[i].length;j++) {
//                user.setUserName(bf.readLine());
//                userArray[i][j] = user.getUserName();}
//
//            for (int j = 0; j <userArray[i].length;j++) {
//                user.setPassword(bf.readLine());
//                userArray[i][j] = user.getPassword();}
//
//            for (int j = 0; j <userArray[i].length;j++) {
//                user.setRole(bf.readLine());
//                userArray[i][j] = user.getRole();
//            //user.setRole(bf.readLine());
//
//
//
//
//
//                }
//        }
//
//        //bf.readLine();
//        System.out.println(Arrays.deepToString(userArray));





        String[] name = new String[3];
        String[] userNma = new String[3];
        String[] passWor = new String[3];
        String[] role = new String[3];


        for (i = 0; i < 3; i++) {

            System.out.println("Enter user " + (1 + i) + " detail ");
            user.setName(bf.readLine());
            name[i] = user.getName();
            user.setUserName(bf.readLine());
            userNma[i] = user.getUserName();
            user.setPassword(bf.readLine());
            passWor[i] = user.getPassword();
            user.setRole(bf.readLine());
            role[i] = user.getRole();
            user.setRole(bf.readLine());
            System.out.println( name[i] + "," + userNma[i] + "," + passWor[i] + "," + role[i]);

        }
//        for( i=0;i<3;i++) {
//            System.out.println(number_of_user+","+ name[i] + "," + userNma[i] + "," + passWor[i] + "," + role[i]);
//        }
            //System.out.println(Arrays.deepToString(userArray));
            System.out.println("1. Login\n" + "2. Exit");
            System.out.println("Enter your choice: ");
            int choice = bf.read();

            if (choice != 2) {
                System.out.println("Enter the user name :");
                user.setUserName(bf.readLine());
                String username = user.getUserName();
                System.out.println("Enter the password :");
                user.setPassword(bf.readLine());
                String password = user.getPassword();
                while (!username.equalsIgnoreCase(userNma[i]) && !password.equalsIgnoreCase(passWor[i])) {
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

