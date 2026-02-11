#include <stdio.h>
int main()
{
    const int a = 10;
    printf("%d\n", a);
    a = 20; // NOT ALLOWED TO OVERWRTE THE VALUE HENCE IT IS CONTANT VARIABLE
    printf("%d\n", a);
    return 0;
}