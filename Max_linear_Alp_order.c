#include <stdio.h>
#include <string.h>
char* func(char* str)
{
    printf("Original String: %s",str);
    static char ordered[26];
    for(int i=0;i<26;i++) ordered[i] = '.';
    for(int i=0;str[i]!='\0';i++)
    {
        if(str[i]>='A' && str[i]<='Z')
        {
            if(ordered[str[i]-'A'] == '.') ordered[str[i]-'A'] = str[i];
        }
        else if(str[i]>='a' && str[i]<='z')
        {
            if(ordered[str[i]-'a'] == '.') ordered[str[i]-'a'] = str[i];
        }
        else continue;
    }
    return ordered;
}
int main()
{
    char str[100];
    printf("Enter the input string:\n");
    scanf("%[^\n]s",str);
    printf("\nOrdered String: %s",func(str));
    return 0;
}
