
import org.omg.PortableInterceptor.ServerRequestInterceptor;

import java.io.BufferedReader;
import java.io.IOException;

public class User {
    private String userName;
    private String password;
    private String name;
    private String role;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User() {

    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String name, String userName, String password, String role) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }


    void display(BufferedReader br, Requirement[] requirement, User[] user) throws IOException {
        final String SMrole = "SM";
        final String TMrole = "TM";
        final String POrole = "PO";
        boolean Login = true;

        switch (getRole()) {

            case SMrole:
                while (Login) {
                    ScrumMaster scrumMaster = new ScrumMaster();
                    System.out.println("1. Create BackLog");
                    System.out.println("2. Count Requirements");
                    System.out.println("3. Assign Requirements");
                    System.out.println("4. Logout");
                    System.out.println("Enter your choice :");
                    Integer SMchoce = Integer.parseInt(br.readLine());
                    if (SMchoce == 1) {
                        System.out.println("Enter the number of requirement to create :");
                        Integer nreqIT = Integer.parseInt(br.readLine());
                        requirement = new Requirement[nreqIT];
                        for (Integer i = 0; i < nreqIT; i++) {
                            Integer j = i;
                            System.out.println("Enter the id and description " + (j + 1) + ": ");
                            String redetail = br.readLine();
                            String detail = redetail.concat(",").concat(i.toString());
                            scrumMaster.createRequirements(detail, requirement);
                        }
                        for (Requirement RC : requirement) {
                            System.out.println(RC.getId() + " , " + RC.getDescription() + " , " + RC.getAssignedTo());
                        }
                        System.out.println("Requirement created successfully");
                    } else if (SMchoce == 2) {
                        System.out.println("The total number of requirement is : " + scrumMaster.countTotalRequirements(requirement));
                    } else if (SMchoce == 3) {
                        for (Requirement req : requirement) {
                            System.out.println(req.getId() + " " + req.getDescription());
                        }
                        System.out.println("Enter the requirement id and user name :");
                        scrumMaster.assignreqmts(br, requirement, user);
                        for (Requirement RC : requirement) {
                            System.out.println(RC.getId() + " , " + RC.getDescription() + " , " + RC.getAssignedTo());
                        }
                    } else if (SMchoce == 4) {
                        Login = false;
                    }
                }
                break;


            case TMrole:
                while (Login) {
                    TeamMember teamMember = new TeamMember();
                    System.out.println("1. Display requirement list");
                    System.out.println("2. Logout");
                    System.out.println("Enter your choice :");
                    Integer TMchoce = Integer.parseInt(br.readLine());
                    if (TMchoce == 1) {
                        String usName = getUserName();
                        teamMember.myRequriements(requirement, usName);

                    } else if (TMchoce == 2) {
                        Login = false;
                    }
                }
                break;

            case POrole:

                ProductOwner productOwner = new ProductOwner();
                System.out.println("1. List requirements");
                System.out.println("2. Allocate budget");
                System.out.println("3. Allocate plan time");
                System.out.println("4. Logout");
                Integer POchose = Integer.parseInt(br.readLine());
                if (POchose == 1) {
                    System.out.format("%-15s %-15s %-15s %s\n", "Id", "Description", "Budget", "Time");
                    for (Requirement rc : requirement) {
                        System.out.format("%-15s %-15s %-15s %s\n", rc.getId(), rc.getDescription(), rc.getBudget(), rc.getPlanTime());
                    }
                } else if (POchose == 2) {
                    System.out.println("Enter the id and budget :");
                    String budgetDetail = br.readLine();
                    productOwner.allocateBudget(budgetDetail, requirement);
                } else if (POchose == 3) {
                    System.out.println("Enter the id and plan time :");
                    String planTimeDetail = br.readLine();
                    productOwner.allocatePlanTime(planTimeDetail, requirement);
                } else if (POchose == 4) {
                    Login = false;
                }
                break;


        }

    }
}
