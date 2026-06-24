public class job {
 private int id;
   private String role;
  private  int salary;
  private  String skills;
    private String company;
    private int year;
    public  job(int id,String role,int salary,String skills,String company,int year){
        this.id=id;
        this.role=role;
        this.salary=salary;
        this.skills=skills;
        this.company=company;
        this.year=year;
    }
    public void viewJob(){
        System.out.println("job id is " +this.id );
        System.out.println("job role is " +this.role);
        System.out.println("job salary is " +this.salary );
        System.out.println("skills required " +this.skills);
        System.out.println("company is " +this.company );
        System.out.println("enter year"+this.year);
        System.out.println("==============================");
    }
    public int getyear(){
        return year;
    }

    }