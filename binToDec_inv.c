#include<stdio.h>
#include<math.h>
void toBinary(int n)
{
    int arr[32],k=0;
    while(n>0)
    {
        arr[k++] = n%2;
        n = n/2;
    }
    int po = k-1,sum=0;
    for(int i=k-1;i>=0;i--) printf("%d ",arr[i]);
    for(int i=k-1;i>=0;i--)
    {
        sum+=arr[i]*pow(2,po--);
    }
    printf("\n%d",sum);
}
#include <stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    toBinary(n);
}
