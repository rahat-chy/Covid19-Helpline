create table Hospital
(
HospitalID int IDENTITY(1,1) PRIMARY KEY,
HospitalName varchar (255) NOT NULL,
HospitalAddress varchar (255) NOT NULL,
HospitalContactNo varchar (20) NOT NULL,
NumberofICU int NULL  DEFAULT  0,
NumberofAmbulance int NULL  DEFAULT  0
);



INSERT INTO Hospital (HospitalName, HospitalAddress, HospitalContactNo, NumberofICU, NumberofAmbulance ) 
VALUES ('IBN SINA Hospital', 'Dhanmondi 9/A','10615', 10, 12),
       ('Lab Aid Hospital', 'City College Road','+88029676356', 8 , 10),
	   ('Popular Hospital', 'City College Road','09613787801', 7 , 11),
	   ('United Hospital', 'Gulshan-2','10666', 12 , 15),
	   ('Bangladesh Specialized Hospital', 'Dhanmondi','10633', 6 , 9),
	   ('Delta Hospital', 'Mirpur-1','+8802-58050661', 5 , 8),
	   ('Shahid Suhrawardy Hospital', 'Sher-e-Banglanagar, Collegegate','9122560-78', 7 , 10),
	   ('Ad-Din Hospital', 'Moghbazar','9353391-3', 4 , 7),
	   ('Al-Manar Hospital', 'Lalmatia','9121588', 5 , 8),
	   ('Appolo Hospital', 'Mohammadpur','8152549', 8 , 12),
	   ('Birdem', 'Shahbagh','8616641-50', 10 , 13),
	   ('CMH', 'Dhaka Cantonment','882770', 9 , 11),
	   ('Anwar Khan Modern Hospital', 'Dhanmondi-08','+8802 -9661213', 10 , 14),
       ('Square Hospital', 'Panthopath','10616', 6 , 8)


create table Ambulance
(
AmbulanceID int IDENTITY(1,1) PRIMARY KEY,
HospitalID int,
AmbulanceMobileNo varchar (20) NOT NULL,
AmbulanceAvailability varchar (5) check (AmbulanceAvailability in ('Yes', 'No')),
AmbulanceRent int NOT NULL,
foreign key (HospitalID) references Hospital on delete set null);



