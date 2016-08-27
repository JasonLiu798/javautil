package com.jason798.character;

import java.util.*;

public final class StringSplitHelper {

    private StringSplitHelper() {
    }

	/**
	 * split string to array by delimiers
	 * @param str
	 * @param delimiters
	 * @return
	 */
	public static String[] tokenizeToStringArray(String str, String delimiters) {
		return tokenizeToStringArray(str, delimiters, true, true);
	}

	/**
	 * split
	 *
	 * @param str
	 * @param delimiters
	 * @param trimTokens
	 * @param ignoreEmptyTokens
	 * @return
	 */
	public static String[] tokenizeToStringArray(String str, String delimiters,
												 boolean trimTokens, boolean ignoreEmptyTokens) {
		if (str == null)
			return null;
		StringTokenizer st = new StringTokenizer(str, delimiters);
		List tokens = new ArrayList();
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if (trimTokens)
				token = token.trim();
			if (!ignoreEmptyTokens || token.length() > 0)
				tokens.add(token);
		}
		return toStringArray(tokens);
	}

	/**
	 * collection to string array
	 *
	 * @param collection
	 * @return
	 */
	public static String[] toStringArray(Collection collection) {
		if (collection == null)
			return null;
		else
			return (String[]) collection.toArray(new String[collection.size()]);
	}

	/**
	 * enumeration to string array
	 *
	 * @param enumeration
	 * @return
	 */
	public static String[] toStringArray(Enumeration enumeration) {
		if (enumeration == null) {
			return null;
		} else {
			List list = (List) Collections.list(enumeration);
			return (String[]) list.toArray(new String[list.size()]);
		}
	}

	public static String[] split(String toSplit, String delimiter) {
        if (delimiter.length() != 1)
            throw new IllegalArgumentException("Delimiter can only be one character in length");
        int offset = toSplit.indexOf(delimiter);
        if (offset < 0) {
            return null;
        } else {
            String beforeDelimiter = toSplit.substring(0, offset);
            String afterDelimiter = toSplit.substring(offset + 1);
            return (new String[]{
                    beforeDelimiter, afterDelimiter
            });
        }
    }

    public static Map splitEachArrayElementAndCreateMap(String array[], String delimiter, String removeCharacters) {
        if (array == null || array.length == 0)
            return null;
        Map map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            String postRemove;
            if (removeCharacters == null)
                postRemove = array[i];
            else
                postRemove = StringHelper.replace(array[i], removeCharacters, "");
            String splitThisArrayElement[] = split(postRemove, delimiter);
            if (splitThisArrayElement != null)
                map.put(splitThisArrayElement[0].trim(), splitThisArrayElement[1].trim());
        }

        return map;
    }

    public static String substringBeforeLast(String str, String separator) {
        if (str == null || separator == null || str.length() == 0 || separator.length() == 0)
            return str;
        int pos = str.lastIndexOf(separator);
        if (pos == -1)
            return str;
        else
            return str.substring(0, pos);
    }

    public static String substringAfterLast(String str, String separator) {
        if (str == null || str.length() == 0)
            return str;
        if (separator == null || separator.length() == 0)
            return "";
        int pos = str.lastIndexOf(separator);
        if (pos == -1 || pos == str.length() - separator.length())
            return "";
        else
            return str.substring(pos + separator.length());
    }
}

