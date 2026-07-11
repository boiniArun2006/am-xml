package com.alightcreative.app.motion.persist;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f45876n;
    private final List rl;

    public w6(int i2, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f45876n = i2;
        this.rl = data;
    }

    public static /* synthetic */ w6 rl(w6 w6Var, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = w6Var.f45876n;
        }
        if ((i3 & 2) != 0) {
            list = w6Var.rl;
        }
        return w6Var.n(i2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return this.f45876n == w6Var.f45876n && Intrinsics.areEqual(this.rl, w6Var.rl);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f45876n) * 31) + this.rl.hashCode();
    }

    public final w6 n(int i2, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new w6(i2, data);
    }

    public String toString() {
        return "RecentStrings(limit=" + this.f45876n + ", data=" + this.rl + ")";
    }

    public final int nr() {
        return this.f45876n;
    }

    public final List t() {
        return this.rl;
    }

    public /* synthetic */ w6(int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
