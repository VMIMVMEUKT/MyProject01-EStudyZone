#include<iostream>
using namespace std;
class test
{
	int no;
	static int count;
	public:
		void getno(void);
		void dispno(void);
		static void dispcount(void);
};
void test :: getno(void)
{
	no=++count;
}
void test :: dispno()
{
	cout<<"\nNo=\n"<<no;
}
void test :: dispcount()
{
	cout<<"Count="<<count;
}
int main()
{
	test a,b;
	a.dispcount();
	a.getno();
	a.dispcount();
	test :: dispcount();
	b.getno();
	test :: dispcount();
	a.dispno();
	b.dispno();
    return 0;
}
