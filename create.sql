SET MODE Postgresql;

CREATE DATABASE wildlifetracker;

\c wildlifetracker;

CREATE TABLE animals(
PRIMARY INT SERIAL KEY id,
VARCHAR animalName,
VARCHAR age,
VARCHAR health,
VARCHAR type
);

CREATE TABLE sightings(
PRIMARY SERIAL KEY INT id,
VARCHAR location,
VARCHAR rangerName
);
