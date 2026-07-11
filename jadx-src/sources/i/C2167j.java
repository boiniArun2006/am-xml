package i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C2167j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f68048n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2167j)) {
            return false;
        }
        C2167j c2167j = (C2167j) obj;
        return Intrinsics.areEqual(this.f68048n, c2167j.f68048n) && Intrinsics.areEqual(this.rl, c2167j.rl);
    }

    public C2167j(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        this.f68048n = key;
        this.rl = str;
    }

    public int hashCode() {
        return (this.f68048n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final String rl() {
        return this.f68048n;
    }

    public String toString() {
        return "RemoteLocalizableString(key=" + this.f68048n + ", default=" + this.rl + ")";
    }
}
