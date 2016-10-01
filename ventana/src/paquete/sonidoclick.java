package paquete;

import java.applet.AudioClip;

public class sonidoclick {
	
public sonidoclick(){
	
	AudioClip audio;
	audio= java.applet.Applet.newAudioClip(getClass().getResource("/paquete/rec_start.wav"));
	audio.play();

	}
}