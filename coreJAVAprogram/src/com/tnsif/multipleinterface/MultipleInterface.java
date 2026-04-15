package com.tnsif.multipleinterface;

interface Camera{
	void takePhoto();
}
interface MusicPlayer{
	void playmusic();
}
class Smartphone implements Camera,MusicPlayer{


@Override
public void playmusic() {
	// TODO Auto-generated method stub
	System.out.println("music is playing");
}

@Override
public void takePhoto() {
	// TODO Auto-generated method stub
	System.out.println("photo is taken");
}
}
public class MultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Smartphone s = new Smartphone();
s.takePhoto();
s.playmusic();
	}

}