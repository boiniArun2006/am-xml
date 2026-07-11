package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final Ln SINGLE_STYLE_VALUES = Ln.o(TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final Ln MARK_SHAPE_VALUES = Ln.XQ(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final Ln MARK_FILL_VALUES = Ln.o(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    private static final Ln POSITION_VALUES = Ln.XQ(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String strO = AbstractC2372w6.O(str.trim());
        if (strO.isEmpty()) {
            return null;
        }
        return parseWords(Ln.ty(TextUtils.split(strO, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TextEmphasis parseWords(Ln ln2) {
        byte b2;
        int i2;
        int iHashCode;
        String str = (String) lej.t(O.O(POSITION_VALUES, ln2), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
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
        O.Wre wreO = O.O(SINGLE_STYLE_VALUES, ln2);
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
        O.Wre wreO2 = O.O(MARK_FILL_VALUES, ln2);
        O.Wre wreO3 = O.O(MARK_SHAPE_VALUES, ln2);
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
        this.markShape = i2;
        this.markFill = i3;
        this.position = i5;
    }
}
