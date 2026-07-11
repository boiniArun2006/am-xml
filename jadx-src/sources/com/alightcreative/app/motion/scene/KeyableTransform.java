package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.animators.AnimatorEnvironment;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\u0087\u0001\u00103\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00104\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableTransform;", "", "location", "Lcom/alightcreative/app/motion/scene/Keyable;", "Lcom/alightcreative/app/motion/scene/Vector3D;", "pivot", "Lcom/alightcreative/app/motion/scene/Vector2D;", "scale", "rotation", "", "orientation", "size", "opacity", "skew", "lockAspectRatio", "", "<init>", "(Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;FFLcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Keyable;Z)V", "getLocation", "()Lcom/alightcreative/app/motion/scene/Keyable;", "getPivot", "getScale", "getRotation", "getOrientation", "()F", "getSize", "getOpacity", "getSkew", "getLockAspectRatio", "()Z", "valueAtTimeCache0Tf", "Lcom/alightcreative/app/motion/scene/Transform;", "valueAtTimeCache0Time", "valueAtTimeCache1Tf", "valueAtTimeCache1Time", "valueAtTimeCache2Tf", "valueAtTimeCache2Time", "valueAtTime", "t", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "valueAtTimeOneFrameEarlier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyableTransform {
    public static final int $stable = 8;
    private final Keyable<Vector3D> location;
    private final boolean lockAspectRatio;
    private final Keyable<Float> opacity;
    private final float orientation;
    private final Keyable<Vector2D> pivot;
    private final Keyable<Float> rotation;
    private final Keyable<Vector2D> scale;
    private final float size;
    private final Keyable<Vector2D> skew;
    private Transform valueAtTimeCache0Tf;
    private float valueAtTimeCache0Time;
    private Transform valueAtTimeCache1Tf;
    private float valueAtTimeCache1Time;
    private Transform valueAtTimeCache2Tf;
    private float valueAtTimeCache2Time;

    public KeyableTransform(Keyable<Vector3D> location, Keyable<Vector2D> pivot, Keyable<Vector2D> scale, Keyable<Float> rotation, float f3, float f4, Keyable<Float> opacity, Keyable<Vector2D> skew, boolean z2) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(pivot, "pivot");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(opacity, "opacity");
        Intrinsics.checkNotNullParameter(skew, "skew");
        this.location = location;
        this.pivot = pivot;
        this.scale = scale;
        this.rotation = rotation;
        this.orientation = f3;
        this.size = f4;
        this.opacity = opacity;
        this.skew = skew;
        this.lockAspectRatio = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KeyableTransform copy$default(KeyableTransform keyableTransform, Keyable keyable, Keyable keyable2, Keyable keyable3, Keyable keyable4, float f3, float f4, Keyable keyable5, Keyable keyable6, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            keyable = keyableTransform.location;
        }
        if ((i2 & 2) != 0) {
            keyable2 = keyableTransform.pivot;
        }
        if ((i2 & 4) != 0) {
            keyable3 = keyableTransform.scale;
        }
        if ((i2 & 8) != 0) {
            keyable4 = keyableTransform.rotation;
        }
        if ((i2 & 16) != 0) {
            f3 = keyableTransform.orientation;
        }
        if ((i2 & 32) != 0) {
            f4 = keyableTransform.size;
        }
        if ((i2 & 64) != 0) {
            keyable5 = keyableTransform.opacity;
        }
        if ((i2 & 128) != 0) {
            keyable6 = keyableTransform.skew;
        }
        if ((i2 & 256) != 0) {
            z2 = keyableTransform.lockAspectRatio;
        }
        Keyable keyable7 = keyable6;
        boolean z3 = z2;
        float f5 = f4;
        Keyable keyable8 = keyable5;
        float f6 = f3;
        Keyable keyable9 = keyable3;
        return keyableTransform.copy(keyable, keyable2, keyable9, keyable4, f6, f5, keyable8, keyable7, z3);
    }

    public final Keyable<Vector3D> component1() {
        return this.location;
    }

    public final Keyable<Vector2D> component2() {
        return this.pivot;
    }

    public final Keyable<Vector2D> component3() {
        return this.scale;
    }

    public final Keyable<Float> component4() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    public final Keyable<Float> component7() {
        return this.opacity;
    }

    public final Keyable<Vector2D> component8() {
        return this.skew;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getLockAspectRatio() {
        return this.lockAspectRatio;
    }

    public final KeyableTransform copy(Keyable<Vector3D> location, Keyable<Vector2D> pivot, Keyable<Vector2D> scale, Keyable<Float> rotation, float orientation, float size, Keyable<Float> opacity, Keyable<Vector2D> skew, boolean lockAspectRatio) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(pivot, "pivot");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(opacity, "opacity");
        Intrinsics.checkNotNullParameter(skew, "skew");
        return new KeyableTransform(location, pivot, scale, rotation, orientation, size, opacity, skew, lockAspectRatio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyableTransform)) {
            return false;
        }
        KeyableTransform keyableTransform = (KeyableTransform) other;
        return Intrinsics.areEqual(this.location, keyableTransform.location) && Intrinsics.areEqual(this.pivot, keyableTransform.pivot) && Intrinsics.areEqual(this.scale, keyableTransform.scale) && Intrinsics.areEqual(this.rotation, keyableTransform.rotation) && Float.compare(this.orientation, keyableTransform.orientation) == 0 && Float.compare(this.size, keyableTransform.size) == 0 && Intrinsics.areEqual(this.opacity, keyableTransform.opacity) && Intrinsics.areEqual(this.skew, keyableTransform.skew) && this.lockAspectRatio == keyableTransform.lockAspectRatio;
    }

    public int hashCode() {
        return (((((((((((((((this.location.hashCode() * 31) + this.pivot.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.rotation.hashCode()) * 31) + Float.hashCode(this.orientation)) * 31) + Float.hashCode(this.size)) * 31) + this.opacity.hashCode()) * 31) + this.skew.hashCode()) * 31) + Boolean.hashCode(this.lockAspectRatio);
    }

    public String toString() {
        return "KeyableTransform(location=" + this.location + ", pivot=" + this.pivot + ", scale=" + this.scale + ", rotation=" + this.rotation + ", orientation=" + this.orientation + ", size=" + this.size + ", opacity=" + this.opacity + ", skew=" + this.skew + ", lockAspectRatio=" + this.lockAspectRatio + ")";
    }

    public final Transform valueAtTime(float t3) {
        Transform transform = this.valueAtTimeCache0Tf;
        if (transform != null && this.valueAtTimeCache0Time == t3) {
            Intrinsics.checkNotNull(transform);
            return transform;
        }
        Transform transform2 = this.valueAtTimeCache1Tf;
        if (transform2 != null && this.valueAtTimeCache1Time == t3) {
            Intrinsics.checkNotNull(transform2);
            return transform2;
        }
        Transform transform3 = this.valueAtTimeCache2Tf;
        if (transform3 != null && this.valueAtTimeCache2Time == t3) {
            Intrinsics.checkNotNull(transform3);
            return transform3;
        }
        Vector3D vector3D = (Vector3D) KeyableKt.valueAtTime(this.location, t3);
        Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(this.pivot, t3);
        Vector2D vector2D2 = (Vector2D) KeyableKt.valueAtTime(this.scale, t3);
        Vector2D vector2D3 = (Vector2D) KeyableKt.valueAtTime(this.skew, t3);
        Transform transform4 = new Transform(vector3D, vector2D, vector2D2, this.orientation, this.size, ((Number) KeyableKt.valueAtTime(this.rotation, t3)).floatValue(), ((Number) KeyableKt.valueAtTime(this.opacity, t3)).floatValue(), vector2D3, null, 256, null);
        this.valueAtTimeCache2Tf = this.valueAtTimeCache1Tf;
        this.valueAtTimeCache2Time = this.valueAtTimeCache1Time;
        this.valueAtTimeCache1Tf = this.valueAtTimeCache0Tf;
        this.valueAtTimeCache1Time = this.valueAtTimeCache0Time;
        this.valueAtTimeCache0Tf = transform4;
        this.valueAtTimeCache0Time = t3;
        return transform4;
    }

    public final Keyable<Vector3D> getLocation() {
        return this.location;
    }

    public final boolean getLockAspectRatio() {
        return this.lockAspectRatio;
    }

    public final Keyable<Float> getOpacity() {
        return this.opacity;
    }

    public final float getOrientation() {
        return this.orientation;
    }

    public final Keyable<Vector2D> getPivot() {
        return this.pivot;
    }

    public final Keyable<Float> getRotation() {
        return this.rotation;
    }

    public final Keyable<Vector2D> getScale() {
        return this.scale;
    }

    public final float getSize() {
        return this.size;
    }

    public final Keyable<Vector2D> getSkew() {
        return this.skew;
    }

    public final Transform valueAtTimeOneFrameEarlier(AnimatorEnvironment env) {
        Intrinsics.checkNotNullParameter(env, "env");
        Vector3D vector3D = (Vector3D) KeyableKt.valueAtTimeOneFrameEarlier(this.location, env);
        Vector2D vector2D = (Vector2D) KeyableKt.valueAtTimeOneFrameEarlier(this.pivot, env);
        Vector2D vector2D2 = (Vector2D) KeyableKt.valueAtTimeOneFrameEarlier(this.scale, env);
        Vector2D vector2D3 = (Vector2D) KeyableKt.valueAtTimeOneFrameEarlier(this.skew, env);
        return new Transform(vector3D, vector2D, vector2D2, this.orientation, this.size, ((Number) KeyableKt.valueAtTimeOneFrameEarlier(this.rotation, env)).floatValue(), ((Number) KeyableKt.valueAtTimeOneFrameEarlier(this.opacity, env)).floatValue(), vector2D3, null, 256, null);
    }

    public /* synthetic */ KeyableTransform(Keyable keyable, Keyable keyable2, Keyable keyable3, Keyable keyable4, float f3, float f4, Keyable keyable5, Keyable keyable6, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(keyable, (i2 & 2) != 0 ? KeyableVector2D.INSTANCE.getZERO() : keyable2, (i2 & 4) != 0 ? KeyableVector2D.INSTANCE.getONE() : keyable3, (i2 & 8) != 0 ? KeyableFloat.INSTANCE.getZERO() : keyable4, (i2 & 16) != 0 ? 0.0f : f3, (i2 & 32) != 0 ? 1.0f : f4, (i2 & 64) != 0 ? KeyableFloat.INSTANCE.getONE() : keyable5, (i2 & 128) != 0 ? KeyableVector2D.INSTANCE.getZERO() : keyable6, (i2 & 256) != 0 ? true : z2);
    }

    public final Transform valueAtTime(AnimatorEnvironment env) {
        Intrinsics.checkNotNullParameter(env, "env");
        Vector3D vector3D = (Vector3D) KeyableKt.valueAtTime(this.location, env);
        Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(this.pivot, env);
        Vector2D vector2D2 = (Vector2D) KeyableKt.valueAtTime(this.scale, env);
        Vector2D vector2D3 = (Vector2D) KeyableKt.valueAtTime(this.skew, env);
        return new Transform(vector3D, vector2D, vector2D2, this.orientation, this.size, ((Number) KeyableKt.valueAtTime(this.rotation, env)).floatValue(), ((Number) KeyableKt.valueAtTime(this.opacity, env)).floatValue(), vector2D3, null, 256, null);
    }
}
