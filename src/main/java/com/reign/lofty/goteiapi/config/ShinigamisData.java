package com.reign.lofty.goteiapi.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

import static com.reign.lofty.goteiapi.constants.GoteiConstant.ENDPOINT_DYNAMO;
import static com.reign.lofty.goteiapi.constants.GoteiConstant.REGION_DYNAMO;

public class ShinigamisData {

    public static void main(String[] args) {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder
                .standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
                .build();
        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("Captains");

        Item captain1 = new Item()
                .withPrimaryKey("id", "1")
                .withString("division", "1")
                .withString("name", "Kyoraku Shunsui")
                .withString("office", "Capitão");

        Item captain2 = new Item()
                .withPrimaryKey("id", "2")
                .withString("division", "2")
                .withString("name", "Soi Fong")
                .withString("office", "Capitão");

        Item captain3 = new Item()
                .withPrimaryKey("id", "3")
                .withString("division", "3")
                .withString("name", "Rose Otoribashi")
                .withString("office", "Capitão");

        Item captain4 = new Item()
                .withPrimaryKey("id", "4")
                .withString("division", "4")
                .withString("name", "Isane Kotetsu")
                .withString("office", "Capitão");

        Item captain5 = new Item()
                .withPrimaryKey("id", "5")
                .withString("division", "5")
                .withString("name", "Hirako Shinji")
                .withString("office", "Capitão");

        Item captain6 = new Item()
                .withPrimaryKey("id", "6")
                .withString("division", "6")
                .withString("name", "Byakuya Kuchiki")
                .withString("office", "Capitão");

        Item captain7 = new Item()
                .withPrimaryKey("id", "7")
                .withString("division", "7")
                .withString("name", "Tetsuazaemon Iba")
                .withString("office", "Capitão");

        Item captain8 = new Item()
                .withPrimaryKey("id", "8")
                .withString("division", "8")
                .withString("name", "Yadoumaru Lisa")
                .withString("office", "Capitão");

        Item captain9 = new Item()
                .withPrimaryKey("id", "9")
                .withString("division", "9")
                .withString("name", "Mugurama Kensei ")
                .withString("office", "Capitão");

        Item captain10 = new Item()
                .withPrimaryKey("id", "10")
                .withString("division", "10")
                .withString("name", "Hitsugaya Tōshirō")
                .withString("office", "Capitão");

        Item captain11 = new Item()
                .withPrimaryKey("id", "11")
                .withString("division", "11")
                .withString("name", "Kenpachi Zaraki")
                .withString("office", "Capitão");

        Item captain12 = new Item()
                .withPrimaryKey("id", "12")
                .withString("division", "12")
                .withString("name", "Kurotsuchi Mayuri")
                .withString("office", "Capitão");

        Item captain13 = new Item()
                .withPrimaryKey("id", "13")
                .withString("division", "13")
                .withString("name", "Kuchiki Rukia")
                .withString("office", "Capitão");

        PutItemOutcome outcome1 = table.putItem(captain1);
        PutItemOutcome outcome2 = table.putItem(captain2);
        PutItemOutcome outcome3 = table.putItem(captain3);
        PutItemOutcome outcome4 = table.putItem(captain4);
        PutItemOutcome outcome5 = table.putItem(captain5);
        PutItemOutcome outcome6 = table.putItem(captain6);
        PutItemOutcome outcome7 = table.putItem(captain7);
        PutItemOutcome outcome8 = table.putItem(captain8);
        PutItemOutcome outcome9 = table.putItem(captain9);
        PutItemOutcome outcome10 = table.putItem(captain10);
        PutItemOutcome outcome11 = table.putItem(captain11);
        PutItemOutcome outcome12 = table.putItem(captain12);
        PutItemOutcome outcome13 = table.putItem(captain13);

    }
}