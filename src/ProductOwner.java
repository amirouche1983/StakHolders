public class ProductOwner extends User {

    Boolean allocateBudget(String budgetDetail, Requirement[] requirement){
        boolean flag=false;
        String[] budgetDetails = budgetDetail.split(",");
        for(Requirement req :requirement){
            if(budgetDetails[0].equals(req.getId())){
                req.setBudget(Float.parseFloat(budgetDetails[1]));
                System.out.println("Budget assigned successfully");
                flag= true;}
            else {
                System.out.println("No record found");
                flag=false;
            }
        }
        return flag;
    }
    Boolean allocatePlanTime(String planTimeDetail,Requirement[]requirement){
        boolean flag=false;
        String[] planTimeDetails = planTimeDetail.split(",");
        for(Requirement req :requirement){
            if(planTimeDetails[0].equals(req.getId())){
                req.setPlanTime(Integer.parseInt(planTimeDetails[1]));
                System.out.println("Time assigned successfully");
                flag= true;}
            else {
                System.out.println("No record found");
                flag=false;
            }
        }
        return flag;
    }
}
