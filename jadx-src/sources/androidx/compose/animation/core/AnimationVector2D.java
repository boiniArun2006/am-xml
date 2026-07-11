package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001a\u0010(\u001a\u00020\f8\u0010X\u0090D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010\u001c¨\u0006)"}, d2 = {"Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/AnimationVector;", "", "v1", "v2", "<init>", "(FF)V", "", "nr", "()V", "KN", "()Landroidx/compose/animation/core/AnimationVector2D;", "", "index", c.f62177j, "(I)F", "value", "O", "(IF)V", "", "toString", "()Ljava/lang/String;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "F", "J2", "()F", "setV1$animation_core_release", "(F)V", "rl", "Uo", "setV2$animation_core_release", "t", "I", "size", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimationVector2D extends AnimationVector {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float v1;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private float v2;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public AnimationVector2D(float f3, float f4) {
        super(null);
        this.v1 = f3;
        this.v2 = f4;
        this.size = 2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void nr() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final float getV1() {
        return this.v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public AnimationVector2D t() {
        return new AnimationVector2D(0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void O(int index, float value) {
        if (index == 0) {
            this.v1 = value;
        } else {
            if (index != 1) {
                return;
            }
            this.v2 = value;
        }
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final float getV2() {
        return this.v2;
    }

    public boolean equals(Object other) {
        if (!(other instanceof AnimationVector2D)) {
            return false;
        }
        AnimationVector2D animationVector2D = (AnimationVector2D) other;
        return animationVector2D.v1 == this.v1 && animationVector2D.v2 == this.v2;
    }

    public int hashCode() {
        return (Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float n(int index) {
        if (index == 0) {
            return this.v1;
        }
        if (index != 1) {
            return 0.0f;
        }
        return this.v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: rl, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.v1 + ", v2 = " + this.v2;
    }
}
