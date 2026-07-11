package Vil;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import e.C1960j;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: Vil.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC1480c {

    /* JADX INFO: renamed from: Vil.c$I28 */
    public static final class I28 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f11132n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(List list) {
            super(1);
            this.f11132n = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            this.f11132n.get(i2);
            return null;
        }
    }

    /* JADX INFO: renamed from: Vil.c$Ml */
    static final class Ml implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f11133n;

        Ml(Function0 function0) {
            this.f11133n = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope item, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(510994060, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetItemList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PresetItemList.kt:68)");
            }
            Pl.rl(this.f11133n, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: Vil.c$Wre */
    public static final class Wre extends Lambda implements Function4 {
        final /* synthetic */ six.I28 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ C1960j f11134O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function1 f11135S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ MutableState f11136Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f11137n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f11138o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f11139r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f11140t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(List list, List list2, C1960j c1960j, six.I28 i28, boolean z2, Function1 function1, MutableState mutableState, Function1 function12) {
            super(4);
            this.f11137n = list;
            this.f11140t = list2;
            this.f11134O = c1960j;
            this.J2 = i28;
            this.f11139r = z2;
            this.f11138o = function1;
            this.f11136Z = mutableState;
            this.f11135S = function12;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i5;
            if ((i3 & 6) == 0) {
                i5 = i3 | (composer.p5(lazyItemScope) ? 4 : 2);
            } else {
                i5 = i3;
            }
            if ((i3 & 48) == 0) {
                i5 |= composer.t(i2) ? 32 : 16;
            }
            if (!composer.HI((i5 & 147) != 146, i5 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            C1960j c1960j = (C1960j) this.f11137n.get(i2);
            composer.eF(-1018087333);
            boolean zContains = this.f11140t.contains(c1960j);
            String strT = c1960j.t();
            C1960j c1960j2 = this.f11134O;
            boolean zAreEqual = Intrinsics.areEqual(strT, c1960j2 != null ? c1960j2.t() : null);
            boolean zRl = this.J2.rl();
            boolean z2 = this.f11139r;
            composer.eF(-1141212363);
            boolean zP5 = composer.p5(this.f11138o) | composer.E2(c1960j);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(this.f11138o, c1960j);
                composer.o(objIF);
            }
            Function0 function0 = (Function0) objIF;
            composer.Xw();
            composer.eF(-1141210273);
            boolean zP52 = composer.p5(this.J2) | ((((i5 & 112) ^ 48) > 32 && composer.t(i2)) || (i5 & 48) == 32);
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(this.J2, i2);
                composer.o(objIF2);
            }
            Function0 function02 = (Function0) objIF2;
            composer.Xw();
            MutableState mutableState = this.f11136Z;
            composer.eF(-1141204114);
            boolean zP53 = composer.p5(this.f11135S) | composer.E2(c1960j);
            Object objIF3 = composer.iF();
            if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new w6(this.f11135S, c1960j);
                composer.o(objIF3);
            }
            composer.Xw();
            Z.J2(c1960j, zContains, z2, zAreEqual, function0, function02, mutableState, zRl, (Function0) objIF3, composer, 0, 0);
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: renamed from: Vil.c$j */
    static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f11141n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C1960j f11142t;

        j(Function1 function1, C1960j c1960j) {
            this.f11141n = function1;
            this.f11142t = c1960j;
        }

        public final void n() {
            this.f11141n.invoke(this.f11142t);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Vil.c$n */
    static final class n implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ six.I28 f11143n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f11144t;

        n(six.I28 i28, int i2) {
            this.f11143n = i28;
            this.f11144t = i2;
        }

        public final void n() {
            this.f11143n.Uo(Integer.valueOf(this.f11144t));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Vil.c$w6 */
    static final class w6 implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f11145n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C1960j f11146t;

        w6(Function1 function1, C1960j c1960j) {
            this.f11145n = function1;
            this.f11146t = c1960j;
        }

        public final void n() {
            this.f11145n.invoke(this.f11146t);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final six.I28 listTabState, final List presetList, final boolean z2, final C1960j c1960j, final List selectedPresets, final LazyListState lazyListState, Modifier modifier, Function0 function0, Function1 function1, MutableState mutableState, Function1 function12, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        int i9;
        int i10;
        Function0 function02;
        int i11;
        final Function1 function13;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Function1 function14;
        final MutableState mutableState2;
        final Function1 function15;
        Object objIF;
        Composer.Companion companion;
        State state;
        int iN;
        final Function0 function03;
        Composer composerN;
        final Function1 function16;
        Function2 function2Rl;
        Modifier.Companion companion2;
        boolean zE2;
        Object objIF2;
        Modifier.Companion companion3;
        int i17;
        MutableState mutableState3;
        Function1 function17;
        Composer composer2;
        final Modifier modifier2;
        final MutableState mutableState4;
        final Function1 function18;
        final Function0 function04;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(listTabState, "listTabState");
        Intrinsics.checkNotNullParameter(presetList, "presetList");
        Intrinsics.checkNotNullParameter(selectedPresets, "selectedPresets");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Composer composerKN = composer.KN(153987674);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(listTabState) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.E2(presetList) ? 32 : 16;
        }
        int i18 = i7;
        if ((i5 & 4) == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i18 |= composerKN.n(z2) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i18 |= 3072;
                i8 = 16;
            } else {
                i8 = 16;
                if ((i2 & 3072) == 0) {
                    i18 |= composerKN.E2(c1960j) ? 2048 : 1024;
                }
            }
            if ((i5 & 16) == 0) {
                i18 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i18 |= composerKN.E2(selectedPresets) ? 16384 : 8192;
            }
            if ((i5 & 32) == 0) {
                i18 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i18 |= composerKN.p5(lazyListState) ? 131072 : 65536;
            }
            i9 = i5 & 64;
            if (i9 == 0) {
                i18 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i18 |= composerKN.p5(modifier) ? 1048576 : 524288;
            }
            i10 = 128 & i5;
            if (i10 == 0) {
                i18 |= 12582912;
                function02 = function0;
            } else {
                function02 = function0;
                if ((i2 & 12582912) == 0) {
                    i18 |= composerKN.E2(function02) ? 8388608 : 4194304;
                }
            }
            i11 = i5 & 256;
            if (i11 == 0) {
                i18 |= 100663296;
                function13 = function1;
            } else {
                function13 = function1;
                if ((i2 & 100663296) == 0) {
                    i18 |= composerKN.E2(function13) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
            }
            i12 = i5 & 512;
            if (i12 == 0) {
                i18 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                i13 = i12;
            } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                i13 = i12;
                i18 |= composerKN.p5(mutableState) ? 536870912 : 268435456;
            } else {
                i13 = i12;
            }
            i14 = 1024 & i5;
            if (i14 == 0) {
                i15 = i14;
                i16 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                i15 = i14;
                i16 = i3 | (composerKN.E2(function12) ? 4 : 2);
            } else {
                i15 = i14;
                i16 = i3;
            }
            if ((i18 & 306783379) != 306783378 && (i16 & 3) == 2 && composerKN.xMQ()) {
                composerKN.wTp();
                modifier2 = modifier;
                mutableState4 = mutableState;
                function18 = function12;
                function04 = function02;
                composer2 = composerKN;
            } else {
                Modifier modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier;
                if (i10 != 0) {
                    function02 = null;
                }
                if (i11 == 0) {
                    composerKN.eF(-1808920064);
                    Object objIF3 = composerKN.iF();
                    if (objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new Function1() { // from class: Vil.Xo
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1480c.Uo((C1960j) obj);
                            }
                        };
                        composerKN.o(objIF3);
                    }
                    composerKN.Xw();
                    function14 = (Function1) objIF3;
                } else {
                    function14 = function13;
                }
                mutableState2 = i13 == 0 ? null : mutableState;
                if (i15 == 0) {
                    composerKN.eF(-1808917024);
                    Object objIF4 = composerKN.iF();
                    if (objIF4 == Composer.INSTANCE.n()) {
                        objIF4 = new Function1() { // from class: Vil.eO
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC1480c.mUb((C1960j) obj);
                            }
                        };
                        composerKN.o(objIF4);
                    }
                    composerKN.Xw();
                    function15 = (Function1) objIF4;
                } else {
                    function15 = function12;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(153987674, i18, i16, "com.alightcreative.maineditor.presetpreview.ui.components.PresetItemList (PresetItemList.kt:38)");
                }
                composerKN.eF(-1808915772);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                int i19 = i16;
                if (objIF == companion.n()) {
                    objIF = SnapshotStateKt.O(new Function0() { // from class: Vil.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(AbstractC1480c.gh(lazyListState));
                        }
                    });
                    composerKN.o(objIF);
                }
                state = (State) objIF;
                composerKN.Xw();
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                function03 = function02;
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
                function16 = function14;
                Updater.O(composerN, measurePolicyUo, companion4.t());
                Updater.O(composerN, compositionLocalMapIk, companion4.O());
                function2Rl = companion4.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion4.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                companion2 = Modifier.INSTANCE;
                Modifier modifierJ2 = SizeKt.J2(PaddingKt.gh(companion2, Dp.KN(i8), 0.0f, 2, null), 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(12));
                boolean zRl = listTabState.rl();
                PaddingValues paddingValuesO = PaddingKt.O(0.0f, 0.0f, 0.0f, Dp.KN(35), 7, null);
                composerKN.eF(168258738);
                zE2 = composerKN.E2(presetList) | composerKN.E2(selectedPresets) | composerKN.E2(c1960j) | ((i18 & 14) != 4) | ((i18 & 896) != 256) | ((234881024 & i18) != 67108864) | ((1879048192 & i18) != 536870912) | ((i19 & 14) != 4) | ((29360128 & i18) != 8388608);
                objIF2 = composerKN.iF();
                if (!zE2 || objIF2 == companion.n()) {
                    companion3 = companion2;
                    i17 = 1;
                    Function1 function19 = new Function1() { // from class: Vil.QJ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC1480c.KN(presetList, function03, selectedPresets, c1960j, listTabState, z2, function16, mutableState2, function15, (LazyListScope) obj);
                        }
                    };
                    mutableState3 = mutableState2;
                    function17 = function15;
                    composerKN.o(function19);
                    objIF2 = function19;
                } else {
                    companion3 = companion2;
                    mutableState3 = mutableState2;
                    function17 = function15;
                    i17 = 1;
                }
                composerKN.Xw();
                LazyDslKt.rl(modifierJ2, lazyListState, paddingValuesO, false, horizontalOrVerticalTy, null, null, zRl, null, (Function1) objIF2, composerKN, ((i18 >> 12) & 112) | 24966, 360);
                composerKN.eF(168286706);
                if (((Boolean) state.getValue()).booleanValue()) {
                    BoxKt.n(BackgroundKt.nr(SizeKt.KN(SizeKt.xMQ(companion3, Dp.KN(i17)), 0.0f, i17, null), ColorResources_androidKt.n(2131099739, composerKN, 6), null, 2, null), composerKN, 0);
                }
                composerKN.Xw();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer2 = composerKN;
                modifier2 = modifier3;
                mutableState4 = mutableState3;
                function18 = function17;
                function04 = function03;
                function13 = function16;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: Vil.l3D
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC1480c.xMQ(listTabState, presetList, z2, c1960j, selectedPresets, lazyListState, modifier2, function04, function13, mutableState4, function18, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i18 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        if ((i5 & 8) == 0) {
        }
        if ((i5 & 16) == 0) {
        }
        if ((i5 & 32) == 0) {
        }
        i9 = i5 & 64;
        if (i9 == 0) {
        }
        i10 = 128 & i5;
        if (i10 == 0) {
        }
        i11 = i5 & 256;
        if (i11 == 0) {
        }
        i12 = i5 & 512;
        if (i12 == 0) {
        }
        i14 = 1024 & i5;
        if (i14 == 0) {
        }
        if ((i18 & 306783379) != 306783378) {
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            if (i11 == 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (ComposerKt.v()) {
            }
            composerKN.eF(-1808915772);
            objIF = composerKN.iF();
            companion = Composer.INSTANCE;
            int i192 = i16;
            if (objIF == companion.n()) {
            }
            state = (State) objIF;
            composerKN.Xw();
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifier3);
            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
            function03 = function02;
            Function0 function0N2 = companion42.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            function16 = function14;
            Updater.O(composerN, measurePolicyUo2, companion42.t());
            Updater.O(composerN, compositionLocalMapIk2, companion42.O());
            function2Rl = companion42.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion42.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                companion2 = Modifier.INSTANCE;
                Modifier modifierJ22 = SizeKt.J2(PaddingKt.gh(companion2, Dp.KN(i8), 0.0f, 2, null), 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy2 = Arrangement.f17400n.ty(Dp.KN(12));
                boolean zRl2 = listTabState.rl();
                PaddingValues paddingValuesO2 = PaddingKt.O(0.0f, 0.0f, 0.0f, Dp.KN(35), 7, null);
                composerKN.eF(168258738);
                zE2 = composerKN.E2(presetList) | composerKN.E2(selectedPresets) | composerKN.E2(c1960j) | ((i18 & 14) != 4) | ((i18 & 896) != 256) | ((234881024 & i18) != 67108864) | ((1879048192 & i18) != 536870912) | ((i192 & 14) != 4) | ((29360128 & i18) != 8388608);
                objIF2 = composerKN.iF();
                if (zE2) {
                    companion3 = companion2;
                    i17 = 1;
                    Function1 function192 = new Function1() { // from class: Vil.QJ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC1480c.KN(presetList, function03, selectedPresets, c1960j, listTabState, z2, function16, mutableState2, function15, (LazyListScope) obj);
                        }
                    };
                    mutableState3 = mutableState2;
                    function17 = function15;
                    composerKN.o(function192);
                    objIF2 = function192;
                    composerKN.Xw();
                    LazyDslKt.rl(modifierJ22, lazyListState, paddingValuesO2, false, horizontalOrVerticalTy2, null, null, zRl2, null, (Function1) objIF2, composerKN, ((i18 >> 12) & 112) | 24966, 360);
                    composerKN.eF(168286706);
                    if (((Boolean) state.getValue()).booleanValue()) {
                    }
                    composerKN.Xw();
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                    }
                    composer2 = composerKN;
                    modifier2 = modifier3;
                    mutableState4 = mutableState3;
                    function18 = function17;
                    function04 = function03;
                    function13 = function16;
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(List list, Function0 function0, List list2, C1960j c1960j, six.I28 i28, boolean z2, Function1 function1, MutableState mutableState, Function1 function12, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.qie(list.size(), null, new I28(list), ComposableLambdaKt.rl(-1091073711, true, new Wre(list, list2, c1960j, i28, z2, function1, mutableState, function12)));
        if (function0 != null) {
            LazyListScope.O(LazyColumn, null, null, ComposableLambdaKt.rl(510994060, true, new Ml(function0)), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(C1960j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(C1960j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(six.I28 i28, List list, boolean z2, C1960j c1960j, List list2, LazyListState lazyListState, Modifier modifier, Function0 function0, Function1 function1, MutableState mutableState, Function1 function12, int i2, int i3, int i5, Composer composer, int i7) {
        J2(i28, list, z2, c1960j, list2, lazyListState, modifier, function0, function1, mutableState, function12, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gh(LazyListState lazyListState) {
        if (lazyListState.o() == 0 && lazyListState.Z() <= 0) {
            return false;
        }
        return true;
    }
}
