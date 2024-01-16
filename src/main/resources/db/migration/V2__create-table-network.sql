/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  marti
 * Created: 16 ene 2024
 */

CREATE TABLE network(
ID BIGINT NOT NULL AUTO_INCREMENT,
NAME VARCHAR(50) NOT NULL,
ICON VARCHAR(100) NOT NULL,
URL VARCHAR(255) NOT NULL,
IS_SOFT BOOLEAN NOT NULL,
USER_ID BIGINT NOT NULL,
PRIMARY KEY(ID),
CONSTRAINT FK_UserNetwork FOREIGN KEY(USER_ID) REFERENCES `USER`(ID)
)