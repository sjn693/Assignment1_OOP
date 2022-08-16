import java.util.LinkedList;

public class AssessmentTwo {
    public static void main(String[] args){
        AssessmentTwo as2 = new AssessmentTwo();
        //as2.partOne();
        //as2.partTwo();
        //as2.partThree();
        //as2.partFour();
        //as2.partFive();
        //as2.partSix();
    }

    public void partOne (){
        Unit unit = new Unit("Programming 1", "PROG2002");

        Student timothy = new Student("Timothy", "tim123@gmail.com", 28, 23782923, "MIT");
        Student niya = new Student("Niya", "niya456@gmail.com", 23, 28492026, "BIT");
        Student amul = new Student("Amul", "amulg789@gmail.com", 25, 24687315, "BIT");
        Student ashley = new Student("Ashley", "ashley258@gmail.com", 27, 22142028, "MIT");
        Student mia = new Student("Mia", "miat693@gmail.com", 22, 23572684, "BIT");

        unit.addStudent(timothy);
        unit.addStudent(niya);
        unit.addStudent(amul);
        unit.addStudent(ashley);
        unit.addStudent(mia);

        unit.removeStudent(ashley);

        System.out.println("Number of students:" + unit.numberOfStudent());
        System.out.println("------------------------------");

        unit.printStudent();
        System.out.println("------------------------------");
    }

    public void partTwo(){
        Unit unit = new Unit("Web Development", "ISYS1003");

        Student dave = new Student("Dave Arnold", "davea123@gmail.com", 32, 24564328, "BIT");
        Student dave1 = new Student("Dave Arnold", "davea456@gmail.com", 34, 23614869, "MIT");
        Student dave2 = new Student("Dave Arnold", "davea789@gmail.com", 30, 21452398, "BIT");
        Student corey = new Student("Corey Bastio", "corey258@gmail.com", 36, 21532687, "MIT");
        Student alisha = new Student("Alisha McCarthy", "alisha693@gmail.com", 33, 25674236, "BIT");

        unit.addStudent(dave);
        unit.addStudent(dave1);
        unit.addStudent(dave2);
        unit.addStudent(corey);
        unit.addStudent(alisha);

        unit.printStudent();
        System.out.println("------------------------------");

        System.out.println("AFTER SORTING:");
        unit.sortStudents();
        unit.printStudent();
        System.out.println("------------------------------");
    }

    public void partThree(){
        Unit unit = new Unit("Programming 2", "PROG2003");

        Staff staff = new Staff("Golam","golam123@gmail.com", 45, "B12");
        Staff staff1 = new Staff("Nehemia","nehemia456@gmail.com", 42, "B13");
        Staff staff2 = new Staff("Marcus","marcus789@gmail.com", 47, "B22");
        Staff staff3 = new Staff("Adam","adam257@gmail.com", 49, "B16");
        Staff staff4 = new Staff("George","george582@gmail.com", 41, "B24");

        unit.addStaff("UA", staff);
        unit.addStaff("Lecturer", staff1);
        unit.addStaff("TutorOne", staff2);
        unit.addStaff("TutorTwo", staff3);
        unit.addStaff("TutorThree", staff4);

        unit.removeStaff("TutorTwo", staff3);

        unit.printStaff();
        System.out.println("------------------------------");
    }

    public void partFour(){
        Student jerry = new Student("Jerry", "jerry123@gmail.com", 21, 29587463, "BIT");
        Student scott = new Student("Sc0tt", "scott1232gmail.com", -25, 26382476, "MIT");
    }

    public void partFive(){
        Unit unit = new Unit("Web Development 2", "ISYS1004");

        Student kiernan = new Student("Kiernan", "kiernan123@gmail.com", 26, 24543625, "BIT");
        Student ian = new Student("Ian", "ian456@gmail.com", 28, 23164986, "MIT");
        Student haylee = new Student("Haylee", "haylee789@gmail.com", 25, 23165427, "BIT");
        Student ben = new Student("Ben", "ben258@gmail.com", 27, 22861753, "MIT");
        Student josh = new Student("Josh", "josh369@gmail.com", 23, 24158967, "BIT");

        unit.addStudent(kiernan);
        unit.addStudent(ian);
        unit.addStudent(haylee);
        unit.addStudent(ben);
        unit.addStudent(josh);

        unit.exportStudents();
    }

    public void partSix(){
        Unit unit = new Unit("Object Oriented Programming", "PROG2004");

        unit.importStudents();

        System.out.println("Number of students:" + unit.numberOfStudent());
        System.out.println("------------------------------");

        unit.printStudent();
        System.out.println("------------------------------");
    }
}
