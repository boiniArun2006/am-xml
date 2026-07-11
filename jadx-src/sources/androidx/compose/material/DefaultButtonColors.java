package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/DefaultButtonColors;", "Landroidx/compose/material/ButtonColors;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "disabledBackgroundColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/runtime/State;", c.f62177j, "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "rl", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "t", "nr", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultButtonColors implements ButtonColors {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long disabledContentColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long disabledBackgroundColor;

    public /* synthetic */ DefaultButtonColors(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultButtonColors.class != other.getClass()) {
            return false;
        }
        DefaultButtonColors defaultButtonColors = (DefaultButtonColors) other;
        return Color.HI(this.backgroundColor, defaultButtonColors.backgroundColor) && Color.HI(this.contentColor, defaultButtonColors.contentColor) && Color.HI(this.disabledBackgroundColor, defaultButtonColors.disabledBackgroundColor) && Color.HI(this.disabledContentColor, defaultButtonColors.disabledContentColor);
    }

    private DefaultButtonColors(long j2, long j3, long j4, long j5) {
        this.backgroundColor = j2;
        this.contentColor = j3;
        this.disabledBackgroundColor = j4;
        this.disabledContentColor = j5;
    }

    public int hashCode() {
        return (((((Color.XQ(this.backgroundColor) * 31) + Color.XQ(this.contentColor)) * 31) + Color.XQ(this.disabledBackgroundColor)) * 31) + Color.XQ(this.disabledContentColor);
    }

    @Override // androidx.compose.material.ButtonColors
    public State n(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(-655254499);
        if (ComposerKt.v()) {
            ComposerKt.p5(-655254499, i2, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:584)");
        }
        if (z2) {
            j2 = this.backgroundColor;
        } else {
            j2 = this.disabledBackgroundColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.ButtonColors
    public State rl(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(-2133647540);
        if (ComposerKt.v()) {
            ComposerKt.p5(-2133647540, i2, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:589)");
        }
        if (z2) {
            j2 = this.contentColor;
        } else {
            j2 = this.disabledContentColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }
}
