//Charlson So 
//Kevin Williams
//CS211
#include <iostream>
#include <string>
using namespace std;

class Character{

	private: 
			string name;
			int height; 
			int weight;

			//-1 is very bad. 1 is very good
			double tendency;
			//percentage 0-1.0
			double health;


	public:
			Character();
			void heal(double&);
			void injure(double&);
			void takeAction(double&);
			void setWeight(int&);
			void setHeight(int&);
			int getWeight();
			int getHeight();
			string getName();
			double getHealth();
			double getTendency();
			void displayAttributes();


};

Character::Character(){
	tendency=0;
	health=1;
	name="Player 1";


}

void Character::heal(double& j){
	do{
	health=health*j+health;
	if(health>1 && health<0){
		cout<<"Try again";
	}
	}while(health>1 && health<0);
}
void Character::injure(double& j){
	do{
	health =health - health*j;
	if(health>1 && health<0){
		cout<<"Try again";
	}

	}while(health>1 && health<0);
}
void Character::takeAction(double& j){
	do{
		tendency+=j;
		if (tendency>1||tendency<-1){
			cout<<"try again";
		}
	}while(tendency>1&&tendency<-1);

}
void Character::setWeight(int& j){
	weight = j;
}
void Character::setHeight(int& j){
	height =j;
}
string Character::getName(){
	return name;
}
double Character::getHealth(){
	return health;
}
double Character::getTendency(){
	return tendency;
}
void Character::displayAttributes(){
	cout<<"Name: "+name+"\nHeight"+to_string(height)+"\nWeight"+to_string(weight)+"\nTendency"+to_string(tendency)+"\nHealth:"+to_string(health);
}
