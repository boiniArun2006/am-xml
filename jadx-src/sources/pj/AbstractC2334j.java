package pj;

import java.util.Arrays;

/* JADX INFO: renamed from: pj.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC2334j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f72037n = new String[0];
    public static final AbstractC2335n[] rl = new AbstractC2335n[0];

    public static String n(int i2, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (i2 == 0) {
            return "<omitted>";
        }
        if (i2 == -1) {
            return charSequence.toString();
        }
        int length = charSequence.length() - i2;
        if (i2 <= 0 || length <= 0) {
            return charSequence.toString();
        }
        return "..." + charSequence.subSequence(length, charSequence.length()).toString();
    }

    public static String rl(int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Object[] ? n(i2, Arrays.toString((Object[]) obj)) : n(i2, String.valueOf(obj));
    }
}
