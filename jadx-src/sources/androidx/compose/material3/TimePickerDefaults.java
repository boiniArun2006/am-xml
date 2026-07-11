package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u00020\u0004*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/TimePickerDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/TimePickerColors;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TimePickerColors;", "Landroidx/compose/material3/TimePickerLayoutType;", "t", "(Landroidx/compose/runtime/Composer;I)I", "Landroidx/compose/material3/ColorScheme;", "rl", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TimePickerColors;", "defaultTimePickerColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2008:1\n1#2:2009\n*E\n"})
public final class TimePickerDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TimePickerDefaults f28557n = new TimePickerDefaults();

    public final TimePickerColors rl(ColorScheme colorScheme) {
        TimePickerColors defaultTimePickerColorsCached = colorScheme.getDefaultTimePickerColorsCached();
        if (defaultTimePickerColorsCached != null) {
            return defaultTimePickerColorsCached;
        }
        TimePickerTokens timePickerTokens = TimePickerTokens.f29968n;
        TimePickerColors timePickerColors = new TimePickerColors(ColorSchemeKt.Uo(colorScheme, timePickerTokens.n()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.J2()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.mUb()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.ty()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.nr()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.xMQ()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.ck()), Color.INSTANCE.J2(), ColorSchemeKt.Uo(colorScheme, timePickerTokens.Ik()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.r()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.ViF()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.g()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.nY()), ColorSchemeKt.Uo(colorScheme, timePickerTokens.te()), null);
        colorScheme.EF(timePickerColors);
        return timePickerColors;
    }

    private TimePickerDefaults() {
    }

    public final TimePickerColors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-2085808058, i2, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:270)");
        }
        TimePickerColors timePickerColorsRl = rl(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return timePickerColorsRl;
    }

    public final int t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(517161502, i2, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:367)");
        }
        int iN = TimePicker_androidKt.n(composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return iN;
    }
}
