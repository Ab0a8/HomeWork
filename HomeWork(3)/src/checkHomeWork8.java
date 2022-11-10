public class checkHomeWork8 {
    private float all_salary;
    private String name;
    private float salary;
    private float hours;
    void setName(String Name) {
        name = Name;
    }
    void setSalary(float Salary){
        salary=Salary;
    }
    void setHours(float A){
        hours=A;
    }
    float calculation(){
        if(hours<20)
            all_salary = salary * hours;
        else{
            all_salary=salary*20;
            hours-=20;
            all_salary+=((300/150)*salary)*hours;
        }
        return all_salary;
    }

}
