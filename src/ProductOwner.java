public class ProductOwner extends User {

    Boolean allocateBudget(String budgetDetail, Requirement[] requirement){
        System.out.format("%-15s %-15s %-15s %s\n", "Id","Description","Budget","Time");
      return true;
    }
    Boolean allocatePlanTime(String planTimeDetail,Requirement[]requirement){
        System.out.format("%-15s %-15s %-15s %s\n", "Id","Description","Budget","Time");
        return true;
    }
}
