public class ProductOwner extends User {

    Boolean allocateBudget(String budgetDetail, Requirement[] requirement){

        boolean flag=false;
        String[] budgetDetails = budgetDetail.split(",");
        for(Requirement req :requirement){
            if(Integer.parseInt(budgetDetails[0])==req.getId()){

                req.setBudget(Float.parseFloat(budgetDetails[1]));
                flag= true;
            }
        }
        if(flag==true){System.out.println("Budget assigned successfully");
        }else  System.out.println("No record found");
        return flag;
    }
    Boolean allocatePlanTime(String planTimeDetail,Requirement[]requirement){
        boolean flag=false;
        String[] planTimeDetails = planTimeDetail.split(",");
        for(Requirement req :requirement){
            if(Integer.parseInt(planTimeDetails[0])==req.getId()){
                req.setPlanTime(Integer.parseInt(planTimeDetails[1]));
                flag= true;}
        }
        if(flag==true){System.out.println("Time assigned successfully");
        }else  System.out.println("No record found");
        return flag;
    }
}
