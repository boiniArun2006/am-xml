package androidx.webkit;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class WebMessageCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WebMessagePortCompat[] f42489n;
    private final int nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final byte[] f42490t;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Type {
    }

    public WebMessageCompat(String str, WebMessagePortCompat[] webMessagePortCompatArr) {
        this.rl = str;
        this.f42490t = null;
        this.f42489n = webMessagePortCompatArr;
        this.nr = 0;
    }

    public byte[] rl() {
        n(1);
        Objects.requireNonNull(this.f42490t);
        return this.f42490t;
    }

    public String t() {
        n(0);
        return this.rl;
    }

    private String J2(int i2) {
        return i2 != 0 ? i2 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    private void n(int i2) {
        if (i2 == this.nr) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + J2(this.nr) + " expected, but got " + J2(i2));
    }

    public int O() {
        return this.nr;
    }

    public WebMessagePortCompat[] nr() {
        return this.f42489n;
    }

    public WebMessageCompat(byte[] bArr, WebMessagePortCompat[] webMessagePortCompatArr) {
        Objects.requireNonNull(bArr);
        this.f42490t = bArr;
        this.rl = null;
        this.f42489n = webMessagePortCompatArr;
        this.nr = 1;
    }
}
