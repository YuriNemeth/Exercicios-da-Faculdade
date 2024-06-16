import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ProgramaDesafio {
	public static void main(String[] args){
	
		String tam = JOptionPane.showInputDialog("Escolha o tamanho do Estoque:");
		int Tamanho = Integer.parseInt(tam);
		
		int TV = Tamanho - 1;
		int[] Cod = new int[TV];
		String[] Nome = new String[TV];
		String[] Desc = new String[TV];
		double[] Preco = new double[TV];
		int[] QT = new int[TV];
		String lista = "";
		int Pesquisa;
		
		String opcao = JOptionPane.showInputDialog("escolha uma opção: Add Prod(1), Listar Prod(2), Buscar Prod(3), Atualizar QT(4).");
		int menu = Integer.parseInt(opcao);
		
			while (menu < 1 || menu > 4) {
				String Opcao = JOptionPane.showInputDialog("Opção Inválida. Selecione: Add Prod(1), Listar Prod(2), Buscar Prod(3), Atualizar QT(4).");
				int Menu = Integer.parseInt(Opcao);
				menu = Menu;
			}
			
			while (menu > 0 || menu < 6){
				
				int i = (Tamanho - TV) - 1;
				switch (menu) {
					case 1:

						if(i<=TV){
							JOptionPane.showMessageDialog(null, "Vamos Cadastrar um produto.");

							Nome[i] = JOptionPane.showInputDialog("Nome: ");
							Desc[i] = JOptionPane.showInputDialog("Descrição: ");
							Preco[i] = Double.parseDouble(JOptionPane.showInputDialog("Preço: "));
							QT[i] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque: "));
							Cod[i] = Integer.parseInt(JOptionPane.showInputDialog("Código do produto: "));
							JOptionPane.showMessageDialog(null, "Produto: " +Nome[i]+ "cadastrado.");
						}
						else{
							JOptionPane.showMessageDialog(null, "Espaço insuficiente");
						}
						lista += Cod[i]+ " - " +Nome[i]+ " | " +Desc[i]+ " | R$:" +Preco[i]+ " | " +QT[i]+ "\n";

						Tamanho++;

					break;
					case 2:
						JOptionPane.showMessageDialog(null, "Vamos Listar os produtos.");
						JOptionPane.showMessageDialog(null, lista);

					break;
					case 3:
						JOptionPane.showMessageDialog(null, "Vamos Buscar o produto.");

						Pesquisa = Integer.parseInt(JOptionPane.showInputDialog("DIgite o código do produto: "));

						for(int c = 0; c < i ; c++){
							if(Cod[c] == Pesquisa){
								JOptionPane.showMessageDialog(null, "Produto "  + Cod[c] + ": " + Nome[c] + ", " + Desc[c] + ", " + Preco[c] + ". " + QT[c]);
							}
						}

					break;
					case 4:
						JOptionPane.showMessageDialog(null, "Vamos Atualizar a quantidade.");

						Pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do produto?: "));

						for(int c = 0; c < i ; c++){
							if(Cod[c] == Pesquisa){	
								QT[c] = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade?: "));
							}

						lista += Cod[c]+ " - " +Nome[c]+ " | " +Desc[c]+ " | " +Preco[c]+ " | " +QT[c]+ "\n";
						}

					break;
					case 5:
						JOptionPane.showMessageDialog(null,"Vamos Remover um produto.");
						lista = "";
						Pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do produto: "));
						for(int c = 0; c < i ; c++){
							if(Cod[c] == Pesquisa){	
								Cod[c] = 0;
								Nome[c] = "";
								Desc[c] = "";
								Preco[c] = 0;
								QT[c] = 0;
							}
							else{
								continue;
							} if (Cod[c] != 0) {
								lista += Cod[i] +" - " + Nome[i] + " | " +  Desc[i] + " | " + Preco[i] + " | " + QT[i] + "\n";
							}
						}
					break;
				}

				String opcap = JOptionPane.showInputDialog("escolha uma op��o: Add Prod(1), Listar Prod(2), Buscar Prod(3), Atualizar QT(4), Remover(5), Sair(6).");
				int mn = Integer.parseInt(opcap);
				menu = mn;
				if (mn == 6){
					break;
				}
			
				while (mn < 1 || mn > 6) {
					String Opcao = JOptionPane.showInputDialog("Op��o Inv�lida. Selecione: Add Prod(1), Listar Prod(2), Buscar Prod(3), Atualizar QT(4), Remover(5), Sair(6).");
					int Menu = Integer.parseInt(Opcao);
					mn = Menu;
				}
			}
	}
}

