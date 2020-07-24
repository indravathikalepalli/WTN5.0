package com.wipro.mettl.l3;
/*Find Password (stable unstable)*/
public class Ex3 {
	int [] a= new int[5];
	a[0]=input1;
	a[2]=input3;
	a[3]=input4;
	a[4]=input5;
	int s=0;
	int ss=0;
	int us=0;
	for(int i=0;i<5;i++){
		int b[]=new int[10];
		int tem=a[i];
		while(a[i]>0){
			int rem=a[i]%10;
			b[rem]++;
			a[i]=a[i]/10;
		}
		int flag=0;
		int f=0;
		for(int z=0;z<10;z++){
				if(f<b[z]){
					f=b[z];
				}
			}
		for(int j=0;j<10;j++){
			if(b[j]>0){
				if(f!=b[j]){
					us+=tem;
					flag=1;
					break;
				}
			}
			
		}
		if(flag==0){
		ss+=tem;
		}
	}
	s=ss-us;
	return s;
}
