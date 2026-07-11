package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.collect.Ln;
import com.google.common.collect.O;
import com.google.common.collect.lej;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class TextEmphasis {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f58338n;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f58339t;
    private static final Pattern nr = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Ln f58337O = Ln.o(TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final Ln J2 = Ln.XQ(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final Ln Uo = Ln.o(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    private static final Ln KN = Ln.XQ(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public static TextEmphasis n(String str) {
        if (str == null) {
            return null;
        }
        String strO = AbstractC2372w6.O(str.trim());
        if (strO.isEmpty()) {
            return null;
        }
        return rl(Ln.ty(TextUtils.split(strO, nr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TextEmphasis rl(Ln ln2) {
        byte b2;
        int i2;
        int iHashCode;
        String str = (String) lej.t(O.O(KN, ln2), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode2 = str.hashCode();
        byte b4 = 0;
        int i3 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                b2 = (iHashCode2 == 92734940 && str.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) ? (byte) 0 : (byte) -1;
            } else if (str.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                b2 = 1;
            }
        } else if (str.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
            b2 = 2;
        }
        int i5 = b2 != 0 ? b2 != 1 ? 1 : -2 : 2;
        O.Wre wreO = O.O(f58337O, ln2);
        if (!wreO.isEmpty()) {
            String str2 = (String) wreO.iterator().next();
            int iHashCode3 = str2.hashCode();
            if (iHashCode3 == 3005871) {
                str2.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
            } else if (iHashCode3 == 3387192 && str2.equals("none")) {
                i3 = 0;
            }
            return new TextEmphasis(i3, 0, i5);
        }
        O.Wre wreO2 = O.O(Uo, ln2);
        O.Wre wreO3 = O.O(J2, ln2);
        if (wreO2.isEmpty() && wreO3.isEmpty()) {
            return new TextEmphasis(-1, 0, i5);
        }
        String str3 = (String) lej.t(wreO2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        int iHashCode4 = str3.hashCode();
        if (iHashCode4 != -1274499742) {
            if (iHashCode4 == 3417674 && str3.equals("open")) {
                i2 = 2;
            }
            String str4 = (String) lej.t(wreO3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode = str4.hashCode();
            if (iHashCode == -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode != 99657 || !str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        b4 = -1;
                    }
                } else if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    b4 = 1;
                }
            } else if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                b4 = 2;
            }
            return new TextEmphasis(b4 != 0 ? b4 != 1 ? 1 : 3 : 2, i2, i5);
        }
        str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        i2 = 1;
        String str42 = (String) lej.t(wreO3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        iHashCode = str42.hashCode();
        if (iHashCode == -1360216880) {
        }
        return new TextEmphasis(b4 != 0 ? b4 != 1 ? 1 : 3 : 2, i2, i5);
    }

    private TextEmphasis(int i2, int i3, int i5) {
        this.f58338n = i2;
        this.rl = i3;
        this.f58339t = i5;
    }
}
