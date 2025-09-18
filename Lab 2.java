// Define a Class of Students
// Design a class named Student to represent a student. The class contains the following data fields: name (private, String), stu_id (private, String), GPA (private, double), and age (private, int). You should define the set/get methods for each field. Also define two constructors, one fully loaded constructor and one no-arg constructor.

//In a separate class named StudentAccess, create a main method that instantiates three student objects using the above two constructors separately. In addition, you should show how to access and mutate the object data field by calling the access/mutator methods.

class Student {
    private String name;
    private String Stu_Id;
    private double GPA;
    private int age;

    //getters
    public String getName(){
        return name;
    }

    public String getStu_Id(){
        return Stu_Id;
    }

    public double getGPA(){
        return GPA;
    }
    public int age(){
        return age;
    }

    //setters

    public void setName(String name){
        this.name = name;
    }

    public void setStu_Id(String Stu_Id){
        this.Stu_Id = Stu_Id;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    public void SetAge(int age){
        this.age = age;
    }

    //Fully loaded constructor

    public Student(String name, String Stu_Id, double GPA, int age) {
       this.name = name;
       this.Stu_Id = Stu_Id;
       this.GPA = GPA;
       this.age = age;
    }

    //no - arg constructor

    Student(){
        this.name = " ";
        this.Stu_Id = " ";
        this.GPA = 0.0;
        this.age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;

        }

        @Override
    public String toString(){
                System.out.println("Name: " + name);
            System.out.println("Student ID: " + Stu_Id);
            System.out.println("GPA: " + GPA);
            System.out.println("Age: " + age);
            return "";
        }

    //In a separate class named StudentAccess, create a main method that instantiates three student objects using the above two constructors separately. In addition, you should show how to access and mutate the object data field by calling the access/mutator methods.

        public static class StudentAccess {
            public static void main(String[] Args) {
                Student s1 = new Student("Karan", "123232", 3.4, 19 );
                Student s2 = new Student("jackson", "32433", 4.5, 12);
                Student s3 = new Student("henry", "43232", 3.5, 24);



                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);

                s1.setName("George");
                System.out.println(s1);

            }
        }
}

