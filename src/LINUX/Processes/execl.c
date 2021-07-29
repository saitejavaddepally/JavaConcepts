#include <stdio.h>
#include <unistd.h>
#include<stdlib.h>
int main()
{
    printf("Files in Directory are: \n");
    execl("/bin/ls","ls", "-l", (char *)0);
    int x = system("pwd");
    printf("%d", x);
}