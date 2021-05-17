package iftm.estruturadedados;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Lista<Contato> vetor = new Lista<Contato>(20);
		LinkedList<Contato> listaEncadeada = new LinkedList<Contato>();

		Contato c1 = new Contato("c1", "111-1111", "c1@email.com.br");
		Contato c2 = new Contato("c2", "222-2222", "c2@email.com.br");
		Contato c3 = new Contato("c3", "333-3333", "c3@email.com.br");
		Contato c4 = new Contato("c4", "444-2344", "c4@email.com.br");
		Contato c5 = new Contato("c5", "555-5585", "c5@email.com.br");
		Contato c6 = new Contato("c6", "111-1911", "c6@email.com.br");
		Contato c7 = new Contato("c7", "222-2322", "c7@email.com.br");
		Contato c8 = new Contato("c8", "333-3333", "c8@email.com.br");
		Contato c9 = new Contato("c9", "454-4644", "c9@email.com.br");
		Contato c10 = new Contato("c10", "515-5235", "c10@email.com.br");
		Contato c11 = new Contato("c11", "131-1411", "c11@email.com.br");
		Contato c12 = new Contato("c12", "252-2672", "c12@email.com.br");
		Contato c13 = new Contato("c13", "313-3433", "c13@email.com.br");
		Contato c14 = new Contato("c14", "433-4334", "c14@email.com.br");
		Contato c15 = new Contato("c15", "535-5355", "c15@email.com.br");
		Contato c16 = new Contato("c16", "161-1516", "c16@email.com.br");
		Contato c17 = new Contato("c17", "272-2272", "c17@email.com.br");
		Contato c18 = new Contato("c18", "383-3993", "c18@email.com.br");
		Contato c19 = new Contato("c19", "141-4949", "c19@email.com.br");
		Contato c20 = new Contato("c20", "565-5565", "c20@email.com.br");
		Contato c21 = new Contato("c21", "616-1611", "c21@email.com.br");
		Contato c22 = new Contato("c22", "212-2121", "c22@email.com.br");
		Contato c23 = new Contato("c23", "131-1331", "c23@email.com.br");
		Contato c24 = new Contato("c24", "424-4444", "c24@email.com.br");
		Contato c25 = new Contato("c25", "565-5555", "c25@email.com.br");
		Contato c26 = new Contato("c26", "111-1611", "c26@email.com.br");
		Contato c27 = new Contato("c27", "282-1252", "c27@email.com.br");
		Contato c28 = new Contato("c28", "323-3433", "c28@email.com.br");
		Contato c29 = new Contato("c29", "544-4464", "c29@email.com.br");
		Contato c30 = new Contato("c30", "155-5455", "c30@email.com.br");

		try {
			// ex5
			vetor.adiciona(c1);
			vetor.adiciona(c2);
			vetor.adiciona(c3);
			vetor.adiciona(c4);
			vetor.adiciona(c5);
			vetor.adiciona(c6);
			vetor.adiciona(c7);
			vetor.adiciona(c8);
			vetor.adiciona(c9);
			vetor.adiciona(c10);
			vetor.adiciona(c11);
			vetor.adiciona(c12);
			vetor.adiciona(c13);
			vetor.adiciona(c14);
			vetor.adiciona(c15);
			vetor.adiciona(c16);
			vetor.adiciona(c17);
			vetor.adiciona(c18);
			vetor.adiciona(c19);
			vetor.adiciona(c20);
			vetor.adiciona(c21);
			vetor.adiciona(c22);
			vetor.adiciona(c23);
			vetor.adiciona(c24);
			vetor.adiciona(c25);
			vetor.adiciona(c26);
			vetor.adiciona(c27);
			vetor.adiciona(c28);
			vetor.adiciona(c29);
			vetor.adiciona(c30);
			// ex3
			vetor.removerT("111-1111");
			//ex4-vetor.RemoverTudo();
			
			System.out.println(vetor);
			// ex1
			System.out.println("Confirmar se o elemento na lista existe:" + vetor.contem(c2));
			// ex2
			System.out.println("Retornar a posicao do elemento, se retornar -1 que dizer que o elemento não existe:"
					+ vetor.indicio(c2));

		} catch (Exception e) {
			e.printStackTrace();
		}

		// ex6
		listaEncadeada.add(c1);
		listaEncadeada.add(c2);
		listaEncadeada.add(c3);
		listaEncadeada.add(c4);
		listaEncadeada.add(c5);
		listaEncadeada.add(c6);
		listaEncadeada.add(c7);
		listaEncadeada.add(c8);
		listaEncadeada.add(c9);
		listaEncadeada.add(c10);
		listaEncadeada.add(c11);
		listaEncadeada.add(c12);
		listaEncadeada.add(c13);
		listaEncadeada.add(c14);
		listaEncadeada.add(c15);
		listaEncadeada.add(c16);
		listaEncadeada.add(c17);
		listaEncadeada.add(c18);
		listaEncadeada.add(c19);
		listaEncadeada.add(c20);
		listaEncadeada.add(c21);
		listaEncadeada.add(c22);
		listaEncadeada.add(c23);
		listaEncadeada.add(c24);
		listaEncadeada.add(c25);
		listaEncadeada.add(c26);
		listaEncadeada.add(c27);
		listaEncadeada.add(c28);
		listaEncadeada.add(c29);
		listaEncadeada.add(c30);

		System.out.println(listaEncadeada);

	}
}