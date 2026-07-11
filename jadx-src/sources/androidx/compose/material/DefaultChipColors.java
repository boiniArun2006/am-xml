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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/DefaultChipColors;", "Landroidx/compose/material/ChipColors;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/runtime/State;", c.f62177j, "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "rl", "t", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "nr", "O", "J2", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
final class DefaultChipColors implements ChipColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long disabledLeadingIconContentColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long disabledBackgroundColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconContentColor;

    public /* synthetic */ DefaultChipColors(long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultChipColors.class != other.getClass()) {
            return false;
        }
        DefaultChipColors defaultChipColors = (DefaultChipColors) other;
        return Color.HI(this.backgroundColor, defaultChipColors.backgroundColor) && Color.HI(this.contentColor, defaultChipColors.contentColor) && Color.HI(this.leadingIconContentColor, defaultChipColors.leadingIconContentColor) && Color.HI(this.disabledBackgroundColor, defaultChipColors.disabledBackgroundColor) && Color.HI(this.disabledContentColor, defaultChipColors.disabledContentColor) && Color.HI(this.disabledLeadingIconContentColor, defaultChipColors.disabledLeadingIconContentColor);
    }

    private DefaultChipColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.backgroundColor = j2;
        this.contentColor = j3;
        this.leadingIconContentColor = j4;
        this.disabledBackgroundColor = j5;
        this.disabledContentColor = j6;
        this.disabledLeadingIconContentColor = j7;
    }

    public int hashCode() {
        return (((((((((Color.XQ(this.backgroundColor) * 31) + Color.XQ(this.contentColor)) * 31) + Color.XQ(this.leadingIconContentColor)) * 31) + Color.XQ(this.disabledBackgroundColor)) * 31) + Color.XQ(this.disabledContentColor)) * 31) + Color.XQ(this.disabledLeadingIconContentColor);
    }

    @Override // androidx.compose.material.ChipColors
    public State n(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(-1593588247);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1593588247, i2, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:578)");
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

    @Override // androidx.compose.material.ChipColors
    public State rl(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(483145880);
        if (ComposerKt.v()) {
            ComposerKt.p5(483145880, i2, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:583)");
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

    @Override // androidx.compose.material.ChipColors
    public State t(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(1955749013);
        if (ComposerKt.v()) {
            ComposerKt.p5(1955749013, i2, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:588)");
        }
        if (z2) {
            j2 = this.leadingIconContentColor;
        } else {
            j2 = this.disabledLeadingIconContentColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }
}
