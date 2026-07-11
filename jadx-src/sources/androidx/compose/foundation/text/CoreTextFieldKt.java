package androidx.compose.foundation.text;

import GJW.Lu;
import GJW.h;
import GJW.vd;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNodeKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001aü\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001123\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001d2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0001¢\u0006\u0004\b$\u0010%\u001a2\u0010)\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001dH\u0003¢\u0006\u0004\b)\u0010*\u001a#\u0010-\u001a\u00020\u0005*\u00020\u00052\u0006\u0010,\u001a\u00020+2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b-\u0010.\u001a'\u00102\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0011H\u0000¢\u0006\u0004\b2\u00103\u001a7\u00108\u001a\u00020\u00032\u0006\u00105\u001a\u0002042\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109\u001a\u0017\u0010:\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b:\u0010;\u001a4\u0010@\u001a\u00020\u0003*\u00020<2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u000b2\u0006\u00107\u001a\u000206H\u0080@¢\u0006\u0004\b@\u0010A\u001a\u001f\u0010C\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0006\u0010B\u001a\u00020\u0011H\u0003¢\u0006\u0004\bC\u0010D\u001a\u0017\u0010E\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\bE\u0010F\u001a'\u0010G\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bG\u0010H¨\u0006J²\u0006\f\u0010I\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "innerTextField", "decorationBox", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "textScrollerPosition", c.f62177j, "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "HI", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "allowKeyboard", "Ik", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/focus/FocusRequester;Z)V", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "ck", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/OffsetMapping;)V", "az", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "textLayoutResult", "qie", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "nr", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "O", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "ty", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V", "writeable", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1129:1\n1247#2,6:1130\n1247#2,6:1136\n1247#2,6:1142\n1247#2,6:1154\n1247#2,3:1160\n1250#2,3:1164\n1247#2,6:1167\n1247#2,6:1173\n1247#2,3:1186\n1250#2,3:1190\n1247#2,6:1193\n1247#2,6:1199\n1247#2,6:1208\n1247#2,6:1214\n1247#2,6:1220\n1247#2,6:1226\n1247#2,6:1232\n1247#2,6:1238\n1247#2,6:1244\n1247#2,6:1250\n1247#2,6:1256\n1247#2,6:1263\n1247#2,6:1312\n1247#2,6:1319\n1247#2,6:1325\n1247#2,6:1331\n75#3:1148\n75#3:1149\n75#3:1150\n75#3:1151\n75#3:1152\n75#3:1153\n75#3:1205\n75#3:1206\n75#3:1207\n75#3:1262\n75#3:1318\n1#4:1163\n557#5:1179\n554#5,6:1180\n555#6:1189\n70#7:1269\n67#7,9:1270\n77#7:1309\n79#8,6:1279\n86#8,3:1294\n89#8,2:1303\n93#8:1308\n347#9,9:1285\n356#9,3:1305\n4206#10,6:1297\n59#11:1310\n90#12:1311\n602#13,8:1337\n85#14:1345\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n206#1:1130,6\n207#1:1136,6\n208#1:1142,6\n225#1:1154,6\n239#1:1160,3\n239#1:1164,3\n253#1:1167,6\n282#1:1173,6\n285#1:1186,3\n285#1:1190,3\n286#1:1193,6\n288#1:1199,6\n308#1:1208,6\n344#1:1214,6\n370#1:1220,6\n371#1:1226,6\n400#1:1232,6\n418#1:1238,6\n471#1:1244,6\n473#1:1250,6\n505#1:1256,6\n524#1:1263,6\n1068#1:1312,6\n1071#1:1319,6\n1073#1:1325,6\n1085#1:1331,6\n213#1:1148\n214#1:1149\n215#1:1150\n216#1:1151\n217#1:1152\n218#1:1153\n294#1:1205\n296#1:1206\n297#1:1207\n522#1:1262\n1069#1:1318\n285#1:1179\n285#1:1180,6\n285#1:1189\n670#1:1269\n670#1:1270,9\n670#1:1309\n670#1:1279,6\n670#1:1294,3\n670#1:1303,2\n670#1:1308\n670#1:1285,9\n670#1:1305,3\n670#1:1297,6\n1012#1:1310\n1012#1:1311\n1114#1:1337,8\n343#1:1345\n*E\n"})
public final class CoreTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:497:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z2, int i2, int i3, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z3, boolean z4, Function3 function3, TextFieldScrollerPosition textFieldScrollerPosition, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        int i10;
        Modifier modifier2;
        int i11;
        TextStyle textStyleN;
        int i12;
        VisualTransformation visualTransformation2;
        int i13;
        Function1 function13;
        int i14;
        MutableInteractionSource mutableInteractionSource2;
        int i15;
        final Brush brush2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        final boolean z5;
        final boolean z6;
        final Function3 function32;
        final TextFieldScrollerPosition textFieldScrollerPosition2;
        final VisualTransformation visualTransformation3;
        final MutableInteractionSource mutableInteractionSource3;
        final Function1 function14;
        Composer composer2;
        final TextStyle textStyle2;
        final Modifier modifier3;
        final int i30;
        final int i31;
        final ImeOptions imeOptions2;
        final KeyboardActions keyboardActions2;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composer3;
        Brush solidColor;
        ImeOptions imeOptionsN;
        KeyboardActions keyboardActionsN;
        boolean z9;
        Function3 function3N;
        VisualTransformation visualTransformation4;
        Modifier modifier4;
        ImeOptions imeOptions3;
        boolean z10;
        final Function1 function15;
        int i32;
        boolean z11;
        MutableInteractionSource mutableInteractionSource4;
        int i33;
        int i34;
        TextFieldScrollerPosition textFieldScrollerPosition3;
        boolean z12;
        Object objIF;
        Composer.Companion companion;
        Object objIF2;
        Object objIF3;
        boolean z13;
        Orientation orientation;
        Modifier modifier5;
        TextStyle textStyle3;
        final Orientation orientation2;
        TextFieldScrollerPosition textFieldScrollerPosition4;
        MutableInteractionSource mutableInteractionSource5;
        LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter;
        AnnotatedString annotatedString;
        TextStyle textStyle4;
        Density density;
        FontFamily.Resolver resolver;
        FocusManager focusManager;
        UndoManager undoManager;
        boolean z14;
        boolean zE2;
        Object objIF4;
        final LegacyTextFieldState legacyTextFieldState;
        TextInputService textInputService;
        final TextFieldValue textFieldValue2;
        ImeOptions imeOptions4;
        final TextFieldSelectionManager textFieldSelectionManager;
        BringIntoViewRequester bringIntoViewRequester;
        TextInputService textInputService2;
        boolean z15;
        boolean z16;
        Object objIF5;
        State state;
        final TextInputService textInputService3;
        boolean zE22;
        Object objIF6;
        boolean zE23;
        Object objIF7;
        final LegacyTextFieldState legacyTextFieldState2;
        FocusRequester focusRequester;
        boolean z17;
        final OffsetMapping offsetMapping;
        final boolean z18;
        boolean zE24;
        Object objIF8;
        boolean zE25;
        Object objIF9;
        boolean z19;
        boolean zE26;
        Modifier modifier6;
        boolean zE27;
        Object objIF10;
        final boolean z20;
        final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter2;
        boolean zN;
        Object objIF11;
        final long value;
        boolean zE28;
        Object objIF12;
        boolean z21;
        Composer composerKN = composer.KN(-244533042);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = (composerKN.p5(textFieldValue) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                i9 |= composerKN.E2(function1) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i9 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i11 = i8 & 8;
                if (i11 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        textStyleN = textStyle;
                        i9 |= composerKN.p5(textStyleN) ? 2048 : 1024;
                    }
                    i12 = i8 & 16;
                    if (i12 == 0) {
                        i9 |= 24576;
                    } else {
                        if ((i5 & 24576) == 0) {
                            visualTransformation2 = visualTransformation;
                            i9 |= composerKN.p5(visualTransformation2) ? 16384 : 8192;
                        }
                        i13 = i8 & 32;
                        if (i13 != 0) {
                            i9 |= 196608;
                            function13 = function12;
                        } else {
                            function13 = function12;
                            if ((i5 & 196608) == 0) {
                                i9 |= composerKN.E2(function13) ? 131072 : 65536;
                            }
                        }
                        i14 = i8 & 64;
                        if (i14 != 0) {
                            i9 |= 1572864;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i5 & 1572864) == 0) {
                                i9 |= composerKN.p5(mutableInteractionSource2) ? 1048576 : 524288;
                            }
                        }
                        i15 = i8 & 128;
                        if (i15 != 0) {
                            i9 |= 12582912;
                            brush2 = brush;
                        } else {
                            brush2 = brush;
                            if ((i5 & 12582912) == 0) {
                                i9 |= composerKN.p5(brush2) ? 8388608 : 4194304;
                            }
                        }
                        i16 = i8 & 256;
                        if (i16 != 0) {
                            i9 |= 100663296;
                        } else if ((i5 & 100663296) == 0) {
                            i9 |= composerKN.n(z2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i17 = i8 & 512;
                        if (i17 == 0) {
                            if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i18 = i17;
                                i9 |= composerKN.t(i2) ? 536870912 : 268435456;
                            }
                            i19 = i8 & 1024;
                            if (i19 == 0) {
                                i21 = i7 | 6;
                                i20 = i19;
                            } else if ((i7 & 6) == 0) {
                                i20 = i19;
                                i21 = i7 | (composerKN.t(i3) ? 4 : 2);
                            } else {
                                i20 = i19;
                                i21 = i7;
                            }
                            if ((i7 & 48) == 0) {
                                i21 |= ((i8 & 2048) == 0 && composerKN.p5(imeOptions)) ? 32 : 16;
                            }
                            int i35 = i21;
                            i22 = i8 & 4096;
                            if (i22 == 0) {
                                i23 = i35 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i23 = i35 | (composerKN.p5(keyboardActions) ? 256 : 128);
                            } else {
                                i23 = i35;
                            }
                            i24 = i8 & 8192;
                            if (i24 == 0) {
                                i25 = i23 | 3072;
                            } else {
                                int i36 = i23;
                                if ((i7 & 3072) == 0) {
                                    i25 = i36 | (composerKN.n(z3) ? 2048 : 1024);
                                } else {
                                    i25 = i36;
                                }
                            }
                            i26 = i8 & 16384;
                            if (i26 == 0) {
                                i27 = i25 | 24576;
                            } else {
                                int i37 = i25;
                                if ((i7 & 24576) == 0) {
                                    i27 = i37 | (composerKN.n(z4) ? 16384 : 8192);
                                } else {
                                    i27 = i37;
                                }
                            }
                            i28 = i8 & 32768;
                            if (i28 == 0) {
                                i27 |= 196608;
                            } else if ((i7 & 196608) == 0) {
                                i27 |= composerKN.E2(function3) ? 131072 : 65536;
                            }
                            i29 = i8 & 65536;
                            if (i29 == 0) {
                                i27 |= 1572864;
                            } else if ((i7 & 1572864) == 0) {
                                i27 |= composerKN.p5(textFieldScrollerPosition) ? 1048576 : 524288;
                            }
                            if (composerKN.HI((i9 & 306783379) == 306783378 || (i27 & 599187) != 599186, i9 & 1)) {
                                composerKN.wTp();
                                z5 = z2;
                                z6 = z3;
                                function32 = function3;
                                textFieldScrollerPosition2 = textFieldScrollerPosition;
                                visualTransformation3 = visualTransformation2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function14 = function13;
                                composer2 = composerKN;
                                textStyle2 = textStyleN;
                                modifier3 = modifier2;
                                i30 = i2;
                                i31 = i3;
                                imeOptions2 = imeOptions;
                                keyboardActions2 = keyboardActions;
                                z7 = z4;
                            } else {
                                composerKN.e();
                                if ((i5 & 1) == 0 || composerKN.rV9()) {
                                    if (i10 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i11 != 0) {
                                        textStyleN = TextStyle.INSTANCE.n();
                                    }
                                    VisualTransformation visualTransformationT = i12 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation2;
                                    if (i13 != 0) {
                                        function13 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1
                                            public final void n(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                n(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                    }
                                    if (i14 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    if (i15 != 0) {
                                        composer3 = composerKN;
                                        solidColor = new SolidColor(Color.INSTANCE.Uo(), null);
                                    } else {
                                        composer3 = composerKN;
                                        solidColor = brush2;
                                    }
                                    boolean z22 = i16 != 0 ? true : z2;
                                    int i38 = i18 != 0 ? Integer.MAX_VALUE : i2;
                                    int i39 = i20 != 0 ? 1 : i3;
                                    if ((i8 & 2048) != 0) {
                                        imeOptionsN = ImeOptions.INSTANCE.n();
                                        i27 &= -113;
                                    } else {
                                        imeOptionsN = imeOptions;
                                    }
                                    keyboardActionsN = i22 != 0 ? KeyboardActions.INSTANCE.n() : keyboardActions;
                                    boolean z23 = i24 != 0 ? true : z3;
                                    z9 = i26 != 0 ? false : z4;
                                    function3N = i28 != 0 ? ComposableSingletons$CoreTextFieldKt.f19504n.n() : function3;
                                    if (i29 != 0) {
                                        int i40 = i39;
                                        visualTransformation4 = visualTransformationT;
                                        modifier4 = modifier2;
                                        imeOptions3 = imeOptionsN;
                                        z10 = z23;
                                        function15 = function13;
                                        i32 = i40;
                                        int i41 = i27;
                                        textFieldScrollerPosition3 = null;
                                        i34 = i41;
                                        int i42 = i38;
                                        z11 = z22;
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        i33 = i42;
                                        composer3.S();
                                        if (ComposerKt.v()) {
                                            z12 = z11;
                                        } else {
                                            z12 = z11;
                                            ComposerKt.p5(-244533042, i9, i34, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:204)");
                                        }
                                        objIF = composer3.iF();
                                        companion = Composer.INSTANCE;
                                        if (objIF == companion.n()) {
                                            objIF = new FocusRequester();
                                            composer3.o(objIF);
                                        }
                                        final FocusRequester focusRequester2 = (FocusRequester) objIF;
                                        objIF2 = composer3.iF();
                                        int i43 = i9;
                                        if (objIF2 == companion.n()) {
                                            objIF2 = LegacyPlatformTextInputServiceAdapter_androidKt.rl();
                                            composer3.o(objIF2);
                                        }
                                        LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter3 = (LegacyPlatformTextInputServiceAdapter) objIF2;
                                        objIF3 = composer3.iF();
                                        Brush brush3 = solidColor;
                                        if (objIF3 == companion.n()) {
                                            objIF3 = new TextInputService(legacyPlatformTextInputServiceAdapter3);
                                            composer3.o(objIF3);
                                        }
                                        final TextInputService textInputService4 = (TextInputService) objIF3;
                                        Density density2 = (Density) composer3.ty(CompositionLocalsKt.J2());
                                        FontFamily.Resolver resolver2 = (FontFamily.Resolver) composer3.ty(CompositionLocalsKt.KN());
                                        long selectionBackgroundColor = ((SelectionColors) composer3.ty(TextSelectionColorsKt.rl())).getSelectionBackgroundColor();
                                        FocusManager focusManager2 = (FocusManager) composer3.ty(CompositionLocalsKt.Uo());
                                        final WindowInfo windowInfo = (WindowInfo) composer3.ty(CompositionLocalsKt.S());
                                        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer3.ty(CompositionLocalsKt.Ik());
                                        final int i44 = i32;
                                        if (i33 != 1) {
                                            z13 = z10;
                                            if (!z12 && imeOptions3.getSingleLine()) {
                                                orientation = Orientation.f16970t;
                                            }
                                            Orientation orientation3 = orientation;
                                            if (textFieldScrollerPosition3 == null) {
                                                composer3.eF(-1705353356);
                                                Object[] objArr = {orientation3};
                                                Saver saverN = TextFieldScrollerPosition.INSTANCE.n();
                                                textStyle3 = textStyleN;
                                                orientation2 = orientation3;
                                                boolean zP5 = composer3.p5(orientation2);
                                                Object objIF13 = composer3.iF();
                                                if (zP5) {
                                                    modifier5 = modifier4;
                                                } else {
                                                    modifier5 = modifier4;
                                                    if (objIF13 == companion.n()) {
                                                    }
                                                    textFieldScrollerPosition4 = (TextFieldScrollerPosition) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF13, composer3, 0, 4);
                                                    composer3.Xw();
                                                }
                                                objIF13 = new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                    public final TextFieldScrollerPosition invoke() {
                                                        return new TextFieldScrollerPosition(orientation2, 0.0f, 2, null);
                                                    }
                                                };
                                                composer3.o(objIF13);
                                                textFieldScrollerPosition4 = (TextFieldScrollerPosition) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF13, composer3, 0, 4);
                                                composer3.Xw();
                                            } else {
                                                modifier5 = modifier4;
                                                textStyle3 = textStyleN;
                                                orientation2 = orientation3;
                                                composer3.eF(-1705354472);
                                                composer3.Xw();
                                                textFieldScrollerPosition4 = textFieldScrollerPosition3;
                                            }
                                            if (textFieldScrollerPosition4.J2() != orientation2) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("Mismatching scroller orientation; ");
                                                sb.append(orientation2 == Orientation.f16969n ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally");
                                                throw new IllegalArgumentException(sb.toString());
                                            }
                                            int i45 = i43 & 14;
                                            int i46 = i43 & 57344;
                                            final TextFieldScrollerPosition textFieldScrollerPosition5 = textFieldScrollerPosition4;
                                            boolean z24 = (i45 == 4) | (i46 == 16384);
                                            Object objIF14 = composer3.iF();
                                            if (z24 || objIF14 == companion.n()) {
                                                TransformedText transformedTextT = ValidatingOffsetMappingKt.t(visualTransformation4, textFieldValue.getText());
                                                TextRange composition = textFieldValue.getComposition();
                                                mutableInteractionSource5 = mutableInteractionSource4;
                                                legacyPlatformTextInputServiceAdapter = legacyPlatformTextInputServiceAdapter3;
                                                if (composition != null) {
                                                    TransformedText transformedTextN = TextFieldDelegate.INSTANCE.n(composition.getPackedValue(), transformedTextT);
                                                    objIF14 = transformedTextN == null ? transformedTextT : transformedTextN;
                                                    composer3.o(objIF14);
                                                }
                                            } else {
                                                mutableInteractionSource5 = mutableInteractionSource4;
                                                legacyPlatformTextInputServiceAdapter = legacyPlatformTextInputServiceAdapter3;
                                            }
                                            TransformedText transformedText = (TransformedText) objIF14;
                                            AnnotatedString text = transformedText.getText();
                                            final OffsetMapping offsetMapping2 = transformedText.getOffsetMapping();
                                            RecomposeScope recomposeScopeRl = ComposablesKt.rl(composer3, 0);
                                            boolean zP52 = composer3.p5(softwareKeyboardController);
                                            Object objIF15 = composer3.iF();
                                            if (zP52 || objIF15 == companion.n()) {
                                                boolean z25 = z12;
                                                TextStyle textStyle5 = textStyle3;
                                                annotatedString = text;
                                                textStyle4 = textStyle5;
                                                z12 = z25;
                                                density = density2;
                                                resolver = resolver2;
                                                objIF15 = new LegacyTextFieldState(new TextDelegate(text, textStyle5, 0, 0, z25, 0, density2, resolver2, null, d.f62986a, null), recomposeScopeRl, softwareKeyboardController);
                                                composer3.o(objIF15);
                                            } else {
                                                annotatedString = text;
                                                density = density2;
                                                resolver = resolver2;
                                                textStyle4 = textStyle3;
                                            }
                                            final LegacyTextFieldState legacyTextFieldState3 = (LegacyTextFieldState) objIF15;
                                            boolean z26 = z12;
                                            KeyboardActions keyboardActions3 = keyboardActionsN;
                                            legacyTextFieldState3.U(textFieldValue.getText(), annotatedString, textStyle4, z26, density, resolver, function1, keyboardActions3, focusManager2, selectionBackgroundColor);
                                            legacyTextFieldState3.getProcessor().nr(textFieldValue, legacyTextFieldState3.getInputSession());
                                            Object objIF16 = composer3.iF();
                                            if (objIF16 == companion.n()) {
                                                focusManager = focusManager2;
                                                objIF16 = new UndoManager(0, 1, null);
                                                composer3.o(objIF16);
                                            } else {
                                                focusManager = focusManager2;
                                            }
                                            UndoManager undoManager2 = (UndoManager) objIF16;
                                            UndoManager.J2(undoManager2, textFieldValue, 0L, 2, null);
                                            Object objIF17 = composer3.iF();
                                            if (objIF17 == companion.n()) {
                                                objIF17 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer3);
                                                composer3.o(objIF17);
                                            }
                                            final vd vdVar = (vd) objIF17;
                                            Object objIF18 = composer3.iF();
                                            final int i47 = i33;
                                            if (objIF18 == companion.n()) {
                                                objIF18 = BringIntoViewRequesterKt.n();
                                                composer3.o(objIF18);
                                            }
                                            final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) objIF18;
                                            Object objIF19 = composer3.iF();
                                            if (objIF19 == companion.n()) {
                                                objIF19 = new TextFieldSelectionManager(undoManager2);
                                                composer3.o(objIF19);
                                            }
                                            final TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) objIF19;
                                            textFieldSelectionManager2.ijL(offsetMapping2);
                                            textFieldSelectionManager2.Mx(visualTransformation4);
                                            textFieldSelectionManager2.m(legacyTextFieldState3.getOnValueChange());
                                            textFieldSelectionManager2.pJg(legacyTextFieldState3);
                                            textFieldSelectionManager2.C(textFieldValue);
                                            textFieldSelectionManager2.D((Clipboard) composer3.ty(CompositionLocalsKt.nr()));
                                            textFieldSelectionManager2.a(vdVar);
                                            textFieldSelectionManager2.ofS((TextToolbar) composer3.ty(CompositionLocalsKt.o()));
                                            textFieldSelectionManager2.piY((HapticFeedback) composer3.ty(CompositionLocalsKt.gh()));
                                            textFieldSelectionManager2.dR0(focusRequester2);
                                            textFieldSelectionManager2.Y(!z9);
                                            textFieldSelectionManager2.k(z13);
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            int i48 = i34 & 7168;
                                            int i49 = i34;
                                            int i50 = i49 & 57344;
                                            boolean zE29 = composer3.E2(legacyTextFieldState3) | (i48 == 2048) | (i50 == 16384) | composer3.E2(textInputService4) | (i45 == 4);
                                            int i51 = (i49 & 112) ^ 48;
                                            if (i51 <= 32 || !composer3.p5(imeOptions3)) {
                                                undoManager = undoManager2;
                                                if ((i49 & 48) != 32) {
                                                    z14 = false;
                                                }
                                                zE2 = zE29 | z14 | composer3.E2(offsetMapping2) | composer3.E2(vdVar) | composer3.E2(bringIntoViewRequester2) | composer3.E2(textFieldSelectionManager2);
                                                objIF4 = composer3.iF();
                                                if (!zE2 || objIF4 == companion.n()) {
                                                    final boolean z27 = z13;
                                                    final ImeOptions imeOptions5 = imeOptions3;
                                                    final boolean z28 = z9;
                                                    objIF4 = new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                                            n(focusState);
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(FocusState focusState) {
                                                            TextLayoutResultProxy textLayoutResultProxyQie;
                                                            if (legacyTextFieldState3.J2() == focusState.n()) {
                                                                return;
                                                            }
                                                            legacyTextFieldState3.e(focusState.n());
                                                            if (legacyTextFieldState3.J2() && z27 && !z28) {
                                                                CoreTextFieldKt.ck(textInputService4, legacyTextFieldState3, textFieldValue, imeOptions5, offsetMapping2);
                                                            } else {
                                                                CoreTextFieldKt.az(legacyTextFieldState3);
                                                            }
                                                            if (focusState.n() && (textLayoutResultProxyQie = legacyTextFieldState3.qie()) != null) {
                                                                GJW.C.nr(vdVar, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester2, textFieldValue, legacyTextFieldState3, textLayoutResultProxyQie, offsetMapping2, null), 3, null);
                                                            }
                                                            if (focusState.n()) {
                                                                return;
                                                            }
                                                            TextFieldSelectionManager.WPU(textFieldSelectionManager2, null, 1, null);
                                                        }
                                                    };
                                                    legacyTextFieldState = legacyTextFieldState3;
                                                    textInputService = textInputService4;
                                                    textFieldValue2 = textFieldValue;
                                                    imeOptions4 = imeOptions5;
                                                    textFieldSelectionManager = textFieldSelectionManager2;
                                                    bringIntoViewRequester = bringIntoViewRequester2;
                                                    composer3.o(objIF4);
                                                } else {
                                                    textFieldValue2 = textFieldValue;
                                                    textInputService = textInputService4;
                                                    bringIntoViewRequester = bringIntoViewRequester2;
                                                    imeOptions4 = imeOptions3;
                                                    textFieldSelectionManager = textFieldSelectionManager2;
                                                    legacyTextFieldState = legacyTextFieldState3;
                                                }
                                                final VisualTransformation visualTransformation5 = visualTransformation4;
                                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                                Modifier modifierN = TextFieldGestureModifiersKt.n(companion2, z13, focusRequester2, mutableInteractionSource6, (Function1) objIF4);
                                                final boolean z29 = z13;
                                                State stateCk = SnapshotStateKt.ck(Boolean.valueOf((z13 || z9) ? false : true), composer3, 0);
                                                Unit unit = Unit.INSTANCE;
                                                boolean zP53 = composer3.p5(stateCk) | composer3.E2(legacyTextFieldState) | composer3.E2(textInputService) | composer3.E2(textFieldSelectionManager);
                                                if (i51 > 32 || !composer3.p5(imeOptions4)) {
                                                    textInputService2 = textInputService;
                                                    if ((i49 & 48) != 32) {
                                                        z15 = false;
                                                    }
                                                    z16 = zP53 | z15;
                                                    objIF5 = composer3.iF();
                                                    if (z16 || objIF5 == companion.n()) {
                                                        objIF5 = new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, stateCk, textInputService2, textFieldSelectionManager, imeOptions4, null);
                                                        state = stateCk;
                                                        textInputService3 = textInputService2;
                                                        composer3.o(objIF5);
                                                    } else {
                                                        state = stateCk;
                                                        textInputService3 = textInputService2;
                                                    }
                                                    final ImeOptions imeOptions6 = imeOptions4;
                                                    EffectsKt.O(unit, (Function2) objIF5, composer3, 6);
                                                    zE22 = composer3.E2(legacyTextFieldState);
                                                    objIF6 = composer3.iF();
                                                    if (!zE22 || objIF6 == companion.n()) {
                                                        objIF6 = new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                                invoke(bool.booleanValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(boolean z30) {
                                                                legacyTextFieldState.X(z30);
                                                            }
                                                        };
                                                        composer3.o(objIF6);
                                                    }
                                                    Modifier modifierR = SelectionGesturesKt.r(companion2, (Function1) objIF6);
                                                    zE23 = (i50 != 16384) | composer3.E2(legacyTextFieldState) | (i48 != 2048) | composer3.E2(offsetMapping2) | composer3.E2(textFieldSelectionManager);
                                                    objIF7 = composer3.iF();
                                                    if (!zE23 || objIF7 == companion.n()) {
                                                        final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                                        final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                                        final boolean z30 = z9;
                                                        objIF7 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
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
                                                                CoreTextFieldKt.Ik(legacyTextFieldState4, focusRequester2, !z30);
                                                                if (legacyTextFieldState4.J2() && z29) {
                                                                    if (legacyTextFieldState4.O() == HandleState.f19683t) {
                                                                        textFieldSelectionManager3.S(Offset.nr(j2));
                                                                        return;
                                                                    }
                                                                    TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState4.qie();
                                                                    if (textLayoutResultProxyQie != null) {
                                                                        LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                        TextFieldDelegate.INSTANCE.mUb(j2, textLayoutResultProxyQie, legacyTextFieldState5.getProcessor(), offsetMapping2, legacyTextFieldState5.getOnValueChange());
                                                                        if (legacyTextFieldState5.getTextDelegate().getText().length() > 0) {
                                                                            legacyTextFieldState5.E2(HandleState.f19680O);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        };
                                                        legacyTextFieldState2 = legacyTextFieldState4;
                                                        focusRequester = focusRequester2;
                                                        z17 = z29;
                                                        offsetMapping = offsetMapping2;
                                                        composer3.o(objIF7);
                                                    } else {
                                                        legacyTextFieldState2 = legacyTextFieldState;
                                                        z17 = z29;
                                                        offsetMapping = offsetMapping2;
                                                        focusRequester = focusRequester2;
                                                    }
                                                    z18 = z17;
                                                    FocusRequester focusRequester3 = focusRequester;
                                                    Modifier modifierRl = PointerIconKt.rl(SelectionGesturesKt.az(TextFieldPressGestureFilterKt.n(modifierR, mutableInteractionSource6, z17, (Function1) objIF7), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.rl(), false, 2, null);
                                                    zE24 = composer3.E2(legacyTextFieldState2) | (i45 != 4) | composer3.E2(offsetMapping);
                                                    objIF8 = composer3.iF();
                                                    if (!zE24 || objIF8 == companion.n()) {
                                                        objIF8 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) throws Throwable {
                                                                n(drawScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(DrawScope drawScope) throws Throwable {
                                                                TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState2.qie();
                                                                if (textLayoutResultProxyQie != null) {
                                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                                    LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState2;
                                                                    OffsetMapping offsetMapping3 = offsetMapping;
                                                                    TextFieldDelegate.INSTANCE.rl(drawScope.getDrawContext().KN(), textFieldValue3, legacyTextFieldState5.o(), legacyTextFieldState5.nr(), offsetMapping3, textLayoutResultProxyQie.getValue(), legacyTextFieldState5.getHighlightPaint(), legacyTextFieldState5.getSelectionBackgroundColor());
                                                                }
                                                            }
                                                        };
                                                        composer3.o(objIF8);
                                                    }
                                                    final Modifier modifierRl2 = DrawModifierKt.rl(companion2, (Function1) objIF8);
                                                    zE25 = (i48 != 2048) | composer3.E2(legacyTextFieldState2) | composer3.p5(windowInfo) | composer3.E2(textFieldSelectionManager) | (i45 != 4) | composer3.E2(offsetMapping);
                                                    objIF9 = composer3.iF();
                                                    if (!zE25 || objIF9 == companion.n()) {
                                                        final TextFieldValue textFieldValue3 = textFieldValue2;
                                                        final OffsetMapping offsetMapping3 = offsetMapping;
                                                        final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState2;
                                                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                                        objIF9 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                n(layoutCoordinates);
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(LayoutCoordinates layoutCoordinates) {
                                                                legacyTextFieldState5.nHg(layoutCoordinates);
                                                                TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState5.qie();
                                                                if (textLayoutResultProxyQie != null) {
                                                                    textLayoutResultProxyQie.xMQ(layoutCoordinates);
                                                                }
                                                                if (z18) {
                                                                    if (legacyTextFieldState5.O() == HandleState.f19683t) {
                                                                        if (legacyTextFieldState5.XQ() && windowInfo.n()) {
                                                                            textFieldSelectionManager4.G7();
                                                                        } else {
                                                                            textFieldSelectionManager4.M();
                                                                        }
                                                                        legacyTextFieldState5.jB(TextFieldSelectionManagerKt.t(textFieldSelectionManager4, true));
                                                                        legacyTextFieldState5.Xw(TextFieldSelectionManagerKt.t(textFieldSelectionManager4, false));
                                                                        legacyTextFieldState5.rV9(TextRange.KN(textFieldValue3.getSelection()));
                                                                    } else if (legacyTextFieldState5.O() == HandleState.f19680O) {
                                                                        legacyTextFieldState5.rV9(TextFieldSelectionManagerKt.t(textFieldSelectionManager4, true));
                                                                    }
                                                                    CoreTextFieldKt.ty(legacyTextFieldState5, textFieldValue3, offsetMapping3);
                                                                    TextLayoutResultProxy textLayoutResultProxyQie2 = legacyTextFieldState5.qie();
                                                                    if (textLayoutResultProxyQie2 != null) {
                                                                        LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState5;
                                                                        TextFieldValue textFieldValue4 = textFieldValue3;
                                                                        OffsetMapping offsetMapping4 = offsetMapping3;
                                                                        TextInputSession inputSession = legacyTextFieldState6.getInputSession();
                                                                        if (inputSession == null || !legacyTextFieldState6.J2()) {
                                                                            return;
                                                                        }
                                                                        TextFieldDelegate.INSTANCE.gh(inputSession, textFieldValue4, offsetMapping4, textLayoutResultProxyQie2);
                                                                    }
                                                                }
                                                            }
                                                        };
                                                        z19 = z18;
                                                        composer3.o(objIF9);
                                                    } else {
                                                        z19 = z18;
                                                    }
                                                    final Modifier modifierN2 = OnGloballyPositionedModifierKt.n(companion2, (Function1) objIF9);
                                                    final OffsetMapping offsetMapping4 = offsetMapping;
                                                    boolean z31 = z19;
                                                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState2, z9, z31, visualTransformation5 instanceof PasswordVisualTransformation, offsetMapping4, textFieldSelectionManager, imeOptions6, focusRequester3);
                                                    final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState2;
                                                    Modifier modifierN3 = TextFieldCursorKt.n(companion2, legacyTextFieldState6, textFieldValue, offsetMapping4, brush3, (z31 || z9 || !windowInfo.n() || legacyTextFieldState2.nY()) ? false : true);
                                                    zE26 = composer3.E2(textFieldSelectionManager);
                                                    Object objIF20 = composer3.iF();
                                                    if (zE26) {
                                                        modifier6 = modifierN3;
                                                        if (objIF20 == companion.n()) {
                                                        }
                                                        EffectsKt.rl(textFieldSelectionManager, (Function1) objIF20, composer3, 0);
                                                        zE27 = ((i51 > 32 && composer3.p5(imeOptions6)) || (i49 & 48) == 32) | composer3.E2(legacyTextFieldState6) | composer3.E2(textInputService3) | (i45 == 4);
                                                        objIF10 = composer3.iF();
                                                        if (zE27 || objIF10 == companion.n()) {
                                                            objIF10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                    if (legacyTextFieldState6.J2()) {
                                                                        LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState6;
                                                                        legacyTextFieldState7.T(TextFieldDelegate.INSTANCE.xMQ(textInputService3, textFieldValue, legacyTextFieldState7.getProcessor(), imeOptions6, legacyTextFieldState6.getOnValueChange(), legacyTextFieldState6.getOnImeActionPerformed()));
                                                                    }
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void n() {
                                                                        }
                                                                    };
                                                                }
                                                            };
                                                            composer3.o(objIF10);
                                                        }
                                                        EffectsKt.rl(imeOptions6, (Function1) objIF10, composer3, (i49 >> 3) & 14);
                                                        Modifier modifierN4 = TextFieldKeyInputKt.n(companion2, legacyTextFieldState6, textFieldSelectionManager, textFieldValue, legacyTextFieldState6.getOnValueChange(), !z9, i47 != 1, offsetMapping4, undoManager, imeOptions6.getImeAction());
                                                        Modifier modifierT = companion2;
                                                        int keyboardType = imeOptions6.getKeyboardType();
                                                        KeyboardType.Companion companion3 = KeyboardType.INSTANCE;
                                                        z20 = KeyboardType.ty(keyboardType, companion3.J2()) && !KeyboardType.ty(imeOptions6.getKeyboardType(), companion3.O());
                                                        boolean zRl = rl(state);
                                                        legacyPlatformTextInputServiceAdapter2 = legacyPlatformTextInputServiceAdapter;
                                                        zN = composer3.n(z20) | composer3.E2(legacyPlatformTextInputServiceAdapter2);
                                                        objIF11 = composer3.iF();
                                                        if (!zN || objIF11 == companion.n()) {
                                                            objIF11 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
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
                                                                    if (z20) {
                                                                        legacyPlatformTextInputServiceAdapter2.gh();
                                                                    }
                                                                }
                                                            };
                                                            composer3.o(objIF11);
                                                        }
                                                        Modifier modifierRl3 = StylusHandwritingKt.rl(modifierT, zRl, z20, (Function0) objIF11);
                                                        value = ((Color) composer3.ty(AutofillHighlightKt.n())).getValue();
                                                        zE28 = composer3.E2(legacyTextFieldState6) | composer3.nr(value);
                                                        objIF12 = composer3.iF();
                                                        if (!zE28 || objIF12 == companion.n()) {
                                                            objIF12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                                                    n(drawScope);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void n(DrawScope drawScope) {
                                                                    if (legacyTextFieldState6.t() || legacyTextFieldState6.xMQ()) {
                                                                        DrawScope.h(drawScope, value, 0L, 0L, 0.0f, null, null, 0, 126, null);
                                                                    }
                                                                }
                                                            };
                                                            composer3.o(objIF12);
                                                        }
                                                        Modifier modifierN5 = OnGloballyPositionedModifierKt.n(TextFieldScrollKt.nr(HI(TextFieldFocusModifier_androidKt.rl(LegacyAdaptingPlatformTextInputModifierNodeKt.n(modifier5.Zmq(DrawModifierKt.rl(modifierT, (Function1) objIF12)), legacyPlatformTextInputServiceAdapter2, legacyTextFieldState6, textFieldSelectionManager).Zmq(modifierRl3).Zmq(modifierN), legacyTextFieldState6, focusManager), legacyTextFieldState6, textFieldSelectionManager).Zmq(modifierN4), textFieldScrollerPosition5, mutableInteractionSource6, z31).Zmq(modifierRl).Zmq(coreTextFieldSemanticsModifier), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                n(layoutCoordinates);
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(LayoutCoordinates layoutCoordinates) {
                                                                TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState6.qie();
                                                                if (textLayoutResultProxyQie == null) {
                                                                    return;
                                                                }
                                                                textLayoutResultProxyQie.KN(layoutCoordinates);
                                                            }
                                                        });
                                                        z21 = !z31 && legacyTextFieldState6.J2() && legacyTextFieldState6.g() && windowInfo.n();
                                                        if (z21) {
                                                            modifierT = TextFieldSelectionManager_androidKt.t(modifierT, textFieldSelectionManager);
                                                        }
                                                        final BringIntoViewRequester bringIntoViewRequester3 = bringIntoViewRequester;
                                                        Composer composer4 = composer3;
                                                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                                        final boolean z32 = z9;
                                                        final Function3 function33 = function3N;
                                                        final Modifier modifier7 = modifier6;
                                                        final TextStyle textStyle6 = textStyle4;
                                                        final Density density3 = density;
                                                        final boolean z33 = z21;
                                                        final Modifier modifier8 = modifierT;
                                                        t(modifierN5, textFieldSelectionManager5, ComposableLambdaKt.nr(-492537660, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                n(composer5, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(Composer composer5, int i52) {
                                                                if (!composer5.HI((i52 & 3) != 2, i52 & 1)) {
                                                                    composer5.wTp();
                                                                    return;
                                                                }
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.p5(-492537660, i52, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:555)");
                                                                }
                                                                Function3 function34 = function33;
                                                                final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState6;
                                                                final TextStyle textStyle7 = textStyle6;
                                                                final int i53 = i44;
                                                                final int i54 = i47;
                                                                final TextFieldScrollerPosition textFieldScrollerPosition6 = textFieldScrollerPosition5;
                                                                final TextFieldValue textFieldValue4 = textFieldValue;
                                                                final VisualTransformation visualTransformation6 = visualTransformation5;
                                                                final Modifier modifier9 = modifier7;
                                                                final Modifier modifier10 = modifierRl2;
                                                                final Modifier modifier11 = modifierN2;
                                                                final Modifier modifier12 = modifier8;
                                                                final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester3;
                                                                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager5;
                                                                final boolean z34 = z33;
                                                                final boolean z35 = z32;
                                                                final Function1 function16 = function15;
                                                                final OffsetMapping offsetMapping5 = offsetMapping4;
                                                                final Density density4 = density3;
                                                                function34.invoke(ComposableLambdaKt.nr(-1835647873, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                        n(composer6, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void n(Composer composer6, int i55) {
                                                                        if (!composer6.HI((i55 & 3) != 2, i55 & 1)) {
                                                                            composer6.wTp();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.v()) {
                                                                            ComposerKt.p5(-1835647873, i55, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:558)");
                                                                        }
                                                                        Modifier modifierN6 = HeightInLinesModifierKt.n(SizeKt.gh(Modifier.INSTANCE, legacyTextFieldState7.az(), 0.0f, 2, null), textStyle7, i53, i54);
                                                                        TextFieldScrollerPosition textFieldScrollerPosition7 = textFieldScrollerPosition6;
                                                                        TextFieldValue textFieldValue5 = textFieldValue4;
                                                                        VisualTransformation visualTransformation7 = visualTransformation6;
                                                                        boolean zE210 = composer6.E2(legacyTextFieldState7);
                                                                        final LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState7;
                                                                        Object objIF21 = composer6.iF();
                                                                        if (zE210 || objIF21 == Composer.INSTANCE.n()) {
                                                                            objIF21 = new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                                                {
                                                                                    super(0);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                                                public final TextLayoutResultProxy invoke() {
                                                                                    return legacyTextFieldState8.qie();
                                                                                }
                                                                            };
                                                                            composer6.o(objIF21);
                                                                        }
                                                                        Modifier modifierRl4 = BringIntoViewRequesterKt.rl(TextFieldSizeKt.n(TextFieldScroll_androidKt.n(modifierN6, textFieldScrollerPosition7, textFieldValue5, visualTransformation7, (Function0) objIF21).Zmq(modifier9).Zmq(modifier10), textStyle7).Zmq(modifier11).Zmq(modifier12), bringIntoViewRequester4);
                                                                        final TextFieldSelectionManager textFieldSelectionManager7 = textFieldSelectionManager6;
                                                                        final LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState7;
                                                                        final boolean z36 = z34;
                                                                        final boolean z37 = z35;
                                                                        final Function1 function17 = function16;
                                                                        final TextFieldValue textFieldValue6 = textFieldValue4;
                                                                        final OffsetMapping offsetMapping6 = offsetMapping5;
                                                                        final Density density5 = density4;
                                                                        final int i56 = i54;
                                                                        SimpleLayoutKt.n(modifierRl4, ComposableLambdaKt.nr(-1172467467, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(2);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                                                n(composer7, num.intValue());
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
                                                                            /*
                                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                                            */
                                                                            public final void n(Composer composer7, int i57) {
                                                                                boolean z38 = true;
                                                                                if (!composer7.HI((i57 & 3) != 2, i57 & 1)) {
                                                                                    composer7.wTp();
                                                                                    return;
                                                                                }
                                                                                if (ComposerKt.v()) {
                                                                                    ComposerKt.p5(-1172467467, i57, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:579)");
                                                                                }
                                                                                final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState9;
                                                                                final Function1 function18 = function17;
                                                                                final TextFieldValue textFieldValue7 = textFieldValue6;
                                                                                final OffsetMapping offsetMapping7 = offsetMapping6;
                                                                                final Density density6 = density5;
                                                                                final int i58 = i56;
                                                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                                    public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i59) {
                                                                                        legacyTextFieldState10.getTextDelegate().az(intrinsicMeasureScope.getLayoutDirection());
                                                                                        return legacyTextFieldState10.getTextDelegate().t();
                                                                                    }

                                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                                    public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                                                                                        Snapshot.Companion companion4 = Snapshot.INSTANCE;
                                                                                        LegacyTextFieldState legacyTextFieldState11 = legacyTextFieldState10;
                                                                                        Snapshot snapshotNr = companion4.nr();
                                                                                        Function1 readObserver = snapshotNr != null ? snapshotNr.getReadObserver() : null;
                                                                                        Snapshot snapshotO = companion4.O(snapshotNr);
                                                                                        try {
                                                                                            TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState11.qie();
                                                                                            TextLayoutResult value2 = textLayoutResultProxyQie != null ? textLayoutResultProxyQie.getValue() : null;
                                                                                            Triple tripleNr = TextFieldDelegate.INSTANCE.nr(legacyTextFieldState10.getTextDelegate(), j2, measureScope.getLayoutDirection(), value2);
                                                                                            int iIntValue = ((Number) tripleNr.component1()).intValue();
                                                                                            int iIntValue2 = ((Number) tripleNr.component2()).intValue();
                                                                                            TextLayoutResult textLayoutResult = (TextLayoutResult) tripleNr.component3();
                                                                                            if (!Intrinsics.areEqual(value2, textLayoutResult)) {
                                                                                                legacyTextFieldState10.s7N(new TextLayoutResultProxy(textLayoutResult, null, textLayoutResultProxyQie != null ? textLayoutResultProxyQie.getDecorationBoxCoordinates() : null, 2, null));
                                                                                                function18.invoke(textLayoutResult);
                                                                                                CoreTextFieldKt.ty(legacyTextFieldState10, textFieldValue7, offsetMapping7);
                                                                                            }
                                                                                            legacyTextFieldState10.wTp(density6.rV9(i58 == 1 ? TextDelegateKt.n(textLayoutResult.az(0)) : 0));
                                                                                            return measureScope.Zn(iIntValue, iIntValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.n(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.rl(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                                public final void n(Placeable.PlacementScope placementScope) {
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                                    n(placementScope);
                                                                                                    return Unit.INSTANCE;
                                                                                                }
                                                                                            });
                                                                                        } finally {
                                                                                            companion4.az(snapshotNr, snapshotO, readObserver);
                                                                                        }
                                                                                    }
                                                                                };
                                                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                                int iN = ComposablesKt.n(composer7, 0);
                                                                                CompositionLocalMap compositionLocalMapIk = composer7.Ik();
                                                                                Modifier modifierO = ComposedModifierKt.O(composer7, companion4);
                                                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                                Function0 function0N = companion5.n();
                                                                                if (composer7.getApplier() == null) {
                                                                                    ComposablesKt.t();
                                                                                }
                                                                                composer7.T();
                                                                                if (composer7.getInserting()) {
                                                                                    composer7.s7N(function0N);
                                                                                } else {
                                                                                    composer7.r();
                                                                                }
                                                                                Composer composerN = Updater.n(composer7);
                                                                                Updater.O(composerN, measurePolicy, companion5.t());
                                                                                Updater.O(composerN, compositionLocalMapIk, companion5.O());
                                                                                Function2 function2Rl = companion5.rl();
                                                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                                                    composerN.o(Integer.valueOf(iN));
                                                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                                                }
                                                                                Updater.O(composerN, modifierO, companion5.nr());
                                                                                composer7.XQ();
                                                                                TextFieldSelectionManager textFieldSelectionManager8 = textFieldSelectionManager7;
                                                                                if (legacyTextFieldState9.O() == HandleState.f19681n || legacyTextFieldState9.gh() == null) {
                                                                                    z38 = false;
                                                                                } else {
                                                                                    LayoutCoordinates layoutCoordinatesGh = legacyTextFieldState9.gh();
                                                                                    Intrinsics.checkNotNull(layoutCoordinatesGh);
                                                                                    if (!layoutCoordinatesGh.nr() || !z36) {
                                                                                    }
                                                                                }
                                                                                CoreTextFieldKt.nr(textFieldSelectionManager8, z38, composer7, 0);
                                                                                if (legacyTextFieldState9.O() == HandleState.f19680O && !z37 && z36) {
                                                                                    composer7.eF(-7167858);
                                                                                    CoreTextFieldKt.O(textFieldSelectionManager7, composer7, 0);
                                                                                    composer7.Xw();
                                                                                } else {
                                                                                    composer7.eF(-7090978);
                                                                                    composer7.Xw();
                                                                                }
                                                                                if (ComposerKt.v()) {
                                                                                    ComposerKt.M7();
                                                                                }
                                                                            }
                                                                        }, composer6, 54), composer6, 48, 0);
                                                                        if (ComposerKt.v()) {
                                                                            ComposerKt.M7();
                                                                        }
                                                                    }
                                                                }, composer5, 54), composer5, 6);
                                                                if (ComposerKt.v()) {
                                                                    ComposerKt.M7();
                                                                }
                                                            }
                                                        }, composer4, 54), composer4, RendererCapabilities.DECODER_SUPPORT_MASK);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                        visualTransformation3 = visualTransformation5;
                                                        composer2 = composer4;
                                                        i30 = i47;
                                                        function14 = function15;
                                                        z7 = z32;
                                                        textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                                        brush2 = brush3;
                                                        imeOptions2 = imeOptions6;
                                                        mutableInteractionSource3 = mutableInteractionSource6;
                                                        z5 = z26;
                                                        keyboardActions2 = keyboardActions3;
                                                        i31 = i44;
                                                        z6 = z31;
                                                        modifier3 = modifier5;
                                                        textStyle2 = textStyle4;
                                                        function32 = function33;
                                                    } else {
                                                        modifier6 = modifierN3;
                                                    }
                                                    objIF20 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                            final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                                public void n() {
                                                                    textFieldSelectionManager6.M();
                                                                }
                                                            };
                                                        }
                                                    };
                                                    composer3.o(objIF20);
                                                    EffectsKt.rl(textFieldSelectionManager, (Function1) objIF20, composer3, 0);
                                                    if (i51 > 32) {
                                                        zE27 = ((i51 > 32 && composer3.p5(imeOptions6)) || (i49 & 48) == 32) | composer3.E2(legacyTextFieldState6) | composer3.E2(textInputService3) | (i45 == 4);
                                                        objIF10 = composer3.iF();
                                                        if (zE27) {
                                                            objIF10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                    if (legacyTextFieldState6.J2()) {
                                                                        LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState6;
                                                                        legacyTextFieldState7.T(TextFieldDelegate.INSTANCE.xMQ(textInputService3, textFieldValue, legacyTextFieldState7.getProcessor(), imeOptions6, legacyTextFieldState6.getOnValueChange(), legacyTextFieldState6.getOnImeActionPerformed()));
                                                                    }
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void n() {
                                                                        }
                                                                    };
                                                                }
                                                            };
                                                            composer3.o(objIF10);
                                                            EffectsKt.rl(imeOptions6, (Function1) objIF10, composer3, (i49 >> 3) & 14);
                                                            Modifier modifierN42 = TextFieldKeyInputKt.n(companion2, legacyTextFieldState6, textFieldSelectionManager, textFieldValue, legacyTextFieldState6.getOnValueChange(), !z9, i47 != 1, offsetMapping4, undoManager, imeOptions6.getImeAction());
                                                            Modifier modifierT2 = companion2;
                                                            int keyboardType2 = imeOptions6.getKeyboardType();
                                                            KeyboardType.Companion companion32 = KeyboardType.INSTANCE;
                                                            if (KeyboardType.ty(keyboardType2, companion32.J2())) {
                                                                boolean zRl2 = rl(state);
                                                                legacyPlatformTextInputServiceAdapter2 = legacyPlatformTextInputServiceAdapter;
                                                                zN = composer3.n(z20) | composer3.E2(legacyPlatformTextInputServiceAdapter2);
                                                                objIF11 = composer3.iF();
                                                                if (!zN) {
                                                                    objIF11 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
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
                                                                            if (z20) {
                                                                                legacyPlatformTextInputServiceAdapter2.gh();
                                                                            }
                                                                        }
                                                                    };
                                                                    composer3.o(objIF11);
                                                                    Modifier modifierRl32 = StylusHandwritingKt.rl(modifierT2, zRl2, z20, (Function0) objIF11);
                                                                    value = ((Color) composer3.ty(AutofillHighlightKt.n())).getValue();
                                                                    zE28 = composer3.E2(legacyTextFieldState6) | composer3.nr(value);
                                                                    objIF12 = composer3.iF();
                                                                    if (!zE28) {
                                                                        objIF12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(1);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                                                                n(drawScope);
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            public final void n(DrawScope drawScope) {
                                                                                if (legacyTextFieldState6.t() || legacyTextFieldState6.xMQ()) {
                                                                                    DrawScope.h(drawScope, value, 0L, 0L, 0.0f, null, null, 0, 126, null);
                                                                                }
                                                                            }
                                                                        };
                                                                        composer3.o(objIF12);
                                                                        Modifier modifierN52 = OnGloballyPositionedModifierKt.n(TextFieldScrollKt.nr(HI(TextFieldFocusModifier_androidKt.rl(LegacyAdaptingPlatformTextInputModifierNodeKt.n(modifier5.Zmq(DrawModifierKt.rl(modifierT2, (Function1) objIF12)), legacyPlatformTextInputServiceAdapter2, legacyTextFieldState6, textFieldSelectionManager).Zmq(modifierRl32).Zmq(modifierN), legacyTextFieldState6, focusManager), legacyTextFieldState6, textFieldSelectionManager).Zmq(modifierN42), textFieldScrollerPosition5, mutableInteractionSource6, z31).Zmq(modifierRl).Zmq(coreTextFieldSemanticsModifier), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                                                            {
                                                                                super(1);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                                n(layoutCoordinates);
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            public final void n(LayoutCoordinates layoutCoordinates) {
                                                                                TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState6.qie();
                                                                                if (textLayoutResultProxyQie == null) {
                                                                                    return;
                                                                                }
                                                                                textLayoutResultProxyQie.KN(layoutCoordinates);
                                                                            }
                                                                        });
                                                                        if (z31) {
                                                                            if (z21) {
                                                                            }
                                                                            final BringIntoViewRequester bringIntoViewRequester32 = bringIntoViewRequester;
                                                                            Composer composer42 = composer3;
                                                                            final TextFieldSelectionManager textFieldSelectionManager52 = textFieldSelectionManager;
                                                                            final boolean z322 = z9;
                                                                            final Function3 function332 = function3N;
                                                                            final Modifier modifier72 = modifier6;
                                                                            final TextStyle textStyle62 = textStyle4;
                                                                            final Density density32 = density;
                                                                            final boolean z332 = z21;
                                                                            final Modifier modifier82 = modifierT2;
                                                                            t(modifierN52, textFieldSelectionManager52, ComposableLambdaKt.nr(-492537660, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                {
                                                                                    super(2);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                                    n(composer5, num.intValue());
                                                                                    return Unit.INSTANCE;
                                                                                }

                                                                                public final void n(Composer composer5, int i52) {
                                                                                    if (!composer5.HI((i52 & 3) != 2, i52 & 1)) {
                                                                                        composer5.wTp();
                                                                                        return;
                                                                                    }
                                                                                    if (ComposerKt.v()) {
                                                                                        ComposerKt.p5(-492537660, i52, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:555)");
                                                                                    }
                                                                                    Function3 function34 = function332;
                                                                                    final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState6;
                                                                                    final TextStyle textStyle7 = textStyle62;
                                                                                    final int i53 = i44;
                                                                                    final int i54 = i47;
                                                                                    final TextFieldScrollerPosition textFieldScrollerPosition6 = textFieldScrollerPosition5;
                                                                                    final TextFieldValue textFieldValue4 = textFieldValue;
                                                                                    final VisualTransformation visualTransformation6 = visualTransformation5;
                                                                                    final Modifier modifier9 = modifier72;
                                                                                    final Modifier modifier10 = modifierRl2;
                                                                                    final Modifier modifier11 = modifierN2;
                                                                                    final Modifier modifier12 = modifier82;
                                                                                    final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester32;
                                                                                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager52;
                                                                                    final boolean z34 = z332;
                                                                                    final boolean z35 = z322;
                                                                                    final Function1 function16 = function15;
                                                                                    final OffsetMapping offsetMapping5 = offsetMapping4;
                                                                                    final Density density4 = density32;
                                                                                    function34.invoke(ComposableLambdaKt.nr(-1835647873, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        {
                                                                                            super(2);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                                            n(composer6, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void n(Composer composer6, int i55) {
                                                                                            if (!composer6.HI((i55 & 3) != 2, i55 & 1)) {
                                                                                                composer6.wTp();
                                                                                                return;
                                                                                            }
                                                                                            if (ComposerKt.v()) {
                                                                                                ComposerKt.p5(-1835647873, i55, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:558)");
                                                                                            }
                                                                                            Modifier modifierN6 = HeightInLinesModifierKt.n(SizeKt.gh(Modifier.INSTANCE, legacyTextFieldState7.az(), 0.0f, 2, null), textStyle7, i53, i54);
                                                                                            TextFieldScrollerPosition textFieldScrollerPosition7 = textFieldScrollerPosition6;
                                                                                            TextFieldValue textFieldValue5 = textFieldValue4;
                                                                                            VisualTransformation visualTransformation7 = visualTransformation6;
                                                                                            boolean zE210 = composer6.E2(legacyTextFieldState7);
                                                                                            final LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState7;
                                                                                            Object objIF21 = composer6.iF();
                                                                                            if (zE210 || objIF21 == Composer.INSTANCE.n()) {
                                                                                                objIF21 = new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                                                                    {
                                                                                                        super(0);
                                                                                                    }

                                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                                                                    public final TextLayoutResultProxy invoke() {
                                                                                                        return legacyTextFieldState8.qie();
                                                                                                    }
                                                                                                };
                                                                                                composer6.o(objIF21);
                                                                                            }
                                                                                            Modifier modifierRl4 = BringIntoViewRequesterKt.rl(TextFieldSizeKt.n(TextFieldScroll_androidKt.n(modifierN6, textFieldScrollerPosition7, textFieldValue5, visualTransformation7, (Function0) objIF21).Zmq(modifier9).Zmq(modifier10), textStyle7).Zmq(modifier11).Zmq(modifier12), bringIntoViewRequester4);
                                                                                            final TextFieldSelectionManager textFieldSelectionManager7 = textFieldSelectionManager6;
                                                                                            final LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState7;
                                                                                            final boolean z36 = z34;
                                                                                            final boolean z37 = z35;
                                                                                            final Function1 function17 = function16;
                                                                                            final TextFieldValue textFieldValue6 = textFieldValue4;
                                                                                            final OffsetMapping offsetMapping6 = offsetMapping5;
                                                                                            final Density density5 = density4;
                                                                                            final int i56 = i54;
                                                                                            SimpleLayoutKt.n(modifierRl4, ComposableLambdaKt.nr(-1172467467, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                {
                                                                                                    super(2);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                                                                    n(composer7, num.intValue());
                                                                                                    return Unit.INSTANCE;
                                                                                                }

                                                                                                /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
                                                                                                /*
                                                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                                                */
                                                                                                public final void n(Composer composer7, int i57) {
                                                                                                    boolean z38 = true;
                                                                                                    if (!composer7.HI((i57 & 3) != 2, i57 & 1)) {
                                                                                                        composer7.wTp();
                                                                                                        return;
                                                                                                    }
                                                                                                    if (ComposerKt.v()) {
                                                                                                        ComposerKt.p5(-1172467467, i57, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:579)");
                                                                                                    }
                                                                                                    final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState9;
                                                                                                    final Function1 function18 = function17;
                                                                                                    final TextFieldValue textFieldValue7 = textFieldValue6;
                                                                                                    final OffsetMapping offsetMapping7 = offsetMapping6;
                                                                                                    final Density density6 = density5;
                                                                                                    final int i58 = i56;
                                                                                                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                                                        public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i59) {
                                                                                                            legacyTextFieldState10.getTextDelegate().az(intrinsicMeasureScope.getLayoutDirection());
                                                                                                            return legacyTextFieldState10.getTextDelegate().t();
                                                                                                        }

                                                                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                                                        public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                                                                                                            Snapshot.Companion companion4 = Snapshot.INSTANCE;
                                                                                                            LegacyTextFieldState legacyTextFieldState11 = legacyTextFieldState10;
                                                                                                            Snapshot snapshotNr = companion4.nr();
                                                                                                            Function1 readObserver = snapshotNr != null ? snapshotNr.getReadObserver() : null;
                                                                                                            Snapshot snapshotO = companion4.O(snapshotNr);
                                                                                                            try {
                                                                                                                TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState11.qie();
                                                                                                                TextLayoutResult value2 = textLayoutResultProxyQie != null ? textLayoutResultProxyQie.getValue() : null;
                                                                                                                Triple tripleNr = TextFieldDelegate.INSTANCE.nr(legacyTextFieldState10.getTextDelegate(), j2, measureScope.getLayoutDirection(), value2);
                                                                                                                int iIntValue = ((Number) tripleNr.component1()).intValue();
                                                                                                                int iIntValue2 = ((Number) tripleNr.component2()).intValue();
                                                                                                                TextLayoutResult textLayoutResult = (TextLayoutResult) tripleNr.component3();
                                                                                                                if (!Intrinsics.areEqual(value2, textLayoutResult)) {
                                                                                                                    legacyTextFieldState10.s7N(new TextLayoutResultProxy(textLayoutResult, null, textLayoutResultProxyQie != null ? textLayoutResultProxyQie.getDecorationBoxCoordinates() : null, 2, null));
                                                                                                                    function18.invoke(textLayoutResult);
                                                                                                                    CoreTextFieldKt.ty(legacyTextFieldState10, textFieldValue7, offsetMapping7);
                                                                                                                }
                                                                                                                legacyTextFieldState10.wTp(density6.rV9(i58 == 1 ? TextDelegateKt.n(textLayoutResult.az(0)) : 0));
                                                                                                                return measureScope.Zn(iIntValue, iIntValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.n(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.rl(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                                                    public final void n(Placeable.PlacementScope placementScope) {
                                                                                                                    }

                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                                                        n(placementScope);
                                                                                                                        return Unit.INSTANCE;
                                                                                                                    }
                                                                                                                });
                                                                                                            } finally {
                                                                                                                companion4.az(snapshotNr, snapshotO, readObserver);
                                                                                                            }
                                                                                                        }
                                                                                                    };
                                                                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                                                    int iN = ComposablesKt.n(composer7, 0);
                                                                                                    CompositionLocalMap compositionLocalMapIk = composer7.Ik();
                                                                                                    Modifier modifierO = ComposedModifierKt.O(composer7, companion4);
                                                                                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                                                    Function0 function0N = companion5.n();
                                                                                                    if (composer7.getApplier() == null) {
                                                                                                        ComposablesKt.t();
                                                                                                    }
                                                                                                    composer7.T();
                                                                                                    if (composer7.getInserting()) {
                                                                                                        composer7.s7N(function0N);
                                                                                                    } else {
                                                                                                        composer7.r();
                                                                                                    }
                                                                                                    Composer composerN = Updater.n(composer7);
                                                                                                    Updater.O(composerN, measurePolicy, companion5.t());
                                                                                                    Updater.O(composerN, compositionLocalMapIk, companion5.O());
                                                                                                    Function2 function2Rl = companion5.rl();
                                                                                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                                                                        composerN.o(Integer.valueOf(iN));
                                                                                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                                                                                    }
                                                                                                    Updater.O(composerN, modifierO, companion5.nr());
                                                                                                    composer7.XQ();
                                                                                                    TextFieldSelectionManager textFieldSelectionManager8 = textFieldSelectionManager7;
                                                                                                    if (legacyTextFieldState9.O() == HandleState.f19681n || legacyTextFieldState9.gh() == null) {
                                                                                                        z38 = false;
                                                                                                    } else {
                                                                                                        LayoutCoordinates layoutCoordinatesGh = legacyTextFieldState9.gh();
                                                                                                        Intrinsics.checkNotNull(layoutCoordinatesGh);
                                                                                                        if (!layoutCoordinatesGh.nr() || !z36) {
                                                                                                        }
                                                                                                    }
                                                                                                    CoreTextFieldKt.nr(textFieldSelectionManager8, z38, composer7, 0);
                                                                                                    if (legacyTextFieldState9.O() == HandleState.f19680O && !z37 && z36) {
                                                                                                        composer7.eF(-7167858);
                                                                                                        CoreTextFieldKt.O(textFieldSelectionManager7, composer7, 0);
                                                                                                        composer7.Xw();
                                                                                                    } else {
                                                                                                        composer7.eF(-7090978);
                                                                                                        composer7.Xw();
                                                                                                    }
                                                                                                    if (ComposerKt.v()) {
                                                                                                        ComposerKt.M7();
                                                                                                    }
                                                                                                }
                                                                                            }, composer6, 54), composer6, 48, 0);
                                                                                            if (ComposerKt.v()) {
                                                                                                ComposerKt.M7();
                                                                                            }
                                                                                        }
                                                                                    }, composer5, 54), composer5, 6);
                                                                                    if (ComposerKt.v()) {
                                                                                        ComposerKt.M7();
                                                                                    }
                                                                                }
                                                                            }, composer42, 54), composer42, RendererCapabilities.DECODER_SUPPORT_MASK);
                                                                            if (ComposerKt.v()) {
                                                                            }
                                                                            visualTransformation3 = visualTransformation5;
                                                                            composer2 = composer42;
                                                                            i30 = i47;
                                                                            function14 = function15;
                                                                            z7 = z322;
                                                                            textFieldScrollerPosition2 = textFieldScrollerPosition3;
                                                                            brush2 = brush3;
                                                                            imeOptions2 = imeOptions6;
                                                                            mutableInteractionSource3 = mutableInteractionSource6;
                                                                            z5 = z26;
                                                                            keyboardActions2 = keyboardActions3;
                                                                            i31 = i44;
                                                                            z6 = z31;
                                                                            modifier3 = modifier5;
                                                                            textStyle2 = textStyle4;
                                                                            function32 = function332;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        zE27 = ((i51 > 32 && composer3.p5(imeOptions6)) || (i49 & 48) == 32) | composer3.E2(legacyTextFieldState6) | composer3.E2(textInputService3) | (i45 == 4);
                                                        objIF10 = composer3.iF();
                                                        if (zE27) {
                                                        }
                                                    }
                                                } else {
                                                    textInputService2 = textInputService;
                                                }
                                                z15 = true;
                                                z16 = zP53 | z15;
                                                objIF5 = composer3.iF();
                                                if (z16) {
                                                    objIF5 = new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, stateCk, textInputService2, textFieldSelectionManager, imeOptions4, null);
                                                    state = stateCk;
                                                    textInputService3 = textInputService2;
                                                    composer3.o(objIF5);
                                                    final ImeOptions imeOptions62 = imeOptions4;
                                                    EffectsKt.O(unit, (Function2) objIF5, composer3, 6);
                                                    zE22 = composer3.E2(legacyTextFieldState);
                                                    objIF6 = composer3.iF();
                                                    if (!zE22) {
                                                        objIF6 = new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                                invoke(bool.booleanValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(boolean z302) {
                                                                legacyTextFieldState.X(z302);
                                                            }
                                                        };
                                                        composer3.o(objIF6);
                                                        Modifier modifierR2 = SelectionGesturesKt.r(companion2, (Function1) objIF6);
                                                        zE23 = (i50 != 16384) | composer3.E2(legacyTextFieldState) | (i48 != 2048) | composer3.E2(offsetMapping2) | composer3.E2(textFieldSelectionManager);
                                                        objIF7 = composer3.iF();
                                                        if (zE23) {
                                                            final LegacyTextFieldState legacyTextFieldState42 = legacyTextFieldState;
                                                            final TextFieldSelectionManager textFieldSelectionManager32 = textFieldSelectionManager;
                                                            final boolean z302 = z9;
                                                            objIF7 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
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
                                                                    CoreTextFieldKt.Ik(legacyTextFieldState42, focusRequester2, !z302);
                                                                    if (legacyTextFieldState42.J2() && z29) {
                                                                        if (legacyTextFieldState42.O() == HandleState.f19683t) {
                                                                            textFieldSelectionManager32.S(Offset.nr(j2));
                                                                            return;
                                                                        }
                                                                        TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState42.qie();
                                                                        if (textLayoutResultProxyQie != null) {
                                                                            LegacyTextFieldState legacyTextFieldState52 = legacyTextFieldState42;
                                                                            TextFieldDelegate.INSTANCE.mUb(j2, textLayoutResultProxyQie, legacyTextFieldState52.getProcessor(), offsetMapping2, legacyTextFieldState52.getOnValueChange());
                                                                            if (legacyTextFieldState52.getTextDelegate().getText().length() > 0) {
                                                                                legacyTextFieldState52.E2(HandleState.f19680O);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            };
                                                            legacyTextFieldState2 = legacyTextFieldState42;
                                                            focusRequester = focusRequester2;
                                                            z17 = z29;
                                                            offsetMapping = offsetMapping2;
                                                            composer3.o(objIF7);
                                                            z18 = z17;
                                                            FocusRequester focusRequester32 = focusRequester;
                                                            Modifier modifierRl4 = PointerIconKt.rl(SelectionGesturesKt.az(TextFieldPressGestureFilterKt.n(modifierR2, mutableInteractionSource6, z17, (Function1) objIF7), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.rl(), false, 2, null);
                                                            zE24 = composer3.E2(legacyTextFieldState2) | (i45 != 4) | composer3.E2(offsetMapping);
                                                            objIF8 = composer3.iF();
                                                            if (!zE24) {
                                                                objIF8 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) throws Throwable {
                                                                        n(drawScope);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void n(DrawScope drawScope) throws Throwable {
                                                                        TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState2.qie();
                                                                        if (textLayoutResultProxyQie != null) {
                                                                            TextFieldValue textFieldValue32 = textFieldValue2;
                                                                            LegacyTextFieldState legacyTextFieldState52 = legacyTextFieldState2;
                                                                            OffsetMapping offsetMapping32 = offsetMapping;
                                                                            TextFieldDelegate.INSTANCE.rl(drawScope.getDrawContext().KN(), textFieldValue32, legacyTextFieldState52.o(), legacyTextFieldState52.nr(), offsetMapping32, textLayoutResultProxyQie.getValue(), legacyTextFieldState52.getHighlightPaint(), legacyTextFieldState52.getSelectionBackgroundColor());
                                                                        }
                                                                    }
                                                                };
                                                                composer3.o(objIF8);
                                                                final Modifier modifierRl22 = DrawModifierKt.rl(companion2, (Function1) objIF8);
                                                                zE25 = (i48 != 2048) | composer3.E2(legacyTextFieldState2) | composer3.p5(windowInfo) | composer3.E2(textFieldSelectionManager) | (i45 != 4) | composer3.E2(offsetMapping);
                                                                objIF9 = composer3.iF();
                                                                if (zE25) {
                                                                    final TextFieldValue textFieldValue32 = textFieldValue2;
                                                                    final OffsetMapping offsetMapping32 = offsetMapping;
                                                                    final LegacyTextFieldState legacyTextFieldState52 = legacyTextFieldState2;
                                                                    final TextFieldSelectionManager textFieldSelectionManager42 = textFieldSelectionManager;
                                                                    objIF9 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                            n(layoutCoordinates);
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void n(LayoutCoordinates layoutCoordinates) {
                                                                            legacyTextFieldState52.nHg(layoutCoordinates);
                                                                            TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState52.qie();
                                                                            if (textLayoutResultProxyQie != null) {
                                                                                textLayoutResultProxyQie.xMQ(layoutCoordinates);
                                                                            }
                                                                            if (z18) {
                                                                                if (legacyTextFieldState52.O() == HandleState.f19683t) {
                                                                                    if (legacyTextFieldState52.XQ() && windowInfo.n()) {
                                                                                        textFieldSelectionManager42.G7();
                                                                                    } else {
                                                                                        textFieldSelectionManager42.M();
                                                                                    }
                                                                                    legacyTextFieldState52.jB(TextFieldSelectionManagerKt.t(textFieldSelectionManager42, true));
                                                                                    legacyTextFieldState52.Xw(TextFieldSelectionManagerKt.t(textFieldSelectionManager42, false));
                                                                                    legacyTextFieldState52.rV9(TextRange.KN(textFieldValue32.getSelection()));
                                                                                } else if (legacyTextFieldState52.O() == HandleState.f19680O) {
                                                                                    legacyTextFieldState52.rV9(TextFieldSelectionManagerKt.t(textFieldSelectionManager42, true));
                                                                                }
                                                                                CoreTextFieldKt.ty(legacyTextFieldState52, textFieldValue32, offsetMapping32);
                                                                                TextLayoutResultProxy textLayoutResultProxyQie2 = legacyTextFieldState52.qie();
                                                                                if (textLayoutResultProxyQie2 != null) {
                                                                                    LegacyTextFieldState legacyTextFieldState62 = legacyTextFieldState52;
                                                                                    TextFieldValue textFieldValue4 = textFieldValue32;
                                                                                    OffsetMapping offsetMapping42 = offsetMapping32;
                                                                                    TextInputSession inputSession = legacyTextFieldState62.getInputSession();
                                                                                    if (inputSession == null || !legacyTextFieldState62.J2()) {
                                                                                        return;
                                                                                    }
                                                                                    TextFieldDelegate.INSTANCE.gh(inputSession, textFieldValue4, offsetMapping42, textLayoutResultProxyQie2);
                                                                                }
                                                                            }
                                                                        }
                                                                    };
                                                                    z19 = z18;
                                                                    composer3.o(objIF9);
                                                                    final Modifier modifierN22 = OnGloballyPositionedModifierKt.n(companion2, (Function1) objIF9);
                                                                    final OffsetMapping offsetMapping42 = offsetMapping;
                                                                    boolean z312 = z19;
                                                                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState2, z9, z312, visualTransformation5 instanceof PasswordVisualTransformation, offsetMapping42, textFieldSelectionManager, imeOptions62, focusRequester32);
                                                                    if (z312) {
                                                                        final LegacyTextFieldState legacyTextFieldState62 = legacyTextFieldState2;
                                                                        Modifier modifierN32 = TextFieldCursorKt.n(companion2, legacyTextFieldState62, textFieldValue, offsetMapping42, brush3, (z312 || z9 || !windowInfo.n() || legacyTextFieldState2.nY()) ? false : true);
                                                                        zE26 = composer3.E2(textFieldSelectionManager);
                                                                        Object objIF202 = composer3.iF();
                                                                        if (zE26) {
                                                                        }
                                                                        objIF202 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                                                            {
                                                                                super(1);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                                                    public void n() {
                                                                                        textFieldSelectionManager6.M();
                                                                                    }
                                                                                };
                                                                            }
                                                                        };
                                                                        composer3.o(objIF202);
                                                                        EffectsKt.rl(textFieldSelectionManager, (Function1) objIF202, composer3, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                undoManager = undoManager2;
                                            }
                                            z14 = true;
                                            zE2 = zE29 | z14 | composer3.E2(offsetMapping2) | composer3.E2(vdVar) | composer3.E2(bringIntoViewRequester2) | composer3.E2(textFieldSelectionManager2);
                                            objIF4 = composer3.iF();
                                            if (zE2) {
                                                final boolean z272 = z13;
                                                final ImeOptions imeOptions52 = imeOptions3;
                                                final boolean z282 = z9;
                                                objIF4 = new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                                        n(focusState);
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(FocusState focusState) {
                                                        TextLayoutResultProxy textLayoutResultProxyQie;
                                                        if (legacyTextFieldState3.J2() == focusState.n()) {
                                                            return;
                                                        }
                                                        legacyTextFieldState3.e(focusState.n());
                                                        if (legacyTextFieldState3.J2() && z272 && !z282) {
                                                            CoreTextFieldKt.ck(textInputService4, legacyTextFieldState3, textFieldValue, imeOptions52, offsetMapping2);
                                                        } else {
                                                            CoreTextFieldKt.az(legacyTextFieldState3);
                                                        }
                                                        if (focusState.n() && (textLayoutResultProxyQie = legacyTextFieldState3.qie()) != null) {
                                                            GJW.C.nr(vdVar, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester2, textFieldValue, legacyTextFieldState3, textLayoutResultProxyQie, offsetMapping2, null), 3, null);
                                                        }
                                                        if (focusState.n()) {
                                                            return;
                                                        }
                                                        TextFieldSelectionManager.WPU(textFieldSelectionManager2, null, 1, null);
                                                    }
                                                };
                                                legacyTextFieldState = legacyTextFieldState3;
                                                textInputService = textInputService4;
                                                textFieldValue2 = textFieldValue;
                                                imeOptions4 = imeOptions52;
                                                textFieldSelectionManager = textFieldSelectionManager2;
                                                bringIntoViewRequester = bringIntoViewRequester2;
                                                composer3.o(objIF4);
                                                final VisualTransformation visualTransformation52 = visualTransformation4;
                                                MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource5;
                                                Modifier modifierN6 = TextFieldGestureModifiersKt.n(companion2, z13, focusRequester2, mutableInteractionSource62, (Function1) objIF4);
                                                if (z13) {
                                                    final boolean z292 = z13;
                                                    State stateCk2 = SnapshotStateKt.ck(Boolean.valueOf((z13 || z9) ? false : true), composer3, 0);
                                                    Unit unit2 = Unit.INSTANCE;
                                                    boolean zP532 = composer3.p5(stateCk2) | composer3.E2(legacyTextFieldState) | composer3.E2(textInputService) | composer3.E2(textFieldSelectionManager);
                                                    if (i51 > 32) {
                                                        textInputService2 = textInputService;
                                                        if ((i49 & 48) != 32) {
                                                            z15 = true;
                                                        }
                                                        z16 = zP532 | z15;
                                                        objIF5 = composer3.iF();
                                                        if (z16) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            z13 = z10;
                                        }
                                        orientation = Orientation.f16969n;
                                        Orientation orientation32 = orientation;
                                        if (textFieldScrollerPosition3 == null) {
                                        }
                                        if (textFieldScrollerPosition4.J2() != orientation2) {
                                        }
                                    } else {
                                        int i52 = i39;
                                        visualTransformation4 = visualTransformationT;
                                        modifier4 = modifier2;
                                        imeOptions3 = imeOptionsN;
                                        z10 = z23;
                                        function15 = function13;
                                        i32 = i52;
                                        int i53 = i38;
                                        z11 = z22;
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        i33 = i53;
                                        i34 = i27;
                                    }
                                } else {
                                    composerKN.wTp();
                                    if ((i8 & 2048) != 0) {
                                        i27 &= -113;
                                    }
                                    Brush brush4 = brush2;
                                    visualTransformation4 = visualTransformation2;
                                    solidColor = brush4;
                                    keyboardActionsN = keyboardActions;
                                    z10 = z3;
                                    z9 = z4;
                                    function3N = function3;
                                    composer3 = composerKN;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    function15 = function13;
                                    modifier4 = modifier2;
                                    i34 = i27;
                                    z11 = z2;
                                    i33 = i2;
                                    i32 = i3;
                                    imeOptions3 = imeOptions;
                                }
                                textFieldScrollerPosition3 = textFieldScrollerPosition;
                                composer3.S();
                                if (ComposerKt.v()) {
                                }
                                objIF = composer3.iF();
                                companion = Composer.INSTANCE;
                                if (objIF == companion.n()) {
                                }
                                final FocusRequester focusRequester22 = (FocusRequester) objIF;
                                objIF2 = composer3.iF();
                                int i432 = i9;
                                if (objIF2 == companion.n()) {
                                }
                                LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter32 = (LegacyPlatformTextInputServiceAdapter) objIF2;
                                objIF3 = composer3.iF();
                                Brush brush32 = solidColor;
                                if (objIF3 == companion.n()) {
                                }
                                final TextInputService textInputService42 = (TextInputService) objIF3;
                                Density density22 = (Density) composer3.ty(CompositionLocalsKt.J2());
                                FontFamily.Resolver resolver22 = (FontFamily.Resolver) composer3.ty(CompositionLocalsKt.KN());
                                long selectionBackgroundColor2 = ((SelectionColors) composer3.ty(TextSelectionColorsKt.rl())).getSelectionBackgroundColor();
                                FocusManager focusManager22 = (FocusManager) composer3.ty(CompositionLocalsKt.Uo());
                                final WindowInfo windowInfo2 = (WindowInfo) composer3.ty(CompositionLocalsKt.S());
                                SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composer3.ty(CompositionLocalsKt.Ik());
                                final int i442 = i32;
                                if (i33 != 1) {
                                }
                                orientation = Orientation.f16969n;
                                Orientation orientation322 = orientation;
                                if (textFieldScrollerPosition3 == null) {
                                }
                                if (textFieldScrollerPosition4.J2() != orientation2) {
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        n(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer5, int i54) {
                                        CoreTextFieldKt.n(textFieldValue, function1, modifier3, textStyle2, visualTransformation3, function14, mutableInteractionSource3, brush2, z5, i30, i31, imeOptions2, keyboardActions2, z6, z7, function32, textFieldScrollerPosition2, composer5, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i18 = i17;
                        i19 = i8 & 1024;
                        if (i19 == 0) {
                        }
                        if ((i7 & 48) == 0) {
                        }
                        int i352 = i21;
                        i22 = i8 & 4096;
                        if (i22 == 0) {
                        }
                        i24 = i8 & 8192;
                        if (i24 == 0) {
                        }
                        i26 = i8 & 16384;
                        if (i26 == 0) {
                        }
                        i28 = i8 & 32768;
                        if (i28 == 0) {
                        }
                        i29 = i8 & 65536;
                        if (i29 == 0) {
                        }
                        if (composerKN.HI((i9 & 306783379) == 306783378 || (i27 & 599187) != 599186, i9 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    visualTransformation2 = visualTransformation;
                    i13 = i8 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i8 & 64;
                    if (i14 != 0) {
                    }
                    i15 = i8 & 128;
                    if (i15 != 0) {
                    }
                    i16 = i8 & 256;
                    if (i16 != 0) {
                    }
                    i17 = i8 & 512;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    i19 = i8 & 1024;
                    if (i19 == 0) {
                    }
                    if ((i7 & 48) == 0) {
                    }
                    int i3522 = i21;
                    i22 = i8 & 4096;
                    if (i22 == 0) {
                    }
                    i24 = i8 & 8192;
                    if (i24 == 0) {
                    }
                    i26 = i8 & 16384;
                    if (i26 == 0) {
                    }
                    i28 = i8 & 32768;
                    if (i28 == 0) {
                    }
                    i29 = i8 & 65536;
                    if (i29 == 0) {
                    }
                    if (composerKN.HI((i9 & 306783379) == 306783378 || (i27 & 599187) != 599186, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                textStyleN = textStyle;
                i12 = i8 & 16;
                if (i12 == 0) {
                }
                visualTransformation2 = visualTransformation;
                i13 = i8 & 32;
                if (i13 != 0) {
                }
                i14 = i8 & 64;
                if (i14 != 0) {
                }
                i15 = i8 & 128;
                if (i15 != 0) {
                }
                i16 = i8 & 256;
                if (i16 != 0) {
                }
                i17 = i8 & 512;
                if (i17 == 0) {
                }
                i18 = i17;
                i19 = i8 & 1024;
                if (i19 == 0) {
                }
                if ((i7 & 48) == 0) {
                }
                int i35222 = i21;
                i22 = i8 & 4096;
                if (i22 == 0) {
                }
                i24 = i8 & 8192;
                if (i24 == 0) {
                }
                i26 = i8 & 16384;
                if (i26 == 0) {
                }
                i28 = i8 & 32768;
                if (i28 == 0) {
                }
                i29 = i8 & 65536;
                if (i29 == 0) {
                }
                if (composerKN.HI((i9 & 306783379) == 306783378 || (i27 & 599187) != 599186, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i11 = i8 & 8;
            if (i11 != 0) {
            }
            textStyleN = textStyle;
            i12 = i8 & 16;
            if (i12 == 0) {
            }
            visualTransformation2 = visualTransformation;
            i13 = i8 & 32;
            if (i13 != 0) {
            }
            i14 = i8 & 64;
            if (i14 != 0) {
            }
            i15 = i8 & 128;
            if (i15 != 0) {
            }
            i16 = i8 & 256;
            if (i16 != 0) {
            }
            i17 = i8 & 512;
            if (i17 == 0) {
            }
            i18 = i17;
            i19 = i8 & 1024;
            if (i19 == 0) {
            }
            if ((i7 & 48) == 0) {
            }
            int i352222 = i21;
            i22 = i8 & 4096;
            if (i22 == 0) {
            }
            i24 = i8 & 8192;
            if (i24 == 0) {
            }
            i26 = i8 & 16384;
            if (i26 == 0) {
            }
            i28 = i8 & 32768;
            if (i28 == 0) {
            }
            i29 = i8 & 65536;
            if (i29 == 0) {
            }
            if (composerKN.HI((i9 & 306783379) == 306783378 || (i27 & 599187) != 599186, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        modifier2 = modifier;
        i11 = i8 & 8;
        if (i11 != 0) {
        }
        textStyleN = textStyle;
        i12 = i8 & 16;
        if (i12 == 0) {
        }
        visualTransformation2 = visualTransformation;
        i13 = i8 & 32;
        if (i13 != 0) {
        }
        i14 = i8 & 64;
        if (i14 != 0) {
        }
        i15 = i8 & 128;
        if (i15 != 0) {
        }
        i16 = i8 & 256;
        if (i16 != 0) {
        }
        i17 = i8 & 512;
        if (i17 == 0) {
        }
        i18 = i17;
        i19 = i8 & 1024;
        if (i19 == 0) {
        }
        if ((i7 & 48) == 0) {
        }
        int i3522222 = i21;
        i22 = i8 & 4096;
        if (i22 == 0) {
        }
        i24 = i8 & 8192;
        if (i24 == 0) {
        }
        i26 = i8 & 16384;
        if (i26 == 0) {
        }
        i28 = i8 & 32768;
        if (i28 == 0) {
        }
        i29 = i8 & 65536;
        if (i29 == 0) {
        }
        if (composerKN.HI((i9 & 306783379) == 306783378 || (i27 & 599187) != 599186, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final TextFieldSelectionManager textFieldSelectionManager, final boolean z2, Composer composer, final int i2) {
        int i3;
        TextLayoutResultProxy textLayoutResultProxyQie;
        TextLayoutResult value;
        Composer composerKN = composer.KN(626339208);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(textFieldSelectionManager) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if (composerKN.HI((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(626339208, i3, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1018)");
            }
            if (z2) {
                composerKN.eF(-1290924834);
                LegacyTextFieldState state = textFieldSelectionManager.getState();
                TextLayoutResult textLayoutResult = null;
                if (state != null && (textLayoutResultProxyQie = state.qie()) != null && (value = textLayoutResultProxyQie.getValue()) != null) {
                    LegacyTextFieldState state2 = textFieldSelectionManager.getState();
                    if (!(state2 != null ? state2.getIsLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    composerKN.eF(-1290601288);
                } else {
                    composerKN.eF(-1290601287);
                    if (TextRange.KN(textFieldSelectionManager.p5().getSelection())) {
                        composerKN.eF(-1684179174);
                        composerKN.Xw();
                    } else {
                        composerKN.eF(-1685230508);
                        int iRl = textFieldSelectionManager.getOffsetMapping().rl(TextRange.ty(textFieldSelectionManager.p5().getSelection()));
                        int iRl2 = textFieldSelectionManager.getOffsetMapping().rl(TextRange.xMQ(textFieldSelectionManager.p5().getSelection()));
                        ResolvedTextDirection resolvedTextDirectionT = textLayoutResult.t(iRl);
                        ResolvedTextDirection resolvedTextDirectionT2 = textLayoutResult.t(Math.max(iRl2 - 1, 0));
                        LegacyTextFieldState state3 = textFieldSelectionManager.getState();
                        if (state3 == null || !state3.WPU()) {
                            composerKN.eF(-1684548198);
                            composerKN.Xw();
                        } else {
                            composerKN.eF(-1684812473);
                            TextFieldSelectionManagerKt.n(true, resolvedTextDirectionT, textFieldSelectionManager, composerKN, ((i3 << 6) & 896) | 6);
                            composerKN.Xw();
                        }
                        LegacyTextFieldState state4 = textFieldSelectionManager.getState();
                        if (state4 == null || !state4.S()) {
                            composerKN.eF(-1684200998);
                            composerKN.Xw();
                        } else {
                            composerKN.eF(-1684464312);
                            TextFieldSelectionManagerKt.n(false, resolvedTextDirectionT2, textFieldSelectionManager, composerKN, ((i3 << 6) & 896) | 6);
                            composerKN.Xw();
                        }
                        composerKN.Xw();
                    }
                    LegacyTextFieldState state5 = textFieldSelectionManager.getState();
                    if (state5 != null) {
                        if (textFieldSelectionManager.FX()) {
                            state5.bzg(false);
                        }
                        if (state5.J2()) {
                            if (state5.XQ()) {
                                textFieldSelectionManager.G7();
                            } else {
                                textFieldSelectionManager.M();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                composerKN.Xw();
                composerKN.Xw();
            } else {
                composerKN.eF(651160447);
                composerKN.Xw();
                textFieldSelectionManager.M();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    CoreTextFieldKt.nr(textFieldSelectionManager, z2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2 function2, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-20551815);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function2) ? 256 : 128;
        }
        if (composerKN.HI((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-20551815, i3, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:668)");
            }
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            ContextMenu_androidKt.t(textFieldSelectionManager, function2, composerKN, (i3 >> 3) & 126);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    CoreTextFieldKt.t(modifier, textFieldSelectionManager, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    private static final Modifier HI(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.rl(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return n(keyEvent.getNativeKeyEvent());
            }

            public final Boolean n(android.view.KeyEvent keyEvent) {
                boolean z2;
                if (legacyTextFieldState.O() == HandleState.f19683t && KeyEventHelpers_androidKt.n(keyEvent)) {
                    z2 = true;
                    TextFieldSelectionManager.WPU(textFieldSelectionManager, null, 1, null);
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        legacyTextFieldState.T(TextFieldDelegate.INSTANCE.KN(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        ty(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 readObserver = snapshotNr != null ? snapshotNr.getReadObserver() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            TextLayoutResultProxy textLayoutResultProxyQie = legacyTextFieldState.qie();
            if (textLayoutResultProxyQie == null) {
                return;
            }
            TextInputSession inputSession = legacyTextFieldState.getInputSession();
            if (inputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinatesGh = legacyTextFieldState.gh();
            if (layoutCoordinatesGh == null) {
                return;
            }
            TextFieldDelegate.INSTANCE.O(textFieldValue, legacyTextFieldState.getTextDelegate(), textLayoutResultProxyQie.getValue(), layoutCoordinatesGh, inputSession, legacyTextFieldState.J2(), offsetMapping);
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.az(snapshotNr, snapshotO, readObserver);
        }
    }

    public static final void Ik(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z2) {
        SoftwareKeyboardController keyboardController;
        if (!legacyTextFieldState.J2()) {
            FocusRequester.KN(focusRequester, 0, 1, null);
        } else if (z2 && (keyboardController = legacyTextFieldState.getKeyboardController()) != null) {
            keyboardController.show();
        }
    }

    public static final void O(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i2) {
        int i3;
        boolean z2;
        AnnotatedString annotatedStringP5;
        int i5;
        Composer composerKN = composer.KN(-1436003720);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(textFieldSelectionManager)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1436003720, i3, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1065)");
            }
            LegacyTextFieldState state = textFieldSelectionManager.getState();
            if (state != null && state.Z() && (annotatedStringP5 = textFieldSelectionManager.P5()) != null && annotatedStringP5.length() > 0) {
                composerKN.eF(-289940723);
                boolean zP5 = composerKN.p5(textFieldSelectionManager);
                Object objIF = composerKN.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = textFieldSelectionManager.Z();
                    composerKN.o(objIF);
                }
                final TextDragObserver textDragObserver = (TextDragObserver) objIF;
                final long jE2 = textFieldSelectionManager.E2((Density) composerKN.ty(CompositionLocalsKt.J2()));
                boolean zNr = composerKN.nr(jE2);
                Object objIF2 = composerKN.iF();
                if (zNr || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        public final long n() {
                            return jE2;
                        }
                    };
                    composerKN.o(objIF2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) objIF2;
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zE2 = composerKN.E2(textDragObserver) | composerKN.E2(textFieldSelectionManager);
                Object objIF3 = composerKN.iF();
                if (zE2 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1

                        /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                        @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                            final /* synthetic */ TextDragObserver J2;

                            /* JADX INFO: renamed from: O, reason: collision with root package name */
                            final /* synthetic */ PointerInputScope f19657O;

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            int f19658n;

                            /* JADX INFO: renamed from: r, reason: collision with root package name */
                            final /* synthetic */ TextFieldSelectionManager f19659r;

                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                            private /* synthetic */ Object f19660t;

                            /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                            @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", i = {}, l = {1078}, m = "invokeSuspend", n = {}, s = {})
                            static final class C05101 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                /* JADX INFO: renamed from: O, reason: collision with root package name */
                                final /* synthetic */ TextDragObserver f19661O;

                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                int f19662n;

                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                final /* synthetic */ PointerInputScope f19663t;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C05101(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation continuation) {
                                    super(2, continuation);
                                    this.f19663t = pointerInputScope;
                                    this.f19661O = textDragObserver;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    return new C05101(this.f19663t, this.f19661O, continuation);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(vd vdVar, Continuation continuation) {
                                    return ((C05101) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                    return invoke2(vdVar, (Continuation) continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.f19662n;
                                    if (i2 != 0) {
                                        if (i2 == 1) {
                                            ResultKt.throwOnFailure(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        PointerInputScope pointerInputScope = this.f19663t;
                                        TextDragObserver textDragObserver = this.f19661O;
                                        this.f19662n = 1;
                                        if (LongPressTextDragObserverKt.t(pointerInputScope, textDragObserver, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                            @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", i = {}, l = {1081}, m = "invokeSuspend", n = {}, s = {})
                            static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                /* JADX INFO: renamed from: O, reason: collision with root package name */
                                final /* synthetic */ TextFieldSelectionManager f19664O;

                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                int f19665n;

                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                final /* synthetic */ PointerInputScope f19666t;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
                                    super(2, continuation);
                                    this.f19666t = pointerInputScope;
                                    this.f19664O = textFieldSelectionManager;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    return new AnonymousClass2(this.f19666t, this.f19664O, continuation);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(vd vdVar, Continuation continuation) {
                                    return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                    return invoke2(vdVar, (Continuation) continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.f19665n;
                                    if (i2 != 0) {
                                        if (i2 == 1) {
                                            ResultKt.throwOnFailure(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        PointerInputScope pointerInputScope = this.f19666t;
                                        final TextFieldSelectionManager textFieldSelectionManager = this.f19664O;
                                        Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.2.1.1.2.1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                n(offset.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(long j2) {
                                                textFieldSelectionManager.G7();
                                            }
                                        };
                                        this.f19665n = 1;
                                        if (TapGestureDetectorKt.az(pointerInputScope, null, null, null, function1, this, 7, null) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
                                super(2, continuation);
                                this.f19657O = pointerInputScope;
                                this.J2 = textDragObserver;
                                this.f19659r = textFieldSelectionManager;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f19657O, this.J2, this.f19659r, continuation);
                                anonymousClass1.f19660t = obj;
                                return anonymousClass1;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(vd vdVar, Continuation continuation) {
                                return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                return invoke2(vdVar, (Continuation) continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.f19658n == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    vd vdVar = (vd) this.f19660t;
                                    h hVar = h.J2;
                                    GJW.C.nr(vdVar, null, hVar, new C05101(this.f19657O, this.J2, null), 1, null);
                                    GJW.C.nr(vdVar, null, hVar, new AnonymousClass2(this.f19657O, this.f19659r, null), 1, null);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            Object objJ2 = Lu.J2(new AnonymousClass1(pointerInputScope, textDragObserver, textFieldSelectionManager, null), continuation);
                            return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
                        }
                    };
                    composerKN.o(objIF3);
                }
                Modifier modifierNr = SuspendingPointerInputFilterKt.nr(companion, textDragObserver, (PointerInputEventHandler) objIF3);
                boolean zNr2 = composerKN.nr(jE2);
                Object objIF4 = composerKN.iF();
                if (zNr2 || objIF4 == Composer.INSTANCE.n()) {
                    objIF4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            semanticsPropertyReceiver.t(SelectionHandlesKt.nr(), new SelectionHandleInfo(Handle.f19677n, jE2, SelectionHandleAnchor.f20865t, true, null));
                        }
                    };
                    composerKN.o(objIF4);
                }
                AndroidCursorHandle_androidKt.n(offsetProvider, SemanticsModifierKt.nr(modifierNr, false, (Function1) objIF4, 1, null), 0L, composerKN, 0, 4);
                composerKN.Xw();
            } else {
                composerKN.eF(-288632802);
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i7) {
                    CoreTextFieldKt.O(textFieldSelectionManager, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.J2(inputSession, legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange());
        }
        legacyTextFieldState.T(null);
    }

    public static final Object qie(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation continuation) {
        Rect rect;
        int iRl = offsetMapping.rl(TextRange.gh(textFieldValue.getSelection()));
        if (iRl < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.nr(iRl);
        } else if (iRl != 0) {
            rect = textLayoutResult.nr(iRl - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegateKt.rl(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
        }
        Object objN = bringIntoViewRequester.n(rect, continuation);
        if (objN == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objN;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rl(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
