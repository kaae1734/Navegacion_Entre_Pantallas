# NavegacionComposePOO 📱

Este proyecto es una aplicación de Android desarrollada con **Kotlin** y **Jetpack Compose** para la asignatura de **POO II – Desarrollo de aplicaciones móviles**. El objetivo principal es implementar un sistema de navegación robusto y moderno utilizando el componente `Navigation Compose`.

## 🎯 Objetivos del Proyecto
- Implementar un sistema de navegación funcional entre un mínimo de 3 pantallas.
- Comprender y aplicar el flujo de usuario en aplicaciones móviles.
- Utilizar componentes interactivos de **Material Design 3**.
- Estructurar el código siguiendo principios de Programación Orientada a Objetos y Arquitectura de Software.

## 🚀 Características
La aplicación consta de tres pantallas principales con un flujo continuo:

1.  **Pantalla de Inicio (Home):** Bienvenida al usuario y punto de acceso principal.
2.  **Pantalla de Detalle (Details):** Información técnica sobre el flujo de navegación y gestión del Stack.
3.  **Pantalla de Perfil (Profile):** Resumen de usuario con lógica de cierre de sesión (limpieza de historial).

## 🛠️ Tecnologías Utilizadas
- **Lenguaje:** [Kotlin](https://kotlinlang.org/)
- **UI Framework:** [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Navegación:** `androidx.navigation:navigation-compose`
- **Diseño:** Material Design 3 (M3)
- **IDE:** Android Studio Ladybug / Jellyfish

## 📂 Estructura del Código
Para mantener un código limpio (Clean Code), el proyecto se divide en:
- `Screen.kt`: Definición de rutas mediante `sealed classes` y componentes de interfaz de usuario.
- `AppNavigation.kt`: Configuración del `NavHost` y definición del grafo de navegación.
- `MainActivity.kt`: Punto de entrada de la aplicación y configuración del tema.

## ⚙️ Instrucciones de Ejecución
1.  Clonar este repositorio:
    ```bash
    git clone [https://github.com/iamKAAE/NavegacionComposePOO.git](https://github.com/iamKAAE/NavegacionComposePOO.git)
    ```
2.  Abrir el proyecto en **Android Studio**.
3.  Sincronizar el proyecto con los archivos de Gradle (**Sync Project with Gradle Files**).
4.  Ejecutar en un dispositivo físico o emulador (API 24 o superior).

---
**Desarrollado por:** Kenneth Alexander Acuña Estrada  
**Asignatura:** POO II - Ingeniería en Sistemas  
**Fecha:** Abril 2026
