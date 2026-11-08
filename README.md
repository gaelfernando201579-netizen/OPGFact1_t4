# OPGFact1_t4 - Introducción a Spring Boot

**Autor:** Gael Fernando Ortiz Pérez (OPGF)  
**Materia:** Programación Web  
**Institución:** Instituto Tecnológico de Oaxaca (ITO)

## Descripción del Proyecto
Este proyecto es la primera actividad de configuración y desarrollo de controladores utilizando **Java y Spring Boot**. El sistema implementa el patrón de arquitectura MVC para servir vistas dinámicas en HTML (utilizando el motor de plantillas **Thymeleaf**) y expone información estructurada mediante una API REST en formato **JSON**.

## Endpoints Desarrollados

El proyecto corre en el puerto `8084` y expone un total de 3 endpoints divididos en dos controladores:

### 1. Vistas HTML (`@Controller`)
Controlador diseñado para retornar interfaces gráficas al usuario.
* **`GET /mi-proyecto`**
  * **Descripción:** Muestra una vista HTML con el nombre del autor y la instancia del proyecto.
* **`GET /status`**
  * **Descripción:** Muestra una vista HTML indicando que el servidor embebido está corriendo correctamente.

### 2. API REST (`@RestController`)
Controlador diseñado para consumir datos crudos.
* **`GET /api/materias`**
  * **Descripción:** Retorna un objeto JSON con información del estudiante y un arreglo con la lista de materias cursadas en el TecNM (Gestión de Proyectos de Software, Administración de Redes, Programación Web, etc.).

## Despliegue en VPS (Ubuntu)

El proyecto se encuentra desplegado en un servidor VPS remoto gestionado por el equipo (DAGASA). Para asegurar la estabilidad del servidor y evitar que el proceso sea terminado por el OOM Killer (falta de memoria RAM), la aplicación se compiló usando Maven (`mvn clean package`) y se ejecuta en segundo plano con límites de memoria de la máquina virtual de Java.

**Comando de ejecución en el servidor:**
```bash
nohup java -Xms128m -Xmx256m -jar target/OPGFact1_t4-0.0.1-SNAPSHOT.jar &
