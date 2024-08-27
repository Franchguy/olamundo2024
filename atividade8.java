import javax.swing.JOptionPane;

public class atividade8{
    public static void main(String[] args) {
        double cincoCentavos = 0.5;
        double dezCentavos = 0.10;
        double vinte_e_cincoCentavos = 0.25;
        double cinquentaCentavos = 0.50;
        double umReal = 1.00;
        double doisReais = 2.00;
        double cincoReais = 5.00;
        double dezReais = 10.00;
        double vinteReais = 20.00;
        double cinquentaReais = 50.00;
        double cemReais = 100.00;

        String valorProdutoStr = JOptionPane.showInputDialog(null, "Digite o valor do produto: ");
        double valorProduto = Double.parseDouble(valorProdutoStr);

        String dinheiroStr = JOptionPane.showInputDialog(null, "Digite o dinheiro que você possui: ");
        double dinheiro = Double.parseDouble(dinheiroStr);

        if(valorProduto > dinheiro){
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a compra!");
        }

        double troco = dinheiro - valorProduto;
        
        
    }
}