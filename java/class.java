#include <iostream>
#include <string>
using namespace std;
class Myclass
{
public:
int ernum;
string sname;
string address;
};

int main()
{
	Myclass data;
	
	data.ernum = 508;
	data.sname= "vaidik";
	data.address= "surat";
 
	cout<<data.ernum<<endl;
	cout<<data.sname<<endl;
	cout<<data.address<<endl;

	return 0;

}
