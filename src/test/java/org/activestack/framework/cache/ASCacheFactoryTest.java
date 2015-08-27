package org.activestack.framework.cache;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class ASCacheFactoryTest {

    @Test
    public void testCreate() throws Exception {
        final ASCache impl = ASCacheFactory.create("someImlpClassname");
        assertNotNull(impl);
    }
}
