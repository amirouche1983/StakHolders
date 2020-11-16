public class TeamMember extends User {

    void myRequriements(Requirement[] requirement, String userName){
        Requirement requirement1=new Requirement();
        System.out.format("%-15s %s\n","Id","Description") ;
        for(Requirement rc:requirement){
            if(requirement1.getAssignedTo().getUserName().equals(userName)) {
                System.out.format("%-15s %s\n", rc.getId(), rc.getDescription());
            }
        }
    }
}