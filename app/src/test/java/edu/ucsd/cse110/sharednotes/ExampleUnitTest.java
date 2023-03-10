package edu.ucsd.cse110.sharednotes;

import org.junit.Test;

import static org.junit.Assert.*;

import edu.ucsd.cse110.sharednotes.model.Note;
import edu.ucsd.cse110.sharednotes.model.NoteAPI;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    NoteAPI t = new NoteAPI();
    @Test
    public void getNote() {
        t.putNote(new Note("superincredibl", "this is a long note"));

        assertEquals("this is a long note", (t.getNote("superincredibl")).content);

    }
}