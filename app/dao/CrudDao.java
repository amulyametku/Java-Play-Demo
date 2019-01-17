package dao;

import java.util.Collection;

public interface CrudDao <Entity, Key>{
    Entity create(Entity entity);
    Entity read(Key id);
    Entity update(Entity entity);
    Entity delete(Key id);
    Collection<Entity> all();
}
