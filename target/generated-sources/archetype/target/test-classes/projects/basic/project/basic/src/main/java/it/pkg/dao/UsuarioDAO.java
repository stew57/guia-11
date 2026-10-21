package it.pkg.dao;

import it.pkg.entidades.Usuario;
import it.pkg.util.HibernateUtil;
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
