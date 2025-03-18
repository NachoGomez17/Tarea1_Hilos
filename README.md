# Tarea1_Hilos

#IA
He utilizado la IA para saber como averiguar cual de los hilos ha terminado antes. He preguntado varias veces de maneras diferentes y al final he conseguido una respuesta que me convencía utilizando nanoTiming().

/https://chatgpt.com/share/67d9db4a-af14-8010-8707-b55cf6ca2023

#Pensamiento crítico
Cuando se ejecuta el programa varias veces cada robot gana aleatoriamente la carrera. El problema de que no se comunique es que puede darse el caso de que al intentar modificar cada robot una variable como carreraTerminada puede que no se detecte bien al ganador. Además, en caso de que se necesite que haya algún tipo de sincronización como incluir una variable "estoyPreparado" y no se comuniquen no podría empezar la carrera en el momento adecuado. Algunas maneras de solucionar esto es con variables volatile que permiten leer la variable directamente de la memoria evitando la caché.

Creo que es una actividad sencilla pero que ayuda a comprender el concepto de hilos mucho mejor. Es un complejo que de momento resulta muy complejo ya que no lo hemos visto antes y aunque no indagamos en exceso en el concepto de hilos por lo menos nos ayuda a comprender que es un hilo y como puede funcionar un programa gracias a ellos. Pienso que a la hora de hacer aplicaciones multiplataforma es muy útil porque permite hacer diferentes cosas de manera simultánea en paralelo y, como comentamos en clase, actuar de forma parecida a un equipo de trabajo real en el que cada uno puede ir haciendo una cosa diferente, permitiendo una mayor eficiencia y un ahorro de tiempo considerable en la ejecución del programa, lo cual es una ventaja importante.
