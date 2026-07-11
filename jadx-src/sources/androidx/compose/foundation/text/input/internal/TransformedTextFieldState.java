package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 12\u00020\u0001:\u0002ghB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J \u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\r¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\r¢\u0006\u0004\b&\u0010%J4\u0010,\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010'\u001a\u00020\u00162\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*ø\u0001\u0000¢\u0006\u0004\b,\u0010-J3\u0010/\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010.\u001a\u00020*2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b1\u0010%J\r\u00102\u001a\u00020\r¢\u0006\u0004\b2\u0010%J\r\u00103\u001a\u00020\r¢\u0006\u0004\b3\u0010%J\r\u00104\u001a\u00020\r¢\u0006\u0004\b4\u0010%J\u0018\u00105\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001b\u00108\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0012ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b:\u00106J\u0018\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020;H\u0086@¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0012H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001e\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010Q\u0018\u00010P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001e\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010Q\u0018\u00010P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR+\u0010^\u001a\u00020W2\u0006\u0010X\u001a\u00020W8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0011\u0010b\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0011\u0010d\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\bc\u0010aR\u0011\u0010f\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\be\u0010a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "outputTransformation", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "X", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "e", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "", "transformedOffset", "Z", "(I)V", "Landroidx/compose/ui/text/TextRange;", "transformedRange", "te", "(J)V", "untransformedRange", "iF", "Landroidx/compose/foundation/text/input/TextHighlightType;", "type", "ck", "(IJ)V", "", "newText", "S", "(Ljava/lang/CharSequence;)V", "g", "()V", "gh", "range", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "undoBehavior", "", "restartImeIfContentChanges", "ViF", "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Z)V", "clearComposition", "WPU", "(Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Z)V", "KN", "Uo", "E2", "XQ", "o", "(J)J", "offset", "Ik", "(I)J", "r", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "notifyImeListener", "", "xMQ", "(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/foundation/text/input/TextFieldState;", "rl", "Landroidx/compose/foundation/text/input/InputTransformation;", "t", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "nr", "Landroidx/compose/foundation/text/input/OutputTransformation;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "O", "Landroidx/compose/runtime/State;", "outputTransformedText", "J2", "codepointTransformedText", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "az", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "fD", "(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)V", "selectionWedgeAffinity", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "ty", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "untransformedText", "qie", "outputText", "HI", "visualText", "Companion", "TransformedText", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n85#2:747\n113#2,2:748\n254#3,15:750\n254#3,15:765\n254#3,15:780\n254#3,15:795\n254#3,15:810\n260#3,9:825\n260#3,9:834\n254#3,15:843\n254#3,15:858\n254#3,15:873\n1#4:888\n314#5,11:889\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n*L\n175#1:747\n175#1:748,2\n199#1:750,15\n206#1:765,15\n213#1:780,15\n221#1:795,15\n225#1:810,15\n246#1:825,9\n265#1:834,9\n284#1:843,15\n291#1:858,15\n320#1:873,15\n457#1:889,11\n*E\n"})
public final class TransformedTextFieldState {
    private static final Companion KN = new Companion(null);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final State codepointTransformedText;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final State outputTransformedText;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableState selectionWedgeAffinity;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextFieldState textFieldState;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final OutputTransformation outputTransformation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private InputTransformation inputTransformation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final CodepointTransformation codepointTransformation;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "untransformedValue", "Landroidx/compose/foundation/text/input/OutputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "O", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "J2", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "Landroidx/compose/ui/text/TextRange;", "range", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "mapping", "selectionWedgeAffinity", "KN", "(JLandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)J", "Uo", "(JLandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
    static final class Companion {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[WedgeAffinity.f20375n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WedgeAffinity.f20376t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TransformedText J2(TextFieldCharSequence untransformedValue, CodepointTransformation codepointTransformation, SelectionWedgeAffinity wedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence charSequenceN = CodepointTransformationKt.n(untransformedValue, codepointTransformation, offsetMappingCalculator);
            TextRange textRangeRl = null;
            if (charSequenceN == untransformedValue) {
                return null;
            }
            long jKN = KN(untransformedValue.getSelection(), offsetMappingCalculator, wedgeAffinity);
            TextRange composition = untransformedValue.getComposition();
            if (composition != null) {
                textRangeRl = TextRange.rl(TransformedTextFieldState.KN.KN(composition.getPackedValue(), offsetMappingCalculator, wedgeAffinity));
            }
            return new TransformedText(new TextFieldCharSequence(charSequenceN, jKN, textRangeRl, null, null, 24, null), offsetMappingCalculator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TransformedText O(TextFieldCharSequence untransformedValue, OutputTransformation outputTransformation, SelectionWedgeAffinity wedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            TextFieldBuffer textFieldBuffer = new TextFieldBuffer(untransformedValue, null, null, offsetMappingCalculator, 6, null);
            outputTransformation.n(textFieldBuffer);
            TextRange textRangeRl = null;
            if (textFieldBuffer.J2().rl() == 0) {
                return null;
            }
            long jKN = KN(untransformedValue.getSelection(), offsetMappingCalculator, wedgeAffinity);
            TextRange composition = untransformedValue.getComposition();
            if (composition != null) {
                textRangeRl = TextRange.rl(TransformedTextFieldState.KN.KN(composition.getPackedValue(), offsetMappingCalculator, wedgeAffinity));
            }
            return new TransformedText(TextFieldBuffer.g(textFieldBuffer, jKN, textRangeRl, null, 4, null), offsetMappingCalculator);
        }

        static /* synthetic */ long xMQ(Companion companion, long j2, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                selectionWedgeAffinity = null;
            }
            return companion.KN(j2, offsetMappingCalculator, selectionWedgeAffinity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long KN(long range, OffsetMappingCalculator mapping, SelectionWedgeAffinity selectionWedgeAffinity) {
            long jT2;
            WedgeAffinity startAffinity;
            long jN;
            long jT3 = mapping.t(TextRange.ty(range));
            if (TextRange.KN(range)) {
                jT2 = jT3;
            } else {
                jT2 = mapping.t(TextRange.xMQ(range));
            }
            WedgeAffinity endAffinity = null;
            if (selectionWedgeAffinity != null) {
                startAffinity = selectionWedgeAffinity.getStartAffinity();
            } else {
                startAffinity = null;
            }
            if (TextRange.KN(range)) {
                endAffinity = startAffinity;
            } else if (selectionWedgeAffinity != null) {
                endAffinity = selectionWedgeAffinity.getEndAffinity();
            }
            if (startAffinity != null && !TextRange.KN(jT3)) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[startAffinity.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        jT3 = TextRangeKt.n(TextRange.xMQ(jT3));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    jT3 = TextRangeKt.n(TextRange.ty(jT3));
                }
            }
            if (endAffinity != null && !TextRange.KN(jT2)) {
                int i3 = WhenMappings.$EnumSwitchMapping$0[endAffinity.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        jN = TextRangeKt.n(TextRange.xMQ(jT2));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    jN = TextRangeKt.n(TextRange.ty(jT2));
                }
                jT2 = jN;
            }
            int iMin = Math.min(TextRange.qie(jT3), TextRange.qie(jT2));
            int iMax = Math.max(TextRange.gh(jT3), TextRange.gh(jT2));
            if (TextRange.az(range)) {
                return TextRangeKt.rl(iMax, iMin);
            }
            return TextRangeKt.rl(iMin, iMax);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long Uo(long range, OffsetMappingCalculator mapping) {
            long jRl;
            long jRl2 = mapping.rl(TextRange.ty(range));
            if (TextRange.KN(range)) {
                jRl = jRl2;
            } else {
                jRl = mapping.rl(TextRange.xMQ(range));
            }
            int iMin = Math.min(TextRange.qie(jRl2), TextRange.qie(jRl));
            int iMax = Math.max(TextRange.gh(jRl2), TextRange.gh(jRl));
            if (TextRange.az(range)) {
                return TextRangeKt.rl(iMax, iMin);
            }
            return TextRangeKt.rl(iMin, iMax);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "text", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "offsetMapping", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "rl", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "()Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final /* data */ class TransformedText {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextFieldCharSequence text;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final OffsetMappingCalculator offsetMapping;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) other;
            return Intrinsics.areEqual(this.text, transformedText.text) && Intrinsics.areEqual(this.offsetMapping, transformedText.offsetMapping);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
        }

        public String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final TextFieldCharSequence getText() {
            return this.text;
        }

        public TransformedText(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }
    }

    public static /* synthetic */ void aYN(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        }
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        transformedTextFieldState.WPU(charSequence, z2, textFieldEditUndoBehavior, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(TextFieldState.NotifyImeListener notifyImeListener, TransformedTextFieldState transformedTextFieldState, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
        TextFieldCharSequence text;
        TransformedText transformedTextO = KN.O(textFieldCharSequence, transformedTextFieldState.outputTransformation, transformedTextFieldState.az());
        if (transformedTextO != null && (text = transformedTextO.getText()) != null) {
            textFieldCharSequence = text;
        }
        notifyImeListener.n(textFieldCharSequence, transformedTextFieldState.HI(), z2);
    }

    public static /* synthetic */ void nY(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j2, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        }
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = textFieldEditUndoBehavior;
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        transformedTextFieldState.ViF(charSequence, j2, textFieldEditUndoBehavior2, z2);
    }

    public final void E2() {
        this.textFieldState.getUndoState().rl();
    }

    public final TextFieldCharSequence HI() {
        TransformedText transformedText;
        TextFieldCharSequence text;
        State state = this.codepointTransformedText;
        return (state == null || (transformedText = (TransformedText) state.getValue()) == null || (text = transformedText.getText()) == null) ? qie() : text;
    }

    public final long Ik(int offset) {
        TransformedText transformedText;
        TransformedText transformedText2;
        State state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (transformedText2 = (TransformedText) state.getValue()) == null) ? null : transformedText2.getOffsetMapping();
        State state2 = this.codepointTransformedText;
        if (state2 != null && (transformedText = (TransformedText) state2.getValue()) != null) {
            offsetMapping = transformedText.getOffsetMapping();
        }
        long jRl = offsetMapping != null ? offsetMapping.rl(offset) : TextRangeKt.n(offset);
        return offsetMapping2 != null ? KN.Uo(jRl, offsetMapping2) : jRl;
    }

    public final void KN() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        textFieldState.getMainBuffer().O().O();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        TextFieldBufferKt.nr(mainBuffer, TextRange.gh(mainBuffer.getSelectionInChars()), 0, 2, null);
        textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void S(CharSequence newText) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        textFieldState.getMainBuffer().O().O();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        TextFieldBufferKt.rl(mainBuffer, 0, mainBuffer.mUb());
        mainBuffer.append(newText.toString());
        X(mainBuffer);
        textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void Uo() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        textFieldState.getMainBuffer().O().O();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        TextFieldBufferKt.nr(mainBuffer, TextRange.xMQ(mainBuffer.getSelectionInChars()), 0, 2, null);
        textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void ViF(CharSequence newText, long range, TextFieldEditUndoBehavior undoBehavior, boolean restartImeIfContentChanges) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer().O().O();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        long jR = r(range);
        mainBuffer.ck(TextRange.qie(jR), TextRange.gh(jR), newText);
        TextFieldBufferKt.nr(mainBuffer, TextRange.qie(jR) + newText.length(), 0, 2, null);
        X(mainBuffer);
        textFieldState.O(inputTransformation, restartImeIfContentChanges, undoBehavior);
    }

    public final void WPU(CharSequence newText, boolean clearComposition, TextFieldEditUndoBehavior undoBehavior, boolean restartImeIfContentChanges) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer().O().O();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        if (clearComposition) {
            mainBuffer.nr();
        }
        long selectionInChars = mainBuffer.getSelectionInChars();
        mainBuffer.ck(TextRange.qie(selectionInChars), TextRange.gh(selectionInChars), newText);
        TextFieldBufferKt.nr(mainBuffer, TextRange.qie(selectionInChars) + newText.length(), 0, 2, null);
        X(mainBuffer);
        textFieldState.O(inputTransformation, restartImeIfContentChanges, undoBehavior);
    }

    public final void XQ() {
        this.textFieldState.getUndoState().n();
    }

    public final SelectionWedgeAffinity az() {
        return (SelectionWedgeAffinity) this.selectionWedgeAffinity.getValue();
    }

    public final void e(InputTransformation inputTransformation) {
        this.inputTransformation = inputTransformation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) other;
        if (Intrinsics.areEqual(this.textFieldState, transformedTextFieldState.textFieldState) && Intrinsics.areEqual(this.codepointTransformation, transformedTextFieldState.codepointTransformation)) {
            return Intrinsics.areEqual(this.outputTransformation, transformedTextFieldState.outputTransformation);
        }
        return false;
    }

    public final void fD(SelectionWedgeAffinity selectionWedgeAffinity) {
        this.selectionWedgeAffinity.setValue(selectionWedgeAffinity);
    }

    public final void g() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        textFieldState.getMainBuffer().O().O();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        TextFieldBufferKt.t(mainBuffer, 0, mainBuffer.mUb());
        textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void gh() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20585O;
        textFieldState.getMainBuffer().O().O();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        TextFieldBufferKt.rl(mainBuffer, TextRange.qie(mainBuffer.getSelectionInChars()), TextRange.gh(mainBuffer.getSelectionInChars()));
        TextFieldBufferKt.nr(mainBuffer, TextRange.qie(mainBuffer.getSelectionInChars()), 0, 2, null);
        X(mainBuffer);
        textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public int hashCode() {
        int iHashCode = this.textFieldState.hashCode() * 31;
        CodepointTransformation codepointTransformation = this.codepointTransformation;
        int iHashCode2 = (iHashCode + (codepointTransformation != null ? codepointTransformation.hashCode() : 0)) * 31;
        OutputTransformation outputTransformation = this.outputTransformation;
        return iHashCode2 + (outputTransformation != null ? outputTransformation.hashCode() : 0);
    }

    public final void iF(long untransformedRange) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        textFieldState.getMainBuffer().O().O();
        TextFieldBufferKt.t(textFieldState.getMainBuffer(), TextRange.ty(untransformedRange), TextRange.xMQ(untransformedRange));
        textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final long o(long range) {
        TransformedText transformedText;
        TransformedText transformedText2;
        State state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (transformedText2 = (TransformedText) state.getValue()) == null) ? null : transformedText2.getOffsetMapping();
        State state2 = this.codepointTransformedText;
        if (state2 != null && (transformedText = (TransformedText) state2.getValue()) != null) {
            offsetMapping = transformedText.getOffsetMapping();
        }
        if (offsetMapping2 != null) {
            range = Companion.xMQ(KN, range, offsetMapping2, null, 4, null);
        }
        return offsetMapping != null ? KN.KN(range, offsetMapping, az()) : range;
    }

