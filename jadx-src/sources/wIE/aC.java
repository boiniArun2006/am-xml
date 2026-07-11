package wIE;

import java.net.ProtocolException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Dsr f74830n;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f74831t;

    public static aC n(String str) throws ProtocolException {
        Dsr dsr;
        int i2;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                dsr = Dsr.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                dsr = Dsr.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            dsr = Dsr.HTTP_1_0;
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i5 = Integer.parseInt(str.substring(i2, i3));
            if (str.length() <= i3) {
                strSubstring = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i2 + 4);
            }
            return new aC(dsr, i5, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f74830n == Dsr.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.rl);
        if (this.f74831t != null) {
            sb.append(' ');
            sb.append(this.f74831t);
        }
        return sb.toString();
    }

    public aC(Dsr dsr, int i2, String str) {
        this.f74830n = dsr;
        this.rl = i2;
        this.f74831t = str;
    }
}
