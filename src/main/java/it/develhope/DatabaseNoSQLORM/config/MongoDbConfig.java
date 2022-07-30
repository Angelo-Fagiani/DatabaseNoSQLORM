package it.develhope.DatabaseNoSQLORM.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoDbConfig extends AbstractMongoClientConfiguration {
    @Override
    protected String getDatabaseName() {
        return "develhope";
    }

    //metodo necessario per creare la connessione al nostro mongoDb
    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://angelofag95:1gcF9tISRoNT3ioO@cluster0.wrv1s.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }

    //questo metodo serve per dire alla nostra applicazione che l'entità del mio mongoDb vengano prese da questi packages
    @Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singleton("it.develhope");
    }
}
