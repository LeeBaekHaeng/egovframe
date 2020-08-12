package god.core;

public interface CrudDAO<T> {

	T create(T vo);

	T create2(T vo);

	Iterable<T> create(Iterable<T> vos);

	Iterable<T> create2(Iterable<T> vos);

	T read(T vo);

	T read2(T vo);

	Iterable<T> reads(T vo);

	Iterable<T> read2s(T vo);

	T update(T vo);

	T update2(T vo);

	Iterable<T> update(Iterable<T> vos);

	Iterable<T> update2(Iterable<T> vos);

	T delete(T vo);

	T delete2(T vo);

	Iterable<T> delete(Iterable<T> vos);

	Iterable<T> delete2(Iterable<T> vos);

}
