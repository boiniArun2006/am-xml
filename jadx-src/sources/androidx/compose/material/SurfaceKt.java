package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ac\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0087\u0001\u0010\u0016\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u008f\u0001\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0095\u0001\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00122\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u001c2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a8\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a,\u0010&\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\tH\u0003ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "contentColor", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "rl", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "t", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "nr", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Uo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/ElevationOverlay;", "elevationOverlay", "absoluteElevation", "KN", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,488:1\n149#2:489\n149#2:492\n149#2:495\n149#2:498\n75#3:490\n75#3:493\n75#3:496\n75#3:499\n51#4:491\n51#4:494\n51#4:497\n51#4:500\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n*L\n101#1:489\n206#1:492\n316#1:495\n427#1:498\n104#1:490\n210#1:493\n320#1:496\n431#1:499\n104#1:491\n210#1:494\n320#1:497\n431#1:500\n*E\n"})
public final class SurfaceKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier Uo(Modifier modifier, Shape shape, long j2, BorderStroke borderStroke, float f3) {
        Modifier modifierRl = ShadowKt.rl(modifier, f3, shape, false, 0L, 0L, 24, null);
        Modifier modifierO = Modifier.INSTANCE;
        if (borderStroke != null) {
            modifierO = BorderKt.O(modifierO, borderStroke, shape);
        }
        return ClipKt.n(BackgroundKt.t(modifierRl.Zmq(modifierO), j2, shape), shape);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, Shape shape, long j2, long j3, BorderStroke borderStroke, float f3, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Shape shapeN;
        long jTy;
        long jRl;
        int i7;
        BorderStroke borderStroke2;
        int i8;
        float f4;
        final Modifier modifier2;
        final Shape shape2;
        final long j4;
        final BorderStroke borderStroke3;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        final float fKN;
        final Shape shape3;
        final long j5;
        final BorderStroke borderStroke4;
        Composer composerKN = composer.KN(1412203386);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                shapeN = shape;
                i5 |= composerKN.p5(shapeN) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    jTy = j2;
                    int i11 = composerKN.nr(jTy) ? 256 : 128;
                    i5 |= i11;
                } else {
                    jTy = j2;
                }
                i5 |= i11;
            } else {
                jTy = j2;
            }
            if ((i2 & 3072) != 0) {
                jRl = j3;
                i5 |= ((i3 & 8) == 0 && composerKN.nr(jRl)) ? 2048 : 1024;
            } else {
                jRl = j3;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    borderStroke2 = borderStroke;
                    i5 |= composerKN.p5(borderStroke2) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        f4 = f3;
                        i5 |= composerKN.rl(f4) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.E2(function2) ? 1048576 : 524288;
                    }
                    if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
                        composerKN.wTp();
                        modifier2 = modifier;
                        shape2 = shapeN;
                        j4 = jTy;
                        borderStroke3 = borderStroke2;
                        f5 = f4;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            Modifier modifier3 = i9 != 0 ? Modifier.INSTANCE : modifier;
                            if (i10 != 0) {
                                shapeN = RectangleShapeKt.n();
                            }
                            if ((i3 & 4) != 0) {
                                jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                                i5 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jRl = ColorsKt.rl(jTy, composerKN, (i5 >> 6) & 14);
                                i5 &= -7169;
                            }
                            if (i7 != 0) {
                                borderStroke2 = null;
                            }
                            if (i8 != 0) {
                                modifier2 = modifier3;
                                fKN = Dp.KN(0);
                                shape3 = shapeN;
                                j5 = jTy;
                                borderStroke4 = borderStroke2;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1412203386, i5, -1, "androidx.compose.material.Surface (Surface.kt:102)");
                                }
                                final float fKN2 = Dp.KN(((Dp) composerKN.ty(ElevationOverlayKt.t())).getValue() + fKN);
                                CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(jRl)), ElevationOverlayKt.t().nr(Dp.nr(fKN2))}, ComposableLambdaKt.nr(-1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                    static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

                                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                                        int f23112n;

                                        AnonymousClass2(Continuation continuation) {
                                            super(2, continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation create(Object obj, Continuation continuation) {
                                            return new AnonymousClass2(continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                                            return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            if (this.f23112n == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                return Unit.INSTANCE;
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        n(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer2, int i12) {
                                        if (!composer2.HI((i12 & 3) != 2, i12 & 1)) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1822160838, i12, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:108)");
                                        }
                                        Modifier modifierZmq = SemanticsModifierKt.t(SurfaceKt.Uo(modifier2, shape3, SurfaceKt.KN(j5, (ElevationOverlay) composer2.ty(ElevationOverlayKt.nr()), fKN2, composer2, 0), borderStroke4, fKN), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.D(semanticsPropertyReceiver, true);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                n(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }
                                        }).Zmq(new SuspendPointerInputElement(Unit.INSTANCE, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new AnonymousClass2(null)), 6, null));
                                        Function2 function22 = function2;
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                                        int iN = ComposablesKt.n(composer2, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer2, modifierZmq);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0 function0N = companion.n();
                                        if (composer2.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer2.T();
                                        if (composer2.getInserting()) {
                                            composer2.s7N(function0N);
                                        } else {
                                            composer2.r();
                                        }
                                        Composer composerN = Updater.n(composer2);
                                        Updater.O(composerN, measurePolicyUo, companion.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                                        Function2 function2Rl = companion.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion.nr());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                        function22.invoke(composer2, 0);
                                        composer2.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                shape2 = shape3;
                                j4 = j5;
                                borderStroke3 = borderStroke4;
                                f5 = fKN;
                            } else {
                                modifier2 = modifier3;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            modifier2 = modifier;
                        }
                        shape3 = shapeN;
                        j5 = jTy;
                        borderStroke4 = borderStroke2;
                        fKN = f4;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        final float fKN22 = Dp.KN(((Dp) composerKN.ty(ElevationOverlayKt.t())).getValue() + fKN);
                        CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(jRl)), ElevationOverlayKt.t().nr(Dp.nr(fKN22))}, ComposableLambdaKt.nr(-1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                int f23112n;

                                AnonymousClass2(Continuation continuation) {
                                    super(2, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    return new AnonymousClass2(continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                                    return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.f23112n == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i12) {
                                if (!composer2.HI((i12 & 3) != 2, i12 & 1)) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1822160838, i12, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:108)");
                                }
                                Modifier modifierZmq = SemanticsModifierKt.t(SurfaceKt.Uo(modifier2, shape3, SurfaceKt.KN(j5, (ElevationOverlay) composer2.ty(ElevationOverlayKt.nr()), fKN22, composer2, 0), borderStroke4, fKN), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.D(semanticsPropertyReceiver, true);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }
                                }).Zmq(new SuspendPointerInputElement(Unit.INSTANCE, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new AnonymousClass2(null)), 6, null));
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                                int iN = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierZmq);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion.n();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer2.T();
                                if (composer2.getInserting()) {
                                    composer2.s7N(function0N);
                                } else {
                                    composer2.r();
                                }
                                Composer composerN = Updater.n(composer2);
                                Updater.O(composerN, measurePolicyUo, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                Function2 function2Rl = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function22.invoke(composer2, 0);
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                        if (ComposerKt.v()) {
                        }
                        shape2 = shape3;
                        j4 = j5;
                        borderStroke3 = borderStroke4;
                        f5 = fKN;
                    }
                    final long j6 = jRl;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        final Modifier modifier4 = modifier2;
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i12) {
                                SurfaceKt.n(modifier4, shape2, j4, j6, borderStroke3, f5, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                f4 = f3;
                if ((i3 & 64) == 0) {
                }
                if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
                }
                final long j62 = jRl;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            borderStroke2 = borderStroke;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            f4 = f3;
            if ((i3 & 64) == 0) {
            }
            if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
            }
            final long j622 = jRl;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        shapeN = shape;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        borderStroke2 = borderStroke;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        f4 = f3;
        if ((i3 & 64) == 0) {
        }
        if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
        }
        final long j6222 = jRl;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final boolean z2, final Function1 function1, Modifier modifier, boolean z3, Shape shape, long j2, long j3, BorderStroke borderStroke, float f3, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function1 function12;
        int i8;
        Modifier modifier2;
        int i9;
        boolean z4;
        int i10;
        Shape shape2;
        int i11;
        BorderStroke borderStroke2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final long j4;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z5;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final long j5;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeGh;
        long jTy;
        long jRl;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier4;
        final float f5;
        final Shape shape4;
        final long j6;
        final boolean z6;
        final BorderStroke borderStroke4;
        int i17;
        Composer composerKN = composer.KN(1341569296);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function12 = function1;
                i7 |= composerKN.E2(function12) ? 32 : 16;
            }
            i8 = i5 & 4;
            if (i8 == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z4 = z3;
                        i7 |= composerKN.n(z4) ? 2048 : 1024;
                    }
                    i10 = i5 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            shape2 = shape;
                            i7 |= composerKN.p5(shape2) ? 16384 : 8192;
                        }
                        if ((196608 & i2) == 0) {
                            i7 |= ((i5 & 32) == 0 && composerKN.nr(j2)) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i7 |= ((i5 & 64) == 0 && composerKN.nr(j3)) ? 1048576 : 524288;
                        }
                        i11 = i5 & 128;
                        if (i11 != 0) {
                            i7 |= 12582912;
                            borderStroke2 = borderStroke;
                        } else {
                            borderStroke2 = borderStroke;
                            if ((i2 & 12582912) == 0) {
                                i7 |= composerKN.p5(borderStroke2) ? 8388608 : 4194304;
                            }
                        }
                        i12 = i5 & 256;
                        if (i12 != 0) {
                            i7 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i13 = i12;
                                i7 |= composerKN.rl(f3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            i14 = i5 & 512;
                            if (i14 != 0) {
                                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i15 = i14;
                                    i7 |= composerKN.p5(mutableInteractionSource) ? 536870912 : 268435456;
                                }
                                if ((i5 & 1024) != 0) {
                                    i16 = i3 | 6;
                                } else if ((i3 & 6) == 0) {
                                    i16 = i3 | (composerKN.E2(function2) ? 4 : 2);
                                } else {
                                    i16 = i3;
                                }
                                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier5 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i9 != 0) {
                                            z4 = true;
                                        }
                                        Shape shapeN = i10 != 0 ? RectangleShapeKt.n() : shape2;
                                        if ((i5 & 32) != 0) {
                                            jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                                            i7 &= -458753;
                                        } else {
                                            jTy = j2;
                                        }
                                        if ((i5 & 64) != 0) {
                                            jRl = ColorsKt.rl(jTy, composerKN, (i7 >> 15) & 14);
                                            i7 = (-3670017) & i7;
                                        } else {
                                            jRl = j3;
                                        }
                                        if (i11 != 0) {
                                            borderStroke2 = null;
                                        }
                                        float fKN = i13 != 0 ? Dp.KN(0) : f3;
                                        if (i15 != 0) {
                                            modifier4 = modifier5;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            modifier4 = modifier5;
                                        }
                                        f5 = fKN;
                                        shape4 = shapeN;
                                        j6 = jTy;
                                        z6 = z4;
                                        borderStroke4 = borderStroke2;
                                        i17 = 1341569296;
                                    } else {
                                        composerKN.wTp();
                                        if ((i5 & 32) != 0) {
                                            i7 &= -458753;
                                        }
                                        if ((i5 & 64) != 0) {
                                            i7 &= -3670017;
                                        }
                                        j6 = j2;
                                        f5 = f3;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier4 = modifier2;
                                        z6 = z4;
                                        shape4 = shape2;
                                        borderStroke4 = borderStroke2;
                                        i17 = 1341569296;
                                        jRl = j3;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(i17, i7, i16, "androidx.compose.material.Surface (Surface.kt:429)");
                                    }
                                    final float fKN2 = Dp.KN(((Dp) composerKN.ty(ElevationOverlayKt.t())).getValue() + f5);
                                    final Function1 function13 = function12;
                                    CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(jRl)), ElevationOverlayKt.t().nr(Dp.nr(fKN2))}, ComposableLambdaKt.nr(-311657392, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            n(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer2, int i18) {
                                            if (!composer2.HI((i18 & 3) != 2, i18 & 1)) {
                                                composer2.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-311657392, i18, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:435)");
                                            }
                                            Modifier modifierRl = ToggleableKt.rl(SurfaceKt.Uo(InteractiveComponentSizeKt.t(modifier4), shape4, SurfaceKt.KN(j6, (ElevationOverlay) composer2.ty(ElevationOverlayKt.nr()), fKN2, composer2, 0), borderStroke4, f5), z2, mutableInteractionSource3, RippleKt.J2(false, 0.0f, 0L, 7, null), z6, null, function13, 16, null);
                                            Function2 function22 = function2;
                                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                                            int iN = ComposablesKt.n(composer2, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer2, modifierRl);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0 function0N = companion.n();
                                            if (composer2.getApplier() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer2.T();
                                            if (composer2.getInserting()) {
                                                composer2.s7N(function0N);
                                            } else {
                                                composer2.r();
                                            }
                                            Composer composerN = Updater.n(composer2);
                                            Updater.O(composerN, measurePolicyUo, companion.t());
                                            Updater.O(composerN, compositionLocalMapIk, companion.O());
                                            Function2 function2Rl = companion.rl();
                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                composerN.o(Integer.valueOf(iN));
                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                            }
                                            Updater.O(composerN, modifierO, companion.nr());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                            function22.invoke(composer2, 0);
                                            composer2.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    j5 = jRl;
                                    modifier3 = modifier4;
                                    shape3 = shape4;
                                    j4 = j6;
                                    borderStroke3 = borderStroke4;
                                    f4 = f5;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    z5 = z6;
                                } else {
                                    composerKN.wTp();
                                    j4 = j2;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    z5 = z4;
                                    shape3 = shape2;
                                    borderStroke3 = borderStroke2;
                                    j5 = j3;
                                    f4 = f3;
                                }
                                scopeUpdateScopeGh = composerKN.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$8
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            n(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer2, int i18) {
                                            SurfaceKt.nr(z2, function1, modifier3, z5, shape3, j4, j5, borderStroke3, f4, mutableInteractionSource2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            i15 = i14;
                            if ((i5 & 1024) != 0) {
                            }
                            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
                            }
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i5 & 512;
                        if (i14 != 0) {
                        }
                        i15 = i14;
                        if ((i5 & 1024) != 0) {
                        }
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    shape2 = shape;
                    if ((196608 & i2) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    i11 = i5 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    if ((i5 & 1024) != 0) {
                    }
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z3;
                i10 = i5 & 16;
                if (i10 == 0) {
                }
                shape2 = shape;
                if ((196608 & i2) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i5 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                if ((i5 & 1024) != 0) {
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i9 = i5 & 8;
            if (i9 != 0) {
            }
            z4 = z3;
            i10 = i5 & 16;
            if (i10 == 0) {
            }
            shape2 = shape;
            if ((196608 & i2) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            if ((i5 & 1024) != 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function12 = function1;
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        modifier2 = modifier;
        i9 = i5 & 8;
        if (i9 != 0) {
        }
        z4 = z3;
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        shape2 = shape;
        if ((196608 & i2) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        if ((i5 & 1024) != 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function0 function0, Modifier modifier, boolean z2, Shape shape, long j2, long j3, BorderStroke borderStroke, float f3, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        Shape shapeN;
        long jTy;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape2;
        final long j4;
        final long j5;
        final BorderStroke borderStroke2;
        final float f4;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope scopeUpdateScopeGh;
        long jRl;
        final MutableInteractionSource mutableInteractionSource3;
        final BorderStroke borderStroke3;
        final float f5;
        final boolean z5;
        final Shape shape3;
        long j6;
        final long j7;
        Composer composerKN = composer.KN(1560876237);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        shapeN = shape;
                        i5 |= composerKN.p5(shapeN) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            jTy = j2;
                            int i16 = composerKN.nr(jTy) ? 16384 : 8192;
                            i5 |= i16;
                        } else {
                            jTy = j2;
                        }
                        i5 |= i16;
                    } else {
                        jTy = j2;
                    }
                    if ((196608 & i2) != 0) {
                        i9 = i5 | (((i3 & 32) == 0 && composerKN.nr(j3)) ? 131072 : 65536);
                    } else {
                        i9 = i5;
                    }
                    i10 = i3 & 64;
                    if (i10 == 0) {
                        i9 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i9 |= composerKN.p5(borderStroke) ? 1048576 : 524288;
                    }
                    i11 = i3 & 128;
                    if (i11 == 0) {
                        i9 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i12 = i11;
                            i9 |= composerKN.rl(f3) ? 8388608 : 4194304;
                        }
                        i13 = i3 & 256;
                        if (i13 != 0) {
                            i9 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i14 = i13;
                                i9 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i3 & 512) != 0) {
                                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i9 |= composerKN.E2(function2) ? 536870912 : 268435456;
                                }
                                if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        if (i15 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            z3 = true;
                                        }
                                        if (i8 != 0) {
                                            shapeN = RectangleShapeKt.n();
                                        }
                                        if ((i3 & 16) != 0) {
                                            jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                                            i9 &= -57345;
                                        }
                                        if ((i3 & 32) != 0) {
                                            jRl = ColorsKt.rl(jTy, composerKN, (i9 >> 12) & 14);
                                            i9 &= -458753;
                                        } else {
                                            jRl = j3;
                                        }
                                        BorderStroke borderStroke4 = i10 != 0 ? null : borderStroke;
                                        float fKN = i12 != 0 ? Dp.KN(0) : f3;
                                        mutableInteractionSource3 = i14 != 0 ? null : mutableInteractionSource;
                                        borderStroke3 = borderStroke4;
                                        f5 = fKN;
                                        z5 = z3;
                                        shape3 = shapeN;
                                        j6 = jRl;
                                        j7 = jTy;
                                    } else {
                                        composerKN.wTp();
                                        if ((i3 & 16) != 0) {
                                            i9 &= -57345;
                                        }
                                        if ((i3 & 32) != 0) {
                                            i9 &= -458753;
                                        }
                                        borderStroke3 = borderStroke;
                                        f5 = f3;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        z5 = z3;
                                        shape3 = shapeN;
                                        j7 = jTy;
                                        j6 = j3;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1560876237, i9, -1, "androidx.compose.material.Surface (Surface.kt:208)");
                                    }
                                    final float fKN2 = Dp.KN(((Dp) composerKN.ty(ElevationOverlayKt.t())).getValue() + f5);
                                    final Modifier modifier4 = modifier2;
                                    CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(j6)), ElevationOverlayKt.t().nr(Dp.nr(fKN2))}, ComposableLambdaKt.nr(2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            n(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer2, int i17) {
                                            if (!composer2.HI((i17 & 3) != 2, i17 & 1)) {
                                                composer2.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(2031491085, i17, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:214)");
                                            }
                                            Modifier modifierNr = ClickableKt.nr(SurfaceKt.Uo(InteractiveComponentSizeKt.t(modifier4), shape3, SurfaceKt.KN(j7, (ElevationOverlay) composer2.ty(ElevationOverlayKt.nr()), fKN2, composer2, 0), borderStroke3, f5), mutableInteractionSource3, RippleKt.J2(false, 0.0f, 0L, 7, null), z5, null, null, function0, 24, null);
                                            Function2 function22 = function2;
                                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                                            int iN = ComposablesKt.n(composer2, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer2, modifierNr);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0 function0N = companion.n();
                                            if (composer2.getApplier() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer2.T();
                                            if (composer2.getInserting()) {
                                                composer2.s7N(function0N);
                                            } else {
                                                composer2.r();
                                            }
                                            Composer composerN = Updater.n(composer2);
                                            Updater.O(composerN, measurePolicyUo, companion.t());
                                            Updater.O(composerN, compositionLocalMapIk, companion.O());
                                            Function2 function2Rl = companion.rl();
                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                composerN.o(Integer.valueOf(iN));
                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                            }
                                            Updater.O(composerN, modifierO, companion.nr());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                            function22.invoke(composer2, 0);
                                            composer2.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    j5 = j6;
                                    modifier3 = modifier4;
                                    shape2 = shape3;
                                    j4 = j7;
                                    borderStroke2 = borderStroke3;
                                    f4 = f5;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    z4 = z5;
                                } else {
                                    composerKN.wTp();
                                    modifier3 = modifier2;
                                    z4 = z3;
                                    shape2 = shapeN;
                                    j4 = jTy;
                                    j5 = j3;
                                    borderStroke2 = borderStroke;
                                    f4 = f3;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                scopeUpdateScopeGh = composerKN.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            n(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer2, int i17) {
                                            SurfaceKt.rl(function0, modifier3, z4, shape2, j4, j5, borderStroke2, f4, mutableInteractionSource2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                            }
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i14 = i13;
                        if ((i3 & 512) != 0) {
                        }
                        if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i12 = i11;
                    i13 = i3 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    if ((i3 & 512) != 0) {
                    }
                    if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                shapeN = shape;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                i10 = i3 & 64;
                if (i10 == 0) {
                }
                i11 = i3 & 128;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i3 & 256;
                if (i13 != 0) {
                }
                i14 = i13;
                if ((i3 & 512) != 0) {
                }
                if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            shapeN = shape;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            i11 = i3 & 128;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i3 & 256;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i3 & 512) != 0) {
            }
            if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        shapeN = shape;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        i11 = i3 & 128;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i3 & 256;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i3 & 512) != 0) {
        }
        if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final boolean z2, final Function0 function0, Modifier modifier, boolean z3, Shape shape, long j2, long j3, BorderStroke borderStroke, float f3, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function0 function02;
        int i8;
        Modifier modifier2;
        int i9;
        boolean z4;
        int i10;
        Shape shape2;
        int i11;
        BorderStroke borderStroke2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final long j4;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z5;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final long j5;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeGh;
        long jTy;
        long jRl;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier4;
        final float f5;
        final Shape shape4;
        final long j6;
        final boolean z6;
        final BorderStroke borderStroke4;
        int i17;
        Composer composerKN = composer.KN(262027249);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function02 = function0;
                i7 |= composerKN.E2(function02) ? 32 : 16;
            }
            i8 = i5 & 4;
            if (i8 == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z4 = z3;
                        i7 |= composerKN.n(z4) ? 2048 : 1024;
                    }
                    i10 = i5 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            shape2 = shape;
                            i7 |= composerKN.p5(shape2) ? 16384 : 8192;
                        }
                        if ((196608 & i2) == 0) {
                            i7 |= ((i5 & 32) == 0 && composerKN.nr(j2)) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i7 |= ((i5 & 64) == 0 && composerKN.nr(j3)) ? 1048576 : 524288;
                        }
                        i11 = i5 & 128;
                        if (i11 != 0) {
                            i7 |= 12582912;
                            borderStroke2 = borderStroke;
                        } else {
                            borderStroke2 = borderStroke;
                            if ((i2 & 12582912) == 0) {
                                i7 |= composerKN.p5(borderStroke2) ? 8388608 : 4194304;
                            }
                        }
                        i12 = i5 & 256;
                        if (i12 != 0) {
                            i7 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i13 = i12;
                                i7 |= composerKN.rl(f3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            i14 = i5 & 512;
                            if (i14 != 0) {
                                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i15 = i14;
                                    i7 |= composerKN.p5(mutableInteractionSource) ? 536870912 : 268435456;
                                }
                                if ((i5 & 1024) != 0) {
                                    i16 = i3 | 6;
                                } else if ((i3 & 6) == 0) {
                                    i16 = i3 | (composerKN.E2(function2) ? 4 : 2);
                                } else {
                                    i16 = i3;
                                }
                                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier5 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i9 != 0) {
                                            z4 = true;
                                        }
                                        Shape shapeN = i10 != 0 ? RectangleShapeKt.n() : shape2;
                                        if ((i5 & 32) != 0) {
                                            jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                                            i7 &= -458753;
                                        } else {
                                            jTy = j2;
                                        }
                                        if ((i5 & 64) != 0) {
                                            jRl = ColorsKt.rl(jTy, composerKN, (i7 >> 15) & 14);
                                            i7 = (-3670017) & i7;
                                        } else {
                                            jRl = j3;
                                        }
                                        if (i11 != 0) {
                                            borderStroke2 = null;
                                        }
                                        float fKN = i13 != 0 ? Dp.KN(0) : f3;
                                        if (i15 != 0) {
                                            modifier4 = modifier5;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            modifier4 = modifier5;
                                        }
                                        f5 = fKN;
                                        shape4 = shapeN;
                                        j6 = jTy;
                                        z6 = z4;
                                        borderStroke4 = borderStroke2;
                                        i17 = 262027249;
                                    } else {
                                        composerKN.wTp();
                                        if ((i5 & 32) != 0) {
                                            i7 &= -458753;
                                        }
                                        if ((i5 & 64) != 0) {
                                            i7 &= -3670017;
                                        }
                                        j6 = j2;
                                        f5 = f3;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier4 = modifier2;
                                        z6 = z4;
                                        shape4 = shape2;
                                        borderStroke4 = borderStroke2;
                                        i17 = 262027249;
                                        jRl = j3;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(i17, i7, i16, "androidx.compose.material.Surface (Surface.kt:318)");
                                    }
                                    final float fKN2 = Dp.KN(((Dp) composerKN.ty(ElevationOverlayKt.t())).getValue() + f5);
                                    final Function0 function03 = function02;
                                    CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(jRl)), ElevationOverlayKt.t().nr(Dp.nr(fKN2))}, ComposableLambdaKt.nr(-1391199439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            n(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer2, int i18) {
                                            if (!composer2.HI((i18 & 3) != 2, i18 & 1)) {
                                                composer2.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1391199439, i18, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:324)");
                                            }
                                            Modifier modifierRl = SelectableKt.rl(SurfaceKt.Uo(InteractiveComponentSizeKt.t(modifier4), shape4, SurfaceKt.KN(j6, (ElevationOverlay) composer2.ty(ElevationOverlayKt.nr()), fKN2, composer2, 0), borderStroke4, f5), z2, mutableInteractionSource3, RippleKt.J2(false, 0.0f, 0L, 7, null), z6, null, function03, 16, null);
                                            Function2 function22 = function2;
                                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                                            int iN = ComposablesKt.n(composer2, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer2, modifierRl);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0 function0N = companion.n();
                                            if (composer2.getApplier() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer2.T();
                                            if (composer2.getInserting()) {
                                                composer2.s7N(function0N);
                                            } else {
                                                composer2.r();
                                            }
                                            Composer composerN = Updater.n(composer2);
                                            Updater.O(composerN, measurePolicyUo, companion.t());
                                            Updater.O(composerN, compositionLocalMapIk, companion.O());
                                            Function2 function2Rl = companion.rl();
                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                composerN.o(Integer.valueOf(iN));
                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                            }
                                            Updater.O(composerN, modifierO, companion.nr());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                            function22.invoke(composer2, 0);
                                            composer2.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    j5 = jRl;
                                    modifier3 = modifier4;
                                    shape3 = shape4;
                                    j4 = j6;
                                    borderStroke3 = borderStroke4;
                                    f4 = f5;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    z5 = z6;
                                } else {
                                    composerKN.wTp();
                                    j4 = j2;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    z5 = z4;
                                    shape3 = shape2;
                                    borderStroke3 = borderStroke2;
                                    j5 = j3;
                                    f4 = f3;
                                }
                                scopeUpdateScopeGh = composerKN.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            n(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer2, int i18) {
                                            SurfaceKt.t(z2, function0, modifier3, z5, shape3, j4, j5, borderStroke3, f4, mutableInteractionSource2, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            i15 = i14;
                            if ((i5 & 1024) != 0) {
                            }
                            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
                            }
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i5 & 512;
                        if (i14 != 0) {
                        }
                        i15 = i14;
                        if ((i5 & 1024) != 0) {
                        }
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    shape2 = shape;
                    if ((196608 & i2) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    i11 = i5 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    if ((i5 & 1024) != 0) {
                    }
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z3;
                i10 = i5 & 16;
                if (i10 == 0) {
                }
                shape2 = shape;
                if ((196608 & i2) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i5 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                if ((i5 & 1024) != 0) {
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i9 = i5 & 8;
            if (i9 != 0) {
            }
            z4 = z3;
            i10 = i5 & 16;
            if (i10 == 0) {
            }
            shape2 = shape;
            if ((196608 & i2) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            if ((i5 & 1024) != 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function02 = function0;
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        modifier2 = modifier;
        i9 = i5 & 8;
        if (i9 != 0) {
        }
        z4 = z3;
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        shape2 = shape;
        if ((196608 & i2) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        if ((i5 & 1024) != 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KN(long j2, ElevationOverlay elevationOverlay, float f3, Composer composer, int i2) {
        long jN;
        if (ComposerKt.v()) {
            ComposerKt.p5(1561611256, i2, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:480)");
        }
        if (Color.HI(j2, MaterialTheme.f22169n.n(composer, 6).ty()) && elevationOverlay != null) {
            composer.eF(1082922676);
            jN = elevationOverlay.n(j2, f3, composer, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896));
            composer.Xw();
        } else {
            composer.eF(1082990783);
            composer.Xw();
            jN = j2;
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jN;
    }
}
