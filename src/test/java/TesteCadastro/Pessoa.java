package TesteCadastro;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;

import org.junit.Before;
import org.junit.Test;


public class Pessoa {

    public Pessoa(){
        baseURI = "";
    }

    @Test
    /*Chama o serviço pelo metodo POST*/
    public void testPost(){
        String myJson = "{\"birthDate\":\"2000-01-01\", " +
                "\"documentNumber\": \"81411916085\", " +
                "\"documentType\":\"CPF\"," +
                "\"email\":\"testeautomatizado@email.com\"," +
                "\"fullName\":\"Carla Joana de Souza\"," +
                "\"gender\":\"Feminino\"," +
                "\"mainPhone\":{" +
                "\"main\":true," +
                "\"phoneNumber\":\"11987654321\"" +
                "}}";



        given()
                .contentType("application/json")
                .body(myJson)
                .when()
                .post("/")
                .then()
                .statusCode(201);
                //.body("message", containsString("User created successfully"));
    }


}
