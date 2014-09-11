/**
 * Copyright 2010 ZTEsoft Inc. All Rights Reserved.
 *
 * This software is the proprietary information of ZTEsoft Inc.
 * Use is subject to license terms.
 *
 * $Tracker List
 *
 * $TaskId: $ $Date: 9:24:36 AM (May 9, 2008) $comments: create 
 * $TaskId: $ $Date: 3:56:36 PM (SEP 13, 2010) $comments: upgrade jvm to jvm1.5 
 *
 *
 */
package cn.kangbao.common.util;

import java.util.Collection;

/**
 * <Description> <br>
 *
 * @author yan.qicui<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年4月15日 <br>
 * @see com.ztesoft.framework.util <br>
 * @since V1.0<br>
 */
public final class ValidateUtil {
    private ValidateUtil() {
    }

    public final static boolean validateNotNull(String str) {
        return str != null;
    }

    public final static boolean validateNotEmpty(String str) {
        if (validateNotNull(str)) {
            return !str.trim().equals("");
        }
        return false;
    }

    public final static boolean validateNotNull(Long l) {
        return l != null;
    }

    public final static boolean validateNotNull(Object o) {
        return o != null;
    }

    public final static boolean validateNotEmpty(Object[] obj) {
        if (validateNotNull(obj)) {
            return (obj.length != 0);
        }
        return false;
    }

    public final static boolean validateNotEmpty(Collection col) {
        if (validateNotNull(col)) {
            return (col.size() != 0);
        }
        return false;
    }

    /**
     * Assert that an object is <code>null</code> .
     * <p/>
     * <pre class="code">
     * Assert.isNull(value, &quot;The value must be null&quot;);
     * </pre>
     *
     * @param object  the object to check
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if the object is not <code>null</code>
     */
    public static void isNull(Object object, String message) {
        if (!ValidateUtil.validateNotNull(object)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that an object is <code>null</code> .
     * <p/>
     * <pre class="code">
     * Assert.isNull(value);
     * </pre>
     *
     * @param object the object to check
     * @throws IllegalArgumentException if the object is not <code>null</code>
     */
    public static void isNull(Object object) {
        isNull(object, "[Assertion failed] - the object argument must be null");
    }

    /**
     * Assert that an object is not <code>null</code> .
     * <p/>
     * <pre class="code">
     * Assert.notNull(clazz, &quot;The class must not be null&quot;);
     * </pre>
     *
     * @param object  the object to check
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if the object is <code>null</code>
     */
    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that an object is not <code>null</code> .
     * <p/>
     * <pre class="code">
     * Assert.notNull(clazz);
     * </pre>
     *
     * @param object the object to check
     * @throws IllegalArgumentException if the object is <code>null</code>
     */
    public static void notNull(Object object) {
        notNull(object, "[Assertion failed] - this argument is required; it cannot be null");
    }

    /**
     * Assert that a string has valid text content; that is, it must not be <code>null</code> and must contain at least one non-whitespace character.
     * <p/>
     * <pre class="code">
     * Assert.hasText(name, &quot;Name must not be empty&quot;);
     * </pre>
     *
     * @param text    the string to check
     * @param message the exception message to use if the assertion fails
     * @see StringUtils#hasText
     */
    public static void hasText(String text, String message) {
        if (!ValidateUtil.validateNotEmpty(text)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that a string has valid text content; that is, it must not be <code>null</code> and must contain at least one non-whitespace character.
     * <p/>
     * <pre class="code">
     * Assert.hasText(name, &quot;Name must not be empty&quot;);
     * </pre>
     *
     * @param text the string to check
     * @see StringUtils#hasText
     */
    public static void hasText(String text) {
        hasText(text, "[Assertion failed] - this String argument must have text; it cannot be <code>null</code>, empty, or blank");
    }

    /**
     * Assert that an array has elements; that is, it must not be <code>null</code> and must have at least one element.
     * <p/>
     * <pre class="code">
     * Assert.notEmpty(array, &quot;The array must have elements&quot;);
     * </pre>
     *
     * @param array   the array to check
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if the object array is <code>null</code> or has no elements
     */
    public static void notEmpty(Object[] array, String message) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void notEmpty(String str, String message) {
        if (!ValidateUtil.validateNotEmpty(str)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that an array has elements; that is, it must not be <code>null</code> and must have at least one element.
     * <p/>
     * <pre class="code">
     * Assert.notEmpty(array);
     * </pre>
     *
     * @param array the array to check
     * @throws IllegalArgumentException if the object array is <code>null</code> or has no elements
     */
    public static void notEmpty(Object[] array) {
        notEmpty(array, "[Assertion failed] - this array must not be empty: it must contain at least 1 element");
    }

    /**
     * Assert that a collection has elements; that is, it must not be <code>null</code> and must have at least one element.
     * <p/>
     * <pre class="code">
     * Assert.notEmpty(collection, &quot;Collection must have elements&quot;);
     * </pre>
     *
     * @param collection the collection to check
     * @param message    the exception message to use if the assertion fails
     * @throws IllegalArgumentException if the collection is <code>null</code> or has no elements
     */
    public static void notEmpty(Collection collection, String message) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that a collection has elements; that is, it must not be <code>null</code> and must have at least one element.
     * <p/>
     * <pre class="code">
     * Assert.notEmpty(collection, &quot;Collection must have elements&quot;);
     * </pre>
     *
     * @param collection the collection to check
     * @throws IllegalArgumentException if the collection is <code>null</code> or has no elements
     */
    public static void notEmpty(Collection collection) {
        notEmpty(collection, "[Assertion failed] - this collection must not be empty: it must contain at least 1 element");
    }

    /**
     * Assert a boolean expression, throwing <code>IllegalStateException</code> if the test result is <code>false</code>. Call isTrue if you wish to
     * throw IllegalArgumentException on an assertion failure.
     * <p/>
     * <pre class="code">
     * Assert.state(id == null, &quot;The id property must not already be initialized&quot;);
     * </pre>
     *
     * @param expression a boolean expression
     * @param message    the exception message to use if the assertion fails
     * @throws IllegalStateException if expression is <code>false</code>
     */
    public static void state(boolean expression, String message) {
        if (!expression) {
            throw new IllegalStateException(message);
        }
    }

    /**
     * Assert a boolean expression, throwing {@link IllegalStateException} if the test result is <code>false</code>.
     * <p/>
     * Call {@link #isTrue(boolean)} if you wish to throw {@link IllegalArgumentException} on an assertion failure.
     * <p/>
     * <pre class="code">
     * Assert.state(id == null);
     * </pre>
     *
     * @param expression a boolean expression
     * @throws IllegalStateException if the supplied expression is <code>false</code>
     */
    public static void state(boolean expression) {
        state(expression, "[Assertion failed] - this state invariant must be true");
    }

    /**
     * Assert a boolean expression, throwing <code>IllegalArgumentException</code> if the test result is <code>true</code>. zhang.nanyu added
     * 2008-08-09
     *
     * @param expression a boolean expression
     * @param message    the exception message to use if the assertion fails
     * @throws IllegalStateException if expression is <code>false</code>
     */
    public static void isFalse(boolean expression, String message) {
        if (expression) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert a boolean expression, throwing <code>IllegalArgumentException</code> if the test result is <code>false</code>. zhang.nanyu added
     * 2008-08-09
     *
     * @param expression a boolean expression
     * @param message    the exception message to use if the assertion fails
     * @throws IllegalStateException if expression is <code>false</code>
     */
    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new IllegalArgumentException(message);
        }
    }
}
