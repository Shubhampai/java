#include<string>
#include<iostream>
#include "Stud.h"

Stud::Stud(string fname, string lname, int age, int contact)
{
    cout<< "OUTPUT: " << endl << "First Name: " << fname << endl << "Last Name: " << lname << endl<< "Age: " << age << endl << "Contact: " << contact << endl;
}

Stud::~Stud()
{
    cout<< "Student object destroyed" <<endl;
}
