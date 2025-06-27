package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalizationServiceImplTest {

    private final LocalizationService localizationService = new LocalizationServiceImpl();

    @Test
    public void test_locale_russia_returns_russian_text() {
        assertEquals("Добро пожаловать", localizationService.locale(Country.RUSSIA));
    }

    @Test
    public void test_locale_usa_returns_english_text() {
        assertEquals("Welcome", localizationService.locale(Country.USA));
    }
}

