//
//  ========================================================================
//  Copyright (c) 1995-2022 Mort Bay Consulting Pty Ltd and others.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.server;

import java.io.IOException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletRequestWrapper;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpUpgradeHandler;
import jakarta.servlet.http.Part;

/**
 * ServletRequestHttpWrapper
 *
 * Class to tunnel a ServletRequest via an HttpServletRequest
 */
public class ServletRequestHttpWrapper extends ServletRequestWrapper implements HttpServletRequest
{
    public ServletRequestHttpWrapper(ServletRequest request)
    {
        super(request);
    }

    @Override
    public String getAuthType()
    {
        return null;
    }

    @Override
    public Cookie[] getCookies()
    {
        return null;
    }

    @Override
    public long getDateHeader(String name)
    {
        return 0;
    }

    @Override
    public String getHeader(String name)
    {
        return null;
    }

    @Override
    public Enumeration<String> getHeaders(String name)
    {
        return null;
    }

    @Override
    public Enumeration<String> getHeaderNames()
    {
        return null;
    }

    @Override
    public int getIntHeader(String name)
    {
        return 0;
    }

    @Override
    public String getMethod()
    {
        return null;
    }

    @Override
    public String getPathInfo()
    {
        return null;
    }

    @Override
    public String getPathTranslated()
    {
        return null;
    }

    @Override
    public String getContextPath()
    {
        return null;
    }

    @Override
    public String getQueryString()
    {
        return null;
    }

    @Override
    public String getRemoteUser()
    {
        return null;
    }

    @Override
    public boolean isUserInRole(String role)
    {
        return false;
    }

    @Override
    public Principal getUserPrincipal()
    {
        return null;
    }

    @Override
    public String getRequestedSessionId()
    {
        return null;
    }

    @Override
    public String getRequestURI()
    {
        return null;
    }

    @Override
    public StringBuffer getRequestURL()
    {
        return null;
    }

    @Override
    public String getServletPath()
    {
        return null;
    }

    @Override
    public HttpSession getSession(boolean create)
    {
        return null;
    }

    @Override
    public HttpSession getSession()
    {
        return null;
    }

    @Override
    public boolean isRequestedSessionIdValid()
    {
        return false;
    }

    @Override
    public boolean isRequestedSessionIdFromCookie()
    {
        return false;
    }

    @Override
    public boolean isRequestedSessionIdFromURL()
    {
        return false;
    }

    @Override
    public boolean isRequestedSessionIdFromUrl()
    {
        return false;
    }

    /**
     * @see jakarta.servlet.http.HttpServletRequest#authenticate(jakarta.servlet.http.HttpServletResponse)
     */
    @Override
    public boolean authenticate(HttpServletResponse response) throws IOException, ServletException
    {
        return false;
    }

    /**
     * @see jakarta.servlet.http.HttpServletRequest#getPart(java.lang.String)
     */
    @Override
    public Part getPart(String name) throws IOException, ServletException
    {
        return null;
    }

    /**
     * @see jakarta.servlet.http.HttpServletRequest#getParts()
     */
    @Override
    public Collection<Part> getParts() throws IOException, ServletException
    {
        return null;
    }

    /**
     * @see jakarta.servlet.http.HttpServletRequest#login(java.lang.String, java.lang.String)
     */
    @Override
    public void login(String username, String password) throws ServletException
    {

    }

    /**
     * @see jakarta.servlet.http.HttpServletRequest#logout()
     */
    @Override
    public void logout() throws ServletException
    {

    }

    /**
     * @see jakarta.servlet.http.HttpServletRequest#changeSessionId()
     */
    @Override
    public String changeSessionId()
    {
        // TODO 3.1 Auto-generated method stub
        return null;
    }

    /**
     * @see jakarta.servlet.http.HttpServletRequest#upgrade(java.lang.Class)
     */
    @Override
    public <T extends HttpUpgradeHandler> T upgrade(Class<T> handlerClass) throws IOException, ServletException
    {
        // TODO 3.1 Auto-generated method stub
        return null;
    }
}
