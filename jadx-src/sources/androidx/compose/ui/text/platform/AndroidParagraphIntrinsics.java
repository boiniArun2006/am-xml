package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b*\u0010+R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b$\u00100R\u001a\u00105\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b.\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010;R\u001a\u0010A\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b7\u0010@R\u0014\u0010D\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010CR\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010CR\u0014\u0010G\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010F¨\u0006H"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V", c.f62177j, "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "rl", "Landroidx/compose/ui/text/TextStyle;", "xMQ", "()Landroidx/compose/ui/text/TextStyle;", "t", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "nr", "getPlaceholders", "O", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Uo", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "J2", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "gh", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "textPaint", "", "KN", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "charSequence", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;", "mUb", "Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;", "resolvedTypefaces", "", "Z", "emojiCompatProcessed", "", "qie", "I", "()I", "textDirectionHeuristic", "", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidParagraphIntrinsics.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraphIntrinsics.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphIntrinsics\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,206:1\n117#2,2:207\n34#2,6:209\n119#2:215\n*S KotlinDebug\n*F\n+ 1 AndroidParagraphIntrinsics.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphIntrinsics\n*L\n112#1:207,2\n112#1:209,6\n112#1:215\n*E\n"})
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Density density;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final AndroidTextPaint textPaint;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final boolean emojiCompatProcessed;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private TypefaceDirtyTrackerLinkedList resolvedTypefaces;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final List placeholders;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final int textDirectionHeuristic;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List annotations;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final LayoutIntrinsics layoutIntrinsics;

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float O() {
        return this.layoutIntrinsics.mUb();
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final AndroidTextPaint getTextPaint() {
        return this.textPaint;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float n() {
        return this.layoutIntrinsics.xMQ();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean rl() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.resolvedTypefaces;
        if (typefaceDirtyTrackerLinkedList != null ? typefaceDirtyTrackerLinkedList.rl() : false) {
            return true;
        }
        return !this.emojiCompatProcessed && AndroidParagraphIntrinsics_androidKt.t(this.style) && ((Boolean) EmojiCompatStatus.f33852n.n().getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public AndroidParagraphIntrinsics(String str, TextStyle textStyle, List list, List list2, FontFamily.Resolver resolver, Density density) {
        boolean zBooleanValue;
        Object obj;
        boolean z2;
        ?? arrayList;
        AnnotatedString.Range range;
        this.text = str;
        this.style = textStyle;
        this.annotations = list;
        this.placeholders = list2;
        this.fontFamilyResolver = resolver;
        this.density = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        if (!AndroidParagraphIntrinsics_androidKt.t(textStyle)) {
            zBooleanValue = false;
        } else {
            zBooleanValue = ((Boolean) EmojiCompatStatus.f33852n.n().getValue()).booleanValue();
        }
        this.emojiCompatProcessed = zBooleanValue;
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.nr(textStyle.te(), textStyle.XQ());
        Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> function4 = new Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface>() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Typeface invoke(FontFamily fontFamily, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis) {
                return n(fontFamily, fontWeight, fontStyle.getValue(), fontSynthesis.getValue());
            }

            public final Typeface n(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3) {
                State stateN = this.f33836n.getFontFamilyResolver().n(fontFamily, fontWeight, i2, i3);
                if (stateN instanceof TypefaceResult.Immutable) {
                    Object value = stateN.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) value;
                }
                TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = new TypefaceDirtyTrackerLinkedList(stateN, this.f33836n.resolvedTypefaces);
                this.f33836n.resolvedTypefaces = typefaceDirtyTrackerLinkedList;
                return typefaceDirtyTrackerLinkedList.n();
            }
        };
        TextPaintExtensions_androidKt.O(androidTextPaint, textStyle.E2());
        SpanStyle spanStyleRV9 = textStyle.rV9();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = list.get(i2);
                if (((AnnotatedString.Range) obj).getItem() instanceof SpanStyle) {
                    break;
                } else {
                    i2++;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        SpanStyle spanStyleN = TextPaintExtensions_androidKt.n(androidTextPaint, spanStyleRV9, function4, density, z2);
        if (spanStyleN != null) {
            int size2 = this.annotations.size() + 1;
            arrayList = new ArrayList(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                if (i3 == 0) {
                    range = new AnnotatedString.Range(spanStyleN, 0, this.text.length());
                } else {
                    range = (AnnotatedString.Range) this.annotations.get(i3 - 1);
                }
                arrayList.add(range);
            }
        } else {
            arrayList = this.annotations;
        }
        CharSequence charSequenceN = AndroidParagraphHelper_androidKt.n(this.text, this.textPaint.getTextSize(), this.style, arrayList, this.placeholders, this.density, function4, this.emojiCompatProcessed);
        this.charSequence = charSequenceN;
        this.layoutIntrinsics = new LayoutIntrinsics(charSequenceN, this.textPaint, this.textDirectionHeuristic);
    }
}
