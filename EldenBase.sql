-- CREATION OF DATABASE AND DROP DATABASE WHEN NEEDED --

create database EldenBase;
drop database EldenBase;

use EldenBase;

-- CREATION OF ALL DATABASE TABLES --

create table Enemy(
enemyID int primary key,
name varchar(200),
health int,
damage int
);

create table Inventory(
iID int primary key,
name varchar(200)
);

create table Mob(
enemyID int,
foreign key(enemyID) references Enemy(enemyID)
on update cascade
on delete cascade
);

create table Boss(
enemyID int,
abilitySet varchar(200),
foreign key(enemyID) references Enemy(enemyID)
on update cascade
on delete cascade
);

create table Weapon(
iID int primary key,
weaponDMG int,
weaponType varchar(200),
foreign key(iID) references Inventory(iID)
on update cascade
on delete cascade
);

create table Armor(
iID int,
defenceStat int,
foreign key(iID) references Inventory(iID)
on update cascade
on delete cascade
);

create table Class(
classID int primary key,
name varchar(200),
abilityType varchar(200)
);

create table NewGame(
newGameID int primary key,
goldMult float(2),
enemyStrMult float(2)
);

create table GameLevel(
levelID int primary key,
mobCount int,
mobID int,
bossID int,
weaponID int,
armorID int,
foreign key(mobID) references Mob(enemyID),
foreign key(bossID) references Boss(enemyID),
foreign key(weaponID) references Weapon(iID),
foreign key(armorID) references Armor(iID)
on update cascade
on delete cascade
);

create table PlayerCharacter(
characterID int primary key,
hours int,
xpLevel int,
classID int,
newGameID int,
levelID int,
foreign key(classID) references Class(classID),
foreign key(newGameID) references NewGame(newGameID),
foreign key(levelID) references GameLevel(levelID)
on update cascade
on delete cascade
);

create table Owned(
characterID int,
iID int,
isEquipped varchar(200),
primary key(characterID, iID),
foreign key(characterID) references PlayerCharacter(characterID),
foreign key(iID) references Inventory(iID)
on update cascade
on delete cascade
);

-- INSERTION OF DEFAULT DATABASE DATA / INITIAL POPULATION OF DATA --

insert into Enemy values (1, 'Foul Tarnished', 100000, 1000),
(2, 'Rick Soldier of God', 150000, 10000),
(3, 'Snek Man', 300000, 30000),
(4, 'Margerine', 500000, 50000),
(5, 'The Elder Beast', 1500000, 100000), 
(11, 'Withered Man', 100, 5),
(12, 'Creepy', 200, 20),
(13, 'Spooder', 500, 50),
(14, 'Knight', 1000, 100),
(15, 'SpellCaster', 2000, 500);

insert into Mob values (11),
(12),
(13),
(14),
(15);

insert into Boss values (1, 'Grafted Giant'),
(2, 'Knight'),
(3, 'Twisty Moves'),
(4, 'Hammer Slap'),
(5, 'Lazaar Beam');

insert into Inventory values (100, 'Barehanded'),
(101, 'Rusty Shortsword'),
(102, 'Greatsword'),
(103, 'Light Hammer'),
(104, 'Blood Katana'),
(105, 'BONK Hammer'),
(106, 'Goat Armor'),
(107, 'Samarai Robes'),
(108, 'Knights Armor'),
(109, 'Caster Nightgown'),
(110, 'Thieves Veil'),
(111, 'Naked');

insert into Weapon values (100, 10, 'Fist'),
(101, 50, 'Sword'),
(102, 300, 'Greatsword'),
(103, 400, 'Warhammer'),
(104, 5000, 'Sword'),
(105, 100000, 'Colossal Weapon');

insert into Armor values (106, 100000),
(107, 500),
(108, 500000),
(109, 200),
(110, 1000),
(111, 0);

insert into Class values (201, 'Wretch', 'None'),
(202, 'Mage', 'Burst Cast'),
(203, 'Noble', 'Stalwart'),
(204, 'Barbarian', 'Rage'),
(205, 'Rogue', 'Invisibility');

insert into NewGame values (300, 1.0, 1.0),
(301, 1.2, 1.2),
(302, 1.5, 1.75),
(303, 2.5, 3.0),
(304, 4.0, 7.0),
(305, 5.0, 10.0);

insert into GameLevel values (501, 10, 11, 1, 101, 109),
(502, 15, 12, 2, 102, 107),
(503, 20, 13, 3, 103, 110),
(504, 30, 14, 4, 104, 106),
(505, 50, 15, 5, 105, 108);

insert into PlayerCharacter values (1001, 0, 1, 201, 300, 501),
(1002, 120, 150, 203, 305, 505);

insert into Owned values
(1001, 100, 'Yes'),
(1001, 111, 'Yes'),
(1002, 105, 'Yes'),
(1002, 108, 'Yes'),
(1002, 100, 'No'),
(1002, 101, 'No'),
(1002, 102, 'No'),
(1002, 103, 'No'),
(1002, 104, 'No'),
(1002, 106, 'No'),
(1002, 107, 'No'),
(1002, 109, 'No'),
(1002, 110, 'No'),
(1002, 111, 'No');

-- TEST PRINTING OUT EVERY TABLE --
select * from Enemy;
select * from Mob;
select * from Boss;
select * from Inventory;
select * from Weapon;
select * from Armor;
select * from Class;
select * from NewGame;
select * from GameLevel;
select * from PlayerCharacter;
select * from Owned;
