
#include <stdio.h>
#include <unistd.h>

int main()
{
    int fd[2], n;
    char b[100], c[100];
    // create a pipe in kernel
    pipe(fd);
    printf("Reading descriptor of pipe is %d \n writing descriptor is %d \n", fd[0], fd[1]);
    printf("Enter a string to write onto pipe\n");
    // scanf("%s",b);
    n =  read(0, b, 100);
    printf("writing data onto the pipe\n");
    write(fd[1], b, 100);
    printf("Reading data from pipe\n");
    n = read(fd[0], c, 100);
    printf("Read data is : " );
    write(1,c,n);
    return 0;
}