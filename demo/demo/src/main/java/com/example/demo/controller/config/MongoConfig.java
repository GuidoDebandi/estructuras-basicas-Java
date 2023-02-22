package com.example.demo.controller.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.flapdoodle.embed.mongo.config.ImmutableMongoCmdOptions;
import de.flapdoodle.embed.mongo.config.ImmutableMongodConfig;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.config.Storage;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;

@Configuration
public class MongoConfig {

    public static int mongodPort;
    public static String defaultHost = "localhost";
    static {
        try {
            mongodPort = Network.getFreeServerPort();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Bean
    public ImmutableMongodConfig prepareMongodConfig() throws IOException {
        ImmutableMongoCmdOptions cmdOptions = ImmutableMongoCmdOptions.builder()
                .useNoPrealloc(false)
                .useSmallFiles(false)
                .master(false)
                .isVerbose(false)
                .useNoJournal(false)
                .syncDelay(0)
                .build();

        ImmutableMongodConfig mongoConfigConfig = ImmutableMongodConfig.builder()
                .version(Version.Main.PRODUCTION)
                .net(new Net(mongodPort, Network.localhostIsIPv6()))
                .replication(new Storage(null, "testRepSet", 5000))
                .isConfigServer(false)
                .cmdOptions(cmdOptions)
                .build();
        return mongoConfigConfig;
    }

}