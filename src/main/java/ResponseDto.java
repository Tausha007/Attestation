import java.util.ArrayList;

public class ResponseDto {
    private CoordDto coord;
    private ArrayList<WeatherDto> weather;
    private String base;
    private MainDto main;
    private Integer visibility;
    private WindDto wind;
    private CloudsDto clouds;
    private Integer dt;
    private SysDto sys;
    private Integer timezone;
    private Integer id;
    private String name;
    private Integer cod;


    public CoordDto getCoord() {
        return coord;
    }

    public void setCoord(CoordDto coord) {
        this.coord = coord;
    }

    public ArrayList<WeatherDto> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<WeatherDto> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainDto getMain() {
        return main;
    }

    public void setMain(MainDto main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public WindDto getWind() {
        return wind;
    }

    public void setWind(WindDto wind) {
        this.wind = wind;
    }

    public CloudsDto getClouds() {
        return clouds;
    }

    public void setClouds(CloudsDto clouds) {
        this.clouds = clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public SysDto getSys() {
        return sys;
    }

    public void setSys(SysDto sys) {
        this.sys = sys;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
}
