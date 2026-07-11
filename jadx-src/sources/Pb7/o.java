package Pb7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class o implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7709n;

    public static String O(String str) {
        return "CrisperString(value=" + str + ")";
    }

    public static final /* synthetic */ o n(String str) {
        return new o(str);
    }

    public static String rl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    public static boolean t(String str, Object obj) {
        return (obj instanceof o) && Intrinsics.areEqual(str, ((o) obj).J2());
    }

    public final /* synthetic */ String J2() {
        return this.f7709n;
    }

    public boolean equals(Object obj) {
        return t(this.f7709n, obj);
    }

    public int hashCode() {
        return nr(this.f7709n);
    }

    public String toString() {
        return O(this.f7709n);
    }

    private /* synthetic */ o(String str) {
        this.f7709n = str;
    }

    public static int nr(String str) {
        return str.hashCode();
    }
}
