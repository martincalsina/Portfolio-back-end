/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  marti
 * Created: 16 ene 2024
 */

CREATE TABLE education(
ID BIGINT NOT NULL AUTO_INCREMENT,
INSTITUTION VARCHAR(150) NOT NULL,
TITLE VARCHAR(150) NOT NULL,
DESCRIPTION VARCHAR(300) NOT NULL,
START_DATE TIMESTAMP NOT NULL,
END_DATE DATETIME DEFAULT NULL,
USER_ID BIGINT NOT NULL,
PRIMARY KEY(ID),
CONSTRAINT FK_UserEducation FOREIGN KEY(USER_ID) REFERENCES `user`(ID)
)

