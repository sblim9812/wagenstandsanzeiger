## wagenstandsanzeiger

### Übersicht:

Dieser Service nutzt die Java und das Spring Boot-Framework, um REST-APIs zu implementieren, welche die Bahnhofsinformationen aus dem Jahr 2017 in den XML-Dateien nutzt. <br> 
Das Hauptziel des Services besteht darin, XML-Daten zu verarbeiten und den Clients JSON-formatierte Antworten zur Verfügung zu stellen.

Verzeichnisstruktur des Services:

* *jaxbconfig*: Dieses Verzeichnis liest XML-Dateien aus dem Ordnerverzeichnis und implementiert die Funktionalität, XML-Tag-Informationen in Java-Modelle umzuwandeln. Es handelt sich hauptsächlich um die Unmarshal von XML-Daten.


* *controller*: In diesem Verzeichnis wurden Methoden zur Verarbeitung von GET-HTTP-Anfragen implementiert. Wenn Anfragen von Clients eingehen, werden diese verarbeitet, und die Antwort an den Benutzer erfolgt im JSON-Format.


* *model*: Um benötigte Informationen aus XML-Daten zu extrahieren und zu nutzen, wurden Modelklassen implementiert. Diese Modelklassen mapen spezifische Elemente der XML-Daten auf Java-Objekte um.

---
### Projektmerkmale:

- Mithilfe der Modelklassen werden spezifische Werte aus XML-Daten extrahiert.
- Um XML-Daten in Java-Objekte umzuwandeln wird JAXB (Unmarshal) verwendet.
- JSON-formatierte Antworten werden generiert und dem Nutzer zur effektiven Datenübertragung zurückgegeben.

---
Dieses Projekt bietet über REST API eine effiziente Möglichkeit, Gleisabschnittsinformationen anhand von Bahnhofsabkürzung, Zugnummern und Waggonnummern per GET HTTP-Anfrage bereitzustellen.