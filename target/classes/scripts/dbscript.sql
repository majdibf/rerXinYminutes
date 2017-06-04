DROP table Destination;
DROP table Ligne;

CREATE
  TABLE Destination
  (
    id          INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) ,
    numero      INTEGER ,
    designation CHAR (50) ,
    id_ligne    INTEGER NOT NULL
  ) ;
ALTER TABLE Destination ADD CONSTRAINT Destination_PK PRIMARY KEY ( id ) ;


CREATE
  TABLE Ligne
  (
    id          INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) ,
    designation CHAR (30) ,
    actif       boolean ,
    cssStyle    CHAR (30)
  ) ;
ALTER TABLE Ligne ADD CONSTRAINT Ligne_PK PRIMARY KEY ( id ) ;


ALTER TABLE Destination ADD CONSTRAINT Destination_Ligne_FK FOREIGN KEY (
id_ligne ) REFERENCES Ligne ( id ) ON
DELETE CASCADE ;

INSERT INTO LIGNE(designation, actif, cssStyle ) VALUES('A',true,'rer ligneA');
INSERT INTO LIGNE(designation, actif, cssStyle ) VALUES('B',true,'rer ligneB');
INSERT INTO LIGNE(designation, actif, cssStyle ) VALUES('C',false,'rer ligneC');
INSERT INTO LIGNE(designation, actif, cssStyle ) VALUES('D',false,'rer ligneD');
INSERT INTO LIGNE(designation, actif, cssStyle ) VALUES('E',false,'rer ligneE');

select * from ligne;