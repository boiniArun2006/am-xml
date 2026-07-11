package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J/\u0010#\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010*R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b+\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u0018\u00100\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010.R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00105R\u001e\u00109\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00108R\u0018\u0010:\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0018\u0010<\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010.¨\u0006="}, d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/collection/IntList;", "timestamps", "Landroidx/collection/IntObjectMap;", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "keyframes", "", "durationMillis", "delayMillis", "", "periodicBias", "<init>", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IIF)V", "initialValue", "targetValue", "initialVelocity", "", "gh", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "index", "mUb", "(I)Landroidx/compose/animation/core/Easing;", "timeMillis", "xMQ", "(II)F", "KN", "(I)I", "", "playTimeNanos", "Uo", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "J2", c.f62177j, "Landroidx/collection/IntList;", "rl", "Landroidx/collection/IntObjectMap;", "t", "I", "()I", "nr", "O", "F", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "", "[F", "times", "Landroidx/compose/animation/core/MonoSpline;", "Landroidx/compose/animation/core/MonoSpline;", "monoSpline", "", "[[F", IV8ValueMap.FUNCTION_VALUES, "lastInitialValue", "qie", "lastTargetValue", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVectorizedMonoSplineKeyframesSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n1#1,190:1\n65#2:191\n65#2:192\n70#2:195\n425#3:193\n425#3:194\n*S KotlinDebug\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n*L\n50#1:191\n67#1:192\n161#1:195\n82#1:193\n86#1:194\n*E\n"})
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private AnimationVector valueVector;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private float[] times;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float periodicBias;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private AnimationVector velocityVector;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private AnimationVector lastInitialValue;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private float[][] values;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final IntList timestamps;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int delayMillis;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private AnimationVector lastTargetValue;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final IntObjectMap keyframes;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private MonoSpline monoSpline;

    private final int KN(int timeMillis) {
        int iRl = IntList.rl(this.timestamps, timeMillis, 0, 0, 6, null);
        return iRl < -1 ? -(iRl + 2) : iRl;
    }

    private final void gh(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        float[] fArr;
        if (this.valueVector == null) {
            this.valueVector = AnimationVectorsKt.Uo(initialValue);
            this.velocityVector = AnimationVectorsKt.Uo(initialVelocity);
            int i2 = this.timestamps._size;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = this.timestamps.O(i3) / 1000;
            }
            this.times = fArr2;
        }
        if (this.monoSpline != null && Intrinsics.areEqual(this.lastInitialValue, initialValue) && Intrinsics.areEqual(this.lastTargetValue, targetValue)) {
            return;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.lastInitialValue, initialValue);
        boolean zAreEqual2 = Intrinsics.areEqual(this.lastTargetValue, targetValue);
        this.lastInitialValue = initialValue;
        this.lastTargetValue = targetValue;
        int size = initialValue.getSize();
        float[][] fArr3 = this.values;
        if (fArr3 == null) {
            int i5 = this.timestamps._size;
            fArr3 = new float[i5][];
            for (int i7 = 0; i7 < i5; i7++) {
                int iO = this.timestamps.O(i7);
                Pair pair = (Pair) this.keyframes.rl(iO);
                if (iO == 0 && pair == null) {
                    fArr = new float[size];
                    for (int i8 = 0; i8 < size; i8++) {
                        fArr[i8] = initialValue.n(i8);
                    }
                } else if (iO == getDurationMillis() && pair == null) {
                    fArr = new float[size];
                    for (int i9 = 0; i9 < size; i9++) {
                        fArr[i9] = targetValue.n(i9);
                    }
                } else {
                    Intrinsics.checkNotNull(pair);
                    AnimationVector animationVector = (AnimationVector) pair.getFirst();
                    float[] fArr4 = new float[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        fArr4[i10] = animationVector.n(i10);
                    }
                    fArr = fArr4;
                }
                fArr3[i7] = fArr;
            }
            this.values = fArr3;
        } else {
            if (!zAreEqual && !this.keyframes.n(0)) {
                int iRl = IntList.rl(this.timestamps, 0, 0, 0, 6, null);
                float[] fArr5 = new float[size];
                for (int i11 = 0; i11 < size; i11++) {
                    fArr5[i11] = initialValue.n(i11);
                }
                fArr3[iRl] = fArr5;
            }
            if (!zAreEqual2 && !this.keyframes.n(getDurationMillis())) {
                int iRl2 = IntList.rl(this.timestamps, getDurationMillis(), 0, 0, 6, null);
                float[] fArr6 = new float[size];
                for (int i12 = 0; i12 < size; i12++) {
                    fArr6[i12] = targetValue.n(i12);
                }
                fArr3[iRl2] = fArr6;
            }
        }
        float[] fArr7 = this.times;
        if (fArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(YjqZUJsVmhcjko.hBnaw);
            fArr7 = null;
        }
        this.monoSpline = new MonoSpline(fArr7, fArr3, this.periodicBias);
    }

    private final Easing mUb(int index) {
        Easing easing;
        Pair pair = (Pair) this.keyframes.rl(this.timestamps.O(index));
        return (pair == null || (easing = (Easing) pair.getSecond()) == null) ? EasingKt.O() : easing;
    }

    private final float xMQ(int index, int timeMillis) {
        float f3;
        IntList intList = this.timestamps;
        if (index >= intList._size - 1) {
            f3 = timeMillis;
        } else {
            int iO = intList.O(index);
            int iO2 = this.timestamps.O(index + 1);
            if (timeMillis != iO) {
                float f4 = iO2 - iO;
                return ((f4 * mUb(index).n((timeMillis - iO) / f4)) + iO) / 1000;
            }
            f3 = iO;
        }
        return f3 / 1000;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    /* JADX INFO: renamed from: nr, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    /* JADX INFO: renamed from: rl, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    public VectorizedMonoSplineKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i2, int i3, float f3) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i2;
        this.delayMillis = i3;
        this.periodicBias = f3;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector J2(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        int iO = (int) VectorizedAnimationSpecKt.O(this, playTimeNanos / 1000000);
        gh(initialValue, targetValue, initialVelocity);
        int iKN = KN(iO);
        AnimationVector animationVector = this.velocityVector;
        Intrinsics.checkNotNull(animationVector);
        MonoSpline monoSpline = this.monoSpline;
        Intrinsics.checkNotNull(monoSpline);
        monoSpline.rl(xMQ(iKN, iO), animationVector, iKN);
        return animationVector;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector Uo(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        int iO = (int) VectorizedAnimationSpecKt.O(this, playTimeNanos / 1000000);
        Pair pair = (Pair) this.keyframes.rl(iO);
        if (pair != null) {
            return (AnimationVector) pair.getFirst();
        }
        if (iO >= getDurationMillis()) {
            return targetValue;
        }
        if (iO <= 0) {
            return initialValue;
        }
        gh(initialValue, targetValue, initialVelocity);
        int iKN = KN(iO);
        AnimationVector animationVector = this.valueVector;
        Intrinsics.checkNotNull(animationVector);
        MonoSpline monoSpline = this.monoSpline;
        Intrinsics.checkNotNull(monoSpline);
        monoSpline.n(xMQ(iKN, iO), animationVector, iKN);
        return animationVector;
    }
}
