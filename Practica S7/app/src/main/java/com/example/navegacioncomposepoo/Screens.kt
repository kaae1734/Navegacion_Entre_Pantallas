package com.example.navegacioncomposepoo

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

// --- DEFINICIÓN DE RUTAS (POO) ---
sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Details : Screen("details")
    object Profile : Screen("profile")
}

// --- COMPONENTE REUTILIZABLE PARA DISEÑO ---
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenLayout(
    title: String,
    icon: ImageVector,
    content: @Composable ColumnScope.() -> Unit
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(title, fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(80.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            content()
        }
    }
}

// --- PANTALLA 1: INICIO ---
@Composable
fun HomeScreen(navController: NavHostController) {
    ScreenLayout("Bienvenido", Icons.Default.Home) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
        ) {
            Text(
                "Explora nuestra aplicación de navegación avanzada.",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { navController.navigate(Screen.Details.route) },
            modifier = Modifier.fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Icon(Icons.Default.ArrowForward, contentDescription = null)
            Spacer(Modifier.width(8.dp))
            Text("Comenzar Recorrido")
        }
    }
}

// --- PANTALLA 2: DETALLES ---
@Composable
fun DetailsScreen(navHostController: NavHostController) {
    ScreenLayout("Detalles Técnicos", Icons.Default.Info) {
        Text(
            "Información del Proyecto",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            "Esta pantalla demuestra la capacidad de retroceder o avanzar en el flujo de la aplicación usando estados de navegación.",
            textAlign = TextAlign.Justify
        )
        Spacer(modifier = Modifier.weight(1f))
        FilledTonalButton(
            onClick = { navHostController.navigate(Screen.Profile.route) },
            modifier = Modifier.fillMaxWidth().height(56.dp)
        ) {
            Text("Ver Perfil de Usuario")
        }
        OutlinedButton(
            onClick = { navHostController.popBackStack() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Volver al Inicio")
        }
    }
}

// --- PANTALLA 3: PERFIL ---
@Composable
fun ProfileScreen(navHostController: NavHostController) {
    ScreenLayout("Mi Perfil", Icons.Default.AccountCircle) {
        Surface(
            modifier = Modifier.size(100.dp),
            shape = RoundedCornerShape(50.dp),
            color = MaterialTheme.colorScheme.secondaryContainer
        ) {
            Icon(Icons.Default.Person, null, modifier = Modifier.padding(20.dp))
        }
        Text("Estudiante de POO II", style = MaterialTheme.typography.titleLarge)
        Text("kenneth.acuna@universidad.com", color = MaterialTheme.colorScheme.outline)
        HorizontalDivider(modifier = Modifier.padding(vertical = 10.dp))
        Button(
            onClick = {
                navHostController.navigate(Screen.Home.route) {
                    popUpTo(Screen.Home.route) { inclusive = true }
                }
            },
            modifier = Modifier.fillMaxWidth().height(56.dp)
        ) {
            Text("Finalizar y Salir")
        }
    }
}