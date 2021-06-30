package at.labuda;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRandomNumber {
        @Test
        public void RandomNumber_lessThan600(){
            //Arrange
            RandomNumber rc = new RandomNumber();
            //Act
            int value = rc.RandomNumber();
            //Assert
            Assertions.assertEquals(true, value <= 600);
        }
        @Test
        public void RandomNumber_lessThan500(){
            //Arrange
            RandomNumber rc = new RandomNumber();
            //Act
            int value = rc.RandomNumber();
            //Assert
            Assertions.assertEquals(true, value >= 500);
        }
}


