package androidx.compose.foundation.text.input.internal;

import GJW.xuv;
import android.view.KeyEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.events.a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0002®\u0001\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\rBs\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0016\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\"H\u0082@¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0016H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\"H\u0002¢\u0006\u0004\b-\u0010)J\u000f\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\"H\u0002¢\u0006\u0004\b1\u0010)J\u001a\u00104\u001a\u00020\"2\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\u00020\"*\u000206H\u0016¢\u0006\u0004\b7\u00108Jy\u00109\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00162\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\u0004\b9\u0010%J\u0013\u0010;\u001a\u00020\"*\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\"2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\"H\u0016¢\u0006\u0004\bA\u0010)J\u000f\u0010B\u001a\u00020\"H\u0016¢\u0006\u0004\bB\u0010)J\u0017\u0010E\u001a\u00020\"2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ*\u0010M\u001a\u00020\"2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0016ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\"H\u0016¢\u0006\u0004\bO\u0010)J\u001a\u0010R\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020PH\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020PH\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010SJ\u000f\u0010U\u001a\u00020\"H\u0016¢\u0006\u0004\bU\u0010)J\u0017\u0010V\u001a\u00020\"2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bV\u0010FJ\u001a\u0010X\u001a\u00020\"2\u0006\u0010W\u001a\u00020KH\u0016ø\u0001\u0000¢\u0006\u0004\bX\u0010YR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010,R\"\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010r\u001a\u0004\bw\u0010t\"\u0004\bx\u0010,R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R)\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R$\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b;\u0010r\u001a\u0005\b\u0085\u0001\u0010t\"\u0005\b\u0086\u0001\u0010,R'\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b?\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R$\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0005\b\u008c\u0001\u0010r\u001a\u0004\b \u0010t\"\u0005\b\u008d\u0001\u0010,R0\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010¡\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010rR\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001e\u0010µ\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001c\u0010·\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010¨\u0001R!\u0010¼\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¹\u00010¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R1\u0010Â\u0001\u001a\u00020\u00162\u0007\u0010½\u0001\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0005\bÀ\u0001\u0010t\"\u0005\bÁ\u0001\u0010,R\u0016\u0010Ä\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010tR\u0016\u0010Æ\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ç\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/InputTransformation;", "filter", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "keyboardActionHandler", "singleLine", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "isPassword", "LTFv/r;", "", "stylusHandwritingTrigger", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLTFv/r;)V", "lvn", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "F6W", "()V", "fromTap", TtmlNode.TAG_P, "(Z)V", "R3E", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "q", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Yq", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "u2n", "(I)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "ep", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/focus/FocusState;", "focusState", "B", "(Landroidx/compose/ui/focus/FocusState;)V", "c", "Sax", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "P5", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "C", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "lNy", "Landroidx/compose/ui/input/key/KeyEvent;", a.f62811a, "ub", "(Landroid/view/KeyEvent;)Z", "jO", "UhV", "o", "size", "HI", "(J)V", "jB", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "hu", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V", "U", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "ENe", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "YE", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V", "M7", "Landroidx/compose/foundation/text/input/InputTransformation;", "getFilter", "()Landroidx/compose/foundation/text/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "p5", "Z", "f11", "()Z", "setEnabled", "eF", "yUZ", "setReadOnly", "E", "Landroidx/compose/foundation/text/KeyboardOptions;", "kR", "()Landroidx/compose/foundation/text/KeyboardOptions;", "setKeyboardOptions", "(Landroidx/compose/foundation/text/KeyboardOptions;)V", "M", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "getKeyboardActionHandler", "()Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "setKeyboardActionHandler", "(Landroidx/compose/foundation/text/input/KeyboardActionHandler;)V", "Bha", "setSingleLine", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cAB", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "J", "setPassword", "D", "LTFv/r;", "H6M", "()LTFv/r;", "setStylusHandwritingTrigger", "(LTFv/r;)V", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "I", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "dragEnterEvent", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "GR", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "dragAndDropNode", "Nxk", "isElementFocused", "Landroidx/compose/ui/platform/WindowInfo;", "Y", "Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "LGJW/xuv;", "k", "LGJW/xuv;", "toolbarAndHandlesVisibilityObserverJob", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "dR0", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "textFieldKeyEventHandler", "androidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "z", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "keyboardActionScope", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "piY", "Lkotlin/jvm/functions/Function1;", "clipboardKeyCommandsHandler", "ijL", "inputSessionJob", "Lkotlin/Function0;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "m", "Lkotlin/jvm/functions/Function0;", "receiveContentConfigurationProvider", "<set-?>", "eTf", "Landroidx/compose/runtime/MutableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "Hq", "autofillHighlightOn", "Ai", "isFocused", "L", "shouldMergeDescendantSemantics", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 5 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,823:1\n85#2:824\n113#2,2:825\n1#3:827\n316#4,6:828\n324#4,3:842\n327#4:851\n254#5,8:834\n263#5,6:845\n*S KotlinDebug\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n*L\n404#1:824\n404#1:825,2\n659#1:828,6\n659#1:842,3\n659#1:851\n659#1:834,8\n659#1:845,6\n*E\n"})
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private MutableInteractionSource interactionSource;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private TFv.r stylusHandwritingTrigger;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private KeyboardOptions keyboardOptions;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private boolean singleLine;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private final DragAndDropTargetModifierNode dragAndDropNode;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private HoverInteraction.Enter dragEnterEvent;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean isPassword;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private KeyboardActionHandler keyboardActionHandler;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private InputTransformation filter;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private boolean isElementFocused;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private TextFieldSelectionState textFieldSelectionState;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private TextLayoutState textLayoutState;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private WindowInfo windowInfo;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SuspendingPointerInputModifierNode pointerInputNode;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private boolean readOnly;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private final MutableState autofillHighlightOn;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private xuv inputSessionJob;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private TransformedTextFieldState textFieldState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private xuv toolbarAndHandlesVisibilityObserverJob;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Function0 receiveContentConfigurationProvider;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private final Function1 clipboardKeyCommandsHandler;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: L */
    public boolean getMergeDescendants() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Ai() {
        WindowInfo windowInfo = this.windowInfo;
        return this.isElementFocused && (windowInfo != null && windowInfo.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F6W() {
        this.textFieldSelectionState.n1(Ai());
        if (Ai() && this.toolbarAndHandlesVisibilityObserverJob == null) {
            this.toolbarAndHandlesVisibilityObserverJob = GJW.C.nr(Xli(), null, null, new TextFieldDecoratorModifierNode$onFocusChange$1(this, null), 3, null);
        } else {
            if (Ai()) {
                return;
            }
            xuv xuvVar = this.toolbarAndHandlesVisibilityObserverJob;
            if (xuvVar != null) {
                xuv.j.rl(xuvVar, null, 1, null);
            }
            this.toolbarAndHandlesVisibilityObserverJob = null;
        }
    }

    private final boolean G() {
        return ((Boolean) this.autofillHighlightOn.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hq(boolean z2) {
        this.autofillHighlightOn.setValue(Boolean.valueOf(z2));
    }

    private final void R3E() {
        xuv xuvVar = this.inputSessionJob;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.inputSessionJob = null;
        TFv.r rVar = this.stylusHandwritingTrigger;
        if (rVar != null) {
            rVar.KN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Yq() {
        HoverInteraction.Enter enter = this.dragEnterEvent;
        if (enter != null) {
            this.interactionSource.rl(new HoverInteraction.Exit(enter));
            this.dragEnterEvent = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lvn(Continuation continuation) {
        Object objN = TFv.fuX.jB(TFv.fuX.o(SnapshotStateKt.Ik(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$observeUntransformedTextChanges$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f20290n.getTextFieldState().ty().toString();
            }
        }), 1), 1).n(new TFv.CN3() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$observeUntransformedTextChanges$3
            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(String str, Continuation continuation2) {
                this.f20291n.Hq(false);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean fromTap) {
        if (fromTap || this.keyboardOptions.mUb()) {
            this.inputSessionJob = GJW.C.nr(Xli(), null, null, new TextFieldDecoratorModifierNode$startInputSession$1(this, ReceiveContentConfigurationKt.rl(this), null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u2n(final int imeAction) {
        KeyboardActionHandler keyboardActionHandler;
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.az(imeAction, companion.O()) || ImeAction.az(imeAction, companion.n()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            this.keyboardActionScope.n(imeAction);
        } else if (keyboardActionHandler != null) {
            keyboardActionHandler.n(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
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
                    this.f20294n.keyboardActionScope.n(imeAction);
                }
            });
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void B(FocusState focusState) {
        if (this.isElementFocused == focusState.n()) {
            return;
        }
        this.isElementFocused = focusState.n();
        F6W();
        boolean z2 = this.enabled && !this.readOnly;
        if (focusState.n()) {
            if (z2) {
                p(false);
                return;
            }
            return;
        }
        R3E();
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f20586n;
        textFieldState.getMainBuffer().O().O();
        TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.nr();
        transformedTextFieldState.X(mainBuffer);
        textFieldState.O(inputTransformation, true, textFieldEditUndoBehavior);
        this.textFieldState.KN();
    }

    /* JADX INFO: renamed from: Bha, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void C(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        this.pointerInputNode.C(pointerEvent, pass, bounds);
    }

    /* JADX INFO: renamed from: ENe, reason: from getter */
    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence textFieldCharSequenceQie = this.textFieldState.qie();
        long selection = textFieldCharSequenceQie.getSelection();
        SemanticsPropertiesKt.piY(semanticsPropertyReceiver, new AnnotatedString(this.textFieldState.ty().toString(), null, 2, null));
        SemanticsPropertiesKt.k(semanticsPropertyReceiver, new AnnotatedString(textFieldCharSequenceQie.toString(), null, 2, null));
        SemanticsPropertiesKt.mYa(semanticsPropertyReceiver, selection);
        if (!this.enabled) {
            SemanticsPropertiesKt.qie(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.bzg(semanticsPropertyReceiver);
        }
        final boolean z2 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.Y(semanticsPropertyReceiver, z2);
        SemanticsPropertiesKt.a(semanticsPropertyReceiver, ContentDataType.INSTANCE.n());
        SemanticsPropertiesKt.nY(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {536}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f20257n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ TextFieldDecoratorModifierNode f20258t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation continuation) {
                    super(2, continuation);
                    this.f20258t = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.f20258t, continuation);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
                    return invoke2(vdVar, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f20257n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f20258t;
                        this.f20257n = 1;
                        if (textFieldDecoratorModifierNode.lvn(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(AnnotatedString annotatedString) {
                if (!z2) {
                    return Boolean.FALSE;
                }
                this.getTextFieldState().S(annotatedString);
                this.Hq(true);
                GJW.C.nr(this.Xli(), null, null, new AnonymousClass1(this, null), 3, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.XQ(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                TextLayoutResult textLayoutResultJ2 = this.f20265n.getTextLayoutState().J2();
                return Boolean.valueOf(textLayoutResultJ2 != null ? list.add(textLayoutResultJ2) : false);
            }
        }, 1, null);
        if (z2) {
            SemanticsPropertiesKt.qm(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z2) {
                        return Boolean.FALSE;
                    }
                    this.getTextFieldState().S(annotatedString);
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.aYN(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z2) {
                        return Boolean.FALSE;
                    }
                    TransformedTextFieldState.aYN(this.getTextFieldState(), annotatedString, true, null, false, 12, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.fcU(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$5
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return n(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final Boolean n(int i2, int i3, boolean z3) {
                TextFieldCharSequence textFieldCharSequenceTy = z3 ? this.f20270n.getTextFieldState().ty() : this.f20270n.getTextFieldState().HI();
                long selection2 = textFieldCharSequenceTy.getSelection();
                if (!this.f20270n.getEnabled() || Math.min(i2, i3) < 0 || Math.max(i2, i3) > textFieldCharSequenceTy.length()) {
                    return Boolean.FALSE;
                }
                if (i2 == TextRange.ty(selection2) && i3 == TextRange.xMQ(selection2)) {
                    return Boolean.TRUE;
                }
                long jRl = TextRangeKt.rl(i2, i3);
                if (z3 || i2 == i3) {
                    this.f20270n.getTextFieldSelectionState().How(TextToolbarState.f20573n);
                } else {
                    this.f20270n.getTextFieldSelectionState().How(TextToolbarState.f20572O);
                }
                if (z3) {
                    this.f20270n.getTextFieldState().iF(jRl);
                } else {
                    this.f20270n.getTextFieldState().te(jRl);
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        final int iUo = this.keyboardOptions.Uo();
        SemanticsPropertiesKt.fD(semanticsPropertyReceiver, iUo, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f20271n.u2n(iUo);
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (!this.f20273n.Ai()) {
                    FocusRequesterModifierNodeKt.rl(this.f20273n);
                } else if (!this.f20273n.getReadOnly()) {
                    this.f20273n.q().show();
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.e(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                if (!this.f20274n.Ai()) {
                    FocusRequesterModifierNodeKt.rl(this.f20274n);
                }
                this.f20274n.getTextFieldSelectionState().How(TextToolbarState.f20572O);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.KN(selection) && !this.isPassword) {
            SemanticsPropertiesKt.KN(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9

                /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {622}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f20276n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ TextFieldDecoratorModifierNode f20277t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation continuation) {
                        super(2, continuation);
                        this.f20277t = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.f20277t, continuation);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
                        return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
                        return invoke2(vdVar, (Continuation) continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f20276n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            TextFieldSelectionState textFieldSelectionState = this.f20277t.getTextFieldSelectionState();
                            this.f20276n = 1;
                            if (TextFieldSelectionState.N(textFieldSelectionState, false, this, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    GJW.C.nr(this.f20275n.Xli(), null, null, new AnonymousClass1(this.f20275n, null), 3, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.mUb(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {627}, m = "invokeSuspend", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f20260n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ TextFieldDecoratorModifierNode f20261t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation continuation) {
                            super(2, continuation);
                            this.f20261t = textFieldDecoratorModifierNode;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.f20261t, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
                            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f20260n;
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                TextFieldSelectionState textFieldSelectionState = this.f20261t.getTextFieldSelectionState();
                                this.f20260n = 1;
                                if (textFieldSelectionState.s7N(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        GJW.C.nr(this.f20259n.Xli(), null, null, new AnonymousClass1(this.f20259n, null), 3, null);
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (z2) {
            SemanticsPropertiesKt.jB(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11

                /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f20263n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ TextFieldDecoratorModifierNode f20264t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation continuation) {
                        super(2, continuation);
                        this.f20264t = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.f20264t, continuation);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
                        return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
                        return invoke2(vdVar, (Continuation) continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f20263n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            TextFieldSelectionState textFieldSelectionState = this.f20264t.getTextFieldSelectionState();
                            this.f20263n = 1;
                            if (textFieldSelectionState.ofS(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    GJW.C.nr(this.f20262n.Xli(), null, null, new AnonymousClass1(this.f20262n, null), 3, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.FX(semanticsPropertyReceiver);
        }
    }

    /* JADX INFO: renamed from: H6M, reason: from getter */
    public final TFv.r getStylusHandwritingTrigger() {
        return this.stylusHandwritingTrigger;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void HI(long size) {
        this.dragAndDropNode.HI(size);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void P5(LayoutCoordinates coordinates) {
        this.textLayoutState.ty(coordinates);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void UhV() {
        ObserverModifierNodeKt.n(this, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onObservedReadsChanged$1
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
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f20297n;
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.n(textFieldDecoratorModifierNode, CompositionLocalsKt.S());
                this.f20297n.F6W();
            }
        });
    }

    /* JADX INFO: renamed from: YE, reason: from getter */
    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    /* JADX INFO: renamed from: cAB, reason: from getter */
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void ep(TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation filter, boolean enabled, boolean readOnly, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean singleLine, MutableInteractionSource interactionSource, boolean isPassword, TFv.r stylusHandwritingTrigger) {
        TextFieldSelectionState textFieldSelectionState2;
        boolean z2;
        xuv xuvVar;
        boolean z3 = this.enabled;
        boolean z4 = z3 && !this.readOnly;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState3 = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        boolean z5 = this.isPassword;
        TFv.r rVar = this.stylusHandwritingTrigger;
        if (!enabled || readOnly) {
            textFieldSelectionState2 = textFieldSelectionState3;
            z2 = false;
        } else {
            textFieldSelectionState2 = textFieldSelectionState3;
            z2 = true;
        }
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = filter;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = singleLine;
        this.interactionSource = interactionSource;
        this.isPassword = isPassword;
        this.stylusHandwritingTrigger = stylusHandwritingTrigger;
        if (z2 != z4 || !Intrinsics.areEqual(textFieldState, transformedTextFieldState) || !Intrinsics.areEqual(keyboardOptions, keyboardOptions2) || !Intrinsics.areEqual(stylusHandwritingTrigger, rVar)) {
            if (z2 && Ai()) {
                p(false);
            } else if (!z2) {
                R3E();
            }
        }
        if (enabled != z3 || z2 != z4 || !ImeAction.az(keyboardOptions.Uo(), keyboardOptions2.Uo()) || isPassword != z5) {
            SemanticsModifierNodeKt.rl(this);
        }
        if (!Intrinsics.areEqual(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.p0N();
            if (getIsAttached()) {
                textFieldSelectionState.qm(this.receiveContentConfigurationProvider);
                if (Ai() && (xuvVar = this.toolbarAndHandlesVisibilityObserverJob) != null) {
                    if (xuvVar != null) {
                        xuv.j.rl(xuvVar, null, 1, null);
                    }
                    this.toolbarAndHandlesVisibilityObserverJob = GJW.C.nr(Xli(), null, null, new TextFieldDecoratorModifierNode$updateNode$1(textFieldSelectionState, null), 3, null);
                }
            }
            textFieldSelectionState.mYa(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$2
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
                    DelegatableNodeKt.xMQ(this.f20325n);
                }
            });
        }
        if (Intrinsics.areEqual(interactionSource, mutableInteractionSource)) {
            return;
        }
        this.pointerInputNode.p0N();
    }

    /* JADX INFO: renamed from: f11, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: hu, reason: from getter */
    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public boolean jO(KeyEvent event) {
        return this.textFieldKeyEventHandler.rl(event, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.clipboardKeyCommandsHandler, this.enabled && !this.readOnly, this.singleLine, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
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
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f20296n;
                textFieldDecoratorModifierNode.u2n(textFieldDecoratorModifierNode.getKeyboardOptions().Uo());
            }
        });
    }

    /* JADX INFO: renamed from: kR, reason: from getter */
    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void lNy() {
        this.pointerInputNode.lNy();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void o(LayoutCoordinates coordinates) {
        this.dragAndDropNode.o(coordinates);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public boolean ub(KeyEvent event) {
        return this.textFieldKeyEventHandler.t(event, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.n(this, CompositionLocalsKt.Uo()), q());
    }

    /* JADX INFO: renamed from: yUZ, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource, boolean z5, TFv.r rVar) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z2;
        this.readOnly = z3;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z4;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z5;
        this.stylusHandwritingTrigger = rVar;
        textFieldSelectionState.mYa(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.1
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
                DelegatableNodeKt.xMQ(TextFieldDecoratorModifierNode.this);
            }
        });
        this.pointerInputNode = (SuspendingPointerInputModifierNode) UR(SuspendingPointerInputFilterKt.n(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {
                final /* synthetic */ PointerInputScope J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ TextFieldDecoratorModifierNode f20299O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f20300n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f20301t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, PointerInputScope pointerInputScope, Continuation continuation) {
                    super(2, continuation);
                    this.f20299O = textFieldDecoratorModifierNode;
                    this.J2 = pointerInputScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f20299O, this.J2, continuation);
                    anonymousClass1.f20301t = obj;
                    return anonymousClass1;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
                    return invoke2(vdVar, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f20300n == 0) {
                        ResultKt.throwOnFailure(obj);
                        GJW.vd vdVar = (GJW.vd) this.f20301t;
                        final TextFieldSelectionState textFieldSelectionState = this.f20299O.getTextFieldSelectionState();
                        final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f20299O;
                        PointerInputScope pointerInputScope = this.J2;
                        Function0<Unit> function0 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR (r8v0 'function0' kotlin.jvm.functions.Function0<kotlin.Unit>) = 
                              (r12v4 'textFieldSelectionState' androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState A[DONT_INLINE])
                              (r6v0 'textFieldDecoratorModifierNode' androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode A[DONT_INLINE])
                             A[DECLARE_VAR, MD:(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void (m)] (LINE:30) call: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1.<init>(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void type: CONSTRUCTOR in method: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: /content/repo2/apk-analysis/Alight motion /classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 23 more
                            */
                        /*
                            this = this;
                            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r0 = r11.f20300n
                            if (r0 != 0) goto L4c
                            kotlin.ResultKt.throwOnFailure(r12)
                            java.lang.Object r12 = r11.f20301t
                            r0 = r12
                            GJW.vd r0 = (GJW.vd) r0
                            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r12 = r11.f20299O
                            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12 = r12.getTextFieldSelectionState()
                            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r11.f20299O
                            androidx.compose.ui.input.pointer.PointerInputScope r7 = r11.J2
                            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 r8 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1
                            r8.<init>(r12, r6)
                            GJW.h r2 = GJW.h.J2
                            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 r3 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1
                            r9 = 0
                            r3.<init>(r12, r7, r9)
                            r4 = 1
                            r5 = 0
                            r1 = 0
                            GJW.Dsr.nr(r0, r1, r2, r3, r4, r5)
                            r10 = r2
                            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 r1 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2
                            r2 = r6
                            r6 = 0
                            r3 = r12
                            r4 = r7
                            r5 = r8
                            r1.<init>(r2, r3, r4, r5, r6)
                            r6 = r4
                            r7 = r5
                            r4 = 1
                            r5 = 0
                            r3 = r1
                            r1 = 0
                            r2 = r10
                            GJW.Dsr.nr(r0, r1, r2, r3, r4, r5)
                            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 r3 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3
                            r3.<init>(r12, r6, r7, r9)
                            GJW.Dsr.nr(r0, r1, r2, r3, r4, r5)
                            kotlin.Unit r12 = kotlin.Unit.INSTANCE
                            return r12
                        L4c:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r0)
                            throw r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                    Object objJ2 = GJW.Lu.J2(new AnonymousClass1(this.f20298n, pointerInputScope, null), continuation);
                    return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
                }
            }));
            this.dragAndDropNode = (DragAndDropTargetModifierNode) UR(TextFieldDragAndDropNode_androidKt.rl(new Function0<Set<? extends MediaType>>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Set invoke() {
                    return ReceiveContentConfigurationKt.rl(this.f20282n) != null ? TextFieldDecoratorModifierKt.rl : TextFieldDecoratorModifierKt.f20239n;
                }
            }, new Function2<ClipEntry, ClipMetadata, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(ClipEntry clipEntry, ClipMetadata clipMetadata) {
                    ClipEntry clipEntry2;
                    this.f20283n.Yq();
                    this.f20283n.getTextFieldSelectionState().X();
                    String strN = TransferableContent_androidKt.n(clipEntry);
                    ReceiveContentConfiguration receiveContentConfigurationRl = ReceiveContentConfigurationKt.rl(this.f20283n);
                    if (receiveContentConfigurationRl != null) {
                        TransferableContent transferableContentO = receiveContentConfigurationRl.getReceiveContentListener().O(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.INSTANCE.rl(), null, 8, null));
                        strN = (transferableContentO == null || (clipEntry2 = transferableContentO.getClipEntry()) == null) ? null : TransferableContent_androidKt.n(clipEntry2);
                    }
                    String str = strN;
                    if (str != null) {
                        TransformedTextFieldState.aYN(this.f20283n.getTextFieldState(), str, false, null, false, 14, null);
                    }
                    return Boolean.TRUE;
                }
            }, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                    n(dragAndDropEvent);
                    return Unit.INSTANCE;
                }

                public final void n(DragAndDropEvent dragAndDropEvent) {
                    if (ReceiveContentConfigurationKt.rl(this.f20284n) != null) {
                        DragAndDropRequestPermission_androidKt.rl(this.f20284n, dragAndDropEvent);
                    }
                }
            }, null, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                    n(dragAndDropEvent);
                    return Unit.INSTANCE;
                }

                public final void n(DragAndDropEvent dragAndDropEvent) {
                    ReceiveContentListener receiveContentListener;
                    TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f20285n;
                    HoverInteraction.Enter enter = new HoverInteraction.Enter();
                    this.f20285n.getInteractionSource().rl(enter);
                    textFieldDecoratorModifierNode.dragEnterEvent = enter;
                    ReceiveContentConfiguration receiveContentConfigurationRl = ReceiveContentConfigurationKt.rl(this.f20285n);
                    if (receiveContentConfigurationRl == null || (receiveContentListener = receiveContentConfigurationRl.getReceiveContentListener()) == null) {
                        return;
                    }
                    receiveContentListener.n();
                }
            }, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    n(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                public final void n(long j2) {
                    long jNr = TextLayoutStateKt.nr(this.f20286n.getTextLayoutState(), j2);
                    int iXMQ = TextLayoutState.xMQ(this.f20286n.getTextLayoutState(), jNr, false, 2, null);
                    if (iXMQ >= 0) {
                        this.f20286n.getTextFieldState().te(TextRangeKt.n(iXMQ));
                    }
                    this.f20286n.getTextFieldSelectionState().UhV(Handle.f19677n, jNr);
                }
            }, null, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$6
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                    n(dragAndDropEvent);
                    return Unit.INSTANCE;
                }

                public final void n(DragAndDropEvent dragAndDropEvent) {
                    ReceiveContentListener receiveContentListener;
                    this.f20287n.Yq();
                    this.f20287n.getTextFieldSelectionState().X();
                    ReceiveContentConfiguration receiveContentConfigurationRl = ReceiveContentConfigurationKt.rl(this.f20287n);
                    if (receiveContentConfigurationRl == null || (receiveContentListener = receiveContentConfigurationRl.getReceiveContentListener()) == null) {
                        return;
                    }
                    receiveContentListener.nr();
                }
            }, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$7
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                    n(dragAndDropEvent);
                    return Unit.INSTANCE;
                }

                public final void n(DragAndDropEvent dragAndDropEvent) {
                    this.f20288n.Yq();
                }
            }, 72, null));
            this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.rl();
            this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
            this.clipboardKeyCommandsHandler = ClipboardKeyCommandsHandler.n(new Function1<KeyCommand, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1

                /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {385, 386, 387}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ TextFieldDecoratorModifierNode f20279O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f20280n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ KeyCommand f20281t;

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1$WhenMappings */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[KeyCommand.values().length];
                            try {
                                iArr[KeyCommand.f19711U.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[KeyCommand.M7.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[KeyCommand.P5.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(KeyCommand keyCommand, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation continuation) {
                        super(2, continuation);
                        this.f20281t = keyCommand;
                        this.f20279O = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.f20281t, this.f20279O, continuation);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
                        return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
                        return invoke2(vdVar, (Continuation) continuation);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
                    
                        if (r6.ofS(r5) == r0) goto L23;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
                    
                        if (r6.s7N(r5) == r0) goto L23;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
                    
                        if (r6.T(false, r5) == r0) goto L23;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
                    
                        return r0;
                     */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f20280n;
                        if (i2 != 0) {
                            if (i2 == 1 || i2 == 2 || i2 == 3) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            int i3 = WhenMappings.$EnumSwitchMapping$0[this.f20281t.ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        TextFieldSelectionState textFieldSelectionState = this.f20279O.getTextFieldSelectionState();
                                        this.f20280n = 3;
                                    }
                                } else {
                                    TextFieldSelectionState textFieldSelectionState2 = this.f20279O.getTextFieldSelectionState();
                                    this.f20280n = 2;
                                }
                            } else {
                                TextFieldSelectionState textFieldSelectionState3 = this.f20279O.getTextFieldSelectionState();
                                this.f20280n = 1;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyCommand keyCommand) {
                    n(keyCommand);
                    return Unit.INSTANCE;
                }

                public final void n(KeyCommand keyCommand) {
                    GJW.C.nr(this.f20278n.Xli(), null, GJW.h.J2, new AnonymousClass1(keyCommand, this.f20278n, null), 1, null);
                }
            });
            this.receiveContentConfigurationProvider = new Function0<ReceiveContentConfiguration>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final ReceiveContentConfiguration invoke() {
                    return ReceiveContentConfigurationKt.rl(this.f20315n);
                }
            };
            this.autofillHighlightOn = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SoftwareKeyboardController q() {
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.n(this, CompositionLocalsKt.Ik());
            if (softwareKeyboardController != null) {
                return softwareKeyboardController;
            }
            throw new IllegalStateException("No software keyboard controller");
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void N(ContentDrawScope contentDrawScope) {
            contentDrawScope.l2();
            if (G()) {
                DrawScope.h(contentDrawScope, ((Color) CompositionLocalConsumerModifierNodeKt.n(this, AutofillHighlightKt.n())).getValue(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void Sax() {
            R3E();
            this.textFieldSelectionState.qm(null);
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void c() {
            UhV();
            this.textFieldSelectionState.qm(this.receiveContentConfigurationProvider);
        }
    }
