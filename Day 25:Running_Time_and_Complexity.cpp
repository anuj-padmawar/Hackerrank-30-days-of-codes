#include <bits/stdc++.h>
using namespace std;

bool primeornot(int n)
{

    int i,sqr;
    if(n==1)
    {
        return false;
    }
    if(n==2)
    {
        return true;
    }
    sqr=sqrt(n);
    for(i=2;i<=sqr;++i )
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
}

int main() 
{
    int n;
    bool f;
    cin>>n;
    
    int arr[n];
    for(int i=0;i<n;++i)
    {
        cin>>arr[i];
        bool f=primeornot(arr[i]);
        
        if(f)
        {
            cout<<"Prime"<<endl;
        }
        else
        {
            cout<<"Not prime"<<endl;
        }
    }    
    return 0;
}


