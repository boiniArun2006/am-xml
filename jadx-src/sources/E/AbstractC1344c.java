package E;

import Be4.yg;
import Dj7.CM;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import c0.Wre;
import com.alightcreative.app.motion.scene.TimeKt;
import com.safedk.android.analytics.brandsafety.b;
import eQ.fuX;
import eQ.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: E.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC1344c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f2157n = Dp.KN(12);
    private static final float rl = Dp.KN(9);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f2158t = Dp.KN(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(MutableState mutableState, Wre.n.Ml it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Ik(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Modifier modifier, int i2, int i3, Composer composer, int i5) {
        Uo(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(int i2, Composer composer, int i3) {
        qie(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(zd.Ml ml, float f3, boolean z2, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        xMQ(ml, f3, z2, function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(zd.Ml ml, int i2, Composer composer, int i3) {
        mUb(ml, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final void mUb(final zd.Ml ml, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(304343735);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(ml) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(304343735, i3, -1, "com.alightcreative.template.importpreview.ui.components.TemplateMediaItemDetails (TemplateMediaItem.kt:134)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierXMQ = PaddingKt.xMQ(SizeKt.J2(companion, 0.0f, 1, null), Dp.KN(5));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierXMQ);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            float f3 = f2158t;
            Modifier modifierN = boxScopeInstance.n(PaddingKt.xMQ(BackgroundKt.nr(ClipKt.n(companion, RoundedCornerShapeKt.t(f3)), aD.w6.EF(), null, 2, null), Dp.KN(2)), companion2.HI());
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN);
            Function0 function0N2 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyUo2, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ImageKt.n(PainterResources_androidKt.t(ml.rl(), composerKN, 0), null, null, null, null, 0.0f, ColorFilter.Companion.rl(ColorFilter.INSTANCE, aD.w6.nO(), 0, 2, null), composerKN, 1572912, 60);
            composerKN.XQ();
            Modifier modifierN2 = boxScopeInstance.n(PaddingKt.gh(BackgroundKt.nr(ClipKt.n(companion, RoundedCornerShapeKt.t(f3)), aD.w6.EF(), null, 2, null), Dp.KN(4), 0.0f, 2, null), companion2.nr());
            MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion2.HI(), false);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierN2);
            Function0 function0N3 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N3);
            } else {
                composerKN.r();
            }
            Composer composerN3 = Updater.n(composerKN);
            Updater.O(composerN3, measurePolicyUo3, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            String timeMillis = TimeKt.formatTimeMillis((int) ml.n(), "mm:ss:tt", false);
            long jNO = aD.w6.nO();
            TextStyle textStyleX = H9N.j.f3810n.rl(composerKN, 6).X();
            composerKN = composerKN;
            CM.S(timeMillis, textStyleX, null, jNO, null, null, null, 0, false, 0, null, composerKN, 3072, 0, 2036);
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: E.l3D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1344c.gh(ml, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void qie(Composer composer, final int i2) {
        Composer composerKN = composer.KN(-390284579);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-390284579, i2, -1, "com.alightcreative.template.importpreview.ui.components.TemplateMediaItemReplaceIcon (TemplateMediaItem.kt:175)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierT = BackgroundKt.t(SizeKt.J2(companion, 0.0f, 1, null), Color.az(aD.w6.xVH(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.t(f2157n));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ImageKt.n(PainterResources_androidKt.t(2131231817, composerKN, 6), null, BoxScopeInstance.f17448n.n(companion, companion2.O()), null, null, 0.0f, null, composerKN, 48, b.f61769v);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: E.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1344c.az(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xMQ(final zd.Ml media, final float f3, final boolean z2, final Function0 onClick, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier2;
        Object objIF;
        Composer.Companion companion;
        final MutableState mutableState;
        int i7;
        Modifier modifierJ2;
        boolean z3;
        Object objIF2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int i8;
        int i9;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerKN = composer.KN(-1454228016);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(media) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onClick) ? 2048 : 1024;
        }
        int i10 = i3 & 16;
        if (i10 == 0) {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
            }
            if ((i5 & 9363) == 9362 || !composerKN.xMQ()) {
                Modifier modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1454228016, i5, -1, "com.alightcreative.template.importpreview.ui.components.TemplateMediaItem (TemplateMediaItem.kt:51)");
                }
                composerKN.eF(-278680514);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);
                    composerKN.o(objIF);
                }
                mutableState = (MutableState) objIF;
                composerKN.Xw();
                Modifier modifierT = BackgroundKt.t(ClipKt.n(SizeKt.Z(modifier3, f3), RoundedCornerShapeKt.t(!z2 ? rl : f2157n)), aD.w6.xVH(), RoundedCornerShapeKt.t(f2157n));
                if (z2) {
                    i7 = i5;
                    modifierJ2 = Modifier.INSTANCE;
                } else {
                    i7 = i5;
                    modifierJ2 = BorderKt.J2(Modifier.INSTANCE, Dp.KN(5), aD.w6.uG(), RoundedCornerShapeKt.t(rl));
                }
                Modifier modifierZmq = modifierT.Zmq(modifierJ2);
                composerKN.eF(-278656730);
                z3 = (i7 & 7168) != 2048;
                objIF2 = composerKN.iF();
                if (!z3 || objIF2 == companion.n()) {
                    objIF2 = new Function0() { // from class: E.Pl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC1344c.r(onClick);
                        }
                    };
                    composerKN.o(objIF2);
                }
                composerKN.Xw();
                Modifier modifierJ22 = ClickableKt.J2(modifierZmq, false, null, null, (Function0) objIF2, 7, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ22);
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
                Modifier modifier4 = modifier3;
                Updater.O(composerN, measurePolicyUo, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                function2Rl = companion3.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                fuX.j jVar = new fuX.j((Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo()));
                n.j jVar2 = new n.j();
                jVar2.n(new yg.n());
                eQ.fuX fuxNr = jVar.KN(jVar2.O()).nr();
                if (Intrinsics.areEqual(media.O().getScheme(), "sample")) {
                    i8 = i7;
                    composerKN.eF(-1949677380);
                    composerKN.eF(768394287);
                    Uri uriO = media.O();
                    composerKN.eF(768395195);
                    if (Intrinsics.areEqual(uriO.getScheme(), "am")) {
                        uriO = zd.w6.t((Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo()), uriO);
                    }
                    Uri uri = uriO;
                    composerKN.Xw();
                    composerKN.Xw();
                    composerKN.eF(768404486);
                    Object objIF3 = composerKN.iF();
                    if (objIF3 == companion.n()) {
                        objIF3 = new Function1() { // from class: E.Xo
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1344c.HI(mutableState, (Wre.n.Ml) obj);
                            }
                        };
                        composerKN.o(objIF3);
                    }
                    composerKN.Xw();
                    composerKN = composerKN;
                    ImageKt.n(c0.fuX.nr(uri, fuxNr, null, null, null, null, (Function1) objIF3, null, null, 0, null, composerKN, 1572864, 0, 1980), null, SizeKt.J2(boxScopeInstance.n(Modifier.INSTANCE, companion2.O()), 0.0f, 1, null), null, null, 0.0f, null, composerKN, 48, b.f61769v);
                    composerKN.Xw();
                } else {
                    composerKN.eF(-1950096593);
                    Bitmap bitmapUo = kPg.fuX.f69922n.Uo(media.t());
                    if (bitmapUo == null) {
                        i8 = i7;
                    } else {
                        Ik(mutableState, false);
                        i8 = i7;
                        ImageKt.t(AndroidImageBitmap_androidKt.t(bitmapUo), null, SizeKt.J2(boxScopeInstance.n(Modifier.INSTANCE, companion2.O()), 0.0f, 1, null), null, null, 0.0f, null, 0, composerKN, 48, 248);
                        composerKN = composerKN;
                        Unit unit = Unit.INSTANCE;
                    }
                    composerKN.Xw();
                }
                composerKN.eF(768413740);
                if (ty(mutableState)) {
                    i9 = 0;
                } else {
                    i9 = 0;
                    Uo(boxScopeInstance.n(Modifier.INSTANCE, companion2.O()), composerKN, 0, 0);
                }
                composerKN.Xw();
                composerKN.eF(768418594);
                if (z2) {
                    qie(composerKN, i9);
                }
                composerKN.Xw();
                mUb(media, composerKN, i8 & 14);
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier2 = modifier4;
            } else {
                composerKN.wTp();
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: E.eO
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC1344c.ck(media, f3, z2, onClick, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 24576;
        modifier2 = modifier;
        if ((i5 & 9363) == 9362) {
            if (i10 == 0) {
            }
            if (ComposerKt.v()) {
            }
            composerKN.eF(-278680514);
            objIF = composerKN.iF();
            companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
            }
            mutableState = (MutableState) objIF;
            composerKN.Xw();
            Modifier modifierT2 = BackgroundKt.t(ClipKt.n(SizeKt.Z(modifier3, f3), RoundedCornerShapeKt.t(!z2 ? rl : f2157n)), aD.w6.xVH(), RoundedCornerShapeKt.t(f2157n));
            if (z2) {
            }
            Modifier modifierZmq2 = modifierT2.Zmq(modifierJ2);
            composerKN.eF(-278656730);
            if ((i7 & 7168) != 2048) {
            }
            objIF2 = composerKN.iF();
            if (!z3) {
                objIF2 = new Function0() { // from class: E.Pl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC1344c.r(onClick);
                    }
                };
                composerKN.o(objIF2);
                composerKN.Xw();
                Modifier modifierJ222 = ClickableKt.J2(modifierZmq2, false, null, null, (Function0) objIF2, 7, null);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion22.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierJ222);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion32.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Modifier modifier42 = modifier3;
                Updater.O(composerN, measurePolicyUo2, companion32.t());
                Updater.O(composerN, compositionLocalMapIk2, companion32.O());
                function2Rl = companion32.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion32.nr());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    fuX.j jVar3 = new fuX.j((Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo()));
                    n.j jVar22 = new n.j();
                    jVar22.n(new yg.n());
                    eQ.fuX fuxNr2 = jVar3.KN(jVar22.O()).nr();
                    if (Intrinsics.areEqual(media.O().getScheme(), "sample")) {
                    }
                    composerKN.eF(768413740);
                    if (ty(mutableState)) {
                    }
                    composerKN.Xw();
                    composerKN.eF(768418594);
                    if (z2) {
                    }
                    composerKN.Xw();
                    mUb(media, composerKN, i8 & 14);
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final void Ik(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final void Uo(final Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Composer composerKN = composer.KN(1949304464);
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
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i8 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1949304464, i5, -1, "com.alightcreative.template.importpreview.ui.components.ItemLoadingOrMissing (TemplateMediaItem.kt:195)");
            }
            Bitmap bitmap = Y3a.j.O((Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo()), 0, 1, null).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            ImageBitmap imageBitmapT = AndroidImageBitmap_androidKt.t(bitmap);
            composerKN.eF(-1653189197);
            boolean zP5 = composerKN.p5(imageBitmapT);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                TileMode.Companion companion = TileMode.INSTANCE;
                objIF = BrushKt.n(ShaderKt.n(imageBitmapT, companion.nr(), companion.nr()));
                composerKN.o(objIF);
            }
            composerKN.Xw();
            BoxKt.n(BackgroundKt.rl(SizeKt.J2(modifier, 0.0f, 1, null), (ShaderBrush) objIF, RoundedCornerShapeKt.t(f2157n), 0.0f, 4, null), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: E.QJ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1344c.KN(modifier, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final boolean ty(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
