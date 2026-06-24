import java.util.ArrayList;
import java.util.Scanner;

public class applicant {
    public void seekerApplications(ArrayList<ApplicantDetails> applications,Scanner sc){
       System.out.println("enter name");
       String name=sc.nextLine();
       sc.nextLine();
        System.out.println("enter phoneno");
       long phoneno=sc.nextLong();
       sc.nextLine();
        System.out.println("enter email");
       String email=sc.nextLine();
        System.out.println("enter passedout");
       int passedout=sc.nextInt();
       sc.nextLine();
        System.out.println("enter cgpa");
       double cgpa=sc.nextDouble();
        System.out.println("enter job id");
       int jobid=sc.nextInt();
       applications.add(new ApplicantDetails(name,phoneno,email,passedout,cgpa,jobid));
       System.out.println("job applied successfully");
       System.out.println("=======================");
    }

    public void filterByYear1(ArrayList<job> jobs, Scanner sc){
        System.out.println("enter year to filter");
        int year=sc.nextInt();
        boolean found=false;
        for(job j : jobs){
            if(year==j.getyear()){
                j.viewJob();
                found=true;
            }
        }
        if(found==false){
            System.out.println("no jobs found");
        }
    }

    public void filterByYear(ArrayList<job> jobs, Scanner sc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}