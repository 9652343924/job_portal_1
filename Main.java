import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        ArrayList<job> jobs=new ArrayList<>();
        ArrayList<ApplicantDetails> applications=new ArrayList<>();
        jobprovider jobProvider=new jobprovider();
        applicant applicant=new applicant();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("WELCOME TO JOB PORTAL");
            System.out.println("Enter an option");
            System.out.println("1==>Job Provider");
            System.out.println("2==>Job Seeker");
            System.out.println("3==> Exit");
            int choice=sc.nextInt();
            int option;
            switch(choice){
                case 1:
                    //System.out.println(" You are selected JOB PROVIDER");
                do{
                        System.out.println("Enter an option");
                        System.out.println("1==> Add Jobs");
                        System.out.println("2==> View Jobs");
                        System.out.println("3==> view Applications");
                        System.out.println("4==> Back");
                        option=sc.nextInt();
                        switch(option){
                            case 1:
                            jobProvider.addJob(jobs, sc);
                            break;
                            case 2:
                                jobProvider.viewJob(jobs);
                                break;
                            case 3:
                                jobProvider.ViewApplicants(applications);
                                break;
                                case 4:
                                    System.out.println("you are back to the main portal");
                                    break;
                        default:
                            System.out.println("Enter Valid Option");
                            break;
                    }
                }
                    while(option!=4);
                    break;
                    case 2:
                        do{
                            System.out.println("1==> View jobs");
                            System.out.println("2==> filter by year");
                            System.out.println("3==>Apply jobs");
                            System.out.println("4==> back");
                            option=sc.nextInt();
                            switch(option){
                                case 1:
                                    jobProvider.viewJob(jobs);
                                    break;
                                case 2:
                                   applicant.filterByYear(jobs,sc);
                                    break;
                                case 3:
                                   applicant.seekerApplications(applications,sc);
                                    break;
                                    case 4:
                                        break;
                                default:
                                    System.out.println("enter valid choice");
                                    break;
                            }
                        }
                            while(option!=4);
                        break;
                    
                    case 3:
                        System.out.println("Thank you");
                        return;
                    default:
                            System.out.println("enter valid option");
                            break;
                    }
                }

    }
}