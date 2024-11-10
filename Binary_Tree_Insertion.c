#include <stdio.h>
#include<stdlib.h>
typedef struct Node{
    int key;
    struct Node* left;
    struct Node* right;
}Node;
void insert(Node** root, int data)
{
    Node* nn = (Node*)malloc(sizeof(Node));
    nn->key=data;
    nn->left=nn->right=NULL;
    if(*root == NULL)
    {
        *root=nn;// 10 
        return;
    }
    
    /*
        FOR BINARY SEARCH Tree         
        // if(data < (*root)->key) insert(&((*root)->left),data);
        // else if(data > (*root)->key) insert(&((*root)->right),data);     
    */
    
    Node** queue = (Node**)malloc(100*sizeof(Node*));
    int fr = 0;
    int re = 0;
    queue[re++] = *root;// re = 1, queue[0] = 10 
    while(fr!=re)
    {
        Node* temp = queue[fr++];// temp = queue[0], fr = 1;// temp = queue[1], fr = 2;
        if(!temp->left)
        {
            temp->left = nn;// 10->left = 20;// 20->left = 40
            break;
        }
        else queue[re++] = temp->left;// queue[1] = 20;, re = 2
        if(!temp->right) 
        {
            temp->right = nn;// 10->right = 30
            break;
        }
        else queue[re++] = temp->right;// queue[2] = 30, re = 3;
    }
    free(queue);
}
void inorder(Node* root)
{
    if(root != NULL)
    {
        inorder(root->left);
        printf("%d ",root->key);
        inorder(root->right);
    }
}
void preorder(Node* root)
{
    if(root != NULL)
    {
        printf("%d ",root->key);
        preorder(root->left);
        preorder(root->right);
    }
}
void postorder(Node *root)
{
    if(root!=NULL)
    {
        postorder(root->left);
        postorder(root->right);
        printf("%d ",root->key);
    }
}
int main()
{
    int n;
    Node* root = NULL;
    printf("Enter the number of nodes: \n");
    scanf("%d",&n);
    printf("Enter the value of nodes: \n");
    for(int i=0;i<n;i++)
    {
        int temp;
        scanf("%d",&temp);
        insert(&root,temp);
    }
    printf("\nInorder Traversal\n");
    inorder(root);
    printf("\nPreorder Traversal\n");
    preorder(root);
    printf("\nPostorder Traversal\n");
    postorder(root);
    return 0;
}


/*

Binary Tree
    10
   /  \
 20    30
 / \
40  50


n = 5
ele => 10 20 30 40 50

*/
