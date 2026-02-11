#include <stdio.h>
int main()
{
    int a = 10;
    int *p = &a;
    printf("Value of a = %d\n", a);
    printf("Address of a = %p\n", &a);
    printf("Pointer p stores = %p\n", p);
    printf("Value at address p = %d\n", *p);
    return 0;
}
