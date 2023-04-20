import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.VacationPlansService;

public class VacationPlansServiceTest {

    @Test
    void vacmonth () {
        VacationPlansService service = new VacationPlansService();

        int expected = 3;

        int actual = service.calculate(10000, 3000);
        Assertions.assertEquals(expected, actual);
    }
}
