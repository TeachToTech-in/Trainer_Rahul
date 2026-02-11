#include <stdio.h>
int main()
{
    int a = 10;
    int b = 20;
    // const int *p = &a;
    int const *p = &a;
    printf("%d\n", a);
    printf("%d\n", *p);
    printf("%p\n", &a);
    printf("%p\n", p);
    p = &b;  // content of p changed
    a = 30;  // content of a changed
    *p = 20; // Through Pointer We are not allow to override the value of a (Pointer to constant)
    printf("%d\n", a);
    printf("%d\n", *p);
    printf("%p\n", &a);
    printf("%p\n", p);

    return 0;
}