package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/scene/StrokePoint;", "", "location", "Lcom/alightcreative/app/motion/scene/Vector2D;", "pressure", "", "<init>", "(Lcom/alightcreative/app/motion/scene/Vector2D;F)V", "getLocation", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getPressure", "()F", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StrokePoint {
    public static final int $stable = 0;
    private final Vector2D location;
    private final float pressure;

    public static /* synthetic */ StrokePoint copy$default(StrokePoint strokePoint, Vector2D vector2D, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vector2D = strokePoint.location;
        }
        if ((i2 & 2) != 0) {
            f3 = strokePoint.pressure;
        }
        return strokePoint.copy(vector2D, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Vector2D getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    public final StrokePoint copy(Vector2D location, float pressure) {
        Intrinsics.checkNotNullParameter(location, "location");
        return new StrokePoint(location, pressure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrokePoint)) {
            return false;
        }
        StrokePoint strokePoint = (StrokePoint) other;
        return Intrinsics.areEqual(this.location, strokePoint.location) && Float.compare(this.pressure, strokePoint.pressure) == 0;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + Float.hashCode(this.pressure);
    }

    public String toString() {
        return "StrokePoint(location=" + this.location + ", pressure=" + this.pressure + ")";
    }

    public StrokePoint(Vector2D location, float f3) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.location = location;
        this.pressure = f3;
    }

    public final Vector2D getLocation() {
        return this.location;
    }

    public final float getPressure() {
        return this.pressure;
    }
}
