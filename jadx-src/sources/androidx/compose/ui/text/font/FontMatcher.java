package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontWeight;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/font/Font;", "fontList", "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, c.f62177j, "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n104#1,39:194\n104#1,39:243\n110#1,33:292\n110#1,33:335\n230#2,3:173\n34#2,6:176\n233#2:182\n230#2,3:183\n34#2,6:186\n233#2:192\n230#2,3:233\n34#2,6:236\n233#2:242\n230#2,3:282\n34#2,6:285\n233#2:291\n230#2,3:325\n34#2,6:328\n233#2:334\n230#2,3:368\n34#2,6:371\n233#2:377\n230#2,3:378\n34#2,6:381\n233#2:387\n230#2,3:388\n34#2,6:391\n233#2:397\n1#3:193\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:194,39\n72#1:243,39\n82#1:292,33\n89#1:335,33\n46#1:173,3\n46#1:176,6\n46#1:182\n55#1:183,3\n55#1:186,6\n55#1:192\n65#1:233,3\n65#1:236,6\n65#1:242\n72#1:282,3\n72#1:285,6\n72#1:291\n82#1:325,3\n82#1:328,6\n82#1:334\n89#1:368,3\n89#1:371,6\n89#1:377\n142#1:378,3\n142#1:381,6\n142#1:387\n142#1:388,3\n142#1:391,6\n142#1:397\n*E\n"})
public final class FontMatcher {
    public final List n(List fontList, FontWeight fontWeight, int fontStyle) {
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = fontList.get(i3);
            Font font = (Font) obj;
            if (Intrinsics.areEqual(font.getWeight(), fontWeight) && FontStyle.J2(font.getStyle(), fontStyle)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object obj2 = fontList.get(i5);
            if (FontStyle.J2(((Font) obj2).getStyle(), fontStyle)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.Uo()) < 0) {
            int size3 = fontList.size();
            FontWeight fontWeight3 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size3) {
                    break;
                }
                FontWeight weight = ((Font) fontList.get(i7)).getWeight();
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight3 = weight;
                        fontWeight2 = fontWeight3;
                        break;
                    }
                    if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                        fontWeight3 = weight;
                    }
                } else if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight;
                }
                i7++;
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            ArrayList arrayList3 = new ArrayList(fontList.size());
            int size4 = fontList.size();
            while (i2 < size4) {
                Object obj3 = fontList.get(i2);
                if (Intrinsics.areEqual(((Font) obj3).getWeight(), fontWeight3)) {
                    arrayList3.add(obj3);
                }
                i2++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.KN()) > 0) {
            int size5 = fontList.size();
            FontWeight fontWeight4 = null;
            int i8 = 0;
            while (true) {
                if (i8 >= size5) {
                    break;
                }
                FontWeight weight2 = ((Font) fontList.get(i8)).getWeight();
                if (weight2.compareTo(fontWeight) >= 0) {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight2;
                        fontWeight2 = fontWeight4;
                        break;
                    }
                    if (fontWeight4 == null || weight2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = weight2;
                    }
                } else if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight2;
                }
                i8++;
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            ArrayList arrayList4 = new ArrayList(fontList.size());
            int size6 = fontList.size();
            while (i2 < size6) {
                Object obj4 = fontList.get(i2);
                if (Intrinsics.areEqual(((Font) obj4).getWeight(), fontWeight4)) {
                    arrayList4.add(obj4);
                }
                i2++;
            }
            return arrayList4;
        }
        FontWeight fontWeightKN = companion.KN();
        int size7 = fontList.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        int i9 = 0;
        while (true) {
            if (i9 >= size7) {
                break;
            }
            FontWeight weight3 = ((Font) fontList.get(i9)).getWeight();
            if (fontWeightKN == null || weight3.compareTo(fontWeightKN) <= 0) {
                if (weight3.compareTo(fontWeight) >= 0) {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = weight3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = weight3;
                    }
                } else if (fontWeight5 == null || weight3.compareTo(fontWeight5) > 0) {
                    fontWeight5 = weight3;
                }
            }
            i9++;
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(fontList.size());
        int size8 = fontList.size();
        for (int i10 = 0; i10 < size8; i10++) {
            Object obj5 = fontList.get(i10);
            if (Intrinsics.areEqual(((Font) obj5).getWeight(), fontWeight5)) {
                arrayList5.add(obj5);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight fontWeightKN2 = FontWeight.INSTANCE.KN();
        int size9 = fontList.size();
        FontWeight fontWeight7 = null;
        int i11 = 0;
        while (true) {
            if (i11 >= size9) {
                break;
            }
            FontWeight weight4 = ((Font) fontList.get(i11)).getWeight();
            if (fontWeightKN2 == null || weight4.compareTo(fontWeightKN2) >= 0) {
                if (weight4.compareTo(fontWeight) >= 0) {
                    if (weight4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = weight4;
                    }
                } else if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight4;
                }
            }
            i11++;
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(fontList.size());
        int size10 = fontList.size();
        while (i2 < size10) {
            Object obj6 = fontList.get(i2);
            if (Intrinsics.areEqual(((Font) obj6).getWeight(), fontWeight2)) {
                arrayList6.add(obj6);
            }
            i2++;
        }
        return arrayList6;
    }
}
