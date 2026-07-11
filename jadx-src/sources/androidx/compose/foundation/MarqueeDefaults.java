package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/MarqueeDefaults;", "", "<init>", "()V", "", "rl", "I", "getIterations", "()I", "getIterations$annotations", "Iterations", "t", "getRepeatDelayMillis", "getRepeatDelayMillis$annotations", "RepeatDelayMillis", "Landroidx/compose/foundation/MarqueeSpacing;", "nr", "Landroidx/compose/foundation/MarqueeSpacing;", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "Spacing", "Landroidx/compose/ui/unit/Dp;", "O", "F", "getVelocity-D9Ej5fM", "()F", "Velocity", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,535:1\n113#2:536\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeDefaults\n*L\n102#1:536\n*E\n"})
public final class MarqueeDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MarqueeDefaults f16196n = new MarqueeDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final int Iterations = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final int RepeatDelayMillis = 1200;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final MarqueeSpacing Spacing = MarqueeSpacing.INSTANCE.rl(0.33333334f);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float Velocity = Dp.KN(30);

    private MarqueeDefaults() {
    }
}
