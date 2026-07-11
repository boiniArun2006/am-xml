package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/alightcreative/app/motion/scene/QBPoint;", "", "x", "", "y", "onCurve", "", "<init>", "(FFZ)V", "getX", "()F", "getY", "getOnCurve", "()Z", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QBPoint {
    public static final int $stable = 0;
    private final boolean onCurve;
    private final float x;
    private final float y;

    public QBPoint(float f3, float f4, boolean z2) {
        this.x = f3;
        this.y = f4;
        this.onCurve = z2;
    }

    public static /* synthetic */ QBPoint copy$default(QBPoint qBPoint, float f3, float f4, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = qBPoint.x;
        }
        if ((i2 & 2) != 0) {
            f4 = qBPoint.y;
        }
        if ((i2 & 4) != 0) {
            z2 = qBPoint.onCurve;
        }
        return qBPoint.copy(f3, f4, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getOnCurve() {
        return this.onCurve;
    }

    public final QBPoint copy(float x2, float y2, boolean onCurve) {
        return new QBPoint(x2, y2, onCurve);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QBPoint)) {
            return false;
        }
        QBPoint qBPoint = (QBPoint) other;
        return Float.compare(this.x, qBPoint.x) == 0 && Float.compare(this.y, qBPoint.y) == 0 && this.onCurve == qBPoint.onCurve;
    }

    public int hashCode() {
        return (((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Boolean.hashCode(this.onCurve);
    }

    public String toString() {
        return "QBPoint(x=" + this.x + ", y=" + this.y + ", onCurve=" + this.onCurve + ")";
    }

    public /* synthetic */ QBPoint(float f3, float f4, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, (i2 & 4) != 0 ? true : z2);
    }

    public final boolean getOnCurve() {
        return this.onCurve;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }
}
