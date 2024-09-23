/*#include <iostream>
using namespace std;

int main()
{
    char ch;

    cin>>ch;

    string vowels = "aeiou";
    int flag = 0;
    for(int i=0;i<vowels.size();i++){
        if(ch == vowels[i]){
            flag = 1;
        }
    }
    if(flag == 0){
        cout<<"not a vowel";
    }
    else{
        cout<<"Vowel";
    }
    return 0;
}*/


/*#include <iostream>
using namespace std;

int main(){

    int amount;
    cin>>amount;
    int temp =amount;
    int notes = 0;

    while(amount != 0){
        if(amount >=2000){
            notes+=amount/2000;
            amount = amount%2000;
        }
        if(amount >=500){
            notes+=amount/500;
            amount = amount%500;
        }
        else if(amount >= 100){
            notes+=amount/100;
            amount = amount%100;
        }
        else if(amount >= 50){
            notes+=amount/50;
            amount = amount%50;
        }
        else if(amount >= 20){
            notes+=amount/20;
            amount = amount%20;
        }
        else if(amount >= 10){
            notes+=amount/10;
            amount = amount%10;
        }
        else if(amount >= 5){
            notes+=amount/5;
            amount = amount%5;
        }
        else if(amount >= 2){
            notes+=amount/2;
            amount = amount%2;
        }
        else{
            notes+=amount/1;
            amount = amount%1;
        }
    }

    cout<<notes;


    return 0;
}*/


// #include <iostream>
// using namespace std;

// int main(){
//     int i=30;
//     int sum =0;
//     while(i<=90){
//         if(i%2 !=0){
//             sum += i;
//         }
//         i++;
//     }
//     cout<<sum;
//     return 0;
// }



// #include <iostream>
// using namespace std;

// int main(){


//     int i=1;
//     float product = 1;
//     while(i<=10){
//         product*=(2*i);
//         i++;
//     })
//     cout<<product;
//     return 0;
// }



