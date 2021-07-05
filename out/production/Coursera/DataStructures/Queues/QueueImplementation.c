
#include <stdio.h>
#include <stdbool.h>

int A[10];
// front to left
// rear to right
int front = -1;
int rear = -1;

bool isEmpty()
{
    if (front == -1 && rear == -1)
    {
        return true;
    }
    else
        return false;
}
// circular
void Enqueue(int x)
{
    if ((rear + 1) % (sizeof(A) / sizeof(int)) == front)
    {
        return;
    }
    else if (isEmpty())
    {
        front = rear = 0;
    }
    else
    {
        rear = (rear + 1) % (sizeof(A) / sizeof(int));
    }
    A[rear] = x;
}

// normal queue
// void Enqueue(int x){
//     if (rear == sizeof(A)/sizeof(int) -1){
//         return;
//     }
//     else if (isEmpty()){
//         front = rear = 0;
//     }
//     else {
//         rear = rear + 1;
//     }
//     A[rear] = x;
// }

// void dequeue(){
//     if (isEmpty())
//     {
//         return;
//     }
//     else if (front == rear){
//         front = rear = -1;
//     }
//     else {
//         front = front + 1;
//     }
// }

// circular
void dequeue()
{
    if (isEmpty())
    {
        return;
    }
    else if (front == rear)
    {
        front = rear = -1;
    }
    else
    {
        front = (front + 1) % (sizeof(A) / sizeof(int));
    }
}

void print()
{
    printf("rear %d front %d \n", rear, front);
    if (front <= rear)
    {
        for (int i = front; i <= rear; i++)
        {
            printf("%d ", A[i]);
        }
    }

    if (front > rear)
    {
        for (int i = front; i < sizeof(A) / sizeof(int); i++)
        {
            printf("%d ", A[i]);
        }
        for (int i = 0; i <= rear; i++)
        {
            printf("%d ", A[i]);
        }
    }
    printf("\n");
}

void main()
{
    Enqueue(1);
    Enqueue(2);
    Enqueue(3);
    Enqueue(4);
    Enqueue(5);
    Enqueue(6);
    Enqueue(7);
    Enqueue(8);
    Enqueue(9);
    Enqueue(10);
    dequeue();
    dequeue();
    Enqueue(1);
    Enqueue(2);
    print();
}
