package ex0;

import ex0.Ex.OtherImpl;
import ex0.Ex.SODoer;
import ex0.Ex.SomeBean;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.assertSame;

class InjectorTest {
    // Тест внедрения
    @Test
    public void testInject() throws Exception {
        SomeBean sb = new SomeBean();
        Injector.inject(sb);

        Field field1 = SomeBean.class.getDeclaredField("field1");
        field1.setAccessible(true);
        assertSame(field1.get(sb).getClass(), OtherImpl.class);
        field1.setAccessible(false);

        Field field2 = SomeBean.class.getDeclaredField("field2");
        field2.setAccessible(true);
        assertSame(field2.get(sb).getClass(), SODoer.class);
        field2.setAccessible(false);
    }
}