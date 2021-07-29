
#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>


int main(int argc, char ** argv){

    int fd, n;
    char a[1];
    fd= open(argv[1], O_RDONLY);
    n = lseek(fd, -1, SEEK_END);

    while(n-- >= 0){
        // read function is called
        read(fd, a, 1);
        write(STDOUT_FILENO, a, 1);
        lseek(fd, -2, SEEK_CUR);
    }
    return 0;
}