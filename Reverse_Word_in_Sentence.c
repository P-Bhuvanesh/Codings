#include<stdio.h>
int main()
{
    char* str = "Virat Kholi";
    char newstr[10][1000];
    int i,j=0,st=0;
    for(i=0;str[i]!='\0';i++)
    {
        if(str[i] != ' ' && str[i] != '\0')
        {
            newstr[j][st++] = str[i];
        }
        if(str[i] == ' ' && str[i] != '\0')
        {
            j++;
            st=0;
        }
        if(str[i] == '\0') break;
    }
    
    for(i=0;i<j+1;i++)
    {
        printf("%s ",newstr[j-i]);
    }
    return 0;
}
