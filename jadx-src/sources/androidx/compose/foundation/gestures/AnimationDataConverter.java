package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.ui.geometry.Offset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/AnimationDataConverter;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/foundation/gestures/AnimationData;", "Landroidx/compose/animation/core/AnimationVector4D;", "<init>", "()V", "Lkotlin/Function1;", c.f62177j, "()Lkotlin/jvm/functions/Function1;", "convertToVector", "rl", "convertFromVector", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnimationDataConverter implements TwoWayConverter<AnimationData, AnimationVector4D> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AnimationDataConverter f16574n = new AnimationDataConverter();

    @Override // androidx.compose.animation.core.TwoWayConverter
    /* JADX INFO: renamed from: n */
    public Function1 getConvertToVector() {
        return new Function1<AnimationData, AnimationVector4D>() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$convertToVector$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final AnimationVector4D invoke(AnimationData animationData) {
                return new AnimationVector4D(animationData.getZoom(), Float.intBitsToFloat((int) (animationData.getOffset() >> 32)), Float.intBitsToFloat((int) (animationData.getOffset() & 4294967295L)), animationData.getDegrees());
            }
        };
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    /* JADX INFO: renamed from: rl */
    public Function1 getConvertFromVector() {
        return new Function1<AnimationVector4D, AnimationData>() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$convertFromVector$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final AnimationData invoke(AnimationVector4D animationVector4D) {
                float v1 = animationVector4D.getV1();
                float v2 = animationVector4D.getV2();
                return new AnimationData(v1, Offset.O((((long) Float.floatToRawIntBits(animationVector4D.getV3())) & 4294967295L) | (Float.floatToRawIntBits(v2) << 32)), animationVector4D.getV4(), null);
            }
        };
    }

    private AnimationDataConverter() {
    }
}
