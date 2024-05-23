package Dispositivo;


import Applicativos.AparelhoTelefonico;
import Applicativos.NavegadorNaInternet;
import Applicativos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical,  NavegadorNaInternet, AparelhoTelefonico{

	
  	private String modelo;
	

	public Iphone(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

	@Override
	public void Ligar() {
		System.out.println("LIgando");	
	}

	@Override
	public void Atender() {
		System.out.println("Atender");
		
	}

	@Override
	public void IniciarCorreioVoz() {
		System.out.println("Iniciando um correio de voz");
		
	}

	@Override
	public void ExibirPagina() {
		System.out.println("Exibindo Pagina");
		
	}

	@Override
	public void AdicionarNovaAba() {
		System.out.println("Abrindo Nova aba");
		
	}

	@Override
	public void AtutalizarPagina() {
		System.out.println("Atualizando Pagina");
		
	}

	@Override
	public void Tocar() {
		System.out.println("Tocar musica");
		
	}

	@Override
	public void Pausar() {
		System.out.println("pausar musica");
		
	}

	@Override
	public void SelecionaMusica() {
		System.out.println("Selecinado musica");
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getModelo();
	}

}
