-- Criando a tabela a partir da tabela do professor
CREATE TABLE TB_VENDAS AS
    SELECT * FROM PF1788.tabela_de_vendas WHERE 1=2;
    
--Inserindo dados na tabela criada(mocando dados)
INSERT INTO TB_VENDAS SELECT * FROM PF1788.tabela_de_vendas;

--Criando ou renomeando a procedure
CREATE OR REPLACE PROCEDURE prd_deletar_pedido(
--Parametro para referenciar um dado específico da tabela
    pcod_pedido NUMBER
)IS --começo da procedure
    contador NUMBER := 0;
--inicio da lógica
BEGIN
--entrando no loop
--Enquanto o cod_pedido >= 100 vai subir pro loop
    FOR x IN (SELECT * FROM pedido WHERE cod_pedido >= 100) LOOP

        DELETE FROM pedido WHERE cod_pedido = x.cod_pedido;
--A cada 154 linhas ele vai operar o loop e resetar o contador
        IF MOD(contador, 154) = 0 THEN
            contador := contador + 1;
            COMMIT;
        END IF;
    END LOOP;
END prd_deletar_pedido;

--para executar a procedure
CALL prd_deletar_pedido;
EXECUTE prd_deletar_pedido;
EXEC prd_deletar_pedido;



CREATE OR REPLACE PROCEDURE prd_deletar_pedido
IS
    contador NUMBER := 0;
BEGIN
    FOR x IN (SELECT * FROM TB_VENDAS) LOOP
        DELETE FROM TB_VENDAS WHERE cod_pedido = x.cod_pedido;
        IF MOD(contador, 100) = 0 THEN
            contador := contador + 1;
            COMMIT;
        END IF;
    END LOOP;
END prd_deletar_pedido;

SELECT * FROM PEDIDO WHERER 