public class FormatoAdapter implements MediaPlayer{
	 private MediaPackage media;
	 public FormatoAdapter(MediaPackage m){
	    media=m;
	 }
	 @Override
	 public void tocar(String nomeArquivo){
	   System.out.print("Usando o Adaptador: ");
	   media.tocarArquivo(nomeArquivo);
	 }
}