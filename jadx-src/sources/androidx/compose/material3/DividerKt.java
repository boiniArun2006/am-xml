package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a0\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "thickness", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "", "rl", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "t", c.f62177j, "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,121:1\n1223#2,6:122\n1223#2,6:128\n77#3:134\n168#4:135\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n*L\n55#1:122,6\n84#1:128,6\n105#1:134\n105#1:135\n*E\n"})
public final class DividerKt {
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, float f3, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        final long j3;
        Composer composerKN = composer.KN(1562471785);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= ((i3 & 4) == 0 && composerKN.nr(j2)) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            j3 = j2;
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if (i7 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i8 != 0) {
                    f3 = DividerDefaults.f25669n.rl();
                }
                if ((i3 & 4) != 0) {
                    j2 = DividerDefaults.f25669n.n(composerKN, 6);
                    i5 &= -897;
                }
                long j4 = j2;
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1562471785, i5, -1, "androidx.compose.material3.Divider (Divider.kt:101)");
                }
                composerKN.eF(-433645095);
                float fKN = !Dp.mUb(f3, Dp.INSTANCE.n()) ? Dp.KN(1.0f / ((Density) composerKN.ty(CompositionLocalsKt.J2())).getDensity()) : f3;
                composerKN.Xw();
                BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(modifier, 0.0f, 1, null), fKN), j4, null, 2, null), composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                j3 = j4;
            } else {
                composerKN.wTp();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                long j42 = j2;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                composerKN.eF(-433645095);
                if (!Dp.mUb(f3, Dp.INSTANCE.n())) {
                }
                composerKN.Xw();
                BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(modifier, 0.0f, 1, null), fKN), j42, null, 2, null), composerKN, 0);
                if (ComposerKt.v()) {
                }
                j3 = j42;
            }
        }
        final float f4 = f3;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final Modifier modifier2 = modifier;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DividerKt$Divider$1
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
                    DividerKt.n(modifier2, f4, j3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(Modifier modifier, final float f3, final long j2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objIF;
        int i9;
        Composer composerKN = composer.KN(75144485);
        int i10 = i3 & 1;
        if (i10 != 0) {
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
        int i11 = i3 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.rl(f3)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0 && composerKN.nr(j2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            composerKN.e();
            if ((i2 & 1) != 0 && !composerKN.rV9()) {
                composerKN.wTp();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                z2 = true;
                Modifier modifierXMQ = SizeKt.xMQ(SizeKt.KN(modifier, 0.0f, 1, null), f3);
                if ((i5 & 112) != 32) {
                }
                if (((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256) {
                    z2 = false;
                    z4 = z3 | z2;
                    objIF = composerKN.iF();
                    if (z4) {
                        objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$1$1
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
                                float f4 = 2;
                                DrawScope.mI(drawScope, j2, OffsetKt.n(0.0f, drawScope.l(f3) / f4), OffsetKt.n(Size.gh(drawScope.t()), drawScope.l(f3) / f4), drawScope.l(f3), 0, null, 0.0f, null, 0, 496, null);
                            }
                        };
                        composerKN.o(objIF);
                        CanvasKt.rl(modifierXMQ, (Function1) objIF, composerKN, 0);
                        if (ComposerKt.v()) {
                        }
                    }
                } else {
                    z2 = false;
                    z4 = z3 | z2;
                    objIF = composerKN.iF();
                    if (z4) {
                    }
                }
            } else {
                if (i10 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i11 != 0) {
                    f3 = DividerDefaults.f25669n.rl();
                }
                if ((i3 & 4) != 0) {
                    j2 = DividerDefaults.f25669n.n(composerKN, 6);
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(75144485, i5, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:54)");
                }
                z2 = true;
                Modifier modifierXMQ2 = SizeKt.xMQ(SizeKt.KN(modifier, 0.0f, 1, null), f3);
                if ((i5 & 112) != 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 || !composerKN.nr(j2)) && (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                    z2 = false;
                }
                z4 = z3 | z2;
                objIF = composerKN.iF();
                if (z4 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$1$1
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
                            float f4 = 2;
                            DrawScope.mI(drawScope, j2, OffsetKt.n(0.0f, drawScope.l(f3) / f4), OffsetKt.n(Size.gh(drawScope.t()), drawScope.l(f3) / f4), drawScope.l(f3), 0, null, 0.0f, null, 0, 496, null);
                        }
                    };
                    composerKN.o(objIF);
                }
                CanvasKt.rl(modifierXMQ2, (Function1) objIF, composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }
        final Modifier modifier2 = modifier;
        final float f4 = f3;
        final long j3 = j2;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$2
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
                    DividerKt.rl(modifier2, f4, j3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Modifier modifier, final float f3, final long j2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objIF;
        int i9;
        Composer composerKN = composer.KN(-1534852205);
        int i10 = i3 & 1;
        if (i10 != 0) {
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
        int i11 = i3 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.rl(f3)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0 && composerKN.nr(j2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            composerKN.e();
            if ((i2 & 1) != 0 && !composerKN.rV9()) {
                composerKN.wTp();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                z2 = true;
                Modifier modifierViF = SizeKt.ViF(SizeKt.nr(modifier, 0.0f, 1, null), f3);
                if ((i5 & 112) != 32) {
                }
                if (((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256) {
                    z2 = false;
                    z4 = z3 | z2;
                    objIF = composerKN.iF();
                    if (z4) {
                        objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$1$1
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
                                float f4 = 2;
                                DrawScope.mI(drawScope, j2, OffsetKt.n(drawScope.l(f3) / f4, 0.0f), OffsetKt.n(drawScope.l(f3) / f4, Size.xMQ(drawScope.t())), drawScope.l(f3), 0, null, 0.0f, null, 0, 496, null);
                            }
                        };
                        composerKN.o(objIF);
                        CanvasKt.rl(modifierViF, (Function1) objIF, composerKN, 0);
                        if (ComposerKt.v()) {
                        }
                    }
                } else {
                    z2 = false;
                    z4 = z3 | z2;
                    objIF = composerKN.iF();
                    if (z4) {
                    }
                }
            } else {
                if (i10 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i11 != 0) {
                    f3 = DividerDefaults.f25669n.rl();
                }
                if ((i3 & 4) != 0) {
                    j2 = DividerDefaults.f25669n.n(composerKN, 6);
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1534852205, i5, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:83)");
                }
                z2 = true;
                Modifier modifierViF2 = SizeKt.ViF(SizeKt.nr(modifier, 0.0f, 1, null), f3);
                if ((i5 & 112) != 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((((i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 || !composerKN.nr(j2)) && (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                    z2 = false;
                }
                z4 = z3 | z2;
                objIF = composerKN.iF();
                if (z4 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$1$1
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
                            float f4 = 2;
                            DrawScope.mI(drawScope, j2, OffsetKt.n(drawScope.l(f3) / f4, 0.0f), OffsetKt.n(drawScope.l(f3) / f4, Size.xMQ(drawScope.t())), drawScope.l(f3), 0, null, 0.0f, null, 0, 496, null);
                        }
                    };
                    composerKN.o(objIF);
                }
                CanvasKt.rl(modifierViF2, (Function1) objIF, composerKN, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }
        final Modifier modifier2 = modifier;
        final float f4 = f3;
        final long j3 = j2;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$2
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
                    DividerKt.t(modifier2, f4, j3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
