/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.adapter.internal;

import java.io.File;
import java.io.InputStream;
import java.util.Dictionary;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.BundleListener;
import org.osgi.framework.Filter;
import org.osgi.framework.FrameworkListener;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

public class MockBundleContext implements BundleContext {

    public void addBundleListener(BundleListener listener) {
        // TODO Auto-generated method stub

    }

    public void addFrameworkListener(FrameworkListener listener) {
        // TODO Auto-generated method stub

    }

    public void addServiceListener(ServiceListener listener, String filter)
            throws InvalidSyntaxException {
        // TODO Auto-generated method stub

    }

    public void addServiceListener(ServiceListener listener) {
        // TODO Auto-generated method stub

    }

    public Filter createFilter(String filter) throws InvalidSyntaxException {
        // TODO Auto-generated method stub
        return null;
    }

    public ServiceReference[] getAllServiceReferences(String clazz,
            String filter) throws InvalidSyntaxException {
        // TODO Auto-generated method stub
        return null;
    }

    public Bundle getBundle() {
        // TODO Auto-generated method stub
        return null;
    }

    public Bundle getBundle(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public Bundle[] getBundles() {
        // TODO Auto-generated method stub
        return null;
    }

    public File getDataFile(String filename) {
        // TODO Auto-generated method stub
        return null;
    }

    public String getProperty(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object getService(ServiceReference reference) {
        // TODO Auto-generated method stub
        return null;
    }

    public ServiceReference getServiceReference(String clazz) {
        // TODO Auto-generated method stub
        return null;
    }

    public ServiceReference[] getServiceReferences(String clazz, String filter)
            throws InvalidSyntaxException {
        // TODO Auto-generated method stub
        return null;
    }

    public Bundle installBundle(String location, InputStream input)
            throws BundleException {
        // TODO Auto-generated method stub
        return null;
    }

    public Bundle installBundle(String location) throws BundleException {
        // TODO Auto-generated method stub
        return null;
    }

    public ServiceRegistration registerService(String clazz, Object service,
            Dictionary properties) {
        // TODO Auto-generated method stub
        return null;
    }

    public ServiceRegistration registerService(String[] clazzes,
            Object service, Dictionary properties) {
        // TODO Auto-generated method stub
        return null;
    }

    public void removeBundleListener(BundleListener listener) {
        // TODO Auto-generated method stub

    }

    public void removeFrameworkListener(FrameworkListener listener) {
        // TODO Auto-generated method stub

    }

    public void removeServiceListener(ServiceListener listener) {
        // TODO Auto-generated method stub

    }

    public boolean ungetService(ServiceReference reference) {
        // TODO Auto-generated method stub
        return false;
    }

}
