package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBI\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u0012J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006$"}, d2 = {"Lcom/alightcreative/app/motion/scene/CBSegment;", "", "p1", "Lcom/alightcreative/app/motion/scene/Vector2D;", "p2", "p3", "p4", "<init>", "(Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;)V", "x1", "", "y1", "x2", "y2", "x3", "y3", "x4", "y4", "(FFFFFFFF)V", "getP1", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getP2", "getP3", "getP4", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CBSegment {
    public static final int $stable = 0;
    private final Vector2D p1;
    private final Vector2D p2;
    private final Vector2D p3;
    private final Vector2D p4;

    public CBSegment(Vector2D p1, Vector2D p2, Vector2D p3, Vector2D p4) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        Intrinsics.checkNotNullParameter(p4, "p4");
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public static /* synthetic */ CBSegment copy$default(CBSegment cBSegment, Vector2D vector2D, Vector2D vector2D2, Vector2D vector2D3, Vector2D vector2D4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vector2D = cBSegment.p1;
        }
        if ((i2 & 2) != 0) {
            vector2D2 = cBSegment.p2;
        }
        if ((i2 & 4) != 0) {
            vector2D3 = cBSegment.p3;
        }
        if ((i2 & 8) != 0) {
            vector2D4 = cBSegment.p4;
        }
        return cBSegment.copy(vector2D, vector2D2, vector2D3, vector2D4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Vector2D getP1() {
        return this.p1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Vector2D getP2() {
        return this.p2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Vector2D getP3() {
        return this.p3;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Vector2D getP4() {
        return this.p4;
    }

    public final CBSegment copy(Vector2D p1, Vector2D p2, Vector2D p3, Vector2D p4) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        Intrinsics.checkNotNullParameter(p4, "p4");
        return new CBSegment(p1, p2, p3, p4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBSegment)) {
            return false;
        }
        CBSegment cBSegment = (CBSegment) other;
        return Intrinsics.areEqual(this.p1, cBSegment.p1) && Intrinsics.areEqual(this.p2, cBSegment.p2) && Intrinsics.areEqual(this.p3, cBSegment.p3) && Intrinsics.areEqual(this.p4, cBSegment.p4);
    }

    public int hashCode() {
        return (((((this.p1.hashCode() * 31) + this.p2.hashCode()) * 31) + this.p3.hashCode()) * 31) + this.p4.hashCode();
    }

    public String toString() {
        return "CBSegment(p1=" + this.p1 + ", p2=" + this.p2 + ", p3=" + this.p3 + ", p4=" + this.p4 + ")";
    }

    public final Vector2D getP1() {
        return this.p1;
    }

    public final Vector2D getP2() {
        return this.p2;
    }

    public final Vector2D getP3() {
        return this.p3;
    }

    public final Vector2D getP4() {
        return this.p4;
    }

    public CBSegment(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this(new Vector2D(f3, f4), new Vector2D(f5, f6), new Vector2D(f7, f8), new Vector2D(f9, f10));
    }
}
