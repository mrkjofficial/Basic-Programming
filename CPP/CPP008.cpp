/* 08. Program to find even/odd number using Modulus operator */

#include <iostream>
using namespace std;

int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;
    if (num % 2)
    {
        cout << num << " is an odd number.";
    }
    else
    {
        cout << num << " is an even number.";
    }
}