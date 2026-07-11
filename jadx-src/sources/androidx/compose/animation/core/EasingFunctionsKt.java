package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\bg\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0014\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u001a\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u0017\u0010 \u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u0017\u0010#\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u0017\u0010&\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004\"\u0017\u0010(\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0002\u001a\u0004\b'\u0010\u0004\"\u0017\u0010*\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b)\u0010\u0004\"\u0017\u0010-\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0004\"\u0017\u00100\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b.\u0010\u0002\u001a\u0004\b/\u0010\u0004\"\u0017\u00103\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010\u0004\"\u0017\u00106\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b4\u0010\u0002\u001a\u0004\b5\u0010\u0004\"\u0017\u00109\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b7\u0010\u0002\u001a\u0004\b8\u0010\u0004\"\u0017\u0010<\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b:\u0010\u0002\u001a\u0004\b;\u0010\u0004\"\u0017\u0010?\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b=\u0010\u0002\u001a\u0004\b>\u0010\u0004\"\u0017\u0010B\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b@\u0010\u0002\u001a\u0004\bA\u0010\u0004\"\u0017\u0010E\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bC\u0010\u0002\u001a\u0004\bD\u0010\u0004\"\u0017\u0010H\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bF\u0010\u0002\u001a\u0004\bG\u0010\u0004\"\u0017\u0010K\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bI\u0010\u0002\u001a\u0004\bJ\u0010\u0004\"\u0017\u0010N\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bL\u0010\u0002\u001a\u0004\bM\u0010\u0004\"\u0017\u0010Q\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bO\u0010\u0002\u001a\u0004\bP\u0010\u0004\"\u0017\u0010T\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bR\u0010\u0002\u001a\u0004\bS\u0010\u0004\"\u0017\u0010W\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bU\u0010\u0002\u001a\u0004\bV\u0010\u0004\"\u0017\u0010Z\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bX\u0010\u0002\u001a\u0004\bY\u0010\u0004\"\u0017\u0010]\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b[\u0010\u0002\u001a\u0004\b\\\u0010\u0004\"\u0017\u0010`\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b^\u0010\u0002\u001a\u0004\b_\u0010\u0004\"\u0017\u0010c\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\ba\u0010\u0002\u001a\u0004\bb\u0010\u0004\"\u0017\u0010f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bd\u0010\u0002\u001a\u0004\be\u0010\u0004¨\u0006g"}, d2 = {"Landroidx/compose/animation/core/Easing;", c.f62177j, "Landroidx/compose/animation/core/Easing;", "getEase", "()Landroidx/compose/animation/core/Easing;", "Ease", "rl", "ty", "EaseOut", "t", "az", "EaseIn", "nr", "getEaseInOut", "EaseInOut", "O", "getEaseInSine", "EaseInSine", "J2", "getEaseOutSine", "EaseOutSine", "Uo", "getEaseInOutSine", "EaseInOutSine", "KN", "getEaseInCubic", "EaseInCubic", "xMQ", "getEaseOutCubic", "EaseOutCubic", "mUb", "getEaseInOutCubic", "EaseInOutCubic", "gh", "getEaseInQuint", "EaseInQuint", "qie", "getEaseOutQuint", "EaseOutQuint", "getEaseInOutQuint", "EaseInOutQuint", "getEaseInCirc", "EaseInCirc", "HI", "getEaseOutCirc", "EaseOutCirc", "ck", "getEaseInOutCirc", "EaseInOutCirc", "Ik", "getEaseInQuad", "EaseInQuad", "r", "getEaseOutQuad", "EaseOutQuad", "o", "getEaseInOutQuad", "EaseInOutQuad", "Z", "getEaseInQuart", "EaseInQuart", "XQ", "getEaseOutQuart", "EaseOutQuart", "S", "getEaseInOutQuart", "EaseInOutQuart", "WPU", "getEaseInExpo", "EaseInExpo", "aYN", "getEaseOutExpo", "EaseOutExpo", "ViF", "getEaseInOutExpo", "EaseInOutExpo", "nY", "getEaseInBack", "EaseInBack", "g", "getEaseOutBack", "EaseOutBack", "te", "getEaseInOutBack", "EaseInOutBack", "iF", "getEaseInElastic", "EaseInElastic", "fD", "getEaseOutElastic", "EaseOutElastic", "E2", "getEaseInOutElastic", "EaseInOutElastic", "e", "getEaseOutBounce", "EaseOutBounce", "X", "getEaseInBounce", "EaseInBounce", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getEaseInOutBounce", "EaseInOutBounce", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EasingFunctionsKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Easing f15486n = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);
    private static final Easing rl = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Easing f15489t = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);
    private static final Easing nr = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Easing f15479O = new CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);
    private static final Easing J2 = new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);
    private static final Easing Uo = new CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);
    private static final Easing KN = new CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);
    private static final Easing xMQ = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);
    private static final Easing mUb = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);
    private static final Easing gh = new CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);
    private static final Easing qie = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);
    private static final Easing az = new CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);
    private static final Easing ty = new CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);
    private static final Easing HI = new CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);
    private static final Easing ck = new CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);
    private static final Easing Ik = new CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Easing f15488r = new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Easing f15487o = new CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Easing f15483Z = new CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);
    private static final Easing XQ = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Easing f15480S = new CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);
    private static final Easing WPU = new CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);
    private static final Easing aYN = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);
    private static final Easing ViF = new CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);
    private static final Easing nY = new CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Easing f15485g = new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);
    private static final Easing te = new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);
    private static final Easing iF = new Easing() { // from class: androidx.compose.animation.core.j
        @Override // androidx.compose.animation.core.Easing
        public final float n(float f3) {
            return EasingFunctionsKt.KN(f3);
        }
    };
    private static final Easing fD = new Easing() { // from class: androidx.compose.animation.core.n
        @Override // androidx.compose.animation.core.Easing
        public final float n(float f3) {
            return EasingFunctionsKt.qie(f3);
        }
    };
    private static final Easing E2 = new Easing() { // from class: androidx.compose.animation.core.w6
        @Override // androidx.compose.animation.core.Easing
        public final float n(float f3) {
            return EasingFunctionsKt.mUb(f3);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Easing f15484e = new Easing() { // from class: androidx.compose.animation.core.Ml
        @Override // androidx.compose.animation.core.Easing
        public final float n(float f3) {
            return EasingFunctionsKt.gh(f3);
        }
    };

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final Easing f15482X = new Easing() { // from class: androidx.compose.animation.core.I28
        @Override // androidx.compose.animation.core.Easing
        public final float n(float f3) {
            return EasingFunctionsKt.Uo(f3);
        }
    };

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final Easing f15481T = new Easing() { // from class: androidx.compose.animation.core.Wre
        @Override // androidx.compose.animation.core.Easing
        public final float n(float f3) {
            return EasingFunctionsKt.xMQ(f3);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float KN(float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        if (f3 == 1.0f) {
            return 1.0f;
        }
        return (float) (((double) (-((float) Math.pow(2.0f, r6 - 10.0f)))) * Math.sin(((double) ((f3 * 10.0f) - 10.75f)) * 2.0943951023931953d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Uo(float f3) {
        return 1 - f15484e.n(1.0f - f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float gh(float f3) {
        if (f3 < 0.36363637f) {
            return 7.5625f * f3 * f3;
        }
        if (f3 < 0.72727275f) {
            float f4 = f3 - 0.54545456f;
            return (7.5625f * f4 * f4) + 0.75f;
        }
        if (f3 < 0.90909094f) {
            float f5 = f3 - 0.8181818f;
            return (7.5625f * f5 * f5) + 0.9375f;
        }
        float f6 = f3 - 0.95454544f;
        return (7.5625f * f6 * f6) + 0.984375f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float mUb(float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        if (f3 == 1.0f) {
            return 1.0f;
        }
        if (0.0f > f3 || f3 > 0.5f) {
            double d2 = 2.0f;
            return ((float) ((((double) ((float) Math.pow(d2, ((-20.0f) * f3) + 10.0f))) * Math.sin(((double) ((f3 * 20.0f) - 11.125f)) * 1.3962634015954636d)) / d2)) + 1.0f;
        }
        double d4 = 2.0f;
        return (float) ((-(((double) ((float) Math.pow(d4, r12 - 10.0f))) * Math.sin(((double) ((f3 * 20.0f) - 11.125f)) * 1.3962634015954636d))) / d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float qie(float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        if (f3 == 1.0f) {
            return 1.0f;
        }
        return (float) ((((double) ((float) Math.pow(2.0f, (-10.0f) * f3))) * Math.sin(((double) ((f3 * 10.0f) - 0.75f)) * 2.0943951023931953d)) + ((double) 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float xMQ(float f3) {
        return (((double) f3) < 0.5d ? 1 - f15484e.n(1.0f - (f3 * 2.0f)) : 1 + f15484e.n((f3 * 2.0f) - 1.0f)) / 2.0f;
    }

    public static final Easing az() {
        return f15489t;
    }

    public static final Easing ty() {
        return rl;
    }
}
