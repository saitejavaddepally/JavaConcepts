
#include <unistd.h>
#include <stdio.h>
#include <fcntl.h>
#include <sys/stat.h>

// rwx - rwx -rwx
// 111 - 210 -210

int main()
{
    char a[100];
    char b[100];
    int rd, wd, n;
    // create fifo
    mkfifo("FIFO1", S_IFIFO | 0777);
    mkfifo("FIFO2", S_IFIFO | 0777);
    rd = open("FIFO1", O_RDONLY);
    wd = open("FIFO2", O_WRONLY);

    // --------------hold lock
    n = read(rd, a, 100);
    a[n] = '\0';
    printf("client says : %s\n", a);
    printf("Msg for client is : \n");
// unlock
    // resume
    read(0, b, 100);
    b[n] = '\0';
    write(wd, b, n);
    close(rd);
    close(wd);
    return 0;
}


