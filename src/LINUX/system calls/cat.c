
#include<unistd.h>
#include<fcntl.h>
#include<stdio.h>

int main(int argc, char ** argv){

    int fd; 
    char buf[10];
    int n;

    // fd = open(argv[1], O_RDONLY); 

    // 0 input
    // 1 output 

    while ((n = read(STDIN_FILENO, buf, 10))> 0)
    {
        write(STDOUT_FILENO, buf ,n );
    }
    
    return 0;

}