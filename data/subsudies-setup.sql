drop table if exists subsidie;

create table subsidie
(
    id bigint PRIMARY KEY,
    naam varchar(125),
    afkortingen  varchar(125),
    subsidieverstrekker varchar(125),
    doel  varchar(125),
    themas varchar(125),
    subsidiabele_activiteiten varchar(125),
    locatie  varchar(125),
    soort_organisatie varchar(125),
    samenwerking varchar(125),
    type_samenwerking varchar(125),
    totaal_budget int,
    subsidiebedrag_min int,
    subsidiebedrag_max int,
    bijzonderheid varchar(300),
    subsidiepercentage_min int,
    subsidiepercentage_max int,
    datum_open varchar(20),
    datum_sluit varchar(20),
    beoordeling_tender varchar(125),
    looptijdProject_jaren int
);

COPY subsidie
    FROM program 'cut -d "," -f 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21 /data/CityDealsData/Database-ready Circulair Bouwen.csv'
    DELIMITER ','
    CSV HEADER;