**Singleton**



* Definición: Garantiza que una clase solo pueda crear una única instancia u objeto en todo el programa, entregando un acceso global a ese mismo objeto cada vez que se necesite.



* Caso de uso: Un sistema de configuración general de un videojuego o aplicación, donde solo debe existir un único lugar que guarde el volumen, el idioma y los ajustes para que todos los demás módulos consulten siempre los mismos datos.





**Abstract Factory**



* Definición: Una súper fábrica que se encarga de crear familias de objetos que están relacionados entre sí, sin que el código principal necesite saber exactamente qué clases concretas está usando.



* Caso de uso: Una interfaz gráfica que cambia de estilo según el sistema operativo; la fábrica se encarga de crear de golpe todos los botones, ventanas y menús ya sea con diseño de Windows o de Mac.





**Facade**



* Definición: Una clase intermediaria que simplifica un sistema complejo lleno de muchas clases y procesos, ofreciendo una única función fácil de usar para el usuario.



* Caso de uso: Cuando se va compra en línea, en lugar de interactuar por separado con la plataforma de pagos, la bodega de inventarios, el cálculo de impuestos y el sistema de envíos, se usa un botón de "Comprar" que se encarga de coordinar todo por detrás de forma invisible.





**Adapter**



* Definición: Un intermediario que permite que dos piezas de software con interfaces o formatos incompatibles puedan entenderse y trabajar juntas.



* Caso de uso: Recibir información en formato XML desde un servidor antiguo y pasarla a través de un adaptador para que la pueda leer una librería moderna que solo procesa JSON.





**Observer**



* Definición: Un mecanismo donde un objeto principal avisa automáticamente a una lista de suscriptores cada vez que su estado cambia, sin tener que llamarlos uno por uno manualmente.



* Caso de uso: El sistema de notificaciones de un canal de YouTube, donde los usuarios se suscriben y reciben una alerta de inmediato cada vez que el creador sube un nuevo video.





**Strategy**



* Definición: Permite definir varios algoritmos o formas de hacer una tarea, guardando cada uno en su propia clase para poder intercambiarlos fácilmente según lo que necesite el programa en el momento.



* Caso de uso: Las distintas opciones en una plataforma de pago (tarjeta, PayPal o criptomonedas), donde el sistema ejecuta el cálculo de cobro adaptándose a la regla específica del método que el usuario elija.





**Builder**



* Definición: Separa el proceso de creación de un objeto que es muy complejo en varias partes, permitiendo armarlo paso a paso y obtener distintas variantes usando la misma base de código.



* Caso de uso: Un asistente de configuración de un auto nuevo en una página web, donde se va seleccionando paso a paso el color, el tipo de motor, los aros y los accesorios hasta construir el modelo final a la medida.

