package ganesh.OOPS;
// Packages,Static , singleton Class, In-built Methods

public class Human{
    int age ;
    String name ;
    int salary ;
    boolean married ;
   static long population;


   static void message(){
       System.out.println("Have A GOOD DAY.!");
       // System.out.println(this.name); // cannot use 'this' keyword in static method
   }

    public Human(int age, String name , int salary ,boolean married){
        this.age = age ;
        this.name = name ;
        this.salary = salary ;
        this.married = married ;
        Human.population += 1 ;  // common element className.staticVar += 1  per one Human obj population increment is 1
        // this.population also works but use "ClassName.population"

    }

}
