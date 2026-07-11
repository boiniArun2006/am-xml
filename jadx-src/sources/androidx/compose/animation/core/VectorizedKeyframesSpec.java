package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BE\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010.R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b/\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010-R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00106R\u0018\u00109\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0018\u0010:\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0018\u0010;\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0018\u0010=\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010A\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00106R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/collection/IntList;", "timestamps", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "keyframes", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "defaultEasing", "Landroidx/compose/animation/core/ArcMode;", "initialArcMode", "<init>", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "initialValue", "targetValue", "initialVelocity", "", "gh", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "timeMillis", "", "xMQ", "(I)F", "index", "", "asFraction", "mUb", "(IIZ)F", "KN", "(I)I", "", "playTimeNanos", "Uo", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "J2", c.f62177j, "Landroidx/collection/IntList;", "rl", "Landroidx/collection/IntObjectMap;", "t", "I", "()I", "nr", "O", "Landroidx/compose/animation/core/Easing;", "", "[I", "modes", "", "[F", "times", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "lastInitialValue", "qie", "lastTargetValue", "az", "posArray", "ty", "slopeArray", "Landroidx/compose/animation/core/ArcSpline;", "HI", "Landroidx/compose/animation/core/ArcSpline;", "arcSpline", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n*L\n1#1,1038:1\n215#2,2:1039\n215#2,2:1041\n65#3:1043\n65#3:1044\n65#3:1045\n70#3:1047\n71#4:1046\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n*L\n246#1:1039,2\n259#1:1041,2\n301#1:1043\n304#1:1044\n335#1:1045\n469#1:1047\n418#1:1046\n*E\n"})
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private ArcSpline arcSpline;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int initialArcMode;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private float[] times;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Easing defaultEasing;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private int[] modes;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private float[] posArray;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private AnimationVector lastInitialValue;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private AnimationVector velocityVector;

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

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private float[] slopeArray;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private AnimationVector valueVector;

    public /* synthetic */ VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i2, int i3, Easing easing, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(intList, intObjectMap, i2, i3, easing, i5);
    }

    private VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i2, int i3, Easing easing, int i5) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i2;
        this.delayMillis = i3;
        this.defaultEasing = easing;
        this.initialArcMode = i5;
        this.modes = VectorizedAnimationSpecKt.f15748n;
        this.times = VectorizedAnimationSpecKt.rl;
        this.posArray = VectorizedAnimationSpecKt.rl;
        this.slopeArray = VectorizedAnimationSpecKt.rl;
        this.arcSpline = VectorizedAnimationSpecKt.f15749t;
    }

    private final int KN(int timeMillis) {
        int iRl = IntList.rl(this.timestamps, timeMillis, 0, 0, 6, null);
        return iRl < -1 ? -(iRl + 2) : iRl;
    }

    private final void gh(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        float[] fArr;
        boolean z2 = this.arcSpline != VectorizedAnimationSpecKt.f15749t;
        if (this.valueVector == null) {
            this.valueVector = AnimationVectorsKt.Uo(initialValue);
            this.velocityVector = AnimationVectorsKt.Uo(initialVelocity);
            int i2 = this.timestamps._size;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = this.timestamps.O(i3) / 1000;
            }
            this.times = fArr2;
            int i5 = this.timestamps._size;
            int[] iArr = new int[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.keyframes.rl(this.timestamps.O(i7));
                int arcMode = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.getArcMode() : this.initialArcMode;
                if (!ArcMode.nr(arcMode, ArcMode.INSTANCE.n())) {
                    z2 = true;
                }
                iArr[i7] = arcMode;
            }
            this.modes = iArr;
        }
        if (z2) {
            if (this.arcSpline != VectorizedAnimationSpecKt.f15749t && Intrinsics.areEqual(this.lastInitialValue, initialValue) && Intrinsics.areEqual(this.lastTargetValue, targetValue)) {
                return;
            }
            this.lastInitialValue = initialValue;
            this.lastTargetValue = targetValue;
            int size = (initialValue.getSize() % 2) + initialValue.getSize();
            this.posArray = new float[size];
            this.slopeArray = new float[size];
            int i8 = this.timestamps._size;
            float[][] fArr3 = new float[i8][];
            for (int i9 = 0; i9 < i8; i9++) {
                int iO = this.timestamps.O(i9);
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo2 = (VectorizedKeyframeSpecElementInfo) this.keyframes.rl(iO);
                if (iO == 0 && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        fArr[i10] = initialValue.n(i10);
                    }
                } else if (iO == getDurationMillis() && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        fArr[i11] = targetValue.n(i11);
                    }
                } else {
                    Intrinsics.checkNotNull(vectorizedKeyframeSpecElementInfo2);
                    AnimationVector vectorValue = vectorizedKeyframeSpecElementInfo2.getVectorValue();
                    float[] fArr4 = new float[size];
                    for (int i12 = 0; i12 < size; i12++) {
                        fArr4[i12] = vectorValue.n(i12);
                    }
                    fArr = fArr4;
                }
                fArr3[i9] = fArr;
            }
            this.arcSpline = new ArcSpline(this.modes, this.times, fArr3);
        }
    }

    private final float mUb(int index, int timeMillis, boolean asFraction) {
        Easing easing;
        float f3;
        IntList intList = this.timestamps;
        if (index >= intList._size - 1) {
            f3 = timeMillis;
        } else {
            int iO = intList.O(index);
            int iO2 = this.timestamps.O(index + 1);
            if (timeMillis == iO) {
                f3 = iO;
            } else {
                int i2 = iO2 - iO;
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.keyframes.rl(iO);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f4 = i2;
                float fN = easing.n((timeMillis - iO) / f4);
                if (asFraction) {
                    return fN;
                }
                f3 = (f4 * fN) + iO;
            }
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

    private final float xMQ(int timeMillis) {
        return mUb(KN(timeMillis), timeMillis, false);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector J2(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        long jO = VectorizedAnimationSpecKt.O(this, playTimeNanos / 1000000);
        if (jO < 0) {
            return initialVelocity;
        }
        gh(initialValue, targetValue, initialVelocity);
        AnimationVector animationVector = this.velocityVector;
        Intrinsics.checkNotNull(animationVector);
        int i2 = 0;
        if (this.arcSpline != VectorizedAnimationSpecKt.f15749t) {
            float fXMQ = xMQ((int) jO);
            float[] fArr = this.slopeArray;
            this.arcSpline.rl(fXMQ, fArr);
            int length = fArr.length;
            while (i2 < length) {
                animationVector.O(i2, fArr[i2]);
                i2++;
            }
        } else {
            AnimationVector animationVectorUo = VectorizedAnimationSpecKt.Uo(this, jO - 1, initialValue, targetValue, initialVelocity);
            AnimationVector animationVectorUo2 = VectorizedAnimationSpecKt.Uo(this, jO, initialValue, targetValue, initialVelocity);
            int size = animationVectorUo.getSize();
            while (i2 < size) {
                animationVector.O(i2, (animationVectorUo.n(i2) - animationVectorUo2.n(i2)) * 1000.0f);
                i2++;
            }
        }
        return animationVector;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector Uo(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        AnimationVector vectorValue;
        AnimationVector vectorValue2;
        int iO = (int) VectorizedAnimationSpecKt.O(this, playTimeNanos / 1000000);
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.keyframes.rl(iO);
        if (vectorizedKeyframeSpecElementInfo != null) {
            return vectorizedKeyframeSpecElementInfo.getVectorValue();
        }
        if (iO >= getDurationMillis()) {
            return targetValue;
        }
        if (iO <= 0) {
            return initialValue;
        }
        gh(initialValue, targetValue, initialVelocity);
        AnimationVector animationVector = this.valueVector;
        Intrinsics.checkNotNull(animationVector);
        int i2 = 0;
        if (this.arcSpline != VectorizedAnimationSpecKt.f15749t) {
            float fXMQ = xMQ(iO);
            float[] fArr = this.posArray;
            this.arcSpline.n(fXMQ, fArr);
            int length = fArr.length;
            while (i2 < length) {
                animationVector.O(i2, fArr[i2]);
                i2++;
            }
            return animationVector;
        }
        int iKN = KN(iO);
        float fMUb = mUb(iKN, iO, true);
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo2 = (VectorizedKeyframeSpecElementInfo) this.keyframes.rl(this.timestamps.O(iKN));
        if (vectorizedKeyframeSpecElementInfo2 != null && (vectorValue2 = vectorizedKeyframeSpecElementInfo2.getVectorValue()) != null) {
            initialValue = vectorValue2;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo3 = (VectorizedKeyframeSpecElementInfo) this.keyframes.rl(this.timestamps.O(iKN + 1));
        if (vectorizedKeyframeSpecElementInfo3 != null && (vectorValue = vectorizedKeyframeSpecElementInfo3.getVectorValue()) != null) {
            targetValue = vectorValue;
        }
        int size = animationVector.getSize();
        while (i2 < size) {
            animationVector.O(i2, (initialValue.n(i2) * (1 - fMUb)) + (targetValue.n(i2) * fMUb));
            i2++;
        }
        return animationVector;
    }
}
