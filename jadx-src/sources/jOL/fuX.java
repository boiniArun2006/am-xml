package jOL;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.RippleKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import jOL.w6;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class fuX {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w6 f69425n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Modifier f69426t;

        j(w6 w6Var, Modifier modifier) {
            this.f69425n = w6Var;
            this.f69426t = modifier;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1253044753, i2, -1, "com.alightcreative.common.compose.components.header.HeaderElement.<anonymous> (PageHeader.kt:114)");
            }
            w6 w6Var = this.f69425n;
            if (w6Var instanceof w6.n) {
                composer.eF(864087524);
                String strO = ((w6.n) this.f69425n).O();
                Function0 function0Nr = ((w6.n) this.f69425n).nr();
                IndicationNodeFactory indicationNodeFactoryT = RippleKt.t(false, 0.0f, 0L, 7, null);
                composer.eF(-1080495990);
                Object objIF = composer.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = InteractionSourceKt.n();
                    composer.o(objIF);
                }
                composer.Xw();
                TextKt.t(strO, PaddingKt.gh(ClickableKt.nr(this.f69426t, (MutableInteractionSource) objIF, indicationNodeFactoryT, ((w6.n) this.f69425n).t(), null, null, function0Nr, 24, null), 0.0f, Dp.KN(16), 1, null), aD.w6.piY(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).rV9(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                composer.Xw();
            } else {
                if (!(w6Var instanceof w6.j)) {
                    composer.eF(-1080505920);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(864731084);
                Painter painterT = PainterResources_androidKt.t(((w6.j) this.f69425n).Uo(), composer, 0);
                Modifier modifierZ = SizeKt.Z(PaddingKt.gh(this.f69426t, 0.0f, Dp.KN(16), 1, null), Dp.KN(24));
                Function0 function0J2 = ((w6.j) this.f69425n).J2();
                IndicationNodeFactory indicationNodeFactoryT2 = RippleKt.t(false, 0.0f, 0L, 7, null);
                composer.eF(-1080469750);
                Object objIF2 = composer.iF();
                if (objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = InteractionSourceKt.n();
                    composer.o(objIF2);
                }
                composer.Xw();
                ImageKt.n(painterT, "Header icon", ClickableKt.nr(modifierZ, (MutableInteractionSource) objIF2, indicationNodeFactoryT2, ((w6.j) this.f69425n).O(), null, null, function0J2, 24, null), null, null, 0.0f, ColorFilter.Companion.rl(ColorFilter.INSTANCE, aD.w6.piY(), 0, 2, null), composer, 1572912, 56);
                composer.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function2 {
        final /* synthetic */ Dsr J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ jOL.j f69427O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w6 f69428n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f69429r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ w6 f69430t;

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[Dsr.values().length];
                try {
                    iArr[Dsr.f69411n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Dsr.f69412t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[jOL.j.values().length];
                try {
                    iArr2[jOL.j.f69432n.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[jOL.j.f69433t.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        n(w6 w6Var, w6 w6Var2, jOL.j jVar, Dsr dsr, String str) {
            this.f69428n = w6Var;
            this.f69430t = w6Var2;
            this.f69427O = jVar;
            this.J2 = dsr;
            this.f69429r = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            TextStyle textStyleFD;
            char c2;
            int iJ2;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1479528128, i2, -1, "com.alightcreative.common.compose.components.header.PageHeader.<anonymous> (PageHeader.kt:73)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 16;
            Modifier modifierGh = PaddingKt.gh(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(f3));
            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
            w6 w6Var = this.f69428n;
            w6 w6Var2 = this.f69430t;
            jOL.j jVar = this.f69427O;
            Dsr dsr = this.J2;
            String str = this.f69429r;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalTy, verticalXMQ, composer, 54);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierGh);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N);
            } else {
                composer.r();
            }
            Composer composerN = Updater.n(composer);
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            if (w6Var != null) {
                composer.eF(-280591134);
                fuX.O(w6Var, null, composer, 0, 2);
                composer.Xw();
            } else if (w6Var2 == null || jVar != jOL.j.f69433t) {
                composer.eF(-280271555);
                composer.Xw();
            } else {
                composer.eF(-280451262);
                fuX.O(fuX.gh(w6Var2), AlphaKt.n(companion, 0.0f), composer, 48, 0);
                composer.Xw();
            }
            Modifier modifierGh2 = PaddingKt.gh(RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null), 0.0f, Dp.KN(f3), 1, null);
            long jPiY = aD.w6.piY();
            int i3 = j.$EnumSwitchMapping$0[dsr.ordinal()];
            if (i3 == 1) {
                composer.eF(-1117409589);
                textStyleFD = H9N.j.f3810n.rl(composer, 6).fD();
                composer.Xw();
            } else {
                if (i3 != 2) {
                    composer.eF(-1117412163);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(-1117407221);
                textStyleFD = H9N.j.f3810n.rl(composer, 6).te();
                composer.Xw();
            }
            TextStyle textStyle = textStyleFD;
            int i5 = j.$EnumSwitchMapping$1[jVar.ordinal()];
            if (i5 != 1) {
                c2 = 2;
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iJ2 = TextAlign.INSTANCE.n();
            } else {
                c2 = 2;
                iJ2 = TextAlign.INSTANCE.J2();
            }
            TextKt.t(str, modifierGh2, jPiY, 0L, null, null, null, 0L, null, TextAlign.KN(iJ2), 0L, 0, false, 0, 0, null, textStyle, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65016);
            if (w6Var2 != null) {
                composer.eF(-279607132);
                fuX.O(w6Var2, null, composer, 0, 2);
                composer.Xw();
            } else if (w6Var == null || jVar != jOL.j.f69433t) {
                composer.eF(-279285507);
                composer.Xw();
            } else {
                composer.eF(-279467136);
                fuX.O(fuX.gh(w6Var), AlphaKt.n(companion, 0.0f), composer, 48, 0);
                composer.Xw();
            }
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(w6 w6Var, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        O(w6Var, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Modifier modifier, String str, jOL.j jVar, Dsr dsr, w6 w6Var, w6 w6Var2, float f3, int i2, int i3, Composer composer, int i5) {
        Uo(modifier, str, jVar, dsr, w6Var, w6Var2, f3, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6 A[PHI: r16
      0x00a6: PHI (r16v11 int) = (r16v0 int), (r16v6 int), (r16v7 int) binds: [B:60:0x00a4, B:70:0x00c1, B:69:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(Modifier modifier, String str, jOL.j jVar, Dsr dsr, w6 w6Var, w6 w6Var2, float f3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        String str2;
        int i7;
        jOL.j jVar2;
        int i8;
        Dsr dsr2;
        int i9;
        int i10;
        int i11;
        float fKN;
        final String str3;
        Composer composer2;
        final Modifier modifier3;
        final jOL.j jVar3;
        final Dsr dsr3;
        final float f4;
        final w6 w6Var3;
        final w6 w6Var4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1691134595);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                str2 = str;
                i5 |= composerKN.p5(str2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    jVar2 = jVar;
                    i5 |= composerKN.p5(jVar2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 == 0) {
                    if ((i2 & 3072) == 0) {
                        dsr2 = dsr;
                        i5 |= composerKN.p5(dsr2) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i5 |= (32768 & i2) == 0 ? composerKN.p5(w6Var) : composerKN.E2(w6Var) ? 16384 : 8192;
                    }
                    i10 = i3 & 32;
                    int i14 = 196608;
                    if (i10 != 0) {
                        i5 |= i14;
                    } else if ((i2 & 196608) == 0) {
                        i14 = (i2 & 262144) == 0 ? composerKN.p5(w6Var2) : composerKN.E2(w6Var2) ? 131072 : 65536;
                        i5 |= i14;
                    }
                    i11 = i3 & 64;
                    if (i11 == 0) {
                        i5 |= 1572864;
                        fKN = f3;
                    } else {
                        fKN = f3;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.rl(fKN) ? 1048576 : 524288;
                        }
                    }
                    if ((i5 & 599187) == 599186 || !composerKN.xMQ()) {
                        Modifier modifier4 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i13 != 0) {
                            str2 = "";
                        }
                        if (i7 != 0) {
                            jVar2 = jOL.j.f69432n;
                        }
                        if (i8 != 0) {
                            dsr2 = Dsr.f69412t;
                        }
                        w6 w6Var5 = i9 == 0 ? null : w6Var;
                        w6 w6Var6 = i10 == 0 ? null : w6Var2;
                        if (i11 != 0) {
                            fKN = Dp.KN(0);
                        }
                        float f5 = fKN;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1691134595, i5, -1, "com.alightcreative.common.compose.components.header.PageHeader (PageHeader.kt:66)");
                        }
                        Modifier modifierKN = SizeKt.KN(modifier4, 0.0f, 1, null);
                        Shape shapeN = RectangleShapeKt.n();
                        jOL.j jVar4 = jVar2;
                        long jZ = aD.w6.z();
                        w6 w6Var7 = w6Var5;
                        w6 w6Var8 = w6Var6;
                        String str4 = str2;
                        Dsr dsr4 = dsr2;
                        n nVar = new n(w6Var7, w6Var8, jVar4, dsr4, str4);
                        str3 = str4;
                        composer2 = composerKN;
                        CardKt.n(modifierKN, shapeN, jZ, 0L, null, f5, ComposableLambdaKt.nr(1479528128, true, nVar, composerKN, 54), composer2, ((i5 >> 3) & 458752) | 1573296, 24);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                        jVar3 = jVar4;
                        dsr3 = dsr4;
                        f4 = f5;
                        w6Var3 = w6Var7;
                        w6Var4 = w6Var8;
                    } else {
                        composerKN.wTp();
                        w6Var4 = w6Var2;
                        f4 = fKN;
                        composer2 = composerKN;
                        modifier3 = modifier2;
                        str3 = str2;
                        jVar3 = jVar2;
                        dsr3 = dsr2;
                        w6Var3 = w6Var;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: jOL.Ml
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return fuX.KN(modifier3, str3, jVar3, dsr3, w6Var3, w6Var4, f4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                dsr2 = dsr;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                i10 = i3 & 32;
                int i142 = 196608;
                if (i10 != 0) {
                }
                i11 = i3 & 64;
                if (i11 == 0) {
                }
                if ((i5 & 599187) == 599186) {
                    if (i12 == 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 != 0) {
                    }
                    float f53 = fKN;
                    if (ComposerKt.v()) {
                    }
                    Modifier modifierKN2 = SizeKt.KN(modifier4, 0.0f, 1, null);
                    Shape shapeN2 = RectangleShapeKt.n();
                    jOL.j jVar42 = jVar2;
                    long jZ2 = aD.w6.z();
                    w6 w6Var72 = w6Var5;
                    w6 w6Var82 = w6Var6;
                    String str42 = str2;
                    Dsr dsr42 = dsr2;
                    n nVar2 = new n(w6Var72, w6Var82, jVar42, dsr42, str42);
                    str3 = str42;
                    composer2 = composerKN;
                    CardKt.n(modifierKN2, shapeN2, jZ2, 0L, null, f53, ComposableLambdaKt.nr(1479528128, true, nVar2, composerKN, 54), composer2, ((i5 >> 3) & 458752) | 1573296, 24);
                    if (ComposerKt.v()) {
                    }
                    modifier3 = modifier4;
                    jVar3 = jVar42;
                    dsr3 = dsr42;
                    f4 = f53;
                    w6Var3 = w6Var72;
                    w6Var4 = w6Var82;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            jVar2 = jVar;
            i8 = i3 & 8;
            if (i8 == 0) {
            }
            dsr2 = dsr;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            i10 = i3 & 32;
            int i1422 = 196608;
            if (i10 != 0) {
            }
            i11 = i3 & 64;
            if (i11 == 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        str2 = str;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        jVar2 = jVar;
        i8 = i3 & 8;
        if (i8 == 0) {
        }
        dsr2 = dsr;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        i10 = i3 & 32;
        int i14222 = 196608;
        if (i10 != 0) {
        }
        i11 = i3 & 64;
        if (i11 == 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w6 gh(w6 w6Var) {
        if (w6Var instanceof w6.n) {
            return w6.n.rl((w6.n) w6Var, null, false, new Function0() { // from class: jOL.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fuX.qie();
                }
            }, 3, null);
        }
        if (w6Var instanceof w6.j) {
            return w6.j.nr((w6.j) w6Var, 0, false, new Function0() { // from class: jOL.CN3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fuX.az();
                }
            }, 3, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final w6 w6Var, final Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        boolean zE2;
        int i7;
        int i8;
        Composer composerKN = composer.KN(-855424189);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                zE2 = composerKN.p5(w6Var);
            } else {
                zE2 = composerKN.E2(w6Var);
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
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i9 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-855424189, i5, -1, "com.alightcreative.common.compose.components.header.HeaderElement (PageHeader.kt:112)");
            }
            MaterialThemeKt.n(null, null, null, ComposableLambdaKt.nr(-1253044753, true, new j(w6Var, modifier), composerKN, 54), composerKN, 3072, 7);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: jOL.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.J2(w6Var, modifier, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
