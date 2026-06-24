import java.util.*;
public class jobprovider {
    public void addJob(ArrayList<job> jobs,Scanner sc){
        System.out.println("enter job id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter job role");
        String role=sc.nextLine();
        System.out.println("enter salary in LPA");
        int salary=sc.nextInt();
        sc.nextLine();
        System.out.println("enter job skills");
        String skills=sc.nextLine();
        System.out.println("enter the company");
        String company=sc.nextLine();
        System.out.println("enter year: ");
        int year=sc.nextInt();
        jobs.add(new job(id,role,salary,skills,company,year));
        System.out.println("job added successfully");
    }
    public void viewJob(ArrayList<job> jobs){
        if(jobs.isEmpty()){
            System.out.println("no jobs");
        }
        for(job j:jobs){
         j.viewJob();
        }
    }
    public void ViewApplicants(ArrayList<ApplicantDetails>Applications){
        for(ApplicantDetails ap: Applications ){
            ap.viewApplicants();
        }
    }
}