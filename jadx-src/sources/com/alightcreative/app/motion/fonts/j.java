package com.alightcreative.app.motion.fonts;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45788c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Integer, String> f45789f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<Integer> f45790s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List<Integer> f45791v;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j copy$default(j jVar, List list, int i2, List list2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = jVar.f45790s;
        }
        if ((i3 & 2) != 0) {
            i2 = jVar.f45788c;
        }
        if ((i3 & 4) != 0) {
            list2 = jVar.f45791v;
        }
        if ((i3 & 8) != 0) {
            map = jVar.f45789f;
        }
        return jVar.copy(list, i2, list2, map);
    }

    public final List<Integer> component1() {
        return this.f45790s;
    }

    public final int component2() {
        return this.f45788c;
    }

    public final List<Integer> component3() {
        return this.f45791v;
    }

    public final Map<Integer, String> component4() {
        return this.f45789f;
    }

    public final j copy(List<Integer> s2, int i2, List<Integer> v2, Map<Integer, String> map) {
        Intrinsics.checkNotNullParameter(s2, "s");
        Intrinsics.checkNotNullParameter(v2, "v");
        return new j(s2, i2, v2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f45790s, jVar.f45790s) && this.f45788c == jVar.f45788c && Intrinsics.areEqual(this.f45791v, jVar.f45791v) && Intrinsics.areEqual(this.f45789f, jVar.f45789f);
    }

    public int hashCode() {
        int iHashCode = ((((this.f45790s.hashCode() * 31) + Integer.hashCode(this.f45788c)) * 31) + this.f45791v.hashCode()) * 31;
        Map<Integer, String> map = this.f45789f;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "AMFontDB_AMFontInfo(s=" + this.f45790s + ", c=" + this.f45788c + ", v=" + this.f45791v + ", f=" + this.f45789f + ")";
    }

    public j(List<Integer> s2, int i2, List<Integer> v2, Map<Integer, String> map) {
        Intrinsics.checkNotNullParameter(s2, "s");
        Intrinsics.checkNotNullParameter(v2, "v");
        this.f45790s = s2;
        this.f45788c = i2;
        this.f45791v = v2;
        this.f45789f = map;
    }

    public final int getC() {
        return this.f45788c;
    }

    public final Map<Integer, String> getF() {
        return this.f45789f;
    }

    public final List<Integer> getS() {
        return this.f45790s;
    }

    public final List<Integer> getV() {
        return this.f45791v;
    }
}