    public final TextFieldCharSequence qie() {
        TransformedText transformedText;
        TextFieldCharSequence text;
        State state = this.outputTransformedText;
        return (state == null || (transformedText = (TransformedText) state.getValue()) == null || (text = transformedText.getText()) == null) ? ty() : text;
    }

    public final long r(long range) {
        TransformedText transformedText;
        TransformedText transformedText2;
        State state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (transformedText2 = (TransformedText) state.getValue()) == null) ? null : transformedText2.getOffsetMapping();
        State state2 = this.codepointTransformedText;
        if (state2 != null && (transformedText = (TransformedText) state2.getValue()) != null) {
            offsetMapping = transformedText.getOffsetMapping();
        }
        if (offsetMapping != null) {
            range = KN.Uo(range, offsetMapping);
        }
        return offsetMapping2 != null ? KN.Uo(range, offsetMapping2) : range;
    }

    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", outputTransformation=" + this.outputTransformation + ", outputTransformedText=" + this.outputTransformedText + ", codepointTransformation=" + this.codepointTransformation + ", codepointTransformedText=" + this.codepointTransformedText + ", outputText=\"" + ((Object) qie()) + "\", visualText=\"" + ((Object) HI()) + "\")";
    }

    public final TextFieldCharSequence ty() {
        return this.textFieldState.qie();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(final TextFieldState.NotifyImeListener notifyImeListener, Continuation continuation) {
        TransformedTextFieldState$collectImeNotifications$1 transformedTextFieldState$collectImeNotifications$1;
        if (continuation instanceof TransformedTextFieldState$collectImeNotifications$1) {
            transformedTextFieldState$collectImeNotifications$1 = (TransformedTextFieldState$collectImeNotifications$1) continuation;
            int i2 = transformedTextFieldState$collectImeNotifications$1.f20368r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transformedTextFieldState$collectImeNotifications$1.f20368r = i2 - Integer.MIN_VALUE;
            } else {
                transformedTextFieldState$collectImeNotifications$1 = new TransformedTextFieldState$collectImeNotifications$1(this, continuation);
            }
        }
        Object obj = transformedTextFieldState$collectImeNotifications$1.f20366O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = transformedTextFieldState$collectImeNotifications$1.f20368r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.outputTransformation != null) {
                notifyImeListener = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.LEl
                    @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                    public final void n(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
                        TransformedTextFieldState.mUb(notifyImeListener, this, textFieldCharSequence, textFieldCharSequence2, z2);
                    }
                };
            }
            transformedTextFieldState$collectImeNotifications$1.f20367n = this;
            transformedTextFieldState$collectImeNotifications$1.f20369t = notifyImeListener;
            transformedTextFieldState$collectImeNotifications$1.f20368r = 1;
            GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(transformedTextFieldState$collectImeNotifications$1), 1);
            eOVar.e();
            this.textFieldState.t(notifyImeListener);
            eOVar.J2(new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    this.f20370n.textFieldState.HI(notifyImeListener);
                }
            });
            Object objWPU = eOVar.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(transformedTextFieldState$collectImeNotifications$1);
            }
            if (objWPU == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    public TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, final CodepointTransformation codepointTransformation, final OutputTransformation outputTransformation) {
        State stateO;
        State stateO2;
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.outputTransformation = outputTransformation;
        if (outputTransformation != null) {
            stateO = SnapshotStateKt.O(new Function0<TransformedText>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$outputTransformedText$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final TransformedTextFieldState.TransformedText invoke() {
                    return TransformedTextFieldState.KN.O(this.f20372n.textFieldState.qie(), outputTransformation, this.f20372n.az());
                }
            });
        } else {
            stateO = null;
        }
        this.outputTransformedText = stateO;
        if (codepointTransformation != null) {
            stateO2 = SnapshotStateKt.O(new Function0<TransformedText>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$codepointTransformedText$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final TransformedTextFieldState.TransformedText invoke() {
                    TextFieldCharSequence textFieldCharSequenceQie;
                    TransformedTextFieldState.TransformedText transformedText;
                    TransformedTextFieldState.Companion companion = TransformedTextFieldState.KN;
                    State state = this.f20364n.outputTransformedText;
                    if (state == null || (transformedText = (TransformedTextFieldState.TransformedText) state.getValue()) == null || (textFieldCharSequenceQie = transformedText.getText()) == null) {
                        textFieldCharSequenceQie = this.f20364n.textFieldState.qie();
                    }
                    return companion.J2(textFieldCharSequenceQie, codepointTransformation, this.f20364n.az());
                }
            });
        } else {
            stateO2 = null;
        }
        this.codepointTransformedText = stateO2;
        this.selectionWedgeAffinity = SnapshotStateKt__SnapshotStateKt.O(new SelectionWedgeAffinity(WedgeAffinity.f20375n), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.O().rl() > 0 && TextRange.KN(textFieldBuffer.getSelectionInChars())) {
            fD(new SelectionWedgeAffinity(WedgeAffinity.f20375n));
        }
    }

    public final void Z(int transformedOffset) {
        te(TextRangeKt.n(transformedOffset));
    }

    public final void ck(int type, long transformedRange) {
        long jR = r(transformedRange);
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        textFieldState.getMainBuffer().O().O();
        textFieldState.getMainBuffer().WPU(type, TextRange.ty(jR), TextRange.xMQ(jR));
        textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void te(long transformedRange) {
        iF(r(transformedRange));
    }
}
