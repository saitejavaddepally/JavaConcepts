
#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/stat.h>

int main()
{
    int wd, n, rd;
    char a[100], b[100];
    wd = open("FIFO1", O_WRONLY);
    rd = open("FIFO2", O_RDONLY);

    printf("Enter a message for server \n");
    n = read(STDIN_FILENO, a, 100);
    a[n] = '\0';
    write(wd, a, n);

    // hold lock
    // resume
    // unlock
    n = read(rd, b, 100);
    b[n] = '\0';
    printf("server says : %s \n", b);
    close(wd);
    close(rd);
}