create or replace PROCEDURE prc_insere_pedido_rm552628 (
                                                            p_cod_pedido             pedido.cod_pedido%TYPE,
                                                            p_cod_pedido_relacionado pedido.cod_pedido%TYPE,
                                                            p_cod_cliente            pedido.cod_cliente%TYPE,
                                                            p_cod_usuario            pedido.cod_usuario%TYPE,
                                                            p_cod_vendedor           pedido.cod_vendedor%TYPE,
                                                            p_dat_pedido             pedido.dat_pedido%TYPE,
                                                            p_dat_cancelamento       pedido.dat_cancelamento%TYPE,
                                                            p_dat_entrega            pedido.dat_entrega%TYPE,
                                                            p_val_total_pedido       pedido.val_total_pedido%TYPE,
                                                            p_val_desconto           pedido.val_desconto%TYPE,
                                                            p_seq_endereco_cliente   pedido.seq_endereco_cliente%TYPE
) IS
    raise_application_error EXCEPTION;
    raise_application_error1 EXCEPTION;
    raise_application_error2 EXCEPTION;
BEGIN
        IF P_DAT_PEDIDO > P_DAT_ENTREGA THEN
            raise RAISE_APPLICATION_ERROR;
        elsif P_DAT_PEDIDO > sysdate THEN
            raise RAISE_APPLICATION_ERROR1;
        elsif P_VAL_TOTAL_PEDIDO <= 0 THEN
            raise RAISE_APPLICATION_ERROR2;
        end if;

    INSERT INTO pedido (
        cod_pedido,
        cod_pedido_relacionado,
        cod_cliente,
        cod_usuario,
        cod_vendedor,
        dat_pedido,
        dat_cancelamento,
        dat_entrega,
        val_total_pedido,
        val_desconto,
        seq_endereco_cliente
    ) VALUES (
        p_cod_pedido,
        p_cod_pedido_relacionado,
        p_cod_cliente,
        p_cod_usuario,
        p_cod_vendedor,
        p_dat_pedido,
        p_dat_cancelamento,
        p_dat_entrega,
        p_val_total_pedido,
        p_val_desconto,
        p_seq_endereco_cliente
    );

    COMMIT;

  EXCEPTION
        WHEN RAISE_APPLICATION_ERROR THEN
            DBMS_OUTPUT.PUT_LINE(' A data do pedido não pode ser maior que a data da entrega');
         WHEN RAISE_APPLICATION_ERROR1 THEN
            DBMS_OUTPUT.PUT_LINE(' A data do pedido não pode ser maior que a data do sistema');
         WHEN RAISE_APPLICATION_ERROR2 THEN
            DBMS_OUTPUT.PUT_LINE(' O valor do pedido não pode ser menor que 0');
            

END PRC_INSERE_PEDIDO_RM552628;


