public class TeamMember extends User {


    void myRequriements(Requirement[] requirement, String userName){
        int i=0;
        int length=0;
        boolean found =false;
        try {
            length=requirement.length;
        for ( i=0;i<requirement.length;i++){
                try{
            if(requirement[i].getAssignedTo().getUserName().equals(userName)&& requirement[i].getAssignedTo().getUserName() != null ){
                found=true;

            }
              }catch (Exception e){ }

        }
        }catch (Exception e){ System.out.println("No records found");}
        if(found==true){
            System.out.format("%-15s %s\n","Id","Description") ;
            for(int j=0;j<length;j++){
                try{
                    if(requirement[j].getAssignedTo().getUserName().equals(userName)&& requirement[j].getAssignedTo().getUserName() != null ){
//                        System.out.println(requirement[j].getId()+" "+requirement[j].getDescription());
                        System.out.format("%-15s %s\n",requirement[j].getId(),requirement[j].getDescription()) ;
                    }
                }catch (Exception e){ }

              }
            }
         }
    }
