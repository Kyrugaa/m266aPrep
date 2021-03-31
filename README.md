# m266aPrep

####Dies ist die Vorbereitung für die kommende Prüfung im Modul 226a

##Vorgaben:
-Erstellen Sie eine Klasse Snake mit den Eigenschaften: xPos, yPos und laenge.
-xPos und yPos werden im Konstruktor übergeben, laenge wird auf 1 gesetzt.
-Snake-Objekt werden im Spielfeld per moveUp() bzw. moveLefft() bewegt.

Dazu soll eine JUnit-Testklasse erstellt werden um: Übergabeparameter für Konstruktor, Positiv- und Negativtests für moveUp() und moveDown(), zu testen.

###Klasse Snake:
Zuerst werden die 3 public int Variablen xPos, yPos und laenge definiert. xPos und yPos wird dann in den Kunstruktor namens Snake übermittelt.
Für jede Richtung wird eine public void mit dazugehörenden Parameter erstellt.

###JUnit Klasse Snake:
Im Konstruktor Test wird geschaut ob das Snake Objekt auf Position 100, 100 spawnt. Die zu testenden Werte für yPos und xPos sind 100.
Danach wird geschaut ob sich die Werte richtig verändern, sollte man das Objekt in die jeweilige Richtung bewegen.
Bei den Negativ Zahlen Test wird lediglich die Schlange um -50 in die jeweilige Richtung bewegt. Erwartet wird der Wert 0.
