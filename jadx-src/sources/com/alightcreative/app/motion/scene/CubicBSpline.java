package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/alightcreative/app/motion/scene/CubicBSpline;", "", "knots", "", "Lcom/alightcreative/app/motion/scene/CBKnot;", "closed", "", "exclude", "<init>", "(Ljava/util/List;ZZ)V", "getKnots", "()Ljava/util/List;", "getClosed", "()Z", "getExclude", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CubicBSpline {
    private final boolean closed;
    private final boolean exclude;
    private final List<CBKnot> knots;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final CubicBSpline EMPTY = new CubicBSpline(CollectionsKt.emptyList(), true, false, 4, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/CubicBSpline$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/alightcreative/app/motion/scene/CubicBSpline;", "getEMPTY", "()Lcom/alightcreative/app/motion/scene/CubicBSpline;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CubicBSpline getEMPTY() {
            return CubicBSpline.EMPTY;
        }
    }

    public CubicBSpline(List<CBKnot> knots, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(knots, "knots");
        this.knots = knots;
        this.closed = z2;
        this.exclude = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CubicBSpline copy$default(CubicBSpline cubicBSpline, List list, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = cubicBSpline.knots;
        }
        if ((i2 & 2) != 0) {
            z2 = cubicBSpline.closed;
        }
        if ((i2 & 4) != 0) {
            z3 = cubicBSpline.exclude;
        }
        return cubicBSpline.copy(list, z2, z3);
    }

    public final List<CBKnot> component1() {
        return this.knots;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getExclude() {
        return this.exclude;
    }

    public final CubicBSpline copy(List<CBKnot> knots, boolean closed, boolean exclude) {
        Intrinsics.checkNotNullParameter(knots, "knots");
        return new CubicBSpline(knots, closed, exclude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CubicBSpline)) {
            return false;
        }
        CubicBSpline cubicBSpline = (CubicBSpline) other;
        return Intrinsics.areEqual(this.knots, cubicBSpline.knots) && this.closed == cubicBSpline.closed && this.exclude == cubicBSpline.exclude;
    }

    public int hashCode() {
        return (((this.knots.hashCode() * 31) + Boolean.hashCode(this.closed)) * 31) + Boolean.hashCode(this.exclude);
    }

    public String toString() {
        return "CubicBSpline(knots=" + this.knots + ", closed=" + this.closed + ", exclude=" + this.exclude + ")";
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final boolean getExclude() {
        return this.exclude;
    }

    public final List<CBKnot> getKnots() {
        return this.knots;
    }

    public /* synthetic */ CubicBSpline(List list, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z2, (i2 & 4) != 0 ? false : z3);
    }
}
