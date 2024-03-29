# Integrantes
* Camilo Castaño
* Josué Hernández
* Saray Mendivelso

## RESPUESTAS PARTE ||
### Ciclos de vida del desarrollo de software
#### Solución lab 5 MVC / 2024


- **¿Por qué MVC obtiene ese nombre?** (puede apoyarse de [este enlace](https://www.javatpoint.com/spring-mvc-tutorial))

Recibe su nombre debido a sus siglas:
  - **M (Modelo):** Hace referencia a la capa lógica de datos del negocio de la app, manejando el acceso y manipulación de datos para procesar la información. Ejemplo: base de datos, archivos, servicios web.
  - **V (Vista):** Responsable de la presentación visual de la información, encargada de mostrar la interfaz y presentar los datos al usuario final de manera comprensible y atractiva.
  - **C (Controlador):** Intermediario entre el Modelo y la Vista, maneja las solicitudes del usuario. El Controlador interpreta las acciones del usuario y coordina las interacciones entre el Modelo y la Vista.

- **¿Cuáles son las ventajas de usar MVC?**
  - MVC separa el código en tres partes: Modelo, Vista y Controlador.
  - Facilita la reutilización y mantenimiento del código.
  - Permite realizar pruebas de manera más sencilla y efectiva.
  - Ayuda a escalar la aplicación a medida que crece en complejidad.
  - Mejora la estructura, la organización y la mantenibilidad de las aplicaciones.
  - Promueve una estructura organizada y modular del proyecto.
  - Facilita el proceso de desarrollo y promueve prácticas de programación sólidas y eficientes.

- **¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo Maven y Java EE)?**

Las diferencias son el resultado de la adición de nuevas funcionalidades, la reorganización del código existente, la eliminación de código obsoleto o la refactorización del código para mejorar su calidad y mantenibilidad.

  - La inclusión de un framework web específico, como Spring MVC.
  - Directorio `src/main/resources/static` donde se colocan los recursos estáticos de la aplicación web.
  - Ausencia de directorios específicos de Java EE.
  - Configuración adicional de Spring como `application.properties`.

- **¿Qué anotaciones usaste y cuál es la diferencia entre ellas?**

Anotaciones usadas en el Spring Framework de Java:

  - `@Controller`: Se utiliza para marcar una clase como un controlador en Spring MVC. Los controladores manejan las solicitudes HTTP y devuelven las respuestas adecuadas.
  - `@GetMapping("/greeting")`: Mapea solicitudes HTTP GET a métodos específicos dentro de un controlador.
  - `@SpringBootApplication`: Esta anotación se utiliza para marcar la clase principal de una aplicación Spring Boot. Combina tres anotaciones: `@Configuration`, `@EnableAutoConfiguration` y `@ComponentScan`. Indica que la clase es una clase de configuración, habilita la configuración automática de Spring Boot basada en el contenido del classpath y escanea los paquetes para componentes de Spring.
  - `@ResponseBody`: Indica que el valor devuelto por un método de controlador debe ser vinculado directamente al cuerpo de la respuesta HTTP, en lugar de ser vinculado a una vista. Es útil cuando se quiere devolver datos en formato JSON o XML directamente desde un controlador.
  - `@RequestMapping("/User/{id}")`: Esta anotación se utiliza para mapear solicitudes HTTP a métodos de controlador específicos y permite el uso de variables de ruta, como {id} en este caso, que serán pasadas como parámetros al método del controlador.


## PARTE |||
**¿Que es RESTful?**

RESTful (Representational State Transfer) es un estilo arquitectónico que promueve la creacion de APIs web, para el diseño de sistemas de software distribuidos, que se basa en estándares y protocolos web existentes, como HTTP.
Centrandose  en  lso recursos que pueden ser identificados mediante URLs y manipulados a través de métodos HTTP estándar
- GET
- POST
- PUT
- DELETE

Permitiendo una comunicación uniforme y eficiente entre sistemas. 

 
## PARTE IV
- **¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?**
  
Si accedemos al sitio de juegos desde dos navegadores diferentes, cada uno establecerá una sesión individual con el servidor. 
De este modo, cada sesión gestionará su propio juego, con su número secreto por adivinar y su saldo exclusivo. Es asi como los juegos en los dos navegadores se desarrollarán de manera completamente separada entre sí.

- **Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?**
  
Si deseamos que cada jugador vea los saldos de forma independiente, al usar la sesión de Flask para guardar los números a adivinar y los saldos de cada usuario. La sesión de Flask se gestiona de manera individual para cada usuario, lo que significa que cada jugador tendrá su propio saldo y estado de juego, sin influencia de las acciones de otros jugadores en el mismo sitio web.


