package com.alightcreative.app.motion.scene.timemapping;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.Keyable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/alightcreative/app/motion/scene/timemapping/TimeMapping;", "", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "itemKeyable", "LH7v/j;", "speedFunction", "<init>", "(Lcom/alightcreative/app/motion/scene/Keyable;LH7v/j;)V", "component1", "()Lcom/alightcreative/app/motion/scene/Keyable;", "component2", "()LH7v/j;", "copy", "(Lcom/alightcreative/app/motion/scene/Keyable;LH7v/j;)Lcom/alightcreative/app/motion/scene/timemapping/TimeMapping;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/alightcreative/app/motion/scene/Keyable;", "getItemKeyable", "LH7v/j;", "getSpeedFunction", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimeMapping {
    public static final int $stable = 8;
    private final Keyable<Float> itemKeyable;
    private final H7v.j speedFunction;

    public final Keyable<Float> component1() {
        return this.itemKeyable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeMapping)) {
            return false;
        }
        TimeMapping timeMapping = (TimeMapping) other;
        return Intrinsics.areEqual(this.itemKeyable, timeMapping.itemKeyable) && Intrinsics.areEqual(this.speedFunction, timeMapping.speedFunction);
    }

    public int hashCode() {
        return (this.itemKeyable.hashCode() * 31) + this.speedFunction.hashCode();
    }

    public String toString() {
        return "TimeMapping(itemKeyable=" + this.itemKeyable + ", speedFunction=" + this.speedFunction + ")";
    }

    public TimeMapping(Keyable<Float> itemKeyable, H7v.j speedFunction) {
        Intrinsics.checkNotNullParameter(itemKeyable, "itemKeyable");
        Intrinsics.checkNotNullParameter(speedFunction, "speedFunction");
        this.itemKeyable = itemKeyable;
        this.speedFunction = speedFunction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimeMapping copy$default(TimeMapping timeMapping, Keyable keyable, H7v.j jVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            keyable = timeMapping.itemKeyable;
        }
        if ((i2 & 2) != 0) {
            jVar = timeMapping.speedFunction;
        }
        return timeMapping.copy(keyable, jVar);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final H7v.j getSpeedFunction() {
        return this.speedFunction;
    }

    public final TimeMapping copy(Keyable<Float> itemKeyable, H7v.j speedFunction) {
        Intrinsics.checkNotNullParameter(itemKeyable, "itemKeyable");
        Intrinsics.checkNotNullParameter(speedFunction, "speedFunction");
        return new TimeMapping(itemKeyable, speedFunction);
    }

    public final Keyable<Float> getItemKeyable() {
        return this.itemKeyable;
    }

    public final H7v.j getSpeedFunction() {
        return this.speedFunction;
    }
}
