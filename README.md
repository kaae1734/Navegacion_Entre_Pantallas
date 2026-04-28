# Navegacion_Entre_Pantallas 📱

Este proyecto es una aplicación Android moderna desarrollada con **Kotlin** y **Jetpack Compose** para la asignatura de **POO II**. Implementa un sistema de navegación robusto utilizando el componente `Navigation Compose`, aplicando principios de diseño de **Material Design 3**.

## 🎯 Objetivo de la Práctica
Desarrollar un sistema de navegación funcional que permita el flujo continuo de estados entre múltiples vistas (screens), asegurando una experiencia de usuario (UX) coherente y profesional mediante el uso de componentes reutilizables.

## 🚀 Características Principales
La aplicación implementa un flujo de navegación de 3 pantallas con diseño elegante:
* **Inicio (Home):** Pantalla de bienvenida con una tarjeta informativa y acceso al recorrido.
* **Detalles (Details):** Vista intermedia que demuestra el manejo del *BackStack* (retroceso) y botones tonales.
* **Perfil (Profile):** Resumen de usuario con un avatar estilizado y lógica de navegación circular (limpieza de historial al finalizar).

## 🛠️ Stack Tecnológico
* **Lenguaje:** Kotlin
* **UI Framework:** Jetpack Compose (Material 3)
* **Navegación:** `androidx.navigation:navigation-compose`
* **Arquitectura:** Programación Orientada a Objetos (POO) mediante `Sealed Classes` para la gestión de rutas seguras.

## 📂 Estructura del Proyecto
El código está organizado para facilitar la lectura y el mantenimiento:
- `MainActivity.kt`: Punto de entrada que carga el tema personalizado y el NavHost.
- `AppNavigation.kt`: Definición del grafo de navegación y asignación de rutas.
- `Screens.kt`: Contiene la lógica de las interfaces de usuario y el componente reutilizable `ScreenLayout`.

## ⚙️ Instrucciones de Ejecución (Clonación)

Si deseas probar este proyecto localmente, sigue estos pasos:

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/kaae1734/Navegacion_Entre_Pantallas.git](https://github.com/kaae1734/Navegacion_Entre_Pantallas.git)
    ```
2.  **Abrir en Android Studio:**
    Selecciona la carpeta del proyecto y espera a que Gradle descargue las dependencias.
3.  **Sincronizar Gradle:**
    Haz clic en `File > Sync Project with Gradle Files` para asegurar que todas las librerías de navegación estén listas.
4.  **Ejecutar:**
    Selecciona tu dispositivo o emulador y presiona el botón **Run**.

---
**Desarrollado por:** Kenneth Alexander Acuña Estrada  
**Repositorio:** [kaae1734/Navegacion_Entre_Pantallas](https://github.com/kaae1734/Navegacion_Entre_Pantallas.git)
