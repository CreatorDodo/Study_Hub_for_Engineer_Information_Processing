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

void main(){
    int i=0, c=0;
    while (i<10){
        i++;
        c *= i;
    }
    printf("%d", c);
}

int r1(){
    return 4;
}

int r10(){
    return (30+r1());
}

int r100(){
    return (200+r10());
}

int main(){
    printf("%d\n", r100());
    return 0;
}