package com.deppon.mbi.agile.general.utils;

import org.apache.commons.beanutils.BeanUtilsBean;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by sunyamorn on 1/27/16.
 *
 * Bean Utility
 */
public class BeanHelper {
    public static void nullAwareBeanCopy(Object dest, Object source)  {
        try {
            new BeanUtilsBean() {
                @Override
                public void copyProperty(Object dest, String name, Object value)
                        throws IllegalAccessException, InvocationTargetException {
                    if (value != null) {
                        super.copyProperty(dest, name, value);
                    }
                }
            }.copyProperties(dest, source);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
