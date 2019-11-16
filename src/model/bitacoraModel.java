package model;

//Librerías importadas
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class bitacoraModel {

    //Variables de conexion a base de datos
    private Connection cn;
    private ResultSet rs;
    private Statement st;
    public static int count;

    public bitacoraModel() {
        String confirm = "bitacora";
        bdLocal(confirm);
    }

    //Metodo para cambiar de base de datos
    public void bdLocal(String confirm) {
        //Conexion a base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
            if (confirm.equals("bitacoraLocal")) {
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + confirm + "", "root", "machip3r");
            } else {
                cn = DriverManager.getConnection("jdbc:mysql://192.168.1.68:3306/" + confirm + "", "mac", "mac");
            }
        } catch (Exception e) {
        }
    }

    //Metodo para insertar un registro en la bitacora
    public void insertBitacora(String no_control, String alumno, String id_equipo, int id_docente, String laboratorio, String observacion) throws SQLException {
        try {
            String id_alumno = getIdAlumno(no_control);
            st = cn.createStatement();
            String sql = "insert into bitacora(id_alumno, id_equipo, id_docente, laboratorio, observacion) "
                    + "values(" + id_alumno + ", " + id_equipo + ", " + id_docente + ", '" + laboratorio + "', "
                    + "UPPER('" + observacion + "')) ";
            st.executeUpdate(sql);
        } catch (Exception e) {
            try {
                String confirm = "bitacoraLocal";
                bdLocal(confirm);
                String id_alumno = getIdAlumno(no_control);
                st = cn.createStatement();
                String sql = "insert into bitacora(id_alumno, id_equipo, id_docente, laboratorio, observacion) "
                        + "values(" + id_alumno + ", " + id_equipo + ", " + id_docente + ", '" + laboratorio + "', "
                        + "UPPER('" + observacion + "')) ";
                String sql2 = "insert into bug(bug, modulo) values('" + e + "', 'Hubo un error al insertar un registro en la bitacora, bitacoraModel') ";
                st.executeUpdate(sql);
                st.executeUpdate(sql2);
            } catch (Exception ex) {
                System.exit(0);
            }
        }
    }

    //Metodo para insertar un alumno
    public void insertAlumno(int id_grupo, String no_control, String alumno) {
        try {
            st = cn.createStatement();
            String sql = "insert into alumno(id_grupo, no_control, alumno) values(" + id_grupo + ", '" + no_control + "', UPPER('" + alumno + "')) ";
            st.executeUpdate(sql);
        } catch (Exception e) {
            try {
                String confirm = "bitacoraLocal";
                bdLocal(confirm);
                st = cn.createStatement();
                String sql = "insert into alumno(id_grupo, no_control, alumno) values(" + id_grupo + ", '" + no_control + "', UPPER('" + alumno + "')) ";
                String sql2 = "insert into bug(bug, modulo) values('" + e + "', 'Hubo un error al insertar un nuevo alumno, bitacoraModel') ";
                st.executeUpdate(sql);
                st.executeUpdate(sql2);
            } catch (Exception ex) {
                System.exit(0);
            }
        }
    }

    //Metodo para obtener el id del alumno
    public String getIdAlumno(String no_control) {
        String id = "";
        try {
            st = cn.createStatement();
            String sql = "select id_alumno from alumno where no_control='" + no_control + "' ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                id = rs.getString(1);
            }
        } catch (Exception e) {
            try {
                String confirm = "bitacoraLocal";
                bdLocal(confirm);
                st = cn.createStatement();
                String sql = "select id_alumno from alumno where no_control='" + no_control + "' ";
                String sql2 = "insert into bug(bug, modulo) values('" + e + "', 'Hubo un error al obtener el id del alumno, bitacoraModel') ";
                st.executeUpdate(sql);
                st.executeUpdate(sql2);
            } catch (Exception ex) {
                System.exit(0);
            }
        }
        return id;
    }

    //Metodo para obtener el conteo de los alumnos
    public int getCountAlumnos(String no_control) throws SQLException {
        try {
            st = cn.createStatement();
            String sql = "select count(*) as conteo from alumno where no_control='" + no_control + "' ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            try {
                String confirm = "bitacoraLocal";
                bdLocal(confirm);
                st = cn.createStatement();
                String sql = "select count(*) as conteo from alumno where no_control='" + no_control + "' ";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    count = rs.getInt(1);
                }
                String sql2 = "insert into bug(bug, modulo) values('" + e + "', 'Hubo un error al obtener el número de alumnos, bitacoraModel') ";
                st.executeUpdate(sql2);
            } catch (Exception ex) {
                System.exit(0);
            }
        }
        return count;
    }

    //Hacer el login
    public int login(String usr, String pwd) {
        int validacion = 0;
        try {
            st = cn.createStatement();
            String sql = "select * from usuario where usuario='" + usr + "' and contrasena='" + pwd + "' ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                validacion += 1;
            }
        } catch (Exception e) {
            try {
                String confirm = "bitacoraLocal";
                bdLocal(confirm);
                st = cn.createStatement();
                String sql2 = "insert into bug(bug, modulo) values('" + e + "', 'Hubo un error al ingresar al sistema, bitacoraModel') ";
                st.executeUpdate(sql2);
                String sql = "select * from usuario where usuario='" + usr + "' and contrasena='" + pwd + "' ";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    validacion += 1;
                }
                return validacion;
            } catch (Exception ex) {
                System.exit(0);
            }
        }
        return validacion;
    }

    //Metodo para insertar la hora final
    public void fechaHora(int id_bitacora) {
        try {
            st = cn.createStatement();
            String sql = "update bitacora set fecha_hora_fin=now() where id_bitacora=" + id_bitacora + " ";
            st.executeUpdate(sql);
        } catch (Exception e) {
            try {
                String confirm = "bitacoraLocal";
                bdLocal(confirm);
                st = cn.createStatement();
                String sql = "update bitacora set fecha_hora_fin=now() where id_bitacora=" + id_bitacora + " ";
                String sql2 = "insert into bug(bug, modulo) values('" + e + "', 'Hubo un error al actualizar la fecha y hora, bitacoraModel') ";
                st.executeUpdate(sql);
                st.executeUpdate(sql2);
            } catch (Exception ex) {
                System.exit(0);
            }
        }
    }

    //Metodo para obtener el id del alumno
    public int getIdBitacora(String alumno) {
        int id = 0;
        try {
            st = cn.createStatement();
            String sql = "select max(a.id_bitacora) as clave_maxima from bitacora a inner join alumno b on(a.id_alumno=b.id_alumno) "
                    + "where b.alumno='" + alumno + "' ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            try {
                String confirm = "bitacoraLocal";
                bdLocal(confirm);
                st = cn.createStatement();
                String sql = "select max(a.id_bitacora) as clave_maxima from bitacora a inner join alumno b on(a.id_alumno=b.id_alumno) "
                        + "where b.alumno='" + alumno + "' ";
                String sql2 = "insert into bug(bug, modulo) values('" + e + "', 'Hubo un error al obtener el id de la bitacora, bitacoraModel') ";
                st.executeUpdate(sql);
                st.executeUpdate(sql2);
            } catch (Exception ex) {
                System.exit(0);
            }
        }
        return id;
    }

    //Mostrar los registros de la bitacora
    public void mostrarRegistros(JTable tblRegistro) {
        try {
            st = cn.createStatement();
            String sql = "select b.no_control as Numero_Control, b.alumno as Nombre, c.grupo as Grupo, d.docente as Profesor, a.fecha_hora_inicio as Inicio, "
                    + "a.fecha_hora_fin as Final, a.observacion as Observaciones from bitacora a inner join alumno b "
                    + "on(a.id_alumno=b.id_alumno) inner join grupo c on(b.id_grupo=c.id_grupo) inner join docente d "
                    + "on(a.id_docente=d.id_docente) order by a.id_bitacora ";
            rs = st.executeQuery(sql);
            tblRegistro.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            try {
                String confirm = "bitacoraLocal";
                bdLocal(confirm);
                st = cn.createStatement();
                String sql = "select b.no_control as Numero_Control, b.alumno as Nombre, c.grupo as Grupo, d.docente as Profesor, a.fecha_hora_inicio as Inicio, "
                    + "a.fecha_hora_fin as Final, a.observacion as Observaciones from bitacora a inner join alumno b "
                    + "on(a.id_alumno=b.id_alumno) inner join grupo c on(b.id_grupo=c.id_grupo) inner join docente d "
                    + "on(a.id_docente=d.id_docente) order by a.id_bitacora ";
                rs = st.executeQuery(sql);
                tblRegistro.setModel(DbUtils.resultSetToTableModel(rs));
                String sql2 = "insert into bug(bug, modulo) values('" + e + "', 'Hubo un error al insertar un registro en la bitacora, bitacoraModel') ";
                st.executeUpdate(sql2);
            } catch (Exception ex) {
                System.exit(0);
            }
        }
    }
}
