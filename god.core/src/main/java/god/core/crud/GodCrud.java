package god.core.crud;

public interface GodCrud<T> {

	T create(T vo);

	T read(T vo);

	Iterable<T> reads(T vo);

	T update(T vo);

	T delete(T vo);

}
