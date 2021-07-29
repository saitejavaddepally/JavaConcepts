#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/stat.h>

int main(int argc, char **argv)
{
    struct stat s;
    stat(argv[1], &s);
    if (S_ISREG(s.st_mode))
    {
        printf("Regular file");
    }
    if (S_ISDIR(s.st_mode))
    {
        printf("Directory file");
    }

    return 0;
}