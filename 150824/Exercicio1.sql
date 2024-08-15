set SERVEROUTPUT on;
DECLARE
    v_nome varchar2(30);
    v_idade number := 39;
BEGIN
    v_nome := 'Larissa';
    dbms_output.put_line('Nome: ' || v_nome || ' Idade: ' || v_idade);
END;

set SERVEROUTPUT on;
DECLARE
    v_number1 number := 10;
    v_number2 number := 8;
BEGIN
    dbms_output.put_line(v_number1/ v_number2);
END;

--Exercício 1
set SERVEROUTPUT on;

DECLARE
    v_salario number := 1412;
    v_porc number := 0.25;
BEGIN
    dbms_output.put_line((v_salario * v_porc)+ v_salario);
END;
