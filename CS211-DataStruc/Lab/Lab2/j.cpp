//Charlson So 
//Kevin Williams
//CS211

#include "combactCharacter.h"
#include <iostream>
#include <string>
using namespace std;

int main(){
	Character a;
	int l;
	cout<<"Set Height:";
	cin>>l;
	a.setHeight(l);
	cout<<"set weight";
	cin>>l;
	a.setWeight(l);


	CombatCharacter v(a);

	cout<<"Weapon Name\n";
	string t;
	cin>>t;
	v.setWeaponNm(t);
	cout<<"Shield Name\n";
	cin>>t;
	v.setShieldNm(t);

	cout<<"Set Weapon Strength(1-10)";
	cin>>l;
	v.setWeaponStr(l);
	cout<<"Set Shield Strength (1-10)";
	cin>>l;
	v.setShieldStr(l);

	


	cout<<v.getWeaponNm();
	cout<<v.getShieldNm();
	v.useWeapon();
	v.displayAttributes();


	v.getAttacked();
	v.displayAttributes();
			v.saveAnotherCharacter();
			v.reloadWeapon();
	v.displayAttributes();

}	

	
