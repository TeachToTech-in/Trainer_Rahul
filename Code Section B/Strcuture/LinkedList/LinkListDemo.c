#include <stdio.h>
#include <stdlib.h>
typedef struct xyz
{
    int data;
    struct xyz *next;
} Node;
void printList(Node *start)
{
    Node *temp = start;
    while (temp != NULL)
    {
        printf("[%d]", temp->data);
        if (temp->next != NULL)
        {
            printf("->");
        }
        else
        {
            printf("\n");
        }
        temp = temp->next;
    }
}
void insertValues(Node *temp)
{

    printf("Enter the data\n");
    scanf("%d", &temp->data);
    temp->next = NULL;
}
Node *createList(int n)
{
    Node *start, *temp;
    int i = 1;
    if (n <= 0)
        return NULL;
    while (i <= n)
    {
        if (i == 1)
        {
            start = (Node *)malloc(sizeof(Node));
            insertValues(start);
            temp = start;
        }
        else
        {
            temp->next = (Node *)malloc(sizeof(Node));
            insertValues(temp->next);
            temp = temp->next;
        }
        i++;
    }
    return start;
}

int main()
{
    Node *start;
    int n;
    printf("Enter the node you want to create in a List\n");
    scanf("%d", &n);
    start = createList(n);
    printList(start);
}