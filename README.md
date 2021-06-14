# Hunderegistrierung
## Aufgabe
**Was sind typische Performancebremsen bei Java-basierten Programmen und wie kommst du ihnen auf die Schliche?**

Das Landratsamt Neu-Tierwohl führt ein Verzeichnis über alle in den Gemeinden des Landkreises gemeldeten Hunde. Sie erfassen dort unterschiedliche Daten der Hunde: Name, Geburtsdatum, Rasse und den Halter. Mit diesen Daten können unterschiedliche Statistiken erstellt und Informationen generiert werden, die dem Landratsamt bei seiner täglichen Arbeit helfen.

Im Rahmen der Digitalisierung haben wir eine Software erstellt, die die Daten in einer Datenbank ablegt und mit der die passenden Berichte erstellt werden können. Bei Testläufen hat sich herausgestellt, dass das Programm sehr langsam ist, insbesondere wenn mehr Gemeinden und damit Hunde berücksichtigt werden. Bevor das Programm nun weiterentwickelt wird, soll es erst einmal optimiert werden, damit es auch bei größeren Datenmengen benutzbar bleibt. Die Software wurde mit Java, ohne auf große Frameworks zurückzugreifen, und einer MySQL-Datenbank entwickelt. 

Was sind typische Fehlerquellen, die die Performance negativ beeinflussen? Welche Schritte unternimmst du, um die Performance zu erhöhen? Welche Bereiche würdest du besonders stark unter die Lupe nehmen?

Wenn du möchtest kannst du dir die Software hier ansehen und runterladen. Schaffst du es, die Ausführungszeit spürbar zu reduzieren? Welche Beschleunigung erreichst du und welche konkreten Schwachstellen findest du?

Egal ob du uns allgemein sagst, wie die Performance verbessert werden kann oder ob du die konkrete Herausforderung annimmst. Wir freuen uns von dir zu hören! Schreibe uns deine Lösung an bewerbung@infoteam.de 



## Bevor es losgeht
Um die Aufgabe auszuführen wird ein Docker-Container für die MYSQL-Datenbank benötigt. Dieser kann folgendermaßen gestartet werden:

- **LINUX**: *sudo docker run -e MYSQL_ROOT_PASSWORD=mysql -p 1234:3306 --name=mysql -d mysql*
- **WINDOWS** (Als Admin): *docker run -e MYSQL_ROOT_PASSWORD=mysql -p 1234:3306 --name=mysql -d mysql*
