package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001av\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"", "", c.f62177j, "(F)I", "Landroidx/compose/foundation/text/TextDelegate;", "current", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "rl", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,356:1\n26#2:357\n*S KotlinDebug\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegateKt\n*L\n310#1:357\n*E\n"})
public final class TextDelegateKt {
    public static final int n(float f3) {
        return Math.round((float) Math.ceil(f3));
    }

    public static /* synthetic */ TextDelegate t(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z2, int i2, int i3, int i5, List list, int i7, Object obj) {
        if ((i7 & 32) != 0) {
            z2 = true;
        }
        if ((i7 & 64) != 0) {
            i2 = TextOverflow.INSTANCE.n();
        }
        if ((i7 & 128) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i7 & 256) != 0) {
            i5 = 1;
        }
        return rl(textDelegate, annotatedString, textStyle, density, resolver, z2, i2, i3, i5, list);
    }

    public static final TextDelegate rl(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z2, int i2, int i3, int i5, List list) {
        FontFamily.Resolver resolver2;
        boolean z3;
        int i7;
        int i8;
        int i9;
        List list2;
        if (Intrinsics.areEqual(textDelegate.getText(), annotatedString) && Intrinsics.areEqual(textDelegate.getStyle(), textStyle)) {
            z3 = z2;
            if (textDelegate.getSoftWrap() == z3) {
                i7 = i2;
                if (TextOverflow.KN(textDelegate.getOverflow(), i7)) {
                    i8 = i3;
                    if (textDelegate.getMaxLines() == i8) {
                        i9 = i5;
                        if (textDelegate.getMinLines() == i9 && Intrinsics.areEqual(textDelegate.getDensity(), density)) {
                            list2 = list;
                            if (Intrinsics.areEqual(textDelegate.getPlaceholders(), list2)) {
                                resolver2 = resolver;
                                if (textDelegate.getFontFamilyResolver() == resolver2) {
                                    return textDelegate;
                                }
                            } else {
                                resolver2 = resolver;
                            }
                            return new TextDelegate(annotatedString, textStyle, i8, i9, z3, i7, density, resolver2, list2, null);
                        }
                        resolver2 = resolver;
                        list2 = list;
                        return new TextDelegate(annotatedString, textStyle, i8, i9, z3, i7, density, resolver2, list2, null);
                    }
                    resolver2 = resolver;
                    i9 = i5;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i8, i9, z3, i7, density, resolver2, list2, null);
                }
                resolver2 = resolver;
                i8 = i3;
                i9 = i5;
                list2 = list;
                return new TextDelegate(annotatedString, textStyle, i8, i9, z3, i7, density, resolver2, list2, null);
            }
            resolver2 = resolver;
        } else {
            resolver2 = resolver;
            z3 = z2;
        }
        i7 = i2;
        i8 = i3;
        i9 = i5;
        list2 = list;
        return new TextDelegate(annotatedString, textStyle, i8, i9, z3, i7, density, resolver2, list2, null);
    }
}
