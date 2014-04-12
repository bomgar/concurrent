import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TestDemos {

    @Test
    public void testDemo1() throws Exception {
        assertThat(new Demo1().run()).isEqualTo(1000000);
    }

    @Test
    public void testDemo2() throws Exception {
        assertThat(new Demo2().run()).isEqualTo(1000000);
    }

    @Test
    public void testDemo3() throws Exception {
        assertThat(new Demo3().run()).isEqualTo(1000000);
    }

    @Test
    public void testDemo4() throws Exception {
        assertThat(new Demo4().run()).isEqualTo(1000000);
    }
}
