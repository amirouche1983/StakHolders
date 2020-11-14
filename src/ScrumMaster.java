import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScrumMaster extends User {
    Requirement objReq = new Requirement();
    //public void createRequirements(String detail, Requirement[] requirement) throws IOException {
public void createRequirements() throws IOException {
//In this method, Create the requirement and store in to requirement object array.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Object[] requirements = new Object[4];
        // requirement = {Id,description,createdBy,assignedTo,planTime,budget,requiementStatus }requirement.length
        for (Object req : requirements) {
            objReq.setId(br.read());
            System.out.println(br.read());
            objReq.setDescription(br.readLine());
            System.out.println(br.readLine());
            String userName = br.readLine();
            setUserName(userName);
            objReq.setCreatedBy(new User(getUserName()));
            System.out.println(objReq.getCreatedBy().getUserName());
            String AssignedTo = br.readLine();
//            setUserName(AssignedTo);
//            objReq.setAssignedTo(new User(getUserName()));
            setName(AssignedTo);
            objReq.setAssignedTo(new User(getName()));
            System.out.println(objReq.getAssignedTo().getUserName());
            objReq.setPlanTime(br.read());
            objReq.setBudget(Float.parseFloat(br.readLine()));
            objReq.setRequiementStatus(Boolean.parseBoolean(br.readLine()));

        }
    }

    public static void main(String[] args) throws IOException {
        ScrumMaster obre = new ScrumMaster();
         obre.createRequirements();
    }

    public int countTotalRequirements(Requirement[] requirement) {
        return 5;
    }

    Boolean assignreqmts(BufferedReader br, Requirement[] requirement, User user[]) {
        return true;
    }
}
