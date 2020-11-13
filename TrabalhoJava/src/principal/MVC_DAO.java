/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.ParseException;
import view.LoginView;

public class MVC_DAO {
    LoginView objLogin;

    public MVC_DAO() throws ParseException {
        objLogin = new LoginView();
    }

    public static void main(String[] args) throws ParseException {
        MVC_DAO mvc_dao = new MVC_DAO();
    }

}
