package ro.polak.http.servlet.impl;

import org.junit.Test;

import ro.polak.http.servlet.impl.ServletConfigImpl;
import ro.polak.http.servlet.impl.ServletContextImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.IsNot.not;
import static org.mockito.Mockito.mock;

public class ServletConfigImplTest {

    @Test
    public void shouldWorkSetterAndGetter() {
        ServletContextImpl servletContextImpl = mock(ServletContextImpl.class);
        ServletConfigImpl servletConfigImpl = new ServletConfigImpl(servletContextImpl);
        assertThat(servletConfigImpl.getServletContext(), is(not(nullValue())));
    }
}