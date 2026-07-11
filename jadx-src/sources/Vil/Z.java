package Vil;

import Vil.Z;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.RadioButtonDefaults;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.scene.EngineState;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableTransform;
import com.alightcreative.app.motion.scene.KeyableVector2D;
import com.alightcreative.app.motion.scene.KeyableVector3D;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.safedk.android.internal.d;
import e.C1960j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f11102n = Dp.KN(12);
    private static final C1960j rl = new C1960j("id", new SceneElement(SceneElementType.NullObject, 0, 1000, 0, new EngineState(nCS.j.f71005n.n()), "Title", new KeyableTransform(KeyableVector3D.INSTANCE.getZERO(), null, KeyableVector2D.INSTANCE.getONE(), KeyableFloat.INSTANCE.getZERO(), 0.0f, 0.0f, null, null, false, 498, null), null, null, null, null, null, null, null, null, null, null, 0, Integer.MAX_VALUE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -917632, 127, null), null, 4, null);

    static final class j implements Function2 {
        final /* synthetic */ Function0 E2;
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f11103O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ String f11104S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ long f11105Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f11106e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ MutableState f11107g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f11108n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f11109o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f11110r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f11111t;

        j(boolean z2, Function0 function0, boolean z3, Function0 function02, boolean z4, boolean z5, long j2, String str, MutableState mutableState, Function0 function03, MutableState mutableState2) {
            this.f11108n = z2;
            this.f11111t = function0;
            this.f11103O = z3;
            this.J2 = function02;
            this.f11110r = z4;
            this.f11109o = z5;
            this.f11105Z = j2;
            this.f11104S = str;
            this.f11107g = mutableState;
            this.E2 = function03;
            this.f11106e = mutableState2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(boolean z2, Function0 function0, Function0 function02) {
            if (z2) {
                function0.invoke();
            } else {
                function02.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(MutableState mutableState, Function0 function0, MutableState mutableState2) {
            if (mutableState != null) {
                mutableState.setValue(Offset.nr(Z.ty(mutableState2)));
            }
            function0.invoke();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            nr((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void nr(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1480138061, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetItemRow.<anonymous>.<anonymous>.<anonymous> (PresetItemRow.kt:112)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierN = ClipKt.n(companion, RoundedCornerShapeKt.t(Z.f11102n));
            boolean z2 = this.f11108n;
            composer.eF(-1891260767);
            boolean zP5 = composer.p5(this.f11111t);
            final Function0 function0 = this.f11111t;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: Vil.ci
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z.j.O(function0);
                    }
                };
                composer.o(objIF);
            }
            Function0 function02 = (Function0) objIF;
            composer.Xw();
            composer.eF(-1891270247);
            boolean zN = composer.n(this.f11103O) | composer.p5(this.f11111t) | composer.p5(this.J2);
            final boolean z3 = this.f11103O;
            final Function0 function03 = this.f11111t;
            final Function0 function04 = this.J2;
            Object objIF2 = composer.iF();
            if (zN || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: Vil.g9s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z.j.J2(z3, function03, function04);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            Modifier modifierMUb = ClickableKt.mUb(modifierN, z2, null, null, null, function02, null, false, (Function0) objIF2, 110, null);
            boolean z4 = this.f11110r;
            boolean z5 = this.f11103O;
            boolean z6 = this.f11109o;
            long j2 = this.f11105Z;
            String str = this.f11104S;
            final MutableState mutableState = this.f11107g;
            final Function0 function05 = this.E2;
            final MutableState mutableState2 = this.f11106e;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierMUb);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier modifierXMQ = PaddingKt.xMQ(ClipKt.n(SizeKt.J2(companion, 0.0f, 1, null), RoundedCornerShapeKt.t(Z.f11102n)), Dp.KN(8));
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), companion2.xMQ(), composer, 48);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierXMQ);
            Function0 function0N2 = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N2);
            } else {
                composer.r();
            }
            Composer composerN2 = Updater.n(composer);
            Updater.O(composerN2, measurePolicyRl, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Modifier modifierRl = RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null);
            TextStyle textStyleNY = H9N.j.f3810n.rl(composer, 6).nY();
            TextKt.t(str, modifierRl, z4 ? aD.w6.G7() : aD.w6.fcU(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.nr()), 0L, TextOverflow.INSTANCE.rl(), false, 1, 0, null, textStyleNY, composer, 0, 3120, 54776);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(16)), composer, 6);
            long jC = z4 ? aD.w6.C() : aD.w6.Mx();
            boolean z7 = !z5;
            composer.eF(477007631);
            boolean zP52 = composer.p5(mutableState) | composer.p5(function05);
            Object objIF3 = composer.iF();
            if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function0() { // from class: Vil.afx
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z.j.Uo(mutableState, function05, mutableState2);
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            KA9.UGc.Ik(rowScopeInstance, jC, z7, (Function0) objIF3, composer, 6, 0);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(4)), composer, 6);
            composer.XQ();
            composer.eF(233292451);
            if (!z4 && z5 && !z6) {
                BoxKt.n(BackgroundKt.nr(SizeKt.J2(companion, 0.0f, 1, null), Color.az(j2, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 0);
            }
            composer.Xw();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final C1960j preset, final boolean z2, final boolean z3, final boolean z4, Function0 function0, Function0 function02, MutableState mutableState, boolean z5, Function0 function03, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Function0 function04;
        int i8;
        Function0 function05;
        int i9;
        MutableState mutableState2;
        int i10;
        boolean z6;
        int i11;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        String strO;
        Object objIF;
        Composer.Companion companion;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Object objIF2;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        final Function0 function010;
        final Function0 function011;
        Composer composer2;
        final MutableState mutableState3;
        final Function0 function012;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(preset, "preset");
        Composer composerKN = composer.KN(99599794);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(preset) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) == 0) {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.n(z2) ? 32 : 16;
            }
            if ((4 & i3) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.n(z3) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.n(z4) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
                function04 = function0;
            } else if ((i2 & 24576) == 0) {
                function04 = function0;
                i5 |= composerKN.E2(function04) ? 16384 : 8192;
            } else {
                function04 = function0;
            }
            i8 = i3 & 32;
            if (i8 == 0) {
                i5 |= 196608;
                function05 = function02;
            } else {
                function05 = function02;
                if ((i2 & 196608) == 0) {
                    i5 |= composerKN.E2(function05) ? 131072 : 65536;
                }
            }
            i9 = i3 & 64;
            if (i9 == 0) {
                i5 |= 1572864;
                mutableState2 = mutableState;
            } else {
                mutableState2 = mutableState;
                if ((i2 & 1572864) == 0) {
                    i5 |= composerKN.p5(mutableState2) ? 1048576 : 524288;
                }
            }
            i10 = 128 & i3;
            if (i10 == 0) {
                i5 |= 12582912;
                z6 = z5;
            } else {
                z6 = z5;
                if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.n(z6) ? 8388608 : 4194304;
                }
            }
            i11 = 256 & i3;
            if (i11 == 0) {
                i5 |= 100663296;
                function06 = function03;
            } else {
                function06 = function03;
                if ((i2 & 100663296) == 0) {
                    i5 |= composerKN.E2(function06) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
            }
            if ((i5 & 38347923) == 38347922 || !composerKN.xMQ()) {
                if (i7 == 0) {
                    composerKN.eF(-1438002340);
                    Object objIF3 = composerKN.iF();
                    if (objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new Function0() { // from class: Vil.s4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Z.Uo();
                            }
                        };
                        composerKN.o(objIF3);
                    }
                    function07 = (Function0) objIF3;
                    composerKN.Xw();
                } else {
                    function07 = function04;
                }
                if (i8 == 0) {
                    composerKN.eF(-1438001188);
                    Object objIF4 = composerKN.iF();
                    if (objIF4 == Composer.INSTANCE.n()) {
                        objIF4 = new Function0() { // from class: Vil.UGc
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Z.gh();
                            }
                        };
                        composerKN.o(objIF4);
                    }
                    function08 = (Function0) objIF4;
                    composerKN.Xw();
                } else {
                    function08 = function05;
                }
                if (i9 != 0) {
                    mutableState2 = null;
                }
                boolean z9 = i10 == 0 ? true : z6;
                if (i11 == 0) {
                    composerKN.eF(-1437997540);
                    Object objIF5 = composerKN.iF();
                    if (objIF5 == Composer.INSTANCE.n()) {
                        objIF5 = new Function0() { // from class: Vil.Q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Z.qie();
                            }
                        };
                        composerKN.o(objIF5);
                    }
                    composerKN.Xw();
                    function09 = (Function0) objIF5;
                } else {
                    function09 = function06;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(99599794, i5, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetItemRow (PresetItemRow.kt:71)");
                }
                composerKN.eF(-1437995944);
                strO = preset.O();
                if (StringsKt.isBlank(strO)) {
                    strO = StringResources_androidKt.t(2132019381, composerKN, 6);
                }
                String str = strO;
                composerKN.Xw();
                State stateT = AnimateAsStateKt.t(Dp.KN(!z3 ? 40 : 0), new TweenSpec(d.f62986a, 0, null, 6, null), null, null, composerKN, 48, 12);
                composerKN.eF(-1437988062);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(Offset.INSTANCE.t()), null, 2, null);
                    composerKN.o(objIF);
                }
                final MutableState mutableState4 = (MutableState) objIF;
                composerKN.Xw();
                long jPJg = !z4 ? aD.w6.pJg() : aD.w6.ofS();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Function0 function013 = function07;
                MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Function0 function014 = function08;
                Modifier modifierO = ComposedModifierKt.O(composerKN, companion2);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0 function015 = function09;
                Function0 function0N = companion4.n();
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
                Updater.O(composerN, measurePolicyN, companion4.t());
                Updater.O(composerN, compositionLocalMapIk, companion4.O());
                function2Rl = companion4.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion4.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                Modifier modifierXMQ = SizeKt.xMQ(companion2, Dp.KN(48));
                composerKN.eF(1841083969);
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                    objIF2 = new Function1() { // from class: Vil.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Z.xMQ(mutableState4, (LayoutCoordinates) obj);
                        }
                    };
                    composerKN.o(objIF2);
                }
                composerKN.Xw();
                Modifier modifierN = OnGloballyPositionedModifierKt.n(modifierXMQ, (Function1) objIF2);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN);
                Function0 function0N2 = companion4.n();
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
                Updater.O(composerN2, measurePolicyUo, companion4.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                function2Rl2 = companion4.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion4.nr());
                Modifier modifierN2 = BoxScopeInstance.f17448n.n(SizeKt.Z(PaddingKt.az(companion2, Dp.KN(2), 0.0f, 0.0f, 0.0f, 14, null), Dp.KN(20)), companion3.KN());
                RadioButtonDefaults radioButtonDefaults = RadioButtonDefaults.f22577n;
                Color.Companion companion5 = Color.INSTANCE;
                RadioButtonKt.n(z2, function015, modifierN2, z3, null, radioButtonDefaults.n(companion5.KN(), companion5.KN(), 0L, composerKN, (RadioButtonDefaults.rl << 9) | 54, 4), composerKN, ((i5 << 3) & 7168) | ((i5 >> 3) & 14) | ((i5 >> 21) & 112), 16);
                MutableState mutableState5 = mutableState2;
                boolean z10 = z9;
                CardKt.n(OffsetKt.t(SizeKt.J2(companion2, 0.0f, 1, null), az(stateT), 0.0f, 2, null), RoundedCornerShapeKt.t(f11102n), jPJg, 0L, null, Dp.KN(0), ComposableLambdaKt.nr(-1480138061, true, new j(z10, function015, z3, function013, z4, z2, jPJg, str, mutableState5, function014, mutableState4), composerKN, 54), composerKN, 1769472, 24);
                composerKN.XQ();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                function010 = function015;
                function011 = function013;
                composer2 = composerKN;
                mutableState3 = mutableState5;
                function012 = function014;
                z7 = z10;
            } else {
                composerKN.wTp();
                function011 = function04;
                function012 = function05;
                z7 = z6;
                function010 = function06;
                composer2 = composerKN;
                mutableState3 = mutableState2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: Vil.SPz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Z.mUb(preset, z2, z3, z4, function011, function012, mutableState3, z7, function010, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        if ((4 & i3) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = 128 & i3;
        if (i10 == 0) {
        }
        i11 = 256 & i3;
        if (i11 == 0) {
        }
        if ((i5 & 38347923) == 38347922) {
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (ComposerKt.v()) {
            }
            composerKN.eF(-1437995944);
            strO = preset.O();
            if (StringsKt.isBlank(strO)) {
            }
            String str2 = strO;
            composerKN.Xw();
            State stateT2 = AnimateAsStateKt.t(Dp.KN(!z3 ? 40 : 0), new TweenSpec(d.f62986a, 0, null, 6, null), null, null, composerKN, 48, 12);
            composerKN.eF(-1437988062);
            objIF = composerKN.iF();
            companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
            }
            final MutableState mutableState42 = (MutableState) objIF;
            composerKN.Xw();
            long jPJg2 = !z4 ? aD.w6.pJg() : aD.w6.ofS();
            Modifier.Companion companion22 = Modifier.INSTANCE;
            Arrangement.Vertical verticalUo2 = Arrangement.f17400n.Uo();
            Alignment.Companion companion32 = Alignment.INSTANCE;
            Function0 function0132 = function07;
            MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalUo2, companion32.gh(), composerKN, 0);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Function0 function0142 = function08;
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, companion22);
            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
            Function0 function0152 = function09;
            Function0 function0N3 = companion42.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN2, companion42.t());
            Updater.O(composerN, compositionLocalMapIk3, companion42.O());
            function2Rl = companion42.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO3, companion42.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                Modifier modifierXMQ2 = SizeKt.xMQ(companion22, Dp.KN(48));
                composerKN.eF(1841083969);
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                }
                composerKN.Xw();
                Modifier modifierN3 = OnGloballyPositionedModifierKt.n(modifierXMQ2, (Function1) objIF2);
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion32.HI(), false);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierN3);
                Function0 function0N22 = companion42.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyUo2, companion42.t());
                Updater.O(composerN2, compositionLocalMapIk22, companion42.O());
                function2Rl2 = companion42.rl();
                if (!composerN2.getInserting()) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    Updater.O(composerN2, modifierO22, companion42.nr());
                    Modifier modifierN22 = BoxScopeInstance.f17448n.n(SizeKt.Z(PaddingKt.az(companion22, Dp.KN(2), 0.0f, 0.0f, 0.0f, 14, null), Dp.KN(20)), companion32.KN());
                    RadioButtonDefaults radioButtonDefaults2 = RadioButtonDefaults.f22577n;
                    Color.Companion companion52 = Color.INSTANCE;
                    RadioButtonKt.n(z2, function0152, modifierN22, z3, null, radioButtonDefaults2.n(companion52.KN(), companion52.KN(), 0L, composerKN, (RadioButtonDefaults.rl << 9) | 54, 4), composerKN, ((i5 << 3) & 7168) | ((i5 >> 3) & 14) | ((i5 >> 21) & 112), 16);
                    MutableState mutableState52 = mutableState2;
                    boolean z102 = z9;
                    CardKt.n(OffsetKt.t(SizeKt.J2(companion22, 0.0f, 1, null), az(stateT2), 0.0f, 2, null), RoundedCornerShapeKt.t(f11102n), jPJg2, 0L, null, Dp.KN(0), ComposableLambdaKt.nr(-1480138061, true, new j(z102, function0152, z3, function0132, z4, z2, jPJg2, str2, mutableState52, function0142, mutableState42), composerKN, 54), composerKN, 1769472, 24);
                    composerKN.XQ();
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                    }
                    function010 = function0152;
                    function011 = function0132;
                    composer2 = composerKN;
                    mutableState3 = mutableState52;
                    function012 = function0142;
                    z7 = z102;
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(C1960j c1960j, boolean z2, boolean z3, boolean z4, Function0 function0, Function0 function02, MutableState mutableState, boolean z5, Function0 function03, int i2, int i3, Composer composer, int i5) {
        J2(c1960j, z2, z3, z4, function0, function02, mutableState, z5, function03, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(MutableState mutableState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KN(mutableState, LayoutCoordinatesKt.J2(it));
        return Unit.INSTANCE;
    }

    private static final void KN(MutableState mutableState, long j2) {
        mutableState.setValue(Offset.nr(j2));
    }

    private static final float az(State state) {
        return ((Dp) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ty(MutableState mutableState) {
        return ((Offset) mutableState.getValue()).getPackedValue();
    }
}
