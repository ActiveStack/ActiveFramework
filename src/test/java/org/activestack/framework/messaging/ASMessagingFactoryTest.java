package org.activestack.framework.messaging;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class ASMessagingFactoryTest {
    @Test
    public void testCreate() throws Exception {
        final ASMessaging impl = ASMessagingFactory.create("someImlpClassname");
        assertNotNull(impl);
    }
}
