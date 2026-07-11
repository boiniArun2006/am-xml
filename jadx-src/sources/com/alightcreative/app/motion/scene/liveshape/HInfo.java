package com.alightcreative.app.motion.scene.liveshape;

import com.alightcreative.app.motion.scene.Vector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/HInfo;", "", "pos", "Lcom/alightcreative/app/motion/scene/Vector2D;", "axis", "<init>", "(Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;)V", "getPos", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getAxis", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class HInfo {
    private final Vector2D axis;
    private final Vector2D pos;

    public static /* synthetic */ HInfo copy$default(HInfo hInfo, Vector2D vector2D, Vector2D vector2D2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            vector2D = hInfo.pos;
        }
        if ((i2 & 2) != 0) {
            vector2D2 = hInfo.axis;
        }
        return hInfo.copy(vector2D, vector2D2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Vector2D getPos() {
        return this.pos;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Vector2D getAxis() {
        return this.axis;
    }

    public final HInfo copy(Vector2D pos, Vector2D axis) {
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(axis, "axis");
        return new HInfo(pos, axis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HInfo)) {
            return false;
        }
        HInfo hInfo = (HInfo) other;
        return Intrinsics.areEqual(this.pos, hInfo.pos) && Intrinsics.areEqual(this.axis, hInfo.axis);
    }

    public int hashCode() {
        return (this.pos.hashCode() * 31) + this.axis.hashCode();
    }

    public String toString() {
        return "HInfo(pos=" + this.pos + ", axis=" + this.axis + ")";
    }

    public HInfo(Vector2D pos, Vector2D axis) {
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(axis, "axis");
        this.pos = pos;
        this.axis = axis;
    }

    public final Vector2D getAxis() {
        return this.axis;
    }

    public final Vector2D getPos() {
        return this.pos;
    }
}
