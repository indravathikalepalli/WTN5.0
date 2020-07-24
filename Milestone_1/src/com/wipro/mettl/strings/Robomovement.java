package com.wipro.mettl.strings;

public class Robomovement {
	String f="";
	String [] s=input4.split(" ");
	String [] d=input3.split("-");
	int x=Integer.valueOf(d[0]);
	int y=Integer.valueOf(d[1]);
	int o;
	if(d[2].equals("N")||d[2].equals("S")){
		 o=input2;
	}
	else{
		 o=input1;
	}
	for(int i=0;i<s.length;i++){
		if(s[i].equals("R")){
			if(d[2].equals("E")){
				d[2]="S";
				o=input2;
			}
			else if(d[2].equals("S")){
				d[2]="W";
				o=input1;
			}
			else if(d[2].equals("W")){
				d[2]="N";
				o=input2;
			}
			else{
				d[2]="E";
				o=input1;
			}
		}
		else if(s[i].equals("L")){
			if(d[2].equals("E")){
				d[2]="N";
				o=input2;
			}
			else if(d[2].equals("N")){
				d[2]="W";
				
				o=input1;
			}
			else if(d[2].equals("W")){
				d[2]="S";
				
				o=input2;
			}
			else{
				d[2]="E";
				
				o=input1;
			}
		}
		else{
			if(d[2].equals("E")){
				x=x+1;
				if((x)>o){
					x=(x-1);
					f=String.valueOf(x)+"-"+String.valueOf(y)+"-"+d[2]+"-"+"ER";
					return f;
				}
			}
			else if(d[2].equals("N")){
				y=y+1;
				if((y)>o){
					y=(y)-1;
					f=String.valueOf(x)+"-"+String.valueOf(y)+"-"+d[2]+"-"+"ER";
					return f;
				}
			}
			else if(d[2].equals("W")){
				x=x-1;
				if((x)<0){
					x=x+1;
					f=String.valueOf(x)+"-"+String.valueOf(y)+"-"+d[2]+"-"+"ER";
					return f;
				}
			}
			else{
				y=y-1;
				if((y)<0){
					y=y+1;
					f=String.valueOf(x)+"-"+String.valueOf(y)+"-"+d[2]+"-"+"ER";
					return f;
				}
			}
		}
	}
	f=String.valueOf(x)+"-"+String.valueOf(y)+"-"+d[2];
	return f;
}
