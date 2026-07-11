package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/alightcreative/app/motion/scene/ElementTiming;", "", "startTime", "", "endTime", "<init>", "(II)V", "getStartTime", "()I", "getEndTime", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ElementTiming {
    public static final int $stable = 0;
    private final int endTime;
    private final int startTime;

    public static /* synthetic */ ElementTiming copy$default(ElementTiming elementTiming, int i2, int i3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = elementTiming.startTime;
        }
        if ((i5 & 2) != 0) {
            i3 = elementTiming.endTime;
        }
        return elementTiming.copy(i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    public final ElementTiming copy(int startTime, int endTime) {
        return new ElementTiming(startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElementTiming)) {
            return false;
        }
        ElementTiming elementTiming = (ElementTiming) other;
        return this.startTime == elementTiming.startTime && this.endTime == elementTiming.endTime;
    }

    public int hashCode() {
        return (Integer.hashCode(this.startTime) * 31) + Integer.hashCode(this.endTime);
    }

    public String toString() {
        return "ElementTiming(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public ElementTiming(int i2, int i3) {
        this.startTime = i2;
        this.endTime = i3;
    }
}
