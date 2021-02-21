import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.util.List;

@Target({ TYPE_USE })
@Retention(RUNTIME)
@interface NotNull {}

interface A {
  public List<@NotNull String> x();
}
