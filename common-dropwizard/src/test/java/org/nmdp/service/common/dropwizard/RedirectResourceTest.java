/*

    service-common  Common libraries and utilities for services modules.
    Copyright (c) 2014-2015 National Marrow Donor Program (NMDP)
    
    This library is free software; you can redistribute it and/or modify it
    under the terms of the GNU Lesser General Public License as published
    by the Free Software Foundation; either version 3 of the License, or (at
    your option) any later version.
    
    This library is distributed in the hope that it will be useful, but WITHOUT
    ANY WARRANTY; with out even the implied warranty of MERCHANTABILITY or
    FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
    License for more details.
    
    You should have received a copy of the GNU Lesser General Public License
    along with this library;  if not, write to the Free Software Foundation,
    Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA.
    
    > http://www.gnu.org/licenses/lgpl.html

*/

package org.nmdp.service.common.dropwizard;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Unit test for RedirectResource.
 */
public final class RedirectResourceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new RedirectResource("/test"));
    }

    @Test
    public void testRedirect() {
        RedirectResource redirectResource = new RedirectResource("/test");
        String redirect = redirectResource.redirect();
        assertNotNull(redirectResource.redirect());
        assertThat(redirect, containsString("/test"));
    }
}
