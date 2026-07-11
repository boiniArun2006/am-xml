package androidx.compose.animation.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\r\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\u000b\u0010\u0004¨\u0006\r"}, d2 = {"Landroidx/compose/animation/core/Easing;", c.f62177j, "Landroidx/compose/animation/core/Easing;", "nr", "()Landroidx/compose/animation/core/Easing;", "FastOutSlowInEasing", "rl", "J2", "LinearOutSlowInEasing", "t", "FastOutLinearInEasing", "O", "LinearEasing", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EasingKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Easing f15490n = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final Easing rl = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Easing f15491t = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final Easing nr = new Easing() { // from class: androidx.compose.animation.core.CN3
        @Override // androidx.compose.animation.core.Easing
        public final float n(float f3) {
            return EasingKt.rl(f3);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rl(float f3) {
        return f3;
    }

    public static final Easing J2() {
        return rl;
    }

    public static final Easing O() {
        return nr;
    }

    public static final Easing nr() {
        return f15490n;
    }

    public static final Easing t() {
        return f15491t;
    }
}
