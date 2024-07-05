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

class Parent{
    public void show(){
        System.out.println("Parent");
    }   
}

class Child extends Parent{
    public void show(){
        System.out.println("Child");
    }
}

public class Soojebi {
    public static void main(String[] args) {
        Parent pa = new Child();
        pa.show();
    }
    
}