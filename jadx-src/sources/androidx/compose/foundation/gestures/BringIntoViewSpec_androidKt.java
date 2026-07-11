package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\"&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0002\u0010\u0004\" \u0010\f\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\u0006\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", c.f62177j, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalBringIntoViewSpec$annotations", "()V", "LocalBringIntoViewSpec", "rl", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getPivotBringIntoViewSpec$annotations", "PivotBringIntoViewSpec", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BringIntoViewSpec_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f16583n = CompositionLocalKt.J2(new Function1<CompositionLocalAccessorScope, BringIntoViewSpec>() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final BringIntoViewSpec invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
            if (!((Context) compositionLocalAccessorScope.rl(AndroidCompositionLocals_androidKt.Uo())).getPackageManager().hasSystemFeature("android.software.leanback")) {
                return BringIntoViewSpec.INSTANCE.rl();
            }
            return BringIntoViewSpec_androidKt.rl();
        }
    });
    private static final BringIntoViewSpec rl = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final float parentFraction = 0.3f;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final float childFraction;

        @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
        public float n(float offset, float size, float containerSize) {
            float fAbs = Math.abs((size + offset) - offset);
            boolean z2 = fAbs <= containerSize;
            float f3 = (this.parentFraction * containerSize) - (this.childFraction * fAbs);
            float f4 = containerSize - f3;
            if (z2 && f4 < fAbs) {
                f3 = containerSize - fAbs;
            }
            return offset - f3;
        }
    };

    public static final ProvidableCompositionLocal n() {
        return f16583n;
    }

    public static final BringIntoViewSpec rl() {
        return rl;
    }
}
