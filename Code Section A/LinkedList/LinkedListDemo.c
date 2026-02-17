#include <stdio.h>
#include <stdlib.h>
typedef struct Student
{
    int data;
    struct Student *next;
} Student;
Student *createNode(Student *head)
{
    printf("Enter the data\n");
    scanf("%d", &head->data);
    head->next = NULL;
    return head;
}
Student *createList(int n)
{
    Student *start, *temp;
    int i = 1;
    while (i <= n)
    {
        if (i == 1)
        {

            start = (Student *)malloc(sizeof(Student));
            temp = start;
            createNode(start);
        }
        else
        {
            temp->next = (Student *)malloc(sizeof(Student));
            temp = temp->next;
            createNode(temp);
        }
        i++;
    }

    return start;
}
void printList(Student *head)
{
    while (head != NULL)
    {
        printf("[%d] ", head->data);
        head = head->next;
        printf("->");
    }
}

int main()
{
    Student *head;
    printf("Enter the number of Nodes want to create\n");
    int n;
    scanf("%d", &n);
    head = createList(n);
    printList(head);
    return 0;
}