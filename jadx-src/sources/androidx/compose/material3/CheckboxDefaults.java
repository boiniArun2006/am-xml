package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u00020\u0004*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/CheckboxDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/CheckboxColors;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CheckboxColors;", "Landroidx/compose/material3/ColorScheme;", "rl", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CheckboxColors;", "defaultCheckboxColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,607:1\n1#2:608\n*E\n"})
public final class CheckboxDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CheckboxDefaults f24733n = new CheckboxDefaults();

    public final CheckboxColors rl(ColorScheme colorScheme) {
        CheckboxColors defaultCheckboxColorsCached = colorScheme.getDefaultCheckboxColorsCached();
        if (defaultCheckboxColorsCached != null) {
            return defaultCheckboxColorsCached;
        }
        CheckboxTokens checkboxTokens = CheckboxTokens.f29414n;
        long jUo = ColorSchemeKt.Uo(colorScheme, checkboxTokens.t());
        Color.Companion companion = Color.INSTANCE;
        CheckboxColors checkboxColors = new CheckboxColors(jUo, companion.J2(), ColorSchemeKt.Uo(colorScheme, checkboxTokens.n()), companion.J2(), Color.az(ColorSchemeKt.Uo(colorScheme, checkboxTokens.rl()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.J2(), Color.az(ColorSchemeKt.Uo(colorScheme, checkboxTokens.rl()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, checkboxTokens.n()), ColorSchemeKt.Uo(colorScheme, checkboxTokens.J2()), Color.az(ColorSchemeKt.Uo(colorScheme, checkboxTokens.rl()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, checkboxTokens.O()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, checkboxTokens.rl()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.Org(checkboxColors);
        return checkboxColors;
    }

    private CheckboxDefaults() {
    }

    public final CheckboxColors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-9530498, i2, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:193)");
        }
        CheckboxColors checkboxColorsRl = rl(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return checkboxColorsRl;
    }
}
