#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import ${package}.entidades.Usuario;
import ${package}.util.HibernateUtil;
import org.hibernate.Session;

public class UsuarioDAO {

    public Usuario autenticar(String correo, String clave){
        String hql = "FROM Usuario u"
                + " WHERE u.Correo = :correo AND u.Clave = :clave AND u.Estado = 'ACTIVO'";
        
        try (Session sesion = HibernateUtil.getSessionFactory().openSession()){
            return sesion.createQuery(hql, Usuario.class)
                    .setParameter("correo", correo)
                    .setParameter("clave", clave)
                    .uniqueResultOptional()
                    .orElse(null);
        }
    }
}
