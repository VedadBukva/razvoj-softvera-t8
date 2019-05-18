BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Bus" (
	"idBus"	INTEGER,
	"Proizodjac"	TEXT,
	"Serija"	TEXT,
	"BrojSjedista"	INTEGER,
	PRIMARY KEY("idBus")
);
CREATE TABLE IF NOT EXISTS "Driver" (
	"idVozac"	INTEGER,
	"Ime"	TEXT,
	"Prezime"	TEXT,
	"JMB"	TEXT UNIQUE,
	"DatumRodjenja"	DATE,
	"DatumZaposlenja"	DATE,
	PRIMARY KEY("idVozac")
);
COMMIT;
