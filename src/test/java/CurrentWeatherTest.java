import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;



public class CurrentWeatherTest extends BaseTest {
private final Faker faker = new Faker();

    final String appId = "9fb7cea3add866eea1725855d74a067c";

//    RequestSpecification requestSpec;
//    ResponseSpecification responseWeatherDto;
//    @BeforeEach
//    public void setUp() {
//        request = RestAssured.given();
//        ResponseSpecBuilder specBuilder = new ResponseSpecBuilder()
//                .expectStatusCode(200);
//        responseWeatherDto = specBuilder.build();



    @Test
    @DisplayName("Получение текущей погоды для случайного города")
    public void shouldGetWeatherForCity() {
        RequestSpecification request = RestAssured.given();
        List<ResponseDto> response = request
                .param("appid", appId)
                .and()
                .param("q", faker.country().capital())
                .contentType(ContentType.JSON)
                .get("/weather")
                .then().log().all()
                .extract().body().jsonPath().getList("root", ResponseDto.class);
        assertThat(response.contains(faker));

    }

    @Test
    @DisplayName("Получение текущей погоды для города с ID=0")
    public void shouldGetWeatherWithAllParam() {
        RequestSpecification request = RestAssured.given();
        Response response = request
                .param("appid", appId)
                .and()
                .param("id", 0)
                .get("/weather");

        assertThat(response)
                .extracting(
                        Response::getContentType,
                        Response::getStatusCode
                ).containsExactly(
                        "application/json; charset=utf-8",
                400
                );
    }

    @Test
    @DisplayName("Отправка запроса без параметров")
    public void shouldGetWeatherWithoutParam2() {
        RequestSpecification request = RestAssured.given();
        request
                .when()
                .param("appid", appId)
                .get("/weather")
                .then()
                .statusCode(400);
    }


}

