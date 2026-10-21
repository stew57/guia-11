package com.ejemplocom.ejemplo.loguinjavafx.util;

import com.ejemplocom.ejemplo.loguinjavafx.entidades.Usuario;

public class SesionUsuario {

    private static Usuario usuarioActual;

    public static void iniciar(Usuario usuario) {
        usuarioActual = usuario;
    }

    public static Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public static void cerrar() {
        usuarioActual = null;
    }
}
