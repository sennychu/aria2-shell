package org.mvnsearch.aria2.service.impl;

import junit.framework.TestCase;

import java.util.Collections;

/**
 * aria service implementation test
 *
 * @author linux_china
 */
public class AriaServiceImplTest extends TestCase {
    /**
     * aria service
     */
    private AriaServiceImpl ariaService;

    /**
     * Sets up the fixture, for example, open a network connection.
     * This method is called before a test is executed.
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ariaService = new AriaServiceImpl();
        ariaService.connect("localhost", 6800);
    }

    /**
     * test to add uri
     *
     * @throws Exception exception
     */
    public void testAddUri() throws Exception {
        String uri = "http://cdntest.aliyun.com/faxianla/metal/m928875-1366299082120.jpg";
        String gid = ariaService.addUri(uri, Collections.emptyMap());
        System.out.println(gid);
    }
}