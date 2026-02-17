#include <stdio.h>
// Declaration of Structure
struct Student
{
    int rollno;
    char name[25];
    float percentage;
}; // s1; // Global variable
// give Alias
typedef struct Student Stud;
int main()
{
    // Use User Define Datatype
    Stud s1;
    Stud *p1 = &s1;
    printf("Enter the Student Details \n");
    printf("Enter the Roll Numbner : ");
    scanf("%d", &p1->rollno);
    printf("Enter the Name : ");
    scanf("%s", p1->name);
    printf("Enter the Percentage : ");
    scanf("%f", &p1->percentage);
    printf("The Stuudent Detaill as Follows : \n");
    printf("Roll Number : %d \n", p1->rollno);
    printf("Name : %s \n", p1->name);
    printf("Percentage : %f \n", p1->percentage);
    return 0;
}