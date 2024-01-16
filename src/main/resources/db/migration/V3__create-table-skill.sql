/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  marti
 * Created: 16 ene 2024
 */

CREATE TABLE skill(
ID BIGINT NOT NULL AUTO_INCREMENT,
NAME VARCHAR(100) NOT NULL,
DESCRIPTION VARCHAR(500),
ICON VARCHAR(100),
USER_ID BIGINT NOT NULL,
PRIMARY KEY(ID),
CONSTRAINT FK_UserSkill FOREIGN KEY(USER_ID) REFERENCES `USER`(ID)
)
