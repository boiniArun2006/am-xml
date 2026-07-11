package com.alightcreative.app.motion.scene;

import android.graphics.Trmy.yioUaKMByL;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.OptionalVector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/alightcreative/app/motion/scene/CBKnot;", "", TtmlNode.TAG_P, "Lcom/alightcreative/app/motion/scene/Vector2D;", "curveIn", "Lcom/alightcreative/app/motion/scene/OptionalVector2D;", "curveOut", "<init>", "(Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/OptionalVector2D;Lcom/alightcreative/app/motion/scene/OptionalVector2D;)V", "getP", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getCurveIn", "()Lcom/alightcreative/app/motion/scene/OptionalVector2D;", "getCurveOut", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CBKnot {
    public static final int $stable = 0;
    private final OptionalVector2D curveIn;
    private final OptionalVector2D curveOut;
    private final Vector2D p;

    public CBKnot(Vector2D p2, OptionalVector2D curveIn, OptionalVector2D curveOut) {
        Intrinsics.checkNotNullParameter(p2, "p");
        Intrinsics.checkNotNullParameter(curveIn, "curveIn");
        Intrinsics.checkNotNullParameter(curveOut, "curveOut");
        this.p = p2;
        this.curveIn = curveIn;
        this.curveOut = curveOut;
    }

    public static /* synthetic */ CBKnot copy$default(CBKnot cBKnot, Vector2D vector2D, OptionalVector2D optionalVector2D, OptionalVector2D optionalVector2D2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vector2D = cBKnot.p;
        }
        if ((i2 & 2) != 0) {
            optionalVector2D = cBKnot.curveIn;
        }
        if ((i2 & 4) != 0) {
            optionalVector2D2 = cBKnot.curveOut;
        }
        return cBKnot.copy(vector2D, optionalVector2D, optionalVector2D2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Vector2D getP() {
        return this.p;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OptionalVector2D getCurveIn() {
        return this.curveIn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OptionalVector2D getCurveOut() {
        return this.curveOut;
    }

    public final CBKnot copy(Vector2D p2, OptionalVector2D curveIn, OptionalVector2D curveOut) {
        Intrinsics.checkNotNullParameter(p2, yioUaKMByL.ePqnLmr);
        Intrinsics.checkNotNullParameter(curveIn, "curveIn");
        Intrinsics.checkNotNullParameter(curveOut, "curveOut");
        return new CBKnot(p2, curveIn, curveOut);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBKnot)) {
            return false;
        }
        CBKnot cBKnot = (CBKnot) other;
        return Intrinsics.areEqual(this.p, cBKnot.p) && Intrinsics.areEqual(this.curveIn, cBKnot.curveIn) && Intrinsics.areEqual(this.curveOut, cBKnot.curveOut);
    }

    public int hashCode() {
        return (((this.p.hashCode() * 31) + this.curveIn.hashCode()) * 31) + this.curveOut.hashCode();
    }

    public String toString() {
        return "CBKnot(p=" + this.p + ", curveIn=" + this.curveIn + PtsLKY.JPxXZhqzo + this.curveOut + ")";
    }

    public final OptionalVector2D getCurveIn() {
        return this.curveIn;
    }

    public final OptionalVector2D getCurveOut() {
        return this.curveOut;
    }

    public final Vector2D getP() {
        return this.p;
    }

    public /* synthetic */ CBKnot(Vector2D vector2D, OptionalVector2D optionalVector2D, OptionalVector2D optionalVector2D2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(vector2D, (i2 & 2) != 0 ? OptionalVector2D.NONE.INSTANCE : optionalVector2D, (i2 & 4) != 0 ? OptionalVector2D.NONE.INSTANCE : optionalVector2D2);
    }
}
