#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int calculate(char *s);
int main()
{
    
}
int calculate(char *s)
{

    int result = 0;
    int number = 0;
    int sign = 1;

    int stack[100];
    int top = -1;

    for (int i = 0; s[i] != '\0'; i++)
    {

        if (s[i] >= '0' && s[i] <= '9')
        {
            number = number * 10 + (s[i] - '0');
        }

        else if (s[i] == '+')
        {
            result += sign * number;
            number = 0;
            sign = 1;
        }

        else if (s[i] == '-')
        {
            result += sign * number;
            number = 0;
            sign = -1;
        }

        else if (s[i] == '(')
        {
            stack[++top] = result;
            stack[++top] = sign;
            result = 0;
            sign = 1;
        }

        else if (s[i] == ')')
        {
            result += sign * number;
            number = 0;

            result *= stack[top--];
            result += stack[top--];
        }
    }

    result += sign * number;
    return result;
}