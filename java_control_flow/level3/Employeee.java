package java_control_flow.level3;

import java.util.Objects;

public class Employeee {

    int salary;
    int e_age;
    String name;
    String role;
    Employeee(int salary , int e_age, String name, String role){
        this.salary=salary;
        this.e_age=e_age;
        this.name=name;
        this.role=role;


    }
    @Override
    public  String toString(){
        return this.name;
    }

 /*   @Override
    public boolean equals(Object obj){
        Employeee em=(Employeee) obj;
        return this.name.equals(em.name);
    }*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employeee employeee = (Employeee) o;
        return salary == employeee.salary && e_age == employeee.e_age && Objects.equals(name, employeee.name) && Objects.equals(role, employeee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, e_age, name, role);
    }

    public static void main(String args[]){
        Employeee emp1=new Employeee(1000,21,"rishav","sd");
        Employeee emp2=new Employeee(1000,21,"rishav","sd");

        System.out.print(emp1.toString());
        System.out.print(emp1.equals(emp2));

    }

}
