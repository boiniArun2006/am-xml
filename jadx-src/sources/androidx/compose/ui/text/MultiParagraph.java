package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJP\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JX\u0010%\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020#¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\b1\u00102J(\u0010:\u001a\u0002092\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b<\u0010=J*\u0010B\u001a\u00020?2\u0006\u0010>\u001a\u0002092\u0006\u0010@\u001a\u00020?2\b\b\u0001\u0010A\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001d\u0010F\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020H2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020H2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bK\u0010JJ\u001b\u0010L\u001a\u0002092\u0006\u0010\f\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bN\u0010=J\u0015\u0010O\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bS\u0010RJ\u0015\u0010T\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bT\u0010RJ\u0015\u0010U\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bU\u0010RJ\u0015\u0010V\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bV\u0010RJ\u0015\u0010W\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bW\u0010PJ\u001f\u0010Y\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020D¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020D2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010f\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bK\u0010S\u001a\u0004\bd\u0010eR\u0017\u0010j\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b<\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010l\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bN\u0010g\u001a\u0004\bk\u0010iR\u0017\u0010n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bd\u0010a\u001a\u0004\bm\u0010cR\u001f\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030o8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR \u0010w\u001a\b\u0012\u0004\u0012\u00020u0o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010q\u001a\u0004\bv\u0010sR\u0014\u0010z\u001a\u00020x8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010yR\u0011\u0010{\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bp\u0010iR\u0011\u0010}\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b|\u0010i\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006~"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "maxLines", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "offset", "", "s7N", "(I)V", "wTp", "lineIndex", "v", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "X", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "N", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", TtmlNode.START, TtmlNode.END, "Landroidx/compose/ui/graphics/Path;", "g", "(II)Landroidx/compose/ui/graphics/Path;", "vertical", "Ik", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "position", "aYN", "(J)I", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "Landroidx/compose/ui/text/TextRange;", "iF", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "nr", "(I)Landroidx/compose/ui/geometry/Rect;", "range", "", "array", "arrayStart", c.f62177j, "(J[FI)[F", "", "usePrimaryDirection", "xMQ", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "ViF", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "t", "E2", "(I)J", "O", "ck", "(I)I", "o", "(I)F", "Z", "S", "qie", "r", "XQ", "visibleEnd", "ty", "(IZ)I", "e", "(I)Z", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "mUb", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "rl", "I", "WPU", "()I", "J2", "()Z", "didExceedMaxLines", "F", "fD", "()F", "width", "KN", "height", "az", "lineCount", "", "Uo", "Ljava/util/List;", "te", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/ParagraphInfo;", "nY", "paragraphInfoList", "Landroidx/compose/ui/text/AnnotatedString;", "()Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "firstBaseline", "gh", "lastBaseline", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1227:1\n114#2,8:1228\n114#2,8:1271\n114#2,8:1282\n114#2,8:1290\n114#2,8:1298\n529#3,3:1236\n34#3,4:1239\n532#3:1243\n150#3,3:1245\n34#3,6:1248\n153#3:1254\n533#3,2:1255\n39#3:1257\n535#3:1258\n34#3,6:1259\n34#3,6:1265\n1#4:1244\n69#5:1279\n70#6:1280\n22#7:1281\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n389#1:1228,8\n522#1:1271,8\n988#1:1282,8\n994#1:1290,8\n1000#1:1298,8\n455#1:1236,3\n455#1:1239,4\n455#1:1243\n456#1:1245,3\n456#1:1248,6\n456#1:1254\n455#1:1255,2\n455#1:1257\n455#1:1258\n483#1:1259,6\n500#1:1265,6\n564#1:1279\n564#1:1280\n564#1:1281\n*E\n"})
public final class MultiParagraph {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int lineCount;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final List paragraphInfoList;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final List placeholderRects;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MultiParagraphIntrinsics intrinsics;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j2, i2, i3);
    }

    private final void s7N(int offset) {
        boolean z2 = false;
        if (offset >= 0 && offset < rl().getText().length()) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        InlineClassHelperKt.n("offset(" + offset + ") is out of bounds [0, " + rl().length() + ')');
    }

    private final void v(int lineIndex) {
        boolean z2 = false;
        if (lineIndex >= 0 && lineIndex < this.lineCount) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        InlineClassHelperKt.n("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')');
    }

    private final void wTp(int offset) {
        boolean z2 = false;
        if (offset >= 0 && offset <= rl().getText().length()) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        InlineClassHelperKt.n("offset(" + offset + ") is out of bounds [0, " + rl().length() + ']');
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, int i3) {
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i2;
        boolean z2 = true;
        if (!(Constraints.ty(j2) == 0 && Constraints.az(j2) == 0)) {
            InlineClassHelperKt.n("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List listJ2 = multiParagraphIntrinsics.getInfoList();
        int size = listJ2.size();
        int i5 = 0;
        float f3 = 0.0f;
        int i7 = 0;
        while (i7 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) listJ2.get(i7);
            Paragraph paragraphT = ParagraphKt.t(paragraphIntrinsicInfo.getIntrinsics(), ConstraintsKt.rl(0, Constraints.qie(j2), 0, Constraints.Uo(j2) ? RangesKt.coerceAtLeast(Constraints.gh(j2) - ParagraphKt.nr(f3), 0) : Constraints.gh(j2), 5, null), this.maxLines - i5, i3);
            float height = f3 + paragraphT.getHeight();
            int iIk = i5 + paragraphT.Ik();
            arrayList.add(new ParagraphInfo(paragraphT, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i5, iIk, f3, height));
            if (paragraphT.r() || (iIk == this.maxLines && i7 != CollectionsKt.getLastIndex(this.intrinsics.getInfoList()))) {
                i5 = iIk;
                f3 = height;
                break;
            } else {
                i7++;
                i5 = iIk;
                f3 = height;
            }
        }
        z2 = false;
        this.height = f3;
        this.lineCount = i5;
        this.didExceedMaxLines = z2;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.qie(j2);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i8);
            List listFD = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(listFD.size());
            int size3 = listFD.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listFD.get(i9);
                arrayList3.add(rect != null ? paragraphInfo.xMQ(rect) : null);
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList4.add(null);
            }
            arrayList2 = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    public static /* synthetic */ int HI(MultiParagraph multiParagraph, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return multiParagraph.ty(i2, z2);
    }

    public static /* synthetic */ void nHg(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f3, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f3 = Float.NaN;
        }
        multiParagraph.N(canvas, brush, f3, (i3 & 8) != 0 ? null : shadow, (i3 & 16) != 0 ? null : textDecoration, (i3 & 32) != 0 ? null : drawStyle, (i3 & 64) != 0 ? DrawScope.INSTANCE.n() : i2);
    }

    private final AnnotatedString rl() {
        return this.intrinsics.getAnnotatedString();
    }

    public final int Ik(float vertical) {
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.t(this.paragraphInfoList, vertical));
        return paragraphInfo.nr() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.ty(paragraphInfo.getParagraph().o(paragraphInfo.Z(vertical)));
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    public final float Uo() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return ((ParagraphInfo) this.paragraphInfoList.get(0)).getParagraph().qie();
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int aYN(long position) {
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.t(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & position))));
        return paragraphInfo.nr() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.az(paragraphInfo.getParagraph().az(paragraphInfo.Ik(position)));
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    /* JADX INFO: renamed from: fD, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final Path g(final int start, final int end) {
        if (!(start >= 0 && start <= end && end <= rl().getText().length())) {
            InlineClassHelperKt.n("Start(" + start + ") or End(" + end + ") is out of range [0.." + rl().getText().length() + "), or start > end!");
        }
        if (start == end) {
            return AndroidPath_androidKt.n();
        }
        final Path pathN = AndroidPath_androidKt.n();
        MultiParagraphKt.nr(this.paragraphInfoList, TextRangeKt.rl(start, end), new Function1<ParagraphInfo, Unit>() { // from class: androidx.compose.ui.text.MultiParagraph$getPathForRange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ParagraphInfo paragraphInfo) {
                n(paragraphInfo);
                return Unit.INSTANCE;
            }

            public final void n(ParagraphInfo paragraphInfo) {
                Path.ck(pathN, paragraphInfo.mUb(paragraphInfo.getParagraph().Z(paragraphInfo.r(start), paragraphInfo.r(end))), 0L, 2, null);
            }
        });
        return pathN;
    }

    public final float gh() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.last(this.paragraphInfoList);
        return paragraphInfo.HI(paragraphInfo.getParagraph().ViF());
    }

    public final long iF(Rect rect, int granularity, TextInclusionStrategy inclusionStrategy) {
        TextRange.Companion companion;
        TextRange.Companion companion2;
        int iT = MultiParagraphKt.t(this.paragraphInfoList, rect.getTop());
        if (((ParagraphInfo) this.paragraphInfoList.get(iT)).getBottom() >= rect.xMQ() || iT == CollectionsKt.getLastIndex(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(iT);
            return ParagraphInfo.qie(paragraphInfo, paragraphInfo.getParagraph().g(paragraphInfo.ck(rect), granularity, inclusionStrategy), false, 1, null);
        }
        int iT2 = MultiParagraphKt.t(this.paragraphInfoList, rect.xMQ());
        long jN = TextRange.INSTANCE.n();
        while (true) {
            companion = TextRange.INSTANCE;
            if (!TextRange.Uo(jN, companion.n()) || iT > iT2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = (ParagraphInfo) this.paragraphInfoList.get(iT);
            jN = ParagraphInfo.qie(paragraphInfo2, paragraphInfo2.getParagraph().g(paragraphInfo2.ck(rect), granularity, inclusionStrategy), false, 1, null);
            iT++;
        }
        if (TextRange.Uo(jN, companion.n())) {
            return companion.n();
        }
        long jN2 = companion.n();
        while (true) {
            companion2 = TextRange.INSTANCE;
            if (!TextRange.Uo(jN2, companion2.n()) || iT > iT2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = (ParagraphInfo) this.paragraphInfoList.get(iT2);
            jN2 = ParagraphInfo.qie(paragraphInfo3, paragraphInfo3.getParagraph().g(paragraphInfo3.ck(rect), granularity, inclusionStrategy), false, 1, null);
            iT2--;
        }
        return TextRange.Uo(jN2, companion2.n()) ? jN : TextRangeKt.rl(TextRange.ty(jN), TextRange.xMQ(jN2));
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    /* JADX INFO: renamed from: nY, reason: from getter */
    public final List getParagraphInfoList() {
        return this.paragraphInfoList;
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final List getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final long E2(int offset) {
        int iN;
        wTp(offset);
        if (offset == rl().length()) {
            iN = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iN = MultiParagraphKt.n(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(iN);
        return paragraphInfo.gh(paragraphInfo.getParagraph().gh(paragraphInfo.r(offset)), false);
    }

    public final void N(Canvas canvas, Brush brush, float alpha, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        AndroidMultiParagraphDraw_androidKt.n(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public final Rect O(int offset) {
        int iN;
        wTp(offset);
        if (offset == rl().length()) {
            iN = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iN = MultiParagraphKt.n(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(iN);
        return paragraphInfo.xMQ(paragraphInfo.getParagraph().xMQ(paragraphInfo.r(offset)));
    }

    public final float S(int lineIndex) {
        v(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.rl(this.paragraphInfoList, lineIndex));
        return paragraphInfo.HI(paragraphInfo.getParagraph().KN(paragraphInfo.o(lineIndex)));
    }

    public final ResolvedTextDirection ViF(int offset) {
        int iN;
        wTp(offset);
        if (offset == rl().length()) {
            iN = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iN = MultiParagraphKt.n(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(iN);
        return paragraphInfo.getParagraph().Uo(paragraphInfo.r(offset));
    }

    public final void X(Canvas canvas, long color, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        canvas.O();
        List list = this.paragraphInfoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i2);
            paragraphInfo.getParagraph().mUb(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.nr(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.n();
    }

    public final int XQ(int lineIndex) {
        v(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.rl(this.paragraphInfoList, lineIndex));
        return paragraphInfo.az(paragraphInfo.getParagraph().HI(paragraphInfo.o(lineIndex)));
    }

    public final float Z(int lineIndex) {
        v(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.rl(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().rl(paragraphInfo.o(lineIndex));
    }

    public final int ck(int offset) {
        int iN;
        if (offset >= rl().length()) {
            iN = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else if (offset < 0) {
            iN = 0;
        } else {
            iN = MultiParagraphKt.n(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(iN);
        return paragraphInfo.ty(paragraphInfo.getParagraph().nY(paragraphInfo.r(offset)));
    }

    public final boolean e(int lineIndex) {
        v(lineIndex);
        return ((ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.rl(this.paragraphInfoList, lineIndex))).getParagraph().ty(lineIndex);
    }

    public final float[] n(final long range, final float[] array, int arrayStart) {
        s7N(TextRange.qie(range));
        wTp(TextRange.gh(range));
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = arrayStart;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        MultiParagraphKt.nr(this.paragraphInfoList, range, new Function1<ParagraphInfo, Unit>() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ParagraphInfo paragraphInfo) {
                n(paragraphInfo);
                return Unit.INSTANCE;
            }

            public final void n(ParagraphInfo paragraphInfo) {
                long j2 = range;
                float[] fArr = array;
                Ref.IntRef intRef2 = intRef;
                Ref.FloatRef floatRef2 = floatRef;
                long jRl = TextRangeKt.rl(paragraphInfo.r(paragraphInfo.getStartIndex() > TextRange.qie(j2) ? paragraphInfo.getStartIndex() : TextRange.qie(j2)), paragraphInfo.r(paragraphInfo.getEndIndex() < TextRange.gh(j2) ? paragraphInfo.getEndIndex() : TextRange.gh(j2)));
                paragraphInfo.getParagraph().aYN(jRl, fArr, intRef2.element);
                int iMUb = intRef2.element + (TextRange.mUb(jRl) * 4);
                for (int i2 = intRef2.element; i2 < iMUb; i2 += 4) {
                    int i3 = i2 + 1;
                    float f3 = fArr[i3];
                    float f4 = floatRef2.element;
                    fArr[i3] = f3 + f4;
                    int i5 = i2 + 3;
                    fArr[i5] = fArr[i5] + f4;
                }
                intRef2.element = iMUb;
                floatRef2.element += paragraphInfo.getParagraph().getHeight();
            }
        });
        return array;
    }

    public final Rect nr(int offset) {
        s7N(offset);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.n(this.paragraphInfoList, offset));
        return paragraphInfo.xMQ(paragraphInfo.getParagraph().J2(paragraphInfo.r(offset)));
    }

    public final float o(int lineIndex) {
        v(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.rl(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().nr(paragraphInfo.o(lineIndex));
    }

    public final float qie(int lineIndex) {
        v(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.rl(this.paragraphInfoList, lineIndex));
        return paragraphInfo.HI(paragraphInfo.getParagraph().iF(paragraphInfo.o(lineIndex)));
    }

    public final float r(int lineIndex) {
        v(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.rl(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().t(paragraphInfo.o(lineIndex));
    }

    public final ResolvedTextDirection t(int offset) {
        int iN;
        wTp(offset);
        if (offset == rl().length()) {
            iN = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iN = MultiParagraphKt.n(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(iN);
        return paragraphInfo.getParagraph().te(paragraphInfo.r(offset));
    }

    public final int ty(int lineIndex, boolean visibleEnd) {
        v(lineIndex);
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(MultiParagraphKt.rl(this.paragraphInfoList, lineIndex));
        return paragraphInfo.az(paragraphInfo.getParagraph().ck(paragraphInfo.o(lineIndex), visibleEnd));
    }

    public final float xMQ(int offset, boolean usePrimaryDirection) {
        int iN;
        wTp(offset);
        if (offset == rl().length()) {
            iN = CollectionsKt.getLastIndex(this.paragraphInfoList);
        } else {
            iN = MultiParagraphKt.n(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) this.paragraphInfoList.get(iN);
        return paragraphInfo.getParagraph().XQ(paragraphInfo.r(offset), usePrimaryDirection);
    }
}
