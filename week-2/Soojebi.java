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

// class Soojebi {
//         public static void main(String[] args) {
//             int []a = new int[8];
//             int i=0;
//             int n=10;
//             while (i <= 7) {
//                 a[i++] = n%2;
//                 n /= 2;
//             }
//         for (i=7; i>=0; i--) {
//             System.out.print(a[i]);
//         }
//     }
// }

// class Parent{
//     public int compute(int num){
//         if (num <= 1) return num;
//         return compute(num-1)+compute(num-2);
//     }
// }

// class Child extends Parent{
//     public int compute(int num){
//         if (num <= 1) return num;
//         return compute(num-1)+compute(num-3);
//     }
// }

// class Soojebi{
//     public static void main(String[] args) {
//         Parent obj = new Child();
//         System.out.println(obj.compute(4));
//     }
// }

// public class Soojebi {
//     public static void main(String[] args) {
//    int[][] arr = new int[][]{ {45, 50, 75}, {89} };
//     System.out.println(arr[0].length);
//     System.out.println(arr[1].length);
//     System.out.println(arr[0][0]);
//     System.out.println(arr[0][1]);
//     System.out.println(arr[1][0]);
//     }
// }

// public class Soojebi {
//     public static void main(String[] args) {
//         int i, j;
//         for(j=0, i=0; i<=5; i++) {
//             j += i;
//             System.out.print(i);
//             if(i == 5){
//                 System.out.print("=");
//                 System.out.print(j);
//             }
//             else{
//                 System.out.print("+");
//             }
//         }
//     }
// }

// class ovr1{
//     public void main(String[] args){
//     ovr1 a1 = new ovr1();
//     ovr2 a2 = new ovr2();
//     System.out.print(a1.san(3,2) + a2.san(3,2));
//     }
//     int san(int x, int y){
//         return x+y;
//     }
// }

// class ovr2 extends ovr1{
//     int san(int x, int y){
//         return x-y + super.san(x,y);
//     }
// }

class A {
    String s;
    A() {
        System.out.print("A");
    }
    A(String s) {
        this.s = s;
        System.out.print(this.s);
    }
    public void fn() {
        System.out.print("C");
    }
}

class B extends A {
    String s;
    B() {
        System.out.print("B");
    }
    B(String s) {
        super("hello ");
        this.s = s;
        System.out.print(this.s);
    }
    public void fn() {
        super.fn();
        System.out.print("D");
    }
}

public class Soojebi {
    public static void main(String args[]) {
        A obj1 = new B();
        obj1.fn();
        System.out.println();
        A obj2 = new B("soojebi");
        obj2.fn();
    }
}