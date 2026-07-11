package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontSynthesis_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", c.f62177j, "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontMatcher;", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "", "Landroidx/compose/ui/text/font/Font;", "rl", "Ljava/util/Map;", "loadedTypefaces", "t", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(message = "This is not supported after downloadable fonts.")
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,174:1\n230#2,3:175\n34#2,6:178\n233#2:184\n150#2,3:185\n34#2,6:188\n153#2:194\n482#2,4:195\n34#2,4:199\n486#2,3:203\n39#2:206\n489#2:207\n34#2,6:216\n77#3,8:208\n94#3,10:222\n94#3,10:232\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n66#1:175,3\n66#1:178,6\n66#1:184\n69#1:185,3\n69#1:188,6\n69#1:194\n73#1:195,4\n73#1:199,4\n73#1:203,3\n73#1:206\n73#1:207\n78#1:216,6\n75#1:208,8\n100#1:222,10\n103#1:232,10\n*E\n"})
public final class AndroidFontListTypeface implements AndroidTypeface {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final FontMatcher fontMatcher;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Map loadedTypefaces;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Companion f33829t = new Companion(null);
    public static final int nr = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final FontMatcher f33828O = new FontMatcher();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface$Companion;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    public Typeface n(FontWeight fontWeight, int fontStyle, int synthesis) {
        Font font = (Font) CollectionsKt.firstOrNull(this.fontMatcher.n(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, fontStyle));
        if (font == null) {
            InlineClassHelperKt.nr("Could not load font");
            throw new KotlinNothingValueException();
        }
        Typeface typeface = (Typeface) this.loadedTypefaces.get(font);
        if (typeface == null) {
            InlineClassHelperKt.nr("Could not load typeface");
            throw new KotlinNothingValueException();
        }
        Object objN = FontSynthesis_androidKt.n(synthesis, typeface, font, fontWeight, fontStyle);
        Intrinsics.checkNotNull(objN, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) objN;
    }
}
