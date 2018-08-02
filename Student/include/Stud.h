#ifndef STUD_H
#define STUD_H
#include<string>
using namespace std;
class Stud
{
    protected:
        string fname,lname;
        int age,contact;

    public:
        Stud();
        ~Stud();
        Stud(string fname, string lname, int age, int contact);
         string getfname() { return this->fname; }
       string getlname() { return this->lname; }
       int getage(){return this->age;}
       int getcontact(){return this-> contact;}


};

#endif // STUD_H
