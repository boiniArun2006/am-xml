package KfI;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5738n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qz) && Intrinsics.areEqual(this.f5738n, ((qz) obj).f5738n);
    }

    public int hashCode() {
        String str = this.f5738n;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String n() {
        return this.f5738n;
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f5738n + ')';
    }

    public qz(String str) {
        this.f5738n = str;
    }
}
