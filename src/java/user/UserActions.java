package user;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Arrays;

public class UserActions {
    public static Connection getConnection(){
        
        String url="jdbc:mysql://localhost:3306/TacoMaster_DB?user=root&password=root";
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return con;
    }
    
    public static int Loguear(User e){
        int status = 0;
        try{
            Connection con = UserActions.getConnection();

            String q = "select * from musuario where email_mu=? and pass_mu=?";
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, e.getEmail_mu());
            ps.setString(2, e.getPass_mu());
            
            status = ps.executeUpdate();
            con.close();
       
        }catch(SQLException ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        
        }
        return status;
    }
    
    public static int Registrar(User e){
        
        int status = 0;
        
        try{
            
            Connection con = UserActions.getConnection();
            
            String q = "insert into musuario (nom_mu, appat_mu, apmat_mu, birth_mu, tel_mu, cel_mu, email_mu, pass_mu, ) values (?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, e.getNom_mu());
            ps.setString(2, e.getAppat_mu());
            ps.setString(3, e.getApmat_mu());
            ps.setString(4, e.getBirth_mu());
            ps.setString(5, e.getTel_mu());
            ps.setString(6, e.getCel_mu());
            ps.setString(7, e.getEmail_mu());
            ps.setString(8, e.getPass_mu());
            
            status = ps.executeUpdate();
            con.close();
            
            
        }catch(SQLException ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        
        }
        return status;
    }
    
    public static int EliminarCuenta(int id){
        int status = 0;
        try{
            Connection con = UserActions.getConnection();
            String q ="delete from musuario where id =?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            status = ps.executeUpdate();
            con.close();
        
        }catch (SQLException ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        }
        return status;
    }
    
    public static int ActualizarNombre(User e){
        int status = 0;
        try{
            Connection con = UserActions.getConnection();
            String sql= "update musuario set nom_mu = ? "
                    + "where email_mu = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, e.getNom_mu());
            ps.setString(2, e.getEmail_mu());
            
            status = ps.executeUpdate();
            con.close();
        }catch(SQLException ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        
        }
        return status;
    }
    
    public static int ActualizarPassword(User e){
        int status = 0;
        try{
            Connection con = UserActions.getConnection();
            String sql= "update musuario set pass_mu = ? "
                    + "where email_mu = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, e.getPass_mu());
            ps.setString(2, e.getEmail_mu());
            
            status = ps.executeUpdate();
            con.close();
        }catch(SQLException ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        
        }
        return status;
    }
    
    public static int GuardarDireccion(User e){
        int status = 0;
        try{
            Connection con = UserActions.getConnection();
            String sql= "insert into MDireccionEntrega set ciudad = ?, "
                    + "colonia = ?, "
                    + "calle = ?, "
                    + "cp = ?, "
                    + "no_int = ?, "
                    + "no_ext = ? "
                    + "where email_mu = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, e.getCiudad());
            ps.setString(2, e.getColonia());
            ps.setString(3, e.getCalle());
            ps.setInt(4, e.getCp());
            ps.setInt(5, e.getNo_int());
            ps.setInt(6, e.getNo_ext());
            ps.setString(7, e.getEmail_mu());
            
            status = ps.executeUpdate();
            con.close();
        }catch(SQLException ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        }
        return status;
    }
    
    public static int EliminarDireccion(User e){
        int status = 0;
        try{
            Connection con = UserActions.getConnection();
            String sql= "delete from MDireccionEntrega"
                    + "where email_mu = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, e.getNom_mu());
            ps.setString(2, e.getPass_mu());
            ps.setString(3, e.getEmail_mu());
            
            status = ps.executeUpdate();
            con.close();
        }catch(SQLException ed){
            System.out.println("No conecto a la tabla");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
        }
        return status;
    }
}