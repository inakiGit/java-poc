/*
java.sql contains all JDBC classes / interfaces needed for database programming
java.sql only defines behaviour, the actual implementation is done by a third party DRIVER
The DRIVER implements the interfaces defined in the java.sql package
*/

package com.thales.store.JDBC;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Database {

    private String host = "jdbc:postgresql://localhost:5432/postgres";

    private String name = "postgres";

    private String pass = "caudillo";

    Database(String host, String name, String pass) {
        this.host = host;
        this.name = name;
        this.pass = pass;
    }

}
