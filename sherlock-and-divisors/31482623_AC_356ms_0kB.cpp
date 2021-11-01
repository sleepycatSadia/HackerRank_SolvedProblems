#include <bits/stdc++.h>
 using namespace std;
// function to print the divisors
int count(int n)
{
        int count=0;
        for(long i=2;i<=sqrt(n);i++){
            if(n%i==0 && i%2==0)
                count++;
            if(n%(n/i)==0 && ((n/i)!=i) && ((n/i)%2==0))
                count++;
        }
        if(n%2==0)
            count++;
      
      return count;
}
 
/* Driver program to test above function */
int main()
{
    int t;
    int n;
    cin>>t;
   for(int y=1;y<=t;y++){
        int num;
        cin>>num;
        n=count(num);
        cout<< n<<"\n";
    
    }
 
    return 0;
}
