SET SERVEROUTPUT on;

--PROCEDURE
CREATE OR REPLACE PROCEDURE prd_calcular_fgts(
    valor NUMBER
) IS 
   salario NUMBER;--retornar o salário descontado o fgts
BEGIN
    salario := fx_fgts(valor);
    dbms_output.put_line('O valor de FGTS de um salário de: R$' || valor
                                                            || valor
                                                            || 'é R$'
                                                            || salario);
END;

call prd_calcular_fgts(2000);

--Função
CREATE OR REPLACE FUNCTION FX_FGTS (P_SAL NUMBER)
RETURN NUMBER IS
BEGIN
     RETURN p_sal * 0.08;
END;

SELECT fx_fgts(1000) FROM DUAL;


