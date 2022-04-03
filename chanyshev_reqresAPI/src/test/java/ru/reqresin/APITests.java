package ru.reqresin;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.reqresin.data.login.LoginData;
import ru.reqresin.data.login.LoginSuccess;
import ru.reqresin.data.login.LoginUnSuccess;
import ru.reqresin.data.unknownpage.UnknownPage;
import ru.reqresin.data.userspage.UsersPage;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static ru.reqresin.specification.Specification.*;

public class APITests {
    @Test
    public void testUsersPage(){
        installSpec(requestSpec(),responseSpec());
        UsersPage usersPage = given()
                .when()
                .get("api/users?page=2")
                .then()
                .log().body()
                .extract()
                .body().as(UsersPage.class);
        //long avatarFilenameCount =
                usersPage.getData();
                /*.stream()
                .map(Datum::getAvatar)
                .map(s -> {
            String[] strings = s.split("/");
            return strings[strings.length - 1];
        }).map(s -> {
            String[] strings = s.split("\\.");
            return strings[0];
        })
                .distinct()
                .count();*/
        //Assert.assertEquals(avatarFilenameCount, usersPage.getData().size(), "Среди имен файлов аватаров на странице 2 есть повторяющиеся значения");
        deleteSpec();
    }
    @Test
    public void testSuccessfulAuth(){
        installSpec(requestSpec(),responseSpec());
        LoginData loginData =new LoginData("eve.holt@reqres.in","cityslicka");
        LoginSuccess loginSuccess =
                given()
                .body(loginData)
                .when()
                .post("/api/login")
                .then()
                .log().all()
                .extract().as(LoginSuccess.class);
        Assert.assertNotNull(loginSuccess.getToken(),"Авторизация не прошла. Токен нулевой");

        deleteSpec();
    }

    @Test
    public void testUnsuccessfulAuth(){
        installSpec(requestSpec(),responseBadSpec());
        LoginData loginData =new LoginData("peter@klaven");
        LoginUnSuccess login = given()
                .body(loginData)
                .when()
                .post("/api/login")
                .then()
                .log().all()
                .extract().as(LoginUnSuccess.class);
        Assert.assertEquals(login.getError(),"Missing password","Авторизация не прошла. Сообщение об ошибке не выдано");

        deleteSpec();
    }

    @Test
    public void testYearsSorted(){
        installSpec(requestSpec(),responseSpec());

        UnknownPage unknownPage = given()
                .when()
                .get("api/unknown")
                .then()
                .log().body()
                .extract()
                .body().as(UnknownPage.class);

        List<Integer> yearList = unknownPage.getData().stream().map(ru.reqresin.data.unknownpage.Datum::getYear).collect(Collectors.toList());

        Assert.assertEquals(yearList, yearList.stream().sorted().collect(Collectors.toList()), "Года в List<Resourse> не упорядочены");
        deleteSpec();
    }

}
