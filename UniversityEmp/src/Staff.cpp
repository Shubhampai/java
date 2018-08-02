
#include<string>
#include<iostream>
#include "Staff.h"
using namespace std;

Staff::Staff(string fname, string lname)
{
    cout<<"OUTPUT: "<<endl;
    cout<< "First name: "<< fname << endl;
    cout<< "Last name: "<< lname << endl;
}

Staff::~Staff()
{
    cout<< "Staff object destroyed" <<endl;
}
