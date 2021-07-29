
#include <unistd.h>
#include <stdio.h>

int main()
{
    int pid;
    pid = fork();
    if (pid == 0)
    {
        printf("child process %d\n ", getpid());
        printf("its parent process %d\n", getppid());
        sleep(0.1);
        printf("child process %d\n", getpid());
        printf("its parents process %d\n", getppid());
    }
    else
    {
        printf("parent process %d\n", getpid());
        printf("its parent process %d\n", getppid());
    }

    return 0;
}