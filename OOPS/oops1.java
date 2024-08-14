package ganesh.OOPS;
// Introduction & Concepts - Classes, Objects, Constructors, Keywords
// Constructor basically defines what happens when object is created
public class oops1 {
    public static void main(String[] args) {
        Student deva = new Student(15,"Devansh",84.4f);
        Student mahi = new Student(deva);
//        deva.name = "devarsh";
//        deva.rno = 12 ;
//        deva.marks = 72 ;

//        deva.greeting();
//        deva.changeName("Food lover");
//        deva.greeting();

        System.out.println(mahi.rno);
        System.out.println(mahi.name);
        System.out.println(mahi.marks);

        Student random1 = new Student();
        System.out.println(random1.name);

        Student one = new Student();
        Student two = one;
        one.name = "Alluri seetharamaraju";
        System.out.println(two.name);



    }
}

// create class
// for every student
class Student{
    int rno; // default 0,null,0.0
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }

    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
///    Student(){
//        this.rno = 13;
//        this.name = "DEVANSH";
//        this.marks = 79.2f;
//    }

    Student(){
        // internally: new Student (40,"default person",100.0f);
    // this is how you call a constructor from another constructor
     this(40,"default person",100.0f);
    }


    // Student jessi = new Student(21,"Jessica",35)
    // here 'this' will be replaced with jessi
    Student(int rno, String name, float marks){ // float mmarks then marks = mmarks
        this.rno = rno; // this.rno = roll if ABOVE int roll
        this.name = name;
        this.marks = marks; // no need to add 'this' keyword (this:Optional)
        //if marks = marks // output is 0.0 default value
    }
}


// primitive are not objects(in java) but in python no primitives
// primitive are stored in stack memory in java, objects are stored in heap part of memory