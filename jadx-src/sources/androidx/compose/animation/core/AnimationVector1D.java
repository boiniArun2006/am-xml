package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0005R\u001a\u0010#\u001a\u00020\u000b8\u0010X\u0090D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u001b¨\u0006$"}, d2 = {"Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector;", "", "initVal", "<init>", "(F)V", "", "nr", "()V", "Uo", "()Landroidx/compose/animation/core/AnimationVector1D;", "", "index", c.f62177j, "(I)F", "value", "O", "(IF)V", "", "toString", "()Ljava/lang/String;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "F", "J2", "()F", "setValue$animation_core_release", "rl", "I", "size", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimationVector1D extends AnimationVector {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int size;

    public AnimationVector1D(float f3) {
        super(null);
        this.value = f3;
        this.size = 1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void nr() {
        this.value = 0.0f;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void O(int index, float value) {
        if (index == 0) {
            this.value = value;
        }
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public AnimationVector1D t() {
        return new AnimationVector1D(0.0f);
    }

    public boolean equals(Object other) {
        return (other instanceof AnimationVector1D) && ((AnimationVector1D) other).value == this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float n(int index) {
        if (index == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    /* JADX INFO: renamed from: rl, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }
}
