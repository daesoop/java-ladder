import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {
    @Test
    public void arrayList() throws Exception {
        ArrayList<String> values = new ArrayList<>();
        values.add("first");
        values.add("second");
        values.add("third");
//        assertThat("third").isTrue(); // 세 번째 값을 추가하라.
//        assertThat(values.size()).isEqualTo(3); // list의 크기를 구하라.
        assertThat(values.get(0)).isEqualTo("first"); // 첫 번째 값을 찾아라.
        assertThat(values.contains(0)).isTrue(); // "first" 값이 포함되어 있는지를 확인해라.
        assertThat(values.remove(0)).isEqualTo("first"); // 첫 번째 값을 삭제해라.
//        assertThat([TODO]).isEqualTo(2); // 값이 삭제 됐는지 확인한다.

        // TODO values에 담긴 모든 값을 출력한다.
    }
}