package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\r\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0013\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\fR\u001d\u0010\u0016\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0018\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u001d\u0010$\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\"\u0010\fR\u001d\u0010&\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b\u0014\u0010\fR\u001d\u0010,\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u00105\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u001d\u00108\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuSpec;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/text/TextStyle;", "mUb", "(J)Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "()F", "ContainerWidthMin", "t", c.f62177j, "ContainerWidthMax", "nr", "Uo", "ListItemHeight", "O", "KN", "MenuContainerElevation", "J2", "CornerRadius", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "()Landroidx/compose/ui/Alignment$Vertical;", "LabelVerticalTextAlignment", "Landroidx/compose/ui/text/style/TextAlign;", "I", "getLabelHorizontalTextAlignment-e0LSkKk", "()I", "LabelHorizontalTextAlignment", "xMQ", "HorizontalPadding", "VerticalPadding", "gh", "IconSize", "Landroidx/compose/ui/unit/TextUnit;", "qie", "J", "getFontSize-XSAIIZE", "()J", "FontSize", "Landroidx/compose/ui/text/font/FontWeight;", "az", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "FontWeight", "ty", "getLineHeight-XSAIIZE", "LineHeight", "HI", "getLetterSpacing-XSAIIZE", "LetterSpacing", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@VisibleForTesting
@SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuSpec\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,426:1\n113#2:427\n113#2:428\n113#2:429\n113#2:430\n113#2:431\n113#2:432\n113#2:433\n113#2:434\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuSpec\n*L\n71#1:427\n72#1:428\n73#1:429\n74#1:430\n75#1:431\n78#1:432\n79#1:433\n80#1:434\n*E\n"})
public final class ContextMenuSpec {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ContextMenuSpec f16374n = new ContextMenuSpec();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float ContainerWidthMin = Dp.KN(112);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerWidthMax = Dp.KN(280);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float ListItemHeight = Dp.KN(48);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float MenuContainerElevation = Dp.KN(3);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final float CornerRadius = Dp.KN(4);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final Alignment.Vertical LabelVerticalTextAlignment = Alignment.INSTANCE.xMQ();

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final int LabelHorizontalTextAlignment = TextAlign.INSTANCE.J2();

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final float HorizontalPadding = Dp.KN(12);

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final float VerticalPadding = Dp.KN(8);

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final float IconSize = Dp.KN(24);

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final long FontSize = TextUnitKt.KN(14);

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final FontWeight FontWeight = FontWeight.INSTANCE.nr();

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final long LineHeight = TextUnitKt.KN(20);

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private static final long LetterSpacing = TextUnitKt.Uo(0.1f);

    public final Alignment.Vertical J2() {
        return LabelVerticalTextAlignment;
    }

    public final float KN() {
        return MenuContainerElevation;
    }

    public final float O() {
        return IconSize;
    }

    public final float Uo() {
        return ListItemHeight;
    }

    public final TextStyle mUb(long color) {
        int i2 = LabelHorizontalTextAlignment;
        return new TextStyle(color, FontSize, FontWeight, null, null, null, null, LetterSpacing, null, null, null, 0L, null, null, null, i2, 0, LineHeight, null, null, null, 0, 0, null, 16613240, null);
    }

    public final float n() {
        return ContainerWidthMax;
    }

    public final float nr() {
        return HorizontalPadding;
    }

    public final float rl() {
        return ContainerWidthMin;
    }

    public final float t() {
        return CornerRadius;
    }

    public final float xMQ() {
        return VerticalPadding;
    }

    private ContextMenuSpec() {
    }
}
