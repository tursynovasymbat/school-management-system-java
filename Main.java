public class Main{
    public static void main(String[] args){
        School school = new School("Almaty School","Almaty");
        Student student1 = new Student(1,"Aruzhan",10);
        Student student2 = new Student(2,"Dias",11);

        Teacher teacher1=new Teacher(1,"Nuray","History");
        Teacher teacher2=new Teacher(2,"Dastan","Math");

        System.out.println("SCHOOL");
        school.displaySchool();

        System.out.println("STUDENT");
        student1.displayStudent();
        System.out.println();
        student2.displayStudent();

        System.out.println("TEACHER");
        teacher1.displayTeacher();
        System.out.println();
        teacher2.displayTeacher();

        System.out.println("\nCOMPARISON");
        if (student1.getGrade()> student1.getGrade()){
            System.out.println(student1.getName()+" has a higher grade level.");
        }else{
            System.out.println(student2.getName()+" has a higher grade level.");
        }
    }
}
