package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001qB3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u0014J;\u0010$\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u001a\b\u0002\u0010#\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020!0 j\u0002`\"\u0018\u00010\u001fH\u0000¢\u0006\u0004\b$\u0010%J*\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0010H\u0000¢\u0006\u0004\b)\u0010\u0014J%\u0010,\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J;\u00100\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010.\u001a\u00020\f2\b\b\u0002\u0010/\u001a\u00020\fH\u0000¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u00020*H\u0000¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00060\u0001j\u0002`\u00022\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b5\u00106J-\u00105\u001a\u00060\u0001j\u0002`\u00022\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b5\u00107J\u001b\u00105\u001a\u00060\u0001j\u0002`\u00022\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b5\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020*¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u0010¢\u0006\u0004\b@\u0010\u0014JD\u0010D\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00152\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00152\u001a\b\u0002\u0010C\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020!0 j\u0002`\"\u0018\u00010\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010IR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001c\u0010R\u001a\u00020\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010QR4\u0010B\u001a\u0004\u0018\u00010\u00152\b\u0010S\u001a\u0004\u0018\u00010\u00158\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b@\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR@\u0010C\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0018\u00010Y2\u0014\u0010Z\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0018\u00010Y8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b$\u0010[\u001a\u0004\b\\\u0010]R@\u0010b\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0015\u0018\u00010^2\u0014\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0015\u0018\u00010^8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bW\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010cR\u0011\u0010g\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u001a\u0010k\u001a\u00020h8FX\u0087\u0004¢\u0006\f\u0012\u0004\bj\u0010\u0014\u001a\u0004\bN\u0010iR\u0011\u0010m\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\bl\u0010\u001bR*\u0010A\u001a\u00020\u00152\u0006\u0010S\u001a\u00020\u00158F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialValue", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "initialChanges", "originalValue", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "offsetMappingCalculator", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/ChangeTracker;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "", "replaceStart", "replaceEnd", "newLength", "", "HI", "(III)V", "rl", "()V", "Landroidx/compose/ui/text/TextRange;", "range", "r", "(J)V", "", "az", "()Z", "nr", TtmlNode.START, TtmlNode.END, "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "annotations", "Z", "(IILjava/util/List;)V", "Landroidx/compose/foundation/text/input/TextHighlightType;", "type", "WPU", "t", "", "text", "ck", "(IILjava/lang/CharSequence;)V", "textStart", "textEnd", "Ik", "(IILjava/lang/CharSequence;II)V", "newText", "ViF", "(Ljava/lang/CharSequence;)V", "append", "(Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "", "char", "(C)Ljava/lang/Appendable;", "", "toString", "()Ljava/lang/String;", c.f62177j, "()Ljava/lang/CharSequence;", "o", "selection", "composition", "composingAnnotations", "nY", "(JLandroidx/compose/ui/text/TextRange;Ljava/util/List;)Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "gh", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "O", "Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", V8ValueTypedArray.PROPERTY_BUFFER, "J2", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "backingChangeTracker", "J", "selectionInChars", "value", "Landroidx/compose/ui/text/TextRange;", "KN", "()Landroidx/compose/ui/text/TextRange;", "S", "(Landroidx/compose/ui/text/TextRange;)V", "Landroidx/compose/runtime/collection/MutableVector;", "<set-?>", "Landroidx/compose/runtime/collection/MutableVector;", "Uo", "()Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Pair;", "Lkotlin/Pair;", "xMQ", "()Lkotlin/Pair;", "highlight", "()Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "changeTracker", "mUb", "()I", "length", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "()Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "getChanges$annotations", "changes", "ty", "hasSelection", "qie", "()J", "aYN", "ChangeList", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,721:1\n1#2:722\n1095#3,3:723\n1101#3:726\n1083#3,2:727\n34#4,6:729\n96#5,5:735\n96#5,5:740\n96#5,5:790\n96#5,5:795\n666#6,45:745\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n*L\n168#1:723,3\n220#1:726\n220#1:727,2\n222#1:729,6\n306#1:735,5\n307#1:740,5\n465#1:790,5\n470#1:795,5\n322#1:745,45\n*E\n"})
public final class TextFieldBuffer implements Appendable {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private ChangeTracker backingChangeTracker;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final PartialGapBuffer buffer;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Pair highlight;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private MutableVector composingAnnotations;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TextFieldCharSequence originalValue;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private TextRange composition;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long selectionInChars;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final OffsetMappingCalculator offsetMappingCalculator;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "", "", "changeIndex", "Landroidx/compose/ui/text/TextRange;", "t", "(I)J", c.f62177j, "rl", "()I", "changeCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ChangeList {
        long n(int changeIndex);

