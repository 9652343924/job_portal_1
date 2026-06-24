public class ApplicantDetails {
    private String name;
    private long phoneno;
    private String email;
    private int passedout;
    private double cgpa;
    private int jobid;
    public  ApplicantDetails(String name,long phoneno,String email,int passedout,double cgpa,int jobid){
        this.name=name;
        this.phoneno=phoneno;
        this.email=email;
        this.passedout=passedout;
        this.cgpa=cgpa;
        this.jobid=jobid;
    }
    public void viewApplicants(){
        System.out.println("name is "+this.name);
        System.out.println("phone number is " +this.phoneno );
        System.out.println("email is " +this.email );
        System.out.println("passedout in the year " +this.passedout );
        System.out.println("cgpa is " +this.cgpa );
        System.out.println("job id is " +this.jobid );
        System.out.println("========================");
    }
}