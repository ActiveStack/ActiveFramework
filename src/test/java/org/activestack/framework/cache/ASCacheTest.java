package org.activestack.framework.cache;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class ASCacheTest {

    private final Object key = "idKey";
    private final Object item = "wombat";

    private ASCache asCache;

    @Before
    public void setUp() throws Exception {
        asCache = new ASCache() {
            // stubbed impl to validate interface

            private final HashMap<Object, Object> store = new HashMap<Object, Object>();

            public void put(Object key, Object value) {
                store.put(key, value);
            }

            public Object get(Object key) {
                return store.get(key);
            }

            public Object remove(Object key) {
                return store.remove(key);
            }

            public long size() {
                return store.size();
            }

            public void clear() {
                store.clear();
            }
        };
    }


    @Test
    public void testGetEmpty() throws Exception {
        assertNull(asCache.get(key));
    }

    @Test
    public void testPutGet() throws Exception {
        asCache.put(key, item);
        assertEquals(item, asCache.get(key));
        assertEquals(1, asCache.size());
    }

    @Test
    public void testRemove() throws Exception {
        asCache.put(key, item);
        assertEquals(item, asCache.remove(key));
        assertEquals(0, asCache.size());
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(0, asCache.size());
        asCache.put(key, item);
        assertEquals(1, asCache.size());
    }
}
