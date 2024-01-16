/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  marti
 * Created: 16 ene 2024
 */

CREATE TABLE `user`(
ID BIGINT NOT NULL AUTO_INCREMENT,
EMAIL VARCHAR(100) NOT NULL UNIQUE,
PASSOWRD VARCHAR(100) NOT NULL,
NAME VARCHAR(150) NOT NULL,
HEADLINE VARCHAR(150),
DESCRIPTION VARCHAR(500),
PICTURE VARCHAR(255),
PRIMARY KEY(ID)
)

