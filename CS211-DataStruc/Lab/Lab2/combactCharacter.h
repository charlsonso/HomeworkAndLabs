//Charlson So 
//Kevin Williams
//CS211
#include <iostream>
#include "character.h"
#include <string>
using namespace std;

class CombatCharacter: public Character{
	
	private: 
			Character player;
			string wname;
			int wstrength;
			string sname;
			int sstrength;

	public:
			CombatCharacter(Character&);
			void useWeapon();
			void getAttacked();
			void saveAnotherCharacter();
			void reloadWeapon();
			bool noHealth();
			void setWeaponNm(string);
			void setShieldNm(string);
			void setWeaponStr(int);
			void setShieldStr(int);
			string getWeaponNm();
			string getShieldNm();
			void displayAttributes();

};


CombatCharacter::CombatCharacter(Character& j){
	player = j;
}


void CombatCharacter::useWeapon(){
	cout<<"USING MY LAZER";
	if(wstrength>0&&player.getHealth()>0){
		double damage=0.05;
	player.injure(damage);
	wstrength-=1;
	cout<<"Lost Weapon Strength and 5% Health";

	}
	else{
		cout<<"This player cannot attack";
	}

}


void CombatCharacter::getAttacked(){
	if(sstrength>0){
		sstrength-=1;

	}
	else{
		double decrease = .15;
		player.injure(decrease);
	}
}


void CombatCharacter::saveAnotherCharacter(){
	if (player.getHealth()>0){
	double s=0.2;
	double h=0.05;
	player.takeAction(s);
	player.heal(h);
	sstrength+=1;
	}
	else{
		cout<<"Cannot Save Character";
	}
}


void CombatCharacter::reloadWeapon(){
	if(player.getHealth()>0){
	wstrength+=1;
	double k = -0.1;
	player.takeAction(k);
	}
	else{
		cout<<"Player is dead";
	}
}


void CombatCharacter::setWeaponNm(string k){
	wname=k;
}
void CombatCharacter::setShieldNm(string k){
	sname=k;
}
void CombatCharacter::setWeaponStr(int k){
	wstrength=k;
}
void CombatCharacter:: setShieldStr(int k){
	sstrength=k;
}

bool CombatCharacter::noHealth(){
	if(player.getHealth()<=0){
		return false;
	}
	else{
		return true;
	}
}

string CombatCharacter:: getWeaponNm(){
	return wname;
}

string CombatCharacter::getShieldNm(){
	return sname;
}
void CombatCharacter:: displayAttributes(){
	player.displayAttributes();
	cout<<"Weapon Name: "+wname+"\nShield Name:"+sname+"\nWeapon Strength"+to_string(wstrength)+"\nShield Strength"+to_string(sstrength);
}