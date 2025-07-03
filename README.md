Se diseñado una solución completa para el sistema de gestión de tutorías académicas siguiendo principios SOLID y aplicando patrones de diseño sólidos. 
Se desarrollaron paquetes específicos como usuario, tutoria, controller, notificacion, command, view y util, cada uno con sus clases bien estructuradas y responsabilidades claras.

Los patrones implementados incluyen Strategy (para vistas y notificaciones), State (manejo dinámico del estado de tutorías), Command con soporte para Undo (acciones administrativas encapsuladas), y un Observer simulado (para notificaciones a los usuarios). 
Se evitó el uso de anti-patrones como clases gigantes (God Class), código desordenado (Spaghetti Code) y lógica quemada (Hardcoded) gracias a un diseño modular, interfaces, y abstracciones bien definidas.

El sistema se completa con una clase Main que simula inicio de sesión, menús contextuales por tipo de usuario, y ejecución de procesos desde consola, todo con lógica simulada vía salidas de texto.
