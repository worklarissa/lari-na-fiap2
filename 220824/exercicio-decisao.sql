set SERVEROUTPUT on;
DECLARE
    valor varchar2(20) := &DigiteUmValor;
BEGIN
    IF mod(valor, 2) = 0 THEN
        dbms_output.put_line('O número é par');
    ELSE
        dbms_output.put_line('O numero é impar');
    END IF;
END;