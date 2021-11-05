package com.loiane.cursojava.aula.aula46_InterfaceHerancaComparacao;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

    void abrirConexao();
    void fecharConexao();
}