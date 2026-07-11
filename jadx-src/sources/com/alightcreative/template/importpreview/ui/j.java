package com.alightcreative.template.importpreview.ui;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f46945n;
    private final long rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f46945n, jVar.f46945n) && this.rl == jVar.rl;
    }

    public int hashCode() {
        return (this.f46945n.hashCode() * 31) + Long.hashCode(this.rl);
    }

    public String toString() {
        return "ElementPathId(path=" + this.f46945n + ", id=" + this.rl + ")";
    }

    public j(List path, long j2) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f46945n = path;
        this.rl = j2;
    }

    public final long n() {
        return this.rl;
    }

    public final List rl() {
        return this.f46945n;
    }
}
