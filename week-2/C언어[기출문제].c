#include <stdio.h>
// void main(){
//     int i, j;
//     int temp;
//     int a[5] = {75, 95, 85, 100, 50};
//     for (i = 0; i < 4; i++){
//         for (j = 0; j < 4-i; j++){
//             if (a[i] > a[j+1]){
//                 temp = a[i];
//                 a[i] = a[j+1];
//                 a[j+1] = temp;
//             }
//         }
//     }

//     for (i = 0; i < 5; i++){
//         printf("%d ", a[i]);
//     }
// }

// void main(){
//     int i=0, c=0;
//     while (i<10){
//         i++;
//         c *= i;
//     }
//     printf("%d", c);
// }

// int r1(){
//     return 4;
// }

// int r10(){
//     return (30+r1());
// }

// int r100(){
//     return (200+r10());
// }

// int main(){
//     printf("%d\n", r100());
//     return 0;
// }

// void main() {
//     int a[4] = {0, 2, 4, 8};
//     int b[3];
//     int* pl;
//     int i, j;
//     int sum = 0;
//     for (i = 1; i < 4; i++){
//         pl = a + i;
//         b[i-1] = *pl - a[i-1];
//         sum = sum + a[i] + b[i-1];
//     }
//     printf("%d", sum);
// }

// void main(){
//     char *p = "KOREA";
//     printf("%s\n", p);
//     printf("%s\n", p+3);
//     printf("%c\n", *p);
//     printf("%c\n", *(p+3));
//     printf("%c\n", *p+2);
    
// }

// struct Soojebi {
//     char name[10];
//     int age;
// };

// void main(){
//     struct Soojebi s[] = {"Kim", 28, "Lee", 38, "Seo", 50, "Park", 35};
//     struct Soojebi *p;
//     p = s;
//     p++;
//     printf("%s\n", p->name);
//     printf("%d\n", p->age);
// }

// void main(){
//     int ary[3] = {1};
//     int s = 0;
//     int i = 0;
//     ary[1] = *(ary+0) + 2;
//     ary[2] = *ary + 3;
//     for (i = 0; i < 3; i++){
//         s = s + ary[i];
//     }
//     printf("%d", s);
// }

// int Soojebi(int base, int exp){
//     int i, result = 1;
//     for (i = 0; i < exp; i++)
//         result *= base;
//     return result;    
// }

// void main(){
//    printf("%d", Soojebi(2, 10));
// }

// void main(){
//     int *arr[3];
//     int a = 12, b = 24, c = 36;
//     arr[0] = &a;
//     arr[1] = &b;
//     arr[2] = &c;
//     printf("%d\n", *arr[1] + **arr + 1);
// }

// struct Soojebi{
//     char name[20];
//     int os, db, hab1, hab2;
// };

// void main(){
//     struct Soojebi s[3] = {{"데이터1", 95, 88}, {"데이터2", 84, 91}, {"데이터3", 86, 75}};
//     struct Soojebi *p;
//     p = &s[0];
//     (p+1)->hab1 = (p+1)->os + (p+2)->db;
//     (p+1)->hab2 = (p+1)->hab1 + p->os + p->db;
//     printf("%d\n", (p+1)->hab1 + (p+1)->hab2);    
// }

// int fn(int a){
//     if (a <= 1) return 1;
//     return a * fn(a-1);
// }

// void main(){
//     int a;
//     scanf("%d", &a);
//     printf("%d", fn(a));
// }

