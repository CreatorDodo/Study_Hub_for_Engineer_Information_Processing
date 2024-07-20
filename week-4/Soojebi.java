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

// class A {
//     String s;
//     A() {
//         System.out.print("A");
//     }
//     A(String s) {
//         this.s = s;
//         System.out.print(this.s);
//     }
//     public void fn() {
//         System.out.print("C");
//     }
// }

// class B extends A {
//     String s;
//     B() {
//         System.out.print("B");
//     }
//     B(String s) {
//         super("hello ");
//         this.s = s;
//         System.out.print(this.s);
//     }
//     public void fn() {
//         super.fn();
//         System.out.print("D");
//     }
// }

// public class Soojebi {
//     public static void main(String args[]) {
//         A obj1 = new B();
//         obj1.fn();
//         System.out.println();
//         A obj2 = new B("soojebi");
//         obj2.fn();
//     }
// }

// class Soojebi {
//     static private Soojebi instance = null;
//     private int count = 0;
//     static public Soojebi get() {
//         if (instance == null) {
//             instance = new Soojebi();
//         }
//         return instance;
//     }
//     public void count() {
//         count++;
//     }
//     public int getCount() {
//         return count;
//     }
// }
//     public class Soojebi2 {
//        public static void main(String[] args) {
//         Soojebi s1 = Soojebi.get();
//         s1.count();
//         Soojebi s2 = Soojebi.get();
//         s2.count();
//         Soojebi s3 = Soojebi.get();
//         s3.count();
//         System.out.print(s1.getCount());
    
//     }
// }

// public class Soojebi {
//     public static void main(String[] args) {
//         System.out.print(Soojebi.check(1));
//     }
//     static String check(int num) {
//         return (num >= 0) ? "positive" : "negative";
//     }
    
// }
 
// public class Soojebi {
//     public static void main(String[] args) {
//         int a = 3, b = 4, c = 3, d = 5;
//         if ((a == 2 | a == c) & !(c < d) & (1 == b ^ c != d)) {
//             a = b + c;
//             if (7 == b ^ c != a) {
//                 System.out.println(a);
//             } else {
//                 System.out.println(b);
//             }
//         } else {
//             a = c + d;
//             if (7 == c ^ d != a) {
//                 System.out.println(a);
//             } else {
//                 System.out.println(d);
//             }
//         }
//     }
// }

// class A{
//     int a;
//     int b;
// }

// public class Soojebi {
    
//     static void func1(A m){
//         m.a *= 10;
//     }

//     static void func2(A m){
//         m.a += m.b;
//     }

//     public static void main(String[] args) {
//         A m = new A();
//         m.a = 100;
//         func1(m);
//         m.b = m.a;
//         func2(m);

//         System.out.printf("%d", m.a);
//     }
// }

// class Car implements Runnable{
//     int a;
//     public void run(){
//       //  ...
//     }
// }

// public class Soojebi {
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new Car());
//         t1.start();
//     }
// }

// public class Soojebi {
//     int a;
//     public Soojebi(int a){
//         this.a = a;
//     }
//     int func() {
//         int b = 1;
//         for (int i = 1; i < a; i++) {
//             b = a * i + b;
//         }
//         return a + b;
//     }
//     public static void main(String[] args) {
//         Soojebi obj = new Soojebi(3);
//         obj.a = 5;
//         int b = obj.func();
//         System.out.println(obj.a + b);
//     }
// }

// public class Soojebi {
//     static int[] MakeArray(){
//         int[] tempArr = new int[4];
//         for (int i = 0; i < tempArr.length; i++) {
//             tempArr[i] = i;
//         }
//         return tempArr;
//     }
    
//     public static void main(String[] args) {
//         int[] intArr;
//         intArr = MakeArray();
        
//         for (int i = 0; i < intArr.length; i++) {
//             System.out.print(intArr[i]);
//         }
//     }
// }

// class Soojebi {
//     public static void main(String[] args) {
//         int[] result = new int[5];
//         int[] arr = {79, 34, 10, 99, 50};
//         for (int i = 0; i < 5; i++) {
//             result[i] = 1;
//             for (int j = 0; j < 5; j++) {
//                 if (arr[i] < arr[j])    result[i]++;
                
//             }
//         }
//         for (int k = 0; k < 5; k++) {
//             System.out.print(result[k]);
//         }
//     }
// }

public class Soojebi {
    public static void main(String[] args) {
        int a = 0;
        for(int i=1; i<999; i++){
            if(i%3 == 0 && i%2 != 0){
                a = i;
            }
        }
        System.out.println(a);
    }
}