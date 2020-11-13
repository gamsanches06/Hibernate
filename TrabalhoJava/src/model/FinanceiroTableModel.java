package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.ClienteModel;

public class FinanceiroTableModel extends AbstractTableModel {

    private ArrayList<FinanceiroModel> linhas;
    String[] colunas;

    public FinanceiroTableModel(ArrayList<FinanceiroModel> arrayfinanceiro, String[] colunas) {
        this.colunas = colunas;
        linhas = arrayfinanceiro;
    }

    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamnho da lista
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        FinanceiroModel financeiro = (FinanceiroModel) linhas.get(row);
        switch (col) {
            case 0:
                return financeiro.getFIN_ID();
            case 1:
                return financeiro.getFIN_NUMERO();
            case 2:
                return financeiro.getFIN_EMISSAO();
            case 3:
                return financeiro.getFIN_VENCIMENTO();                
            case 4:
                return financeiro.getFIN_PAGAMENTO();                
            case 5:
                return financeiro.getFIN_VALOR();                
            case 6:
                return financeiro.getFIN_JUROS();                
            case 7:
                return financeiro.getFIN_MULTA();                
            case 8:
                return financeiro.getFIN_DESCONTO();                
            case 9:
                return financeiro.getFIN_TOTAL();                
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<FinanceiroModel> financeiro) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(financeiro);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}