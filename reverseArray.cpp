#include<iostream>
using namespace std;
int main(){
    int arr[] = {1,2,3,4};
    int size = sizeof(arr)/sizeof(arr[0]);
    int arr1[size];
    for(int i=0;i<size;i++){
         arr1[i] =  arr[size-i-1]  ;
    }
   
   for(int i=0;i<size;i++){
       cout<<arr1[i];
   }
    return 0;
}
