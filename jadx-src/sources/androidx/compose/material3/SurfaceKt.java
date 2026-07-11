package androidx.compose.material3;

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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001am\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0091\u0001\u0010\u0017\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0099\u0001\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009f\u0001\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00132\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u001d2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a8\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\"\u0010&\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070(8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "nr", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "selected", "rl", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "t", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "KN", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "elevation", "xMQ", "(JFLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Uo", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAbsoluteTonalElevation", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,475:1\n148#2:476\n148#2:477\n148#2:480\n148#2:481\n148#2:484\n148#2:485\n148#2:488\n148#2:489\n77#3:478\n77#3:482\n77#3:486\n77#3:490\n50#4:479\n50#4:483\n50#4:487\n50#4:491\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n*L\n99#1:476\n100#1:477\n199#1:480\n200#1:481\n302#1:484\n303#1:485\n406#1:488\n407#1:489\n104#1:478\n205#1:482\n308#1:486\n412#1:490\n104#1:479\n205#1:483\n308#1:487\n412#1:491\n*E\n"})
public final class SurfaceKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f27934n = CompositionLocalKt.O(null, new Function0<Dp>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        public final float n() {
            return Dp.KN(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Dp invoke() {
            return Dp.nr(n());
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier KN(Modifier modifier, Shape shape, long j2, BorderStroke borderStroke, float f3) {
        Shape shape2;
        Modifier modifierT;
        if (f3 > 0.0f) {
            shape2 = shape;
            modifierT = GraphicsLayerModifierKt.t(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f3, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape2, false, null, 0L, 0L, 0, 124895, null);
        } else {
            shape2 = shape;
            modifierT = Modifier.INSTANCE;
        }
        return ClipKt.n(BackgroundKt.t(modifier.Zmq(modifierT).Zmq(borderStroke != null ? BorderKt.O(Modifier.INSTANCE, borderStroke, shape2) : Modifier.INSTANCE), j2, shape2), shape2);
    }

    public static final ProvidableCompositionLocal Uo() {
        return f27934n;
    }

    public static final void n(Modifier modifier, Shape shape, long j2, long j3, float f3, float f4, BorderStroke borderStroke, final Function2 function2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            shape = RectangleShapeKt.n();
        }
        if ((i3 & 4) != 0) {
            j2 = MaterialTheme.f26164n.n(composer, 6).getSurface();
        }
        if ((i3 & 8) != 0) {
            j3 = ColorSchemeKt.t(j2, composer, (i2 >> 6) & 14);
        }
        if ((i3 & 16) != 0) {
            f3 = Dp.KN(0);
        }
        if ((i3 & 32) != 0) {
            f4 = Dp.KN(0);
        }
        if ((i3 & 64) != 0) {
            borderStroke = null;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-513881741, i2, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        ProvidableCompositionLocal providableCompositionLocal = f27934n;
        final float fKN = Dp.KN(((Dp) composer.ty(providableCompositionLocal)).getValue() + f3);
        ProvidedValue[] providedValueArr = {ContentColorKt.n().nr(Color.xMQ(j3)), providableCompositionLocal.nr(Dp.nr(fKN))};
        final long j4 = j2;
        final Shape shape2 = shape;
        final BorderStroke borderStroke2 = borderStroke;
        final float f5 = f4;
        final Modifier modifier2 = modifier;
        CompositionLocalKt.t(providedValueArr, ComposableLambdaKt.nr(-70914509, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX INFO: renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f27943n;

                AnonymousClass3(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass3(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                    return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f27943n == 0) {
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

            public final void n(Composer composer2, int i5) {
                if ((i5 & 3) == 2 && composer2.xMQ()) {
                    composer2.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-70914509, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
                }
                Modifier modifierZmq = SemanticsModifierKt.t(SurfaceKt.KN(modifier2, shape2, SurfaceKt.xMQ(j4, fKN, composer2, 0), borderStroke2, ((Density) composer2.ty(CompositionLocalsKt.J2())).l(f5)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.D(semanticsPropertyReceiver, true);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                }).Zmq(new SuspendPointerInputElement(Unit.INSTANCE, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new AnonymousClass3(null)), 6, null));
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
        }, composer, 54), composer, ProvidedValue.xMQ | 48);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void nr(final Function0 function0, Modifier modifier, boolean z2, Shape shape, long j2, long j3, float f3, float f4, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, int i2, int i3, int i5) {
        final Modifier modifier2 = (i5 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z3 = (i5 & 4) != 0 ? true : z2;
        final Shape shapeN = (i5 & 8) != 0 ? RectangleShapeKt.n() : shape;
        final long surface = (i5 & 16) != 0 ? MaterialTheme.f26164n.n(composer, 6).getSurface() : j2;
        long jT2 = (i5 & 32) != 0 ? ColorSchemeKt.t(surface, composer, (i2 >> 12) & 14) : j3;
        float fKN = (i5 & 64) != 0 ? Dp.KN(0) : f3;
        final float fKN2 = (i5 & 128) != 0 ? Dp.KN(0) : f4;
        BorderStroke borderStroke2 = (i5 & 256) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i5 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.v()) {
            ComposerKt.p5(-789752804, i2, i3, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        ProvidableCompositionLocal providableCompositionLocal = f27934n;
        final float fKN3 = Dp.KN(((Dp) composer.ty(providableCompositionLocal)).getValue() + fKN);
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(jT2)), providableCompositionLocal.nr(Dp.nr(fKN3))}, ComposableLambdaKt.nr(1279702876, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
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
                if ((i7 & 3) == 2 && composer2.xMQ()) {
                    composer2.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1279702876, i7, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
                }
                Modifier modifierNr = ClickableKt.nr(SurfaceKt.KN(InteractiveComponentSizeKt.rl(modifier2), shapeN, SurfaceKt.xMQ(surface, fKN3, composer2, 0), borderStroke3, ((Density) composer2.ty(CompositionLocalsKt.J2())).l(fKN2)), mutableInteractionSource3, RippleKt.nr(false, 0.0f, 0L, composer2, 0, 7), z3, null, null, function0, 24, null);
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
        }, composer, 54), composer, ProvidedValue.xMQ | 48);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void rl(final boolean z2, final Function0 function0, Modifier modifier, boolean z3, Shape shape, long j2, long j3, float f3, float f4, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, int i2, int i3, int i5) {
        final Modifier modifier2 = (i5 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z4 = (i5 & 8) != 0 ? true : z3;
        final Shape shapeN = (i5 & 16) != 0 ? RectangleShapeKt.n() : shape;
        final long surface = (i5 & 32) != 0 ? MaterialTheme.f26164n.n(composer, 6).getSurface() : j2;
        long jT2 = (i5 & 64) != 0 ? ColorSchemeKt.t(surface, composer, (i2 >> 15) & 14) : j3;
        float fKN = (i5 & 128) != 0 ? Dp.KN(0) : f3;
        final float fKN2 = (i5 & 256) != 0 ? Dp.KN(0) : f4;
        BorderStroke borderStroke2 = (i5 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i5 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.v()) {
            ComposerKt.p5(540296512, i2, i3, "androidx.compose.material3.Surface (Surface.kt:306)");
        }
        ProvidableCompositionLocal providableCompositionLocal = f27934n;
        final float fKN3 = Dp.KN(((Dp) composer.ty(providableCompositionLocal)).getValue() + fKN);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(jT2)), providableCompositionLocal.nr(Dp.nr(fKN3))}, ComposableLambdaKt.nr(-1164547968, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
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
                if ((i7 & 3) == 2 && composer2.xMQ()) {
                    composer2.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1164547968, i7, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:312)");
                }
                Modifier modifierRl = SelectableKt.rl(SurfaceKt.KN(InteractiveComponentSizeKt.rl(modifier2), shapeN, SurfaceKt.xMQ(surface, fKN3, composer2, 0), borderStroke3, ((Density) composer2.ty(CompositionLocalsKt.J2())).l(fKN2)), z2, mutableInteractionSource2, RippleKt.nr(false, 0.0f, 0L, composer2, 0, 7), z4, null, function0, 16, null);
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
        }, composer, 54), composer, ProvidedValue.xMQ | 48);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    public static final void t(final boolean z2, final Function1 function1, Modifier modifier, boolean z3, Shape shape, long j2, long j3, float f3, float f4, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, int i2, int i3, int i5) {
        final Modifier modifier2 = (i5 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z4 = (i5 & 8) != 0 ? true : z3;
        final Shape shapeN = (i5 & 16) != 0 ? RectangleShapeKt.n() : shape;
        final long surface = (i5 & 32) != 0 ? MaterialTheme.f26164n.n(composer, 6).getSurface() : j2;
        long jT2 = (i5 & 64) != 0 ? ColorSchemeKt.t(surface, composer, (i2 >> 15) & 14) : j3;
        float fKN = (i5 & 128) != 0 ? Dp.KN(0) : f3;
        final float fKN2 = (i5 & 256) != 0 ? Dp.KN(0) : f4;
        BorderStroke borderStroke2 = (i5 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i5 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1877401889, i2, i3, "androidx.compose.material3.Surface (Surface.kt:410)");
        }
        ProvidableCompositionLocal providableCompositionLocal = f27934n;
        final float fKN3 = Dp.KN(((Dp) composer.ty(providableCompositionLocal)).getValue() + fKN);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(jT2)), providableCompositionLocal.nr(Dp.nr(fKN3))}, ComposableLambdaKt.nr(712720927, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$4
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
                if ((i7 & 3) == 2 && composer2.xMQ()) {
                    composer2.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(712720927, i7, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:416)");
                }
                Modifier modifierRl = ToggleableKt.rl(SurfaceKt.KN(InteractiveComponentSizeKt.rl(modifier2), shapeN, SurfaceKt.xMQ(surface, fKN3, composer2, 0), borderStroke3, ((Density) composer2.ty(CompositionLocalsKt.J2())).l(fKN2)), z2, mutableInteractionSource2, RippleKt.nr(false, 0.0f, 0L, composer2, 0, 7), z4, null, function1, 16, null);
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
        }, composer, 54), composer, ProvidedValue.xMQ | 48);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long xMQ(long j2, float f3, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-2079918090, i2, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jN = ColorSchemeKt.n(MaterialTheme.f26164n.n(composer, 6), j2, f3, composer, (i2 << 3) & 1008);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jN;
    }
}
