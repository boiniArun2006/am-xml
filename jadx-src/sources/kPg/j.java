package kPg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr f69923n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f69924t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f69923n == jVar.f69923n && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f69924t, jVar.f69924t);
    }

    public j(Dsr type, String id, String mime) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(mime, "mime");
        this.f69923n = type;
        this.rl = id;
        this.f69924t = mime;
    }

    public int hashCode() {
        return (((this.f69923n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f69924t.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final String rl() {
        return this.f69924t;
    }

    public final Dsr t() {
        return this.f69923n;
    }

    public String toString() {
        return "SampleMediaEntity(type=" + this.f69923n + ", id=" + this.rl + ", mime=" + this.f69924t + ")";
    }
}
