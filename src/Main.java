
    /* ************************A******************************* */

//1-> Write a lambda that can that can be passed to a method with an  IntConsumer parameter.
//    The lambda should display its argument followed by a space.
/*
interface showConsumer {
    String  show(int intcustumer);
}
public class Main {

    public static void main(String[] args) {

        showConsumer show1=(intcustumer)-> {
            return  String.valueOf(intcustumer)+" ";
        };
        System.out.println(show1.show(10));
    }

}
*/
/*
//2->Write a method reference that can be used in place of the following lambda:
//(String s) -> {return s.toUpperCase();}

interface WriteUpp{
    UpperCase getUpp(String msg);
}
class UpperCase{
    UpperCase(String s){
        System.out.print(s.toUpperCase());
    }
}
public class Main {

    public static void main(String[] args) {
        String s = "hello";
        WriteUpp write = UpperCase::new;
        // Calling interface method
        write.getUpp(s);
    }


}
*/
 /*
 //3-> Write a no-argument lambda that implicitly returns the  String "Welcome to lambdas!".
interface lambdas{
    public void Welcome();
}

public class Main {

    public static void main(String[] args) {
        String s = "Welcome to lambdas!";
        lambdas lambdass=()->{
            System.out.println(s);
        };
        lambdass.Welcome();
    }


}
*/
/*
//4->Write a method reference for  Math method  sqrt.
import java.lang.Math;
interface WriteSqr{
    Sqroot getSqr(double a);
}
class Sqroot{

    public Sqroot(double a){
        System.out.println(  Math.sqrt(a));
    }
}

public class Main {
    public static void main(String[] args) {
        WriteSqr Sqroot = Sqroot::new;
        // Calling interface method
       Sqroot.getSqr(9);
    }
}

*/
/*
//5->Create a one-parameter lambda that returns the cube of its argument.
interface Cube{
    int cube(int v);
}
public class Main {
    public static void main(String[] args) {
        Cube c = (v)->{
            return  (v*v)*v ;
        };

        System.out.println(c.cube(3));
    }
}
*/

    /* ************************B******************************** */

/*

import  java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Rand{
    void ramdom();
}
public class Main {
    public static void main(String[] args) {
        Rand R = ()->{
            SecureRandom random = new SecureRandom();
            random.ints(50, 1, 999);
            List<Integer> listA = new ArrayList<Integer>();
            for (int i = 1; i <= 50; i++) {
                int a = random.nextInt(i);
                if(a%2 == 1) listA.add(a);
            }
            Collections.sort(listA);
            for(Object element : listA) {
                System.out.println(element);
            }
        };
        R.ramdom();


    }
}*/

//Write a program that inserts 30 random letters into a  List<Character>. Perform the following operations and display your results:
/*

    import  java.security.SecureRandom;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    import java.util.TreeSet;

    interface Rand{
        void ramdom();
    }

    public class Main {
        public static void main(String[] args) {
            Rand R = ()->{
                SecureRandom random = new SecureRandom();
                random.ints(30, 1, 24);
                List<Character> listA = new ArrayList<Character>();

                TreeSet<Character> ts1 = new TreeSet<Character>();
                for (int i = 1; i <= 30; i++) {
                    int a = random.nextInt(i);
                    listA.add(getcharbynumber(a));
                }
               // Collections.sort(listA); // Sort the  List in ascending order.
               // Collections.sort(listA , Collections.reverseOrder()); //Sort the  List in descending order.
                ts1.addAll(listA); //Display the  List in ascending order with duplicates removed.
                for(Object element : ts1) {
                    System.out.println(element);
                }
               /*
                for(Object element : listA) {
                    System.out.println(element);
                }
            };
            R.ramdom();


        }

        private static Character getcharbynumber(int a) {

           if (a >24)return 'z';
            Character[] array ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','z'};

            return array[a];

        }


    }
*/


/*Define and populate a two-dimensional array of grades with 10 rows and three columns, representing 10 students' grades on three exams.
  Use a stream pipeline to calculate the average of all the grades. For this exercise, use a  Stream method  of to create
  a stream from the two-dimensional array and a  Stream method  flatMapToInt to map each row into a stream of  int values.
*/
/*
   import  java.security.SecureRandom;
   import java.util.*;


    interface average{
        void avg();
    }

    public class Main {
        public static void main(String[] args) {
            average R = ()->{
                SecureRandom random = new SecureRandom();
                random.ints(30, 1, 24);
                List<Character> listA = new ArrayList<Character>();
                int[][] grades = new int[10][3];
                grades[0][0]=7;
                grades[0][1]=5;
                grades[0][2]=6;
                grades[1][0]=6;
                grades[1][1]=9;
                grades[1][2]=4;
                grades[2][0]=6;
                grades[2][1]=5;
                grades[2][2]=8;
                grades[3][0]=8;
                grades[3][1]=8;
                grades[3][2]=8;
                grades[4][0]=9;
                grades[4][1]=5;
                grades[4][2]=3;
                grades[5][0]=3;
                grades[5][1]=4;
                grades[5][2]=6;
                grades[6][0]=6;
                grades[6][1]=7;
                grades[6][2]=6;
                grades[7][0]=8;
                grades[7][1]=4;
                grades[7][2]=5;
                grades[8][0]=5;
                grades[8][1]=5;
                grades[8][2]=6;
                grades[9][0]=6;
                grades[9][1]=6;
                grades[9][2]=6;

                OptionalDouble stream = Arrays.stream(grades).flatMapToInt(x -> Arrays.stream(x)).average();
                System.out.println(stream);


            };
            R.avg();


        }



    }
*/

/* Create a program that reads integer grades and stores them in an  ArrayList,
then use stream processing to display each grade's letter equivalent (A, B, C, D or F).*/


    import java.util.*;


    interface convert{
        void grade();
    }

    public class Main {
        public static void main(String[] args) {
            convert R = ()->{
                List<Integer> numbers = Arrays.asList(3, 2, 3, 4, 5, 6, 7, 8);
               numbers.stream().forEach(n->{
                    if (n.intValue() < 2 ) System.out.println("F");
                    if (n.intValue() >= 2 && n.intValue() < 5  ) System.out.println("E");
                    if (n.intValue() >=5 && n.intValue() < 6 ) System.out.println("C");
                    if (n.intValue() >=6 && n.intValue() <=8 ) System.out.println("B");
                    if (n.intValue() > 8 ) System.out.println("A");

                });

            };
            R.grade();


        }



    }