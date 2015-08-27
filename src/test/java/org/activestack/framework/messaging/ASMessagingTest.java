package org.activestack.framework.messaging;


import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class ASMessagingTest {
    @Test
    public void testSendMessage() throws Exception {
        // uses mocks to validate interface
        final ASMessaging asMessaging = mock(ASMessaging.class);

        final String someMessage = "someMessage";

        asMessaging.sendMessage(someMessage);

        verify(asMessaging).sendMessage(someMessage);
        verifyNoMoreInteractions(asMessaging);
    }

}
