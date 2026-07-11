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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/material/DefaultSelectableChipColors;", "Landroidx/compose/material/SelectableChipColors;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "leadingIconColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "<init>", "(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "t", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "nr", "rl", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", c.f62177j, "J", "O", "J2", "Uo", "KN", "xMQ", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
final class DefaultSelectableChipColors implements SelectableChipColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long selectedContentColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long selectedBackgroundColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long disabledBackgroundColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long selectedLeadingIconColor;

    public /* synthetic */ DefaultSelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultSelectableChipColors.class != other.getClass()) {
            return false;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = (DefaultSelectableChipColors) other;
        return Color.HI(this.backgroundColor, defaultSelectableChipColors.backgroundColor) && Color.HI(this.contentColor, defaultSelectableChipColors.contentColor) && Color.HI(this.leadingIconColor, defaultSelectableChipColors.leadingIconColor) && Color.HI(this.disabledBackgroundColor, defaultSelectableChipColors.disabledBackgroundColor) && Color.HI(this.disabledContentColor, defaultSelectableChipColors.disabledContentColor) && Color.HI(this.disabledLeadingIconColor, defaultSelectableChipColors.disabledLeadingIconColor) && Color.HI(this.selectedBackgroundColor, defaultSelectableChipColors.selectedBackgroundColor) && Color.HI(this.selectedContentColor, defaultSelectableChipColors.selectedContentColor) && Color.HI(this.selectedLeadingIconColor, defaultSelectableChipColors.selectedLeadingIconColor);
    }

    private DefaultSelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11) {
        this.backgroundColor = j2;
        this.contentColor = j3;
        this.leadingIconColor = j4;
        this.disabledBackgroundColor = j5;
        this.disabledContentColor = j6;
        this.disabledLeadingIconColor = j7;
        this.selectedBackgroundColor = j9;
        this.selectedContentColor = j10;
        this.selectedLeadingIconColor = j11;
    }

    public int hashCode() {
        return (((((((((((((((Color.XQ(this.backgroundColor) * 31) + Color.XQ(this.contentColor)) * 31) + Color.XQ(this.leadingIconColor)) * 31) + Color.XQ(this.disabledBackgroundColor)) * 31) + Color.XQ(this.disabledContentColor)) * 31) + Color.XQ(this.disabledLeadingIconColor)) * 31) + Color.XQ(this.selectedBackgroundColor)) * 31) + Color.XQ(this.selectedContentColor)) * 31) + Color.XQ(this.selectedLeadingIconColor);
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State nr(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        composer.eF(2025240134);
        if (ComposerKt.v()) {
            ComposerKt.p5(2025240134, i2, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:649)");
        }
        if (!z2) {
            j2 = this.disabledContentColor;
        } else if (!z3) {
            j2 = this.contentColor;
        } else {
            j2 = this.selectedContentColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State rl(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        composer.eF(189838188);
        if (ComposerKt.v()) {
            ComposerKt.p5(189838188, i2, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:660)");
        }
        if (!z2) {
            j2 = this.disabledLeadingIconColor;
        } else if (!z3) {
            j2 = this.leadingIconColor;
        } else {
            j2 = this.selectedLeadingIconColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State t(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        composer.eF(-403836585);
        if (ComposerKt.v()) {
            ComposerKt.p5(-403836585, i2, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:638)");
        }
        if (!z2) {
            j2 = this.disabledBackgroundColor;
        } else if (!z3) {
            j2 = this.backgroundColor;
        } else {
            j2 = this.selectedBackgroundColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }
}