INSERT INTO Ambulance (HospitalID, AmbulanceMobileNo, AmbulanceAvailability, AmbulanceRent ) 
VALUES (1, '01551101691','Yes', 1000),
       (2, '01552101691','Yes', 1100),
       (3, '01553101691','No', 800),
	   (4, '01554101691','Yes', 850),
	   (5, '01555101691','Yes', 900),
	   (6, '01556101691','No', 950),
	   (7, '01557101691','Yes', 1000),
	   (8, '01558101691','Yes', 1050),
	   (9, '01559101691','No', 875),
	   (10, '01560101691','Yes', 930),
	   (11, '01561101691','No', 950),
	   (12, '01562101691','No', 975),
	   (13, '01563101691','Yes', 1000),
	   (14, '01564101691','Yes', 1150),
	   (1, '01551101692','Yes', 1000),
	   (1, '01551101693','Yes', 1000),
	   (1, '01551101694','Yes', 1000),
	   (1, '01551101695','No', 1000),
	   (1, '01551101696','Yes', 1000),
	   (1, '01551101697','Yes', 1000),
	   (1, '01551101698','Yes', 1000),
	   (1, '01551101700','Yes', 1000),
	   (1, '01551101701','No', 1000),
	   (1, '01551101702','Yes', 1000),
	   (1, '01551101692','Yes', 1000),
           (2, '01552101692','Yes', 1100),
	   (2, '01552101693','No', 1100),
	   (2, '01552101694','Yes', 1100),
	   (2, '01552101695','Yes', 1100),
	   (2, '01552101696','Yes', 1100),
	   (2, '01552101697','No', 1100),
	   (2, '01552101698','Yes', 1100),
	   (2, '01552101699','Yes', 1100),
	   (2, '01552101700','Yes', 1100),
           (3, '01553101692','No', 800),
	   (3, '01553101693','No', 800),
	   (3, '01553101694','Yes', 800),
	   (3, '01553101695','No', 800),
	   (3, '01553101696','No', 800),
	   (3, '01553101697','Yes', 800),
	   (3, '01553101698','No', 800),
	   (3, '01553101699','No', 800),
	   (3, '01553101700','Yes', 800),
	   (3, '01553101701','No', 800),
	   (4, '01554101692','Yes', 850),
	   (4, '01554101693','Yes', 850),
	   (4, '01554101694','No', 850),
	   (4, '01554101695','Yes', 850),
	   (4, '01554101696','Yes', 850),
	   (4, '01554101697','Yes', 850),
	   (4, '01554101698','Yes', 850),
	   (4, '01554101699','Yes', 850),
	   (4, '01554101700','Yes', 850),
	   (4, '01554101701','Yes', 850),
	   (4, '01554101702','Yes', 850),
	   (4, '01554101703','No', 850),
	   (4, '01554101704','Yes', 850),
	   (4, '01554101705','Yes', 850),
	   (5, '01555101692','Yes', 900),
	   (5, '01555101693','Yes', 900),
	   (5, '01555101694','No', 900),
	   (5, '01555101695','Yes', 900),
	   (5, '01555101696','Yes', 900),
	   (5, '01555101697','Yes', 900),
	   (5, '01555101698','Yes', 900),
	   (5, '01555101699','Yes', 900),
	   (6, '01556101692','No', 950),
	   (6, '01556101693','Yes', 950),
	   (6, '01556101694','No', 950),
	   (6, '01556101695','No', 950),
	   (6, '01556101696','Yes', 950),
	   (6, '01556101697','No', 950),
	   (6, '01556101698','No', 950),
	   (7, '01557101692','Yes', 1000),
	   (7, '01557101693','Yes', 1000),
	   (7, '01557101694','Yes', 1000),
	   (7, '01557101695','No', 1000),
	   (7, '01557101696','Yes', 1000),
	   (7, '01557101697','Yes', 1000),
	   (7, '01557101698','Yes', 1000),
	   (7, '01557101699','Yes', 1000),
	   (7, '01557101700','Yes', 1000),
	   (8, '01558101692','No', 1050),
	   (8, '01558101693','Yes', 1050),
	   (8, '01558101694','Yes', 1050),
	   (8, '01558101695','Yes', 1050),
	   (8, '01558101696','Yes', 1050),
	   (8, '01558101697','Yes', 1050),
	   (9, '01559101692','No', 875),
	   (9, '01559101693','Yes', 875),
	   (9, '01559101694','No', 875),
	   (9, '01559101695','No', 875),
	   (9, '01559101696','Yes', 875),
	   (9, '01559101697','No', 875),
	   (9, '01559101698','No', 875),
	   (10, '01560101692','Yes', 930),
	   (10, '01560101693','Yes', 930),
	   (10, '01560101694','No', 930),
	   (10, '01560101695','Yes', 930),
	   (10, '01560101696','Yes', 930),
	   (10, '01560101697','Yes', 930),
	  (10, '01560101698','Yes', 930),
	  (10, '01560101699','Yes', 930),
	  (10, '01560101700','No', 930),
	  (10, '01560101701','Yes', 930),
	   (10, '01560101702','Yes', 930),
	   (11, '01561101692','No', 950),
	   (11, '01561101693','No', 950),
	   (11, '01561101694','No', 950),
	   (11, '01561101695','Yes', 950),
	   (11, '01561101696','No', 950),
	   (11, '01561101697','No', 950),
	   (11, '01561101698','No', 950),
	   (11, '01561101699','No', 950),
	   (11, '01561101700','No', 950),
	   (11, '01561101701','Yes', 950),
	   (11, '01561101702','No', 950),
	   (11, '01561101703','No', 950),
	   (12, '01562101692','No', 975),
	   (12, '01562101693','Yes', 975),
	   (12, '01562101694','No', 975),
	   (12, '01562101695','No', 975),
	   (12, '01562101696','Yes', 975),
	   (12, '01562101697','No', 975),
	   (12, '01562101698','No', 975),
	   (12, '01562101699','No', 975),
	   (12, '01562101700','No', 975),
	   (12, '01562101701','No', 975),
	   (13, '01563101692','Yes', 1000),
	   (13, '01563101693','Yes', 1000),
	   (13, '01563101694','Yes', 1000),
	   (13, '01563101695','No', 1000),
	   (13, '01563101696','Yes', 1000),
	   (13, '01563101697','Yes', 1000),
	   (13, '01563101698','Yes', 1000),
	   (13, '01563101699','Yes', 1000),
	   (13, '01563101700','Yes', 1000),
	   (13, '01563101701','No', 1000),
	   (13, '01563101702','Yes', 1000),
	   (13, '01563101703','Yes', 1000),
	   (13, '01563101704','Yes', 1000),
	   (14, '01564101692','Yes', 1150),
	   (14, '01564101693','Yes', 1150),
	   (14, '01564101694','Yes', 1150),
	   (14, '01564101695','No', 1150),
	   (14, '01564101696','Yes', 1150),
	   (14, '01564101697','Yes', 1150),
	   (14, '01564101698','Yes', 1150)

