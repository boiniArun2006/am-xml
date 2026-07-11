package androidx.compose.foundation.text.selection;

import GJW.C;
import GJW.h;
import GJW.vd;
import GJW.xuv;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJB\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010!\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010\nJ\u000f\u0010*\u001a\u00020\bH\u0000¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\u00020\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\bH\u0000¢\u0006\u0004\b3\u0010+J\u001b\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\bH\u0000¢\u0006\u0004\b;\u0010+J\u000f\u0010<\u001a\u00020\bH\u0000¢\u0006\u0004\b<\u0010+J\u001d\u0010=\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b@\u0010AJ\u001d\u0010D\u001a\u00020\u00102\u0006\u0010C\u001a\u00020BH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\bF\u00109J\u000f\u0010G\u001a\u00020\bH\u0000¢\u0006\u0004\bG\u0010+J\u000f\u0010H\u001a\u00020\u0006H\u0000¢\u0006\u0004\bH\u0010IR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010U\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR.\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010e\u001a\u0004\u0018\u00010^8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010t\u001a\u00020m8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR*\u0010|\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010u8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R)\u0010\u0084\u0001\u001a\u0004\u0018\u00010}8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R,\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R,\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R,\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R,\u0010¤\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R/\u0010¨\u0001\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¥\u0001\u0010h\u001a\u0005\b¦\u0001\u0010I\"\u0005\b§\u0001\u0010\nR/\u0010¬\u0001\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b©\u0001\u0010h\u001a\u0005\bª\u0001\u0010I\"\u0005\b«\u0001\u0010\nR\u001d\u0010\u00ad\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u0010;R\u001b\u0010°\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010¯\u0001R\u001d\u0010±\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u0010;R7\u0010¸\u0001\u001a\u0005\u0018\u00010²\u00012\t\u0010f\u001a\u0005\u0018\u00010²\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b³\u0001\u0010h\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R9\u0010¼\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010f\u001a\u0004\u0018\u00010\u00108F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\b!\u0010h\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0005\b»\u0001\u0010.R\u0019\u0010½\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010»\u0001R\u0018\u0010¿\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010¾\u0001R\u001b\u0010Â\u0001\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010Á\u0001R\u001e\u0010Æ\u0001\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0005\bÅ\u0001\u0010'R\u001f\u0010Ë\u0001\u001a\u00030Ç\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b)\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010Î\u0001\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ï\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "", "show", "", "fcU", "(Z)V", "Landroidx/compose/ui/geometry/Rect;", "te", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/geometry/Offset;", "currentPosition", "isStartOfSelection", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "isTouchBasedSelection", "Landroidx/compose/ui/text/TextRange;", "eWT", "(Landroidx/compose/ui/text/input/TextFieldValue;JZZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "Landroidx/compose/foundation/text/HandleState;", "handleState", "z", "(Landroidx/compose/foundation/text/HandleState;)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "selection", "o", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/TextDragObserver;", "E", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "Z", "()Landroidx/compose/foundation/text/TextDragObserver;", "showFloatingToolbar", "aYN", "nY", "()V", "position", "S", "(Landroidx/compose/ui/geometry/Offset;)V", "range", "xg", "(J)V", "GR", "ck", "cancelSelection", "LGJW/xuv;", "Ik", "(Z)LGJW/xuv;", "B", "()LGJW/xuv;", "XQ", "J", "HI", "s7N", "(Z)J", "", "nHg", "(Z)F", "Landroidx/compose/ui/unit/Density;", "density", "E2", "(Landroidx/compose/ui/unit/Density;)J", "G7", "M", "FX", "()Z", c.f62177j, "Landroidx/compose/foundation/text/UndoManager;", "M7", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/ui/text/input/OffsetMapping;", "rl", "Landroidx/compose/ui/text/input/OffsetMapping;", "rV9", "()Landroidx/compose/ui/text/input/OffsetMapping;", "ijL", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "offsetMapping", "Lkotlin/Function1;", "t", "Lkotlin/jvm/functions/Function1;", "bzg", "()Lkotlin/jvm/functions/Function1;", "m", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "nr", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Xw", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "pJg", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "state", "<set-?>", "O", "Landroidx/compose/runtime/MutableState;", "p5", "()Landroidx/compose/ui/text/input/TextFieldValue;", "C", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/text/input/VisualTransformation;", "J2", "Landroidx/compose/ui/text/input/VisualTransformation;", "eF", "()Landroidx/compose/ui/text/input/VisualTransformation;", "Mx", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "visualTransformation", "Lkotlin/Function0;", "Uo", "Lkotlin/jvm/functions/Function0;", "getRequestAutofillAction$foundation_release", "()Lkotlin/jvm/functions/Function0;", "eTf", "(Lkotlin/jvm/functions/Function0;)V", "requestAutofillAction", "Landroidx/compose/ui/platform/Clipboard;", "KN", "Landroidx/compose/ui/platform/Clipboard;", "g", "()Landroidx/compose/ui/platform/Clipboard;", "D", "(Landroidx/compose/ui/platform/Clipboard;)V", "clipboard", "LGJW/vd;", "xMQ", "LGJW/vd;", "iF", "()LGJW/vd;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "(LGJW/vd;)V", "coroutineScope", "Landroidx/compose/ui/platform/TextToolbar;", "mUb", "Landroidx/compose/ui/platform/TextToolbar;", "jB", "()Landroidx/compose/ui/platform/TextToolbar;", "ofS", "(Landroidx/compose/ui/platform/TextToolbar;)V", "textToolbar", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "gh", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "wTp", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "piY", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hapticFeedBack", "Landroidx/compose/ui/focus/FocusRequester;", "qie", "Landroidx/compose/ui/focus/FocusRequester;", "N", "()Landroidx/compose/ui/focus/FocusRequester;", "dR0", "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusRequester", "az", "X", "Y", "editable", "ty", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "k", "enabled", "dragBeginPosition", "", "Ljava/lang/Integer;", "dragBeginOffsetInText", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "r", "e", "()Landroidx/compose/foundation/text/Handle;", "Nxk", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "fD", "()Landroidx/compose/ui/geometry/Offset;", "I", "currentDragPosition", "previousRawDragOffset", "Landroidx/compose/ui/text/input/TextFieldValue;", "oldValue", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "previousSelectionLayout", "WPU", "Landroidx/compose/foundation/text/TextDragObserver;", "U", "touchSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "v", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "P5", "()Landroidx/compose/ui/text/AnnotatedString;", "transformedText", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1123:1\n85#2:1124\n113#2,2:1125\n85#2:1127\n113#2,2:1128\n85#2:1130\n113#2,2:1131\n85#2:1133\n113#2,2:1134\n85#2:1136\n113#2,2:1137\n1#3:1139\n30#4:1140\n30#4:1144\n30#4:1151\n53#5,3:1141\n53#5,3:1145\n70#5:1149\n53#5,3:1152\n70#5:1156\n60#5:1159\n60#5:1162\n70#5:1165\n69#6:1148\n69#6:1155\n65#6:1158\n65#6:1161\n69#6:1164\n22#7:1150\n22#7:1157\n22#7:1160\n22#7:1163\n22#7:1166\n113#8:1167\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n87#1:1124\n87#1:1125,2\n121#1:1127\n121#1:1128,2\n124#1:1130\n124#1:1131,2\n152#1:1133\n152#1:1134,2\n156#1:1136\n156#1:1137,2\n739#1:1140\n869#1:1144\n879#1:1151\n739#1:1141,3\n869#1:1145,3\n874#1:1149\n879#1:1152,3\n884#1:1156\n886#1:1159\n887#1:1162\n890#1:1165\n874#1:1148\n884#1:1155\n886#1:1158\n887#1:1161\n890#1:1164\n874#1:1150\n884#1:1157\n886#1:1160\n887#1:1163\n890#1:1166\n890#1:1167\n*E\n"})
public final class TextFieldSelectionManager {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private long dragBeginPosition;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private long dragTotalDistance;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Clipboard clipboard;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private SelectionLayout previousSelectionLayout;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private Function0 requestAutofillAction;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final TextDragObserver touchSelectionObserver;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private TextFieldValue oldValue;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private int previousRawDragOffset;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private final MouseSelectionObserver mouseSelectionObserver;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final MutableState editable;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private Integer dragBeginOffsetInText;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private HapticFeedback hapticFeedBack;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private TextToolbar textToolbar;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final UndoManager undoManager;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private LegacyTextFieldState state;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableState currentDragPosition;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private FocusRequester focusRequester;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final MutableState draggingHandle;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final MutableState enabled;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private vd coroutineScope;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private OffsetMapping offsetMapping = ValidatingOffsetMappingKt.nr();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function1 onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
        public final void n(TextFieldValue textFieldValue) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            n(textFieldValue);
            return Unit.INSTANCE;
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState value = SnapshotStateKt__SnapshotStateKt.O(new TextFieldValue((String) null, 0, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private VisualTransformation visualTransformation = VisualTransformation.INSTANCE.t();

    public static /* synthetic */ void ViF(TextFieldSelectionManager textFieldSelectionManager, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        textFieldSelectionManager.aYN(z2);
    }

    public static /* synthetic */ xuv r(TextFieldSelectionManager textFieldSelectionManager, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return textFieldSelectionManager.Ik(z2);
    }

    public final void nY() {
        fcU(false);
        z(HandleState.f19681n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Nxk(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    public static /* synthetic */ void WPU(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.S(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long eWT(TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, SelectionAdjustment adjustment, boolean isTouchBasedSelection) {
        TextLayoutResultProxy textLayoutResultProxyQie;
        int i2;
        HapticFeedback hapticFeedback;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textLayoutResultProxyQie = legacyTextFieldState.qie()) == null) {
            return TextRange.INSTANCE.n();
        }
        long jRl = TextRangeKt.rl(this.offsetMapping.rl(TextRange.ty(value.getSelection())), this.offsetMapping.rl(TextRange.xMQ(value.getSelection())));
        boolean z2 = false;
        int iNr = textLayoutResultProxyQie.nr(currentPosition, false);
        int iTy = (isStartHandle || isStartOfSelection) ? iNr : TextRange.ty(jRl);
        int iXMQ = (!isStartHandle || isStartOfSelection) ? iNr : TextRange.xMQ(jRl);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        if (isStartOfSelection || selectionLayout == null || (i2 = this.previousRawDragOffset) == -1) {
            i2 = -1;
        }
        SelectionLayout selectionLayoutT = SelectionLayoutKt.t(textLayoutResultProxyQie.getValue(), iTy, iXMQ, i2, jRl, isStartOfSelection, isStartHandle);
        if (!selectionLayoutT.xMQ(selectionLayout)) {
            return value.getSelection();
        }
        this.previousSelectionLayout = selectionLayoutT;
        this.previousRawDragOffset = iNr;
        Selection selectionN = adjustment.n(selectionLayoutT);
        long jRl2 = TextRangeKt.rl(this.offsetMapping.n(selectionN.getStart().getOffset()), this.offsetMapping.n(selectionN.getEnd().getOffset()));
        if (TextRange.Uo(jRl2, value.getSelection())) {
            return value.getSelection();
        }
        boolean z3 = TextRange.az(jRl2) != TextRange.az(value.getSelection()) && TextRange.Uo(TextRangeKt.rl(TextRange.xMQ(jRl2), TextRange.ty(jRl2)), value.getSelection());
        boolean z4 = TextRange.KN(jRl2) && TextRange.KN(value.getSelection());
        if (isTouchBasedSelection && value.xMQ().length() > 0 && !z3 && !z4 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.n(HapticFeedbackType.INSTANCE.xMQ());
        }
        this.onValueChange.invoke(o(value.getText(), jRl2));
        if (!isTouchBasedSelection) {
            fcU(!TextRange.KN(jRl2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.X(isTouchBasedSelection);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.jB(!TextRange.KN(jRl2) && TextFieldSelectionManagerKt.t(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.Xw(!TextRange.KN(jRl2) && TextFieldSelectionManagerKt.t(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 == null) {
            return jRl2;
        }
        if (TextRange.KN(jRl2) && TextFieldSelectionManagerKt.t(this, true)) {
            z2 = true;
        }
        legacyTextFieldState5.rV9(z2);
        return jRl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fcU(boolean show) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.bzg(show);
        }
        if (show) {
            G7();
        } else {
            M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldValue o(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect te() {
        char c2;
        long j2;
        float fIntBitsToFloat;
        LayoutCoordinates layoutCoordinatesGh;
        TextLayoutResult value;
        Rect rectO;
        LayoutCoordinates layoutCoordinatesGh2;
        TextLayoutResult value2;
        Rect rectO2;
        LayoutCoordinates layoutCoordinatesGh3;
        LayoutCoordinates layoutCoordinatesGh4;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getIsLayoutResultStale()) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int iRl = this.offsetMapping.rl(TextRange.ty(p5().getSelection()));
                int iRl2 = this.offsetMapping.rl(TextRange.xMQ(p5().getSelection()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long jT2 = (legacyTextFieldState2 == null || (layoutCoordinatesGh4 = legacyTextFieldState2.gh()) == null) ? Offset.INSTANCE.t() : layoutCoordinatesGh4.xg(s7N(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long jT3 = (legacyTextFieldState3 == null || (layoutCoordinatesGh3 = legacyTextFieldState3.gh()) == null) ? Offset.INSTANCE.t() : layoutCoordinatesGh3.xg(s7N(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float fIntBitsToFloat2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinatesGh2 = legacyTextFieldState4.gh()) == null) {
                    c2 = ' ';
                    j2 = 4294967295L;
                    fIntBitsToFloat = 0.0f;
                } else {
                    TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState.qie();
                    c2 = ' ';
                    j2 = 4294967295L;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinatesGh2.xg(Offset.O((((long) Float.floatToRawIntBits((textLayoutResultProxyQie == null || (value2 = textLayoutResultProxyQie.getValue()) == null || (rectO2 = value2.O(iRl)) == null) ? 0.0f : rectO2.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32))) & 4294967295L));
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinatesGh = legacyTextFieldState5.gh()) != null) {
                    TextLayoutResultProxy textLayoutResultProxyQie2 = legacyTextFieldState.qie();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (layoutCoordinatesGh.xg(Offset.O((((long) Float.floatToRawIntBits(0.0f)) << c2) | (((long) Float.floatToRawIntBits((textLayoutResultProxyQie2 == null || (value = textLayoutResultProxyQie2.getValue()) == null || (rectO = value.O(iRl2)) == null) ? 0.0f : rectO.getTop())) & j2))) & j2));
                }
                int i2 = (int) (jT2 >> c2);
                int i3 = (int) (jT3 >> c2);
                return new Rect(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.max(Float.intBitsToFloat((int) (jT2 & j2)), Float.intBitsToFloat((int) (jT3 & j2))) + (Dp.KN(25) * legacyTextFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.INSTANCE.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.O() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.E2(handleState);
            }
        }
    }

    public final xuv B() {
        vd vdVar = this.coroutineScope;
        if (vdVar != null) {
            return C.nr(vdVar, null, h.J2, new TextFieldSelectionManager$paste$1(this, null), 1, null);
        }
        return null;
    }

    public final void C(TextFieldValue textFieldValue) {
        this.value.setValue(textFieldValue);
    }

    public final void D(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public final TextDragObserver E(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void rl(long startPoint) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void n(long point) {
                TextLayoutResultProxy textLayoutResultProxyQie;
                this.f20965n.Nxk(isStartHandle ? Handle.f19679t : Handle.f19676O);
                long jN = SelectionHandlesKt.n(this.f20965n.s7N(isStartHandle));
                LegacyTextFieldState state = this.f20965n.getState();
                if (state == null || (textLayoutResultProxyQie = state.qie()) == null) {
                    return;
                }
                long jGh = textLayoutResultProxyQie.gh(jN);
                this.f20965n.dragBeginPosition = jGh;
                this.f20965n.I(Offset.nr(jGh));
                this.f20965n.dragTotalDistance = Offset.INSTANCE.t();
                this.f20965n.previousRawDragOffset = -1;
                LegacyTextFieldState state2 = this.f20965n.getState();
                if (state2 != null) {
                    state2.X(true);
                }
                this.f20965n.fcU(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void nr(long delta) {
                TextFieldSelectionManager textFieldSelectionManager = this.f20965n;
                textFieldSelectionManager.dragTotalDistance = Offset.Ik(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldSelectionManager textFieldSelectionManager2 = this.f20965n;
                textFieldSelectionManager2.I(Offset.nr(Offset.Ik(textFieldSelectionManager2.dragBeginPosition, this.f20965n.dragTotalDistance)));
                TextFieldSelectionManager textFieldSelectionManager3 = this.f20965n;
                TextFieldValue textFieldValueP5 = textFieldSelectionManager3.p5();
                Offset offsetFD = this.f20965n.fD();
                Intrinsics.checkNotNull(offsetFD);
                textFieldSelectionManager3.eWT(textFieldValueP5, offsetFD.getPackedValue(), false, isStartHandle, SelectionAdjustment.INSTANCE.qie(), true);
                this.f20965n.fcU(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.f20965n.Nxk(null);
                this.f20965n.I(null);
                this.f20965n.fcU(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void t() {
                this.f20965n.Nxk(null);
                this.f20965n.I(null);
                this.f20965n.fcU(true);
            }
        };
    }

    public final long E2(Density density) {
        int iRl = this.offsetMapping.rl(TextRange.ty(p5().getSelection()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState != null ? legacyTextFieldState.qie() : null;
        Intrinsics.checkNotNull(textLayoutResultProxyQie);
        TextLayoutResult value = textLayoutResultProxyQie.getValue();
        Rect rectO = value.O(RangesKt.coerceIn(iRl, 0, value.getLayoutInput().getText().length()));
        return Offset.O((((long) Float.floatToRawIntBits(rectO.getLeft() + (density.l(TextFieldCursor_androidKt.n()) / 2))) << 32) | (((long) Float.floatToRawIntBits(rectO.xMQ())) & 4294967295L));
    }

    public final boolean FX() {
        return !Intrinsics.areEqual(this.oldValue.xMQ(), p5().xMQ());
    }

    public final xuv G7() {
        vd vdVar = this.coroutineScope;
        if (vdVar != null) {
            return C.nr(vdVar, null, h.J2, new TextFieldSelectionManager$showSelectionToolbar$1(this, null), 1, null);
        }
        return null;
    }

    public final void GR(long range) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.fD(range);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.v(TextRange.INSTANCE.n());
        }
        if (TextRange.KN(range)) {
            return;
        }
        nY();
    }

    public final void HI() {
        Function0 function0 = this.requestAutofillAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final xuv Ik(boolean cancelSelection) {
        vd vdVar = this.coroutineScope;
        if (vdVar != null) {
            return C.nr(vdVar, null, h.J2, new TextFieldSelectionManager$copy$1(this, cancelSelection, null), 1, null);
        }
        return null;
    }

    public final void M() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.f33061n || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.n();
    }

    /* JADX INFO: renamed from: M7, reason: from getter */
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final void Mx(VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final AnnotatedString P5() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    public final boolean T() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    public final boolean X() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    public final xuv XQ() {
        vd vdVar = this.coroutineScope;
        if (vdVar != null) {
            return C.nr(vdVar, null, h.J2, new TextFieldSelectionManager$cut$1(this, null), 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: Xw, reason: from getter */
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final void Y(boolean z2) {
        this.editable.setValue(Boolean.valueOf(z2));
    }

    public final TextDragObserver Z() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void n(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void nr(long delta) {
                TextLayoutResultProxy textLayoutResultProxyQie;
                HapticFeedback hapticFeedBack;
                TextFieldSelectionManager textFieldSelectionManager = this.f20962n;
                textFieldSelectionManager.dragTotalDistance = Offset.Ik(textFieldSelectionManager.dragTotalDistance, delta);
                LegacyTextFieldState state = this.f20962n.getState();
                if (state == null || (textLayoutResultProxyQie = state.qie()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = this.f20962n;
                textFieldSelectionManager2.I(Offset.nr(Offset.Ik(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                Offset offsetFD = textFieldSelectionManager2.fD();
                Intrinsics.checkNotNull(offsetFD);
                int iN = offsetMapping.n(TextLayoutResultProxy.O(textLayoutResultProxyQie, offsetFD.getPackedValue(), false, 2, null));
                long jRl = TextRangeKt.rl(iN, iN);
                if (TextRange.Uo(jRl, textFieldSelectionManager2.p5().getSelection())) {
                    return;
                }
                LegacyTextFieldState state2 = textFieldSelectionManager2.getState();
                if ((state2 == null || state2.g()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.n(HapticFeedbackType.INSTANCE.xMQ());
                }
                textFieldSelectionManager2.getOnValueChange().invoke(textFieldSelectionManager2.o(textFieldSelectionManager2.p5().getText(), jRl));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.f20962n.Nxk(null);
                this.f20962n.I(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void rl(long startPoint) {
                TextLayoutResultProxy textLayoutResultProxyQie;
                long jN = SelectionHandlesKt.n(this.f20962n.s7N(true));
                LegacyTextFieldState state = this.f20962n.getState();
                if (state == null || (textLayoutResultProxyQie = state.qie()) == null) {
                    return;
                }
                long jGh = textLayoutResultProxyQie.gh(jN);
                this.f20962n.dragBeginPosition = jGh;
                this.f20962n.I(Offset.nr(jGh));
                this.f20962n.dragTotalDistance = Offset.INSTANCE.t();
                this.f20962n.Nxk(Handle.f19677n);
                this.f20962n.fcU(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void t() {
                this.f20962n.Nxk(null);
                this.f20962n.I(null);
            }
        };
    }

    public final void a(vd vdVar) {
        this.coroutineScope = vdVar;
    }

    public final void aYN(boolean showFloatingToolbar) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.J2() && (focusRequester = this.focusRequester) != null) {
            FocusRequester.KN(focusRequester, 0, 1, null);
        }
        this.oldValue = p5();
        fcU(showFloatingToolbar);
        z(HandleState.f19683t);
    }

    /* JADX INFO: renamed from: bzg, reason: from getter */
    public final Function1 getOnValueChange() {
        return this.onValueChange;
    }

    public final void ck() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.fD(TextRange.INSTANCE.n());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 == null) {
            return;
        }
        legacyTextFieldState2.v(TextRange.INSTANCE.n());
    }

    public final void dR0(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final Handle e() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX INFO: renamed from: eF, reason: from getter */
    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    public final void eTf(Function0 function0) {
        this.requestAutofillAction = function0;
    }

    public final Offset fD() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Clipboard getClipboard() {
        return this.clipboard;
    }

    /* JADX INFO: renamed from: iF, reason: from getter */
    public final vd getCoroutineScope() {
        return this.coroutineScope;
    }

    public final void ijL(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    /* JADX INFO: renamed from: jB, reason: from getter */
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void k(boolean z2) {
        this.enabled.setValue(Boolean.valueOf(z2));
    }

    public final void m(Function1 function1) {
        this.onValueChange = function1;
    }

    public final float nHg(boolean isStartHandle) {
        TextLayoutResultProxy textLayoutResultProxyQie;
        TextLayoutResult value;
        int iTy = isStartHandle ? TextRange.ty(p5().getSelection()) : TextRange.xMQ(p5().getSelection());
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textLayoutResultProxyQie = legacyTextFieldState.qie()) == null || (value = textLayoutResultProxyQie.getValue()) == null) {
            return 0.0f;
        }
        return TextLayoutHelperKt.rl(value, iTy);
    }

    public final void ofS(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final TextFieldValue p5() {
        return (TextFieldValue) this.value.getValue();
    }

    public final void pJg(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void piY(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    /* JADX INFO: renamed from: rV9, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final long s7N(boolean isStartHandle) {
        TextLayoutResultProxy textLayoutResultProxyQie;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textLayoutResultProxyQie = legacyTextFieldState.qie()) == null || (value = textLayoutResultProxyQie.getValue()) == null) {
            return Offset.INSTANCE.rl();
        }
        AnnotatedString annotatedStringP5 = P5();
        if (annotatedStringP5 == null) {
            return Offset.INSTANCE.rl();
        }
        if (!Intrinsics.areEqual(annotatedStringP5.getText(), value.getLayoutInput().getText().getText())) {
            return Offset.INSTANCE.rl();
        }
        long selection = p5().getSelection();
        return TextSelectionDelegateKt.rl(value, this.offsetMapping.rl(isStartHandle ? TextRange.ty(selection) : TextRange.xMQ(selection)), isStartHandle, TextRange.az(p5().getSelection()));
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    /* JADX INFO: renamed from: wTp, reason: from getter */
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void xg(long range) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.v(range);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.fD(TextRange.INSTANCE.n());
        }
        if (TextRange.KN(range)) {
            return;
        }
        nY();
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        Boolean bool = Boolean.TRUE;
        this.editable = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.enabled = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = companion.t();
        this.dragTotalDistance = companion.t();
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void n(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void t() {
            }

            private final void O() {
                this.f20984n.Nxk(null);
                this.f20984n.I(null);
                this.f20984n.fcU(true);
                this.f20984n.dragBeginOffsetInText = null;
                boolean zKN = TextRange.KN(this.f20984n.p5().getSelection());
                this.f20984n.z(zKN ? HandleState.f19680O : HandleState.f19683t);
                LegacyTextFieldState state = this.f20984n.getState();
                if (state != null) {
                    state.jB(!zKN && TextFieldSelectionManagerKt.t(this.f20984n, true));
                }
                LegacyTextFieldState state2 = this.f20984n.getState();
                if (state2 != null) {
                    state2.Xw(!zKN && TextFieldSelectionManagerKt.t(this.f20984n, false));
                }
                LegacyTextFieldState state3 = this.f20984n.getState();
                if (state3 == null) {
                    return;
                }
                state3.rV9(zKN && TextFieldSelectionManagerKt.t(this.f20984n, true));
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void nr(long delta) {
                TextLayoutResultProxy textLayoutResultProxyQie;
                long jEWT;
                if (!this.f20984n.T() || this.f20984n.p5().xMQ().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.f20984n;
                textFieldSelectionManager.dragTotalDistance = Offset.Ik(textFieldSelectionManager.dragTotalDistance, delta);
                LegacyTextFieldState state = this.f20984n.getState();
                if (state != null && (textLayoutResultProxyQie = state.qie()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.f20984n;
                    textFieldSelectionManager2.I(Offset.nr(Offset.Ik(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                    if (textFieldSelectionManager2.dragBeginOffsetInText == null) {
                        Offset offsetFD = textFieldSelectionManager2.fD();
                        Intrinsics.checkNotNull(offsetFD);
                        if (textLayoutResultProxyQie.Uo(offsetFD.getPackedValue())) {
                            Integer num = textFieldSelectionManager2.dragBeginOffsetInText;
                            int iIntValue = num != null ? num.intValue() : textLayoutResultProxyQie.nr(textFieldSelectionManager2.dragBeginPosition, false);
                            Offset offsetFD2 = textFieldSelectionManager2.fD();
                            Intrinsics.checkNotNull(offsetFD2);
                            int iNr = textLayoutResultProxyQie.nr(offsetFD2.getPackedValue(), false);
                            if (textFieldSelectionManager2.dragBeginOffsetInText == null && iIntValue == iNr) {
                                return;
                            }
                            TextFieldValue textFieldValueP5 = textFieldSelectionManager2.p5();
                            Offset offsetFD3 = textFieldSelectionManager2.fD();
                            Intrinsics.checkNotNull(offsetFD3);
                            jEWT = textFieldSelectionManager2.eWT(textFieldValueP5, offsetFD3.getPackedValue(), false, false, SelectionAdjustment.INSTANCE.HI(), true);
                        } else {
                            int iN = textFieldSelectionManager2.getOffsetMapping().n(TextLayoutResultProxy.O(textLayoutResultProxyQie, textFieldSelectionManager2.dragBeginPosition, false, 2, null));
                            OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                            Offset offsetFD4 = textFieldSelectionManager2.fD();
                            Intrinsics.checkNotNull(offsetFD4);
                            SelectionAdjustment selectionAdjustmentAz = iN == offsetMapping.n(TextLayoutResultProxy.O(textLayoutResultProxyQie, offsetFD4.getPackedValue(), false, 2, null)) ? SelectionAdjustment.INSTANCE.az() : SelectionAdjustment.INSTANCE.HI();
                            TextFieldValue textFieldValueP52 = textFieldSelectionManager2.p5();
                            Offset offsetFD5 = textFieldSelectionManager2.fD();
                            Intrinsics.checkNotNull(offsetFD5);
                            jEWT = textFieldSelectionManager2.eWT(textFieldValueP52, offsetFD5.getPackedValue(), false, false, selectionAdjustmentAz, true);
                        }
                        TextRange.rl(jEWT);
                    }
                }
                this.f20984n.fcU(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void rl(long startPoint) {
                long j2;
                TextLayoutResultProxy textLayoutResultProxyQie;
                TextLayoutResultProxy textLayoutResultProxyQie2;
                if (this.f20984n.T() && this.f20984n.e() == null) {
                    this.f20984n.Nxk(Handle.f19676O);
                    this.f20984n.previousRawDragOffset = -1;
                    this.f20984n.M();
                    LegacyTextFieldState state = this.f20984n.getState();
                    if (state == null || (textLayoutResultProxyQie2 = state.qie()) == null || !textLayoutResultProxyQie2.Uo(startPoint)) {
                        j2 = startPoint;
                        LegacyTextFieldState state2 = this.f20984n.getState();
                        if (state2 != null && (textLayoutResultProxyQie = state2.qie()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = this.f20984n;
                            int iN = textFieldSelectionManager.getOffsetMapping().n(TextLayoutResultProxy.O(textLayoutResultProxyQie, j2, false, 2, null));
                            TextFieldValue textFieldValueO = textFieldSelectionManager.o(textFieldSelectionManager.p5().getText(), TextRangeKt.rl(iN, iN));
                            textFieldSelectionManager.aYN(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.n(HapticFeedbackType.INSTANCE.xMQ());
                            }
                            textFieldSelectionManager.getOnValueChange().invoke(textFieldValueO);
                        }
                    } else {
                        if (this.f20984n.p5().xMQ().length() == 0) {
                            return;
                        }
                        this.f20984n.aYN(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = this.f20984n;
                        j2 = startPoint;
                        this.f20984n.dragBeginOffsetInText = Integer.valueOf(TextRange.ty(textFieldSelectionManager2.eWT(TextFieldValue.nr(textFieldSelectionManager2.p5(), null, TextRange.INSTANCE.n(), null, 5, null), startPoint, true, false, SelectionAdjustment.INSTANCE.HI(), true)));
                    }
                    this.f20984n.z(HandleState.f19681n);
                    this.f20984n.dragBeginPosition = j2;
                    TextFieldSelectionManager textFieldSelectionManager3 = this.f20984n;
                    textFieldSelectionManager3.I(Offset.nr(textFieldSelectionManager3.dragBeginPosition));
                    this.f20984n.dragTotalDistance = Offset.INSTANCE.t();
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
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void n() {
            }

            public final void J2(TextFieldValue value, long currentPosition, boolean isStartOfSelection, SelectionAdjustment adjustment) {
                this.f20966n.z(TextRange.KN(this.f20966n.eWT(value, currentPosition, isStartOfSelection, false, adjustment, false)) ? HandleState.f19680O : HandleState.f19683t);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean O(long downPosition) {
                LegacyTextFieldState state = this.f20966n.getState();
                if (state == null || state.qie() == null || !this.f20966n.T()) {
                    return false;
                }
                this.f20966n.previousRawDragOffset = -1;
                J2(this.f20966n.p5(), downPosition, false, SelectionAdjustment.INSTANCE.az());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean nr(long dragPosition, SelectionAdjustment adjustment) {
                LegacyTextFieldState state;
                if (!this.f20966n.T() || this.f20966n.p5().xMQ().length() == 0 || (state = this.f20966n.getState()) == null || state.qie() == null) {
                    return false;
                }
                J2(this.f20966n.p5(), dragPosition, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean rl(long dragPosition) {
                LegacyTextFieldState state;
                if (!this.f20966n.T() || this.f20966n.p5().xMQ().length() == 0 || (state = this.f20966n.getState()) == null || state.qie() == null) {
                    return false;
                }
                J2(this.f20966n.p5(), dragPosition, false, SelectionAdjustment.INSTANCE.az());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean t(long downPosition, SelectionAdjustment adjustment) {
                LegacyTextFieldState state;
                if (!this.f20966n.T() || this.f20966n.p5().xMQ().length() == 0 || (state = this.f20966n.getState()) == null || state.qie() == null) {
                    return false;
                }
                FocusRequester focusRequester = this.f20966n.getFocusRequester();
                if (focusRequester != null) {
                    FocusRequester.KN(focusRequester, 0, 1, null);
                }
                this.f20966n.dragBeginPosition = downPosition;
                this.f20966n.previousRawDragOffset = -1;
                TextFieldSelectionManager.ViF(this.f20966n, false, 1, null);
                J2(this.f20966n.p5(), this.f20966n.dragBeginPosition, true, adjustment);
                return true;
            }
        };
    }

    public final void J() {
        TextFieldValue textFieldValueO = o(p5().getText(), TextRangeKt.rl(0, p5().xMQ().length()));
        this.onValueChange.invoke(textFieldValueO);
        this.oldValue = TextFieldValue.nr(this.oldValue, null, textFieldValueO.getSelection(), null, 5, null);
        aYN(true);
    }

    public final void S(Offset position) {
        HandleState handleState;
        TextLayoutResultProxy textLayoutResultProxyQie;
        int iGh;
        if (!TextRange.KN(p5().getSelection())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            if (legacyTextFieldState != null) {
                textLayoutResultProxyQie = legacyTextFieldState.qie();
            } else {
                textLayoutResultProxyQie = null;
            }
            TextLayoutResultProxy textLayoutResultProxy = textLayoutResultProxyQie;
            if (position != null && textLayoutResultProxy != null) {
                iGh = this.offsetMapping.n(TextLayoutResultProxy.O(textLayoutResultProxy, position.getPackedValue(), false, 2, null));
            } else {
                iGh = TextRange.gh(p5().getSelection());
            }
            this.onValueChange.invoke(TextFieldValue.nr(p5(), null, TextRangeKt.n(iGh), null, 5, null));
        }
        if (position != null && p5().xMQ().length() > 0) {
            handleState = HandleState.f19680O;
        } else {
            handleState = HandleState.f19681n;
        }
        z(handleState);
        fcU(false);
    }
}
