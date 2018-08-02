#ifndef STAFF_H
#define STAFF_H
#include<string>

using namespace std;


class Staff
{
    protected:
string fname;
string lname;

    public:
        Staff();
       ~Staff();
       Staff(string fname,string lastname);
       string getfname() { return this->fname; }
       string getlname() { return this->lname; }




};

#endif // STAFF_H
