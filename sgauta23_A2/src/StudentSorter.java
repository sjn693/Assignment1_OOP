import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getName().equals(o2.getName())){
            if(o1.getStudentNumber()< o2.getStudentNumber()){
                return -1;
            } else if (o1.getStudentNumber()> o2.getStudentNumber()) {
                return 1;
            }else {
                return 0;
            }
        }else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
