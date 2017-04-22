package koneksi;



import java.sql.*;
import javax.swing.JOptionPane;
 
public class koneksi {
 
Connection Connect = null;
/** Creates a new instance of Koneksi */
public koneksi() {
}
public Connection getCn() {
    try{
    Connect=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Gagal Koneksi");
    }
return Connect;
} 
}