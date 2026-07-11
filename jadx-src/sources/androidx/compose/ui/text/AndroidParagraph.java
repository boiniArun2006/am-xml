package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ[\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J*\u00107\u001a\u0002062\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002002\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010;J,\u0010@\u001a\u00020\u00192\u0006\u0010<\u001a\u0002062\u0006\u0010>\u001a\u00020=2\b\b\u0001\u0010?\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001f\u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u0002002\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010;J\u001d\u0010H\u001a\u0002062\u0006\u00109\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010LJ\u0017\u0010N\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010LJ\u0017\u0010O\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010LJ\u0017\u0010P\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010LJ\u0017\u0010Q\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bQ\u0010LJ\u0017\u0010R\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0014H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00142\u0006\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\bY\u0010SJ\u001f\u0010[\u001a\u00020(2\u0006\u00109\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0014H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020]2\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020]2\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b`\u0010_JH\u0010k\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010b\u001a\u00020a2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010f\u001a\u0004\u0018\u00010e2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010j\u001a\u00020iH\u0016ø\u0001\u0000¢\u0006\u0004\bk\u0010lJP\u0010p\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020(2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010f\u001a\u0004\u0018\u00010e2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010j\u001a\u00020iH\u0016ø\u0001\u0000¢\u0006\u0004\bp\u0010qR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010v\u001a\u0004\bw\u0010xR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010v\u001a\u0004\by\u0010xR\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bK\u0010z\u001a\u0004\b{\u0010|R\u0014\u0010\u007f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R%\u0010%\u001a\u00020$8\u0000X\u0081\u0004¢\u0006\u0017\n\u0005\b:\u0010\u0080\u0001\u0012\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0089\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001000\u0085\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b^\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008c\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008e\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0016\u0010\u008f\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\br\u0010\u008b\u0001R\u0016\u0010\u0090\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b}\u0010\u008b\u0001R\u0017\u0010\u0092\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u008b\u0001R\u0017\u0010\u0094\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u008b\u0001R\u0017\u0010\u0097\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010xR \u0010\u009e\u0001\u001a\u00030\u009a\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u009d\u0001\u0010\u0084\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009f\u0001"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "paragraphIntrinsics", "", "maxLines", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/android/TextLayout;", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "N", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "", "s7N", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "", "wTp", "(Landroidx/compose/ui/graphics/Canvas;)V", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "", "charSequence", "e", "(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Landroidx/compose/ui/text/android/TextLayout;", "", "vertical", "o", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "position", "az", "(J)I", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "Landroidx/compose/ui/text/TextRange;", "g", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "offset", "J2", "(I)Landroidx/compose/ui/geometry/Rect;", "range", "", "array", "arrayStart", "aYN", "(J[FI)V", TtmlNode.START, TtmlNode.END, "Landroidx/compose/ui/graphics/Path;", "Z", "(II)Landroidx/compose/ui/graphics/Path;", "xMQ", "gh", "(I)J", "lineIndex", "nr", "(I)F", "rl", "KN", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "iF", "t", "HI", "(I)I", "visibleEnd", "ck", "(IZ)I", "ty", "(I)Z", "nY", "usePrimaryDirection", "XQ", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "Uo", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "te", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "mUb", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "WPU", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", c.f62177j, "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "I", "getMaxLines", "()I", "getOverflow-gIe3tQ8", "J", "getConstraints-msEJaDk", "()J", "O", "Landroidx/compose/ui/text/android/TextLayout;", TtmlNode.TAG_LAYOUT, "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "", "Ljava/util/List;", "fD", "()Ljava/util/List;", "placeholderRects", "getWidth", "()F", "width", "getHeight", "height", "maxIntrinsicWidth", "minIntrinsicWidth", "qie", "firstBaseline", "ViF", "lastBaseline", "r", "()Z", "didExceedMaxLines", "Ik", "lineCount", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "nHg", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "textPaint", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n114#2,8:711\n114#2,8:719\n114#2,8:745\n114#2,8:754\n114#2,8:762\n33#3:727\n33#3:731\n33#3:770\n53#4,3:728\n53#4,3:732\n70#4:740\n60#4:743\n53#4,3:771\n11065#5:735\n11400#5,3:736\n69#6:739\n65#6:742\n22#7:741\n22#7:744\n1#8:753\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n139#1:711,8\n143#1:719,8\n389#1:745,8\n430#1:754,8\n440#1:762,8\n255#1:727\n259#1:731\n569#1:770\n255#1:728,3\n259#1:732,3\n361#1:740\n362#1:743\n569#1:771,3\n299#1:735\n299#1:736,3\n361#1:739\n362#1:742\n361#1:741\n362#1:744\n*E\n"})
public final class AndroidParagraph implements Paragraph {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final TextLayout layout;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final List placeholderRects;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidParagraphIntrinsics paragraphIntrinsics;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.f33908n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.f33909t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i2, int i3, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i2, i3, j2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect J2(int offset) {
        boolean z2 = false;
        if (offset >= 0 && offset < this.charSequence.length()) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.n("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ')');
        }
        RectF rectFT = this.layout.t(offset);
        return new Rect(rectFT.left, rectFT.top, rectFT.right, rectFT.bottom);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float XQ(int offset, boolean usePrimaryDirection) {
        return usePrimaryDirection ? TextLayout.te(this.layout, offset, false, 2, null) : TextLayout.E2(this.layout, offset, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float qie() {
        return T(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect xMQ(int offset) {
        if (!(offset >= 0 && offset <= this.charSequence.length())) {
            InlineClassHelperKt.n("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ']');
        }
        float fTe = TextLayout.te(this.layout, offset, false, 2, null);
        int iIk = this.layout.Ik(offset);
        return new Rect(fTe, this.layout.WPU(iIk), fTe, this.layout.qie(iIk));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i2, int i3, long j2) {
        TextStyle textStyle;
        ?? r2;
        int i5;
        TextUtils.TruncateAt truncateAt;
        TextLayout textLayoutX;
        int i7;
        int i8;
        ?? r12;
        ?? r02;
        ShaderBrushSpan[] shaderBrushSpanArrN;
        CharSequence charSequence;
        List listEmptyList;
        int i9;
        Rect rect;
        float fXQ;
        float fGh;
        int iRl;
        float fWPU;
        float fRl;
        float fGh2;
        ?? r03;
        int i10;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i2;
        this.overflow = i3;
        this.constraints = j2;
        if (!(Constraints.az(j2) == 0 && Constraints.ty(j2) == 0)) {
            InlineClassHelperKt.n("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (!(i2 >= 1)) {
            InlineClassHelperKt.n("maxLines should be greater than 0");
        }
        TextStyle textStyleXMQ = androidParagraphIntrinsics.getStyle();
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        CharSequence charSequenceMUb = AndroidParagraph_androidKt.qie(textStyleXMQ, TextOverflow.KN(i3, companion.rl())) ? AndroidParagraph_androidKt.mUb(androidParagraphIntrinsics.getCharSequence()) : androidParagraphIntrinsics.getCharSequence();
        this.charSequence = charSequenceMUb;
        int iAz = AndroidParagraph_androidKt.az(textStyleXMQ.nY());
        boolean zGh = TextAlign.gh(textStyleXMQ.nY(), TextAlign.INSTANCE.t());
        int iHI = AndroidParagraph_androidKt.HI(textStyleXMQ.getParagraphStyle().getHyphens());
        int iTy = AndroidParagraph_androidKt.ty(LineBreak.Uo(textStyleXMQ.r()));
        int iCk = AndroidParagraph_androidKt.ck(LineBreak.KN(textStyleXMQ.r()));
        int iIk = AndroidParagraph_androidKt.Ik(LineBreak.xMQ(textStyleXMQ.r()));
        if (TextOverflow.KN(i3, companion.rl())) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (TextOverflow.KN(i3, companion.t())) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else {
            if (!TextOverflow.KN(i3, companion.nr())) {
                textStyle = textStyleXMQ;
                r2 = zGh;
                i5 = iCk;
                truncateAt = null;
                CharSequence charSequence2 = charSequenceMUb;
                int i11 = 2;
                textLayoutX = X(this, iAz, r2, truncateAt, i2, iHI, iTy, i5, iIk, null, 256, null);
                if (Build.VERSION.SDK_INT < 35 || nHg().getLetterSpacing() == 0.0f || (!(TextOverflow.KN(i3, companion.nr()) || TextOverflow.KN(i3, companion.t())) || textLayoutX.ty(0) <= 0)) {
                    i7 = i2;
                    i8 = 1;
                } else {
                    int iHI2 = textLayoutX.HI(0);
                    i8 = 1;
                    i7 = i2;
                    textLayoutX = e(iAz, r2, truncateAt, i7, iHI, iTy, i5, iIk, TextUtils.concat(charSequence2.subSequence(0, iHI2), "…", charSequence2.subSequence(textLayoutX.ty(0) + iHI2, charSequence2.length())));
                }
                if (TextOverflow.KN(i3, companion.rl()) || textLayoutX.J2() <= Constraints.gh(j2) || i7 <= i8) {
                    ?? r04 = this;
                    r12 = i8;
                    r04.layout = textLayoutX;
                    r02 = r04;
                } else {
                    int iGh = AndroidParagraph_androidKt.gh(textLayoutX, Constraints.gh(j2));
                    if (iGh < 0 || iGh == i7) {
                        r03 = this;
                        i10 = i8;
                    } else {
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(iGh, i8);
                        ?? r05 = this;
                        i10 = i8;
                        textLayoutX = X(r05, iAz, r2, truncateAt, iCoerceAtLeast, iHI, iTy, i5, iIk, null, 256, null);
                        r03 = r05;
                    }
                    r03.layout = textLayoutX;
                    r02 = r03;
                    r12 = i10;
                }
                r02.nHg().O(textStyle.Uo(), Size.nr((((long) Float.floatToRawIntBits(r02.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(r02.getWidth())) << 32)), textStyle.nr());
                shaderBrushSpanArrN = r02.N(r02.layout);
                if (shaderBrushSpanArrN != null) {
                    Iterator it = ArrayIteratorKt.iterator(shaderBrushSpanArrN);
                    while (it.hasNext()) {
                        ((ShaderBrushSpan) it.next()).t(Size.nr((((long) Float.floatToRawIntBits(r02.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(r02.getWidth())) << 32)));
                    }
                }
                charSequence = r02.charSequence;
                if (charSequence instanceof Spanned) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    Spanned spanned = (Spanned) charSequence;
                    Object[] spans = spanned.getSpans(0, charSequence.length(), PlaceholderSpan.class);
                    ArrayList arrayList = new ArrayList(spans.length);
                    int length = spans.length;
                    int i12 = 0;
                    while (i12 < length) {
                        PlaceholderSpan placeholderSpan = (PlaceholderSpan) spans[i12];
                        int spanStart = spanned.getSpanStart(placeholderSpan);
                        int spanEnd = spanned.getSpanEnd(placeholderSpan);
                        int iIk2 = r02.layout.Ik(spanStart);
                        ?? r10 = iIk2 >= r02.maxLines ? r12 : 0;
                        ?? r11 = (r02.layout.ty(iIk2) <= 0 || spanEnd <= r02.layout.HI(iIk2)) ? 0 : r12;
                        ?? r8 = spanEnd > r02.layout.ck(iIk2) ? r12 : 0;
                        if (r11 == 0 && r8 == 0 && r10 == 0) {
                            int i13 = WhenMappings.$EnumSwitchMapping$0[r02.te(spanStart).ordinal()];
                            if (i13 == r12) {
                                fXQ = r02.XQ(spanStart, r12);
                            } else {
                                if (i13 != i11) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fXQ = r02.XQ(spanStart, r12) - placeholderSpan.nr();
                            }
                            float fNr = placeholderSpan.nr() + fXQ;
                            TextLayout textLayout = r02.layout;
                            switch (placeholderSpan.getVerticalAlign()) {
                                case 0:
                                    i9 = 2;
                                    fGh = textLayout.gh(iIk2);
                                    iRl = placeholderSpan.rl();
                                    fWPU = fGh - iRl;
                                    rect = new Rect(fXQ, fWPU, fNr, placeholderSpan.rl() + fWPU);
                                    break;
                                case 1:
                                    i9 = 2;
                                    fWPU = textLayout.WPU(iIk2);
                                    rect = new Rect(fXQ, fWPU, fNr, placeholderSpan.rl() + fWPU);
                                    break;
                                case 2:
                                    i9 = 2;
                                    fGh = textLayout.qie(iIk2);
                                    iRl = placeholderSpan.rl();
                                    fWPU = fGh - iRl;
                                    rect = new Rect(fXQ, fWPU, fNr, placeholderSpan.rl() + fWPU);
                                    break;
                                case 3:
                                    i9 = 2;
                                    fWPU = ((textLayout.WPU(iIk2) + textLayout.qie(iIk2)) - placeholderSpan.rl()) / 2;
                                    rect = new Rect(fXQ, fWPU, fNr, placeholderSpan.rl() + fWPU);
                                    break;
                                case 4:
                                    fRl = placeholderSpan.n().ascent;
                                    fGh2 = textLayout.gh(iIk2);
                                    fWPU = fRl + fGh2;
                                    i9 = 2;
                                    rect = new Rect(fXQ, fWPU, fNr, placeholderSpan.rl() + fWPU);
                                    break;
                                case 5:
                                    fWPU = (placeholderSpan.n().descent + textLayout.gh(iIk2)) - placeholderSpan.rl();
                                    i9 = 2;
                                    rect = new Rect(fXQ, fWPU, fNr, placeholderSpan.rl() + fWPU);
                                    break;
                                case 6:
                                    Paint.FontMetricsInt fontMetricsIntN = placeholderSpan.n();
                                    fRl = ((fontMetricsIntN.ascent + fontMetricsIntN.descent) - placeholderSpan.rl()) / 2;
                                    fGh2 = textLayout.gh(iIk2);
                                    fWPU = fRl + fGh2;
                                    i9 = 2;
                                    rect = new Rect(fXQ, fWPU, fNr, placeholderSpan.rl() + fWPU);
                                    break;
                                default:
                                    throw new IllegalStateException("unexpected verticalAlignment");
                            }
                        } else {
                            i9 = i11;
                            rect = null;
                        }
                        arrayList.add(rect);
                        i12 += r12;
                        i11 = i9;
                    }
                    listEmptyList = arrayList;
                }
                r02.placeholderRects = listEmptyList;
            }
            truncateAt = TextUtils.TruncateAt.START;
        }
        textStyle = textStyleXMQ;
        r2 = zGh;
        i5 = iCk;
        CharSequence charSequence22 = charSequenceMUb;
        int i112 = 2;
        textLayoutX = X(this, iAz, r2, truncateAt, i2, iHI, iTy, i5, iIk, null, 256, null);
        if (Build.VERSION.SDK_INT < 35) {
            i7 = i2;
            i8 = 1;
        }
        if (TextOverflow.KN(i3, companion.rl())) {
            ?? r042 = this;
            r12 = i8;
            r042.layout = textLayoutX;
            r02 = r042;
        }
        r02.nHg().O(textStyle.Uo(), Size.nr((((long) Float.floatToRawIntBits(r02.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(r02.getWidth())) << 32)), textStyle.nr());
        shaderBrushSpanArrN = r02.N(r02.layout);
        if (shaderBrushSpanArrN != null) {
        }
        charSequence = r02.charSequence;
        if (charSequence instanceof Spanned) {
        }
        r02.placeholderRects = listEmptyList;
    }

    static /* synthetic */ TextLayout X(AndroidParagraph androidParagraph, int i2, int i3, TextUtils.TruncateAt truncateAt, int i5, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11, Object obj) {
        return androidParagraph.e(i2, i3, truncateAt, i5, i7, i8, i9, i10, (i11 & 256) != 0 ? androidParagraph.charSequence : charSequence);
    }

    private final TextLayout e(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, CharSequence charSequence) {
        return new TextLayout(charSequence, getWidth(), nHg(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.rl(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int HI(int lineIndex) {
        return this.layout.S(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int Ik() {
        return this.layout.getLineCount();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float KN(int lineIndex) {
        return this.layout.WPU(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float O() {
        return this.paragraphIntrinsics.O();
    }

    public float T(int lineIndex) {
        return this.layout.gh(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection Uo(int offset) {
        return this.layout.nY(this.layout.Ik(offset)) == 1 ? ResolvedTextDirection.f33908n : ResolvedTextDirection.f33909t;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Path Z(int start, int end) {
        if (!(start >= 0 && start <= end && end <= this.charSequence.length())) {
            InlineClassHelperKt.n("start(" + start + ") or end(" + end + ") is out of range [0.." + this.charSequence.length() + "], or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.e(start, end, path);
        return AndroidPath_androidKt.t(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public void aYN(long range, float[] array, int arrayStart) {
        this.layout.n(TextRange.qie(range), TextRange.gh(range), array, arrayStart);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int az(long position) {
        return this.layout.ViF(this.layout.r((int) Float.intBitsToFloat((int) (4294967295L & position))), Float.intBitsToFloat((int) (position >> 32)));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int ck(int lineIndex, boolean visibleEnd) {
        return visibleEnd ? this.layout.aYN(lineIndex) : this.layout.ck(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: fD, reason: from getter */
    public List getPlaceholderRects() {
        return this.placeholderRects;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public long g(Rect rect, int granularity, final TextInclusionStrategy inclusionStrategy) {
        int[] iArrIF = this.layout.iF(RectHelper_androidKt.t(rect), AndroidParagraph_androidKt.r(granularity), new Function2<RectF, RectF, Boolean>() { // from class: androidx.compose.ui.text.AndroidParagraph$getRangeForRect$range$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(RectF rectF, RectF rectF2) {
                return Boolean.valueOf(inclusionStrategy.n(RectHelper_androidKt.J2(rectF), RectHelper_androidKt.J2(rectF2)));
            }
        });
        return iArrIF == null ? TextRange.INSTANCE.n() : TextRangeKt.rl(iArrIF[0], iArrIF[1]);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.J2();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.qie(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public long gh(int offset) {
        WordIterator wordIteratorN = this.layout.N();
        return TextRangeKt.rl(WordBoundary_androidKt.rl(wordIteratorN, offset), WordBoundary_androidKt.n(wordIteratorN, offset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float iF(int lineIndex) {
        return this.layout.qie(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float n() {
        return this.paragraphIntrinsics.n();
    }

    public final AndroidTextPaint nHg() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int nY(int offset) {
        return this.layout.Ik(offset);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float nr(int lineIndex) {
        return this.layout.Z(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int o(float vertical) {
        return this.layout.r((int) vertical);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean r() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float rl(int lineIndex) {
        return this.layout.XQ(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float t(int lineIndex) {
        return this.layout.o(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection te(int offset) {
        return this.layout.wTp(offset) ? ResolvedTextDirection.f33909t : ResolvedTextDirection.f33908n;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean ty(int lineIndex) {
        return this.layout.s7N(lineIndex);
    }

    private final ShaderBrushSpan[] N(TextLayout textLayout) {
        if (!(textLayout.X() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceX = textLayout.X();
        Intrinsics.checkNotNull(charSequenceX, "null cannot be cast to non-null type android.text.Spanned");
        if (!s7N((Spanned) charSequenceX, ShaderBrushSpan.class)) {
            return null;
        }
        CharSequence charSequenceX2 = textLayout.X();
        Intrinsics.checkNotNull(charSequenceX2, "null cannot be cast to non-null type android.text.Spanned");
        return (ShaderBrushSpan[]) ((Spanned) charSequenceX2).getSpans(0, textLayout.X().length(), ShaderBrushSpan.class);
    }

    private final boolean s7N(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    private final void wTp(Canvas canvas) {
        android.graphics.Canvas canvasNr = AndroidCanvas_androidKt.nr(canvas);
        if (r()) {
            canvasNr.save();
            canvasNr.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.v(canvasNr);
        if (r()) {
            canvasNr.restore();
        }
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float ViF() {
        return T(Ik() - 1);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public void WPU(Canvas canvas, Brush brush, float alpha, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int blendMode) {
        int backingBlendMode = nHg().getBackingBlendMode();
        AndroidTextPaint androidTextPaintNHg = nHg();
        float width = getWidth();
        androidTextPaintNHg.O(brush, Size.nr((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), alpha);
        androidTextPaintNHg.KN(shadow);
        androidTextPaintNHg.xMQ(textDecoration);
        androidTextPaintNHg.Uo(drawStyle);
        androidTextPaintNHg.nr(blendMode);
        wTp(canvas);
        nHg().nr(backingBlendMode);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public void mUb(Canvas canvas, long color, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int blendMode) {
        int backingBlendMode = nHg().getBackingBlendMode();
        AndroidTextPaint androidTextPaintNHg = nHg();
        androidTextPaintNHg.J2(color);
        androidTextPaintNHg.KN(shadow);
        androidTextPaintNHg.xMQ(textDecoration);
        androidTextPaintNHg.Uo(drawStyle);
        androidTextPaintNHg.nr(blendMode);
        wTp(canvas);
        nHg().nr(backingBlendMode);
    }
}
