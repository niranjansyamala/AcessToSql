package com.kagami;

import com.kagami.access.AccessConnection;

public class DbConnectionUtils {
    public static void main(String[] args) {
        AccessConnection sql = new AccessConnection();
        sql.getAccessConnection();
    }
}
