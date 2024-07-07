// public class Soojebi {
//     public static void main(String[] args) {
//         int i;
//         int []a = {0,1,2,3};
//         for (i=0; i<4; i++) {
//             System.out.println(a[i] + " ");
//         }
//     }
// }

// public class Soojebi {
//     public static void main(String[] args) {
//         int i = 3;
//         int k = 1;
//         switch (i) {
//             case 0:
//             case 1:
//             case 2:
//             case 3: k = 0;
//             case 4: k += 3;
//             case 5: k -= 10;
//             default: k--;
//         }
//         System.out.print(k);
//     }
// }

// class Parent{
//     public void show(){
//         System.out.println("Parent");
//     }   
// }

// class Child extends Parent{
//     public void show(){
//         System.out.println("Child");
//     }
// }

// public class Soojebi {
//     public static void main(String[] args) {
//         Parent pa = new Child();
//         pa.show();
//     }
    
// }

// abstract class Vehicle{
//     private String name;
//     abstract public String getName(String val);
//     public String getName(){
//         return "Vehicle name:" + name;
//     }
//     public void setName(String val){
//         name = val;
//     }
// }

// class Car extends Vehicle{
//     public Car(String val){
//         setName(val);
//     }
//     public String getName(String val){
//         return "Car name:" + val;
//     }
// }

// public class Soojebi {
//     public static void main(String[] args) {
//         Vehicle obj = new Car("Spark");
//         System.out.print(obj.getName());
//     }
// }

class Soojebi {
        public static void main(String[] args) {
            int []a = new int[8];
            int i=0;
            int n=10;
            while (i <= 7) {
                a[i++] = n%2;
                n /= 2;
            }
        for (i=7; i>=0; i--) {
            System.out.print(a[i]);
        }
    }
}