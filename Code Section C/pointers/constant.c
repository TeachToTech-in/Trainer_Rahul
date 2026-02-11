#include <stdio.h>
int main()
{
    int const x;
    int a = 10, b = 20;
    int const *p = &a;
    p = &b; // Allow to Change The Content of Pointer Called  Pointer  to Constant
    printf("Value of a = %d\n", a);
    *p = 30; // The data cannot be changed using the pointer.
    printf("Value of a = %d\n", a);
    // x = 20;
    return 0;
}