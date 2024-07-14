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

// void main() {
//     int number = 1234;
//     int div = 10;
//     int result = 0;

//     while (number > 0){
//         result = result * div;
//         result = result + number % div;
//         number = number / div;
//     }

//     printf("%d", result);
// }

// int isPrime(int number) {
//     int i;
//     for (i = 2; i < number; i++){
//         if (number % i == 0) return 0;
//     }
//     return 1;
// }

// void main(){
//     int number = 13195, max_div=0, i;
//     for (i = 2; i < number; i++)
//         if (isPrime(i) == 1 && number % i == 0)
//             max_div = i;
//     printf("%d", max_div);
// }

// struct student{
//     int n, g;
// };

// int main(){
//     struct student st[2];
//     int i = 0;
//     for (i; i < 2; i++){
//         st[i].n = i;
//         st[i].g = i+1;
//     }
//     printf("%d", st[0].n + st[1].g);
//     return 0;
    
// }

// int len(char *p);

// int main(){
//     char *p1 = "2022";
//     char *p2 = "202207";
//     printf("%d", len(p1) + len(p2));
//     return 0;
// }

// int len(char *p){
//     int r = 0;
//     while (*p != '\0'){
//         p++;
//         r++;
//     }
//     return r;
// }

// void main(){
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

// int calc(int w, int h, int j, int i){
//     if(i>=0 && i<h && j>=0 && j<w) return 1;
//     return 0;
// }

// int main(){
//     int field[4][4] = {{0, 1, 0, 1}, {0, 0, 0, 1}, {1, 1, 1, 0}, {0, 1, 1, 1}};
//     int mines[4][4] = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
//     int w = 4, h = 4;
//     int i, j, k, l;

//     for (l = 0; l < h; l++){
//         for (k = 0; k < w; k++){
//             if (field[l][k] == 0)
//                 continue;
            
//             for (i = l-1; i <= l+1; i++){
//                 for (j = k-1; j <= k+1; j++){
//                     if (calc(w, h, j, i) == 1){
//                         mines[i][j] += 1;
//                     }
//                 }
//             }
//         }
//     }

//     for (l = 0; l < h; l++){
//         for (k = 0; k < w; k++){
//             printf("%d ", mines[l][k]);
//         }
//         printf("\n");
//     }
//     return 0;
// }

// void main(){
//     int n, k, s;
//     int el = 0;
//     for (n = 6; n <= 30; n++){
//         s=0;
//         k=n/2;
//         for (int j = 1; j <= k; j++){
//                 if (n % j == 0){
//                     s=s+j;
//                 }
//             }
//         if (s == n){
//             el++;
//         }
//     }
//     printf("%d", el);
// }

// int main() {
//     int i, j, k;
//     for (i = 1; i <= 4; i++) {
//         for (j = 1; j <= i; j++) {
//             for (k = 1; k <= j; k++) {
//                 printf("%c", 'A' + i - 1);
//             }
//         }
//         printf("\n");
//     }
//     return 0;
// }

// int main() {
//     int a[3][3] = {{1, 2, -3}, {4}, {-5, 6}};
//     int i, j, sum = 0;
//     for (i = 0; i < 3; i++) {
//         for (j = 0; j < 3; j++) {
//             if (a[i][j] > 0) {
//                 sum += a[i][j];
//             } else if (a[i][j] < 0) {
//                 sum -= a[i][j];
//             }
//         }
//     }
//     printf("%d", sum);
//     return 0;
// }

// void main() {
//     int i;
//     int sum = 0;
//     int arr[5] = {2, 3, 5, 7, 11};
//     int *p = arr + 2;

//     for (i = -1; i < 2; i++) {
//         sum += p[i];
//     }
//     printf("%d", sum);
// }

// void soojebi(int n) {
//      if (n > 0) {
//         printf("%d ", n);
//         soojebi(n - 1);
//         printf("%d ", n);
//     } 
// }
// int main() {
//     int num = 4;
//     soojebi(num);
//     return 0;
// }

// 4 3 2 1 1 2 3 4

void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n-1; i++) {
        for (j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main() {
    int arr[] = {64, 34, 25, 12};
    int n = sizeof(arr) / sizeof(arr[0]);
    bubbleSort(arr, n);
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}