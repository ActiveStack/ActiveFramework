package org.activestack.framework.cache;

/**
 * Factory class used to instantiate concrete implementation of interface, or maybe use your IoC / injection tool of choice...
 */
public final class ASCacheFactory {

    /**
     * Private constructor to prevent instantiation of factory.
     */
    private ASCacheFactory() {
    }

    /**
     * @return an cache implementation
     */
    public static ASCache create(final String implClassname) {
        // @todo Add logic to load a real cache impl, who's class likely lives in some other jar on the classpath.
        return new ASCache() {
            public void put(Object key, Object value) {

            }

            public Object get(Object key) {
                return null;
            }

            public Object remove(Object key) {
                return null;
            }

            public long size() {
                return 0;
            }

            public void clear() {

            }
        };
    }
}
