/*package ganesh.OOPS;

public class Wrapper {

    public static void main(String[] args) {
        int n = 1;
        Integer a = 10;
        Integer b = 20;
        // Wrapper classes num. has many functions
        Integer num = 30;

        swap(a,b);
        System.out.println(a + "," + b);

        final float PI = 3.141f;
        System.out.println(PI);


        final A deva = new A("devaratha");
        deva.name = "other name "; //this is allowed

        // when a non-primitive is final, we cannot reassign it.
   //     deva = new A("devaratha"); // this is not allowed

        System.out.println(deva.name);

        A obj;
        for(int i = 0 ; i < 100 ; i++){
            obj = new A("Random name");
        }
    }

    static void swap(Integer a, Integer b) {
    Integer temp = a;
    a = b;
    b = temp;
    }


    class A {
        final int num = 10;
        String name;
        public  A(String name){
        // System.out.println("object is created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable{
            System.out.println("object is destroyed");
        }
    }
}
*/