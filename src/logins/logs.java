package logins;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class logs {
	
	private String Senha;
	private String Usuario;
	
	
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha2) {
		Senha = senha2;
	}
	
	
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	
	public void validacao() {
		
		if(Usuario == null || Senha == null) {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos");
		}
	}
	

}
