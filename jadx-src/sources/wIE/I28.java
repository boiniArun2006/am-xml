package wIE;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String[] f74824n;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f74825n = new ArrayList(20);

        public n O(String str) {
            int i2 = 0;
            while (i2 < this.f74825n.size()) {
                if (str.equalsIgnoreCase((String) this.f74825n.get(i2))) {
                    this.f74825n.remove(i2);
                    this.f74825n.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        private void nr(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                char cCharAt2 = str2.charAt(i3);
                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
                }
            }
        }

        n rl(String str, String str2) {
            this.f74825n.add(str);
            this.f74825n.add(str2.trim());
            return this;
        }

        public I28 t() {
            return new I28(this);
        }

        public n J2(String str, String str2) {
            nr(str, str2);
            O(str);
            rl(str, str2);
            return this;
        }
    }

    private I28(n nVar) {
        this.f74824n = (String[]) nVar.f74825n.toArray(new String[nVar.f74825n.size()]);
    }

    public String n(int i2) {
        int i3 = i2 * 2;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.f74824n;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    public int rl() {
        return this.f74824n.length / 2;
    }

    public String t(int i2) {
        int i3 = (i2 * 2) + 1;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.f74824n;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iRl = rl();
        for (int i2 = 0; i2 < iRl; i2++) {
            sb.append(n(i2));
            sb.append(": ");
            sb.append(t(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}
