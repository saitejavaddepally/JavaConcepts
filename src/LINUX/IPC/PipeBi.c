#include <stdio.h>
#include <unistd.h>

int main()
{
    int fd1[2], fd2[2], pid, n;
    char b[100], c[100];

    pipe(fd1);
    pipe(fd2);

    pid = fork();
    printf("pid is %d \n", pid);
    // forked so it runs two times
    if (pid == 0)
    {
        // close the writing end of pipe1
        close(fd1[1]);
        // close the reading end of pipe2
        close(fd2[0]);


        n = read(fd1[0], b, 100);
        printf("CHILD : %s \n", b);


        // 3
        printf("Response from child to parent\n");
        n = read(0, c, 100);
        write(fd2[1], c, n);
        close(fd1[0]);
        close(fd2[0]);
    }

    // 1
    else
    {

        printf("Parent msg ...?\n");
        read(0, b, 100);
        write(fd1[1], b, n);
        // ------------- hold 

        // 4
        // print
        n = read(fd2[0], c, 100);
        printf("Parent msg : %s\n", c);
    }
    return 0;
}


// similar processes
// fork() parent -> child

//  popen pclose we communicate with diff process
