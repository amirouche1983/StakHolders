import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScrumMaster extends User {
    public void createRequirements(String detail,Requirement[] requirement){

        String[] Req_dets = detail.split(",");
        Integer i=Integer.parseInt(Req_dets[2]);
        requirement[i]= new Requirement(Integer.parseInt(Req_dets[0]),Req_dets[1]);
    }

    public int countTotalRequirements(Requirement[] requirement){
        if(requirement==null || requirement.length==0)return 0;
        else return requirement.length;
    }

    Boolean assignreqmts(BufferedReader br, Requirement[] requirement, User user[]) throws IOException {
        boolean flag=false;
        String Assignreqmt= br.readLine();
        String[] Assignreqmts = Assignreqmt.split(",");
        for(Requirement req: requirement) {
            for (User us : user) {
                if ((Assignreqmts[1].equals(us.getUserName())) && (Integer.parseInt(Assignreqmts[0])==req.getId())) {
                    req.setAssignedTo(us);
                    flag = true;
                }
            }
        }
        if(flag){System.out.println("Assigned successfully");}
        else System.out.println("Assign failed");
        return flag;
    }
}