create table Doctor
(
DoctorID int IDENTITY(1,1) PRIMARY KEY,
HospitalID int,
DoctorName varchar (255) NOT NULL,
DoctorGender varchar (10) check (DoctorGender in ('Male', 'Female')),
DoctorMobileNo varchar (20) NOT NULL,
DoctorAvailableDay varchar (20) check (DoctorAvailableDay in ('Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday')),
DoctorAvailableTime time NOT NULL,
foreign key (HospitalID) references Hospital on delete set null);



INSERT INTO Doctor (HospitalID, DoctorName, DoctorGender, DoctorMobileNo, DoctorAvailableDay , DoctorAvailableTime) 
VALUES (1, 'Rahat Chowdhury','Male', '01553388001' , 'Monday' , '20:00'),
       (2, 'Kamrozzaman Bhuiyan','Male', '01553388002' , 'Thursday' , '20:30'),
       (1, 'Rakibul Islam','Male', '01553388005' , 'Monday' , '19:30'),
	   (1, 'Firoz Ahmed','Male', '01553388003' , 'Tuesday' , '17:00'),
	   (2, 'Salma Rouf','Female', '01553388004' , 'Friday' , '18:00'),
	   (3, 'Rahim Ali','Male', '01553388006' , 'Wednesday' , '18:30'),
	   (3, 'Suraiya Islam','Female', '01553388019' , 'Saturday' , '18:30'),
	   (4, 'Anika Tasnim','Female', '01553388007' , 'Saturday' , '20:30'),
	   (4, 'Anik Chowdhury','Male', '01553388020' , 'Sunday' , '21:30'),
	   (5, 'Tonmoy Hossain','Male', '01553388008' , 'Sunday' , '20:00'),
	   (5, 'Anupama Hossain','Female', '01553388021' , 'Monday' , '20:30'),
	   (6, 'Fatima Hossain','Female', '01553388009' , 'Monday' , '20:00'),
	   (6, 'Chomok Hassan','Male', '01553388022' , 'Tuesday' , '18:30'),
	   (7, 'Nafis Ayon','Male', '01553388010' , 'Wednesday' , '20:30'),
	   (7, 'Nishat Tasnim','Female', '01553388023' , 'Thursday' , '1930'),
	   (8, 'Nazmus Sakib','Male', '01553388011' , 'Monday' , '20:00'),
	   (8, 'Tunazzina Islam','Female', '01553388024' , 'Wednesday' , '17:30'),
	   (9, 'Priyanka Das','Female', '01553388012' , 'Friday' , '19:00'),
	   (9, 'Srijon Das','Male', '01553388025' , 'Saturday' , '19:40'),
	   (10, 'Arifin Yasin','Male', '01553388013' , 'Sunday' , '20:30'),
	   (10, 'Sumaiya Shimu','Female', '01553388026' , 'Friday' , '19:30'),
	   (11, 'Nures Saba','Female', '01553388014' , 'Saturday' , '18:30'),
	   (11, 'Fahim Rahman','Male', '01553388027' , 'Monday' , '21:30'),
	   (12, 'Tamanna Sultana','Female', '01553388015' , 'Thursday' , '21:00'),
	   (12, 'Abdur Rafi','Male', '01553388028' , 'Tuesday' , '22:00'),
	   (13, 'Mahim Akram','Male', '01553388016' , 'Tuesday' , '21:30'),
	   (13, 'Mahima Rashid','Female', '01553388029' , 'Saturday' , '19:30'),
	   (14, 'Tausif Ahsan','Male', '01553388017' , 'Wednesday' , '20:00'),
	   (14, 'Nilima Yeasmin','Female', '01553388018' , 'Friday' , '20:00'),
	   (7, 'Rodoshi Shams','Female', '01553388030' , 'Monday' , '20:00')

