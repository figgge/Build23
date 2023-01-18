package org.example.testable;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;

//@SuppressWarnings({"unchecked"})
@ExtendWith(MockitoExtension.class)
class TestabilityTest {

    LoggerImpl logger = new LoggerImpl();
    MailSender mailSender = mock(MailSender.class); // use our own test double (Mockito.mock)

    @Mock
    List<String> strings; // = Mockito.mock(List.class);


    Testability testability = new Testability(logger, mailSender); //use mockito to mock mailsender


    @Test
    void ShouldRunAndSendMail() {
        testability.run();

        assertTrue(logger.logIsCalled);

        Mockito.verify(mailSender).sendMail(anyString(),anyString());
    }
}