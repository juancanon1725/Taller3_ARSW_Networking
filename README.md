## Author

Juan Pablo Poveda Cañon

# Taller 3 - Networking

## Prerequisitos

Maven: Automatiza y estandariza el flujo de vida de la construcción de software.

Git: Administrador descentralizado de configuraciones.

## Instalación

Para instalar el proyecto maven se usa el siguiente comando:

```
mvn clean install
```

## Ejecución

Para que se puedan ejecutar los Clientes debemos ejecutar el servidor "Echo Server" (Para Ejercicio 1, Ejercicio 2, Ejercicio 3)

```
 mvn -e exec:java -Dexec.mainClass=edu.escuelaing.arsw.ase.app.EchoServer.java
```

# Ejercicio 1

Para ejecutar el proyecto maven se el siguiente comando:

```
 mvn -e exec:java -Dexec.mainClass=edu.escuelaing.arsw.ase.app.Ejercicio1.java
```

![Ejercicio1client](https://github.com/juancanon1725/Taller3_ARSW_Networking/assets/98672541/000f8a5c-6266-4ef9-b337-99aa15771355)

# Ejercicio 2

Para ejecutar el proyecto maven se el siguiente comando:

```
 mvn -e exec:java -Dexec.mainClass=edu.escuelaing.arsw.ase.app.Ejercicio2.java
```
Ingresamos la direccion URL de la que queremos recibir la informacion:

![Ejercicio2client](https://github.com/juancanon1725/Taller3_ARSW_Networking/assets/98672541/19c809c2-8be2-44a3-8d47-3b1fd2ff7d39)

Se crea un archivo "resultado.html" con la informacion html de la pagina:

![resultEjercicio2](https://github.com/juancanon1725/Taller3_ARSW_Networking/assets/98672541/729520f7-9dc3-408c-85ab-31ffea444c32)

# Ejercicio 3

Para ejecutar el proyecto maven se el siguiente comando:

```
 mvn -e exec:java -Dexec.mainClass=edu.escuelaing.arsw.ase.app.EchoClient.java
```

![Ejercicio3client](https://github.com/juancanon1725/Taller3_ARSW_Networking/assets/98672541/5407ca5d-890a-48d8-82d6-a8a30d83689e)

# Ejercicio 4

Debemos ejecutar el Servidor primero con el siguiente comando:

```
 mvn -e exec:java -Dexec.mainClass=edu.escuelaing.arsw.ase.app.ServerE4.java
```

Depues ejecutamos el Cliente con el siguiente comando:

```
 mvn -e exec:java -Dexec.mainClass=edu.escuelaing.arsw.ase.app.ClientE4.java
```

Ahora nos piden cualcular por defecto el coseno de algun número, y luego cambiamos la operación como Sin, para que ahora podamos hacer lo operaciún con el Seno de un número.

![Ejercicio4client](https://github.com/juancanon1725/Taller3_ARSW_Networking/assets/98672541/c1a0eb64-e023-464c-9ed5-434e4ea4d3d8)

# Ejercicio 5

Para ejecutar el proyecto maven se el siguiente comando

```
 mvn -e exec:java -Dexec.mainClass=edu.escuelaing.arsw.ase.app.WebServer.java
```

Y probamos en un browser la URL:

[http://localhost:35000/index.html](http://localhost:35000/index.html)

Donde cargamos una pagina html y una imagen png:

![WebServer](https://github.com/juancanon1725/Taller3_ARSW_Networking/assets/98672541/020f6a17-db59-440e-845a-d65655e28139)

Y cargamos una segunda pagina html en el mismo servidor

![WebServerPage1](https://github.com/juancanon1725/Taller3_ARSW_Networking/assets/98672541/1adcbf5f-1383-4565-a1d4-a45d49e2d36e)

# Ejercicio 6

Debemos ejecutar el Servidor primero con el siguiente comando:

```
 mvn -e exec:java -Dexec.mainClass=edu.escuelaing.arsw.ase.app.TimeServer.java
```

Depues ejecutamos el Cliente con el siguiente comando:

```
 mvn -e exec:java -Dexec.mainClass=edu.escuelaing.arsw.ase.app.TimeClient.java
```
Y posteriormente el cliente empieza a recibir información del tiempo actualizado:

![timeSC](https://github.com/juancanon1725/Taller3_ARSW_Networking/assets/98672541/4bc41917-34fd-4168-9ce1-bddb35595c38)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
