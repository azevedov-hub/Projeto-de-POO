package banco;
import java.sql.*;




public class App {
	
	static final String URL = "jdbc:sqlite:sistema.db";
	
	public void iniciarBanco() {  
		try (Connection conn = DriverManager.getConnection(URL)) {      
			System.out.println("Conectado ao SQLite!"); 
			
			// os próximos trechos entram aqui 
			
					String sqlTabela = "CREATE TABLE IF NOT EXISTS logins ("
										+"id INTEGER PRIMARY KEY AUTOINCREMENT,"
										+"nome TEXT NOT NULL,"
										+"usuario TEXT NOT NULL,"
										+"senha TEXT NOT NULL)";
					try(Statement st = conn.createStatement()){
						st.executeUpdate(sqlTabela);
						System.out.println("Tabela criada");
					}
					
					String sqlInsert = "INSERT INTO logins (nome, usuario, senha) VALUES (?, ?, ?)" ;
					
					try(PreparedStatement ps = conn.prepareStatement(sqlInsert)){
						
						ps.setString(1,"Admin");
						ps.setString(2, "Poderes_do_ADM");
						ps.setString(3,"Aura_Maxima6767");
						ps.executeUpdate();
						
					}
			
			
		  } catch (SQLException e) { 
		            System.out.println("Erro: " + e.getMessage());
		  } 	    
	} 
	
}
