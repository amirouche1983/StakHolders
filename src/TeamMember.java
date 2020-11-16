public class TeamMember extends User {

    void myRequriements(Requirement[] requirement, String userName){
        System.out.format("%-15s %s\n","Id","Description") ;
        for(Requirement rc:requirement){
            if(rc.getAssignedTo().getUserName().equals(userName)){
                System.out.format("%-15s %s\n",rc.getId(),rc.getDescription()) ;
            }
        }

    }
}