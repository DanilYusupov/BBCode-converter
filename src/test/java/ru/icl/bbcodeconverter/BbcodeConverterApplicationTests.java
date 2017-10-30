package ru.icl.bbcodeconverter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.icl.bbcodeconverter.model.Victim;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BbcodeConverterApplicationTests {

    @Test
    public void testConverter() {
        Victim victim = new Victim("[b]Hello world![/b]");
        assertEquals("<b>Hello world!</b>", victim.convert(victim.getText()));
    }

}
