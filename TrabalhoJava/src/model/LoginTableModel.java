package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.ClienteModel;

public class LoginTableModel extends AbstractTableModel {

    private ArrayList<Usuario> linhas;
    String[] colunas;

    public LoginTableModel(ArrayList<Usuario> arraylogin, String[] colunas) {
        this.colunas = colunas;
        linhas = arraylogin;
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
        Usuario login = (Usuario) linhas.get(row);
        switch (col) {
            case 0:
                return login.getUSU_ID();
            case 1:
                return login.getUSU_LOGIN();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<Usuario> login) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(login);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}