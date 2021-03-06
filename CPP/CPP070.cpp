/* 70. Program to check whether a given string is alphanumeric or not */

#include <iostream>
using namespace std;

bool isAlphaNumeric(string);
int main()
{
    string str;
    cout << "Enter a String: ";
    getline(cin, str);
    cin.sync();
    if (isAlphaNumeric(str))
    {
        cout << "The string is AlphaNumeric!" << endl;
    }
    else
    {
        cout << "The string is not AlphaNumeric!" << endl;
    }
}

bool isAlphaNumeric(string str)
{
    bool flag = true;
    for (int i = 0; i < str.length(); i++)
    {
        if (!isalnum(str[i]))
        {
            flag = false;
            break;
        }
    }
    return flag;
}