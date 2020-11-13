package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.FornecedorModel;

public class PagarTableModel extends AbstractTableModel {

    private ArrayList<PagarModel> linhas;
    String[] colunas;

    public PagarTableModel(ArrayList<PagarModel> arraypagar, String[] colunas) {
        this.colunas = colunas;
        linhas = arraypagar;
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
        PagarModel pagar = (PagarModel) linhas.get(row);
        switch (col) {
            case 0:
                return pagar.getPAG_ID();
            case 1:
                return pagar.getPAG_BOLETO();
            case 2:
                return pagar.getPAG_FINIDFK();
            case 3:
                return pagar.getPAG_FORNECIDFK();                
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<PagarModel> pagar) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(pagar);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}