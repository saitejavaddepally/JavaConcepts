#include<unistd.h>
#include<dirent.h>
#include<stdio.h>

int main()
{

    DIR *dp;
    int c;
    struct dirent *dir;
    dp = opendir("example");
    seekdir(dp, 2L);
    dir = readdir(dp);
    printf("%s", dir->d_name);
    printf("%ld", telldir(dp));
}