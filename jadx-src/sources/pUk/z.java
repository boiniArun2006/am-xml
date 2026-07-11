package pUk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class z extends I28 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z f72033t = Z("__name__");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final z f72032O = new z(Collections.EMPTY_LIST);

    public static z Z(String str) {
        return new z(Collections.singletonList(str));
    }

    public static z o(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\') {
                i2++;
                if (i2 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i2));
            } else if (cCharAt == '.') {
                if (z2) {
                    sb.append(cCharAt);
                } else {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                    StringBuilder sb2 = new StringBuilder();
                    arrayList.add(string);
                    sb = sb2;
                }
            } else if (cCharAt == '`') {
                z2 = !z2;
            } else {
                sb.append(cCharAt);
            }
            i2++;
        }
        String string2 = sb.toString();
        if (!string2.isEmpty()) {
            arrayList.add(string2);
            return new z(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // pUk.I28
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public z Uo(List list) {
        return new z(list);
    }

    public boolean XQ() {
        return equals(f72033t);
    }

    @Override // pUk.I28
    public String t() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.f71991n.size(); i2++) {
            if (i2 > 0) {
                sb.append(".");
            }
            String strReplace = ((String) this.f71991n.get(i2)).replace("\\", "\\\\").replace("`", "\\`");
            if (!S(strReplace)) {
                strReplace = '`' + strReplace + '`';
            }
            sb.append(strReplace);
        }
        return sb.toString();
    }

    private z(List list) {
        super(list);
    }

    private static boolean S(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z'))) {
            return false;
        }
        for (int i2 = 1; i2 < str.length(); i2++) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    public static z r(List list) {
        if (list.isEmpty()) {
            return f72032O;
        }
        return new z(list);
    }
}
