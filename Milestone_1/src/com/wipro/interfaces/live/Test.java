package com.wipro.interfaces.live;
import com.wipro.interfaces.music.Playable;
import com.wipro.interfaces.music.string.Veena;
import com.wipro.interfaces.music.wind.Saxophone;
public class Test {
public static void main(String[] args) {
	Veena v = new Veena();
	Saxophone s= new Saxophone();
	Playable pv= new Veena();
	Playable ps=new Saxophone();
	v.play();
	s.play();
	pv.play();
	ps.play();
}
}
