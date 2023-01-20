package hu.ltk.core;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoreInitProjectTest {

    private CoreInitProject coreInitProject = new CoreInitProject();

    @Test
    void whoIsTheStorage() {
        assertEquals("Bootcamp", coreInitProject.whoIsTheStorage());
    }


}
