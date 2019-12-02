CREATE TABLE IF NOT EXISTS Beers
(
    Id         INTEGER NOT NULL,
    Name       VARCHAR(100),
    BrewerId   INTEGER,
    CategoryId INTEGER,
    Price      FLOAT,
    Stock      INTEGER,
    Alcohol    FLOAT,
    Version    INTEGER,
    Image      BINARY,
    PRIMARY KEY (Id)
);
CREATE TABLE IF NOT EXISTS Brewers
(
    Id       INTEGER NOT NULL,
    Name     VARCHAR(50),
    Address  VARCHAR(50),
    ZipCode  VARCHAR(6),
    City     VARCHAR(50),
    Turnover INTEGER,
    PRIMARY KEY (Id)
);
CREATE TABLE IF NOT EXISTS Categories
(
    Id       INTEGER NOT NULL,
    Category VARCHAR(50),
    PRIMARY KEY (Id)
);

CREATE TABLE IF NOT EXISTS BeerOrders
(
    Id   INTEGER NOT NULL,
    Name VARCHAR(100),
    PRIMARY KEY (Id)
);

CREATE TABLE IF NOT EXISTS BeerOrderItems
(
    Id          INTEGER NOT NULL,
    Name        VARCHAR(100),
    Number      INTEGER,
    BeerId      INTEGER,
    BeerOrderId INTEGER,
    PRIMARY KEY (Id)
);
