package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

public class GeoServiceImplTest {

    private final GeoService geoService = new GeoServiceImpl();

    @Test
    public void test_byIp_russian_ip_returns_russian_location() {
        Location location = geoService.byIp("172.123.12.19");
        assertEquals(Country.RUSSIA, location.getCountry());
    }

    @Test
    public void test_byIp_usa_ip_returns_usa_location() {
        Location location = geoService.byIp("96.44.183.149");
        assertEquals(Country.USA, location.getCountry());
    }
}

