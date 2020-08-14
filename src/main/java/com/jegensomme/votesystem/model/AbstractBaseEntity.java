package com.jegensomme.votesystem.model;

public abstract class AbstractBaseEntity {

    protected Integer id;

    public AbstractBaseEntity() {
    }

    public AbstractBaseEntity(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isNew() {
        return this.id == null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return  true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractBaseEntity that = (AbstractBaseEntity) obj;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + id;
    }
}
