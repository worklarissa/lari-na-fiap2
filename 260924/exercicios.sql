DECLARE
    minhaexe EXCEPTION;
    n NUMBER := 10;
BEGIN
    FOR i IN 1..n LOOP
        dbms_output.put_line(i * n);
        IF i * 2 = 10 THEN
            RAISE minhaexe;
        END IF;
    END LOOP;
EXCEPTION
    WHEN minhaexe THEN
        raise_application_error(-20015, 'Voc� caiu na execu��o');
END;

--Criar uma procedure para realizar um novo pedido e colocar uma execption para que o novo pedido n�o seja maior que a data atual.