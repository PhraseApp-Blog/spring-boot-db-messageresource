create table IF NOT EXISTS languages (
	id integer not null, 
	locale varchar(2), 
	messagekey varchar(255),
	messagecontent varchar(255),
	primary key (id));