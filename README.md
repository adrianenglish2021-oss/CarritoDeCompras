# Refactorización: Sistema de Carrito de Compras

Este proyecto consiste en la refactorización de un código base en Java para mejorar su estructura, siguiendo los principios de **Clean Code** y **Separación de Responsabilidades**.

## Mejoras Realizadas

A continuación se detallan los puntos clave de la refactorización según los requisitos solicitados:

1.  **Independencia de Clases:** Se ha separado el programa principal (`Main.java`) de la lógica del carrito (`CarritoDeCompras.java`) y del modelo de datos (`Item.java`).
2.  **Encapsulamiento:** Se han creado métodos *Getters* y *Setters* en la clase `Item`. Los atributos ahora son privados.
3.  **Validación de Datos:** El constructor y los setters de `Item` ahora validan que el precio no sea negativo ni exceda límites lógicos, lanzando excepciones en caso de error.
4.  **Escalabilidad:** Se ha sustituido el `ArrayList` original por un `LinkedHashMap`. Esta estructura es más eficiente ($O(1)$) para buscar o eliminar productos por nombre cuando el volumen de datos es alto.
5.  **Uso de Constantes:** Se han definido constantes para parámetros como el símbolo de la moneda y las cabeceras, facilitando el mantenimiento futuro.
6.  **Reducción de Duplicación:** Se sobreescribió el método `toString()` en la clase `Item` para centralizar el formato de impresión de los elementos.
7.  **Cálculo Centralizado:** La responsabilidad de calcular el total ahora recae exclusivamente en la clase `CarritoDeCompras`.
8.  **Gestión de Cantidades:** Se añadió el atributo `cantidad` a cada ítem para permitir añadir múltiples unidades de un mismo producto.

## Estructura del Proyecto

* `Main.java`: Punto de entrada de la aplicación.
* `CarritoDeCompras.java`: Gestión de la lógica de negocio y colección de productos.
* `Item.java`: Clase que representa el modelo de los productos del carrito.

## Cómo ejecutar el proyecto

1. Descarga los archivos `.java`.
2. Compila el proyecto:
   ```bash
   javac Main.java