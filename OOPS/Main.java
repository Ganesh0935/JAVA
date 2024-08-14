package ganesh.OOPS;

public class Main {
    public static void main(String[] args) {
        Human deva = new Human(33, "rocky", 32000, true);
        // System.out.println(deva .population); // output : 1
        Human mahi = new Human(22, "shetty", 54000, false);
        Human puri = new Human(44, "raj", 66000, true);

        // System.out.println(deva.population); // output: 2
        // System.out.println(mahi.population);// output: 2 // it works but don't use it. Use only "ClassName"
        // don't use obj name or reference name to access static variable
        System.out.println(Human.population); // className.population or objName.population same output

        Human.message(); // static method accessing using className

        // static method or static var belong to class
        // it can be accessed without creating object

        fun();

        Main obj2 = new Main();
        obj2.fun2();
    }


        // this is not dependent on objects
         static void fun(){
//           greeting();  // cannot access non-static in static function
//            Main.greeting(); // it also can't accessible
//        // but function you are using it in does not depend on instances

             Main obj = new Main();
             obj.greeting();
 
        }

        void fun2(){
            greeting();
        }




    // we know that something which is not static, belongs to an object
    void greeting(){
        // fun();
        System.out.println("Good Morning");
    }

}
