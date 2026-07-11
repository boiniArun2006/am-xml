package j9w;

import java.nio.charset.StandardCharsets;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class fuX {
    private C J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f69331O;
    private int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f69332n;
    int nr;
    private o rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final StringBuilder f69333t;

    public void gh() {
        this.J2 = null;
    }

    public void mUb() {
        this.f69331O = -1;
    }

    public void qie(com.google.zxing.n nVar, com.google.zxing.n nVar2) {
    }

    private int KN() {
        return this.f69332n.length() - this.Uo;
    }

    public void HI(int i2) {
        this.f69331O = i2;
    }

    public void Ik(int i2) {
        C c2 = this.J2;
        if (c2 == null || i2 > c2.n()) {
            this.J2 = C.qie(i2, this.rl, null, null, true);
        }
    }

    public int O() {
        return this.f69331O;
    }

    public C Uo() {
        return this.J2;
    }

    public void az(int i2) {
        this.Uo = i2;
    }

    public int n() {
        return this.f69333t.length();
    }

    public String nr() {
        return this.f69332n;
    }

    public void o(String str) {
        this.f69333t.append(str);
    }

    public void r(char c2) {
        this.f69333t.append(c2);
    }

    public StringBuilder rl() {
        return this.f69333t;
    }

    public char t() {
        return this.f69332n.charAt(this.nr);
    }

    public void ty(o oVar) {
        this.rl = oVar;
    }

    public boolean xMQ() {
        return this.nr < KN();
    }

    fuX(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = (char) (bytes[i2] & UByte.MAX_VALUE);
            if (c2 == '?' && str.charAt(i2) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c2);
        }
        this.f69332n = sb.toString();
        this.rl = o.FORCE_NONE;
        this.f69333t = new StringBuilder(str.length());
        this.f69331O = -1;
    }

    public int J2() {
        return KN() - this.nr;
    }

    public void ck() {
        Ik(n());
    }
}