create table Userr
(
UserId int PRIMARY KEY,
UserEmail varchar(255) NOT NULL,
DoctorID int,
UserName varchar (255) NOT NULL,
UserGender varchar (10) check (UserGender in ('Male', 'Female')),
UserAge int NOT NULL,
UserAddress varchar (255) NOT NULL,
UserBloodGroup varchar (10) check (UserBloodGroup in ('A+', 'B+' , 'A-' , 'B-' , 'O+' , 'O-' ,'AB+' , 'AB-' )),
UserMobileNo varchar (20) NOT NULL,
UserCovidStatus varchar (25) check (UserCovidStatus in ('Affected', 'Not Affected')),
UserAffectedDate date Null,
UserRecoveryDate date Null,
UserPassword varchar(255) NOT NULL,
foreign key (DoctorID) references Doctor on delete set null);






create table Plasma
(
UserID int PRIMARY KEY,
DonationStatus  varchar (5) check (DonationStatus in ('Yes', 'No')),
RecoverdSince int null,
AvailableForDonation  varchar (5) check (AvailableForDonation in ('Yes', 'No')),
foreign key (UserID) references Userr);





create table OxygenProvider
(
ProviderID int IDENTITY(1,1) PRIMARY KEY,
ProviderName varchar (255) NOT NULL,
ProviderAddress varchar (255) NOT NULL,
ProviderContactNo varchar (20) NOT NULL,
ProviderAvailableStock int NUll DEFAULT  0,
PricePerUnit int NOT NULL,
);



INSERT INTO OxygenProvider (ProviderName, ProviderAddress, ProviderContactNo, ProviderAvailableStock, PricePerUnit) 
VALUES ('Nafis Brothers','Shyamoli', '01553388111' , 15 , 2000),
       ('Zaman Brothers','Mohakhali', '01553388121' , 12 , 1900),
	   ('Angel Group','Dhanmondi', '01553388112' , 25 , 2050),
       ('Dimik Ltd','Gulshan', '01553388122' , 17 , 1950),
	   ('Nova Ltd','Mirpur', '01553388113' , 10 , 2100),
       ('KYC Group','Uttara', '01553388123' , 13 , 1950),
	   ('Ahmed Products','Motijheel', '01553388124' , 8 , 1850)

create table ICU
(
ICUID int IDENTITY(1,1) PRIMARY KEY,
HospitalID int,
ICUAvailability varchar (50) check (ICUAvailability in ('Available', 'Not Available')),
CostPerDay int NOT NULL,
foreign key (HospitalID) references Hospital on delete set null
);



