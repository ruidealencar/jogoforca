import java.util.ArrayList;


public class Dicionario 
{
	private ArrayList<String> palavras = new ArrayList<String> ();
	

	public Dicionario() 
	{
		carregarPalavras();
	}
	private void carregarPalavras() {
		palavras.add("CLASSE");
		palavras.add("OBJETO");
		palavras.add("ATRIBUTO");
		palavras.add("STRING");
		palavras.add("HERANÇA");
		palavras.add("INTERFACE");
		palavras.add("ENCAPSULAMENTO");
		palavras.add("POLIMORFISMO");
		palavras.add("SOBRECARGA");
		palavras.add("SOBRESCRITA");
		
	}

	public Palavra proximaPalavra() {
		int pos = RandomUtils.gerarNumeroRandomico(0, palavras.size());
		String palavraSorteada = palavras.get(pos);
		Palavra palavra = new Palavra(palavraSorteada);
		return palavra;
	}
	
}