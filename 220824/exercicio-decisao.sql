set SERVEROUTPUT on;
DECLARE
    valor varchar2(20) := &DigiteUmValor;
BEGIN
    IF mod(valor, 2) = 0 THEN
        dbms_output.put_line('O n�mero � par');
    ELSE
        dbms_output.put_line('O numero � impar');
    END IF;
END;