INSERT INTO ICU (HospitalID, ICUAvailability, CostPerDay) 
VALUES (1, 'Available' , 1500 ),
		(1, 'Available' , 1500 ),
		(1, 'Available' , 1500 ),
		(1, 'Available' , 1500 ),
		(1, 'Not Available' , 1500 ),
		(1, 'Available' , 1500 ),
		(1, 'Available' , 1500 ),
		(1, 'Available' , 1500 ),
		(1, 'Not Available' , 1500 ),
		(1, 'Available' , 1500 ),
       		 (2, 'Not Available' , 1400 ),
		(2, 'Available' , 1400 ),
		(2, 'Available' , 1400 ),
		(2, 'Available' , 1400 ),
		(2, 'Not Available' , 1400 ),
		(2, 'Available' , 1400 ),
		(2, 'Not Available' , 1400 ),
		(2, 'Available' , 1400 ),
		(3, 'Available' , 1400 ),
		(3, 'Available' , 1400 ),
		(3, 'Not Available' , 1400 ),
		(3, 'Available' , 1400 ),
		(3, 'Available' , 1400 ),
		(3, 'Not Available' , 1400 ),
		(3, 'Available' , 1400 ),
		(4, 'Available' , 1400 ),
		(4, 'Available' , 1400 ),
		(4, 'Not Available' , 1400 ),
		(4, 'Available' , 1400 ),
		(4, 'Available' , 1400 ),
		(4, 'Available' , 1400 ),
		(4, 'Not Available' , 1400 ),
		(4, 'Available' , 1400 ),
		(4, 'Available' , 1400 ),
		(4, 'Available' , 1400 ),
		(4, 'Not Available' , 1400 ),
		(4, 'Available' , 1400 ),
		(5, 'Available' , 1400 ),
		(5, 'Not Available' , 1400 ),
		(5, 'Available' , 1400 ),
		(5, 'Available' , 1400 ),
		(5, 'Not Available' , 1400 ),
		(5, 'Available' , 1400 ),
		(6, 'Available' , 1400 ),
		(6, 'Available' , 1400 ),
		(6, 'Not Available' , 1400 ),
		(6, 'Available' , 1400 ),
		(6, 'Available' , 1400 ),
		(7, 'Available' , 1400 ),
		(7, 'Available' , 1400 ),
		(7, 'Not Available' , 1400 ),
		(7, 'Available' , 1400 ),
		(7, 'Available' , 1400 ),
		(7, 'Not Available' , 1400 ),
		(7, 'Available' , 1400 ),
		(8, 'Available' , 1600 ),
		(8, 'Available' , 1600 ),
		(8, 'Not Available' , 1600 ),
		(8, 'Available' , 1600 ),
		(9, 'Available' , 1550 ),
		(9, 'Available' , 1550 ),
		(9, 'Not Available' , 1550 ),
		(9, 'Available' , 1550 ),
		(9, 'Available' , 1550 ),
		(10, 'Available' , 1350 ),
		(10, 'Available' , 1350 ),
		(10, 'Not Available' , 1350 ),
		(10, 'Available' , 1350 ),
		(10, 'Available' , 1350 ),
		(10, 'Not Available' , 1350 ),
		(10, 'Available' , 1350 ),
		(10, 'Available' , 1350 ),
		(11, 'Available' , 1450 ),
		(11, 'Available' , 1450 ),
		(11, 'Not Available' , 1450 ),
		(11, 'Available' , 1450 ),
		(11, 'Available' , 1450 ),
		(11, 'Not Available' , 1450 ),
		(11, 'Available' , 1450 ),
		(11, 'Available' , 1450 ),
		(11, 'Not Available' , 1450 ),
		(11, 'Available' , 1450 ),
		(12, 'Available' , 1550 ),
		(12, 'Available' , 1550 ),
		(12, 'Not Available' , 1550 ),
		(12, 'Available' , 1550 ),
		(12, 'Available' , 1550 ),
		(12, 'Available' , 1550 ),
		(12, 'Not Available' , 1550 ),
		(12, 'Available' , 1550 ),
		(12, 'Not Available' , 1550 ),
		(13, 'Not Available' , 1650 ),
		(13, 'Not Available' , 1650 ),
		(13, 'Available' , 1650 ),
		(13, 'Not Available' , 1650 ),
		(13, 'Available' , 1650 ),
		(13, 'Available' , 1650 ),
		(13, 'Not Available' , 1650 ),
		(13, 'Available' , 1650 ),
		(13, 'Not Available' , 1650 ),
		(13, 'Available' , 1650 ),
		(14, 'Available' , 1600 ),
		(14, 'Not Available' , 1600 ),
		(14, 'Available' , 1600 ),
		(14, 'Available' , 1600 ),
		(14, 'Available' , 1600 ),
		(14, 'Not Available' , 1600 )



