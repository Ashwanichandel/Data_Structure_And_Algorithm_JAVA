package org.example.OOPS;

class Student
{
    private int studentNumber;
    private String studentName;
    private String studentAddress;

    public Student(int studentNumber, String studentName, String studentAddress)          {

        super();
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentAddress="
                + studentAddress + "]";
    }



}
class Science extends Student
{
    protected int physics;
    protected int chemistry;

    public Science(int studentNumber, String studentName, String studentAddress, int physics, int chemistry) {
        super(studentNumber, studentName, studentAddress);
        this.physics = physics;
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return super.toString()+"Science [physics=" + physics + ", chemistry=" + chemistry + "]";
    }




}
class PCM extends Science
{
    protected int math;

    public PCM(int studentNumber, String studentName, String studentAddress, int physics, int chemistry, int math)
    {
        super(studentNumber, studentName, studentAddress, physics, chemistry);
        this.math = math;
    }

    @Override
    public String toString() {
        return super.toString()+"PCM [math=" + math + "]";
    }


    public void calculateTotalMarks()
    {
        double marks = this.physics + this.chemistry + this.math;
        System.out.println("Total Marks is :"+marks);
    }

}

public class MultilevelInheritance
{
    public static void main(String[] args)
    {
        PCM p = new PCM(1, "Raj", "Ameerpet", 78, 70, 90);
        System.out.println(p);
        p.calculateTotalMarks();
        Science science= new Science(2,"ffff0000","eeeeee",34,43);
        System.out.println(science);
    }

}
