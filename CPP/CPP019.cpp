/* 19. Program to print table of user’s choice */

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    int num;
    cout << "Enter a number to print its table: ";
    cin >> num;
    for (int i = 1; i <= 10; i++)
    {
        cout << num << " x " << setw(2) << setfill('0') << i << " = " << num * i << endl;
    }
}