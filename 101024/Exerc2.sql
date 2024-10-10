CREATE OR REPLACE FUNCTION FUN_CONSULTA_PED_RM552628(P_COD_PEDIDO number)
    RETURN NUMBER IS
    
    val_pedido NUMBER;
    erroexiste exception;    
BEGIN
    SELECT COD_PEDIDO INTO val_pedido FROM PEDIDO WHERE COD_PEDIDO = P_COD_PEDIDO;
    
    if val_pedido is null then
    raise erroexiste;
    end if;
    
EXCEPTION
    when erroexiste then
        DBMS_OUTPUT.PUT_LINE(' O código não existe');
end;



    

    
    