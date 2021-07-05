

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#define MAX(X, Y) (((X) > (Y)) ? (X) : (Y))


struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};

struct Node *getNewNode(int data)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

struct Node *insertBst(struct Node *rootPtr, int data)
{

    if (rootPtr == NULL)
    {
        // returns the newNode pointer
        rootPtr = getNewNode(data);
    }
    else if (data <= rootPtr->data)
    {
        rootPtr->left = insertBst(rootPtr->left, data);
    }
    else
    {
        rootPtr->right = insertBst(rootPtr->right, data);
    }
    return rootPtr;
}

bool search(struct Node *root, int data)
{

    if (root == NULL)
    {
        return false;
    }
    else if (root->data == data)
        return true;
    else if (data <= root->data)
        return search(root->left, data);
    else
        return search(root->right, data);
}

void print(struct Node *root)
{
    if (root == NULL)
        return;
    printf("%d ", root->data);
    print(root->left);
    print(root->right);
}

// height of binary tree

int height(struct Node *root){
    if (root == NULL)   
    {
        return -1;
    }
    int leftHeight = height(root->left);
    int rightHeight = height(root->right);
    printf("%d is left height || %d is right height \n", leftHeight, rightHeight);
    return MAX(leftHeight, rightHeight) + 1;
}

// nodes will be created with malloc in c and new in c++/java

int main()
{
    struct Node *root = NULL;
    root = insertBst(root, 10);
    root = insertBst(root, 7);
    root = insertBst(root, 6);
    root = insertBst(root, 9);
    root = insertBst(root, 20);
    root = insertBst(root, 12);
    printf("%d \n", height(root));
}
