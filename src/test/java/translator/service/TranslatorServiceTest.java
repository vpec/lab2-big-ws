package translator.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import translator.Application;
import translator.domain.TranslatedText;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TranslatorServiceTest {

  @Autowired
  TranslatorService translatorService;

  @Test
  public void translateTest_en_es_1() {
    TranslatedText translatedText = translatorService.translate("en", "es", "This is a test of translation service");
    assertEquals("Esto es una prueba de servicio de traducción", translatedText.getTranslation());
  }

  @Test
  public void translateTest_en_es_2() {
    TranslatedText translatedText = translatorService.translate("en", "es", "Opel Corsa with lights on");
    assertEquals("Opel Corsa con las luces encendidas", translatedText.getTranslation());
  }

  @Test
  public void translateTest_en_fr_1() {
    TranslatedText translatedText = translatorService.translate("en", "fr", "Translation from english to french");
    assertEquals("Traduction de l'anglais vers le français", translatedText.getTranslation());
  }

}
