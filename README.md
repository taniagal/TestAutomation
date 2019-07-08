# TestAutomation
Test  Automation

#SeleniumIDE
-Se crea una suite con dos workflow, el primero de ellos valida la presencia de el texto AngularJs, Con el fin de validar que efectivamente
se esta trabajando con un aplicativo angular
-El segundo de ellos envia productos a un formulario de tipo angular, se guarda la información y se valida que efectivamente se muestre
el numero de productos que estan siendo enviados, en este caso 3 productos.

#Clase principal
-La clase principal es TestAutomationTest la cual esta en la ruta src/main/jave/TestAutomationtest, desde ahi se puede correr el script generado
con SeleniumIDE
-Se toman los valores para el formulario por medio de System.setProperty y System.getProperty teniendo en cuenta que son test de Junit los que vana  ser ejecutados
-Se ejecutan los test por medio de chrome driver, por ello es importante tener instalado el chrome driver en esta ruta :C:\Users\tanigral\AppData\Roaming\npm

#gradle
-Se hace uso del gestor de dependencias gradle para poder ejecutar los test teniendo en cuenta el script generado de selenium IDE
-Para correr el test por medio de la consola se usa el siguiente comando gradle -Dtest.single=TestAutomationTest test
-Tambien se puede usar el siguiente comando para correr los test gradle test -Dwebdriver.chrome.driver=C://chromedriver.exe, en caso de llamar el chrome driver de la ruta local C
##Compilar proyecto antes de realizar Pull Request

Es importante compilar el proyecto antes de realizar un Pull Request, se hace uso de los siguientes comandos por consola
-gradle clean assemble
-gradle compileJava

En caso de que hayan varios test se usa el siguiente comando para ejecutarlos todos
-gradle test

#Que se debe hacer para correr esto test fuera del IDE?
-Cuando se exporta la test suite desde SELENIUMIDE existen varias opciones para exportar y de acuerdo a ello se genera el script
-Se debe configurar el gestor de dependencias de preferencia en el nuevo IDE,
-se hace el llamado del script, con respecto a laos framework o herramientas que se vayan a utiizar para la optimización
de ejecución se configuran tambien en el gestor de dependencias, y dentro del proyecto se hace uso de ellas
para el consumo y la manipulación del script generado (ScreenPlay,Cucumber,POM, etc)