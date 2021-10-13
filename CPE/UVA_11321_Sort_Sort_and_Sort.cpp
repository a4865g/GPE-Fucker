#include <iostream>
#include <algorithm>
using namespace std;

int n,m;

int isOdd(int num){
	num=abs(num%2);
	return num;
}

bool cmp(int a,int b){
	if(a%m!=b%m) return a%m < b%m;
	if(isOdd(a)!=isOdd(b)) return isOdd(a);
	if(isOdd(a))return a>b;
	return a<b;
}

int main(){
	int a[1001];
	while(cin>>n>>m){
		cout<<n<<" "<<m<<endl;
		for(int i=0;i<n;i++){
			cin>>a[i];
		}
		sort(a,a+n,cmp);
		for(int i=0;i<n;i++){
			cout<<a[i]<<endl;
		}
	}
	return 0;
}
