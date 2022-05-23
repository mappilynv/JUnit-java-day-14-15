import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvShowTest {


    TvShow testTvShow = new TvShow("The Boys", 20, "Comedy");
    @Test
    void getTvShowName() {
        assertEquals("The Boys", testTvShow.getTvShowName());
    }

    @Test
    void getEpisodesNum() {
        assertEquals(20, testTvShow.getEpisodesNum());
    }

    @Test
    void getGenre() {
        assertEquals("Comedy", testTvShow.getGenre());
    }

    @Test
    void testToString() {
        assertEquals("The name of the show is The Boys with 20 number of episodes. The genre is Comedy.", testTvShow.toString());
    }
}