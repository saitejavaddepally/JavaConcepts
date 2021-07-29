
#include<stdio.h>
#include<unistd.h>

int main(){
    int fd[2];
    int pid, n;
    char b[100], c[100];

    pipe(fd);

    pid = fork();

    // parent ---> child process id
    //  child ===> 0

    printf("%d", pid);
    if(pid == 0){
        close(fd[1]);
        n = read(fd[0], b, 100);
        printf("child process has read data which is : %s\n", b);  
        close(fd[0]);      
    }

    // parent execution
    else{
        close(fd[0]);
        printf("Enter data to share with child process\n");
        n = read(STDIN_FILENO, c, 100);
        // data enter
        write(fd[1], c, n);
        close(fd[1]);
    }

}



    