package collectionframework;

import java.util.ArrayList;
import java.util.List;

class StudentNotFoundException extends Exception{
    StudentNotFoundException(String msg){
        super(msg);
    }
}

class Student{
    private String name;
    private int rollno;

    Student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRollno(int rollno){
        this.rollno = rollno;
    }

    public int getRollno(){
        return rollno;
    }
    public String toString(){
        return String.format("Name: %-10s RollNo: %d", name, rollno);
    }
    
}

public class ArrayListDemo {
    public static ArrayList<Student> students = new ArrayList<>();
    public static void main(String []args) throws Exception{
        // ArrayList<Integer> intList = new ArrayList<>();
        // intList.add(10);
        // intList.add(20);
        // intList.add(30);
        // intList.add(40);
        // intList.add(50);
        // intList.add(60);
        students.add(new Student("ABC",12));
        students.add(new Student("XYZ",13));
        students.add(new Student("PQR",14));
        students.add(new Student("EFG",15));
        students.add(new Student("JKL",16));
        
        System.out.println("All students: ");
        
        for(Student s : students){
            System.out.println(s);
        }
        students.remove(getStudentByName("ABC"));
        updateStudent(14,"KING");
        System.out.println("After removing ABC & updating name PQR");
        
        for(Student s : students){
            System.out.println(s);
        }
        

        System.out.println("Contains XYZ?: "+students.contains(getStudentByName("XYZ")));

        System.out.println("Total Students: "+students.size());

        System.out.println();
    }

    public static Student getStudentByName(String name) throws Exception{
        if(name == null) throw new IllegalArgumentException("Name cannot be null");
        for(Student s : students){
            if(s.getName().equals(name)){
                return s;
            }
        }
        throw new StudentNotFoundException("No student found");
    }

    public static Student getStudentByRollno(int rollno) throws Exception{
        for(Student s : students){
            if(s.getRollno() == rollno){
                return s;
            }
        }
        throw new StudentNotFoundException("Student not found");
    }

    public static void updateStudent(Integer rollno,String newName)throws Exception{
        Student s = getStudentByRollno(rollno);
        s.setName(newName);
    }
}