        int rl();

        long t(int changeIndex);
    }

    public TextFieldBuffer(final TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator) {
        this.originalValue = textFieldCharSequence2;
        this.offsetMappingCalculator = offsetMappingCalculator;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        MutableVector mutableVector = null;
        this.backingChangeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.getSelection();
        this.composition = textFieldCharSequence.getComposition();
        List composingAnnotations = textFieldCharSequence.getComposingAnnotations();
        if (composingAnnotations != null && !composingAnnotations.isEmpty()) {
            int size = textFieldCharSequence.getComposingAnnotations().size();
            Function1<Integer, AnnotatedString.Range<AnnotatedString.Annotation>> function1 = new Function1<Integer, AnnotatedString.Range<AnnotatedString.Annotation>>() { // from class: androidx.compose.foundation.text.input.TextFieldBuffer$composingAnnotations$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ AnnotatedString.Range<AnnotatedString.Annotation> invoke(Integer num) {
                    return n(num.intValue());
                }

                public final AnnotatedString.Range n(int i2) {
                    return (AnnotatedString.Range) textFieldCharSequence.getComposingAnnotations().get(i2);
                }
            };
            AnnotatedString.Range[] rangeArr = new AnnotatedString.Range[size];
            for (int i2 = 0; i2 < size; i2++) {
                rangeArr[i2] = function1.invoke(Integer.valueOf(i2));
            }
            mutableVector = new MutableVector(rangeArr, size);
        }
        this.composingAnnotations = mutableVector;
    }

    private final void r(long range) {
        long jRl = TextRangeKt.rl(0, mUb());
        if (TextRange.nr(jRl, range)) {
            return;
        }
        InlineClassHelperKt.n("Expected " + ((Object) TextRange.Ik(range)) + " to be in " + ((Object) TextRange.Ik(jRl)));
    }

    public final void Ik(int start, int end, CharSequence text, int textStart, int textEnd) {
        if (!(start <= end)) {
            InlineClassHelperKt.n("Expected start=" + start + " <= end=" + end);
        }
        if (!(textStart <= textEnd)) {
            InlineClassHelperKt.n("Expected textStart=" + textStart + " <= textEnd=" + textEnd);
        }
        HI(start, end, textEnd - textStart);
        this.buffer.t(start, end, text, textStart, textEnd);
        nr();
        t();
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence text) {
        if (text != null) {
            HI(mUb(), mUb(), text.length());
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.nr(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), text, 0, 0, 24, null);
        }
        return this;
    }

    public final void nr() {
        S(null);
    }

    public final void t() {
        this.highlight = null;
    }

    private final void S(TextRange textRange) {
        if (textRange != null && !TextRange.KN(textRange.getPackedValue())) {
            this.composition = textRange;
            return;
        }
        this.composition = null;
        MutableVector mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.KN();
        }
    }

    public static /* synthetic */ void XQ(TextFieldBuffer textFieldBuffer, int i2, int i3, List list, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            list = null;
        }
        textFieldBuffer.Z(i2, i3, list);
    }

    public static /* synthetic */ TextFieldCharSequence g(TextFieldBuffer textFieldBuffer, long j2, TextRange textRange, List list, int i2, Object obj) {
        MutableVector mutableVector;
        if ((i2 & 1) != 0) {
            j2 = textFieldBuffer.getSelectionInChars();
        }
        if ((i2 & 2) != 0) {
            textRange = textFieldBuffer.composition;
        }
        if ((i2 & 4) != 0 && ((mutableVector = textFieldBuffer.composingAnnotations) == null || (list = mutableVector.Uo()) == null || list.isEmpty())) {
            list = null;
        }
        return textFieldBuffer.nY(j2, textRange, list);
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final TextRange getComposition() {
        return this.composition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ChangeTracker O() {
        ChangeTracker changeTracker = this.backingChangeTracker;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
        this.backingChangeTracker = changeTracker2;
        return changeTracker2;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final MutableVector getComposingAnnotations() {
        return this.composingAnnotations;
    }

    public final void ViF(CharSequence newText) {
        int i2;
        int i3;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = newText.length();
        boolean z2 = false;
        if (partialGapBuffer.length() <= 0 || newText.length() <= 0) {
            i2 = 0;
            i3 = 0;
        } else {
            int i5 = 0;
            int i7 = 0;
            boolean z3 = false;
            while (true) {
                if (!z2) {
                    if (partialGapBuffer.charAt(i5) == newText.charAt(i7)) {
                        i5++;
                        i7++;
                    } else {
                        z2 = true;
                    }
                }
                if (!z3) {
                    if (partialGapBuffer.charAt(length - 1) == newText.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z3 = true;
                    }
                }
                if (i5 >= length || i7 >= length2 || (z2 && z3)) {
                    break;
                }
            }
            i2 = i5;
            i3 = i7;
        }
        int i8 = length;
        int i9 = length2;
        if (i2 < i8 || i3 < i9) {
            Ik(i2, i8, newText, i3, i9);
        }
    }

    public final void WPU(int type, int start, int end) {
        if (start < end) {
            this.highlight = new Pair(TextHighlightType.t(type), TextRange.rl(TextRangeKt.rl(RangesKt.coerceIn(start, 0, mUb()), RangesKt.coerceIn(end, 0, mUb()))));
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
        }
    }

    public final void Z(int start, int end, List annotations) {
        if (start < 0 || start > this.buffer.length()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.buffer.length());
        }
        if (end < 0 || end > this.buffer.length()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.buffer.length());
        }
        if (start >= end) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
        }
        S(TextRange.rl(TextRangeKt.rl(start, end)));
        MutableVector mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.KN();
        }
        if (annotations == null || annotations.isEmpty()) {
            return;
        }
        if (this.composingAnnotations == null) {
            this.composingAnnotations = new MutableVector(new AnnotatedString.Range[16], 0);
        }
        int size = annotations.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) annotations.get(i2);
            MutableVector mutableVector2 = this.composingAnnotations;
            if (mutableVector2 != null) {
                mutableVector2.rl(AnnotatedString.Range.O(range, null, range.getStart() + start, range.getEnd() + start, null, 9, null));
            }
        }
    }

    public final boolean az() {
        return this.composition != null;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final TextFieldCharSequence getOriginalValue() {
        return this.originalValue;
    }

    public final int mUb() {
        return this.buffer.length();
    }

    public final CharSequence n() {
        return this.buffer;
    }

    public final TextFieldCharSequence nY(long selection, TextRange composition, List composingAnnotations) {
        return new TextFieldCharSequence(this.buffer.toString(), selection, composition, null, composingAnnotations, 8, null);
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final long getSelectionInChars() {
        return this.selectionInChars;
    }

    public String toString() {
        return this.buffer.toString();
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final Pair getHighlight() {
        return this.highlight;
    }

    private final void HI(int replaceStart, int replaceEnd, int newLength) {
        O().J2(replaceStart, replaceEnd, newLength);
        OffsetMappingCalculator offsetMappingCalculator = this.offsetMappingCalculator;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.O(replaceStart, replaceEnd, newLength);
        }
        this.selectionInChars = TextFieldBufferKt.n(getSelectionInChars(), replaceStart, replaceEnd, newLength);
    }

    private final void rl() {
        O().O();
    }

    public final ChangeList J2() {
        return O();
    }

    public final void aYN(long j2) {
        r(j2);
        this.selectionInChars = j2;
        this.highlight = null;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence text, int start, int end) {
        if (text != null) {
            HI(mUb(), mUb(), end - start);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.nr(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), text.subSequence(start, end), 0, 0, 24, null);
        }
        return this;
    }

    public final void ck(int start, int end, CharSequence text) {
        Ik(start, end, text, 0, text.length());
    }

    public final void o() {
        ck(0, mUb(), this.originalValue.toString());
        aYN(this.originalValue.getSelection());
        rl();
    }

    public final boolean ty() {
        return !TextRange.KN(getSelectionInChars());
    }

    @Override // java.lang.Appendable
    public Appendable append(char c2) {
        HI(mUb(), mUb(), 1);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.nr(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), String.valueOf(c2), 0, 0, 24, null);
        return this;
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldCharSequence, (i2 & 2) != 0 ? null : changeTracker, (i2 & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2, (i2 & 8) != 0 ? null : offsetMappingCalculator);
    }
}
