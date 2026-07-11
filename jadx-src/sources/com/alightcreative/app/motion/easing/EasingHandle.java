package com.alightcreative.app.motion.easing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.Vector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/alightcreative/app/motion/easing/EasingHandle;", "", "id", "", "position", "Lcom/alightcreative/app/motion/scene/Vector2D;", "origin", "allowOvershoot", "", "dampingFactor", "", "handleStyle", "Lcom/alightcreative/app/motion/easing/HandleStyle;", "<init>", "(Ljava/lang/String;Lcom/alightcreative/app/motion/scene/Vector2D;Lcom/alightcreative/app/motion/scene/Vector2D;ZFLcom/alightcreative/app/motion/easing/HandleStyle;)V", "getId", "()Ljava/lang/String;", "getPosition", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "getOrigin", "getAllowOvershoot", "()Z", "getDampingFactor", "()F", "getHandleStyle", "()Lcom/alightcreative/app/motion/easing/HandleStyle;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EasingHandle {
    public static final int $stable = 0;
    private final boolean allowOvershoot;
    private final float dampingFactor;
    private final HandleStyle handleStyle;
    private final String id;
    private final Vector2D origin;
    private final Vector2D position;

    public EasingHandle(String id, Vector2D position, Vector2D vector2D, boolean z2, float f3, HandleStyle handleStyle) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(handleStyle, "handleStyle");
        this.id = id;
        this.position = position;
        this.origin = vector2D;
        this.allowOvershoot = z2;
        this.dampingFactor = f3;
        this.handleStyle = handleStyle;
    }

    public static /* synthetic */ EasingHandle copy$default(EasingHandle easingHandle, String str, Vector2D vector2D, Vector2D vector2D2, boolean z2, float f3, HandleStyle handleStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = easingHandle.id;
        }
        if ((i2 & 2) != 0) {
            vector2D = easingHandle.position;
        }
        if ((i2 & 4) != 0) {
            vector2D2 = easingHandle.origin;
        }
        if ((i2 & 8) != 0) {
            z2 = easingHandle.allowOvershoot;
        }
        if ((i2 & 16) != 0) {
            f3 = easingHandle.dampingFactor;
        }
        if ((i2 & 32) != 0) {
            handleStyle = easingHandle.handleStyle;
        }
        float f4 = f3;
        HandleStyle handleStyle2 = handleStyle;
        return easingHandle.copy(str, vector2D, vector2D2, z2, f4, handleStyle2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Vector2D getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Vector2D getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAllowOvershoot() {
        return this.allowOvershoot;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getDampingFactor() {
        return this.dampingFactor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HandleStyle getHandleStyle() {
        return this.handleStyle;
    }

    public final EasingHandle copy(String id, Vector2D position, Vector2D origin, boolean allowOvershoot, float dampingFactor, HandleStyle handleStyle) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(handleStyle, "handleStyle");
        return new EasingHandle(id, position, origin, allowOvershoot, dampingFactor, handleStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EasingHandle)) {
            return false;
        }
        EasingHandle easingHandle = (EasingHandle) other;
        return Intrinsics.areEqual(this.id, easingHandle.id) && Intrinsics.areEqual(this.position, easingHandle.position) && Intrinsics.areEqual(this.origin, easingHandle.origin) && this.allowOvershoot == easingHandle.allowOvershoot && Float.compare(this.dampingFactor, easingHandle.dampingFactor) == 0 && Intrinsics.areEqual(this.handleStyle, easingHandle.handleStyle);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.position.hashCode()) * 31;
        Vector2D vector2D = this.origin;
        return ((((((iHashCode + (vector2D == null ? 0 : vector2D.hashCode())) * 31) + Boolean.hashCode(this.allowOvershoot)) * 31) + Float.hashCode(this.dampingFactor)) * 31) + this.handleStyle.hashCode();
    }

    public String toString() {
        return "EasingHandle(id=" + this.id + ", position=" + this.position + ", origin=" + this.origin + ", allowOvershoot=" + this.allowOvershoot + ", dampingFactor=" + this.dampingFactor + ", handleStyle=" + this.handleStyle + ")";
    }

    public final boolean getAllowOvershoot() {
        return this.allowOvershoot;
    }

    public final float getDampingFactor() {
        return this.dampingFactor;
    }

    public final HandleStyle getHandleStyle() {
        return this.handleStyle;
    }

    public final String getId() {
        return this.id;
    }

    public final Vector2D getOrigin() {
        return this.origin;
    }

    public final Vector2D getPosition() {
        return this.position;
    }

    public /* synthetic */ EasingHandle(String str, Vector2D vector2D, Vector2D vector2D2, boolean z2, float f3, HandleStyle handleStyle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, vector2D, (i2 & 4) != 0 ? null : vector2D2, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? 1.0f : f3, (i2 & 32) != 0 ? new HandleStyle(2131099755, 2131099755, false) : handleStyle);
    }
}
