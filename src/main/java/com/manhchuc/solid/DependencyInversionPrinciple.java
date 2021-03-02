package com.manhchuc.solid;

public class DependencyInversionPrinciple {
    /**
     * Software modules instead of high-level modules depending on low-level modules, both will depend on abstractions.
     */
    class HttpClient {
        void doRequest() {
        }
    }

    class DatabaseClient {
        void doQuery() {
        }
    }

    class Employee {
        private final HttpClient httpClient;
        private final DatabaseClient databaseClient;

        Employee(HttpClient httpClient, DatabaseClient databaseClient) {
            this.httpClient = httpClient;
            this.databaseClient = databaseClient;
        }

        void getInfo() {
            this.httpClient.doRequest();
            this.databaseClient.doQuery();
            // TODO
        }
    }
}
