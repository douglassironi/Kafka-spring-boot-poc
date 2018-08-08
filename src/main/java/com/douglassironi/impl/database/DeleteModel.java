package com.douglassironi.impl.database;

import lombok.Data;

@Data
public class DeleteModel {


    private final String comandoSql;
    private final String tableName;

    public DeleteModel(String tableName, String comandoSql){
        this.comandoSql = comandoSql + " "+tableName;
        this.tableName  = tableName;
    }

    @Override
    public String toString(){
        return this.comandoSql;
    }

}
