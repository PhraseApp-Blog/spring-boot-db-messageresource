create table IF NOT EXISTS languages (
	id integer auto_increment, 
	locale varchar(2), 
	messagekey varchar(255),
	messagecontent varchar(255),
	primary key (id));