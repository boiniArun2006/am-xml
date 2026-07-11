package com.alightcreative.widget;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class h6y {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f47416n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6y) && Intrinsics.areEqual(this.f47416n, ((h6y) obj).f47416n);
    }

    public int hashCode() {
        return this.f47416n.hashCode();
    }

    public String toString() {
        return "PasteStyleOptions(pasteOpt=" + this.f47416n + ")";
    }

    public h6y(Set pasteOpt) {
        Intrinsics.checkNotNullParameter(pasteOpt, "pasteOpt");
        this.f47416n = pasteOpt;
    }

    public final Set n() {
        return this.f47416n;
    }
}
