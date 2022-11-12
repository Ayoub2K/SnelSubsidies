drop table if exists subsidie;

create table subsidie
(
    dtype varchar(31),
    naam varchar(125) PRIMARY KEY,
    afkortingen  varchar(125),
    niveau varchar(125),
    subsidieverstrekker varchar(125),
    doel  varchar(1000),
    themas varchar(125),
    subsidiabele_activiteiten varchar(1000),
    locatie  varchar(125),
    soort_organisatie varchar(300),
    samenwerking varchar(1000),
    type_samenwerking varchar(1000),
    totaal_budget int,
    subsidiebedrag_min int,
    subsidiebedrag_max int,
    bijzonderheid varchar(1000),
    subsidiepercentage_min varchar(20),
    subsidiepercentage_max varchar(20),
    datum_open varchar(20),
    datum_sluit varchar(20),
    beoordeling_tender varchar(125),
    looptijdProject_jaren int
);



COPY subsidie
    FROM program 'cut -d "," -f 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22 /var/data/db/CityDealsData/Circulair-Bouwen.csv'
    DELIMITER ','
    CSV HEADER;