
#include <stdio.h>
#define MAX_SIZE 101

int A[MAX_SIZE];
int top = -1;

void push(int x)
{
    if (top == MAX_SIZE - 1)
    {
        printf("stack overflow\n");
        return;
    }
    A[++top] = x;
}

void pop()
{

    if (top == -1)
    {
        printf("No element to pop\n");
    }

    top = top - 1;
}

int topElement()
{
    return A[top];
}

void printStack()
{
    int i;
    for (int i = 0; i <= top; i++)
    {
        printf("%d ", A[i]);
    }
    printf("\n");
}
int main()
{
    push(2);
    push(3);
    push(4);
    push(5);
    pop();
    push(6);
    push(7);
    printStack();
    return 0;
}