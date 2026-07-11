package com.alightcreative.app.motion.activities;

import com.alightcreative.app.motion.scene.CompoundCubicBSpline;
import com.alightcreative.app.motion.scene.liveshape.LiveShape;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class E3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CompoundCubicBSpline f44393n;
    private final LiveShape rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f44394t;

    public E3(CompoundCubicBSpline path, LiveShape liveShape, String id) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(id, "id");
        this.f44393n = path;
        this.rl = liveShape;
        this.f44394t = id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E3)) {
            return false;
        }
        E3 e3 = (E3) obj;
        return Intrinsics.areEqual(this.f44393n, e3.f44393n) && Intrinsics.areEqual(this.rl, e3.rl) && Intrinsics.areEqual(this.f44394t, e3.f44394t);
    }

    public int hashCode() {
        int iHashCode = this.f44393n.hashCode() * 31;
        LiveShape liveShape = this.rl;
        return ((iHashCode + (liveShape == null ? 0 : liveShape.hashCode())) * 31) + this.f44394t.hashCode();
    }

    public String toString() {
        return "ShapeOption(path=" + this.f44393n + ", shape=" + this.rl + ", id=" + this.f44394t + ")";
    }

    public final String n() {
        return this.f44394t;
    }

    public final CompoundCubicBSpline rl() {
        return this.f44393n;
    }

    public final LiveShape t() {
        return this.rl;
    }

    public /* synthetic */ E3(CompoundCubicBSpline compoundCubicBSpline, LiveShape liveShape, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(compoundCubicBSpline, (i2 & 2) != 0 ? null : liveShape, str);
    }
}
