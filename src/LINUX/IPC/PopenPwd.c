
// program for dispyaling the current working directory

#include<stdio.h>
#include<unistd.h>

int main(){
    FILE *f; char line[1024];
    int fd;
    if((f = popen("/bin/pwd", "r")) == NULL){
        printf("popen error");
    }

    read(f, line, 1024);
    printf("%s", line);
    pclose(f);
}