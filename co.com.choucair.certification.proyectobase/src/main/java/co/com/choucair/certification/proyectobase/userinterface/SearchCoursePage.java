package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona Cursos y Certificaciones")
            .located(By.xpath("//*[@id=\"certificaciones\"]/a/img"));
  public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.xpath("//*[@id=\"coursesearchbox\"]"));
    public static final Target BUTTON_GO = Target.the("Da clic para buscar el curso")
            .located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button")); 
    public static final Target SELECT_COURSE = Target.the("Da click en el curso")
            .located(By.xpath("//*[@id=\"category-course-list\"]/div/div[2]/div/div[2]/div/div/a/div[2]/h4"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}
