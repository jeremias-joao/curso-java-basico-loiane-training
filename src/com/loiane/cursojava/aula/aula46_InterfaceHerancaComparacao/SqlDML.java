package com.loiane.cursojava.aula.aula46_InterfaceHerancaComparacao;

public interface SqlDML {

    void select(String query);
    void insert(String query);
    void delete(String query);
    void update(String query);
}