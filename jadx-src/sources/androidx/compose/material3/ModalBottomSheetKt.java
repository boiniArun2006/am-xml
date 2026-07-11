package androidx.compose.material3;

import GJW.vd;
import GJW.xuv;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÄ\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00120\u0000¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aó\u0001\u0010(\u001a\u00020\u0001*\u00020\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00120\u0000¢\u0006\u0002\b\u00102\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0018H\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010,\u001a\u00020\u001e*\u00020*2\u0006\u0010+\u001a\u00020\u001eH\u0002¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010.\u001a\u00020\u001e*\u00020*2\u0006\u0010+\u001a\u00020\u001eH\u0002¢\u0006\u0004\b.\u0010-\u001a/\u00103\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020/2\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020/0\u0016H\u0007¢\u0006\u0004\b3\u00104\u001a0\u00107\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u00106\u001a\u00020/H\u0003ø\u0001\u0000¢\u0006\u0004\b7\u00108\"\u0014\u0010:\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00109\"\u0014\u0010;\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00109\"\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@²\u0006\f\u0010?\u001a\u00020\u001e8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "tonalElevation", "scrimColor", "Landroidx/compose/runtime/Composable;", "dragHandle", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Landroidx/compose/material3/ModalBottomSheetProperties;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "LGJW/vd;", "scope", "animateToDismiss", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "velocity", "settleToDismiss", "rl", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;LGJW/vd;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "progress", "mUb", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F", "gh", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "qie", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", TtmlNode.ATTR_TTS_COLOR, "visible", "t", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "F", "PredictiveBackMaxScaleXDistance", "PredictiveBackMaxScaleYDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "PredictiveBackChildTransformOrigin", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,445:1\n148#2:446\n148#2:544\n148#2:545\n488#3:447\n487#3,4:448\n491#3,2:455\n495#3:461\n1223#4,3:452\n1226#4,3:458\n1223#4,6:462\n1223#4,6:468\n1223#4,6:474\n1223#4,6:480\n1223#4,6:486\n1223#4,6:493\n1223#4,6:499\n1223#4,6:505\n1223#4,6:511\n1223#4,6:517\n1223#4,6:525\n1223#4,6:531\n1223#4,6:537\n487#5:457\n177#6:492\n240#6:524\n696#7:523\n81#8:543\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt\n*L\n127#1:446\n442#1:544\n443#1:545\n134#1:447\n134#1:448,4\n134#1:455,2\n134#1:461\n134#1:452,3\n134#1:458,3\n135#1:462,6\n146#1:468,6\n152#1:474,6\n156#1:480,6\n194#1:486,6\n225#1:493,6\n233#1:499,6\n268#1:505,6\n270#1:511,6\n274#1:517,6\n415#1:525,6\n416#1:531,6\n427#1:537,6\n134#1:457\n216#1:492\n412#1:524\n409#1:523\n411#1:543\n*E\n"})
public final class ModalBottomSheetKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f26259n = Dp.KN(48);
    private static final float rl = Dp.KN(24);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f26260t = TransformOriginKt.n(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, Modifier modifier, SheetState sheetState, float f3, Shape shape, long j2, long j3, float f4, long j4, Function2 function2, Function2 function22, ModalBottomSheetProperties modalBottomSheetProperties, final Function3 function3, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        final SheetState sheetStateQie;
        int i8;
        float f5;
        Shape shape2;
        long jT2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Function3 function32;
        int i18;
        Shape shapeNr;
        long jRl;
        float f6;
        long jO;
        Function2 function23;
        final float f7;
        ModalBottomSheetProperties modalBottomSheetPropertiesN;
        final float f8;
        final Function2 function24;
        final Function2 function25;
        final Shape shape3;
        final long j5;
        final Modifier modifier3;
        final long j6;
        final long j7;
        Object objIF;
        Composer.Companion companion;
        final vd coroutineScope;
        boolean zE2;
        Object objIF2;
        boolean zE22;
        Object objIF3;
        Object objIF4;
        final Animatable animatable;
        boolean zE23;
        Object objIF5;
        Composer composer2;
        final SheetState sheetState2;
        final ModalBottomSheetProperties modalBottomSheetProperties2;
        final float f9;
        final Shape shape4;
        final long j9;
        final long j10;
        final float f10;
        final Function2 function26;
        final Function2 function27;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i19;
        Composer composerKN = composer.KN(2132719801);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        int i20 = i5 & 2;
        if (i20 != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    sheetStateQie = sheetState;
                    int i21 = composerKN.p5(sheetStateQie) ? 256 : 128;
                    i7 |= i21;
                } else {
                    sheetStateQie = sheetState;
                }
                i7 |= i21;
            } else {
                sheetStateQie = sheetState;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    f5 = f3;
                    i7 |= composerKN.rl(f5) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        shape2 = shape;
                        int i22 = composerKN.p5(shape2) ? 16384 : 8192;
                        i7 |= i22;
                    } else {
                        shape2 = shape;
                    }
                    i7 |= i22;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 196608) == 0) {
                    i7 |= ((i5 & 32) == 0 && composerKN.nr(j2)) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    jT2 = j3;
                    i7 |= ((i5 & 64) == 0 && composerKN.nr(jT2)) ? 1048576 : 524288;
                } else {
                    jT2 = j3;
                }
                i9 = i5 & 128;
                if (i9 != 0) {
                    i7 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i7 |= composerKN.rl(f4) ? 8388608 : 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i5 & 256) == 0) {
                        i19 = i7;
                        int i23 = composerKN.nr(j4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        i10 = i19 | i23;
                    } else {
                        i19 = i7;
                    }
                    i10 = i19 | i23;
                } else {
                    i10 = i7;
                }
                i11 = i5 & 512;
                if (i11 != 0) {
                    i13 = i10 | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else {
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i12 = i10 | (composerKN.E2(function2) ? 536870912 : 268435456);
                    } else {
                        i12 = i10;
                    }
                    i13 = i12;
                }
                if ((i3 & 6) == 0) {
                    i14 = i9;
                    i15 = i3 | (((i5 & 1024) == 0 && composerKN.E2(function22)) ? 4 : 2);
                } else {
                    i14 = i9;
                    i15 = i3;
                }
                i16 = i5 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                    i17 = i16;
                } else if ((i3 & 48) == 0) {
                    i17 = i16;
                    i15 |= composerKN.p5(modalBottomSheetProperties) ? 32 : 16;
                } else {
                    i17 = i16;
                }
                int i24 = i15;
                if ((i5 & 4096) == 0) {
                    if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        function32 = function3;
                        i24 |= composerKN.E2(function32) ? 256 : 128;
                    }
                    if ((306783379 & i13) != 306783378 && (i24 & 147) == 146 && composerKN.xMQ()) {
                        composerKN.wTp();
                        j9 = j2;
                        j7 = j4;
                        composer2 = composerKN;
                        f9 = f5;
                        shape4 = shape2;
                        sheetState2 = sheetStateQie;
                        j10 = jT2;
                        f10 = f4;
                        function26 = function2;
                        function27 = function22;
                        modalBottomSheetProperties2 = modalBottomSheetProperties;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i5 & 4) != 0) {
                                i13 &= -897;
                                sheetStateQie = qie(false, null, composerKN, 0, 3);
                            }
                            float fJ2 = i8 == 0 ? BottomSheetDefaults.f24481n.J2() : f5;
                            if ((i5 & 16) == 0) {
                                i18 = 6;
                                shapeNr = BottomSheetDefaults.f24481n.nr(composerKN, 6);
                                i13 &= -57345;
                            } else {
                                i18 = 6;
                                shapeNr = shape2;
                            }
                            if ((i5 & 32) == 0) {
                                i13 &= -458753;
                                jRl = BottomSheetDefaults.f24481n.rl(composerKN, i18);
                            } else {
                                jRl = j2;
                            }
                            if ((i5 & 64) != 0) {
                                jT2 = ColorSchemeKt.t(jRl, composerKN, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            int i25 = i13;
                            float fKN = i14 == 0 ? Dp.KN(0) : f4;
                            if ((i5 & 256) == 0) {
                                f6 = fKN;
                                jO = BottomSheetDefaults.f24481n.O(composerKN, 6);
                                i13 = i25 & (-234881025);
                            } else {
                                f6 = fKN;
                                i13 = i25;
                                jO = j4;
                            }
                            Function2 function2N = i11 == 0 ? ComposableSingletons$ModalBottomSheetKt.f25087n.n() : function2;
                            if ((i5 & 1024) == 0) {
                                function23 = new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                                        return n(composer3, num.intValue());
                                    }

                                    public final WindowInsets n(Composer composer3, int i26) {
                                        composer3.eF(58488196);
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(58488196, i26, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:129)");
                                        }
                                        WindowInsets windowInsetsKN = BottomSheetDefaults.f24481n.KN(composer3, 6);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        composer3.Xw();
                                        return windowInsetsKN;
                                    }
                                };
                                i24 &= -15;
                            } else {
                                function23 = function22;
                            }
                            if (i17 == 0) {
                                modalBottomSheetPropertiesN = ModalBottomSheetDefaults.f26234n.n();
                                f7 = f6;
                            } else {
                                f7 = f6;
                                modalBottomSheetPropertiesN = modalBottomSheetProperties;
                            }
                            f8 = fJ2;
                            function24 = function2N;
                            function25 = function23;
                            shape3 = shapeNr;
                            j5 = jRl;
                            modifier3 = modifier2;
                            j6 = jT2;
                            j7 = jO;
                        } else {
                            composerKN.wTp();
                            if ((i5 & 4) != 0) {
                                i13 &= -897;
                            }
                            if ((i5 & 16) != 0) {
                                i13 &= -57345;
                            }
                            if ((i5 & 32) != 0) {
                                i13 &= -458753;
                            }
                            if ((i5 & 64) != 0) {
                                i13 &= -3670017;
                            }
                            if ((i5 & 256) != 0) {
                                i13 &= -234881025;
                            }
                            if ((i5 & 1024) != 0) {
                                i24 &= -15;
                            }
                            j5 = j2;
                            f7 = f4;
                            j7 = j4;
                            function24 = function2;
                            function25 = function22;
                            modalBottomSheetPropertiesN = modalBottomSheetProperties;
                            f8 = f5;
                            shape3 = shape2;
                            modifier3 = modifier2;
                            j6 = jT2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(2132719801, i13, i24, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)");
                        }
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                            composerKN.o(compositionScopedCoroutineScopeCanceller);
                            objIF = compositionScopedCoroutineScopeCanceller;
                        }
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                        int i26 = (i13 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK;
                        boolean z2 = true;
                        int i27 = i13 & 14;
                        zE2 = ((i26 <= 256 && composerKN.p5(sheetStateQie)) || (i13 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope) | (i27 == 4);
                        objIF2 = composerKN.iF();
                        if (zE2 || objIF2 == companion.n()) {
                            objIF2 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1

                                /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1, reason: invalid class name */
                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
                                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                    int f26304n;

                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                    final /* synthetic */ SheetState f26305t;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                        super(2, continuation);
                                        this.f26305t = sheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object obj, Continuation continuation) {
                                        return new AnonymousClass1(this.f26305t, continuation);
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
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = this.f26304n;
                                        if (i2 != 0) {
                                            if (i2 == 1) {
                                                ResultKt.throwOnFailure(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            ResultKt.throwOnFailure(obj);
                                            SheetState sheetState = this.f26305t;
                                            this.f26304n = 1;
                                            if (sheetState.gh(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (((Boolean) sheetStateQie.getAnchoredDraggableState().getConfirmValueChange().invoke(SheetValue.Hidden)).booleanValue()) {
                                        xuv xuvVarNr = GJW.C.nr(coroutineScope, null, null, new AnonymousClass1(sheetStateQie, null), 3, null);
                                        final SheetState sheetState3 = sheetStateQie;
                                        final Function0 function02 = function0;
                                        xuvVarNr.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
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
                                                if (sheetState3.qie()) {
                                                    return;
                                                }
                                                function02.invoke();
                                            }
                                        });
                                    }
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        final Function0 function02 = (Function0) objIF2;
                        zE22 = composerKN.E2(coroutineScope) | ((i26 <= 256 && composerKN.p5(sheetStateQie)) || (i13 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | (i27 == 4);
                        objIF3 = composerKN.iF();
                        if (zE22 || objIF3 == companion.n()) {
                            objIF3 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1

                                /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1, reason: invalid class name */
                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
                                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                                    final /* synthetic */ float f26311O;

                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                    int f26312n;

                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                    final /* synthetic */ SheetState f26313t;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(SheetState sheetState, float f3, Continuation continuation) {
                                        super(2, continuation);
                                        this.f26313t = sheetState;
                                        this.f26311O = f3;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object obj, Continuation continuation) {
                                        return new AnonymousClass1(this.f26313t, this.f26311O, continuation);
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
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = this.f26312n;
                                        if (i2 != 0) {
                                            if (i2 == 1) {
                                                ResultKt.throwOnFailure(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            ResultKt.throwOnFailure(obj);
                                            SheetState sheetState = this.f26313t;
                                            float f3 = this.f26311O;
                                            this.f26312n = 1;
                                            if (sheetState.HI(f3, this) == coroutine_suspended) {
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
                                public /* bridge */ /* synthetic */ Unit invoke(Float f11) {
                                    n(f11.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(float f11) {
                                    xuv xuvVarNr = GJW.C.nr(coroutineScope, null, null, new AnonymousClass1(sheetStateQie, f11, null), 3, null);
                                    final SheetState sheetState3 = sheetStateQie;
                                    final Function0 function03 = function0;
                                    xuvVarNr.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
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
                                            if (sheetState3.qie()) {
                                                return;
                                            }
                                            function03.invoke();
                                        }
                                    });
                                }
                            };
                            composerKN.o(objIF3);
                        }
                        final Function1 function1 = (Function1) objIF3;
                        objIF4 = composerKN.iF();
                        if (objIF4 == companion.n()) {
                            objIF4 = AnimatableKt.rl(0.0f, 0.0f, 2, null);
                            composerKN.o(objIF4);
                        }
                        animatable = (Animatable) objIF4;
                        zE23 = (i27 == 4) | ((i26 <= 256 && composerKN.p5(sheetStateQie)) || (i13 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope) | composerKN.E2(animatable);
                        objIF5 = composerKN.iF();
                        if (zE23 || objIF5 == companion.n()) {
                            objIF5 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1

                                /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1, reason: invalid class name */
                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
                                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                    int f26265n;

                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                    final /* synthetic */ Animatable f26266t;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(Animatable animatable, Continuation continuation) {
                                        super(2, continuation);
                                        this.f26266t = animatable;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object obj, Continuation continuation) {
                                        return new AnonymousClass1(this.f26266t, continuation);
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
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = this.f26265n;
                                        if (i2 != 0) {
                                            if (i2 == 1) {
                                                ResultKt.throwOnFailure(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            ResultKt.throwOnFailure(obj);
                                            Animatable animatable = this.f26266t;
                                            Float fBoxFloat = Boxing.boxFloat(0.0f);
                                            this.f26265n = 1;
                                            if (Animatable.J2(animatable, fBoxFloat, null, null, null, this, 14, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2, reason: invalid class name */
                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
                                static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                    int f26267n;

                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                    final /* synthetic */ SheetState f26268t;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass2(SheetState sheetState, Continuation continuation) {
                                        super(2, continuation);
                                        this.f26268t = sheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object obj, Continuation continuation) {
                                        return new AnonymousClass2(this.f26268t, continuation);
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
                                        int i2 = this.f26267n;
                                        if (i2 != 0) {
                                            if (i2 == 1) {
                                                ResultKt.throwOnFailure(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            ResultKt.throwOnFailure(obj);
                                            SheetState sheetState = this.f26268t;
                                            this.f26267n = 1;
                                            if (sheetState.az(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3, reason: invalid class name */
                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", f = "ModalBottomSheet.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
                                static final class AnonymousClass3 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                    int f26269n;

                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                    final /* synthetic */ SheetState f26270t;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass3(SheetState sheetState, Continuation continuation) {
                                        super(2, continuation);
                                        this.f26270t = sheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object obj, Continuation continuation) {
                                        return new AnonymousClass3(this.f26270t, continuation);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final Object invoke2(vd vdVar, Continuation continuation) {
                                        return ((AnonymousClass3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                        return invoke2(vdVar, (Continuation) continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = this.f26269n;
                                        if (i2 != 0) {
                                            if (i2 == 1) {
                                                ResultKt.throwOnFailure(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            ResultKt.throwOnFailure(obj);
                                            SheetState sheetState = this.f26270t;
                                            this.f26269n = 1;
                                            if (sheetState.gh(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (sheetStateQie.O() == SheetValue.Expanded && sheetStateQie.Uo()) {
                                        GJW.C.nr(coroutineScope, null, null, new AnonymousClass1(animatable, null), 3, null);
                                        GJW.C.nr(coroutineScope, null, null, new AnonymousClass2(sheetStateQie, null), 3, null);
                                    } else {
                                        xuv xuvVarNr = GJW.C.nr(coroutineScope, null, null, new AnonymousClass3(sheetStateQie, null), 3, null);
                                        final Function0 function03 = function0;
                                        xuvVarNr.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
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
                                                function03.invoke();
                                            }
                                        });
                                    }
                                }
                            };
                            composerKN.o(objIF5);
                        }
                        final Function3 function33 = function32;
                        final SheetState sheetState3 = sheetStateQie;
                        ModalBottomSheet_androidKt.rl((Function0) objIF5, modalBottomSheetPropertiesN, animatable, ComposableLambdaKt.nr(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i28) {
                                if ((i28 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-314673510, i28, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                                }
                                Modifier modifierNr = SemanticsModifierKt.nr(WindowInsetsPadding_androidKt.rl(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.EWS(semanticsPropertyReceiver, true);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }
                                }, 1, null);
                                long j11 = j7;
                                Function0 function03 = function02;
                                SheetState sheetState4 = sheetState3;
                                Animatable animatable2 = animatable;
                                vd vdVar = coroutineScope;
                                Function1 function12 = function1;
                                Modifier modifier4 = modifier3;
                                float f11 = f8;
                                Shape shape5 = shape3;
                                long j12 = j5;
                                long j13 = j6;
                                float f12 = f7;
                                Function2 function28 = function24;
                                Function2 function29 = function25;
                                Function3 function34 = function33;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierNr);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion2.n();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer3.T();
                                if (composer3.getInserting()) {
                                    composer3.s7N(function0N);
                                } else {
                                    composer3.r();
                                }
                                Composer composerN = Updater.n(composer3);
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                ModalBottomSheetKt.t(j11, function03, sheetState4.mUb() != SheetValue.Hidden, composer3, 0);
                                ModalBottomSheetKt.rl(boxScopeInstance, animatable2, vdVar, function03, function12, modifier4, sheetState4, f11, shape5, j12, j13, f12, function28, function29, function34, composer3, (Animatable.az << 3) | 6, 0, 0);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (i24 & 112) | 3072 | (Animatable.az << 6));
                        composer2 = composerKN;
                        if (sheetStateQie.J2()) {
                            if ((i26 <= 256 || !composer2.p5(sheetStateQie)) && (i13 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                                z2 = false;
                            }
                            Object objIF6 = composer2.iF();
                            if (z2 || objIF6 == companion.n()) {
                                objIF6 = new ModalBottomSheetKt$ModalBottomSheet$4$1(sheetStateQie, null);
                                composer2.o(objIF6);
                            }
                            EffectsKt.O(sheetStateQie, (Function2) objIF6, composer2, (i13 >> 6) & 14);
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        sheetState2 = sheetStateQie;
                        modalBottomSheetProperties2 = modalBottomSheetPropertiesN;
                        modifier2 = modifier3;
                        f9 = f8;
                        shape4 = shape3;
                        j9 = j5;
                        j10 = j6;
                        f10 = f7;
                        function26 = function24;
                        function27 = function25;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        final Modifier modifier4 = modifier2;
                        final long j11 = j7;
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i28) {
                                ModalBottomSheetKt.n(function0, modifier4, sheetState2, f9, shape4, j9, j10, f10, j11, function26, function27, modalBottomSheetProperties2, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i24 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                function32 = function3;
                if ((306783379 & i13) != 306783378) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                        }
                        if ((i5 & 4) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i5 & 16) == 0) {
                        }
                        if ((i5 & 32) == 0) {
                        }
                        if ((i5 & 64) != 0) {
                        }
                        int i252 = i13;
                        if (i14 == 0) {
                        }
                        if ((i5 & 256) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if ((i5 & 1024) == 0) {
                        }
                        if (i17 == 0) {
                        }
                        f8 = fJ2;
                        function24 = function2N;
                        function25 = function23;
                        shape3 = shapeNr;
                        j5 = jRl;
                        modifier3 = modifier2;
                        j6 = jT2;
                        j7 = jO;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                        }
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                        int i262 = (i13 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK;
                        boolean z22 = true;
                        if (i262 <= 256) {
                            int i272 = i13 & 14;
                            zE2 = ((i262 <= 256 && composerKN.p5(sheetStateQie)) || (i13 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope) | (i272 == 4);
                            objIF2 = composerKN.iF();
                            if (zE2) {
                                objIF2 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1

                                    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1, reason: invalid class name */
                                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                                        int f26304n;

                                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                                        final /* synthetic */ SheetState f26305t;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                            super(2, continuation);
                                            this.f26305t = sheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation create(Object obj, Continuation continuation) {
                                            return new AnonymousClass1(this.f26305t, continuation);
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
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i2 = this.f26304n;
                                            if (i2 != 0) {
                                                if (i2 == 1) {
                                                    ResultKt.throwOnFailure(obj);
                                                } else {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                            } else {
                                                ResultKt.throwOnFailure(obj);
                                                SheetState sheetState = this.f26305t;
                                                this.f26304n = 1;
                                                if (sheetState.gh(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (((Boolean) sheetStateQie.getAnchoredDraggableState().getConfirmValueChange().invoke(SheetValue.Hidden)).booleanValue()) {
                                            xuv xuvVarNr = GJW.C.nr(coroutineScope, null, null, new AnonymousClass1(sheetStateQie, null), 3, null);
                                            final SheetState sheetState32 = sheetStateQie;
                                            final Function0 function022 = function0;
                                            xuvVarNr.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
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
                                                    if (sheetState32.qie()) {
                                                        return;
                                                    }
                                                    function022.invoke();
                                                }
                                            });
                                        }
                                    }
                                };
                                composerKN.o(objIF2);
                                final Function0 function022 = (Function0) objIF2;
                                if (i262 <= 256) {
                                    zE22 = composerKN.E2(coroutineScope) | ((i262 <= 256 && composerKN.p5(sheetStateQie)) || (i13 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | (i272 == 4);
                                    objIF3 = composerKN.iF();
                                    if (zE22) {
                                        objIF3 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1

                                            /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1, reason: invalid class name */
                                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                /* JADX INFO: renamed from: O, reason: collision with root package name */
                                                final /* synthetic */ float f26311O;

                                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                int f26312n;

                                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                final /* synthetic */ SheetState f26313t;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(SheetState sheetState, float f3, Continuation continuation) {
                                                    super(2, continuation);
                                                    this.f26313t = sheetState;
                                                    this.f26311O = f3;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation create(Object obj, Continuation continuation) {
                                                    return new AnonymousClass1(this.f26313t, this.f26311O, continuation);
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
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i2 = this.f26312n;
                                                    if (i2 != 0) {
                                                        if (i2 == 1) {
                                                            ResultKt.throwOnFailure(obj);
                                                        } else {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                    } else {
                                                        ResultKt.throwOnFailure(obj);
                                                        SheetState sheetState = this.f26313t;
                                                        float f3 = this.f26311O;
                                                        this.f26312n = 1;
                                                        if (sheetState.HI(f3, this) == coroutine_suspended) {
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
                                            public /* bridge */ /* synthetic */ Unit invoke(Float f11) {
                                                n(f11.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(float f11) {
                                                xuv xuvVarNr = GJW.C.nr(coroutineScope, null, null, new AnonymousClass1(sheetStateQie, f11, null), 3, null);
                                                final SheetState sheetState32 = sheetStateQie;
                                                final Function0 function03 = function0;
                                                xuvVarNr.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
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
                                                        if (sheetState32.qie()) {
                                                            return;
                                                        }
                                                        function03.invoke();
                                                    }
                                                });
                                            }
                                        };
                                        composerKN.o(objIF3);
                                        final Function1 function12 = (Function1) objIF3;
                                        objIF4 = composerKN.iF();
                                        if (objIF4 == companion.n()) {
                                        }
                                        animatable = (Animatable) objIF4;
                                        if (i262 <= 256) {
                                            zE23 = (i272 == 4) | ((i262 <= 256 && composerKN.p5(sheetStateQie)) || (i13 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope) | composerKN.E2(animatable);
                                            objIF5 = composerKN.iF();
                                            if (zE23) {
                                                objIF5 = new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1

                                                    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1, reason: invalid class name */
                                                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                        int f26265n;

                                                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                        final /* synthetic */ Animatable f26266t;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(Animatable animatable, Continuation continuation) {
                                                            super(2, continuation);
                                                            this.f26266t = animatable;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation create(Object obj, Continuation continuation) {
                                                            return new AnonymousClass1(this.f26266t, continuation);
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
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i2 = this.f26265n;
                                                            if (i2 != 0) {
                                                                if (i2 == 1) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                } else {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                            } else {
                                                                ResultKt.throwOnFailure(obj);
                                                                Animatable animatable = this.f26266t;
                                                                Float fBoxFloat = Boxing.boxFloat(0.0f);
                                                                this.f26265n = 1;
                                                                if (Animatable.J2(animatable, fBoxFloat, null, null, null, this, 14, null) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2, reason: invalid class name */
                                                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
                                                    static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                        int f26267n;

                                                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                        final /* synthetic */ SheetState f26268t;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass2(SheetState sheetState, Continuation continuation) {
                                                            super(2, continuation);
                                                            this.f26268t = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation create(Object obj, Continuation continuation) {
                                                            return new AnonymousClass2(this.f26268t, continuation);
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
                                                            int i2 = this.f26267n;
                                                            if (i2 != 0) {
                                                                if (i2 == 1) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                } else {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                            } else {
                                                                ResultKt.throwOnFailure(obj);
                                                                SheetState sheetState = this.f26268t;
                                                                this.f26267n = 1;
                                                                if (sheetState.az(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3, reason: invalid class name */
                                                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", f = "ModalBottomSheet.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
                                                    static final class AnonymousClass3 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                        int f26269n;

                                                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                        final /* synthetic */ SheetState f26270t;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass3(SheetState sheetState, Continuation continuation) {
                                                            super(2, continuation);
                                                            this.f26270t = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation create(Object obj, Continuation continuation) {
                                                            return new AnonymousClass3(this.f26270t, continuation);
                                                        }

                                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final Object invoke2(vd vdVar, Continuation continuation) {
                                                            return ((AnonymousClass3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                            return invoke2(vdVar, (Continuation) continuation);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i2 = this.f26269n;
                                                            if (i2 != 0) {
                                                                if (i2 == 1) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                } else {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                            } else {
                                                                ResultKt.throwOnFailure(obj);
                                                                SheetState sheetState = this.f26270t;
                                                                this.f26269n = 1;
                                                                if (sheetState.gh(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        if (sheetStateQie.O() == SheetValue.Expanded && sheetStateQie.Uo()) {
                                                            GJW.C.nr(coroutineScope, null, null, new AnonymousClass1(animatable, null), 3, null);
                                                            GJW.C.nr(coroutineScope, null, null, new AnonymousClass2(sheetStateQie, null), 3, null);
                                                        } else {
                                                            xuv xuvVarNr = GJW.C.nr(coroutineScope, null, null, new AnonymousClass3(sheetStateQie, null), 3, null);
                                                            final Function0 function03 = function0;
                                                            xuvVarNr.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
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
                                                                    function03.invoke();
                                                                }
                                                            });
                                                        }
                                                    }
                                                };
                                                composerKN.o(objIF5);
                                                final Function3 function332 = function32;
                                                final SheetState sheetState32 = sheetStateQie;
                                                ModalBottomSheet_androidKt.rl((Function0) objIF5, modalBottomSheetPropertiesN, animatable, ComposableLambdaKt.nr(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        n(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer3, int i28) {
                                                        if ((i28 & 3) == 2 && composer3.xMQ()) {
                                                            composer3.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(-314673510, i28, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                                                        }
                                                        Modifier modifierNr = SemanticsModifierKt.nr(WindowInsetsPadding_androidKt.rl(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                                                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                SemanticsPropertiesKt.EWS(semanticsPropertyReceiver, true);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                n(semanticsPropertyReceiver);
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, 1, null);
                                                        long j112 = j7;
                                                        Function0 function03 = function022;
                                                        SheetState sheetState4 = sheetState32;
                                                        Animatable animatable2 = animatable;
                                                        vd vdVar = coroutineScope;
                                                        Function1 function122 = function12;
                                                        Modifier modifier42 = modifier3;
                                                        float f11 = f8;
                                                        Shape shape5 = shape3;
                                                        long j12 = j5;
                                                        long j13 = j6;
                                                        float f12 = f7;
                                                        Function2 function28 = function24;
                                                        Function2 function29 = function25;
                                                        Function3 function34 = function332;
                                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                                        int iN = ComposablesKt.n(composer3, 0);
                                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierNr);
                                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                        Function0 function0N = companion2.n();
                                                        if (composer3.getApplier() == null) {
                                                            ComposablesKt.t();
                                                        }
                                                        composer3.T();
                                                        if (composer3.getInserting()) {
                                                            composer3.s7N(function0N);
                                                        } else {
                                                            composer3.r();
                                                        }
                                                        Composer composerN = Updater.n(composer3);
                                                        Updater.O(composerN, measurePolicyUo, companion2.t());
                                                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                                        Function2 function2Rl = companion2.rl();
                                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                            composerN.o(Integer.valueOf(iN));
                                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                                        }
                                                        Updater.O(composerN, modifierO, companion2.nr());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                        ModalBottomSheetKt.t(j112, function03, sheetState4.mUb() != SheetValue.Hidden, composer3, 0);
                                                        ModalBottomSheetKt.rl(boxScopeInstance, animatable2, vdVar, function03, function122, modifier42, sheetState4, f11, shape5, j12, j13, f12, function28, function29, function34, composer3, (Animatable.az << 3) | 6, 0, 0);
                                                        composer3.XQ();
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composerKN, 54), composerKN, (i24 & 112) | 3072 | (Animatable.az << 6));
                                                composer2 = composerKN;
                                                if (sheetStateQie.J2()) {
                                                }
                                                if (ComposerKt.v()) {
                                                }
                                                sheetState2 = sheetStateQie;
                                                modalBottomSheetProperties2 = modalBottomSheetPropertiesN;
                                                modifier2 = modifier3;
                                                f9 = f8;
                                                shape4 = shape3;
                                                j9 = j5;
                                                j10 = j6;
                                                f10 = f7;
                                                function26 = function24;
                                                function27 = function25;
                                            }
                                        } else {
                                            zE23 = (i272 == 4) | ((i262 <= 256 && composerKN.p5(sheetStateQie)) || (i13 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope) | composerKN.E2(animatable);
                                            objIF5 = composerKN.iF();
                                            if (zE23) {
                                            }
                                        }
                                    }
                                } else {
                                    zE22 = composerKN.E2(coroutineScope) | ((i262 <= 256 && composerKN.p5(sheetStateQie)) || (i13 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | (i272 == 4);
                                    objIF3 = composerKN.iF();
                                    if (zE22) {
                                    }
                                }
                            }
                        } else {
                            int i2722 = i13 & 14;
                            zE2 = ((i262 <= 256 && composerKN.p5(sheetStateQie)) || (i13 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope) | (i2722 == 4);
                            objIF2 = composerKN.iF();
                            if (zE2) {
                            }
                        }
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            f5 = f3;
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i11 = i5 & 512;
            if (i11 != 0) {
            }
            if ((i3 & 6) == 0) {
            }
            i16 = i5 & 2048;
            if (i16 != 0) {
            }
            int i242 = i15;
            if ((i5 & 4096) == 0) {
            }
            function32 = function3;
            if ((306783379 & i13) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        f5 = f3;
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i11 = i5 & 512;
        if (i11 != 0) {
        }
        if ((i3 & 6) == 0) {
        }
        i16 = i5 & 2048;
        if (i16 != 0) {
        }
        int i2422 = i15;
        if ((i5 & 4096) == 0) {
        }
        function32 = function3;
        if ((306783379 & i13) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final BoxScope boxScope, final Animatable animatable, final vd vdVar, final Function0 function0, final Function1 function1, Modifier modifier, SheetState sheetState, float f3, Shape shape, long j2, long j3, float f4, Function2 function2, Function2 function22, final Function3 function3, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        vd vdVar2;
        int i9;
        Modifier modifier2;
        final SheetState sheetState2;
        int i10;
        float fJ2;
        Shape shapeNr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        SheetState sheetStateQie;
        int i19;
        long jRl;
        long jT2;
        Function2 function2Rl;
        Function2 function23;
        int i20;
        int i21;
        long j4;
        long j5;
        float f5;
        final String strN;
        boolean z2;
        Object objIF;
        boolean z3;
        Object objIF2;
        boolean z4;
        Object objIF3;
        boolean zP5;
        Object objIF4;
        boolean z5;
        Object objIF5;
        Composer composer2;
        final Function2 function24;
        final Modifier modifier3;
        final SheetState sheetState3;
        final float f6;
        final Function2 function25;
        final Shape shape2;
        final long j6;
        final long j7;
        final float f7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1676960531);
        if ((i5 & Integer.MIN_VALUE) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(boxScope) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 1) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= (i2 & 64) == 0 ? composerKN.p5(animatable) : composerKN.E2(animatable) ? 32 : 16;
        }
        int i22 = i7;
        if ((i5 & 2) != 0) {
            i22 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            i8 = 1;
        } else {
            i8 = 1;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                vdVar2 = vdVar;
                i22 |= composerKN.E2(vdVar2) ? 256 : 128;
            }
            if ((i5 & 4) == 0) {
                i22 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i22 |= composerKN.E2(function0) ? 2048 : 1024;
                }
                if ((i5 & 8) != 0) {
                    i22 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i22 |= composerKN.E2(function1) ? 16384 : 8192;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i22 |= 196608;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 196608) == 0) {
                        i22 |= composerKN.p5(modifier2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    sheetState2 = sheetState;
                    i22 |= ((i5 & 32) == 0 && composerKN.p5(sheetState2)) ? 1048576 : 524288;
                } else {
                    sheetState2 = sheetState;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i22 |= 12582912;
                    fJ2 = f3;
                } else {
                    fJ2 = f3;
                    if ((i2 & 12582912) == 0) {
                        i22 |= composerKN.rl(fJ2) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 100663296) == 0) {
                    if ((i5 & 128) == 0) {
                        shapeNr = shape;
                        int i23 = composerKN.p5(shapeNr) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        i22 |= i23;
                    } else {
                        shapeNr = shape;
                    }
                    i22 |= i23;
                } else {
                    shapeNr = shape;
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    int i24 = i22;
                    if ((i5 & 256) == 0) {
                        i12 = i9;
                        int i25 = composerKN.nr(j2) ? 536870912 : 268435456;
                        i11 = i24 | i25;
                    } else {
                        i12 = i9;
                    }
                    i11 = i24 | i25;
                } else {
                    i11 = i22;
                    i12 = i9;
                }
                if ((i3 & 6) == 0) {
                    i13 = i12;
                    i14 = i3 | (((i5 & 512) == 0 && composerKN.nr(j3)) ? 4 : 2);
                } else {
                    i13 = i12;
                    i14 = i3;
                }
                i15 = i5 & 1024;
                if (i15 != 0) {
                    i16 = i15;
                    i17 = i14 | 48;
                } else if ((i3 & 48) == 0) {
                    i17 = i14 | (composerKN.rl(f4) ? 32 : 16);
                    i16 = i15;
                } else {
                    i16 = i15;
                    i17 = i14;
                }
                i18 = i5 & 2048;
                if (i18 != 0) {
                    i17 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                } else {
                    if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i17 |= composerKN.E2(function2) ? 256 : 128;
                    }
                    int i26 = i17;
                    if ((i3 & 3072) == 0) {
                        i26 |= ((i5 & 4096) == 0 && composerKN.E2(function22)) ? 2048 : 1024;
                    }
                    int i27 = i26;
                    if ((i5 & 8192) != 0) {
                        if ((i3 & 24576) == 0) {
                            i27 |= composerKN.E2(function3) ? 16384 : 8192;
                        }
                        if ((306783379 & i11) == 306783378 && (i27 & 9363) == 9362 && composerKN.xMQ()) {
                            composerKN.wTp();
                            function25 = function2;
                            function24 = function22;
                            modifier3 = modifier2;
                            sheetState3 = sheetState2;
                            f6 = fJ2;
                            composer2 = composerKN;
                            shape2 = shapeNr;
                            j6 = j2;
                            j7 = j3;
                            f7 = f4;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier4 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                                if ((i5 & 32) == 0) {
                                    sheetStateQie = qie(false, null, composerKN, 0, 3);
                                    i11 &= -3670017;
                                } else {
                                    sheetStateQie = sheetState2;
                                }
                                if (i10 != 0) {
                                    fJ2 = BottomSheetDefaults.f24481n.J2();
                                }
                                if ((128 & i5) == 0) {
                                    i11 &= -234881025;
                                    shapeNr = BottomSheetDefaults.f24481n.nr(composerKN, 6);
                                    i19 = 6;
                                } else {
                                    i19 = 6;
                                }
                                if ((256 & i5) == 0) {
                                    i11 = (-1879048193) & i11;
                                    jRl = BottomSheetDefaults.f24481n.rl(composerKN, i19);
                                } else {
                                    jRl = j2;
                                }
                                if ((i5 & 512) == 0) {
                                    jT2 = ColorSchemeKt.t(jRl, composerKN, (i11 >> 27) & 14);
                                    i27 &= -15;
                                } else {
                                    jT2 = j3;
                                }
                                float fT = i16 == 0 ? BottomSheetDefaults.f24481n.t() : f4;
                                function2Rl = i18 == 0 ? ComposableSingletons$ModalBottomSheetKt.f25087n.rl() : function2;
                                Modifier modifier5 = modifier4;
                                if ((i5 & 4096) == 0) {
                                    function23 = new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                                            return n(composer3, num.intValue());
                                        }

                                        public final WindowInsets n(Composer composer3, int i28) {
                                            composer3.eF(-11444670);
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-11444670, i28, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:212)");
                                            }
                                            WindowInsets windowInsetsKN = BottomSheetDefaults.f24481n.KN(composer3, 6);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            composer3.Xw();
                                            return windowInsetsKN;
                                        }
                                    };
                                    i27 &= -7169;
                                } else {
                                    function23 = function22;
                                }
                                i20 = 32;
                                i21 = 1572864;
                                j4 = jT2;
                                j5 = jRl;
                                f5 = fT;
                                sheetState2 = sheetStateQie;
                                modifier2 = modifier5;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 32) != 0) {
                                    i11 &= -3670017;
                                }
                                if ((128 & i5) != 0) {
                                    i11 &= -234881025;
                                }
                                if ((256 & i5) != 0) {
                                    i11 &= -1879048193;
                                }
                                if ((i5 & 512) != 0) {
                                    i27 &= -15;
                                }
                                if ((i5 & 4096) != 0) {
                                    i27 &= -7169;
                                }
                                j4 = j3;
                                function2Rl = function2;
                                function23 = function22;
                                i20 = 32;
                                i21 = 1572864;
                                j5 = j2;
                                f5 = f4;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1676960531, i11, i27, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:214)");
                            }
                            Strings.Companion companion = Strings.INSTANCE;
                            strN = Strings_androidKt.n(Strings.n(R.string.f27126O), composerKN, 0);
                            int i28 = i27;
                            final Function2 function26 = function23;
                            int i29 = i8;
                            Modifier modifierKN = SizeKt.KN(SizeKt.g(boxScope.n(modifier2, Alignment.INSTANCE.az()), 0.0f, fJ2, i29, null), 0.0f, i29, null);
                            int i30 = (3670016 & i11) ^ i21;
                            z2 = (i30 <= 1048576 && composerKN.p5(sheetState2)) || (i11 & i21) == 1048576;
                            objIF = composerKN.iF();
                            if (z2 || objIF == Composer.INSTANCE.n()) {
                                objIF = SheetDefaultsKt.n(sheetState2, Orientation.f16969n, function1);
                                composerKN.o(objIF);
                            }
                            Modifier modifierRl = NestedScrollModifierKt.rl(modifierKN, (NestedScrollConnection) objIF, null, 2, null);
                            AnchoredDraggableState anchoredDraggableState = sheetState2.getAnchoredDraggableState();
                            Orientation orientation = Orientation.f16969n;
                            z3 = (i30 <= 1048576 && composerKN.p5(sheetState2)) || (i11 & i21) == 1048576;
                            objIF2 = composerKN.iF();
                            if (z3 || objIF2 == Composer.INSTANCE.n()) {
                                objIF2 = new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                    public /* synthetic */ class WhenMappings {
                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                        static {
                                            int[] iArr = new int[SheetValue.values().length];
                                            try {
                                                iArr[SheetValue.Hidden.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
                                            }
                                            try {
                                                iArr[SheetValue.Expanded.ordinal()] = 3;
                                            } catch (NoSuchFieldError unused3) {
                                            }
                                            $EnumSwitchMapping$0 = iArr;
                                        }
                                    }

                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                                        return n(intSize.getPackedValue(), constraints.getValue());
                                    }

                                    public final Pair n(final long j9, long j10) {
                                        SheetValue sheetValue;
                                        final float fGh = Constraints.gh(j10);
                                        final SheetState sheetState4 = sheetState2;
                                        DraggableAnchors draggableAnchorsN = AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                n(draggableAnchorsConfig);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                                draggableAnchorsConfig.n(SheetValue.Hidden, fGh);
                                                if (IntSize.J2(j9) > fGh / 2 && !sheetState4.getSkipPartiallyExpanded()) {
                                                    draggableAnchorsConfig.n(SheetValue.PartiallyExpanded, fGh / 2.0f);
                                                }
                                                if (IntSize.J2(j9) != 0) {
                                                    draggableAnchorsConfig.n(SheetValue.Expanded, Math.max(0.0f, fGh - IntSize.J2(j9)));
                                                }
                                            }
                                        });
                                        int i31 = WhenMappings.$EnumSwitchMapping$0[((SheetValue) sheetState2.getAnchoredDraggableState().aYN()).ordinal()];
                                        if (i31 != 1) {
                                            if (i31 != 2 && i31 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            sheetValue = SheetValue.PartiallyExpanded;
                                            if (!draggableAnchorsN.nr(sheetValue)) {
                                                sheetValue = SheetValue.Expanded;
                                                if (!draggableAnchorsN.nr(sheetValue)) {
                                                    sheetValue = SheetValue.Hidden;
                                                }
                                            }
                                        } else {
                                            sheetValue = SheetValue.Hidden;
                                        }
                                        return TuplesKt.to(draggableAnchorsN, sheetValue);
                                    }
                                };
                                composerKN.o(objIF2);
                            }
                            Modifier modifierKN2 = AnchoredDraggableKt.KN(modifierRl, anchoredDraggableState, orientation, (Function2) objIF2);
                            DraggableState draggableState = sheetState2.getAnchoredDraggableState().getDraggableState();
                            boolean zQie = sheetState2.qie();
                            boolean zViF = sheetState2.getAnchoredDraggableState().ViF();
                            z4 = (57344 & i11) != 16384;
                            objIF3 = composerKN.iF();
                            if (!z4 || objIF3 == Composer.INSTANCE.n()) {
                                objIF3 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                                composerKN.o(objIF3);
                            }
                            Modifier modifierKN3 = DraggableKt.KN(modifierKN2, draggableState, orientation, zQie, null, zViF, null, (Function3) objIF3, false, 168, null);
                            zP5 = composerKN.p5(strN);
                            objIF4 = composerKN.iF();
                            if (!zP5 || objIF4 == Composer.INSTANCE.n()) {
                                objIF4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
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
                                        SemanticsPropertiesKt.eTf(semanticsPropertyReceiver, strN);
                                        SemanticsPropertiesKt.hRu(semanticsPropertyReceiver, 0.0f);
                                    }
                                };
                                composerKN.o(objIF4);
                            }
                            Modifier modifierNr = SemanticsModifierKt.nr(modifierKN3, false, (Function1) objIF4, 1, null);
                            z5 = ((i30 <= 1048576 && composerKN.p5(sheetState2)) || (i11 & i21) == 1048576) | ((i11 & 112) == i20 || ((i11 & 64) != 0 && composerKN.E2(animatable)));
                            objIF5 = composerKN.iF();
                            if (!z5 || objIF5 == Composer.INSTANCE.n()) {
                                objIF5 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                        n(graphicsLayerScope);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(GraphicsLayerScope graphicsLayerScope) {
                                        float fWPU = sheetState2.getAnchoredDraggableState().WPU();
                                        float fXMQ = Size.xMQ(graphicsLayerScope.getSize());
                                        if (Float.isNaN(fWPU) || Float.isNaN(fXMQ) || fXMQ == 0.0f) {
                                            return;
                                        }
                                        float fFloatValue = ((Number) animatable.ty()).floatValue();
                                        graphicsLayerScope.Uo(ModalBottomSheetKt.mUb(graphicsLayerScope, fFloatValue));
                                        graphicsLayerScope.az(ModalBottomSheetKt.gh(graphicsLayerScope, fFloatValue));
                                        graphicsLayerScope.tUK(TransformOriginKt.n(0.5f, (fWPU + fXMQ) / fXMQ));
                                    }
                                };
                                composerKN.o(objIF5);
                            }
                            final SheetState sheetState4 = sheetState2;
                            final vd vdVar3 = vdVar2;
                            final Function2 function27 = function2Rl;
                            int i31 = i11 >> 21;
                            int i32 = i28 << 9;
                            composer2 = composerKN;
                            Shape shape3 = shapeNr;
                            SurfaceKt.n(GraphicsLayerModifierKt.n(modifierNr, (Function1) objIF5), shape3, j5, j4, f5, 0.0f, null, ComposableLambdaKt.nr(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i33) {
                                    if ((i33 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-692668920, i33, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierNr2 = WindowInsetsPaddingKt.nr(SizeKt.KN(companion2, 0.0f, 1, null), (WindowInsets) function26.invoke(composer3, 0));
                                    boolean zE2 = composer3.E2(animatable);
                                    final Animatable animatable2 = animatable;
                                    Object objIF6 = composer3.iF();
                                    if (zE2 || objIF6 == Composer.INSTANCE.n()) {
                                        objIF6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                n(graphicsLayerScope);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(GraphicsLayerScope graphicsLayerScope) {
                                                float fFloatValue = ((Number) animatable2.ty()).floatValue();
                                                float fMUb = ModalBottomSheetKt.mUb(graphicsLayerScope, fFloatValue);
                                                float fGh = ModalBottomSheetKt.gh(graphicsLayerScope, fFloatValue);
                                                graphicsLayerScope.az(fGh == 0.0f ? 1.0f : fMUb / fGh);
                                                graphicsLayerScope.tUK(ModalBottomSheetKt.f26260t);
                                            }
                                        };
                                        composer3.o(objIF6);
                                    }
                                    Modifier modifierN = GraphicsLayerModifierKt.n(modifierNr2, (Function1) objIF6);
                                    Function2 function28 = function27;
                                    final SheetState sheetState5 = sheetState4;
                                    final Function0 function02 = function0;
                                    final vd vdVar4 = vdVar3;
                                    Function3 function32 = function3;
                                    Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composer3, 0);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion4.n();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer3.T();
                                    if (composer3.getInserting()) {
                                        composer3.s7N(function0N);
                                    } else {
                                        composer3.r();
                                    }
                                    Composer composerN = Updater.n(composer3);
                                    Updater.O(composerN, measurePolicyN, companion4.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion4.O());
                                    Function2 function2Rl2 = companion4.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl2);
                                    }
                                    Updater.O(composerN, modifierO, companion4.nr());
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                    composer3.eF(-1636564008);
                                    if (function28 != null) {
                                        Strings.Companion companion5 = Strings.INSTANCE;
                                        final String strN2 = Strings_androidKt.n(Strings.n(R.string.f27135n), composer3, 0);
                                        final String strN3 = Strings_androidKt.n(Strings.n(R.string.rl), composer3, 0);
                                        final String strN4 = Strings_androidKt.n(Strings.n(R.string.nr), composer3, 0);
                                        Modifier modifierT = columnScopeInstance.t(companion2, companion3.Uo());
                                        boolean zP52 = composer3.p5(sheetState5) | composer3.p5(strN3) | composer3.p5(function02) | composer3.p5(strN4) | composer3.E2(vdVar4) | composer3.p5(strN2);
                                        Object objIF7 = composer3.iF();
                                        if (zP52 || objIF7 == Composer.INSTANCE.n()) {
                                            objIF7 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
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
                                                    final SheetState sheetState6 = sheetState5;
                                                    String str = strN3;
                                                    String str2 = strN4;
                                                    String str3 = strN2;
                                                    final Function0 function03 = function02;
                                                    final vd vdVar5 = vdVar4;
                                                    SemanticsPropertiesKt.az(semanticsPropertyReceiver, str, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                        public final Boolean invoke() {
                                                            function03.invoke();
                                                            return Boolean.TRUE;
                                                        }
                                                    });
                                                    if (sheetState6.O() == SheetValue.PartiallyExpanded) {
                                                        SemanticsPropertiesKt.ck(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2

                                                            /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1, reason: invalid class name */
                                                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                                            @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
                                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                                int f26343n;

                                                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                                final /* synthetic */ SheetState f26344t;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                                                    super(2, continuation);
                                                                    this.f26344t = sheetState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation create(Object obj, Continuation continuation) {
                                                                    return new AnonymousClass1(this.f26344t, continuation);
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
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i2 = this.f26343n;
                                                                    if (i2 != 0) {
                                                                        if (i2 == 1) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                        } else {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                    } else {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        SheetState sheetState = this.f26344t;
                                                                        this.f26343n = 1;
                                                                        if (sheetState.t(this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                            public final Boolean invoke() {
                                                                if (((Boolean) sheetState6.getAnchoredDraggableState().getConfirmValueChange().invoke(SheetValue.Expanded)).booleanValue()) {
                                                                    GJW.C.nr(vdVar5, null, null, new AnonymousClass1(sheetState6, null), 3, null);
                                                                }
                                                                return Boolean.TRUE;
                                                            }
                                                        });
                                                    } else if (sheetState6.Uo()) {
                                                        SemanticsPropertiesKt.O(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3

                                                            /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1, reason: invalid class name */
                                                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                                            @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                                int f26347n;

                                                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                                final /* synthetic */ SheetState f26348t;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                                                    super(2, continuation);
                                                                    this.f26348t = sheetState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation create(Object obj, Continuation continuation) {
                                                                    return new AnonymousClass1(this.f26348t, continuation);
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
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i2 = this.f26347n;
                                                                    if (i2 != 0) {
                                                                        if (i2 == 1) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                        } else {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                    } else {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        SheetState sheetState = this.f26348t;
                                                                        this.f26347n = 1;
                                                                        if (sheetState.az(this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                            public final Boolean invoke() {
                                                                if (((Boolean) sheetState6.getAnchoredDraggableState().getConfirmValueChange().invoke(SheetValue.PartiallyExpanded)).booleanValue()) {
                                                                    GJW.C.nr(vdVar5, null, null, new AnonymousClass1(sheetState6, null), 3, null);
                                                                }
                                                                return Boolean.TRUE;
                                                            }
                                                        });
                                                    }
                                                }
                                            };
                                            composer3.o(objIF7);
                                        }
                                        Modifier modifierT2 = SemanticsModifierKt.t(modifierT, true, (Function1) objIF7);
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                                        int iN2 = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierT2);
                                        Function0 function0N2 = companion4.n();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer3.T();
                                        if (composer3.getInserting()) {
                                            composer3.s7N(function0N2);
                                        } else {
                                            composer3.r();
                                        }
                                        Composer composerN2 = Updater.n(composer3);
                                        Updater.O(composerN2, measurePolicyUo, companion4.t());
                                        Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                                        Function2 function2Rl3 = companion4.rl();
                                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                            composerN2.o(Integer.valueOf(iN2));
                                            composerN2.az(Integer.valueOf(iN2), function2Rl3);
                                        }
                                        Updater.O(composerN2, modifierO2, companion4.nr());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                        function28.invoke(composer3, 0);
                                        composer3.XQ();
                                    }
                                    composer3.Xw();
                                    function32.invoke(columnScopeInstance, composer3, 6);
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composer2, (i31 & 896) | (i31 & 112) | 12582912 | (i32 & 7168) | (i32 & 57344), 96);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function24 = function26;
                            modifier3 = modifier2;
                            sheetState3 = sheetState2;
                            f6 = fJ2;
                            function25 = function2Rl;
                            shape2 = shape3;
                            j6 = j5;
                            j7 = j4;
                            f7 = f5;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i33) {
                                    ModalBottomSheetKt.rl(boxScope, animatable, vdVar, function0, function1, modifier3, sheetState3, f6, shape2, j6, j7, f7, function25, function24, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i27 |= 24576;
                    if ((306783379 & i11) == 306783378) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i13 == 0) {
                            }
                            if ((i5 & 32) == 0) {
                            }
                            if (i10 != 0) {
                            }
                            if ((128 & i5) == 0) {
                            }
                            if ((256 & i5) == 0) {
                            }
                            if ((i5 & 512) == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            Modifier modifier52 = modifier4;
                            if ((i5 & 4096) == 0) {
                            }
                            i20 = 32;
                            i21 = 1572864;
                            j4 = jT2;
                            j5 = jRl;
                            f5 = fT;
                            sheetState2 = sheetStateQie;
                            modifier2 = modifier52;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            Strings.Companion companion2 = Strings.INSTANCE;
                            strN = Strings_androidKt.n(Strings.n(R.string.f27126O), composerKN, 0);
                            int i282 = i27;
                            final Function2 function262 = function23;
                            int i292 = i8;
                            Modifier modifierKN4 = SizeKt.KN(SizeKt.g(boxScope.n(modifier2, Alignment.INSTANCE.az()), 0.0f, fJ2, i292, null), 0.0f, i292, null);
                            int i302 = (3670016 & i11) ^ i21;
                            if (i302 <= 1048576) {
                                objIF = composerKN.iF();
                                if (z2) {
                                    objIF = SheetDefaultsKt.n(sheetState2, Orientation.f16969n, function1);
                                    composerKN.o(objIF);
                                    Modifier modifierRl2 = NestedScrollModifierKt.rl(modifierKN4, (NestedScrollConnection) objIF, null, 2, null);
                                    AnchoredDraggableState anchoredDraggableState2 = sheetState2.getAnchoredDraggableState();
                                    Orientation orientation2 = Orientation.f16969n;
                                    if (i302 <= 1048576) {
                                        objIF2 = composerKN.iF();
                                        if (z3) {
                                            objIF2 = new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                                public /* synthetic */ class WhenMappings {
                                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                    static {
                                                        int[] iArr = new int[SheetValue.values().length];
                                                        try {
                                                            iArr[SheetValue.Hidden.ordinal()] = 1;
                                                        } catch (NoSuchFieldError unused) {
                                                        }
                                                        try {
                                                            iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                                                        } catch (NoSuchFieldError unused2) {
                                                        }
                                                        try {
                                                            iArr[SheetValue.Expanded.ordinal()] = 3;
                                                        } catch (NoSuchFieldError unused3) {
                                                        }
                                                        $EnumSwitchMapping$0 = iArr;
                                                    }
                                                }

                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                                                    return n(intSize.getPackedValue(), constraints.getValue());
                                                }

                                                public final Pair n(final long j9, long j10) {
                                                    SheetValue sheetValue;
                                                    final float fGh = Constraints.gh(j10);
                                                    final SheetState sheetState42 = sheetState2;
                                                    DraggableAnchors draggableAnchorsN = AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                            n(draggableAnchorsConfig);
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                                            draggableAnchorsConfig.n(SheetValue.Hidden, fGh);
                                                            if (IntSize.J2(j9) > fGh / 2 && !sheetState42.getSkipPartiallyExpanded()) {
                                                                draggableAnchorsConfig.n(SheetValue.PartiallyExpanded, fGh / 2.0f);
                                                            }
                                                            if (IntSize.J2(j9) != 0) {
                                                                draggableAnchorsConfig.n(SheetValue.Expanded, Math.max(0.0f, fGh - IntSize.J2(j9)));
                                                            }
                                                        }
                                                    });
                                                    int i312 = WhenMappings.$EnumSwitchMapping$0[((SheetValue) sheetState2.getAnchoredDraggableState().aYN()).ordinal()];
                                                    if (i312 != 1) {
                                                        if (i312 != 2 && i312 != 3) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        sheetValue = SheetValue.PartiallyExpanded;
                                                        if (!draggableAnchorsN.nr(sheetValue)) {
                                                            sheetValue = SheetValue.Expanded;
                                                            if (!draggableAnchorsN.nr(sheetValue)) {
                                                                sheetValue = SheetValue.Hidden;
                                                            }
                                                        }
                                                    } else {
                                                        sheetValue = SheetValue.Hidden;
                                                    }
                                                    return TuplesKt.to(draggableAnchorsN, sheetValue);
                                                }
                                            };
                                            composerKN.o(objIF2);
                                            Modifier modifierKN22 = AnchoredDraggableKt.KN(modifierRl2, anchoredDraggableState2, orientation2, (Function2) objIF2);
                                            DraggableState draggableState2 = sheetState2.getAnchoredDraggableState().getDraggableState();
                                            boolean zQie2 = sheetState2.qie();
                                            boolean zViF2 = sheetState2.getAnchoredDraggableState().ViF();
                                            if ((57344 & i11) != 16384) {
                                            }
                                            objIF3 = composerKN.iF();
                                            if (!z4) {
                                                objIF3 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                                                composerKN.o(objIF3);
                                                Modifier modifierKN32 = DraggableKt.KN(modifierKN22, draggableState2, orientation2, zQie2, null, zViF2, null, (Function3) objIF3, false, 168, null);
                                                zP5 = composerKN.p5(strN);
                                                objIF4 = composerKN.iF();
                                                if (!zP5) {
                                                    objIF4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
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
                                                            SemanticsPropertiesKt.eTf(semanticsPropertyReceiver, strN);
                                                            SemanticsPropertiesKt.hRu(semanticsPropertyReceiver, 0.0f);
                                                        }
                                                    };
                                                    composerKN.o(objIF4);
                                                    Modifier modifierNr2 = SemanticsModifierKt.nr(modifierKN32, false, (Function1) objIF4, 1, null);
                                                    if (i302 <= 1048576) {
                                                        if ((i11 & 112) == i20) {
                                                            z5 = ((i302 <= 1048576 && composerKN.p5(sheetState2)) || (i11 & i21) == 1048576) | ((i11 & 112) == i20 || ((i11 & 64) != 0 && composerKN.E2(animatable)));
                                                            objIF5 = composerKN.iF();
                                                            if (!z5) {
                                                                objIF5 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                        n(graphicsLayerScope);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void n(GraphicsLayerScope graphicsLayerScope) {
                                                                        float fWPU = sheetState2.getAnchoredDraggableState().WPU();
                                                                        float fXMQ = Size.xMQ(graphicsLayerScope.getSize());
                                                                        if (Float.isNaN(fWPU) || Float.isNaN(fXMQ) || fXMQ == 0.0f) {
                                                                            return;
                                                                        }
                                                                        float fFloatValue = ((Number) animatable.ty()).floatValue();
                                                                        graphicsLayerScope.Uo(ModalBottomSheetKt.mUb(graphicsLayerScope, fFloatValue));
                                                                        graphicsLayerScope.az(ModalBottomSheetKt.gh(graphicsLayerScope, fFloatValue));
                                                                        graphicsLayerScope.tUK(TransformOriginKt.n(0.5f, (fWPU + fXMQ) / fXMQ));
                                                                    }
                                                                };
                                                                composerKN.o(objIF5);
                                                                final SheetState sheetState42 = sheetState2;
                                                                final vd vdVar32 = vdVar2;
                                                                final Function2 function272 = function2Rl;
                                                                int i312 = i11 >> 21;
                                                                int i322 = i282 << 9;
                                                                composer2 = composerKN;
                                                                Shape shape32 = shapeNr;
                                                                SurfaceKt.n(GraphicsLayerModifierKt.n(modifierNr2, (Function1) objIF5), shape32, j5, j4, f5, 0.0f, null, ComposableLambdaKt.nr(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                                        n(composer3, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void n(Composer composer3, int i33) {
                                                                        if ((i33 & 3) == 2 && composer3.xMQ()) {
                                                                            composer3.wTp();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.v()) {
                                                                            ComposerKt.p5(-692668920, i33, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                                                                        }
                                                                        Modifier.Companion companion22 = Modifier.INSTANCE;
                                                                        Modifier modifierNr22 = WindowInsetsPaddingKt.nr(SizeKt.KN(companion22, 0.0f, 1, null), (WindowInsets) function262.invoke(composer3, 0));
                                                                        boolean zE2 = composer3.E2(animatable);
                                                                        final Animatable animatable2 = animatable;
                                                                        Object objIF6 = composer3.iF();
                                                                        if (zE2 || objIF6 == Composer.INSTANCE.n()) {
                                                                            objIF6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                                                                {
                                                                                    super(1);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                                    n(graphicsLayerScope);
                                                                                    return Unit.INSTANCE;
                                                                                }

                                                                                public final void n(GraphicsLayerScope graphicsLayerScope) {
                                                                                    float fFloatValue = ((Number) animatable2.ty()).floatValue();
                                                                                    float fMUb = ModalBottomSheetKt.mUb(graphicsLayerScope, fFloatValue);
                                                                                    float fGh = ModalBottomSheetKt.gh(graphicsLayerScope, fFloatValue);
                                                                                    graphicsLayerScope.az(fGh == 0.0f ? 1.0f : fMUb / fGh);
                                                                                    graphicsLayerScope.tUK(ModalBottomSheetKt.f26260t);
                                                                                }
                                                                            };
                                                                            composer3.o(objIF6);
                                                                        }
                                                                        Modifier modifierN = GraphicsLayerModifierKt.n(modifierNr22, (Function1) objIF6);
                                                                        Function2 function28 = function272;
                                                                        final SheetState sheetState5 = sheetState42;
                                                                        final Function0 function02 = function0;
                                                                        final vd vdVar4 = vdVar32;
                                                                        Function3 function32 = function3;
                                                                        Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                                                                        Alignment.Companion companion3 = Alignment.INSTANCE;
                                                                        MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composer3, 0);
                                                                        int iN = ComposablesKt.n(composer3, 0);
                                                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
                                                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                                        Function0 function0N = companion4.n();
                                                                        if (composer3.getApplier() == null) {
                                                                            ComposablesKt.t();
                                                                        }
                                                                        composer3.T();
                                                                        if (composer3.getInserting()) {
                                                                            composer3.s7N(function0N);
                                                                        } else {
                                                                            composer3.r();
                                                                        }
                                                                        Composer composerN = Updater.n(composer3);
                                                                        Updater.O(composerN, measurePolicyN, companion4.t());
                                                                        Updater.O(composerN, compositionLocalMapIk, companion4.O());
                                                                        Function2 function2Rl2 = companion4.rl();
                                                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                                            composerN.o(Integer.valueOf(iN));
                                                                            composerN.az(Integer.valueOf(iN), function2Rl2);
                                                                        }
                                                                        Updater.O(composerN, modifierO, companion4.nr());
                                                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                                                        composer3.eF(-1636564008);
                                                                        if (function28 != null) {
                                                                            Strings.Companion companion5 = Strings.INSTANCE;
                                                                            final String strN2 = Strings_androidKt.n(Strings.n(R.string.f27135n), composer3, 0);
                                                                            final String strN3 = Strings_androidKt.n(Strings.n(R.string.rl), composer3, 0);
                                                                            final String strN4 = Strings_androidKt.n(Strings.n(R.string.nr), composer3, 0);
                                                                            Modifier modifierT = columnScopeInstance.t(companion22, companion3.Uo());
                                                                            boolean zP52 = composer3.p5(sheetState5) | composer3.p5(strN3) | composer3.p5(function02) | composer3.p5(strN4) | composer3.E2(vdVar4) | composer3.p5(strN2);
                                                                            Object objIF7 = composer3.iF();
                                                                            if (zP52 || objIF7 == Composer.INSTANCE.n()) {
                                                                                objIF7 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
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
                                                                                        final SheetState sheetState6 = sheetState5;
                                                                                        String str = strN3;
                                                                                        String str2 = strN4;
                                                                                        String str3 = strN2;
                                                                                        final Function0 function03 = function02;
                                                                                        final vd vdVar5 = vdVar4;
                                                                                        SemanticsPropertiesKt.az(semanticsPropertyReceiver, str, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                                                                            {
                                                                                                super(0);
                                                                                            }

                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                                                            public final Boolean invoke() {
                                                                                                function03.invoke();
                                                                                                return Boolean.TRUE;
                                                                                            }
                                                                                        });
                                                                                        if (sheetState6.O() == SheetValue.PartiallyExpanded) {
                                                                                            SemanticsPropertiesKt.ck(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2

                                                                                                /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1, reason: invalid class name */
                                                                                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                                                                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
                                                                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                                                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                                                                    int f26343n;

                                                                                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                                                                    final /* synthetic */ SheetState f26344t;

                                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                    AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                                                                                        super(2, continuation);
                                                                                                        this.f26344t = sheetState;
                                                                                                    }

                                                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                                                                        return new AnonymousClass1(this.f26344t, continuation);
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
                                                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                                        int i2 = this.f26343n;
                                                                                                        if (i2 != 0) {
                                                                                                            if (i2 == 1) {
                                                                                                                ResultKt.throwOnFailure(obj);
                                                                                                            } else {
                                                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                            }
                                                                                                        } else {
                                                                                                            ResultKt.throwOnFailure(obj);
                                                                                                            SheetState sheetState = this.f26344t;
                                                                                                            this.f26343n = 1;
                                                                                                            if (sheetState.t(this) == coroutine_suspended) {
                                                                                                                return coroutine_suspended;
                                                                                                            }
                                                                                                        }
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                }

                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                {
                                                                                                    super(0);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                                                                public final Boolean invoke() {
                                                                                                    if (((Boolean) sheetState6.getAnchoredDraggableState().getConfirmValueChange().invoke(SheetValue.Expanded)).booleanValue()) {
                                                                                                        GJW.C.nr(vdVar5, null, null, new AnonymousClass1(sheetState6, null), 3, null);
                                                                                                    }
                                                                                                    return Boolean.TRUE;
                                                                                                }
                                                                                            });
                                                                                        } else if (sheetState6.Uo()) {
                                                                                            SemanticsPropertiesKt.O(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3

                                                                                                /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1, reason: invalid class name */
                                                                                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                                                                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                                                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                                                                    int f26347n;

                                                                                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                                                                    final /* synthetic */ SheetState f26348t;

                                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                    AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                                                                                        super(2, continuation);
                                                                                                        this.f26348t = sheetState;
                                                                                                    }

                                                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                                                                        return new AnonymousClass1(this.f26348t, continuation);
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
                                                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                                        int i2 = this.f26347n;
                                                                                                        if (i2 != 0) {
                                                                                                            if (i2 == 1) {
                                                                                                                ResultKt.throwOnFailure(obj);
                                                                                                            } else {
                                                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                            }
                                                                                                        } else {
                                                                                                            ResultKt.throwOnFailure(obj);
                                                                                                            SheetState sheetState = this.f26348t;
                                                                                                            this.f26347n = 1;
                                                                                                            if (sheetState.az(this) == coroutine_suspended) {
                                                                                                                return coroutine_suspended;
                                                                                                            }
                                                                                                        }
                                                                                                        return Unit.INSTANCE;
                                                                                                    }
                                                                                                }

                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                {
                                                                                                    super(0);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                                                                public final Boolean invoke() {
                                                                                                    if (((Boolean) sheetState6.getAnchoredDraggableState().getConfirmValueChange().invoke(SheetValue.PartiallyExpanded)).booleanValue()) {
                                                                                                        GJW.C.nr(vdVar5, null, null, new AnonymousClass1(sheetState6, null), 3, null);
                                                                                                    }
                                                                                                    return Boolean.TRUE;
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }
                                                                                };
                                                                                composer3.o(objIF7);
                                                                            }
                                                                            Modifier modifierT2 = SemanticsModifierKt.t(modifierT, true, (Function1) objIF7);
                                                                            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                                                                            int iN2 = ComposablesKt.n(composer3, 0);
                                                                            CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                                                            Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierT2);
                                                                            Function0 function0N2 = companion4.n();
                                                                            if (composer3.getApplier() == null) {
                                                                                ComposablesKt.t();
                                                                            }
                                                                            composer3.T();
                                                                            if (composer3.getInserting()) {
                                                                                composer3.s7N(function0N2);
                                                                            } else {
                                                                                composer3.r();
                                                                            }
                                                                            Composer composerN2 = Updater.n(composer3);
                                                                            Updater.O(composerN2, measurePolicyUo, companion4.t());
                                                                            Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                                                                            Function2 function2Rl3 = companion4.rl();
                                                                            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                                                composerN2.o(Integer.valueOf(iN2));
                                                                                composerN2.az(Integer.valueOf(iN2), function2Rl3);
                                                                            }
                                                                            Updater.O(composerN2, modifierO2, companion4.nr());
                                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                                            function28.invoke(composer3, 0);
                                                                            composer3.XQ();
                                                                        }
                                                                        composer3.Xw();
                                                                        function32.invoke(columnScopeInstance, composer3, 6);
                                                                        composer3.XQ();
                                                                        if (ComposerKt.v()) {
                                                                            ComposerKt.M7();
                                                                        }
                                                                    }
                                                                }, composerKN, 54), composer2, (i312 & 896) | (i312 & 112) | 12582912 | (i322 & 7168) | (i322 & 57344), 96);
                                                                if (ComposerKt.v()) {
                                                                }
                                                                function24 = function262;
                                                                modifier3 = modifier2;
                                                                sheetState3 = sheetState2;
                                                                f6 = fJ2;
                                                                function25 = function2Rl;
                                                                shape2 = shape32;
                                                                j6 = j5;
                                                                j7 = j4;
                                                                f7 = f5;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        objIF2 = composerKN.iF();
                                        if (z3) {
                                        }
                                    }
                                }
                            } else {
                                objIF = composerKN.iF();
                                if (z2) {
                                }
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                int i262 = i17;
                if ((i3 & 3072) == 0) {
                }
                int i272 = i262;
                if ((i5 & 8192) != 0) {
                }
                if ((306783379 & i11) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            if ((i5 & 8) != 0) {
            }
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i3 & 6) == 0) {
            }
            i15 = i5 & 1024;
            if (i15 != 0) {
            }
            i18 = i5 & 2048;
            if (i18 != 0) {
            }
            int i2622 = i17;
            if ((i3 & 3072) == 0) {
            }
            int i2722 = i2622;
            if ((i5 & 8192) != 0) {
            }
            if ((306783379 & i11) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        vdVar2 = vdVar;
        if ((i5 & 4) == 0) {
        }
        if ((i5 & 8) != 0) {
        }
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i3 & 6) == 0) {
        }
        i15 = i5 & 1024;
        if (i15 != 0) {
        }
        i18 = i5 & 2048;
        if (i18 != 0) {
        }
        int i26222 = i17;
        if ((i3 & 3072) == 0) {
        }
        int i27222 = i26222;
        if ((i5 & 8192) != 0) {
        }
        if ((306783379 & i11) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final SheetState qie(boolean z2, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i3 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$rememberModalBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(SheetValue sheetValue) {
                    return Boolean.TRUE;
                }
            };
        }
        Function1 function12 = function1;
        if (ComposerKt.v()) {
            ComposerKt.p5(-778250030, i2, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        SheetState sheetStateNr = SheetDefaultsKt.nr(z3, function12, SheetValue.Hidden, false, composer, (i2 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i2 & 112), 8);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return sheetStateNr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final long j2, final Function0 function0, final boolean z2, Composer composer, final int i2) {
        int i3;
        Modifier modifierT;
        Composer composerKN = composer.KN(951870469);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(951870469, i3, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if (j2 != 16) {
                int i5 = i3;
                final State stateNr = AnimateAsStateKt.nr(z2 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerKN, 48, 28);
                Strings.Companion companion = Strings.INSTANCE;
                final String strN = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.f31095t), composerKN, 0);
                composerKN.eF(-1785653838);
                if (z2) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    int i7 = i5 & 112;
                    boolean z3 = i7 == 32;
                    Object objIF = composerKN.iF();
                    if (z3 || objIF == Composer.INSTANCE.n()) {
                        objIF = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(function0, null);
                        composerKN.o(objIF);
                    }
                    Modifier modifierZmq = companion2.Zmq(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objIF), 6, null));
                    boolean zP5 = composerKN.p5(strN) | (i7 == 32);
                    Object objIF2 = composerKN.iF();
                    if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1
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
                                SemanticsPropertiesKt.hRu(semanticsPropertyReceiver, 1.0f);
                                SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                                final Function0 function02 = function0;
                                SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1.1
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    modifierT = SemanticsModifierKt.t(modifierZmq, true, (Function1) objIF2);
                } else {
                    modifierT = Modifier.INSTANCE;
                }
                composerKN.Xw();
                Modifier modifierZmq2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null).Zmq(modifierT);
                boolean zP52 = composerKN.p5(stateNr) | ((i5 & 14) == 4);
                Object objIF3 = composerKN.iF();
                if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$1$1
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
                            DrawScope.h(drawScope, j2, 0L, 0L, RangesKt.coerceIn(ModalBottomSheetKt.nr(stateNr), 0.0f, 1.0f), null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                        }
                    };
                    composerKN.o(objIF3);
                }
                CanvasKt.rl(modifierZmq2, (Function1) objIF3, composerKN, 0);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    ModalBottomSheetKt.t(j2, function0, z2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float gh(GraphicsLayerScope graphicsLayerScope, float f3) {
        float fXMQ = Size.xMQ(graphicsLayerScope.getSize());
        if (Float.isNaN(fXMQ) || fXMQ == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.rl(0.0f, Math.min(graphicsLayerScope.l(rl), fXMQ), f3) / fXMQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float mUb(GraphicsLayerScope graphicsLayerScope, float f3) {
        float fGh = Size.gh(graphicsLayerScope.getSize());
        if (Float.isNaN(fGh) || fGh == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.rl(0.0f, Math.min(graphicsLayerScope.l(f26259n), fGh), f3) / fGh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nr(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
