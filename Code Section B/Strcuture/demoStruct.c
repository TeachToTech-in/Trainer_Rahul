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
    printf("Enter the Student Details \n");
    printf("Enter the Roll Numbner : ");
    scanf("%d", &s1.rollno);
    printf("Enter the Name : ");
    scanf("%s", s1.name);
    printf("Enter the Percentage : ");
    scanf("%f", &s1.percentage);
    printf("The Stuudent Detaill as Follows : \n");
    printf("Roll Number : %d \n", s1.rollno);
    printf("Name : %s \n", s1.name);
    printf("Percentage : %f \n", s1.percentage);
    return 0;
}