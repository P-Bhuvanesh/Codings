#include<stdio.h>
#include<string.h>
void* reverse(char* str)
{
    char newStr[100];
    int k = 0;
    for(int i=strlen(str)-1;i>=0;i--) newStr[k++] = str[i];
    return newStr;
}
int checkPalidrome(char* str)
{
    printf("%s\n",str);
    int st = 0, end = strlen(str)-1,count=0;
    while(st<end)
    {
        if(str[st] == str[end]) 
        {
            st++;
            end--;
        }
        else return 0;
    }
    return strlen(str);
}
int main()
{
    char str[100], revStr[100];
    int max=0,i=0;
    scanf("%[^\n]s",str);
    revStr = reverse(str);
    while(i<strlen(str)-1)
    {
        int c = checkPalidrome(str+i);
        if(max < c) max = c; 
        i++;
    }
    printf("%s",revStr);
    printf("%d",max);
}
