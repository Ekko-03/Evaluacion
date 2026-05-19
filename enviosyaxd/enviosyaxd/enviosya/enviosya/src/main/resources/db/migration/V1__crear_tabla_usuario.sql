CREATE TABLE Usuario (
                id INT AUTO_INCREMENT PRIMARY KEY,
                run VARCHAR(13) NOT NULL UNIQUE,
                nombre VARCHAR(255) NOT NULL,
                apellido VARCHAR(255) NOT NULL,
                codigo_postal INT NOT NULL,
                direccion VARCHAR(255) NOT NULL,
                correo VARCHAR(255) NOT NULL,
                numero_telefono INT NOT NULL,
                fecha_nacimiento DATE
);