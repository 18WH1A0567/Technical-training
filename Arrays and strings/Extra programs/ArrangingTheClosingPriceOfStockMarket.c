#include <stdio.h>

int main()
{
    int n, j, k;
    scanf("%d", &n);
    int a[n];
    for(int i = 0;i < n;i++){
        scanf("%d", &a[i]);
    }
    
    for(int i = 1; i < n;i++){
        j = i - 1;
        k = a[i];
        if(k < 0){
            while(j >= 0 && a[j] > k && a[j] > 0){
                a[j+1] = a[j];
                j -= 1;
            }
            a[j+1] = k;
        }
        
    }

    for(int i = 0;i < n;i++){
        printf("%d ", a[i]);
    }
    return 0;
}
