package org.activestack.framework.messaging;

/**
 * Factory class used to instantiate concrete implementation of interface
 */
public final class ASMessagingFactory {

    /**
     * Private constructor to prevent instantiation of factory.
     */
    private ASMessagingFactory() {
    }

    public static ASMessaging create(final String implClassname) {
        // @todo fix me (see ASCacheFactory)
        return new ASMessaging() {
            public void sendMessage(Object message) {

            }
        };
    }
}
