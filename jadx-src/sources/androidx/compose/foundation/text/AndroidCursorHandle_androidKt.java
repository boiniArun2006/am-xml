package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a,\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0011\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/selection/OffsetProvider;", "offsetProvider", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpSize;", "minTouchTargetSize", "", c.f62177j, "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "rl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "nr", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "F", "getCursorHandleHeight", "()F", "CursorHandleHeight", "getCursorHandleWidth", "CursorHandleWidth", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,107:1\n1247#2,6:108\n113#3:114\n66#4:115\n58#4:116\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n54#1:108,6\n44#1:114\n45#1:115\n45#1:116\n*E\n"})
public final class AndroidCursorHandle_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f19126n;
    private static final float rl;

    static {
        float fKN = Dp.KN(25);
        f19126n = fKN;
        rl = Dp.KN(Dp.KN(fKN * 2.0f) / 2.4142137f);
    }

    private static final Modifier nr(Modifier modifier) {
        return ComposedModifierKt.t(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(-2126899193);
                if (ComposerKt.v()) {
                    ComposerKt.p5(-2126899193, i2, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
                }
                final long selectionHandleColor = ((SelectionColors) composer.ty(TextSelectionColorsKt.rl())).getSelectionHandleColor();
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zNr = composer.nr(selectionHandleColor);
                Object objIF = composer.iF();
                if (zNr || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                            final float fIntBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.t() >> 32)) / 2.0f;
                            final ImageBitmap imageBitmapNr = AndroidSelectionHandles_androidKt.nr(cacheDrawScope, fIntBitsToFloat);
                            final ColorFilter colorFilterRl = ColorFilter.Companion.rl(ColorFilter.INSTANCE, selectionHandleColor, 0, 2, null);
                            return cacheDrawScope.r(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                    n(contentDrawScope);
                                    return Unit.INSTANCE;
                                }

                                public final void n(ContentDrawScope contentDrawScope) {
                                    contentDrawScope.l2();
                                    float f3 = fIntBitsToFloat;
                                    ImageBitmap imageBitmap = imageBitmapNr;
                                    ColorFilter colorFilter = colorFilterRl;
                                    DrawContext drawContext = contentDrawScope.getDrawContext();
                                    long jT2 = drawContext.t();
                                    drawContext.KN().O();
                                    try {
                                        DrawTransform transform = drawContext.getTransform();
                                        DrawTransform.O(transform, f3, 0.0f, 2, null);
                                        transform.KN(45.0f, Offset.INSTANCE.t());
                                        DrawScope.EF(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                    } finally {
                                        drawContext.KN().n();
                                        drawContext.xMQ(jT2);
                                    }
                                }
                            });
                        }
                    };
                    composer.o(objIF);
                }
                Modifier modifierZmq = modifier2.Zmq(DrawModifierKt.t(companion, (Function1) objIF));
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifierZmq;
            }
        }, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final OffsetProvider offsetProvider, final Modifier modifier, final long j2, Composer composer, final int i2, final int i3) {
        int i5;
        boolean zE2;
        int i7;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        Object objIF;
        int i10;
        Composer composerKN = composer.KN(1776202187);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                zE2 = composerKN.p5(offsetProvider);
            } else {
                zE2 = composerKN.E2(offsetProvider);
            }
            if (zE2) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0 && composerKN.nr(j2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i5 & 1)) {
            composerKN.e();
            if ((i2 & 1) != 0 && !composerKN.rV9()) {
                composerKN.wTp();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                i9 = i5 & 14;
                if (i9 == 4) {
                    z3 = true;
                    objIF = composerKN.iF();
                    if (!z3) {
                        objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                semanticsPropertyReceiver.t(SelectionHandlesKt.nr(), new SelectionHandleInfo(Handle.f19677n, offsetProvider.n(), SelectionHandleAnchor.f20865t, true, null));
                            }
                        };
                        composerKN.o(objIF);
                        final Modifier modifierNr = SemanticsModifierKt.nr(modifier, false, (Function1) objIF, 1, null);
                        AndroidSelectionHandles_androidKt.n(offsetProvider, Alignment.INSTANCE.az(), ComposableLambdaKt.nr(-1653527038, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i11) {
                                if (!composer2.HI((i11 & 3) != 2, i11 & 1)) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1653527038, i11, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:63)");
                                }
                                if (j2 != 9205357640488583168L) {
                                    composer2.eF(1828931592);
                                    Modifier modifierR = SizeKt.r(modifierNr, DpSize.mUb(j2), DpSize.xMQ(j2), 0.0f, 0.0f, 12, null);
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.az(), false);
                                    int iN = ComposablesKt.n(composer2, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierR);
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
                                    AndroidCursorHandle_androidKt.rl(null, composer2, 0, 1);
                                    composer2.XQ();
                                    composer2.Xw();
                                } else {
                                    composer2.eF(1829298756);
                                    AndroidCursorHandle_androidKt.rl(modifierNr, composer2, 0, 0);
                                    composer2.Xw();
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, i9 | 432);
                        if (ComposerKt.v()) {
                        }
                    }
                }
            } else {
                if ((i3 & 4) != 0) {
                    j2 = DpSize.INSTANCE.n();
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1776202187, i5, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
                }
                i9 = i5 & 14;
                if (i9 == 4 && ((i5 & 8) == 0 || !composerKN.E2(offsetProvider))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                objIF = composerKN.iF();
                if (!z3 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            semanticsPropertyReceiver.t(SelectionHandlesKt.nr(), new SelectionHandleInfo(Handle.f19677n, offsetProvider.n(), SelectionHandleAnchor.f20865t, true, null));
                        }
                    };
                    composerKN.o(objIF);
                }
                final Modifier modifierNr2 = SemanticsModifierKt.nr(modifier, false, (Function1) objIF, 1, null);
                AndroidSelectionHandles_androidKt.n(offsetProvider, Alignment.INSTANCE.az(), ComposableLambdaKt.nr(-1653527038, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i11) {
                        if (!composer2.HI((i11 & 3) != 2, i11 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1653527038, i11, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:63)");
                        }
                        if (j2 != 9205357640488583168L) {
                            composer2.eF(1828931592);
                            Modifier modifierR = SizeKt.r(modifierNr2, DpSize.mUb(j2), DpSize.xMQ(j2), 0.0f, 0.0f, 12, null);
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.az(), false);
                            int iN = ComposablesKt.n(composer2, 0);
                            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer2, modifierR);
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
                            AndroidCursorHandle_androidKt.rl(null, composer2, 0, 1);
                            composer2.XQ();
                            composer2.Xw();
                        } else {
                            composer2.eF(1829298756);
                            AndroidCursorHandle_androidKt.rl(modifierNr2, composer2, 0, 0);
                            composer2.Xw();
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, i9 | 432);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        } else {
            composerKN.wTp();
        }
        final long j3 = j2;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i11) {
                    AndroidCursorHandle_androidKt.n(offsetProvider, modifier, j3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        boolean z2;
        Composer composerKN = composer.KN(694251107);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i5 & 1)) {
            if (i8 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(694251107, i5, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            SpacerKt.n(nr(SizeKt.S(modifier, rl, f19126n)), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$DefaultCursorHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    AndroidCursorHandle_androidKt.rl(modifier, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
