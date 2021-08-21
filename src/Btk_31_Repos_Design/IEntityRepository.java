package Btk_31_Repos_Design;

public interface IEntityRepository<T extends IEntity> {
    void add(T entity);
    void delete(T entity);
    void update(T entity);

}
