package com.javeriana.proyecto_fastbite.dao;

import com.javeriana.proyecto_fastbite.model.Administrador;
import com.javeriana.proyecto_fastbite.model.Cajero;
import com.javeriana.proyecto_fastbite.model.Cocinero;
import com.javeriana.proyecto_fastbite.model.Usuario;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class UsuariosDao {

    private final String RUTA =
            "src/main/resources/data/usuarios.csv";

    public List<Usuario> leerUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();

        try(BufferedReader br =
                    Files.newBufferedReader(Paths.get(RUTA))) {

            String linea;

            br.readLine();

            while((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                UUID id =
                        UUID.fromString(datos[0]);

                String nombre = datos[1];

                String usuario = datos[2];

                String contrasena = datos[3];

                String rol = datos[4];

                Usuario u = null;

                if(rol.equals("ADMINISTRADOR")) {

                    u = new Administrador(id,nombre,rol,contrasena);

                } else if(rol.equals("CAJERO")) {

                    u = new Cajero(contrasena,id,nombre,rol);

                } else if(rol.equals("COCINERO")) {

                    u = new Cocinero(contrasena,id,nombre,rol);

                }

                usuarios.add(u);

            }

        } catch(IOException e) {

            e.printStackTrace();

        }

        return usuarios;

    }

    public void escribirUsuario(Usuario usuario) {

        try(BufferedWriter bw =
                    Files.newBufferedWriter(
                            Paths.get(RUTA),
                            StandardOpenOption.APPEND)) {

            String linea =
                    usuario.getIdUsuario() + "," +
                            usuario.getNombre() + "," +
                            usuario.getUsuarioType() + "," +
                            usuario.getContrasena() + "," +
                            usuario.getUsuarioType();

            bw.newLine();

            bw.write(linea);

        } catch(IOException e) {

            e.printStackTrace();

        }

    }

}
