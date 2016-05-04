package escuela;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Procesos {

    public void Agregar(Alumno al) {
        ConexionBD c1 = new ConexionBD();
        try {
            Statement consulta = c1.getConnection().createStatement();
            String sql = "INSERT INTO tablaalumnos VALUES('" + al.numeroC + "', '" + al.nombre + "', '" + al.apellido + "')";
            consulta.executeUpdate(sql);
            System.out.println("Alumno Registrado");
            consulta.cancel();
            c1.desconectar();

        } catch (SQLException ex) {
            System.out.println("Error en el programa" + ex.getMessage());
        }

    }

    public ArrayList<Alumno> obtenAlumno() {
        ArrayList<Alumno> Al1 = new ArrayList<>();
        ConexionBD conn = new ConexionBD();
        String sql = "SELECT * FROM tablaalumnos";

        PreparedStatement st;
        try {
            st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Alumno Alu = new Alumno(rs.getString("numeroC"), rs.getString("nombre"), rs.getString("apellido"));
                Al1.add(Alu);
            }
            rs.close();
            st.close();
            conn.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());

        }
        return Al1;
    }
}
