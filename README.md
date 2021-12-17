
#Beschreibung

Dieses Repository ist eine Beispielapplikation und Grundlage für den Blogpost [Umsetzung von Batches mit Micronaut CLA und docker](https://exensio.de//news-medien/newsreader-blog/umsetzung-von-batches-mit-micronaut-cla-und-docker)

Die Micronaut CLA Applikation enthält keinerlei Logik und dient nur für Demonstrationszwecke.

Im Ordner docker ist die beispielhafte Konfiguration für die Nutzung der Applikation mit Cron-Scheduling abgelegt.

#Schritte zum Bauen


    ./gradlew dockerfile
    ./gradlew dockerBuild

Starten mit docker-compose

    cd docker/batches
    docker-compose up