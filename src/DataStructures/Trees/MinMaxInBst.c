 
#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* left; 
    struct Node* right;
};

int findMin(struct Node* root){
    struct Node* current = root;
    if (root == NULL)
    {
        printf("The tree is empty\n");
        return -1;
    }
    
    while (current->left != NULL)
    {
        current = current->left;
    }
    return current->data; 
}

int findMax(struct Node* root){
    struct Node* current = root;
    if (root == NULL)
    {
        printf("The tree is empty\n");
        return -1;
    }
    
    while (current->right != NULL)
    {
        current = current->left;
    }
    return current->data; 
}

int findMinRecursive(struct Node* root){
    if (root == NULL)
    {
        return -1;
    }
    else if (root-> data == NULL){
        return root->data;
    }
    return findMinRecursive(root->left);
}
int findMaxRecursive(struct Node* root){
    if (root == NULL)
    {
        return -1;
    }
    else if (root-> data == NULL){
        return root->data;
    }
    return findMinRecursive(root->right);
}
