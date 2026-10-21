package it.pkg.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static synchronized SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration().
                        configure().
                        buildSessionFactory();
            } catch (Exception ex) {
                System.err.println("Error al crear SessionFactory");
                throw new IllegalStateException("No se pudo conectar con la db", ex);
            }
        }
        return sessionFactory;
    }

    public static synchronized void cerrar() {
        if (sessionFactory != null && sessionFactory.isOpen()) {
            sessionFactory.close();
        }
    }
}
