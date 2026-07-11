package wIE;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public enum Dsr {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f74823n;

    public static Dsr n(String str) throws IOException {
        Dsr dsr = HTTP_1_0;
        if (str.equals(dsr.f74823n)) {
            return dsr;
        }
        Dsr dsr2 = HTTP_1_1;
        if (str.equals(dsr2.f74823n)) {
            return dsr2;
        }
        Dsr dsr3 = HTTP_2;
        if (str.equals(dsr3.f74823n)) {
            return dsr3;
        }
        Dsr dsr4 = SPDY_3;
        if (str.equals(dsr4.f74823n)) {
            return dsr4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f74823n;
    }

    Dsr(String str) {
        this.f74823n = str;
    }
}
