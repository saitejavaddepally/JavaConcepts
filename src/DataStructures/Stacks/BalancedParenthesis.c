

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

struct Node
{
    char value;
    struct Node *next;
};

struct Node *top = NULL;

bool topChecker(char topValue, char currentValue)
{
    printf("comparing %c %c\n", topValue, currentValue);
    if (topValue == '(' && currentValue == ')')
    {
        return true;
    }
    else if (topValue == '{' && currentValue == '}')
    {
        return true;
    }
    else if (topValue == '[' && currentValue == ']')
    {
        return true;
    }
    return false;
}

void push(char brace)
{
    struct Node *temp = (struct Node *)malloc(sizeof(struct Node *));
    temp->value = brace;
    temp->next = top;
    top = temp;
}

char pop()
{
    struct Node *poppedValue = top;
    if (top == NULL)
    {
        printf("Nothing to remove");
    }
    top = top->next;
    return poppedValue->value;
}

void pushExpression(char *expression, int length)
{

    for (int i = 0; i < length; i++)
    {
        push(*(expression + i));
    }
}
void print()
{
    struct Node *temp = top;
    while (temp != NULL)
    {
        printf("compare %c ", temp->value);
        temp = temp->next;
    }
}

void printRecursive(struct Node *next)
{
    if (next == NULL)
    {
        return;
    }
    printRecursive(next->next);
    printf("%c ", next->value);
}

bool checkForBalancedParanthesis(char *c, int length)
{

    for (int i = 0; i < length; i++)
    {
        if (*(c + i) == '{' || *(c + i) == '[' || *(c + i) == '(')
        {
            printf("%c is pushed \n", *(c + i));
            push(*(c + i));
        }
        else if (*(c + i) == '}' || *(c + i) == ']' || *(c + i) == ')')
        {
            if (top == NULL || !topChecker(top->value, *(c + i)))
            {
                return false;
            }
            else
            {
                printf("%c is popped \n", top->value);
                pop();
            }
        }
    }
    return (top == NULL) ? true : false;
}

int main()
{
    char *expression = "[()]{}{[()()]()}";
    int length = strlen(expression);
    if (checkForBalancedParanthesis(expression, length))
    {
        printf("correct\n");
    }
    else
    {
        printf("wrong\n");
    }

    printf("Remaining values in stack: \n");
    printRecursive(top);
}


