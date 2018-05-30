CREATE TABLE T_Produto (
    id int NOT NULL AUTO_INCREMENT primary key,
    valor double,
    qtda_estoque int
);

insert into T_Produto(valor, qtda_estoque)
values(450.0, 5),(235.5, 5),(15.5, 5),
(10.5, 5),(25, 5),(6.5, 5),(17, 5),
(22.5, 5),(700, 5),(275.5, 5);