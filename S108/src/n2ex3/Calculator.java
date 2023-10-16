package n2ex3;

@FunctionalInterface
public interface Calculator {

	public abstract float operation(float a, float b, char o) throws Exception;
}
