public class TeamMember extends User {


    void myRequriements(Requirement[] requirement, String userName){

        System.out.format("%-15s %s\n","Id","Description") ;
        int i;
        for ( i=0;i<requirement.length;i++){
         try{
            if(requirement[i].getAssignedTo().getUserName().equals(userName)&& requirement[i].getAssignedTo().getUserName() != null ){
            System.out.println(requirement[i].getId()+" , "+requirement[i].getDescription());}

        }catch (Exception e){
        }
       }
      }
    }
