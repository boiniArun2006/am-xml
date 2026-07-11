package Fo;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final FontFamily f3138n;
    private static final FontFamily rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final FontFamily f3139t;

    static {
        Font fontRl = FontKt.rl(2131296264, null, 0, 0, 14, null);
        FontWeight.Companion companion = FontWeight.INSTANCE;
        f3138n = FontFamilyKt.rl(fontRl, FontKt.rl(2131296262, companion.nr(), 0, 0, 12, null), FontKt.rl(2131296261, companion.n(), 0, 0, 12, null));
        rl = FontFamilyKt.rl(FontKt.rl(2131296269, companion.t(), 0, 0, 12, null), FontKt.rl(2131296271, null, 0, 0, 14, null), FontKt.rl(2131296270, companion.nr(), 0, 0, 12, null), FontKt.rl(2131296272, companion.J2(), 0, 0, 12, null), FontKt.rl(2131296268, companion.n(), 0, 0, 12, null));
        f3139t = FontFamilyKt.rl(FontKt.rl(2131296257, companion.t(), 0, 0, 12, null), FontKt.rl(2131296259, null, 0, 0, 14, null), FontKt.rl(2131296258, companion.nr(), 0, 0, 12, null), FontKt.rl(2131296260, companion.J2(), 0, 0, 12, null), FontKt.rl(2131296256, companion.n(), 0, 0, 12, null));
    }

    public static final FontFamily n() {
        return f3138n;
    }

    public static final FontFamily rl() {
        return rl;
    }
}
