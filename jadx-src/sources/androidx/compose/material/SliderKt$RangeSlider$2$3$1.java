package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class SliderKt$RangeSlider$2$3$1 extends FunctionReferenceImpl implements Function1<Float, Float> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f22777O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ClosedFloatingPointRange f22778n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f22779t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSlider$2$3$1(ClosedFloatingPointRange closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.f22778n = closedFloatingPointRange;
        this.f22779t = floatRef;
        this.f22777O = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f3) {
        return n(f3.floatValue());
    }

    public final Float n(float f3) {
        return Float.valueOf(SliderKt$RangeSlider$2.nr(this.f22778n, this.f22779t, this.f22777O, f3));
    }
}
