set SERVEROUTPUT on;
DECLARE
    carro_valor NUMBER := &ValordoCarro;
    Entrada NUMBER;
    
BEGIN
    Parcela := (carro_valor * 1.03) / 10;
    dbms_output.put_line('O valor de cada parcela ser�: R$' ||parcela);
END;

--Exerc�cio 4
set SERVEROUTPUT on;
DECLARE
    valor NUMBER := &digiteumvalor;
    entrada NUMBER := valor * 0.20;
    parcelas NUMBER := &parcelas;
    
BEGIN
    dbms_output.put_line('O valor do carro: R$' || valor);
    dbms_output.put_line('O valor da entrada: R$' || entrada);
    dbms_output.put_line('O valor de cada parcela em' 
                            || parcelas
                            || 'Vezes �'
                            || 'R$:'
                            || ((valor - entrada)/ 10) * 1.10);
    dbms_output.put_line('Valor total do carro financiado � R$'
                        || ((((valor - entrada)) * 1.10) + entrada));
END;

--Exemplo tomada de decis�o
set SERVEROUTPUT on;
DECLARE
    genero varchar2(20) := '%DigiteUmValor';
BEGIN
    IF upper(genero) = 'M' THEN
        dbms_output.put_line('O genero informado � masculino');
    ELSIF upper(genero) = 'F' THEN
        dbms_output.put_line('O genero informado � feminino');
    ELSE
        dbms_output.put_line('Valor digitado inv�lido');
    END IF;
END;
    
    

    



