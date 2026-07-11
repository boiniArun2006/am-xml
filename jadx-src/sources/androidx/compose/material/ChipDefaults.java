package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJl\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001a\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001c\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001d\u0010\"\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "Landroidx/compose/material/ChipColors;", c.f62177j, "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "Landroidx/compose/material/SelectableChipColors;", "rl", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "Landroidx/compose/ui/unit/Dp;", "F", "t", "()F", "MinHeight", "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "nr", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "O", "getSelectedIconSize-D9Ej5fM", "SelectedIconSize", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,730:1\n149#2:731\n149#2:732\n149#2:733\n149#2:734\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n*L\n361#1:731\n557#1:732\n560#1:733\n563#1:734\n*E\n"})
public final class ChipDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ChipDefaults f21652n = new ChipDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float MinHeight = Dp.KN(32);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float OutlinedBorderSize = Dp.KN(1);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float LeadingIconSize = Dp.KN(20);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float SelectedIconSize = Dp.KN(18);

    public final ChipColors n(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jUo;
        long jUo2;
        long j9;
        long jAz;
        if ((i3 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.f22169n;
            jUo = ColorKt.Uo(Color.az(materialTheme.n(composer, 6).xMQ(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.n(composer, 6).ty());
        } else {
            jUo = j2;
        }
        long jAz2 = (i3 & 2) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jAz3 = (i3 & 4) != 0 ? Color.az(jAz2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if ((i3 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.f22169n;
            jUo2 = ColorKt.Uo(Color.az(materialTheme2.n(composer, 6).xMQ(), ContentAlpha.f21745n.rl(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.n(composer, 6).ty());
        } else {
            jUo2 = j5;
        }
        if ((i3 & 16) != 0) {
            long j10 = jAz2;
            jAz = Color.az(j10, ContentAlpha.f21745n.rl(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j9 = j10;
        } else {
            j9 = jAz2;
            jAz = j6;
        }
        long jAz4 = (i3 & 32) != 0 ? Color.az(jAz3, ContentAlpha.f21745n.rl(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (ComposerKt.v()) {
            ComposerKt.p5(1838505436, i2, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:391)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(jUo, j9, jAz3, jUo2, jAz, jAz4, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultChipColors;
    }

    public final SelectableChipColors rl(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, Composer composer, int i2, int i3) {
        long jUo;
        long jUo2;
        long j12;
        long jAz;
        long j13;
        long jAz2;
        long j14;
        long jUo3;
        long j15;
        long jUo4;
        long j16;
        if ((i3 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.f22169n;
            jUo = ColorKt.Uo(Color.az(materialTheme.n(composer, 6).xMQ(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.n(composer, 6).ty());
        } else {
            jUo = j2;
        }
        long jAz3 = (i3 & 2) != 0 ? Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jAz4 = (i3 & 4) != 0 ? Color.az(jAz3, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if ((i3 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.f22169n;
            jUo2 = ColorKt.Uo(Color.az(materialTheme2.n(composer, 6).xMQ(), ContentAlpha.f21745n.rl(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.n(composer, 6).ty());
        } else {
            jUo2 = j5;
        }
        if ((i3 & 16) != 0) {
            long j17 = jAz3;
            jAz = Color.az(j17, ContentAlpha.f21745n.rl(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j12 = j17;
        } else {
            j12 = jAz3;
            jAz = j6;
        }
        if ((i3 & 32) != 0) {
            long j18 = jAz4;
            jAz2 = Color.az(j18, ContentAlpha.f21745n.rl(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j13 = j18;
        } else {
            j13 = jAz4;
            jAz2 = j7;
        }
        if ((i3 & 64) != 0) {
            j14 = jAz2;
            jUo3 = ColorKt.Uo(Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), jUo);
        } else {
            j14 = jAz2;
            jUo3 = j9;
        }
        if ((i3 & 128) != 0) {
            j15 = jUo;
            jUo4 = ColorKt.Uo(Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j12);
        } else {
            j15 = jUo;
            jUo4 = j10;
        }
        long jUo5 = (i3 & 256) != 0 ? ColorKt.Uo(Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j13) : j11;
        if (ComposerKt.v()) {
            j16 = jUo5;
            ComposerKt.p5(830140629, i2, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:476)");
        } else {
            j16 = jUo5;
        }
        long j19 = jUo2;
        long j20 = j12;
        long j21 = j13;
        long j22 = j15;
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j22, j20, j21, j19, jAz, j14, jUo3, jUo4, j16, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultSelectableChipColors;
    }

    public final float t() {
        return MinHeight;
    }

    private ChipDefaults() {
    }
}
