CREATE DATABASE SantaRita_db;

USE SantaRita_db;

CREATE TABLE Usuario (
    nombreUsuario INTEGER NOT NULL,
    contrasenia VARCHAR(255) NOT NULL,
    nombreapellido VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,    
    PRIMARY KEY (nombreUsuario)
);

CREATE TABLE Rubro (
    codRubro INTEGER NOT NULL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

CREATE TABLE Cliente (
    codCliente INTEGER NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    Apellido VARCHAR(255) NOT NULL,
    domicilio VARCHAR(255) NOT NULL,
    correo VARCHAR(255) NOT NULL,    
    fechaNac VARCHAR(255) NOT NULL,
    dni VARCHAR(255) NOT NULL,
    PRIMARY KEY (codCliente)
);

CREATE TABLE Producto (
    codProducto INTEGER NOT NULL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    precio REAL NOT NULL,
    strock INTEGER NOT NULL,
    codRubro INTEGER NOT NULL,   
    FOREIGN KEY (codRubro) REFERENCES Rubro(codRubro)
);

CREATE TABLE PedidoCliente (
    codPedido INTEGER NOT NULL,
    codCliente INTEGER NOT NULL,
    monto REAL NOT NULL,    
    fecha VARCHAR(255) NOT NULL,
    PRIMARY KEY (codPedido),
    FOREIGN KEY (codCliente) REFERENCES Cliente(codCliente)
);

CREATE TABLE DetallePedido (
    codPedido INTEGER NOT NULL,
    codProducto INTEGER NOT NULL,
    monto REAL NOT NULL,
    Cantidad INTEGER NOT NULL,
    PRIMARY KEY (codPedido, codProducto),
    FOREIGN KEY (codPedido) REFERENCES PedidoCliente(codPedido),
    FOREIGN KEY (codProducto) REFERENCES Producto(codProducto)
);





