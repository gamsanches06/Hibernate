package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.FornecedorModel;

public class FornecedorTableModel extends AbstractTableModel {

    private ArrayList<FornecedorModel> linhas;
    String[] colunas;

    public FornecedorTableModel(ArrayList<FornecedorModel> arrayusuario, String[] colunas) {
        this.colunas = colunas;
        linhas = arrayusuario;
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
        FornecedorModel fornecedor = (FornecedorModel) linhas.get(row);
        switch (col) {
            case 0:
                return fornecedor.getFORNEC_ID();
            case 1:
                return fornecedor.getFORNEC_NOME();
            case 2:
                return fornecedor.getFORNEC_RAZSOCIAL();
            case 3:
                return fornecedor.getFORNEC_CNPJ();                
            case 4:
                return fornecedor.getFORNEC_EMAIL();                
            case 5:
                return fornecedor.getFORNEC_DDD();                
            case 6:
                return fornecedor.getFORNEC_TELEFONE();                
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<FornecedorModel> usuario) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(usuario);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}