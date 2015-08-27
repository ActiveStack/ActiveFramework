package org.activestack.framework.cache;

/**
 * Describe the purpose of this interface here.
 */
public interface ASCache {
    void put(final Object key, final Object value);

    Object get(final Object key);

    Object remove(final Object key);

    long size();

    void clear();
}
