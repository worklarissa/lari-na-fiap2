set SERVEROUTPUT on;
--Exercicio 1
BEGIN
    FOR X IN (
        SELECT
            a.cod_produto,
            SUM(val_total_pedido) qtd
        FROM
                movimento_estoque a
        WHERE
            a.cod_produto = &produto
        GROUP BY
            a.cod_produto,
    )LOOP
        dbms_output.put_line('O produto de Código'
                                || x.cod_produto
                                ||' Com descrição'
                                || x.nom_produto
                                || ' Tem o Total de: '
                                || x.qtd
                                || ' produtos no estoque');
    END LOOP;
END;

--Exercicio 2
BEGIN
    FOR I IN (
        SELECT
            hp.cod_cliente,
            cli.nom_cliente,
            round (AVG (hp.val_total_pedido), 2) media
        FROM
                historico_pedido hp
            INNER JOIN cliente cli ON hp.cod_cliente = cli.cod_cliente
        WHERE
            hp.cod_cliente = &cliente
        GROUP BY
            hp.cod_cliente,
            cli.nom_cliente
    )LOOP
        dbms_output.put_line('O cliente de nome '
                                || i.nom_cliente
                                ||' Teve a media de '
                                || i.media
                                || ' de compras');
    END LOOP;
END;


--Exercício 3
SELECT * FROM PRODUTO_COMPOSTO WHERE STA_ATIVO = 'S';

--Exercício 4
    