#include <stdio.h>
int add(int a, int b)
{
    return a + b;
}
int sub(int a, int b)
{
    return a - b;
}
int main()
{
    int (*fptr)(int, int); // declare function pointer
    fptr = add;
    fptr = sub;              // assign function address
    int result = fptr(5, 7); // calling function using pointer
    printf("Result = %d", result);
    return 0;
}
