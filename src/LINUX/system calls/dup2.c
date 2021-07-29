
#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main(int argc, char** argv){


    printf("%d", argc);

    int fd, fd1;
    char a;
    fd = open(argv[1], O_RDONLY);
    fd1 = dup2(fd,0);
    a = getchar();
    putchar(a);
    return 0;

}


//  int fd = open("file1", O_RDWR)
   
// fd =0 STDIN_FILENO
//  fd = 1 output
//  -1 error
