package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.OptionalKeyableVector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableCBKnot;", "", TtmlNode.TAG_P, "Lcom/alightcreative/app/motion/scene/Keyable;", "Lcom/alightcreative/app/motion/scene/Vector2D;", "curveIn", "Lcom/alightcreative/app/motion/scene/OptionalKeyableVector2D;", "curveOut", "<init>", "(Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/OptionalKeyableVector2D;Lcom/alightcreative/app/motion/scene/OptionalKeyableVector2D;)V", "getP", "()Lcom/alightcreative/app/motion/scene/Keyable;", "getCurveIn", "()Lcom/alightcreative/app/motion/scene/OptionalKeyableVector2D;", "getCurveOut", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyableCBKnot {
    public static final int $stable = 8;
    private final OptionalKeyableVector2D curveIn;
    private final OptionalKeyableVector2D curveOut;
    private final Keyable<Vector2D> p;

    public KeyableCBKnot(Keyable<Vector2D> p2, OptionalKeyableVector2D curveIn, OptionalKeyableVector2D curveOut) {
        Intrinsics.checkNotNullParameter(p2, "p");
        Intrinsics.checkNotNullParameter(curveIn, "curveIn");
        Intrinsics.checkNotNullParameter(curveOut, "curveOut");
        this.p = p2;
        this.curveIn = curveIn;
        this.curveOut = curveOut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeyableCBKnot copy$default(KeyableCBKnot keyableCBKnot, Keyable keyable, OptionalKeyableVector2D optionalKeyableVector2D, OptionalKeyableVector2D optionalKeyableVector2D2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            keyable = keyableCBKnot.p;
        }
        if ((i2 & 2) != 0) {
            optionalKeyableVector2D = keyableCBKnot.curveIn;
        }
        if ((i2 & 4) != 0) {
            optionalKeyableVector2D2 = keyableCBKnot.curveOut;
        }
        return keyableCBKnot.copy(keyable, optionalKeyableVector2D, optionalKeyableVector2D2);
    }

    public final Keyable<Vector2D> component1() {
        return this.p;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OptionalKeyableVector2D getCurveIn() {
        return this.curveIn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OptionalKeyableVector2D getCurveOut() {
        return this.curveOut;
    }

    public final KeyableCBKnot copy(Keyable<Vector2D> p2, OptionalKeyableVector2D curveIn, OptionalKeyableVector2D curveOut) {
        Intrinsics.checkNotNullParameter(p2, "p");
        Intrinsics.checkNotNullParameter(curveIn, "curveIn");
        Intrinsics.checkNotNullParameter(curveOut, "curveOut");
        return new KeyableCBKnot(p2, curveIn, curveOut);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyableCBKnot)) {
            return false;
        }
        KeyableCBKnot keyableCBKnot = (KeyableCBKnot) other;
        return Intrinsics.areEqual(this.p, keyableCBKnot.p) && Intrinsics.areEqual(this.curveIn, keyableCBKnot.curveIn) && Intrinsics.areEqual(this.curveOut, keyableCBKnot.curveOut);
    }

    public int hashCode() {
        return (((this.p.hashCode() * 31) + this.curveIn.hashCode()) * 31) + this.curveOut.hashCode();
    }

    public String toString() {
        return "KeyableCBKnot(p=" + this.p + ", curveIn=" + this.curveIn + ", curveOut=" + this.curveOut + ")";
    }

    public final OptionalKeyableVector2D getCurveIn() {
        return this.curveIn;
    }

    public final OptionalKeyableVector2D getCurveOut() {
        return this.curveOut;
    }

    public final Keyable<Vector2D> getP() {
        return this.p;
    }

    public /* synthetic */ KeyableCBKnot(Keyable keyable, OptionalKeyableVector2D optionalKeyableVector2D, OptionalKeyableVector2D optionalKeyableVector2D2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(keyable, (i2 & 2) != 0 ? OptionalKeyableVector2D.NONE.INSTANCE : optionalKeyableVector2D, (i2 & 4) != 0 ? OptionalKeyableVector2D.NONE.INSTANCE : optionalKeyableVector2D2);
    }
}
