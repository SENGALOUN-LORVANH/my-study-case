Create table tbProduct (
productID varchar(14) not null,
productName varchar(30),
price int,
qty float,
unitID int,
categoryID int,
conditionCheck int,
constraint pk_productID primary key(productID),
constraint fk_unitID foreign key(unitID) references tbUnit,
constraint fk_category foreign key(categoryID) references tbCategory
)

create table tbUnit
(
	unitID int not null,
	unitName nvarchar (10)
	constraint pk_unitID primary key (unitID)
)