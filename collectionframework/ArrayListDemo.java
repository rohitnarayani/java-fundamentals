package collectionframework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentNotFoundException extends Exception {
    StudentNotFoundException(String msg) { super(msg); }
}

class Student {
    private String name;
    private int rollno;
    private int marks;

    Student(String name, int rollno, int marks) {
        this.name   = name;
        this.rollno = rollno;
        this.marks  = marks;
    }

    public String getName()          { return name;   }
    public int getRollno()           { return rollno; }
    public int getMarks()            { return marks;  }
    public void setName(String name) { this.name = name; }
    public void setRollno(int r)     { this.rollno = r;  }
    public void setMarks(int m)      { this.marks = m;   }

    @Override
    public String toString() {
        return String.format("Name: %-5s RollNo: %-4d Marks: %d", name, rollno, marks);
    }
}

public class ArrayListDemo {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        students.add(new Student("ABC", 12, 30));
        students.add(new Student("XYZ", 13, 49));
        students.add(new Student("PQR", 14, 33));
        students.add(new Student("EFG", 15, 84));
        students.add(new Student("JKL", 16, 89));

        // 1. Print all students
        System.out.println("All Students:");
        for(Student s : students) System.out.println(s);

        // 2. Highest marks
        System.out.println("\nHighest Marks: " + getMaxMarksStudent());

        // 3. Lowest marks
        System.out.println("Lowest Marks:  " + getMinMarksStudent());

        // 4. Students above 75
        System.out.println("\nStudents with marks > 75:");
        for(Student s : studentAboveSeventyFiveMarks()){
            System.out.println(s);
        }

        // 5. Sort ascending — Method reference (your approach) ✅
        Collections.sort(students, Comparator.comparing(Student::getMarks));
        System.out.println("\nSorted by Marks (Ascending):");
        for(Student s : students) System.out.println(s);

        // Bonus: Sort descending
        Collections.sort(students, Comparator.comparing(Student::getMarks).reversed());
        System.out.println("\nSorted by Marks (Descending):");
        for(Student s : students) System.out.println(s);
    }

    public static Student getMinMarksStudent() {
        if(students.isEmpty()) throw new RuntimeException("No students!");
        Student min = students.get(0);
        for(Student s : students)
            if(s.getMarks() < min.getMarks()) min = s;
        return min;
    }

    public static Student getMaxMarksStudent() {
        if(students.isEmpty()) throw new RuntimeException("No students!");
        Student max = students.get(0);
        for(Student s : students)
            if(s.getMarks() > max.getMarks()) max = s;
        return max;
    }

    // ✅ returns list instead of printing inside
    public static ArrayList<Student> studentAboveSeventyFiveMarks() {
        ArrayList<Student> result = new ArrayList<>();
        for(Student s : students)
            if(s.getMarks() > 75) result.add(s);
        return result;
    }

    public static Student getStudentByName(String name) throws Exception {
        if(name == null) throw new IllegalArgumentException("Name cannot be null");
        for(Student s : students)
            if(s.getName().equals(name)) return s;
        throw new StudentNotFoundException("Student '" + name + "' not found");
    }

    public static Student getStudentByRollno(int rollno) throws Exception {
        for(Student s : students)
            if(s.getRollno() == rollno) return s;
        throw new StudentNotFoundException("Rollno " + rollno + " not found");
    }

    public static void updateStudent(int rollno, String newName) throws Exception {
        Student s = getStudentByRollno(rollno);
        s.setName(newName);
    }
}