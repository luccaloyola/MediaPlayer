public class Principal{
	public static void main(String[] args){
		MediaPlayer player=new MP3();
	    player.tocar("arquivo.mp3");
	    player=new FormatoAdapter(new MP4());
	    player.tocar("arquivo.mp4");
	    player=new FormatoAdapter(new VLC());
	    player.tocar("arquivo.avi");
	 }
}