import knights.BraveKnight;
import knights.Quest;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest questMock = mock(Quest.class);
        BraveKnight knight =new BraveKnight(questMock);
        knight.embarkOnQuest();
        verify(questMock,times(1)).embark();

    }
}
