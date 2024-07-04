#include<stdio.h>
#include<limits.h>
int asciiMul(char* str)
{
    int prod = 1;
    for(int i=0;str[i]!='\0';i++) 
    {
        if((str[i]>='A' && str[i]<='Z') || (str[i] >= 'a' && str[i]<='z') || (str[i]>'0' && str[i]<='9'))
        if(prod*(int)str[i] < INT_MAX) 
        prod *= (int)str[i];
    }
    return prod;
}
int main()
{
    char str[100];
    printf("Enter the input string:\n");
    scanf("%[^\n]%*c",str);
    printf("The prod of string ascii characters: ");
    printf("%d",asciiMul(str));
    printf("\nMax length an integer can store: ");
    printf("%d",INT_MAX);
    return 0;
}
