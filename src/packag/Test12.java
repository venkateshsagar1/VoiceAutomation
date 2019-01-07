package packag;

import java.util.Scanner;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Test12 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Text");
		String x=sc.nextLine();
		
		//convert into voice
		VoiceManager vm=VoiceManager.getInstance();
		Voice c=vm.getVoice("kevin");
		c.allocate();
		c.speak(x);
		c.deallocate();

	}

}
