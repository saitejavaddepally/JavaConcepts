#include <signal.h>
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

void alrm_handler(int signo);
char buf[100] ="f1";
int main()
{
    int n;

    if (signal(SIGALRM, alrm_handler) == SIG_ERR)
        printf("“error ”");
    printf("“enter filename:”");
    alarm(5);
    n = read(STDIN_FILENO, buf, 100);
    if (n > 1)
        printf("filename %s ", buf);
    exit(0);
}

void alrm_handler(int signo)
{
    printf("signal % d received, default filename %s ", signo, buf);
    exit(1);
}