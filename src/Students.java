import java.util.List;

public class Students {
    private String name;

    Students(String student){
        this.name = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void  addToList(List<Students> students, Students student){
        students.add(student);
    }
}

