package Fo;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final j f3137n;
    private static final FontFamily rl;

    static {
        TextStyle textStyleRl = rl(TextUnitKt.KN(24), w6.rl(), TextUnitKt.KN(30), 0L, 0, 24, null);
        TextStyle textStyleO = O(TextUnitKt.KN(10), w6.rl(), TextUnitKt.KN(10), 0L, 0, 24, null);
        TextStyle textStyleO2 = O(TextUnitKt.KN(12), w6.rl(), TextUnitKt.KN(16), 0L, 0, 24, null);
        TextStyle textStyleO3 = O(TextUnitKt.KN(14), w6.rl(), TextUnitKt.KN(16), 0L, 0, 24, null);
        TextStyle textStyleO4 = O(TextUnitKt.KN(16), w6.rl(), TextUnitKt.KN(20), 0L, 0, 24, null);
        TextStyle textStyleO5 = O(TextUnitKt.KN(18), w6.rl(), TextUnitKt.KN(24), 0L, 0, 24, null);
        TextStyle textStyleUo = Uo(TextUnitKt.KN(14), w6.rl(), TextUnitKt.KN(20), 0L, 0, 24, null);
        TextStyle textStyleUo2 = Uo(TextUnitKt.KN(16), w6.rl(), TextUnitKt.KN(20), 0L, 0, 24, null);
        TextStyle textStyleUo3 = Uo(TextUnitKt.KN(18), w6.rl(), TextUnitKt.KN(24), 0L, 0, 24, null);
        TextStyle textStyleRl2 = rl(TextUnitKt.KN(10), w6.rl(), TextUnitKt.KN(12), 0L, 0, 24, null);
        TextStyle textStyleRl3 = rl(TextUnitKt.KN(15), w6.rl(), TextUnitKt.KN(12), 0L, 0, 24, null);
        TextStyle textStyleXMQ = xMQ(TextUnitKt.KN(15), null, TextUnitKt.KN(20), 0L, 0, 26, null);
        TextStyle textStyleXMQ2 = xMQ(TextUnitKt.KN(16), null, TextUnitKt.KN(20), 0L, 0, 26, null);
        TextStyle textStyleXMQ3 = xMQ(TextUnitKt.KN(18), w6.rl(), TextUnitKt.KN(24), 0L, 0, 24, null);
        TextStyle textStyleRl4 = rl(TextUnitKt.KN(8), w6.rl(), TextUnitKt.J2(10.67d), 0L, 0, 24, null);
        TextStyle textStyleRl5 = rl(TextUnitKt.KN(10), w6.rl(), TextUnitKt.KN(10), 0L, 0, 24, null);
        TextStyle textStyleRl6 = rl(TextUnitKt.KN(12), w6.rl(), TextUnitKt.KN(16), 0L, 0, 24, null);
        TextStyle textStyleRl7 = rl(TextUnitKt.KN(14), w6.rl(), TextUnitKt.KN(16), 0L, 0, 24, null);
        TextStyle textStyleRl8 = rl(TextUnitKt.KN(16), w6.rl(), TextUnitKt.KN(20), 0L, 0, 24, null);
        TextStyle textStyleRl9 = rl(TextUnitKt.KN(18), w6.rl(), TextUnitKt.KN(24), 0L, 0, 24, null);
        TextStyle textStyleRl10 = rl(TextUnitKt.KN(20), w6.rl(), TextUnitKt.KN(26), 0L, 0, 24, null);
        TextStyle textStyleRl11 = rl(TextUnitKt.KN(28), w6.rl(), TextUnitKt.KN(32), 0L, 0, 24, null);
        TextStyle textStyleUo4 = Uo(TextUnitKt.KN(12), w6.rl(), TextUnitKt.KN(16), 0L, 0, 24, null);
        TextStyle textStyleRl12 = rl(TextUnitKt.KN(20), null, TextUnitKt.KN(23), 0L, 0, 26, null);
        TextStyle textStyleRl13 = rl(TextUnitKt.KN(28), null, TextUnitKt.KN(36), 0L, 0, 26, null);
        TextStyle textStyleRl14 = rl(TextUnitKt.KN(30), null, TextUnitKt.KN(36), 0L, 0, 26, null);
        TextStyle textStyleRl15 = rl(TextUnitKt.KN(36), null, TextUnitKt.KN(40), TextUnitKt.KN(1), 0, 18, null);
        TextStyle textStyleRl16 = rl(TextUnitKt.KN(56), null, TextUnitKt.KN(64), 0L, 0, 26, null);
        TextStyle textStyleO6 = O(TextUnitKt.KN(10), null, TextUnitKt.KN(12), 0L, 0, 26, null);
        TextStyle textStyleO7 = O(TextUnitKt.KN(13), null, TextUnitKt.KN(18), 0L, 0, 26, null);
        TextStyle textStyleO8 = O(TextUnitKt.KN(14), null, TextUnitKt.KN(16), 0L, 0, 26, null);
        TextStyle textStyleO9 = O(TextUnitKt.KN(16), null, TextUnitKt.KN(20), 0L, 0, 26, null);
        TextStyle textStyleO10 = O(TextUnitKt.KN(17), null, TextUnitKt.KN(22), 0L, 0, 26, null);
        TextStyle textStyleO11 = O(TextUnitKt.KN(18), null, TextUnitKt.KN(24), TextUnitKt.J2(0.5d), 0, 18, null);
        TextStyle textStyleO12 = O(TextUnitKt.KN(24), null, TextUnitKt.KN(32), TextUnitKt.J2(0.5d), 0, 18, null);
        TextStyle textStyleUo5 = Uo(TextUnitKt.KN(14), null, TextUnitKt.KN(16), 0L, 0, 26, null);
        TextStyle textStyleUo6 = Uo(TextUnitKt.KN(15), null, TextUnitKt.KN(18), 0L, 0, 26, null);
        f3137n = new j(textStyleRl, textStyleO2, textStyleUo2, textStyleRl9, textStyleRl11, textStyleUo3, textStyleRl10, textStyleRl7, textStyleUo, textStyleRl8, textStyleUo4, textStyleO, textStyleO3, textStyleO4, textStyleO5, textStyleXMQ, textStyleXMQ2, textStyleXMQ3, textStyleRl4, textStyleRl5, textStyleRl6, textStyleRl2, textStyleRl3, textStyleRl13, textStyleRl14, textStyleRl15, textStyleRl16, textStyleO6, textStyleO7, textStyleO8, textStyleO9, textStyleO10, textStyleO11, textStyleO12, textStyleUo5, Uo(TextUnitKt.KN(11), null, TextUnitKt.KN(14), 0L, 0, 26, null), Uo(TextUnitKt.KN(16), null, TextUnitKt.KN(16), 0L, 0, 26, null), xMQ(TextUnitKt.KN(14), null, TextUnitKt.KN(16), TextUnitKt.J2(0.5d), 0, 18, null), xMQ(TextUnitKt.KN(16), null, TextUnitKt.KN(24), TextUnitKt.J2(0.5d), 0, 18, null), xMQ(TextUnitKt.KN(18), null, TextUnitKt.KN(24), TextUnitKt.J2(0.5d), 0, 18, null), Uo(TextUnitKt.KN(14), null, TextUnitKt.KN(20), TextUnitKt.J2(0.25d), 0, 18, null), Uo(TextUnitKt.KN(24), null, TextUnitKt.KN(32), 0L, 0, 26, null), O(TextUnitKt.KN(14), null, TextUnitKt.KN(20), TextUnitKt.J2(0.1d), 0, 18, null), textStyleUo6, textStyleRl12);
        rl = FontFamily.INSTANCE.rl();
    }

    private static final TextStyle J2(long j2, FontFamily fontFamily, long j3, long j4, int i2) {
        return mUb(new TextStyle(0L, j2, FontWeight.INSTANCE.O(), FontStyle.t(i2), null, null, null, j4, null, null, null, 0L, null, null, null, 0, 0, j3, null, null, null, 0, 0, null, 16646001, null), fontFamily);
    }

    private static final TextStyle KN(long j2, FontFamily fontFamily, long j3, long j4, int i2) {
        return mUb(new TextStyle(0L, j2, FontWeight.INSTANCE.J2(), FontStyle.t(i2), null, null, null, j4, null, null, null, 0L, null, null, null, 0, 0, j3, null, null, null, 0, 0, null, 16646001, null), fontFamily);
    }

    static /* synthetic */ TextStyle O(long j2, FontFamily fontFamily, long j3, long j4, int i2, int i3, Object obj) {
        return nr(j2, (i3 & 2) != 0 ? rl : fontFamily, (i3 & 4) != 0 ? TextUnit.INSTANCE.n() : j3, (i3 & 8) != 0 ? TextUnitKt.KN(0) : j4, (i3 & 16) != 0 ? FontStyle.INSTANCE.rl() : i2);
    }

    static /* synthetic */ TextStyle Uo(long j2, FontFamily fontFamily, long j3, long j4, int i2, int i3, Object obj) {
        return J2(j2, (i3 & 2) != 0 ? rl : fontFamily, (i3 & 4) != 0 ? TextUnit.INSTANCE.n() : j3, (i3 & 8) != 0 ? TextUnitKt.KN(0) : j4, (i3 & 16) != 0 ? FontStyle.INSTANCE.rl() : i2);
    }

    private static final TextStyle n(long j2, FontFamily fontFamily, long j3, long j4, int i2) {
        return mUb(new TextStyle(0L, j2, FontWeight.INSTANCE.n(), FontStyle.t(i2), null, null, null, j4, null, null, null, 0L, null, null, null, 0, 0, j3, null, null, null, 0, 0, null, 16646001, null), fontFamily);
    }

    private static final TextStyle nr(long j2, FontFamily fontFamily, long j3, long j4, int i2) {
        return mUb(new TextStyle(0L, j2, FontWeight.INSTANCE.nr(), FontStyle.t(i2), null, null, null, j4, null, null, null, 0L, null, null, null, 0, 0, j3, null, null, null, 0, 0, null, 16646001, null), fontFamily);
    }

    static /* synthetic */ TextStyle rl(long j2, FontFamily fontFamily, long j3, long j4, int i2, int i3, Object obj) {
        return n(j2, (i3 & 2) != 0 ? rl : fontFamily, (i3 & 4) != 0 ? TextUnit.INSTANCE.n() : j3, (i3 & 8) != 0 ? TextUnitKt.KN(0) : j4, (i3 & 16) != 0 ? FontStyle.INSTANCE.rl() : i2);
    }

    public static final j t() {
        return f3137n;
    }

    static /* synthetic */ TextStyle xMQ(long j2, FontFamily fontFamily, long j3, long j4, int i2, int i3, Object obj) {
        return KN(j2, (i3 & 2) != 0 ? rl : fontFamily, (i3 & 4) != 0 ? TextUnit.INSTANCE.n() : j3, (i3 & 8) != 0 ? TextUnitKt.KN(0) : j4, (i3 & 16) != 0 ? FontStyle.INSTANCE.rl() : i2);
    }

    private static final TextStyle mUb(TextStyle textStyle, FontFamily fontFamily) {
        if (textStyle.mUb() != null) {
            return textStyle;
        }
        return TextStyle.t(textStyle, 0L, 0L, null, null, null, fontFamily, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
    }
}
