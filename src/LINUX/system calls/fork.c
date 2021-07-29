#include <stdio.h>
#include <unistd.h>
int g = 6;
int main()
{
    int pid, var = 88;
    pid = vfork();
    if (pid == 0)
    {
        printf("child process %d\n ", getpid());
        printf("Its parent process % d\n ",getppid());
        g++;
        var++;
    }

    else
    {
        printf("parent process %d\n", getpid());
        printf("its parent process %d\n", getppid());
    }
    printf("pid=%d, g=%d, var =%d\n", pid, g, var);

    return 0;
}