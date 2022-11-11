drop table if exists subsidie;

create table subsidie
(
    id bigint PRIMARY KEY,
    Naam varchar(125),
    Afkortingen  varchar(125),
    Niveau varchar(125),
    Subsidieverstrekker varchar(125),
    Doel  varchar(125),
    Themas varchar(125),
    Subsidiabele_activiteiten varchar(125),
    Locatie  varchar(125),
    Soort_organisatie varchar(125),
    Samenwerking varchar(125),
    Type_samenwerking varchar(125),
    Totaal_budget int,
    Subsidiebedrag_min int,
    Subsidiebedrag_max int,
    Bijzonderheid varchar(300),
    Subsidiepercentage_min int,
    Subsidiepercentage_max int,
    Datum_open varchar(20),
    Datum_sluit varchar(20),
    Beoordeling_tender varchar(125),
    looptijdProject_jaren int
);