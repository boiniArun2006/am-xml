package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R&\u0010 \u001a\u00020\u00068GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u0010\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u0012R&\u0010$\u001a\u00020\u00068GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\u0010\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\u0012R&\u0010&\u001a\u00020\u00068GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b%\u0010\u0003\u001a\u0004\b!\u0010\u0012R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00100\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010/R\u0017\u00103\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u0010/R \u00105\u001a\u00020\b8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b4\u0010\u0003\u001a\u0004\b)\u0010/R\u0017\u00106\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010/R\u0017\u00107\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material3/ProgressIndicatorDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "Landroidx/compose/ui/unit/Dp;", "stopSize", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", c.f62177j, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJI)V", "rl", "F", "KN", "()F", "CircularStrokeWidth", "t", "I", "qie", "()I", "LinearStrokeCap", "nr", "CircularDeterminateStrokeCap", "O", "CircularIndeterminateStrokeCap", "J2", "ty", "getLinearTrackStopIndicatorSize-D9Ej5fM$annotations", "LinearTrackStopIndicatorSize", "Uo", "gh", "getLinearIndicatorTrackGapSize-D9Ej5fM$annotations", "LinearIndicatorTrackGapSize", "getCircularIndicatorTrackGapSize-D9Ej5fM$annotations", "CircularIndicatorTrackGapSize", "Landroidx/compose/animation/core/SpringSpec;", "", "xMQ", "Landroidx/compose/animation/core/SpringSpec;", "getProgressAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "ProgressAnimationSpec", "mUb", "(Landroidx/compose/runtime/Composer;I)J", "linearColor", "circularColor", "az", "linearTrackColor", "getCircularTrackColor$annotations", "circularTrackColor", "circularDeterminateTrackColor", "circularIndeterminateTrackColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProgressIndicatorDefaults {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final float LinearTrackStopIndicatorSize;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final float CircularIndicatorTrackGapSize;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final int CircularIndeterminateStrokeCap;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final float LinearIndicatorTrackGapSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ProgressIndicatorDefaults f26994n = new ProgressIndicatorDefaults();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final int CircularDeterminateStrokeCap;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float CircularStrokeWidth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final int LinearStrokeCap;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final SpringSpec ProgressAnimationSpec;

    static {
        ProgressIndicatorTokens progressIndicatorTokens = ProgressIndicatorTokens.f29843n;
        CircularStrokeWidth = progressIndicatorTokens.J2();
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        LinearStrokeCap = companion.rl();
        CircularDeterminateStrokeCap = companion.rl();
        CircularIndeterminateStrokeCap = companion.rl();
        LinearTrackStopIndicatorSize = progressIndicatorTokens.nr();
        LinearIndicatorTrackGapSize = progressIndicatorTokens.rl();
        CircularIndicatorTrackGapSize = progressIndicatorTokens.rl();
        ProgressAnimationSpec = new SpringSpec(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    public final float KN() {
        return CircularStrokeWidth;
    }

    public final int O() {
        return CircularIndeterminateStrokeCap;
    }

    public final float Uo() {
        return CircularIndicatorTrackGapSize;
    }

    public final float gh() {
        return LinearIndicatorTrackGapSize;
    }

    public final int qie() {
        return LinearStrokeCap;
    }

    public final int t() {
        return CircularDeterminateStrokeCap;
    }

    public final float ty() {
        return LinearTrackStopIndicatorSize;
    }

    private ProgressIndicatorDefaults() {
    }

    public final long J2(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1947901123, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:868)");
        }
        long jJ2 = Color.INSTANCE.J2();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jJ2;
    }

    public final long az(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1677541593, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:851)");
        }
        long jXMQ = ColorSchemeKt.xMQ(ProgressIndicatorTokens.f29843n.O(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final long mUb(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-914312983, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:843)");
        }
        long jXMQ = ColorSchemeKt.xMQ(ProgressIndicatorTokens.f29843n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final void n(DrawScope drawScope, float stopSize, long color, int strokeCap) {
        float fMin = Math.min(drawScope.l(stopSize), Size.xMQ(drawScope.t()));
        float fXMQ = (Size.xMQ(drawScope.t()) - fMin) / 2;
        if (StrokeCap.Uo(strokeCap, StrokeCap.INSTANCE.rl())) {
            float f3 = fMin / 2.0f;
            DrawScope.Lu(drawScope, color, f3, OffsetKt.n((Size.gh(drawScope.t()) - f3) - fXMQ, Size.xMQ(drawScope.t()) / 2.0f), 0.0f, null, null, 0, b.f61769v, null);
        } else {
            DrawScope.h(drawScope, color, OffsetKt.n((Size.gh(drawScope.t()) - fMin) - fXMQ, (Size.xMQ(drawScope.t()) - fMin) / 2.0f), SizeKt.n(fMin, fMin), 0.0f, null, null, 0, b.f61769v, null);
        }
    }

    public final long nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-2143778381, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularDeterminateTrackColor> (ProgressIndicator.kt:864)");
        }
        long jXMQ = ColorSchemeKt.xMQ(ProgressIndicatorTokens.f29843n.O(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final long rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1803349725, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:847)");
        }
        long jXMQ = ColorSchemeKt.xMQ(ProgressIndicatorTokens.f29843n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final long xMQ(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-404222247, i2, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:860)");
        }
        long jJ2 = Color.INSTANCE.J2();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jJ2;
    }
}
