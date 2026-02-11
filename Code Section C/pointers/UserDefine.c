#include <stdio.h>
int add(int a, int b)
{
    return a + b;
}
int sub(int a, int b)
{
    return a - b;
}
typedef int (*funptr)(int, int);

int main()
{
    funptr ptr = sub;
    printf("%d", ptr(3, 4));
    return 0;
}
