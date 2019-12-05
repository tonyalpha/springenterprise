open module SpringEnterprise {
    requires spring.core;
    requires spring.context;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.starter.jdbc;
    requires spring.jdbc;
    requires java.sql;
    requires java.persistence;
    requires spring.boot.starter.data.jpa;
    requires spring.tx;
    requires net.bytebuddy;
}