/*
n = 5
*
    *
*       *
    *       *
*       *       * 
    *       *
*       *
    *
*
*/
#include<stdio.h>
int main()
{
    int n=10;
    for(int i=1;i<=2*n-1;i++,printf("\n"))
    {
        if(i<=n)
        {
            for(int j=0;j<i;j++)
            {
                if(i%2 == 0)
                {
                    if(j%2==0) printf(" ");
                    else printf("*");
                }
                else{
                    if(j%2==0) printf("*");
                    else printf(" ");
                }
            }
        }
        else{
            for(int j=0;j<2*n-i;j++)
            {
                if(i%2 == 0)
                {
                    if(j%2 == 0) printf(" ");
                    else printf("*");
                }
                else{
                    if(j%2==0) printf("*");
                    else printf(" ");
                }
            }
        }
    }
    return 0;
}
