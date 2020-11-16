import java.io.BufferedReader;
import java.io.IOException;

public class Requirement {
    private Integer id;
    private String description;
    private User createdBy;
    private User assignedTo;
    private Integer planTime;
    private Float budget;
    private Boolean requiementStatus;

    public Requirement(Integer id, String description,Float budget ,Integer planTime ) {
        this.id = id;
        this.description = description;
        this.planTime = planTime;
        this.budget = budget;
    }


    public Requirement(Integer id, String description) {
        this.id = id;
        this.description = description;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Integer getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Integer planTime) {
        this.planTime = planTime;
    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

    public Boolean getRequiementStatus() {
        return requiementStatus;
    }

    public void setRequiementStatus(Boolean requiementStatus) {
        this.requiementStatus = requiementStatus;
    }

    Requirement(){

    }

    public Requirement(Integer id, String description, User createdBy, User assignedTo, Integer planTime, Float budget, Boolean requiementStatus) {
        this.id = id;
        this.description = description;
        this.createdBy = createdBy;
        this.assignedTo = assignedTo;
        this.planTime = planTime;
        this.budget = budget;
        this.requiementStatus = requiementStatus;
    }


    Boolean assignreqmts(BufferedReader br,Requirement[] requirement,User user[]) throws IOException {
        boolean flag=false;
        for(User use :user){
            for (Requirement req :requirement){
                if(br.readLine().equals(use.getName())&& (use.getName().equals(req.assignedTo.getName()))){
                    flag=true;
                }
            }
        }
        return flag;
    }

}