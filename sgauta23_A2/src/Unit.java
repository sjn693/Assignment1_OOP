import java.io.*;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Unit {
    LinkedList<Student> students = new LinkedList<>();
    HashMap<String, Staff> staffs = new HashMap<>();

    private String unitName;
    private String unitCode;
    // Part 7: lock and unlock methods
    private static Lock lock = new ReentrantLock();

    public Unit(String unitName, String unitCode) {
        this.unitName = unitName;
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitCode() {
        return unitCode;
    }
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    //Part 1: All applicable methods for student.
    public void addStudent(Student name) {
        lock.lock();
        try {
            students.add(name);
        } finally {
            lock.unlock();
        }
    }

    public void removeStudent(Student name){
        lock.lock();
        try{
            students.remove(name);
        }finally {
            lock.unlock();
        }
    }

    public int numberOfStudent(){
        return students.size();
    }

    public void printStudent(){
        lock.lock();
        try{
            Iterator <Student>it = students.iterator();
            System.out.println("STUDENT DETAILS:");
            while(it.hasNext()){
                Student details = it.next();
                System.out.println(details.getName());
                System.out.println(details.getEmail());
                System.out.println(details.getAge());
                System.out.println(details.getStudentNumber());
                System.out.println(details.getDegree());
            }
        }finally {
            lock.unlock();
        }
    }

    public LinkedList allStudents(){ return students; }

    //Part 2: All applicable method for comparison.
    public void sortStudents(){
        Collections.sort(students, new StudentSorter());
    }

    //Part 3: Applicable methods for staff.
    public void addStaff(String role, Staff name){
        staffs.put(role, name);
    }

    public void removeStaff(String role, Staff name){ staffs.remove(role, name); }

    public void printStaff() {
        System.out.println("STAFF DETAILS:");
        Iterator hmIterator = staffs.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            System.out.println(mapElement.getKey());
            System.out.println(mapElement.getValue().toString());
        }
    }

    //Part 5: Applicable method for writing to a file.
    public void exportStudents(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Student_Details.txt"));
            for (int i = 0; i< students.size(); i++){
                writer.write(String.valueOf(students.get(i).getName() + "," + students.get(i).getEmail()+ "," + students.get(i).getAge()+ "," + students.get(i).getStudentNumber()+ "," + students.get(i).getDegree()+ "," + students.get(i).getGPA() + " \n" ));
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //Part 6: Applicable method for reading from a file.
    public void importStudents(){
        lock.lock();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Student_Details.txt"));
            String data = "";
            String []  datas = {};
            while((data = reader.readLine()) != null){
                datas = data.split(",");
                students.add(new Student(datas[0], datas[1], Integer.parseInt(datas[2]), Integer.parseInt(datas[3]), datas[4]));
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
