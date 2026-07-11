package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000e*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020!2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b.\u0010/J5\u00105\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\n\u0012\b\u0012\u0004\u0012\u00020%04032\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001aH\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0000¢\u0006\u0004\b9\u0010\bJ\u000f\u0010:\u001a\u00020\u001aH\u0000¢\u0006\u0004\b:\u00108J\u000f\u0010;\u001a\u00020\u001aH\u0000¢\u0006\u0004\b;\u00108J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0000¢\u0006\u0004\b?\u0010\bJ\r\u0010@\u001a\u00020\u0006¢\u0006\u0004\b@\u0010\bJ\u0015\u0010B\u001a\u00020A2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bB\u0010CJ4\u0010F\u001a\u00020\u001a2\b\u0010D\u001a\u0004\u0018\u00010\u00152\u0006\u0010E\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ2\u0010H\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001aH\u0001¢\u0006\u0004\bJ\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001a0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010ORF\u0010[\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u00060S2\u0014\u0010T\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u00060S8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR0\u0010g\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0006\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010V\u001a\u0004\be\u0010X\"\u0004\bf\u0010ZR$\u0010o\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR+\u0010}\u001a\u00020\u001a2\u0006\u0010x\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010O\u001a\u0004\bz\u00108\"\u0004\b{\u0010|R\u001e\u0010E\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b~\u0010\u007fR5\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00132\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010/\"\u0006\b\u0084\u0001\u0010\u0085\u0001R7\u0010\u008c\u0001\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u00158@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0087\u0001\u0010O\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R7\u0010\u0090\u0001\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u00158@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u008d\u0001\u0010O\u001a\u0006\b\u008e\u0001\u0010\u0089\u0001\"\u0006\b\u008f\u0001\u0010\u008b\u0001R:\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010x\u001a\u0004\u0018\u00010\u00158F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\b\u0017\u0010O\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R:\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010x\u001a\u0004\u0018\u00010\u00158F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0004\b?\u0010O\u001a\u0006\b\u0096\u0001\u0010\u0092\u0001\"\u0006\b\u0097\u0001\u0010\u0094\u0001R6\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0099\u00012\t\u0010x\u001a\u0005\u0018\u00010\u0099\u00018F@BX\u0086\u008e\u0002¢\u0006\u0016\n\u0004\b,\u0010O\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R;\u0010¡\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010x\u001a\u0004\u0018\u00010\u00158F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0083\u0001\u0010O\u001a\u0006\b\u009f\u0001\u0010\u0092\u0001\"\u0006\b \u0001\u0010\u0094\u0001R1\u0010¨\u0001\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b\f\u0010¢\u0001\u0012\u0005\b§\u0001\u0010\b\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R0\u0010«\u0001\u001a\u00020\u001a2\u0007\u0010\u0080\u0001\u001a\u00020\u001a8\u0000@@X\u0080\u000e¢\u0006\u0016\n\u0006\b\u009f\u0001\u0010\u0088\u0001\u001a\u0005\b©\u0001\u00108\"\u0005\bª\u0001\u0010|R\u0016\u0010\u00ad\u0001\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u00108R\u0016\u0010¯\u0001\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u00108R.\u0010´\u0001\u001a\u0004\u0018\u00010%2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R(\u0010·\u0001\u001a\u00020\u001a2\u0007\u0010\u0080\u0001\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bµ\u0001\u00108\"\u0005\b¶\u0001\u0010|R\u0014\u0010º\u0001\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0015\u0010¾\u0001\u001a\u00030»\u00018F¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0015\u0010À\u0001\u001a\u00030»\u00018F¢\u0006\b\u001a\u0006\b¿\u0001\u0010½\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Á\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "selectionRegistrar", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "", "m", "()V", "ijL", "pJg", "Landroidx/compose/ui/geometry/Rect;", "r", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "block", "bzg", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "offset", "ty", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "position", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "piY", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "previousHandlePosition", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "E2", "(JJZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "selectionLayout", "Landroidx/compose/foundation/text/selection/Selection;", "newSelection", "M7", "(Landroidx/compose/foundation/text/selection/SelectionLayout;Landroidx/compose/foundation/text/selection/Selection;)V", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchor", "Landroidx/compose/foundation/text/selection/Selectable;", "ck", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;", "jB", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "", "selectableId", "previousSelection", "Lkotlin/Pair;", "Landroidx/collection/LongObjectMap;", "P5", "(JLandroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "s7N", "()Z", "U", "rV9", "v", "Landroidx/compose/ui/text/AnnotatedString;", "iF", "()Landroidx/compose/ui/text/AnnotatedString;", "HI", "Xw", "Landroidx/compose/foundation/text/TextDragObserver;", "N", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "newPosition", "previousPosition", "xg", "(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "eTf", "(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "z", c.f62177j, "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/runtime/MutableState;", "rl", "Landroidx/compose/runtime/MutableState;", "_selection", "t", "_isInTouchMode", "Lkotlin/Function1;", "newOnSelectionChange", "nr", "Lkotlin/jvm/functions/Function1;", "te", "()Lkotlin/jvm/functions/Function1;", "GR", "(Lkotlin/jvm/functions/Function1;)V", "onSelectionChange", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "O", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "J", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hapticFeedBack", "J2", "getOnCopyHandler", "I", "onCopyHandler", "Landroidx/compose/ui/platform/TextToolbar;", "Uo", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "dR0", "(Landroidx/compose/ui/platform/TextToolbar;)V", "textToolbar", "Landroidx/compose/ui/focus/FocusRequester;", "KN", "Landroidx/compose/ui/focus/FocusRequester;", "ViF", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusRequester", "<set-?>", "xMQ", "nY", "D", "(Z)V", "hasFocus", "mUb", "Landroidx/compose/ui/geometry/Offset;", "value", "gh", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Ik", "p5", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "containerLayoutCoordinates", "qie", "Z", "()J", "E", "(J)V", "dragBeginPosition", "az", "XQ", "M", "dragTotalDistance", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()Landroidx/compose/ui/geometry/Offset;", "k", "(Landroidx/compose/ui/geometry/Offset;)V", "startHandlePosition", "aYN", "B", "endHandlePosition", "Landroidx/compose/foundation/text/Handle;", "S", "()Landroidx/compose/foundation/text/Handle;", "FX", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "o", "eF", "currentDragPosition", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getPreviousSelectionLayout$foundation_release", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "setPreviousSelectionLayout$foundation_release", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)V", "getPreviousSelectionLayout$foundation_release$annotations", "previousSelectionLayout", "getShowToolbar$foundation_release", "Y", "showToolbar", "nHg", "isDraggingInProgress", "e", "shouldShowMagnifier", "fD", "()Landroidx/compose/foundation/text/selection/Selection;", "Nxk", "(Landroidx/compose/foundation/text/selection/Selection;)V", "selection", "wTp", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "isInTouchMode", "g", "()Landroidx/compose/ui/Modifier;", "modifier", "", "X", "()F", "startHandleLineHeight", "WPU", "endHandleLineHeight", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 8 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,1107:1\n85#2:1108\n113#2,2:1109\n85#2:1111\n113#2,2:1112\n85#2:1114\n113#2,2:1115\n85#2:1117\n113#2,2:1118\n85#2:1120\n113#2,2:1121\n85#2:1123\n113#2,2:1124\n85#2:1127\n113#2,2:1128\n1#3:1126\n1#3:1192\n278#4:1130\n278#4:1131\n278#4:1207\n107#5,7:1132\n96#5,5:1139\n269#6,3:1144\n34#6,6:1147\n272#6:1153\n87#6,2:1154\n34#6,6:1156\n89#6:1162\n34#6,6:1163\n102#6,2:1169\n34#6,6:1171\n104#6:1177\n34#6,6:1179\n439#6,3:1185\n34#6,4:1188\n39#6:1193\n442#6:1194\n70#6,6:1201\n34#6,6:1208\n102#6,2:1214\n34#6,6:1216\n104#6:1222\n102#6,2:1223\n34#6,6:1225\n104#6:1231\n1565#7:1178\n56#8,6:1195\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n131#1:1108\n131#1:1109,2\n181#1:1111\n181#1:1112,2\n188#1:1114\n188#1:1115,2\n196#1:1117\n196#1:1118,2\n204#1:1120\n204#1:1121,2\n211#1:1123\n211#1:1124,2\n234#1:1127\n234#1:1128,2\n619#1:1192\n387#1:1130\n399#1:1131\n884#1:1207\n411#1:1132,7\n412#1:1139,5\n422#1:1144,3\n422#1:1147,6\n422#1:1153\n445#1:1154,2\n445#1:1156,6\n445#1:1162\n472#1:1163,6\n532#1:1169,2\n532#1:1171,6\n532#1:1177\n545#1:1179,6\n619#1:1185,3\n619#1:1188,4\n619#1:1193\n619#1:1194\n877#1:1201,6\n895#1:1208,6\n910#1:1214,2\n910#1:1216,6\n910#1:1222\n922#1:1223,2\n922#1:1225,6\n922#1:1231\n544#1:1178\n634#1:1195,6\n*E\n"})
public final class SelectionManager {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final MutableState endHandlePosition;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final MutableState currentDragPosition;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function1 onCopyHandler;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private HapticFeedback hapticFeedBack;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private TextToolbar textToolbar;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MutableState dragTotalDistance;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private LayoutCoordinates containerLayoutCoordinates;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private Offset previousPosition;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SelectionRegistrarImpl selectionRegistrar;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean showToolbar;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final MutableState dragBeginPosition;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SelectionLayout previousSelectionLayout;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableState startHandlePosition;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState _selection = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState _isInTouchMode = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Function1 onSelectionChange = new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
            n(selection);
            return Unit.INSTANCE;
        }

        public final void n(Selection selection) {
            this.f20914n.Nxk(selection);
        }
    };

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private FocusRequester focusRequester = new FocusRequester();

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableState hasFocus = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public final void piY(long position, boolean isStartHandle, SelectionAdjustment adjustment) {
        this.previousSelectionLayout = null;
        eTf(position, Offset.INSTANCE.rl(), isStartHandle, adjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Offset offset) {
        this.endHandlePosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(long j2) {
        this.dragBeginPosition.setValue(Offset.nr(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void FX(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(long j2) {
        this.dragTotalDistance.setValue(Offset.nr(j2));
    }

    private final Modifier bzg(Modifier modifier, final Function0 function0) {
        return SuspendingPointerInputFilterKt.nr(modifier, Unit.INSTANCE, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", i = {0}, l = {754, 760}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0 J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ SelectionManager f20911O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f20912n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f20913t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SelectionManager selectionManager, Function0 function0, Continuation continuation) {
                    super(2, continuation);
                    this.f20911O = selectionManager;
                    this.J2 = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f20911O, this.J2, continuation);
                    anonymousClass1.f20913t = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
                
                    if (r11 == r0) goto L16;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    AwaitPointerEventScope awaitPointerEventScope;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f20912n;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                ResultKt.throwOnFailure(obj);
                                anonymousClass1 = this;
                                if (!((Boolean) obj).booleanValue() && !anonymousClass1.f20911O.nHg()) {
                                    anonymousClass1.J2.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        awaitPointerEventScope = (AwaitPointerEventScope) this.f20913t;
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = this;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.f20913t;
                        this.f20913t = awaitPointerEventScope2;
                        this.f20912n = 1;
                        anonymousClass1 = this;
                        obj = TapGestureDetectorKt.KN(awaitPointerEventScope2, false, null, anonymousClass1, 2, null);
                        if (obj != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return coroutine_suspended;
                    }
                    PointerEventPass pointerEventPass = PointerEventPass.f32078n;
                    anonymousClass1.f20913t = null;
                    anonymousClass1.f20912n = 2;
                    obj = DragGestureDetectorKt.rl(awaitPointerEventScope, (PointerInputChange) obj, pointerEventPass, this);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                Object objO = ForEachGestureKt.O(pointerInputScope, new AnonymousClass1(this.f20909n, function0, null), continuation);
                return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eF(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Offset offset) {
        this.startHandlePosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        Offset offsetNr;
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        Selection selectionFD = fD();
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Offset offset = null;
        Selectable selectableCk = (selectionFD == null || (start = selectionFD.getStart()) == null) ? null : ck(start);
        Selectable selectableCk2 = (selectionFD == null || (end = selectionFD.getEnd()) == null) ? null : ck(end);
        LayoutCoordinates layoutCoordinatesFD = selectableCk != null ? selectableCk.fD() : null;
        LayoutCoordinates layoutCoordinatesFD2 = selectableCk2 != null ? selectableCk2.fD() : null;
        if (selectionFD == null || layoutCoordinates == null || !layoutCoordinates.nr() || (layoutCoordinatesFD == null && layoutCoordinatesFD2 == null)) {
            k(null);
            B(null);
            return;
        }
        Rect rectXMQ = SelectionManagerKt.xMQ(layoutCoordinates);
        if (layoutCoordinatesFD != null) {
            long jUo = selectableCk.Uo(selectionFD, true);
            if ((jUo & 9223372034707292159L) == 9205357640488583168L) {
                offsetNr = null;
            } else {
                offsetNr = Offset.nr(layoutCoordinates.nHg(layoutCoordinatesFD, jUo));
                long packedValue = offsetNr.getPackedValue();
                if (S() != Handle.f19679t && !SelectionManagerKt.nr(rectXMQ, packedValue)) {
                }
            }
        }
        k(offsetNr);
        if (layoutCoordinatesFD2 != null) {
            long jUo2 = selectableCk2.Uo(selectionFD, false);
            if ((9223372034707292159L & jUo2) != 9205357640488583168L) {
                Offset offsetNr2 = Offset.nr(layoutCoordinates.nHg(layoutCoordinatesFD2, jUo2));
                long packedValue2 = offsetNr2.getPackedValue();
                if (S() == Handle.f19676O || SelectionManagerKt.nr(rectXMQ, packedValue2)) {
                    offset = offsetNr2;
                }
            }
        }
        B(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long ty(LayoutCoordinates layoutCoordinates, long offset) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        return (layoutCoordinates2 == null || !layoutCoordinates2.nr()) ? Offset.INSTANCE.rl() : jB().nHg(layoutCoordinates, offset);
    }

    public final void D(boolean z2) {
        this.hasFocus.setValue(Boolean.valueOf(z2));
    }

    public final void GR(final Function1 function1) {
        this.onSelectionChange = new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
                n(selection);
                return Unit.INSTANCE;
            }

            public final void n(Selection selection) {
                this.f20915n.Nxk(selection);
                function1.invoke(selection);
            }
        };
    }

    public final void I(Function1 function1) {
        this.onCopyHandler = function1;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final void J(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final TextDragObserver N(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            private final void O() {
                this.Y(true);
                this.FX(null);
                this.eF(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void n(long point) {
                LayoutCoordinates layoutCoordinatesFD;
                Offset offsetT = isStartHandle ? this.T() : this.aYN();
                if (offsetT != null) {
                    offsetT.getPackedValue();
                    Selection selectionFD = this.fD();
                    if (selectionFD == null) {
                        return;
                    }
                    Selectable selectableCk = this.ck(isStartHandle ? selectionFD.getStart() : selectionFD.getEnd());
                    if (selectableCk == null || (layoutCoordinatesFD = selectableCk.fD()) == null) {
                        return;
                    }
                    long jUo = selectableCk.Uo(selectionFD, isStartHandle);
                    if ((9223372034707292159L & jUo) == 9205357640488583168L) {
                        return;
                    }
                    long jN = SelectionHandlesKt.n(jUo);
                    SelectionManager selectionManager = this;
                    selectionManager.eF(Offset.nr(selectionManager.jB().nHg(layoutCoordinatesFD, jN)));
                    this.FX(isStartHandle ? Handle.f19679t : Handle.f19676O);
                    this.Y(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void nr(long delta) {
                if (this.S() == null) {
                    return;
                }
                SelectionManager selectionManager = this;
                selectionManager.M(Offset.Ik(selectionManager.XQ(), delta));
                long jIk = Offset.Ik(this.Z(), this.XQ());
                if (this.xg(Offset.nr(jIk), this.Z(), isStartHandle, SelectionAdjustment.INSTANCE.qie())) {
                    this.E(jIk);
                    this.M(Offset.INSTANCE.t());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void rl(long startPoint) {
                if (this.S() == null) {
                    return;
                }
                Selection selectionFD = this.fD();
                Intrinsics.checkNotNull(selectionFD);
                Object objRl = this.selectionRegistrar.az().rl((isStartHandle ? selectionFD.getStart() : selectionFD.getEnd()).getSelectableId());
                if (objRl == null) {
                    InlineClassHelperKt.nr("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new KotlinNothingValueException();
                }
                Selectable selectable = (Selectable) objRl;
                LayoutCoordinates layoutCoordinatesFD = selectable.fD();
                if (layoutCoordinatesFD == null) {
                    InlineClassHelperKt.nr("Current selectable should have layout coordinates.");
                    throw new KotlinNothingValueException();
                }
                long jUo = selectable.Uo(selectionFD, isStartHandle);
                if ((9223372034707292159L & jUo) == 9205357640488583168L) {
                    return;
                }
                long jN = SelectionHandlesKt.n(jUo);
                SelectionManager selectionManager = this;
                selectionManager.E(selectionManager.jB().nHg(layoutCoordinatesFD, jN));
                this.M(Offset.INSTANCE.t());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                O();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                O();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void t() {
                O();
            }
        };
    }

    public final void Nxk(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            m();
        }
    }

    public final Handle S() {
        return (Handle) this.draggingHandle.getValue();
    }

    public final Offset T() {
        return (Offset) this.startHandlePosition.getValue();
    }

    public final void U() {
        List listWPU = this.selectionRegistrar.WPU(jB());
        if (listWPU.isEmpty()) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMapT = LongObjectMapKt.t();
        int size = listWPU.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) listWPU.get(i2);
            Selection selectionGh = selectable.gh();
            if (selectionGh != null) {
                if (selection == null) {
                    selection = selectionGh;
                }
                mutableLongObjectMapT.ty(selectable.mUb(), selectionGh);
                selection2 = selectionGh;
            }
        }
        if (mutableLongObjectMapT.O()) {
            return;
        }
        if (selection != selection2) {
            Intrinsics.checkNotNull(selection);
            Selection.AnchorInfo start = selection.getStart();
            Intrinsics.checkNotNull(selection2);
            selection = new Selection(start, selection2.getEnd(), false);
        }
        this.selectionRegistrar.S(mutableLongObjectMapT);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    /* JADX INFO: renamed from: ViF, reason: from getter */
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final long XQ() {
        return ((Offset) this.dragTotalDistance.getValue()).getPackedValue();
    }

    public final void Xw() {
        HapticFeedback hapticFeedback;
        this.selectionRegistrar.S(LongObjectMapKt.n());
        Y(false);
        if (fD() != null) {
            this.onSelectionChange.invoke(null);
            if (!wTp() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.n(HapticFeedbackType.INSTANCE.xMQ());
        }
    }

    public final void Y(boolean z2) {
        this.showToolbar = z2;
        pJg();
    }

    public final long Z() {
        return ((Offset) this.dragBeginPosition.getValue()).getPackedValue();
    }

    public final void a(boolean z2) {
        if (((Boolean) this._isInTouchMode.getValue()).booleanValue() != z2) {
            this._isInTouchMode.setValue(Boolean.valueOf(z2));
            pJg();
        }
    }

    public final Offset aYN() {
        return (Offset) this.endHandlePosition.getValue();
    }

    public final Selectable ck(Selection.AnchorInfo anchor) {
        return (Selectable) this.selectionRegistrar.az().rl(anchor.getSelectableId());
    }

    public final void dR0(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final boolean eTf(long position, long previousHandlePosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        FX(isStartHandle ? Handle.f19679t : Handle.f19676O);
        eF(Offset.nr(position));
        SelectionLayout selectionLayoutE2 = E2(position, previousHandlePosition, isStartHandle);
        if (selectionLayoutE2 == null || !selectionLayoutE2.xMQ(this.previousSelectionLayout)) {
            return false;
        }
        Selection selectionN = adjustment.n(selectionLayoutE2);
        if (!Intrinsics.areEqual(selectionN, fD())) {
            M7(selectionLayoutE2, selectionN);
        }
        this.previousSelectionLayout = selectionLayoutE2;
        return true;
    }

    public final Selection fD() {
        return (Selection) this._selection.getValue();
    }

    public final Modifier g() {
        Modifier modifierT = Modifier.INSTANCE;
        Modifier modifierN = KeyInputModifierKt.n(SelectionGesturesKt.r(FocusableKt.rl(FocusChangedModifierKt.n(FocusRequesterModifierKt.n(OnGloballyPositionedModifierKt.n(bzg(modifierT, new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
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
                this.f20904n.Xw();
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                n(layoutCoordinates);
                return Unit.INSTANCE;
            }

            public final void n(LayoutCoordinates layoutCoordinates) {
                this.f20905n.p5(layoutCoordinates);
            }
        }), this.focusRequester), new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                n(focusState);
                return Unit.INSTANCE;
            }

            public final void n(FocusState focusState) {
                if (!focusState.rl() && this.f20906n.nY()) {
                    this.f20906n.Xw();
                }
                this.f20906n.D(focusState.rl());
            }
        }), false, null, 3, null), new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z2) {
                this.f20907n.a(z2);
            }
        }), new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return n(keyEvent.getNativeKeyEvent());
            }

            public final Boolean n(android.view.KeyEvent keyEvent) {
                boolean z2;
                if (SelectionManager_androidKt.rl(keyEvent)) {
                    this.f20908n.HI();
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        });
        if (e()) {
            modifierT = SelectionManager_androidKt.t(modifierT, this);
        }
        return modifierN.Zmq(modifierT);
    }

    public final LayoutCoordinates jB() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            InlineClassHelperKt.rl("null coordinates");
            throw new KotlinNothingValueException();
        }
        if (!layoutCoordinates.nr()) {
            InlineClassHelperKt.n("unattached coordinates");
        }
        return layoutCoordinates;
    }

    public final boolean nY() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final Offset o() {
        return (Offset) this.currentDragPosition.getValue();
    }

    public final void p5(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!nY() || fD() == null) {
            return;
        }
        Offset offsetNr = layoutCoordinates != null ? Offset.nr(LayoutCoordinatesKt.Uo(layoutCoordinates)) : null;
        if (Intrinsics.areEqual(this.previousPosition, offsetNr)) {
            return;
        }
        this.previousPosition = offsetNr;
        m();
        pJg();
    }

    public final boolean s7N() {
        Selection selection;
        List listWPU = this.selectionRegistrar.WPU(jB());
        if (listWPU.isEmpty()) {
            return true;
        }
        int size = listWPU.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) listWPU.get(i2);
            AnnotatedString annotatedStringN = selectable.n();
            if (annotatedStringN.length() != 0 && ((selection = (Selection) this.selectionRegistrar.rl().rl(selectable.mUb())) == null || Math.abs(selection.getStart().getOffset() - selection.getEnd().getOffset()) != annotatedStringN.length())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final Function1 getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final boolean wTp() {
        return ((Boolean) this._isInTouchMode.getValue()).booleanValue();
    }

    public final boolean xg(Offset newPosition, long previousPosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        if (newPosition == null) {
            return false;
        }
        return eTf(newPosition.getPackedValue(), previousPosition, isStartHandle, adjustment);
    }

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(companion.t()), null, 2, null);
        this.dragTotalDistance = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(companion.t()), null, 2, null);
        this.startHandlePosition = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.endHandlePosition = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        selectionRegistrarImpl.ck(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                n(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void n(long j2) {
                if (SelectionManager.this.selectionRegistrar.rl().n(j2)) {
                    SelectionManager.this.m();
                    SelectionManager.this.pJg();
                }
            }
        });
        selectionRegistrarImpl.XQ(new Function4<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
                n(bool.booleanValue(), layoutCoordinates, offset.getPackedValue(), selectionAdjustment);
                return Unit.INSTANCE;
            }

            public final void n(boolean z2, LayoutCoordinates layoutCoordinates, long j2, SelectionAdjustment selectionAdjustment) {
                long jN = layoutCoordinates.n();
                Rect rect = new Rect(0.0f, 0.0f, (int) (jN >> 32), (int) (jN & 4294967295L));
                if (!SelectionManagerKt.nr(rect, j2)) {
                    j2 = TextLayoutStateKt.n(j2, rect);
                }
                long jTy = SelectionManager.this.ty(layoutCoordinates, j2);
                if ((9223372034707292159L & jTy) != 9205357640488583168L) {
                    SelectionManager.this.a(z2);
                    SelectionManager.this.piY(jTy, false, selectionAdjustment);
                    FocusRequester.KN(SelectionManager.this.getFocusRequester(), 0, 1, null);
                    SelectionManager.this.Y(false);
                }
            }
        });
        selectionRegistrarImpl.Z(new Function2<Boolean, Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Long l2) {
                n(bool.booleanValue(), l2.longValue());
                return Unit.INSTANCE;
            }

            public final void n(boolean z2, long j2) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair pairP5 = selectionManager.P5(j2, selectionManager.fD());
                Selection selection = (Selection) pairP5.component1();
                LongObjectMap longObjectMap = (LongObjectMap) pairP5.component2();
                if (!Intrinsics.areEqual(selection, SelectionManager.this.fD())) {
                    SelectionManager.this.selectionRegistrar.S(longObjectMap);
                    SelectionManager.this.getOnSelectionChange().invoke(selection);
                }
                SelectionManager.this.a(z2);
                FocusRequester.KN(SelectionManager.this.getFocusRequester(), 0, 1, null);
                SelectionManager.this.Y(false);
            }
        });
        selectionRegistrarImpl.r(new Function6<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(6);
            }

            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool2, SelectionAdjustment selectionAdjustment) {
                return n(bool.booleanValue(), layoutCoordinates, offset.getPackedValue(), offset2.getPackedValue(), bool2.booleanValue(), selectionAdjustment);
            }

            public final Boolean n(boolean z2, LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z3, SelectionAdjustment selectionAdjustment) {
                long jTy = SelectionManager.this.ty(layoutCoordinates, j2);
                long jTy2 = SelectionManager.this.ty(layoutCoordinates, j3);
                SelectionManager.this.a(z2);
                return Boolean.valueOf(SelectionManager.this.xg(Offset.nr(jTy), jTy2, z3, selectionAdjustment));
            }
        });
        selectionRegistrarImpl.o(new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
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
                SelectionManager.this.Y(true);
                SelectionManager.this.FX(null);
                SelectionManager.this.eF(null);
            }
        });
        selectionRegistrarImpl.Ik(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                n(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void n(long j2) {
                if (SelectionManager.this.selectionRegistrar.rl().n(j2)) {
                    SelectionManager.this.Xw();
                    SelectionManager.this.Nxk(null);
                }
            }
        });
        selectionRegistrarImpl.HI(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                n(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void n(long j2) {
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selectionFD = SelectionManager.this.fD();
                if (selectionFD != null && (start = selectionFD.getStart()) != null && j2 == start.getSelectableId()) {
                    SelectionManager.this.k(null);
                }
                Selection selectionFD2 = SelectionManager.this.fD();
                if (selectionFD2 != null && (end = selectionFD2.getEnd()) != null && j2 == end.getSelectableId()) {
                    SelectionManager.this.B(null);
                }
                if (SelectionManager.this.selectionRegistrar.rl().n(j2)) {
                    SelectionManager.this.pJg();
                }
            }
        });
    }

    private final SelectionLayout E2(long position, long previousHandlePosition, boolean isStartHandle) {
        Selection selectionFD;
        LayoutCoordinates layoutCoordinatesJB = jB();
        List listWPU = this.selectionRegistrar.WPU(layoutCoordinatesJB);
        final MutableLongIntMap mutableLongIntMapN = LongIntMapKt.n();
        int size = listWPU.size();
        for (int i2 = 0; i2 < size; i2++) {
            mutableLongIntMapN.ty(((Selectable) listWPU.get(i2)).mUb(), i2);
        }
        Comparator comparator = new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Integer.valueOf(mutableLongIntMapN.rl(((Number) obj).longValue())), Integer.valueOf(mutableLongIntMapN.rl(((Number) obj2).longValue())));
            }
        };
        if ((9223372034707292159L & previousHandlePosition) == 9205357640488583168L) {
            selectionFD = null;
        } else {
            selectionFD = fD();
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(position, previousHandlePosition, layoutCoordinatesJB, isStartHandle, selectionFD, comparator, null);
        int size2 = listWPU.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Selectable) listWPU.get(i3)).qie(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.rl();
    }

    private final void M7(SelectionLayout selectionLayout, Selection newSelection) {
        HapticFeedback hapticFeedback;
        if (z() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.n(HapticFeedbackType.INSTANCE.xMQ());
        }
        this.selectionRegistrar.S(selectionLayout.KN(newSelection));
        this.onSelectionChange.invoke(newSelection);
    }

    private final boolean e() {
        if (nHg() && wTp() && !rV9()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ijL() {
        HI();
        Xw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean nHg() {
        if (S() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pJg() {
        TextToolbar textToolbar;
        SelectionManager$updateSelectionToolbar$1 selectionManager$updateSelectionToolbar$1;
        if (nY() && (textToolbar = this.textToolbar) != null) {
            if (this.showToolbar && wTp()) {
                Rect rectR = r();
                if (rectR != null) {
                    SelectionManager$updateSelectionToolbar$2 selectionManager$updateSelectionToolbar$2 = null;
                    if (v()) {
                        selectionManager$updateSelectionToolbar$1 = new SelectionManager$updateSelectionToolbar$1(this);
                    } else {
                        selectionManager$updateSelectionToolbar$1 = null;
                    }
                    if (!s7N()) {
                        selectionManager$updateSelectionToolbar$2 = new SelectionManager$updateSelectionToolbar$2(this);
                    }
                    TextToolbar.t(textToolbar, rectR, selectionManager$updateSelectionToolbar$1, null, null, selectionManager$updateSelectionToolbar$2, null, 12, null);
                    return;
                }
                return;
            }
            if (textToolbar.getStatus() == TextToolbarStatus.f33061n) {
                textToolbar.n();
            }
        }
    }

    private final Rect r() {
        LayoutCoordinates layoutCoordinates;
        Pair pair;
        if (fD() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.nr()) {
            return null;
        }
        List listWPU = this.selectionRegistrar.WPU(jB());
        ArrayList arrayList = new ArrayList(listWPU.size());
        int size = listWPU.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) listWPU.get(i2);
            Selection selection = (Selection) this.selectionRegistrar.rl().rl(selectable.mUb());
            if (selection != null) {
                pair = TuplesKt.to(selectable, selection);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        List listO = SelectionManagerKt.O(arrayList);
        if (listO.isEmpty()) {
            return null;
        }
        Rect rectUo = SelectionManagerKt.Uo(listO, layoutCoordinates);
        if (Intrinsics.areEqual(rectUo, SelectionManagerKt.f20917n)) {
            return null;
        }
        Rect rectAYN = SelectionManagerKt.xMQ(layoutCoordinates).aYN(rectUo);
        if (rectAYN.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - rectAYN.getLeft() < 0.0f || rectAYN.xMQ() - rectAYN.getTop() < 0.0f) {
            return null;
        }
        Rect rectTe = rectAYN.te(LayoutCoordinatesKt.J2(layoutCoordinates));
        return Rect.KN(rectTe, 0.0f, 0.0f, 0.0f, rectTe.xMQ() + (SelectionHandlesKt.rl() * 4), 7, null);
    }

    public final void HI() {
        Function1 function1;
        AnnotatedString annotatedStringIF = iF();
        if (annotatedStringIF != null) {
            if (annotatedStringIF.length() <= 0) {
                annotatedStringIF = null;
            }
            if (annotatedStringIF != null && (function1 = this.onCopyHandler) != null) {
                function1.invoke(annotatedStringIF);
            }
        }
    }

    public final Pair P5(long selectableId, Selection previousSelection) {
        HapticFeedback hapticFeedback;
        Selection selectionGh;
        MutableLongObjectMap mutableLongObjectMapT = LongObjectMapKt.t();
        List listWPU = this.selectionRegistrar.WPU(jB());
        int size = listWPU.size();
        Selection selectionKN = null;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) listWPU.get(i2);
            if (selectable.mUb() == selectableId) {
                selectionGh = selectable.gh();
            } else {
                selectionGh = null;
            }
            if (selectionGh != null) {
                mutableLongObjectMapT.r(selectable.mUb(), selectionGh);
            }
            selectionKN = SelectionManagerKt.KN(selectionKN, selectionGh);
        }
        if (wTp() && !Intrinsics.areEqual(selectionKN, previousSelection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.n(HapticFeedbackType.INSTANCE.xMQ());
        }
        return new Pair(selectionKN, mutableLongObjectMapT);
    }

    public final float WPU() {
        Selectable selectableCk;
        Selection selectionFD = fD();
        if (selectionFD == null || (selectableCk = ck(selectionFD.getEnd())) == null) {
            return 0.0f;
        }
        return selectableCk.t(selectionFD.getEnd().getOffset());
    }

    public final float X() {
        Selectable selectableCk;
        Selection selectionFD = fD();
        if (selectionFD == null || (selectableCk = ck(selectionFD.getStart())) == null) {
            return 0.0f;
        }
        return selectableCk.t(selectionFD.getStart().getOffset());
    }

    public final AnnotatedString iF() {
        AnnotatedString annotatedStringSubSequence;
        if (fD() == null || this.selectionRegistrar.rl().O()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List listWPU = this.selectionRegistrar.WPU(jB());
        int size = listWPU.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) listWPU.get(i2);
            Selection selection = (Selection) this.selectionRegistrar.rl().rl(selectable.mUb());
            if (selection != null) {
                AnnotatedString annotatedStringN = selectable.n();
                if (selection.getHandlesCrossed()) {
                    annotatedStringSubSequence = annotatedStringN.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset());
                } else {
                    annotatedStringSubSequence = annotatedStringN.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset());
                }
                builder.J2(annotatedStringSubSequence);
            }
        }
        return builder.ty();
    }

    public final boolean rV9() {
        Selection selectionFD = fD();
        if (selectionFD == null) {
            return true;
        }
        return Intrinsics.areEqual(selectionFD.getStart(), selectionFD.getEnd());
    }

    public final boolean v() {
        Selection selectionFD = fD();
        if (selectionFD == null || Intrinsics.areEqual(selectionFD.getStart(), selectionFD.getEnd())) {
            return false;
        }
        if (selectionFD.getStart().getSelectableId() == selectionFD.getEnd().getSelectableId()) {
            return true;
        }
        List listWPU = this.selectionRegistrar.WPU(jB());
        int size = listWPU.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selection selection = (Selection) this.selectionRegistrar.rl().rl(((Selectable) listWPU.get(i2)).mUb());
            if (selection != null && selection.getStart().getOffset() != selection.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        if (wTp()) {
            List list = this.selectionRegistrar.get_selectables();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((Selectable) list.get(i2)).n().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
