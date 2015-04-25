/*
* Script to Create the following tables:
* Acceptor
* Informer
* Message
* MessageRecord 
*/


CREATE TABLE Acceptor(
	id int(16) NOT NULL UNIQUE AUTO_INCREMENT,
	grade int(1),
	institute char(80),
	profession char(80),
	classIn char(20),
	name char(20) NOT NULL UNIQUE,
	sex char(1),
	dorm char(20),
	dormRoom char(20),
	telephone char(20),

	PRIMARY KEY(id)
);

CREATE TABLE Informer(
	id int(16) NOT NULL UNIQUE AUTO_INCREMENT,
	department char(80) NOT NULL,
	duty char(80) NOT NULL,
	principal char(80) NOT NULL,

	PRIMARY KEY(id)
);

CREATE TABLE Message(
	id int(32) NOT NULL UNIQUE AUTO_INCREMENT,
	importanceDegree int(1) NOT NULL DEFAULT '2',
	title char(80) NOT NULL,
	content varchar(255) NOT NULL,
	type char(20),
	createDate date,
	sendDate date,
	sendStatus int(1) NOT NULL DEFAULT '0',
	acceptorID int(16) NOT NULL,

	PRIMARY KEY(id),
	FOREIGN KEY(acceptorID) REFERENCES Acceptor(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE MessageRecord(
	id int(32)	NOT NULL UNIQUE AUTO_INCREMENT,
	messageID int(32),
	acceptorID int(16),
	status int(1) NOT NULL DEFAULT '0',
	checkDate date,

	PRIMARY KEY(id),
	FOREIGN KEY(messageID) REFERENCES Message(id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(acceptorID) REFERENCES Acceptor(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE SendMessage(
	messageID int(32) NOT NULL,
	acceptorID int(16) NOT NULL,

	PRIMARY KEY(messageID, acceptorID),
	FOREIGN KEY(messageID) REFERENCES Message(id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(acceptorID) REFERENCES Acceptor(id) ON DELETE CASCADE ON UPDATE CASCADE
);