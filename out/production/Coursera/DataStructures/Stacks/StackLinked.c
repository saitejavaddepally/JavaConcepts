
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Node
{
    int data;
    struct Node *link;
};

struct Node *top = NULL;

void push(int x)
{
    struct Node *temp = (struct Node *)malloc(sizeof(struct Node *));
    temp->data = x;
    temp->link = top;
    top = temp;
}

void pop()
{
    struct Node *temp;
    if (top == NULL)
        return;
    temp = top;
    top = temp->link;
    free(temp);
}

void print()
{
    struct Node *temp = top;
    while (temp != NULL)
    {
        printf("%c ", temp->data);
        temp = temp->link;
    }
}

void reverse(char *c, int n)
{
    for (int i = 0; i < n; i++)
    {
        push(*(c + i));
    }
}

void reverseLlUsingStack(char *c, int n)
{
    for (int i = 0; i < n; i++)
    {
        push(*(c + i));
    }
    struct Node* prev = top;
}

int main()
{
    char *c = "String";
    reverseLlUsingStack(c, strlen(c));
    print();
}