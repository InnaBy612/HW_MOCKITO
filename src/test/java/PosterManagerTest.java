import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void testAddThreeMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddZeroMovies() {
        PosterManager manager = new PosterManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddOneMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film I");

        String[] actual = manager.findAll();
        String[] expected = {"Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindThreeMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] actual = manager.findLast();
        String[] expected = {"Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindZeroMovies() {
        PosterManager manager = new PosterManager();

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindOneMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film I");

        String[] actual = manager.findLast();
        String[] expected = {"Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindFiveMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");

        String[] actual = manager.findLast();
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindNineMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
        manager.addMovie("Film VII");
        manager.addMovie("Film VIII");
        manager.addMovie("Film IX");

        String[] actual = manager.findLast();
        String[] expected = {"Film IX", "Film VIII", "Film VII", "Film VI", "Film V"};
        Assertions.assertArrayEquals(expected, actual);
    }

}