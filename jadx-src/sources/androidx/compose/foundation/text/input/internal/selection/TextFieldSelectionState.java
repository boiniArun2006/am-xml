package androidx.compose.foundation.text.input.internal.selection;

import GJW.Lu;
import TFv.CN3;
import TFv.fuX;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0006Æ\u0001Ç\u0001È\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001a\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b&\u0010\u001dJ\u000f\u0010'\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010%JQ\u00102\u001a\u0002012\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\b2\b\b\u0002\u00100\u001a\u00020\bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J<\u00107\u001a\u0002012\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\b\u00106\u001a\u0004\u0018\u0001012\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020\bH\u0000¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u001f¢\u0006\u0004\b=\u0010!JE\u0010D\u001a\u00020\u00162\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\bD\u0010EJ\u0014\u0010F\u001a\u00020\u0016*\u00020\u0015H\u0086@¢\u0006\u0004\bF\u0010\u0018J\u001c\u0010G\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\bH\u0086@¢\u0006\u0004\bG\u0010\u001bJ\u0010\u0010H\u001a\u00020\u0016H\u0086@¢\u0006\u0004\bH\u0010\u001dJ\u0015\u0010K\u001a\u00020\u00162\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u0016¢\u0006\u0004\bM\u0010%J\u0014\u0010N\u001a\u00020\u0016*\u00020\u0015H\u0086@¢\u0006\u0004\bN\u0010\u0018J:\u0010T\u001a\u00020\u0016*\u00020\u00152\b\u0010P\u001a\u0004\u0018\u00010O2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00160Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00160QH\u0086@¢\u0006\u0004\bT\u0010UJ\"\u0010V\u001a\u00020\u0016*\u00020\u00152\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00160QH\u0086@¢\u0006\u0004\bV\u0010WJ\u001f\u0010X\u001a\u00020:2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0000¢\u0006\u0004\bX\u0010YJ \u0010]\u001a\u00020\u00162\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020\u0016¢\u0006\u0004\b_\u0010%J\r\u0010`\u001a\u00020\b¢\u0006\u0004\b`\u0010\u0010J\u0010\u0010a\u001a\u00020\u0016H\u0086@¢\u0006\u0004\ba\u0010\u001dJ\r\u0010b\u001a\u00020\b¢\u0006\u0004\bb\u0010\u0010J\u001a\u0010d\u001a\u00020\u00162\b\b\u0002\u0010c\u001a\u00020\bH\u0086@¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\bH\u0086@¢\u0006\u0004\bf\u0010\u001dJ\u0010\u0010g\u001a\u00020\u0016H\u0086@¢\u0006\u0004\bg\u0010\u001dJ\r\u0010h\u001a\u00020\b¢\u0006\u0004\bh\u0010\u0010J\r\u0010i\u001a\u00020\u0016¢\u0006\u0004\bi\u0010%J\r\u0010j\u001a\u00020\b¢\u0006\u0004\bj\u0010\u0010J\r\u0010k\u001a\u00020\u0016¢\u0006\u0004\bk\u0010%J\r\u0010l\u001a\u00020\u0016¢\u0006\u0004\bl\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010tR\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010t\u001a\u0004\bw\u0010\u0010\"\u0004\bx\u0010yR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010tR\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\u007f\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001a\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R1\u0010\u0087\u0001\u001a\u00020\b2\u0007\u0010\u0082\u0001\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010\u0010\"\u0005\b\u0086\u0001\u0010yR1\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R4\u0010\u0093\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u0001\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0089\u0001\u001a\u0006\b\u0091\u0001\u0010\u008b\u0001\"\u0006\b\u0092\u0001\u0010\u008d\u0001R9\u0010\u0099\u0001\u001a\u00020\u00112\u0007\u0010\u0082\u0001\u001a\u00020\u00118B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0084\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R9\u0010\u009d\u0001\u001a\u00020\u00112\u0007\u0010\u0082\u0001\u001a\u00020\u00118B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u0084\u0001\u001a\u0006\b\u009b\u0001\u0010\u0096\u0001\"\u0006\b\u009c\u0001\u0010\u0098\u0001R7\u0010£\u0001\u001a\u0004\u0018\u00010Z2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010Z8F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0084\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R5\u0010ª\u0001\u001a\u00030¤\u00012\b\u0010\u0082\u0001\u001a\u00030¤\u00018F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b¥\u0001\u0010\u0084\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R1\u0010®\u0001\u001a\u00020\b2\u0007\u0010\u0082\u0001\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0006\b«\u0001\u0010\u0084\u0001\u001a\u0005\b¬\u0001\u0010\u0010\"\u0005\b\u00ad\u0001\u0010yR1\u0010J\u001a\u00020I2\u0007\u0010\u0082\u0001\u001a\u00020I8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b¯\u0001\u0010\u0084\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0005\b²\u0001\u0010LR\u001b\u0010µ\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bt\u0010´\u0001R\u0018\u0010·\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010XR\u001c\u0010»\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001d\u0010½\u0001\u001a\u00020\u00118BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¼\u0001\u0010\u0096\u0001R\u001a\u0010Á\u0001\u001a\u0005\u0018\u00010¾\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0016\u0010Ã\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\u0010R\u001a\u0010Å\u0001\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\bÄ\u0001\u0010\u0096\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006É\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/ui/unit/Density;", "density", "", "enabled", "readOnly", "isFocused", "isPassword", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZZ)V", "piY", "()Z", "Landroidx/compose/ui/geometry/Offset;", "offset", "Mx", "(J)Z", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "v", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isStartHandle", "bzg", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "xg", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pJg", "Landroidx/compose/ui/geometry/Rect;", "M7", "()Landroidx/compose/ui/geometry/Rect;", "D", "(Z)J", "eTf", "()V", "C", "z", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "textFieldCharSequence", "", "startOffset", "endOffset", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "allowPreviousSelectionCollapsed", "isStartOfSelection", "Landroidx/compose/ui/text/TextRange;", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;ZZ)J", "rawStartOffset", "rawEndOffset", "previousSelection", "Y", "(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "includePosition", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "eF", "(Z)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "E", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/platform/Clipboard;", "clipboard", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "showTextToolbar", "hRu", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/ui/platform/Clipboard;Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;Landroidx/compose/ui/unit/Density;ZZZ)V", "nHg", "fcU", "Po6", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "textToolbarState", "How", "(Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;)V", "P5", "U", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "requestFocus", "showKeyboard", "jB", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "EWS", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "(ZZ)Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "Landroidx/compose/foundation/text/Handle;", "handle", "position", "UhV", "(Landroidx/compose/foundation/text/Handle;J)V", "X", "fD", "s7N", "iF", "cancelSelection", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E2", "ofS", "e", "G7", "te", "g", "wTp", c.f62177j, "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "rl", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "t", "Landroidx/compose/ui/unit/Density;", "nr", "Z", "O", "J2", "ijL", "n1", "(Z)V", "Uo", "KN", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "xMQ", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "textToolbarHandler", "mUb", "Landroidx/compose/ui/platform/Clipboard;", "<set-?>", "gh", "Landroidx/compose/runtime/MutableState;", "m", "Jk", "isInTouchMode", "qie", "Lkotlin/jvm/functions/Function0;", "getRequestAutofillAction", "()Lkotlin/jvm/functions/Function0;", "mYa", "(Lkotlin/jvm/functions/Function0;)V", "requestAutofillAction", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "az", "getReceiveContentConfiguration", "qm", "receiveContentConfiguration", "ty", "Nxk", "()J", "HV", "(J)V", "startTextLayoutPositionInWindow", "HI", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Rl", "rawHandleDragPosition", "ck", "FX", "()Landroidx/compose/foundation/text/Handle;", "ul", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "Ik", "M", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "eWT", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;)V", "directDragGestureInitiator", "r", "GR", "Org", "showCursorHandle", "o", "dR0", "()Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "GD", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "previousSelectionLayout", "XQ", "previousRawDragOffset", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "S", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "pressInteraction", "p5", "currentTextLayoutPositionInWindow", "Landroidx/compose/ui/layout/LayoutCoordinates;", "k", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "textLayoutCoordinates", "B", "editable", "J", "handleDragPosition", "InputType", "TextFieldMouseSelectionObserver", "TextFieldTextDragObserver", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1575:1\n85#2:1576\n113#2,2:1577\n85#2:1579\n113#2,2:1580\n85#2:1582\n113#2,2:1583\n85#2:1587\n113#2,2:1588\n85#2:1590\n113#2,2:1591\n85#2:1593\n113#2,2:1594\n85#2:1596\n113#2,2:1597\n278#3:1585\n278#3:1586\n30#3:1633\n30#3:1640\n273#3:1656\n273#3:1657\n1#4:1599\n602#5,8:1600\n54#6:1608\n85#7:1609\n53#7,3:1634\n70#7:1638\n53#7,3:1641\n70#7:1645\n60#7:1648\n60#7:1651\n70#7:1654\n722#8,23:1610\n69#9:1637\n69#9:1644\n65#9:1647\n65#9:1650\n69#9:1653\n22#10:1639\n22#10:1646\n22#10:1649\n22#10:1652\n22#10:1655\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n127#1:1576\n127#1:1577,2\n145#1:1579\n145#1:1580,2\n163#1:1582\n163#1:1583,2\n195#1:1587\n195#1:1588,2\n208#1:1590\n208#1:1591,2\n211#1:1593\n211#1:1594,2\n217#1:1596\n217#1:1597,2\n178#1:1585\n183#1:1586\n1145#1:1633\n1154#1:1640\n602#1:1656\n974#1:1657\n297#1:1600,8\n330#1:1608\n330#1:1609\n1145#1:1634,3\n1150#1:1638\n1154#1:1641,3\n1159#1:1645\n1162#1:1648\n1163#1:1651\n1165#1:1654\n544#1:1610,23\n1150#1:1637\n1159#1:1644\n1162#1:1647\n1163#1:1650\n1165#1:1653\n1150#1:1639\n1159#1:1646\n1162#1:1649\n1163#1:1652\n1165#1:1655\n*E\n"})
public final class TextFieldSelectionState {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final MutableState rawHandleDragPosition;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final MutableState directDragGestureInitiator;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean isFocused;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private HapticFeedback hapticFeedBack;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean readOnly;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private PressInteraction.Press pressInteraction;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean isPassword;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private int previousRawDragOffset;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private SelectionLayout previousSelectionLayout;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private Function0 receiveContentConfiguration;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutableState isInTouchMode = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private Clipboard clipboard;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TransformedTextFieldState textFieldState;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableState textToolbarState;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private Function0 requestAutofillAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final MutableState showCursorHandle;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final TextLayoutState textLayoutState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Density density;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableState startTextLayoutPositionInWindow;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private TextToolbarHandler textToolbarHandler;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ InputType[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f20417r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final InputType f20416n = new InputType("None", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final InputType f20418t = new InputType("Touch", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final InputType f20415O = new InputType("Mouse", 2);

        private static final /* synthetic */ InputType[] n() {
            return new InputType[]{f20416n, f20418t, f20415O};
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) J2.clone();
        }

        static {
            InputType[] inputTypeArrN = n();
            J2 = inputTypeArrN;
            f20417r = EnumEntriesKt.enumEntries(inputTypeArrN);
        }

        private InputType(String str, int i2) {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u001c\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "Lkotlin/Function0;", "", "requestFocus", "<init>", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/geometry/Offset;", "dragPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isStartOfSelection", "Landroidx/compose/ui/text/TextRange;", "J2", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "downPosition", "t", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "nr", c.f62177j, "()V", "O", "(J)Z", "rl", "Lkotlin/jvm/functions/Function0;", "", "I", "dragBeginOffsetInText", "J", "dragBeginPosition", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1575:1\n1#2:1576\n*E\n"})
    private final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Function0 requestFocus;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private int dragBeginOffsetInText = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private long dragBeginPosition = Offset.INSTANCE.rl();

        public TextFieldMouseSelectionObserver(Function0 function0) {
            this.requestFocus = function0;
        }

        private final long J2(long dragPosition, SelectionAdjustment adjustment, boolean isStartOfSelection) {
            Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.KN(this.dragBeginPosition, false);
            int iKN = TextFieldSelectionState.this.textLayoutState.KN(dragPosition, false);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jI = textFieldSelectionState.i(textFieldSelectionState.textFieldState.HI(), iIntValue, iKN, false, adjustment, false, isStartOfSelection);
            if (this.dragBeginOffsetInText == -1 && !TextRange.KN(jI)) {
                this.dragBeginOffsetInText = TextRange.ty(jI);
            }
            if (TextRange.az(jI)) {
                jI = TextFieldSelectionStateKt.nr(jI);
            }
            TextFieldSelectionState.this.textFieldState.te(jI);
            TextFieldSelectionState.this.How(TextToolbarState.f20572O);
            return jI;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public boolean O(long downPosition) {
            TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtend$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onExtend";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void n() {
            TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDragDone$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onDragDone";
                }
            });
            TextFieldSelectionState.this.eWT(InputType.f20416n);
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public boolean nr(final long dragPosition, SelectionAdjustment adjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.HI().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onDrag " + ((Object) Offset.o(dragPosition));
                }
            });
            J2(dragPosition, adjustment, false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public boolean rl(long dragPosition) {
            TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtendDrag$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onExtendDrag";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public boolean t(long downPosition, SelectionAdjustment adjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.HI().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onStart$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onStart";
                }
            });
            TextFieldSelectionState.this.eWT(InputType.f20415O);
            this.requestFocus.invoke();
            TextFieldSelectionState.this.previousRawDragOffset = -1;
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = downPosition;
            this.dragBeginOffsetInText = TextRange.ty(J2(downPosition, adjustment, true));
            return true;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u001c\u0010\u0019\u001a\u00020\t8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001c\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver;", "Landroidx/compose/foundation/text/TextDragObserver;", "Lkotlin/Function0;", "", "requestFocus", "<init>", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function0;)V", "O", "()V", "Landroidx/compose/ui/geometry/Offset;", "point", c.f62177j, "(J)V", "t", "onStop", "onCancel", "startPoint", "rl", "delta", "nr", "Lkotlin/jvm/functions/Function0;", "", "I", "dragBeginOffsetInText", "J", "dragBeginPosition", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "Landroidx/compose/foundation/text/Handle;", "actingHandle", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1575:1\n273#2:1576\n1#3:1577\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n*L\n770#1:1576\n*E\n"})
    private final class TextFieldTextDragObserver implements TextDragObserver {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private Handle actingHandle;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Function0 requestFocus;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private long dragTotalDistance;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private int dragBeginOffsetInText = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private long dragBeginPosition;

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void n(long point) {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void t() {
        }

        public TextFieldTextDragObserver(Function0 function0) {
            this.requestFocus = function0;
            Offset.Companion companion = Offset.INSTANCE;
            this.dragBeginPosition = companion.rl();
            this.dragTotalDistance = companion.t();
            this.actingHandle = Handle.f19676O;
        }

        private final void O() {
            if ((this.dragBeginPosition & 9223372034707292159L) != 9205357640488583168L) {
                TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDragStop$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Touch.onDragStop";
                    }
                });
                TextFieldSelectionState.this.X();
                this.dragBeginOffsetInText = -1;
                Offset.Companion companion = Offset.INSTANCE;
                this.dragBeginPosition = companion.rl();
                this.dragTotalDistance = companion.t();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                TextFieldSelectionState.this.eWT(InputType.f20416n);
                this.requestFocus.invoke();
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void nr(long delta) {
            int iIntValue;
            int iKN;
            SelectionAdjustment selectionAdjustmentHI;
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textLayoutState.J2() == null || TextFieldSelectionState.this.textFieldState.HI().length() == 0) {
                return;
            }
            long jIk = Offset.Ik(this.dragTotalDistance, delta);
            this.dragTotalDistance = jIk;
            final long jIk2 = Offset.Ik(this.dragBeginPosition, jIk);
            TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Touch.onDrag at " + ((Object) Offset.o(jIk2));
                }
            });
            if (this.dragBeginOffsetInText >= 0 || TextFieldSelectionState.this.textLayoutState.gh(jIk2)) {
                Integer numValueOf = Integer.valueOf(this.dragBeginOffsetInText);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : TextFieldSelectionState.this.textLayoutState.KN(this.dragBeginPosition, false);
                iKN = TextFieldSelectionState.this.textLayoutState.KN(jIk2, false);
                if (this.dragBeginOffsetInText < 0 && iIntValue == iKN) {
                    return;
                }
                selectionAdjustmentHI = SelectionAdjustment.INSTANCE.HI();
                TextFieldSelectionState.this.How(TextToolbarState.f20572O);
            } else {
                iIntValue = TextLayoutState.xMQ(TextFieldSelectionState.this.textLayoutState, this.dragBeginPosition, false, 2, null);
                iKN = TextLayoutState.xMQ(TextFieldSelectionState.this.textLayoutState, jIk2, false, 2, null);
                selectionAdjustmentHI = iIntValue == iKN ? SelectionAdjustment.INSTANCE.az() : SelectionAdjustment.INSTANCE.HI();
            }
            int i2 = iIntValue;
            int i3 = iKN;
            SelectionAdjustment selectionAdjustment = selectionAdjustmentHI;
            long selection = TextFieldSelectionState.this.textFieldState.HI().getSelection();
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long jK = TextFieldSelectionState.K(textFieldSelectionState, textFieldSelectionState.textFieldState.HI(), i2, i3, false, selectionAdjustment, false, false, 64, null);
            if (this.dragBeginOffsetInText == -1 && !TextRange.KN(jK)) {
                this.dragBeginOffsetInText = TextRange.ty(jK);
            }
            if (TextRange.az(jK)) {
                jK = TextFieldSelectionStateKt.nr(jK);
            }
            if (!TextRange.Uo(jK, selection)) {
                Handle handle = (TextRange.ty(jK) == TextRange.ty(selection) || TextRange.xMQ(jK) != TextRange.xMQ(selection)) ? ((TextRange.ty(jK) != TextRange.ty(selection) || TextRange.xMQ(jK) == TextRange.xMQ(selection)) && ((float) (TextRange.ty(jK) + TextRange.xMQ(jK))) / 2.0f <= ((float) (TextRange.ty(selection) + TextRange.xMQ(selection))) / 2.0f) ? Handle.f19679t : Handle.f19676O : Handle.f19679t;
                this.actingHandle = handle;
            }
            if (TextRange.KN(selection) || !TextRange.KN(jK)) {
                TextFieldSelectionState.this.textFieldState.te(jK);
            }
            TextFieldSelectionState.this.UhV(this.actingHandle, jIk2);
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void rl(final long startPoint) {
            if (TextFieldSelectionState.this.enabled) {
                TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Touch.onDragStart after longPress at " + ((Object) Offset.o(startPoint));
                    }
                });
                TextFieldSelectionState.this.UhV(this.actingHandle, startPoint);
                TextFieldSelectionState.this.Org(false);
                TextFieldSelectionState.this.eWT(InputType.f20418t);
                this.dragBeginPosition = startPoint;
                this.dragTotalDistance = Offset.INSTANCE.t();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                if (TextFieldSelectionState.this.textLayoutState.J2() == null) {
                    return;
                }
                if (TextFieldSelectionState.this.textLayoutState.gh(startPoint)) {
                    if (TextFieldSelectionState.this.textFieldState.HI().length() == 0) {
                        return;
                    }
                    int iXMQ = TextLayoutState.xMQ(TextFieldSelectionState.this.textLayoutState, startPoint, false, 2, null);
                    long jK = TextFieldSelectionState.K(TextFieldSelectionState.this, new TextFieldCharSequence(TextFieldSelectionState.this.textFieldState.HI(), TextRange.INSTANCE.n(), null, null, null, 28, null), iXMQ, iXMQ, false, SelectionAdjustment.INSTANCE.HI(), false, false, 96, null);
                    TextFieldSelectionState.this.textFieldState.te(jK);
                    TextFieldSelectionState.this.How(TextToolbarState.f20572O);
                    this.dragBeginOffsetInText = TextRange.ty(jK);
                    return;
                }
                int iXMQ2 = TextLayoutState.xMQ(TextFieldSelectionState.this.textLayoutState, startPoint, false, 2, null);
                HapticFeedback hapticFeedback = TextFieldSelectionState.this.hapticFeedBack;
                if (hapticFeedback != null) {
                    hapticFeedback.n(HapticFeedbackType.INSTANCE.xMQ());
                }
                TextFieldSelectionState.this.textFieldState.Z(iXMQ2);
                TextFieldSelectionState.this.Org(true);
                TextFieldSelectionState.this.How(TextToolbarState.f20575t);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onCancel() {
            O();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onStop() {
            O();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.f20143n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.f20146t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.f20142O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Object N(TextFieldSelectionState textFieldSelectionState, boolean z2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return textFieldSelectionState.T(z2, continuation);
    }

    public final void X() {
        ul(null);
        Offset.Companion companion = Offset.INSTANCE;
        Rl(companion.rl());
        HV(companion.rl());
    }

    private final boolean B() {
        return this.enabled && !this.readOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(Continuation continuation) {
        TextFieldSelectionState$pasteAsPlainText$1 textFieldSelectionState$pasteAsPlainText$1;
        TextFieldSelectionState textFieldSelectionState;
        String strO;
        if (continuation instanceof TextFieldSelectionState$pasteAsPlainText$1) {
            textFieldSelectionState$pasteAsPlainText$1 = (TextFieldSelectionState$pasteAsPlainText$1) continuation;
            int i2 = textFieldSelectionState$pasteAsPlainText$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$pasteAsPlainText$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                textFieldSelectionState$pasteAsPlainText$1 = new TextFieldSelectionState$pasteAsPlainText$1(this, continuation);
            }
        }
        Object objN = textFieldSelectionState$pasteAsPlainText$1.f20525t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = textFieldSelectionState$pasteAsPlainText$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Clipboard clipboard = this.clipboard;
            if (clipboard != null) {
                textFieldSelectionState$pasteAsPlainText$1.f20524n = this;
                textFieldSelectionState$pasteAsPlainText$1.J2 = 1;
                objN = clipboard.n(textFieldSelectionState$pasteAsPlainText$1);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                textFieldSelectionState = this;
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        textFieldSelectionState = (TextFieldSelectionState) textFieldSelectionState$pasteAsPlainText$1.f20524n;
        ResultKt.throwOnFailure(objN);
        ClipEntry clipEntry = (ClipEntry) objN;
        if (clipEntry != null && (strO = ClipboardUtils_androidKt.O(clipEntry)) != null) {
            TransformedTextFieldState.aYN(textFieldSelectionState.textFieldState, strO, false, TextFieldEditUndoBehavior.f20585O, false, 10, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D(boolean isStartHandle) {
        TextLayoutResult textLayoutResultJ2 = this.textLayoutState.J2();
        if (textLayoutResultJ2 == null) {
            return Offset.INSTANCE.t();
        }
        long selection = this.textFieldState.HI().getSelection();
        return TextSelectionDelegateKt.rl(textLayoutResultJ2, isStartHandle ? TextRange.ty(selection) : TextRange.xMQ(selection), isStartHandle, TextRange.az(selection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void GD(TextToolbarState textToolbarState) {
        this.textToolbarState.setValue(textToolbarState);
    }

    private final boolean GR() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    private final void HV(long j2) {
        this.startTextLayoutPositionInWindow.setValue(Offset.nr(j2));
    }

    static /* synthetic */ long K(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i2, int i3, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3, boolean z4, int i5, Object obj) {
        if ((i5 & 32) != 0) {
            z3 = false;
        }
        if ((i5 & 64) != 0) {
            z4 = false;
        }
        return textFieldSelectionState.i(textFieldCharSequence, i2, i3, z2, selectionAdjustment, z3, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect M7() {
        float fIntBitsToFloat;
        Rect rectO;
        Rect rectO2;
        TextFieldCharSequence textFieldCharSequenceHI = this.textFieldState.HI();
        if (TextRange.KN(textFieldCharSequenceHI.getSelection())) {
            Rect rectE = E();
            LayoutCoordinates layoutCoordinatesK = k();
            return RectKt.t(layoutCoordinatesK != null ? layoutCoordinatesK.xg(rectE.Z()) : Offset.INSTANCE.t(), rectE.Ik());
        }
        LayoutCoordinates layoutCoordinatesK2 = k();
        long jXg = layoutCoordinatesK2 != null ? layoutCoordinatesK2.xg(D(true)) : Offset.INSTANCE.t();
        LayoutCoordinates layoutCoordinatesK3 = k();
        long jXg2 = layoutCoordinatesK3 != null ? layoutCoordinatesK3.xg(D(false)) : Offset.INSTANCE.t();
        LayoutCoordinates layoutCoordinatesK4 = k();
        float fIntBitsToFloat2 = 0.0f;
        if (layoutCoordinatesK4 != null) {
            TextLayoutResult textLayoutResultJ2 = this.textLayoutState.J2();
            fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinatesK4.xg(Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((textLayoutResultJ2 == null || (rectO2 = textLayoutResultJ2.O(TextRange.ty(textFieldCharSequenceHI.getSelection()))) == null) ? 0.0f : rectO2.getTop())) & 4294967295L))) & 4294967295L));
        } else {
            fIntBitsToFloat = 0.0f;
        }
        LayoutCoordinates layoutCoordinatesK5 = k();
        if (layoutCoordinatesK5 != null) {
            TextLayoutResult textLayoutResultJ22 = this.textLayoutState.J2();
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (layoutCoordinatesK5.xg(Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((textLayoutResultJ22 == null || (rectO = textLayoutResultJ22.O(TextRange.xMQ(textFieldCharSequenceHI.getSelection()))) == null) ? 0.0f : rectO.getTop())) & 4294967295L))) & 4294967295L));
        }
        int i2 = (int) (jXg >> 32);
        int i3 = (int) (jXg2 >> 32);
        return new Rect(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.max(Float.intBitsToFloat((int) (jXg & 4294967295L)), Float.intBitsToFloat((int) (jXg2 & 4294967295L))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Mx(long offset) {
        int iAYN;
        int iTy;
        TextLayoutResult textLayoutResultJ2 = this.textLayoutState.J2();
        if (textLayoutResultJ2 == null || (iAYN = textLayoutResultJ2.aYN(offset)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long jIk = transformedTextFieldState.Ik(iAYN);
        long jO = transformedTextFieldState.o(jIk);
        int i2 = WhenMappings.$EnumSwitchMapping$0[((TextRange.KN(jIk) && TextRange.KN(jO)) ? IndexTransformationType.f20143n : (TextRange.KN(jIk) || TextRange.KN(jO)) ? (!TextRange.KN(jIk) || TextRange.KN(jO)) ? IndexTransformationType.J2 : IndexTransformationType.f20146t : IndexTransformationType.f20142O).ordinal()];
        SelectionWedgeAffinity selectionWedgeAffinity = null;
        if (i2 == 1 || i2 == 2) {
            iTy = TextRange.ty(jIk);
        } else if (i2 == 3) {
            selectionWedgeAffinity = MathUtilsKt.rl(offset, textLayoutResultJ2.O(TextRange.ty(jO)), textLayoutResultJ2.O(TextRange.xMQ(jO))) < 0 ? new SelectionWedgeAffinity(WedgeAffinity.f20375n) : new SelectionWedgeAffinity(WedgeAffinity.f20376t);
            iTy = TextRange.ty(jIk);
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iTy = MathUtilsKt.rl(offset, textLayoutResultJ2.O(TextRange.ty(jO)), textLayoutResultJ2.O(TextRange.xMQ(jO))) < 0 ? TextRange.ty(jIk) : TextRange.xMQ(jIk);
        }
        long jN = TextRangeKt.n(iTy);
        if (TextRange.Uo(jN, this.textFieldState.ty().getSelection()) && (selectionWedgeAffinity == null || Intrinsics.areEqual(selectionWedgeAffinity, this.textFieldState.az()))) {
            return false;
        }
        this.textFieldState.iF(jN);
        if (selectionWedgeAffinity != null) {
            this.textFieldState.fD(selectionWedgeAffinity);
        }
        return true;
    }

    private final long Nxk() {
        return ((Offset) this.startTextLayoutPositionInWindow.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Org(boolean z2) {
        this.showCursorHandle.setValue(Boolean.valueOf(z2));
    }

    private final void Rl(long j2) {
        this.rawHandleDragPosition.setValue(Offset.nr(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Xw(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        if ((longRef.element & 9223372034707292159L) != 9205357640488583168L) {
            textFieldSelectionState.X();
            Offset.Companion companion = Offset.INSTANCE;
            longRef.element = companion.rl();
            longRef2.element = companion.t();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    private final long Y(int rawStartOffset, int rawEndOffset, TextRange previousSelection, boolean isStartHandle, SelectionAdjustment adjustment) {
        TextLayoutResult textLayoutResultJ2 = this.textLayoutState.J2();
        if (textLayoutResultJ2 == null) {
            return TextRange.INSTANCE.n();
        }
        if (previousSelection == null && Intrinsics.areEqual(adjustment, SelectionAdjustment.INSTANCE.gh())) {
            return TextRangeKt.rl(rawStartOffset, rawEndOffset);
        }
        SelectionLayout selectionLayoutT = SelectionLayoutKt.t(textLayoutResultJ2, rawStartOffset, rawEndOffset, this.previousRawDragOffset, previousSelection != null ? previousSelection.getPackedValue() : TextRange.INSTANCE.n(), previousSelection == null, isStartHandle);
        if (previousSelection != null && !selectionLayoutT.xMQ(this.previousSelectionLayout)) {
            return previousSelection.getPackedValue();
        }
        long jUo = adjustment.n(selectionLayoutT).Uo();
        this.previousSelectionLayout = selectionLayoutT;
        this.previousRawDragOffset = isStartHandle ? rawStartOffset : rawEndOffset;
        return jUo;
    }

    private final long a() {
        return ((Offset) this.rawHandleDragPosition.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bzg(PointerInputScope pointerInputScope, final boolean z2, Continuation continuation) throws Throwable {
        TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$1;
        final TextFieldSelectionState textFieldSelectionState;
        final Handle handle;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        if (continuation instanceof TextFieldSelectionState$detectSelectionHandleDragGestures$1) {
            textFieldSelectionState$detectSelectionHandleDragGestures$1 = (TextFieldSelectionState$detectSelectionHandleDragGestures$1) continuation;
            int i2 = textFieldSelectionState$detectSelectionHandleDragGestures$1.f20473Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$detectSelectionHandleDragGestures$1.f20473Z = i2 - Integer.MIN_VALUE;
            } else {
                textFieldSelectionState$detectSelectionHandleDragGestures$1 = new TextFieldSelectionState$detectSelectionHandleDragGestures$1(this, continuation);
            }
        }
        TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$12 = textFieldSelectionState$detectSelectionHandleDragGestures$1;
        Object obj = textFieldSelectionState$detectSelectionHandleDragGestures$12.f20476r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = textFieldSelectionState$detectSelectionHandleDragGestures$12.f20473Z;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            handle = (Handle) textFieldSelectionState$detectSelectionHandleDragGestures$12.J2;
            longRef2 = (Ref.LongRef) textFieldSelectionState$detectSelectionHandleDragGestures$12.f20472O;
            longRef = (Ref.LongRef) textFieldSelectionState$detectSelectionHandleDragGestures$12.f20477t;
            textFieldSelectionState = (TextFieldSelectionState) textFieldSelectionState$detectSelectionHandleDragGestures$12.f20474n;
            try {
                ResultKt.throwOnFailure(obj);
                TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Selection Handle drag cancelled for draggingHandle: " + this.f20492n.FX() + " definedOn: " + handle;
                    }
                });
                if (textFieldSelectionState.FX() == handle) {
                    Xw(longRef, textFieldSelectionState, longRef2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Selection Handle drag cancelled for draggingHandle: " + this.f20492n.FX() + " definedOn: " + handle;
                    }
                });
                if (textFieldSelectionState.FX() == handle) {
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final Ref.LongRef longRef3 = new Ref.LongRef();
        Offset.Companion companion = Offset.INSTANCE;
        longRef3.element = companion.rl();
        final Ref.LongRef longRef4 = new Ref.LongRef();
        longRef4.element = companion.t();
        final Handle handle2 = z2 ? Handle.f19679t : Handle.f19676O;
        try {
            try {
                Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        n(offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(long j2) {
                        longRef3.element = SelectionHandlesKt.n(this.D(z2));
                        this.UhV(handle2, longRef3.element);
                        longRef4.element = Offset.INSTANCE.t();
                        this.previousRawDragOffset = -1;
                    }
                };
                handle2 = handle2;
                longRef3 = longRef3;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TextFieldSelectionState.Xw(longRef3, this, longRef4);
                    }
                };
                Function0<Unit> function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TextFieldSelectionState.Xw(longRef3, this, longRef4);
                    }
                };
                try {
                    Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                            n(pointerInputChange, offset.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(PointerInputChange pointerInputChange, long j2) {
                            Ref.LongRef longRef5 = longRef4;
                            longRef5.element = Offset.Ik(longRef5.element, j2);
                            TextLayoutResult textLayoutResultJ2 = this.textLayoutState.J2();
                            if (textLayoutResultJ2 == null) {
                                return;
                            }
                            this.UhV(handle2, Offset.Ik(longRef3.element, longRef4.element));
                            int iAYN = z2 ? textLayoutResultJ2.aYN(this.J()) : TextRange.ty(this.textFieldState.HI().getSelection());
                            int iXMQ = z2 ? TextRange.xMQ(this.textFieldState.HI().getSelection()) : textLayoutResultJ2.aYN(this.J());
                            long selection = this.textFieldState.HI().getSelection();
                            TextFieldSelectionState textFieldSelectionState2 = this;
                            long jK = TextFieldSelectionState.K(textFieldSelectionState2, textFieldSelectionState2.textFieldState.HI(), iAYN, iXMQ, z2, SelectionAdjustment.INSTANCE.qie(), false, false, 96, null);
                            if (TextRange.KN(selection) || !TextRange.KN(jK)) {
                                this.textFieldState.te(jK);
                            }
                        }
                    };
                    longRef4 = longRef4;
                    textFieldSelectionState$detectSelectionHandleDragGestures$12.f20474n = this;
                    textFieldSelectionState$detectSelectionHandleDragGestures$12.f20477t = longRef3;
                    textFieldSelectionState$detectSelectionHandleDragGestures$12.f20472O = longRef4;
                    textFieldSelectionState$detectSelectionHandleDragGestures$12.J2 = handle2;
                    textFieldSelectionState$detectSelectionHandleDragGestures$12.f20473Z = 1;
                    if (DragGestureDetectorKt.az(pointerInputScope, function1, function0, function02, function2, textFieldSelectionState$detectSelectionHandleDragGestures$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    textFieldSelectionState = this;
                    handle = handle2;
                    longRef = longRef3;
                    longRef2 = longRef4;
                    TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Selection Handle drag cancelled for draggingHandle: " + this.f20492n.FX() + " definedOn: " + handle;
                        }
                    });
                    if (textFieldSelectionState.FX() == handle) {
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    longRef4 = longRef4;
                    textFieldSelectionState = this;
                    handle = handle2;
                    longRef = longRef3;
                    longRef2 = longRef4;
                    TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Selection Handle drag cancelled for draggingHandle: " + this.f20492n.FX() + " definedOn: " + handle;
                        }
                    });
                    if (textFieldSelectionState.FX() == handle) {
                        Xw(longRef, textFieldSelectionState, longRef2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                handle2 = handle2;
                longRef3 = longRef3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextToolbarState dR0() {
        return (TextToolbarState) this.textToolbarState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates k() {
        LayoutCoordinates layoutCoordinatesMUb = this.textLayoutState.mUb();
        if (layoutCoordinatesMUb == null || !layoutCoordinatesMUb.nr()) {
            return null;
        }
        return layoutCoordinatesMUb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object pJg(Continuation continuation) {
        Object objN = SnapshotStateKt.Ik(new Function0<Rect>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Rect invoke() {
                Rect rectAYN;
                boolean zKN = TextRange.KN(this.f20517n.textFieldState.HI().getSelection());
                if (((!zKN || this.f20517n.dR0() != TextToolbarState.f20575t) && (zKN || this.f20517n.dR0() != TextToolbarState.f20572O)) || this.f20517n.FX() != null || !this.f20517n.m()) {
                    return Rect.INSTANCE.n();
                }
                LayoutCoordinates layoutCoordinatesK = this.f20517n.k();
                Rect rectXMQ = layoutCoordinatesK != null ? SelectionManagerKt.xMQ(layoutCoordinatesK) : null;
                if (rectXMQ == null) {
                    return Rect.INSTANCE.n();
                }
                LayoutCoordinates layoutCoordinatesK2 = this.f20517n.k();
                Offset offsetNr = layoutCoordinatesK2 != null ? Offset.nr(layoutCoordinatesK2.xg(rectXMQ.Z())) : null;
                Intrinsics.checkNotNull(offsetNr);
                Rect rectT = RectKt.t(offsetNr.getPackedValue(), rectXMQ.Ik());
                Rect rectM7 = this.f20517n.M7();
                Rect rect = rectT.nY(rectM7) ? rectM7 : null;
                return (rect == null || (rectAYN = rect.aYN(rectT)) == null) ? Rect.INSTANCE.n() : rectAYN;
            }
        }).n(new CN3() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$3
            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(Rect rect, Continuation continuation2) {
                if (Intrinsics.areEqual(rect, Rect.INSTANCE.n())) {
                    this.f20518n.z();
                } else {
                    TextToolbarHandler textToolbarHandler = this.f20518n.textToolbarHandler;
                    if (textToolbarHandler != null) {
                        Object objN2 = textToolbarHandler.n(this.f20518n, rect, continuation2);
                        return objN2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN2 : Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    private final boolean piY() {
        Rect rectXMQ;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            long jMUb = E().mUb();
            companion.az(snapshotNr, snapshotO, function1Uo);
            LayoutCoordinates layoutCoordinatesK = k();
            if (layoutCoordinatesK == null || (rectXMQ = SelectionManagerKt.xMQ(layoutCoordinatesK)) == null) {
                return false;
            }
            return SelectionManagerKt.nr(rectXMQ, jMUb);
        } catch (Throwable th) {
            companion.az(snapshotNr, snapshotO, function1Uo);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rV9(Ref.LongRef longRef, Ref.LongRef longRef2, TextFieldSelectionState textFieldSelectionState) {
        if ((longRef.element & 9223372034707292159L) != 9205357640488583168L) {
            Offset.Companion companion = Offset.INSTANCE;
            longRef.element = companion.rl();
            longRef2.element = companion.rl();
            textFieldSelectionState.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(PointerInputScope pointerInputScope, Continuation continuation) throws Throwable {
        TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$1;
        TextFieldSelectionState textFieldSelectionState;
        Ref.LongRef longRef;
        Throwable th;
        Ref.LongRef longRef2;
        if (continuation instanceof TextFieldSelectionState$detectCursorHandleDragGestures$1) {
            textFieldSelectionState$detectCursorHandleDragGestures$1 = (TextFieldSelectionState$detectCursorHandleDragGestures$1) continuation;
            int i2 = textFieldSelectionState$detectCursorHandleDragGestures$1.f20457o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$detectCursorHandleDragGestures$1.f20457o = i2 - Integer.MIN_VALUE;
            } else {
                textFieldSelectionState$detectCursorHandleDragGestures$1 = new TextFieldSelectionState$detectCursorHandleDragGestures$1(this, continuation);
            }
        }
        TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$12 = textFieldSelectionState$detectCursorHandleDragGestures$1;
        Object obj = textFieldSelectionState$detectCursorHandleDragGestures$12.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = textFieldSelectionState$detectCursorHandleDragGestures$12.f20457o;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef2 = (Ref.LongRef) textFieldSelectionState$detectCursorHandleDragGestures$12.f20455O;
            longRef = (Ref.LongRef) textFieldSelectionState$detectCursorHandleDragGestures$12.f20459t;
            textFieldSelectionState = (TextFieldSelectionState) textFieldSelectionState$detectCursorHandleDragGestures$12.f20456n;
            try {
                ResultKt.throwOnFailure(obj);
                rV9(longRef, longRef2, textFieldSelectionState);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                rV9(longRef, longRef2, textFieldSelectionState);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final Ref.LongRef longRef3 = new Ref.LongRef();
        Offset.Companion companion = Offset.INSTANCE;
        longRef3.element = companion.rl();
        final Ref.LongRef longRef4 = new Ref.LongRef();
        longRef4.element = companion.rl();
        try {
            Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    n(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                public final void n(long j2) {
                    longRef3.element = SelectionHandlesKt.n(this.E().mUb());
                    longRef4.element = Offset.INSTANCE.t();
                    this.Jk(true);
                    this.eTf();
                    this.UhV(Handle.f19677n, longRef3.element);
                }
            };
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TextFieldSelectionState.rV9(longRef3, longRef4, this);
                }
            };
            Function0<Unit> function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TextFieldSelectionState.rV9(longRef3, longRef4, this);
                }
            };
            Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                    n(pointerInputChange, offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                public final void n(PointerInputChange pointerInputChange, long j2) {
                    Ref.LongRef longRef5 = longRef4;
                    longRef5.element = Offset.Ik(longRef5.element, j2);
                    this.UhV(Handle.f19677n, Offset.Ik(longRef3.element, longRef4.element));
                    TextFieldSelectionState textFieldSelectionState2 = this;
                    if (textFieldSelectionState2.Mx(textFieldSelectionState2.J())) {
                        pointerInputChange.n();
                        HapticFeedback hapticFeedback = this.hapticFeedBack;
                        if (hapticFeedback != null) {
                            hapticFeedback.n(HapticFeedbackType.INSTANCE.xMQ());
                        }
                    }
                }
            };
            textFieldSelectionState$detectCursorHandleDragGestures$12.f20456n = this;
            textFieldSelectionState$detectCursorHandleDragGestures$12.f20459t = longRef3;
            textFieldSelectionState$detectCursorHandleDragGestures$12.f20455O = longRef4;
            textFieldSelectionState$detectCursorHandleDragGestures$12.f20457o = 1;
            if (DragGestureDetectorKt.az(pointerInputScope, function1, function0, function02, function2, textFieldSelectionState$detectCursorHandleDragGestures$12) == coroutine_suspended) {
                return coroutine_suspended;
            }
            textFieldSelectionState = this;
            longRef = longRef3;
            longRef2 = longRef4;
            rV9(longRef, longRef2, textFieldSelectionState);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            textFieldSelectionState = this;
            longRef = longRef3;
            th = th3;
            longRef2 = longRef4;
            rV9(longRef, longRef2, textFieldSelectionState);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object xg(Continuation continuation) {
        Object objN = fuX.o(fuX.r(SnapshotStateKt.Ik(new Function0<TextFieldCharSequence>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final TextFieldCharSequence invoke() {
                return this.f20514n.textFieldState.HI();
            }
        }), TextFieldSelectionState$observeTextChanges$3.f20515n), 1).n(new CN3() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(TextFieldCharSequence textFieldCharSequence, Continuation continuation2) {
                this.f20516n.Org(false);
                this.f20516n.How(TextToolbarState.f20573n);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        TextToolbarHandler textToolbarHandler = this.textToolbarHandler;
        if (textToolbarHandler != null) {
            textToolbarHandler.rl();
        }
    }

    public final Rect E() {
        TextLayoutResult textLayoutResultJ2 = this.textLayoutState.J2();
        if (textLayoutResultJ2 == null) {
            return Rect.INSTANCE.n();
        }
        TextFieldCharSequence textFieldCharSequenceHI = this.textFieldState.HI();
        if (!TextRange.KN(textFieldCharSequenceHI.getSelection())) {
            return Rect.INSTANCE.n();
        }
        Rect rectO = textLayoutResultJ2.O(TextRange.ty(textFieldCharSequenceHI.getSelection()));
        float fCoerceAtLeast = RangesKt.coerceAtLeast((float) Math.floor(this.density.l(TextFieldCursor_androidKt.n())), 1.0f);
        float f3 = fCoerceAtLeast / 2;
        float fCoerceAtLeast2 = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(textLayoutResultJ2.getLayoutInput().getLayoutDirection() == LayoutDirection.f34160n ? rectO.getLeft() + (fCoerceAtLeast / 2) : rectO.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - (fCoerceAtLeast / 2), ((int) (textLayoutResultJ2.getSize() >> 32)) - f3), f3);
        float fFloor = ((int) fCoerceAtLeast) % 2 == 1 ? ((float) Math.floor(fCoerceAtLeast2)) + 0.5f : (float) Math.rint(fCoerceAtLeast2);
        return new Rect(fFloor - f3, rectO.getTop(), fFloor + f3, rectO.xMQ());
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E2(Continuation continuation) {
        TextFieldSelectionState$canPaste$1 textFieldSelectionState$canPaste$1;
        TextFieldSelectionState textFieldSelectionState;
        boolean z2;
        ClipEntry clipEntry;
        if (continuation instanceof TextFieldSelectionState$canPaste$1) {
            textFieldSelectionState$canPaste$1 = (TextFieldSelectionState$canPaste$1) continuation;
            int i2 = textFieldSelectionState$canPaste$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$canPaste$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                textFieldSelectionState$canPaste$1 = new TextFieldSelectionState$canPaste$1(this, continuation);
            }
        }
        Object objN = textFieldSelectionState$canPaste$1.f20434t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = textFieldSelectionState$canPaste$1.J2;
        boolean z3 = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            if (!B()) {
                return Boxing.boxBoolean(false);
            }
            Clipboard clipboard = this.clipboard;
            if (clipboard != null) {
                textFieldSelectionState$canPaste$1.f20433n = this;
                textFieldSelectionState$canPaste$1.J2 = 1;
                objN = clipboard.n(textFieldSelectionState$canPaste$1);
                if (objN != coroutine_suspended) {
                    textFieldSelectionState = this;
                }
                return coroutine_suspended;
            }
            textFieldSelectionState = this;
            if (!z2) {
                return Boxing.boxBoolean(true);
            }
            Function0 function0 = textFieldSelectionState.receiveContentConfiguration;
            clipEntry = null;
            if ((function0 != null ? (ReceiveContentConfiguration) function0.invoke() : null) != null) {
                Clipboard clipboard2 = textFieldSelectionState.clipboard;
                if (clipboard2 != null) {
                    textFieldSelectionState$canPaste$1.f20433n = null;
                    textFieldSelectionState$canPaste$1.J2 = 2;
                    objN = clipboard2.n(textFieldSelectionState$canPaste$1);
                }
                if (clipEntry != null) {
                }
            }
            return Boxing.boxBoolean(z3);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
            clipEntry = (ClipEntry) objN;
            if (clipEntry != null) {
                z3 = true;
            }
            return Boxing.boxBoolean(z3);
        }
        textFieldSelectionState = (TextFieldSelectionState) textFieldSelectionState$canPaste$1.f20433n;
        ResultKt.throwOnFailure(objN);
        ClipEntry clipEntry2 = (ClipEntry) objN;
        z2 = clipEntry2 != null && ClipboardUtils_androidKt.t(clipEntry2);
        if (!z2) {
        }
    }

    public final Object EWS(PointerInputScope pointerInputScope, Function0 function0, Continuation continuation) {
        Object objTy = SelectionGesturesKt.ty(pointerInputScope, new TextFieldMouseSelectionObserver(function0), new TextFieldTextDragObserver(function0), continuation);
        return objTy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTy : Unit.INSTANCE;
    }

    public final Handle FX() {
        return (Handle) this.draggingHandle.getValue();
    }

    public final void G7() {
        this.textFieldState.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TextFieldHandleState I(boolean isStartHandle, boolean includePosition) {
        boolean z2;
        Rect rectXMQ;
        Rect rectXMQ2;
        Handle handle = isStartHandle ? Handle.f19679t : Handle.f19676O;
        TextLayoutResult textLayoutResultJ2 = this.textLayoutState.J2();
        if (textLayoutResultJ2 == null) {
            return TextFieldHandleState.INSTANCE.n();
        }
        long selection = this.textFieldState.HI().getSelection();
        if (TextRange.KN(selection)) {
            return TextFieldHandleState.INSTANCE.n();
        }
        long jD = D(isStartHandle);
        if (M() != InputType.f20416n) {
            z2 = false;
        } else {
            if (FX() != handle) {
                LayoutCoordinates layoutCoordinatesK = k();
                if ((layoutCoordinatesK == null || (rectXMQ2 = SelectionManagerKt.xMQ(layoutCoordinatesK)) == null) ? false : SelectionManagerKt.nr(rectXMQ2, jD)) {
                }
            }
            z2 = true;
        }
        if (!z2) {
            return TextFieldHandleState.INSTANCE.n();
        }
        if (!this.textFieldState.HI().xMQ()) {
            return TextFieldHandleState.INSTANCE.n();
        }
        ResolvedTextDirection resolvedTextDirectionT = textLayoutResultJ2.t(isStartHandle ? TextRange.ty(selection) : Math.max(TextRange.xMQ(selection) - 1, 0));
        boolean zAz = TextRange.az(selection);
        if (includePosition) {
            LayoutCoordinates layoutCoordinatesK2 = k();
            if (layoutCoordinatesK2 != null && (rectXMQ = SelectionManagerKt.xMQ(layoutCoordinatesK2)) != null) {
                jD = TextLayoutStateKt.n(jD, rectXMQ);
            }
        } else {
            jD = Offset.INSTANCE.rl();
        }
        return new TextFieldHandleState(true, jD, TextLayoutHelperKt.rl(textLayoutResultJ2, isStartHandle ? TextRange.ty(selection) : TextRange.xMQ(selection)), resolvedTextDirectionT, zAz, null);
    }

    public final void Jk(boolean z2) {
        this.isInTouchMode.setValue(Boolean.valueOf(z2));
    }

    public final InputType M() {
        return (InputType) this.directDragGestureInitiator.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Po6(Continuation continuation) throws Throwable {
        TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1;
        TextFieldSelectionState textFieldSelectionState;
        if (continuation instanceof TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) {
            textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 = (TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) continuation;
            int i2 = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 = new TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1(this, continuation);
            }
        }
        Object obj = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.f20543t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.J2;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textFieldSelectionState = (TextFieldSelectionState) textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.f20542n;
            try {
                ResultKt.throwOnFailure(obj);
                textFieldSelectionState.Org(false);
                if (textFieldSelectionState.dR0() != TextToolbarState.f20573n) {
                    textFieldSelectionState.z();
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                textFieldSelectionState.Org(false);
                if (textFieldSelectionState.dR0() != TextToolbarState.f20573n) {
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 = new TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2(this, null);
            textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.f20542n = this;
            textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.J2 = 1;
            if (Lu.J2(textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2, textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            textFieldSelectionState = this;
            textFieldSelectionState.Org(false);
            if (textFieldSelectionState.dR0() != TextToolbarState.f20573n) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            textFieldSelectionState = this;
            textFieldSelectionState.Org(false);
            if (textFieldSelectionState.dR0() != TextToolbarState.f20573n) {
                textFieldSelectionState.z();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(boolean z2, Continuation continuation) {
        TextFieldSelectionState$copy$1 textFieldSelectionState$copy$1;
        TextFieldSelectionState textFieldSelectionState;
        if (continuation instanceof TextFieldSelectionState$copy$1) {
            textFieldSelectionState$copy$1 = (TextFieldSelectionState$copy$1) continuation;
            int i2 = textFieldSelectionState$copy$1.f20437r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$copy$1.f20437r = i2 - Integer.MIN_VALUE;
            } else {
                textFieldSelectionState$copy$1 = new TextFieldSelectionState$copy$1(this, continuation);
            }
        }
        Object obj = textFieldSelectionState$copy$1.f20435O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = textFieldSelectionState$copy$1.f20437r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            TextFieldCharSequence textFieldCharSequenceHI = this.textFieldState.HI();
            if (TextRange.KN(textFieldCharSequenceHI.getSelection())) {
                return Unit.INSTANCE;
            }
            AnnotatedString annotatedString = new AnnotatedString(TextFieldCharSequenceKt.n(textFieldCharSequenceHI).toString(), null, 2, null);
            Clipboard clipboard = this.clipboard;
            if (clipboard != null) {
                ClipEntry clipEntryJ2 = ClipboardUtils_androidKt.J2(annotatedString);
                textFieldSelectionState$copy$1.f20436n = this;
                textFieldSelectionState$copy$1.f20438t = z2;
                textFieldSelectionState$copy$1.f20437r = 1;
                if (clipboard.rl(clipEntryJ2, textFieldSelectionState$copy$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            textFieldSelectionState = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = textFieldSelectionState$copy$1.f20438t;
            textFieldSelectionState = (TextFieldSelectionState) textFieldSelectionState$copy$1.f20436n;
            ResultKt.throwOnFailure(obj);
        }
        if (!z2) {
            return Unit.INSTANCE;
        }
        textFieldSelectionState.textFieldState.KN();
        return Unit.INSTANCE;
    }

    public final Object U(PointerInputScope pointerInputScope, Continuation continuation) {
        Object objETf = pointerInputScope.eTf(new TextFieldSelectionState$detectTouchMode$2(this, null), continuation);
        return objETf == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objETf : Unit.INSTANCE;
    }

    public final boolean e() {
        return TextRange.mUb(this.textFieldState.HI().getSelection()) != this.textFieldState.HI().length();
    }

    public final TextFieldHandleState eF(boolean includePosition) {
        TextFieldCharSequence textFieldCharSequenceHI = this.textFieldState.HI();
        boolean zGR = GR();
        boolean z2 = M() == InputType.f20416n;
        Handle handleFX = FX();
        if (zGR && z2 && TextRange.KN(textFieldCharSequenceHI.getSelection()) && textFieldCharSequenceHI.xMQ() && textFieldCharSequenceHI.length() > 0 && (handleFX == Handle.f19677n || piY())) {
            return new TextFieldHandleState(true, includePosition ? E().mUb() : Offset.INSTANCE.rl(), 0.0f, ResolvedTextDirection.f33908n, false, null);
        }
        return TextFieldHandleState.INSTANCE.n();
    }

    public final void eWT(InputType inputType) {
        this.directDragGestureInitiator.setValue(inputType);
    }

    public final boolean fD() {
        return (TextRange.KN(this.textFieldState.HI().getSelection()) || !B() || this.isPassword) ? false : true;
    }

    public final Object fcU(PointerInputScope pointerInputScope, boolean z2, Continuation continuation) {
        Object objJ2 = Lu.J2(new TextFieldSelectionState$selectionHandleGestures$2(this, pointerInputScope, z2, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    public final void g() {
        Function0 function0 = this.requestAutofillAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void hRu(HapticFeedback hapticFeedBack, Clipboard clipboard, TextToolbarHandler showTextToolbar, Density density, boolean enabled, boolean readOnly, boolean isPassword) {
        if (!enabled) {
            z();
        }
        this.hapticFeedBack = hapticFeedBack;
        this.clipboard = clipboard;
        this.textToolbarHandler = showTextToolbar;
        this.density = density;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.isPassword = isPassword;
    }

    public final boolean iF() {
        return (TextRange.KN(this.textFieldState.HI().getSelection()) || this.isPassword) ? false : true;
    }

    /* JADX INFO: renamed from: ijL, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    public final Object jB(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, final Function0 function0, final Function0 function02, Continuation continuation) {
        Object objGh = TapGestureDetectorKt.gh(pointerInputScope, new TextFieldSelectionState$detectTextFieldTapGestures$2(mutableInteractionSource, this, null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                n(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            public final void n(long j2) {
                TextFieldSelectionStateKt.t(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3.1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "onTapTextField";
                    }
                });
                function0.invoke();
                if (this.enabled && this.getIsFocused()) {
                    if (!this.readOnly) {
                        function02.invoke();
                        if (this.textFieldState.HI().length() > 0) {
                            this.Org(true);
                        }
                    }
                    this.How(TextToolbarState.f20573n);
                    long jRl = this.textLayoutState.rl(j2);
                    TextFieldSelectionState textFieldSelectionState = this;
                    textFieldSelectionState.Mx(TextLayoutStateKt.rl(textFieldSelectionState.textLayoutState, jRl));
                }
            }
        }, continuation);
        return objGh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objGh : Unit.INSTANCE;
    }

    public final boolean m() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    public final void mYa(Function0 function0) {
        this.requestAutofillAction = function0;
    }

    public final void n1(boolean z2) {
        this.isFocused = z2;
    }

    public final Object nHg(PointerInputScope pointerInputScope, Continuation continuation) {
        Object objJ2 = Lu.J2(new TextFieldSelectionState$cursorHandleGestures$2(this, pointerInputScope, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
    
        if (r4.C(r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (C(r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ofS(Continuation continuation) {
        TextFieldSelectionState$paste$1 textFieldSelectionState$paste$1;
        ReceiveContentConfiguration receiveContentConfiguration;
        TextFieldSelectionState textFieldSelectionState;
        ClipEntry clipEntry;
        ClipEntry clipEntry2;
        String strN;
        if (continuation instanceof TextFieldSelectionState$paste$1) {
            textFieldSelectionState$paste$1 = (TextFieldSelectionState$paste$1) continuation;
            int i2 = textFieldSelectionState$paste$1.f20521r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$paste$1.f20521r = i2 - Integer.MIN_VALUE;
            } else {
                textFieldSelectionState$paste$1 = new TextFieldSelectionState$paste$1(this, continuation);
            }
        }
        Object objN = textFieldSelectionState$paste$1.f20519O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = textFieldSelectionState$paste$1.f20521r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Function0 function0 = this.receiveContentConfiguration;
            if (function0 == null || (receiveContentConfiguration = (ReceiveContentConfiguration) function0.invoke()) == null) {
                textFieldSelectionState$paste$1.f20521r = 1;
            } else {
                Clipboard clipboard = this.clipboard;
                if (clipboard != null) {
                    textFieldSelectionState$paste$1.f20520n = this;
                    textFieldSelectionState$paste$1.f20522t = receiveContentConfiguration;
                    textFieldSelectionState$paste$1.f20521r = 2;
                    objN = clipboard.n(textFieldSelectionState$paste$1);
                    if (objN != coroutine_suspended) {
                        textFieldSelectionState = this;
                        clipEntry = (ClipEntry) objN;
                        if (clipEntry != null) {
                        }
                    }
                } else {
                    textFieldSelectionState = this;
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            ResultKt.throwOnFailure(objN);
            return Unit.INSTANCE;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
            return Unit.INSTANCE;
        }
        receiveContentConfiguration = (ReceiveContentConfiguration) textFieldSelectionState$paste$1.f20522t;
        textFieldSelectionState = (TextFieldSelectionState) textFieldSelectionState$paste$1.f20520n;
        ResultKt.throwOnFailure(objN);
        clipEntry = (ClipEntry) objN;
        if (clipEntry != null) {
            TransferableContent transferableContentO = receiveContentConfiguration.getReceiveContentListener().O(new TransferableContent(clipEntry, clipEntry.rl(), TransferableContent.Source.INSTANCE.n(), null, 8, null));
            if (transferableContentO != null && (clipEntry2 = transferableContentO.getClipEntry()) != null && (strN = TransferableContent_androidKt.n(clipEntry2)) != null) {
                TransformedTextFieldState.aYN(textFieldSelectionState.textFieldState, strN, false, TextFieldEditUndoBehavior.f20585O, false, 10, null);
            }
            return Unit.INSTANCE;
        }
        textFieldSelectionState$paste$1.f20520n = null;
        textFieldSelectionState$paste$1.f20522t = null;
        textFieldSelectionState$paste$1.f20521r = 3;
    }

    public final void qm(Function0 function0) {
        this.receiveContentConfiguration = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s7N(Continuation continuation) {
        TextFieldSelectionState$cut$1 textFieldSelectionState$cut$1;
        TextFieldSelectionState textFieldSelectionState;
        if (continuation instanceof TextFieldSelectionState$cut$1) {
            textFieldSelectionState$cut$1 = (TextFieldSelectionState$cut$1) continuation;
            int i2 = textFieldSelectionState$cut$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$cut$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                textFieldSelectionState$cut$1 = new TextFieldSelectionState$cut$1(this, continuation);
            }
        }
        Object obj = textFieldSelectionState$cut$1.f20454t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = textFieldSelectionState$cut$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            TextFieldCharSequence textFieldCharSequenceHI = this.textFieldState.HI();
            if (TextRange.KN(textFieldCharSequenceHI.getSelection())) {
                return Unit.INSTANCE;
            }
            AnnotatedString annotatedString = new AnnotatedString(TextFieldCharSequenceKt.n(textFieldCharSequenceHI).toString(), null, 2, null);
            Clipboard clipboard = this.clipboard;
            if (clipboard != null) {
                ClipEntry clipEntryJ2 = ClipboardUtils_androidKt.J2(annotatedString);
                textFieldSelectionState$cut$1.f20453n = this;
                textFieldSelectionState$cut$1.J2 = 1;
                if (clipboard.rl(clipEntryJ2, textFieldSelectionState$cut$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            textFieldSelectionState = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textFieldSelectionState = (TextFieldSelectionState) textFieldSelectionState$cut$1.f20453n;
            ResultKt.throwOnFailure(obj);
        }
        textFieldSelectionState.textFieldState.gh();
        return Unit.INSTANCE;
    }

    public final void ul(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    public final void wTp() {
        if (!TextRange.KN(this.textFieldState.HI().getSelection())) {
            this.textFieldState.Uo();
        }
        Org(false);
        How(TextToolbarState.f20573n);
    }

    public TextFieldSelectionState(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, Density density, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = z2;
        this.readOnly = z3;
        this.isFocused = z4;
        this.isPassword = z5;
        Offset.Companion companion = Offset.INSTANCE;
        this.startTextLayoutPositionInWindow = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(companion.rl()), null, 2, null);
        this.rawHandleDragPosition = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(companion.rl()), null, 2, null);
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.directDragGestureInitiator = SnapshotStateKt__SnapshotStateKt.O(InputType.f20416n, null, 2, null);
        this.showCursorHandle = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
        this.textToolbarState = SnapshotStateKt__SnapshotStateKt.O(TextToolbarState.f20573n, null, 2, null);
        this.previousRawDragOffset = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eTf() {
        HV(p5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long i(TextFieldCharSequence textFieldCharSequence, int startOffset, int endOffset, boolean isStartHandle, SelectionAdjustment adjustment, boolean allowPreviousSelectionCollapsed, boolean isStartOfSelection) {
        boolean z2;
        HapticFeedback hapticFeedback;
        TextRange textRangeRl = TextRange.rl(textFieldCharSequence.getSelection());
        long packedValue = textRangeRl.getPackedValue();
        if (isStartOfSelection || (!allowPreviousSelectionCollapsed && TextRange.KN(packedValue))) {
            textRangeRl = null;
        }
        long jY = Y(startOffset, endOffset, textRangeRl, isStartHandle, adjustment);
        if (!TextRange.Uo(jY, textFieldCharSequence.getSelection())) {
            if (TextRange.az(jY) != TextRange.az(textFieldCharSequence.getSelection()) && TextRange.Uo(TextRangeKt.rl(TextRange.xMQ(jY), TextRange.ty(jY)), textFieldCharSequence.getSelection())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (m() && !z2 && (hapticFeedback = this.hapticFeedBack) != null) {
                hapticFeedback.n(HapticFeedbackType.INSTANCE.xMQ());
            }
        }
        return jY;
    }

    private final long p5() {
        LayoutCoordinates layoutCoordinatesK = k();
        if (layoutCoordinatesK != null) {
            return LayoutCoordinatesKt.Uo(layoutCoordinatesK);
        }
        return Offset.INSTANCE.rl();
    }

    public final void How(TextToolbarState textToolbarState) {
        GD(textToolbarState);
    }

    public final long J() {
        if ((a() & 9223372034707292159L) == 9205357640488583168L) {
            return Offset.INSTANCE.rl();
        }
        if ((Nxk() & 9223372034707292159L) == 9205357640488583168L) {
            return TextLayoutStateKt.rl(this.textLayoutState, a());
        }
        return Offset.Ik(a(), Offset.ck(Nxk(), p5()));
    }

    public final void P5() {
        z();
        this.clipboard = null;
        this.hapticFeedBack = null;
    }

    public final void UhV(Handle handle, long position) {
        ul(handle);
        Rl(position);
    }

    public final boolean te() {
        if (B() && TextRange.KN(this.textFieldState.HI().getSelection())) {
            return true;
        }
        return false;
    }
}
