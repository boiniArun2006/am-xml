package QmE;

import QmE.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: QmE.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C1449m implements j.QUT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8609n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1449m) && Intrinsics.areEqual(this.f8609n, ((C1449m) obj).f8609n);
    }

    public C1449m(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f8609n = url;
    }

    public int hashCode() {
        return this.f8609n.hashCode();
    }

    public final String n() {
        return this.f8609n;
    }

    public String toString() {
        return "VideoDidPlayToEndTime(url=" + this.f8609n + ")";
    }
}