create table Buys
(
PurchaseID int PRIMARY KEY,
UserID int,
ProviderID int,
Quantity int null Default 1,
PurchaseDate date Not Null,
foreign key (UserID) references Userr,
foreign key (ProviderID) references OxygenProvider
);

create table MessageTable
(
 MessageID int PRIMARY KEY,
 SenderID int,
 RecieverID int,
 Messagess VARCHAR(255),
 foreign key (SenderID) references Userr,
 foreign key (RecieverID) references Userr
);


SELECT * FROM Hospital;
SELECT * FROM Ambulance;
SELECT * FROM Doctor;
SELECT * FROM Userr;
SELECT * FROM Plasma;
SELECT * FROM OxygenProvider;
SELECT * FROM ICU;
SELECT * FROM Buys;
SELECT * FROM MessageTable;

SELECT Userr.UserName , Userr.UserBloodGroup , Userr.UserMobileNo , Userr.UserAddress , MessageTable.Messagess FROM Userr JOIN MessageTable ON Userr.UserId = MessageTable.RecieverID WHERE MessageTable.SenderID = '3';



SELECT UserCovidStatus FROM Userr WHERE Userr.UserId = 3;
SELECT UserName,UserBloodGroup,UserMobileNo,UserRecoveryDate,DonationStatus,AvailableForDonation FROM Userr JOIN Plasma ON Userr.Userid = Plasma.UserID WHERE UserBloodGroup = 'O+';
SELECT UserName,UserBloodGroup,UserMobileNo,UserRecoveryDate,DonationStatus,AvailableForDonation FROM Userr JOIN Plasma ON Userr.Userid = Plasma.UserID WHERE UserAddress = 'Lalmatia' ;
SELECT UserName,UserBloodGroup,UserMobileNo,UserRecoveryDate,DonationStatus,AvailableForDonation FROM Userr JOIN Plasma ON Userr.Userid = Plasma.UserID WHERE UserBloodGroup = 'O+' AND UserAddress = 'Lalmatia' ;

SELECT OxygenProvider.ProviderName , OxygenProvider.ProviderAddress , OxygenProvider.ProviderContactNo , OxygenProvider.PricePerUnit , Buys.PurchaseID , Buys.PurchaseDate , Buys.Quantity FROM Buys JOIN OxygenProvider ON Buys.ProviderID = OxygenProvider.ProviderID WHERE Buys.UserID = 1;
/*DROP TABLE Buys;
DROP TABLE ICU;
DROP TABLE OxygenProvider;
DROP TABLE Plasma;
DROP TABLE Userr;
DROP TABLE Doctor;
DROP TABLE Ambulance;
DROP TABLE Hospital;
DROP TABLE Message;*/

/*INSERT INTO Plasma (UserID, DonationStatus) 
VALUES (1, 'No'),
       (2, 'No'),
       (3, 'Yes')*/





select * from Buys
