
#include <fcntl.h>
#include <unistd.h>
#include <stdio.h>
// open

int main()
{

    int n;
    char buf[30];

    // 0 -> STDIN_FILENO
    // 1 -> STDOUT_FILENO

    while ((n = read(STDIN_FILENO, buf, 10)) > 0)
    {
        write(STDOUT_FILENO, buf, n);
    }
    return 0;
}