
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestLab2{
    @Test
    public void TestEveryBranch(){

        User user = new User("Marijana123","Password123@", "marijana.milkovska@students.finki.ukim.mk");

        assertFalse(SiLab2_143068.function(user,null));
        assertTrue(SiLab2_143068.function(new User("Marijana","Password123@", "marijana.milkovska@students.finki.ukim.mk"), null));
    }

    @Test
    public void TestMultipleCondition(){

        User user = new User("Marijana123","Password123@", "marijana.milkovska@students.finki.ukim.mk");

        assertFalse(SiLab2_143068.function(new User(null,"Password123@","marijanayahoo.com"),null));
        assertFalse(SiLab2_143068.function(new User("marijana","Password123@","marijana@students.finki.ukim.mk"),null));
        assertFalse(SiLab2_143068.function(new User("MM","Password123@","mmstudents.finki.ukim.mk"),null));
        assertFalse(SiLab2_143068.function(new User("Marijana1","Password123@","marijana.milkovska@students.finki.ukim.mk"),null));
        assertTrue(SiLab2_143068.function(new User("Marijana123","Password123@", "marijana.milkovska@students.finki.ukim.mk"), null));

    }


}