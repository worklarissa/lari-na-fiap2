SET SERVEROUTPUT on;

--PROCEDURE
CREATE OR REPLACE PROCEDURE prd_calcular_fgts(
    valor NUMBER
) IS 
   salario NUMBER;--retornar o sal�rio descontado o fgts
BEGIN
    salario := fx_fgts(valor);
    dbms_output.put_line('O valor de FGTS de um sal�rio de: R$' || valor
                                                            || valor
                                                            || '� R$'
                                                            || salario);
END;

call prd_calcular_fgts(2000);

--Fun��o
CREATE OR REPLACE FUNCTION FX_FGTS (P_SAL NUMBER)
RETURN NUMBER IS
BEGIN
     RETURN p_sal * 0.08;
END;

SELECT fx_fgts(1000) FROM DUAL;


