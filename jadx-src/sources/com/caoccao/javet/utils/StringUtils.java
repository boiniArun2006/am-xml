package com.caoccao.javet.utils;

import java.util.Iterator;
import java.util.Objects;
import java.util.StringJoiner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class StringUtils {
    public static final String EMPTY = "";

    public static String join(CharSequence charSequence, CharSequence... charSequenceArr) {
        Objects.requireNonNull(charSequence);
        Objects.requireNonNull(charSequenceArr);
        StringJoiner stringJoiner = new StringJoiner(charSequence);
        for (CharSequence charSequence2 : charSequenceArr) {
            stringJoiner.add(charSequence2);
        }
        return stringJoiner.toString();
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isNotEmpty(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    private StringUtils() {
    }

    public static boolean isBlank(String str) {
        if (!isEmpty(str)) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean isDigital(String str) {
        if (isEmpty(str)) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!Character.isDigit(str.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static String join(CharSequence charSequence, Iterable<? extends CharSequence> iterable) {
        Objects.requireNonNull(charSequence);
        Objects.requireNonNull(iterable);
        StringJoiner stringJoiner = new StringJoiner(charSequence);
        Iterator<? extends CharSequence> it = iterable.iterator();
        while (it.hasNext()) {
            stringJoiner.add(it.next());
        }
        return stringJoiner.toString();
    }
}
