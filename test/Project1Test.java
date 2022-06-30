import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project1Test
{
    private static Scanner scan;
    private Project1 p;
    private static File f;
    @BeforeAll
    static void prep()
    {
        f = new File("./test/testInput.txt");
        System.out.println(f.getPath());
        try
        {
            scan = new Scanner(f);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
        }

    }
    @Test
    void testvalidInput()
    {
        p = new Project1(scan);
        assertAll("test input",
            () -> assertEquals(1,p.userInput()),
            () -> assertEquals(2,p.userInput())
        );
    }
    @Test
    void testInvalidInput()
    {
        p = new Project1(scan);
        assertAll("test input",
            () -> assertEquals(-1,p.userInput()),
            () -> assertEquals(-1,p.userInput())
        );
    }
    @Test
    void testall()
    {
        p = new Project1(scan);
        assertEquals(0,p.run());
    }
    @AfterAll
    static void clean()
    {
        scan.close();
    }
}
