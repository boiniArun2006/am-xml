package androidx.compose.material;

import GJW.vd;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aG\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0093\u0001\u0010\u001f\u001a\u00020\r2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010!\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"\u001a0\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u001d2\u0006\u0010%\u001a\u00020\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a#\u0010-\u001a\u00020,2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.\"\u0014\u00100\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/\"\u0014\u00101\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010/\"\u0014\u00102\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064²\u0006\f\u00103\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "skipHalfExpanded", "Landroidx/compose/material/ModalBottomSheetState;", "mUb", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "sheetState", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "xMQ", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;)Landroidx/compose/ui/Modifier;", TtmlNode.ATTR_TTS_COLOR, "onDismiss", "visible", "t", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", c.f62177j, "(Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "F", "ModalBottomSheetPositionalThreshold", "ModalBottomSheetVelocityThreshold", "MaxModalBottomSheetWidth", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,590:1\n75#2:591\n1247#3,6:592\n1247#3,3:605\n1250#3,3:609\n1247#3,6:684\n1247#3,6:694\n1247#3,6:700\n1247#3,6:711\n1247#3,6:717\n1247#3,6:723\n557#4:598\n554#4,6:599\n555#5:608\n71#6:612\n68#6,6:613\n74#6:647\n71#6:648\n68#6,6:649\n74#6:683\n78#6:693\n78#6:709\n79#7,6:619\n86#7,4:634\n90#7,2:644\n79#7,6:655\n86#7,4:670\n90#7,2:680\n94#7:692\n94#7:708\n368#8,9:625\n377#8:646\n368#8,9:661\n377#8:682\n378#8,2:690\n378#8,2:706\n4034#9,6:638\n4034#9,6:674\n696#10:710\n85#11:729\n149#12:730\n149#12:731\n149#12:732\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n279#1:591\n297#1:592,6\n354#1:605,3\n354#1:609,3\n361#1:684,6\n376#1:694,6\n395#1:700,6\n497#1:711,6\n498#1:717,6\n509#1:723,6\n354#1:598\n354#1:599,6\n354#1:608\n356#1:612\n356#1:613,6\n356#1:647\n357#1:648\n357#1:649,6\n357#1:683\n357#1:693\n356#1:709\n356#1:619,6\n356#1:634,4\n356#1:644,2\n357#1:655,6\n357#1:670,4\n357#1:680,2\n357#1:692\n356#1:708\n356#1:625,9\n356#1:646\n357#1:661,9\n357#1:682\n357#1:690,2\n356#1:706,2\n356#1:638,6\n357#1:674,6\n491#1:710\n493#1:729\n587#1:730\n588#1:731\n589#1:732\n*E\n"})
public final class ModalBottomSheetKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f22220n = Dp.KN(56);
    private static final float rl = Dp.KN(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f22221t = Dp.KN(640);

    public static final ModalBottomSheetState mUb(final ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, Function1 function1, boolean z2, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = ModalBottomSheetDefaults.f22218n.n();
        }
        final AnimationSpec animationSpec2 = animationSpec;
        final Function1 function12 = (i3 & 4) != 0 ? new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(ModalBottomSheetValue modalBottomSheetValue2) {
                return Boolean.TRUE;
            }
        } : function1;
        final boolean z3 = (i3 & 8) != 0 ? false : z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-126412120, i2, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
        }
        final Density density = (Density) composer.ty(CompositionLocalsKt.J2());
        composer.X(976451635, modalBottomSheetValue);
        Object[] objArr = {modalBottomSheetValue, animationSpec2, Boolean.valueOf(z3), function12, density};
        Saver saverN = ModalBottomSheetState.INSTANCE.n(animationSpec2, function12, z3, density);
        boolean zP5 = ((((i2 & 14) ^ 6) > 4 && composer.p5(modalBottomSheetValue)) || (i2 & 6) == 4) | composer.p5(density) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function12)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composer.E2(animationSpec2) | ((((i2 & 7168) ^ 3072) > 2048 && composer.n(z3)) || (i2 & 3072) == 2048);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            Object obj = new Function0<ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final ModalBottomSheetState invoke() {
                    return new ModalBottomSheetState(modalBottomSheetValue, density, function12, animationSpec2, z3);
                }
            };
            composer.o(obj);
            objIF = obj;
        }
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        composer.P5();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return modalBottomSheetState;
    }

    private static final NestedScrollConnection n(AnchoredDraggableState anchoredDraggableState, Orientation orientation) {
        return new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010d  */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
    public static final void rl(final Function3 function3, Modifier modifier, ModalBottomSheetState modalBottomSheetState, boolean z2, Shape shape, float f3, long j2, long j3, long j4, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        ModalBottomSheetState modalBottomSheetState2;
        int i7;
        boolean z3;
        Shape shape2;
        float f4;
        int i8;
        long j5;
        int i9;
        int i10;
        final Modifier modifier2;
        final ModalBottomSheetState modalBottomSheetState3;
        Composer composer2;
        final long j6;
        final boolean z4;
        final Shape shape3;
        final float f5;
        final long j7;
        final long j9;
        ScopeUpdateScope scopeUpdateScopeGh;
        boolean z5;
        final ModalBottomSheetState modalBottomSheetStateMUb;
        Shape large;
        float fRl;
        long jTy;
        long jRl;
        Shape shape4;
        float f6;
        long j10;
        long j11;
        long jT2;
        int i11;
        int i12;
        ?? r12;
        Object objIF;
        Composer.Companion companion;
        final vd vdVar;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        boolean zE2;
        Object objIF2;
        Modifier modifierRl;
        boolean z6;
        Composer composerKN = composer.KN(-92970288);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i13 = i3 & 2;
        if (i13 == 0) {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(modifier) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    modalBottomSheetState2 = modalBottomSheetState;
                    int i14 = composerKN.E2(modalBottomSheetState2) ? 256 : 128;
                    i5 |= i14;
                } else {
                    modalBottomSheetState2 = modalBottomSheetState;
                }
                i5 |= i14;
            } else {
                modalBottomSheetState2 = modalBottomSheetState;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i2 & 3072) == 0) {
                    i5 |= composerKN.n(z3) ? 2048 : 1024;
                }
            }
            if ((i2 & 24576) != 0) {
                shape2 = shape;
                i5 |= ((i3 & 16) == 0 && composerKN.p5(shape2)) ? 16384 : 8192;
            } else {
                shape2 = shape;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    f4 = f3;
                    int i15 = composerKN.rl(f4) ? 131072 : 65536;
                    i5 |= i15;
                } else {
                    f4 = f3;
                }
                i5 |= i15;
            } else {
                f4 = f3;
            }
            if ((i2 & 1572864) != 0) {
                i8 = i7;
                j5 = j2;
                i5 |= ((i3 & 64) == 0 && composerKN.nr(j5)) ? 1048576 : 524288;
            } else {
                i8 = i7;
                j5 = j2;
            }
            if ((12582912 & i2) == 0) {
                i5 |= ((i3 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304;
            }
            if ((100663296 & i2) != 0) {
                if ((i3 & 256) == 0) {
                    i9 = i13;
                    int i16 = composerKN.nr(j4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    i5 |= i16;
                } else {
                    i9 = i13;
                }
                i5 |= i16;
            } else {
                i9 = i13;
            }
            if ((i3 & 512) == 0) {
                i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
            } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                i5 |= composerKN.E2(function2) ? 536870912 : 268435456;
            }
            i10 = i5;
            if (composerKN.HI((306783379 & i10) == 306783378, i10 & 1)) {
                composerKN.wTp();
                modifier2 = modifier;
                modalBottomSheetState3 = modalBottomSheetState2;
                composer2 = composerKN;
                j6 = j5;
                z4 = z3;
                shape3 = shape2;
                f5 = f3;
                j7 = j3;
                j9 = j4;
            } else {
                composerKN.e();
                if ((i2 & 1) == 0 || composerKN.rV9()) {
                    Modifier modifier3 = i9 != 0 ? Modifier.INSTANCE : modifier;
                    if ((i3 & 4) != 0) {
                        modifier = modifier3;
                        z5 = false;
                        modalBottomSheetStateMUb = mUb(ModalBottomSheetValue.f22291n, null, null, false, composerKN, 6, 14);
                        i10 &= -897;
                    } else {
                        modifier = modifier3;
                        z5 = false;
                        modalBottomSheetStateMUb = modalBottomSheetState2;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 16) != 0) {
                        large = MaterialTheme.f22169n.rl(composerKN, 6).getLarge();
                        i10 &= -57345;
                    } else {
                        large = shape2;
                    }
                    if ((i3 & 32) != 0) {
                        fRl = ModalBottomSheetDefaults.f22218n.rl();
                        i10 &= -458753;
                    } else {
                        fRl = f3;
                    }
                    if ((i3 & 64) != 0) {
                        jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                        i10 &= -3670017;
                    } else {
                        jTy = j5;
                    }
                    if ((i3 & 128) != 0) {
                        jRl = ColorsKt.rl(jTy, composerKN, (i10 >> 18) & 14);
                        i10 &= -29360129;
                    } else {
                        jRl = j3;
                    }
                    if ((i3 & 256) != 0) {
                        shape4 = large;
                        f6 = fRl;
                        jT2 = ModalBottomSheetDefaults.f22218n.t(composerKN, z5 ? 1 : 0);
                        i11 = i10 & (-234881025);
                        j10 = jTy;
                        j11 = jRl;
                        i12 = -92970288;
                        r12 = z5;
                        Modifier modifier4 = modifier;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(i12, i11, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)");
                        }
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                            composerKN.o(objIF);
                        }
                        vdVar = (vd) objIF;
                        Orientation orientation = Orientation.f16969n;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), r12);
                        iN = ComposablesKt.n(composerKN, r12);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        long j12 = jT2;
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifier4);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion3.n();
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.r();
                        } else {
                            composerKN.s7N(function0N);
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyUo, companion3.t());
                        Updater.O(composerN, compositionLocalMapIk, companion3.O());
                        function2Rl = companion3.rl();
                        if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion3.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        Modifier modifierNr = Modifier.INSTANCE;
                        int i17 = i11;
                        Modifier modifierJ2 = SizeKt.J2(modifierNr, 0.0f, 1, null);
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
                        iN2 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierJ2);
                        Function0 function0N2 = companion3.n();
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.r();
                        } else {
                            composerKN.s7N(function0N2);
                        }
                        composerN2 = Updater.n(composerKN);
                        Updater.O(composerN2, measurePolicyUo2, companion3.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                        function2Rl2 = companion3.rl();
                        if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO2, companion3.nr());
                        function2.invoke(composerKN, Integer.valueOf((i17 >> 27) & 14));
                        zE2 = composerKN.E2(modalBottomSheetStateMUb) | composerKN.E2(vdVar);
                        objIF2 = composerKN.iF();
                        if (!zE2 || objIF2 == companion.n()) {
                            objIF2 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1

                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1, reason: invalid class name */
                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
                                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                    int f22232n;

                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                    final /* synthetic */ ModalBottomSheetState f22233t;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                        super(2, continuation);
                                        this.f22233t = modalBottomSheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object obj, Continuation continuation) {
                                        return new AnonymousClass1(this.f22233t, continuation);
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
                                        int i2 = this.f22232n;
                                        if (i2 != 0) {
                                            if (i2 == 1) {
                                                ResultKt.throwOnFailure(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            ResultKt.throwOnFailure(obj);
                                            ModalBottomSheetState modalBottomSheetState = this.f22233t;
                                            this.f22232n = 1;
                                            if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
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
                                    if (((Boolean) modalBottomSheetStateMUb.getAnchoredDraggableState().getConfirmValueChange().invoke(ModalBottomSheetValue.f22291n)).booleanValue()) {
                                        GJW.C.nr(vdVar, null, null, new AnonymousClass1(modalBottomSheetStateMUb, null), 3, null);
                                    }
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        Function0 function0 = (Function0) objIF2;
                        Object objAYN = modalBottomSheetStateMUb.getAnchoredDraggableState().aYN();
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f22291n;
                        t(j12, function0, objAYN == modalBottomSheetValue, composerKN, (i17 >> 24) & 14);
                        composerKN.XQ();
                        Modifier modifierKN = SizeKt.KN(SizeKt.g(boxScopeInstance.n(modifierNr, companion2.az()), 0.0f, f22221t, 1, null), 0.0f, 1, null);
                        if (z3) {
                            composerKN.eF(-167335778);
                            composerKN.Xw();
                            modifierRl = modifierNr;
                        } else {
                            composerKN.eF(-892908339);
                            boolean zP5 = composerKN.p5(modalBottomSheetStateMUb.getAnchoredDraggableState());
                            Object objIF3 = composerKN.iF();
                            if (zP5 || objIF3 == companion.n()) {
                                objIF3 = n(modalBottomSheetStateMUb.getAnchoredDraggableState(), orientation);
                                composerKN.o(objIF3);
                            }
                            modifierRl = NestedScrollModifierKt.rl(modifierNr, (NestedScrollConnection) objIF3, null, 2, null);
                            composerKN.Xw();
                        }
                        Modifier modifierO3 = AnchoredDraggableKt.O(xMQ(modifierKN.Zmq(modifierRl), modalBottomSheetStateMUb), modalBottomSheetStateMUb.getAnchoredDraggableState(), orientation, (z3 || modalBottomSheetStateMUb.getAnchoredDraggableState().o() == modalBottomSheetValue) ? false : true, false, null, false, 56, null);
                        if (z3) {
                            composerKN.eF(-167257346);
                            composerKN.Xw();
                        } else {
                            composerKN.eF(-891907876);
                            boolean zE22 = composerKN.E2(modalBottomSheetStateMUb) | composerKN.E2(vdVar);
                            Object objIF4 = composerKN.iF();
                            if (zE22 || objIF4 == companion.n()) {
                                objIF4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
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
                                        if (modalBottomSheetStateMUb.gh()) {
                                            final ModalBottomSheetState modalBottomSheetState4 = modalBottomSheetStateMUb;
                                            final vd vdVar2 = vdVar;
                                            SemanticsPropertiesKt.ty(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1, reason: invalid class name and collision with other inner class name */
                                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {401}, m = "invokeSuspend", n = {}, s = {})
                                                static final class C05281 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                    int f22238n;

                                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                    final /* synthetic */ ModalBottomSheetState f22239t;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C05281(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                        super(2, continuation);
                                                        this.f22239t = modalBottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                        return new C05281(this.f22239t, continuation);
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final Object invoke2(vd vdVar, Continuation continuation) {
                                                        return ((C05281) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                        return invoke2(vdVar, (Continuation) continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i2 = this.f22238n;
                                                        if (i2 != 0) {
                                                            if (i2 == 1) {
                                                                ResultKt.throwOnFailure(obj);
                                                            } else {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                        } else {
                                                            ResultKt.throwOnFailure(obj);
                                                            ModalBottomSheetState modalBottomSheetState = this.f22239t;
                                                            this.f22238n = 1;
                                                            if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
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
                                                    if (((Boolean) modalBottomSheetState4.getAnchoredDraggableState().getConfirmValueChange().invoke(ModalBottomSheetValue.f22291n)).booleanValue()) {
                                                        GJW.C.nr(vdVar2, null, null, new C05281(modalBottomSheetState4, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                            if (modalBottomSheetStateMUb.getAnchoredDraggableState().o() == ModalBottomSheetValue.f22290O) {
                                                final ModalBottomSheetState modalBottomSheetState5 = modalBottomSheetStateMUb;
                                                final vd vdVar3 = vdVar;
                                                SemanticsPropertiesKt.Ik(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1.2

                                                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$2$1, reason: invalid class name */
                                                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {414}, m = "invokeSuspend", n = {}, s = {})
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                        int f22242n;

                                                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                        final /* synthetic */ ModalBottomSheetState f22243t;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                            super(2, continuation);
                                                            this.f22243t = modalBottomSheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation create(Object obj, Continuation continuation) {
                                                            return new AnonymousClass1(this.f22243t, continuation);
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
                                                            int i2 = this.f22242n;
                                                            if (i2 != 0) {
                                                                if (i2 == 1) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                } else {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                            } else {
                                                                ResultKt.throwOnFailure(obj);
                                                                ModalBottomSheetState modalBottomSheetState = this.f22243t;
                                                                this.f22242n = 1;
                                                                if (modalBottomSheetState.t(this) == coroutine_suspended) {
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
                                                        if (((Boolean) modalBottomSheetState5.getAnchoredDraggableState().getConfirmValueChange().invoke(ModalBottomSheetValue.f22293t)).booleanValue()) {
                                                            GJW.C.nr(vdVar3, null, null, new AnonymousClass1(modalBottomSheetState5, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }, 1, null);
                                            } else if (modalBottomSheetStateMUb.J2()) {
                                                final ModalBottomSheetState modalBottomSheetState6 = modalBottomSheetStateMUb;
                                                final vd vdVar4 = vdVar;
                                                SemanticsPropertiesKt.J2(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1.3

                                                    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1, reason: invalid class name */
                                                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {425}, m = "invokeSuspend", n = {}, s = {})
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                        int f22246n;

                                                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                        final /* synthetic */ ModalBottomSheetState f22247t;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                            super(2, continuation);
                                                            this.f22247t = modalBottomSheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation create(Object obj, Continuation continuation) {
                                                            return new AnonymousClass1(this.f22247t, continuation);
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
                                                            int i2 = this.f22246n;
                                                            if (i2 != 0) {
                                                                if (i2 == 1) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                } else {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                            } else {
                                                                ResultKt.throwOnFailure(obj);
                                                                ModalBottomSheetState modalBottomSheetState = this.f22247t;
                                                                this.f22246n = 1;
                                                                if (modalBottomSheetState.KN(this) == coroutine_suspended) {
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
                                                        if (((Boolean) modalBottomSheetState6.getAnchoredDraggableState().getConfirmValueChange().invoke(ModalBottomSheetValue.f22290O)).booleanValue()) {
                                                            GJW.C.nr(vdVar4, null, null, new AnonymousClass1(modalBottomSheetState6, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }, 1, null);
                                            }
                                        }
                                    }
                                };
                                composerKN.o(objIF4);
                            }
                            modifierNr = SemanticsModifierKt.nr(modifierNr, false, (Function1) objIF4, 1, null);
                            composerKN.Xw();
                        }
                        int i18 = i17 >> 12;
                        SurfaceKt.n(modifierO3.Zmq(modifierNr), shape4, j10, j11, null, f6, ComposableLambdaKt.nr(17396558, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i19) {
                                if (!composer3.HI((i19 & 3) != 2, i19 & 1)) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(17396558, i19, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
                                }
                                Function3 function32 = function3;
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                                int iN3 = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk3 = composer3.Ik();
                                Modifier modifierO4 = ComposedModifierKt.O(composer3, companion4);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0 function0N3 = companion5.n();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer3.T();
                                if (composer3.getInserting()) {
                                    composer3.s7N(function0N3);
                                } else {
                                    composer3.r();
                                }
                                Composer composerN3 = Updater.n(composer3);
                                Updater.O(composerN3, measurePolicyN, companion5.t());
                                Updater.O(composerN3, compositionLocalMapIk3, companion5.O());
                                Function2 function2Rl3 = companion5.rl();
                                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                    composerN3.o(Integer.valueOf(iN3));
                                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                }
                                Updater.O(composerN3, modifierO4, companion5.nr());
                                function32.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, ((i17 >> 9) & 112) | 1572864 | (i18 & 896) | (i18 & 7168) | (i17 & 458752), 16);
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modalBottomSheetState3 = modalBottomSheetStateMUb;
                        composer2 = composerKN;
                        z4 = z3;
                        shape3 = shape4;
                        j6 = j10;
                        j7 = j11;
                        f5 = f6;
                        j9 = j12;
                        modifier2 = modifier4;
                    } else {
                        shape4 = large;
                        f6 = fRl;
                        j10 = jTy;
                        j11 = jRl;
                        z6 = z5;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 4) != 0) {
                        i10 &= -897;
                    }
                    if ((i3 & 16) != 0) {
                        i10 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i10 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i10 &= -29360129;
                    }
                    if ((i3 & 256) != 0) {
                        i10 &= -234881025;
                    }
                    j11 = j3;
                    z6 = false;
                    modalBottomSheetStateMUb = modalBottomSheetState2;
                    f6 = f4;
                    j10 = j5;
                    shape4 = shape2;
                }
                i12 = -92970288;
                jT2 = j4;
                i11 = i10;
                r12 = z6;
                Modifier modifier42 = modifier;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                vdVar = (vd) objIF;
                Orientation orientation2 = Orientation.f16969n;
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion22.HI(), r12);
                iN = ComposablesKt.n(composerKN, r12);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                long j122 = jT2;
                Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifier42);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0 function0N3 = companion32.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyUo3, companion32.t());
                Updater.O(composerN, compositionLocalMapIk3, companion32.O());
                function2Rl = companion32.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO4, companion32.nr());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    Modifier modifierNr2 = Modifier.INSTANCE;
                    int i172 = i11;
                    Modifier modifierJ22 = SizeKt.J2(modifierNr2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyUo22 = BoxKt.Uo(companion22.HI(), false);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                    Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierJ22);
                    Function0 function0N22 = companion32.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyUo22, companion32.t());
                    Updater.O(composerN2, compositionLocalMapIk22, companion32.O());
                    function2Rl2 = companion32.rl();
                    if (!composerN2.getInserting()) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        Updater.O(composerN2, modifierO22, companion32.nr());
                        function2.invoke(composerKN, Integer.valueOf((i172 >> 27) & 14));
                        zE2 = composerKN.E2(modalBottomSheetStateMUb) | composerKN.E2(vdVar);
                        objIF2 = composerKN.iF();
                        if (!zE2) {
                            objIF2 = new Function0<Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1

                                /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1, reason: invalid class name */
                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
                                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                    int f22232n;

                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                    final /* synthetic */ ModalBottomSheetState f22233t;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                        super(2, continuation);
                                        this.f22233t = modalBottomSheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object obj, Continuation continuation) {
                                        return new AnonymousClass1(this.f22233t, continuation);
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
                                        int i2 = this.f22232n;
                                        if (i2 != 0) {
                                            if (i2 == 1) {
                                                ResultKt.throwOnFailure(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            ResultKt.throwOnFailure(obj);
                                            ModalBottomSheetState modalBottomSheetState = this.f22233t;
                                            this.f22232n = 1;
                                            if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
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
                                    if (((Boolean) modalBottomSheetStateMUb.getAnchoredDraggableState().getConfirmValueChange().invoke(ModalBottomSheetValue.f22291n)).booleanValue()) {
                                        GJW.C.nr(vdVar, null, null, new AnonymousClass1(modalBottomSheetStateMUb, null), 3, null);
                                    }
                                }
                            };
                            composerKN.o(objIF2);
                            Function0 function02 = (Function0) objIF2;
                            Object objAYN2 = modalBottomSheetStateMUb.getAnchoredDraggableState().aYN();
                            ModalBottomSheetValue modalBottomSheetValue2 = ModalBottomSheetValue.f22291n;
                            t(j122, function02, objAYN2 == modalBottomSheetValue2, composerKN, (i172 >> 24) & 14);
                            composerKN.XQ();
                            Modifier modifierKN2 = SizeKt.KN(SizeKt.g(boxScopeInstance2.n(modifierNr2, companion22.az()), 0.0f, f22221t, 1, null), 0.0f, 1, null);
                            if (z3) {
                            }
                            if (z3) {
                                Modifier modifierO32 = AnchoredDraggableKt.O(xMQ(modifierKN2.Zmq(modifierRl), modalBottomSheetStateMUb), modalBottomSheetStateMUb.getAnchoredDraggableState(), orientation2, (z3 || modalBottomSheetStateMUb.getAnchoredDraggableState().o() == modalBottomSheetValue2) ? false : true, false, null, false, 56, null);
                                if (z3) {
                                }
                                int i182 = i172 >> 12;
                                SurfaceKt.n(modifierO32.Zmq(modifierNr2), shape4, j10, j11, null, f6, ComposableLambdaKt.nr(17396558, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i19) {
                                        if (!composer3.HI((i19 & 3) != 2, i19 & 1)) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(17396558, i19, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
                                        }
                                        Function3 function32 = function3;
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                                        int iN3 = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk32 = composer3.Ik();
                                        Modifier modifierO42 = ComposedModifierKt.O(composer3, companion4);
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0 function0N32 = companion5.n();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer3.T();
                                        if (composer3.getInserting()) {
                                            composer3.s7N(function0N32);
                                        } else {
                                            composer3.r();
                                        }
                                        Composer composerN3 = Updater.n(composer3);
                                        Updater.O(composerN3, measurePolicyN, companion5.t());
                                        Updater.O(composerN3, compositionLocalMapIk32, companion5.O());
                                        Function2 function2Rl3 = companion5.rl();
                                        if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                            composerN3.o(Integer.valueOf(iN3));
                                            composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                        }
                                        Updater.O(composerN3, modifierO42, companion5.nr());
                                        function32.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, ((i172 >> 9) & 112) | 1572864 | (i182 & 896) | (i182 & 7168) | (i172 & 458752), 16);
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                }
                                modalBottomSheetState3 = modalBottomSheetStateMUb;
                                composer2 = composerKN;
                                z4 = z3;
                                shape3 = shape4;
                                j6 = j10;
                                j7 = j11;
                                f5 = f6;
                                j9 = j122;
                                modifier2 = modifier42;
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i19) {
                        ModalBottomSheetKt.rl(function3, modifier2, modalBottomSheetState3, z4, shape3, f5, j6, j7, j9, function2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        if ((i2 & 1572864) != 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) != 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i10 = i5;
        if (composerKN.HI((306783379 & i10) == 306783378, i10 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final long j2, final Function0 function0, final boolean z2, Composer composer, final int i2) {
        int i3;
        Modifier modifierT;
        Composer composerKN = composer.KN(-526532668);
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
        if (composerKN.HI((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-526532668, i3, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
            }
            if (j2 != 16) {
                composerKN.eF(477792612);
                int i5 = i3;
                final State stateNr = AnimateAsStateKt.nr(z2 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerKN, 48, 28);
                final String strN = Strings_androidKt.n(Strings.INSTANCE.rl(), composerKN, 6);
                if (z2) {
                    composerKN.eF(478010511);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    int i7 = i5 & 112;
                    boolean z3 = i7 == 32;
                    Object objIF = composerKN.iF();
                    if (z3 || objIF == Composer.INSTANCE.n()) {
                        objIF = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0, null);
                        composerKN.o(objIF);
                    }
                    Modifier modifierZmq = companion.Zmq(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objIF), 6, null));
                    boolean zP5 = (i7 == 32) | composerKN.p5(strN);
                    Object objIF2 = composerKN.iF();
                    if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1
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
                                SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                                final Function0 function02 = function0;
                                SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1.1
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
                    composerKN.Xw();
                } else {
                    composerKN.eF(478374234);
                    composerKN.Xw();
                    modifierT = Modifier.INSTANCE;
                }
                Modifier modifierZmq2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null).Zmq(modifierT);
                boolean zP52 = composerKN.p5(stateNr) | ((i5 & 14) == 4);
                Object objIF3 = composerKN.iF();
                if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$1$1
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
                composerKN.Xw();
            } else {
                composerKN.eF(478559490);
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
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$2
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
    public static final float nr(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final Modifier xMQ(Modifier modifier, final ModalBottomSheetState modalBottomSheetState) {
        return AnchoredDraggableKt.KN(modifier, modalBottomSheetState.getAnchoredDraggableState(), Orientation.f16969n, new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<ModalBottomSheetValue>, ? extends ModalBottomSheetValue>>() { // from class: androidx.compose.material.ModalBottomSheetKt$modalBottomSheetAnchors$1

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                    try {
                        iArr[ModalBottomSheetValue.f22291n.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.f22290O.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.f22293t.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<ModalBottomSheetValue>, ? extends ModalBottomSheetValue> invoke(IntSize intSize, Constraints constraints) {
                return n(intSize.getPackedValue(), constraints.getValue());
            }

            public final Pair n(final long j2, long j3) {
                boolean z2;
                final float fGh = Constraints.gh(j3);
                final ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
                DraggableAnchors draggableAnchorsN = AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<ModalBottomSheetValue>, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$modalBottomSheetAnchors$1$newAnchors$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<ModalBottomSheetValue> draggableAnchorsConfig) {
                        n(draggableAnchorsConfig);
                        return Unit.INSTANCE;
                    }

                    public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                        draggableAnchorsConfig.n(ModalBottomSheetValue.f22291n, fGh);
                        float f3 = fGh / 2.0f;
                        if (!modalBottomSheetState2.getIsSkipHalfExpanded() && IntSize.J2(j2) > f3) {
                            draggableAnchorsConfig.n(ModalBottomSheetValue.f22290O, f3);
                        }
                        if (IntSize.J2(j2) != 0) {
                            draggableAnchorsConfig.n(ModalBottomSheetValue.f22293t, Math.max(0.0f, fGh - IntSize.J2(j2)));
                        }
                    }
                });
                if (modalBottomSheetState.getAnchoredDraggableState().HI().getSize() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ModalBottomSheetValue modalBottomSheetValueO = modalBottomSheetState.O();
                if (z2 || !draggableAnchorsN.nr(modalBottomSheetValueO)) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[modalBottomSheetState.Uo().ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f22290O;
                        if (!draggableAnchorsN.nr(modalBottomSheetValue)) {
                            modalBottomSheetValue = ModalBottomSheetValue.f22293t;
                            if (!draggableAnchorsN.nr(modalBottomSheetValue)) {
                                modalBottomSheetValue = ModalBottomSheetValue.f22291n;
                            }
                        }
                        modalBottomSheetValueO = modalBottomSheetValue;
                    } else {
                        modalBottomSheetValueO = ModalBottomSheetValue.f22291n;
                    }
                }
                return TuplesKt.to(draggableAnchorsN, modalBottomSheetValueO);
            }
        });
    }
}
