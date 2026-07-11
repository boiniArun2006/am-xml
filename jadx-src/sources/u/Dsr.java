package u;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import u.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Dsr {

    static final class j implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function2 f74078O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f74079n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ MutableState f74080o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ MutableState f74081r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f74082t;

        public static final class Ml extends Lambda implements Function4 {
            final /* synthetic */ Function1 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Object f74083O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f74084n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ MutableState f74085r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function2 f74086t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ml(List list, Function2 function2, Object obj, Function1 function1, MutableState mutableState) {
                super(4);
                this.f74084n = list;
                this.f74086t = function2;
                this.f74083O = obj;
                this.J2 = function1;
                this.f74085r = mutableState;
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
                    ComposerKt.p5(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                Object obj = this.f74084n.get(i2);
                composer.eF(717782984);
                String str = (String) this.f74086t.invoke(obj, composer.ty(AndroidCompositionLocals_androidKt.Uo()));
                Integer num = Intrinsics.areEqual(obj, this.f74083O) ? 2131231668 : null;
                Modifier.Companion companion = Modifier.INSTANCE;
                IndicationNodeFactory indicationNodeFactoryT = RippleKt.t(false, 0.0f, aD.w6.HI(), 3, null);
                composer.eF(1408641075);
                Object objIF = composer.iF();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objIF == companion2.n()) {
                    objIF = InteractionSourceKt.n();
                    composer.o(objIF);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
                composer.Xw();
                composer.eF(1408643979);
                boolean zP5 = composer.p5(this.J2) | composer.E2(obj);
                Object objIF2 = composer.iF();
                if (zP5 || objIF2 == companion2.n()) {
                    objIF2 = new C1215j(this.J2, obj, this.f74085r);
                    composer.o(objIF2);
                }
                composer.Xw();
                Dsr.Z(str, ClickableKt.nr(companion, mutableInteractionSource, indicationNodeFactoryT, false, null, null, (Function0) objIF2, 28, null), num, composer, 0, 0);
                composer.Xw();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        /* JADX INFO: renamed from: u.Dsr$j$j, reason: collision with other inner class name */
        static final class C1215j implements Function0 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MutableState f74087O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f74088n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Object f74089t;

            C1215j(Function1 function1, Object obj, MutableState mutableState) {
                this.f74088n = function1;
                this.f74089t = obj;
                this.f74087O = mutableState;
            }

            public final void n() {
                Dsr.Ik(this.f74087O, false);
                this.f74088n.invoke(this.f74089t);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        public static final class n extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final n f74090n = new n();

            public n() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Object obj) {
                return null;
            }
        }

        public static final class w6 extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f74091n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f74092t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w6(Function1 function1, List list) {
                super(1);
                this.f74091n = function1;
                this.f74092t = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n(((Number) obj).intValue());
            }

            public final Object n(int i2) {
                return this.f74091n.invoke(this.f74092t.get(i2));
            }
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-371845608, i2, -1, "com.alightcreative.maineditor.templateimport.ui.components.DropdownList.<anonymous>.<anonymous> (AlightDropdownList.kt:114)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierN = ClipKt.n(SizeKt.gh(Dsr.nY(companion).Zmq(SizeKt.ViF(companion, ((Density) composer.ty(CompositionLocalsKt.J2())).rV9((int) (Dsr.ty(this.f74081r) >> 32)))), 0.0f, Dp.KN(170), 1, null), RoundedCornerShapeKt.t(Dp.KN(12)));
            composer.eF(-1375997464);
            boolean zE2 = composer.E2(this.f74079n) | composer.E2(this.f74082t) | composer.p5(this.f74078O) | composer.p5(this.J2);
            final List list = this.f74079n;
            final Object obj = this.f74082t;
            final Function2 function2 = this.f74078O;
            final Function1 function1 = this.J2;
            final MutableState mutableState = this.f74080o;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: u.fuX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Dsr.j.t(list, obj, function2, function1, mutableState, (LazyListScope) obj2);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            LazyDslKt.rl(modifierN, null, null, false, null, null, null, false, null, (Function1) objIF, composer, 0, 510);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j(List list, Object obj, Function2 function2, Function1 function1, MutableState mutableState, MutableState mutableState2) {
            this.f74079n = list;
            this.f74082t = obj;
            this.f74078O = function2;
            this.J2 = function1;
            this.f74081r = mutableState;
            this.f74080o = mutableState2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(List list, Object obj, Function2 function2, Function1 function1, MutableState mutableState, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!Intrinsics.areEqual(obj2, obj)) {
                    arrayList.add(obj2);
                }
            }
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(obj);
            listCreateListBuilder.addAll(arrayList);
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            LazyColumn.qie(listBuild.size(), null, new w6(n.f74090n, listBuild), ComposableLambdaKt.rl(-632812321, true, new Ml(listBuild, function2, obj, function1, mutableState)));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(MutableState mutableState) {
        Ik(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier nY(Modifier modifier) {
        return ShadowKt.rl(modifier, Dp.KN(1), RoundedCornerShapeKt.t(Dp.KN(12)), false, aD.w6.Aum(), 0L, 20, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final List items, final Object obj, final Function2 getItemName, final Function1 onItemSelected, String str, String str2, Composer composer, final int i2, final int i3) {
        int i5;
        String str3;
        int i7;
        String str4;
        String str5;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        String str6;
        Composer composer2;
        int i8;
        int i9;
        String str7;
        int i10;
        final String str8;
        final String str9;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(getItemName, "getItemName");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        Composer composerKN = composer.KN(148786123);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(items) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? composerKN.p5(obj) : composerKN.E2(obj) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(getItemName) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onItemSelected) ? 2048 : 1024;
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i5 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                str3 = str;
                i5 |= composerKN.p5(str3) ? 16384 : 8192;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    str4 = str2;
                    i5 |= composerKN.p5(str4) ? 131072 : 65536;
                }
                if ((74899 & i5) == 74898 && composerKN.xMQ()) {
                    composerKN.wTp();
                    str8 = str3;
                    composer2 = composerKN;
                    str9 = str4;
                } else {
                    if (i11 != 0) {
                        str3 = null;
                    }
                    str5 = i7 == 0 ? null : str4;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(148786123, i5, -1, "com.alightcreative.maineditor.templateimport.ui.components.AlightDropdownList (AlightDropdownList.kt:55)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion2.n();
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
                    Updater.O(composerN, measurePolicyN, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    function2Rl = companion2.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    composerKN.eF(1165358604);
                    if (str3 == null) {
                        TextStyle textStyleXw = H9N.j.f3810n.rl(composerKN, 6).Xw();
                        i8 = i5;
                        String str10 = str3;
                        TextKt.t(str10, null, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleXw, composerKN, ((i5 >> 12) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                        str6 = str10;
                        composer2 = composerKN;
                        if (str5 != null) {
                            i9 = 6;
                            SpacerKt.n(SizeKt.Z(companion, Dp.KN(2)), composer2, 6);
                        }
                        composer2.Xw();
                        composer2.eF(1165368264);
                        if (str5 != null) {
                            TextStyle textStyleS7N = H9N.j.f3810n.rl(composer2, i9).s7N();
                            str7 = str5;
                            TextKt.t(str7, null, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleS7N, composer2, ((i8 >> 15) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                        } else {
                            str7 = str5;
                        }
                        composer2.Xw();
                        composer2.eF(1165374730);
                        if (str6 == null && str7 == null) {
                            i10 = 8;
                        } else {
                            i10 = 8;
                            SpacerKt.n(SizeKt.Z(companion, Dp.KN(8)), composer2, 6);
                        }
                        composer2.Xw();
                        mUb(items, obj, getItemName, onItemSelected, composer2, (i8 & 7168) | ((i10 & (i8 >> 3)) << 3) | (i8 & 14) | (i8 & 112) | (i8 & 896));
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        str8 = str6;
                        str9 = str7;
                    } else {
                        str6 = str3;
                        composer2 = composerKN;
                        i8 = i5;
                    }
                    i9 = 6;
                    composer2.Xw();
                    composer2.eF(1165368264);
                    if (str5 != null) {
                    }
                    composer2.Xw();
                    composer2.eF(1165374730);
                    if (str6 == null) {
                        i10 = 8;
                        SpacerKt.n(SizeKt.Z(companion, Dp.KN(8)), composer2, 6);
                        composer2.Xw();
                        mUb(items, obj, getItemName, onItemSelected, composer2, (i8 & 7168) | ((i10 & (i8 >> 3)) << 3) | (i8 & 14) | (i8 & 112) | (i8 & 896));
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        str8 = str6;
                        str9 = str7;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: u.j
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return Dsr.xMQ(items, obj, getItemName, onItemSelected, str8, str9, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 196608;
            str4 = str2;
            if ((74899 & i5) == 74898) {
                if (i11 != 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyN2, companion22.t());
                Updater.O(composerN, compositionLocalMapIk2, companion22.O());
                function2Rl = companion22.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion22.nr());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                    composerKN.eF(1165358604);
                    if (str3 == null) {
                    }
                    i9 = 6;
                    composer2.Xw();
                    composer2.eF(1165368264);
                    if (str5 != null) {
                    }
                    composer2.Xw();
                    composer2.eF(1165374730);
                    if (str6 == null) {
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        str3 = str;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        str4 = str2;
        if ((74899 & i5) == 74898) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(String str, Modifier modifier, Integer num, int i2, int i3, Composer composer, int i5) {
        Z(str, modifier, num, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Z(final String str, Modifier modifier, Integer num, Composer composer, final int i2, final int i3) {
        String str2;
        int i5;
        Modifier modifier2;
        int i7;
        Integer num2;
        Integer num3;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        final Modifier modifier3;
        final Integer num4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(594742885);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            str2 = str;
        } else if ((i2 & 6) == 0) {
            str2 = str;
            i5 = (composerKN.p5(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    num2 = num;
                    i5 |= composerKN.p5(num2) ? 256 : 128;
                }
                if ((i5 & 147) == 146 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    num4 = num2;
                } else {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    num3 = i7 == 0 ? null : num2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(594742885, i5, -1, "com.alightcreative.maineditor.templateimport.ui.components.DropdownListItem (AlightDropdownList.kt:152)");
                    }
                    Modifier modifierNr = BackgroundKt.nr(SizeKt.xMQ(modifier4, Dp.KN(48)), aD.w6.v0j(), null, 2, null);
                    MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.xMQ(), composerKN, 48);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion.n();
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
                    Updater.O(composerN, measurePolicyRl, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    function2Rl = companion.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    float f3 = 16;
                    SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f3)), composerKN, 6);
                    TextKt.t(str2, RowScope.rl(rowScopeInstance, companion2, 1.0f, false, 2, null), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).v(), composerKN, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                    composerKN = composerKN;
                    composerKN.eF(-1230338365);
                    if (num3 != null) {
                        SpacerKt.n(SizeKt.Z(companion2, Dp.KN(12)), composerKN, 6);
                        ImageKt.n(PainterResources_androidKt.t(num3.intValue(), composerKN, (i5 >> 6) & 14), null, SizeKt.Z(companion2, Dp.KN(24)), null, ContentScale.INSTANCE.Uo(), 0.0f, null, composerKN, 25008, 104);
                    }
                    composerKN.Xw();
                    SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f3)), composerKN, 6);
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                    num4 = num3;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: u.CN3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Dsr.XQ(str, modifier3, num4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            num2 = num;
            if ((i5 & 147) == 146) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier modifierNr2 = BackgroundKt.nr(SizeKt.xMQ(modifier4, Dp.KN(48)), aD.w6.v0j(), null, 2, null);
                MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.xMQ(), composerKN, 48);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierNr2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion3.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyRl2, companion3.t());
                Updater.O(composerN, compositionLocalMapIk2, companion3.O());
                function2Rl = companion3.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion3.nr());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    float f32 = 16;
                    SpacerKt.n(SizeKt.Z(companion22, Dp.KN(f32)), composerKN, 6);
                    TextKt.t(str2, RowScope.rl(rowScopeInstance2, companion22, 1.0f, false, 2, null), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).v(), composerKN, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                    composerKN = composerKN;
                    composerKN.eF(-1230338365);
                    if (num3 != null) {
                    }
                    composerKN.Xw();
                    SpacerKt.n(SizeKt.Z(companion22, Dp.KN(f32)), composerKN, 6);
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                    }
                    modifier3 = modifier4;
                    num4 = num3;
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        num2 = num;
        if ((i5 & 147) == 146) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier gh(Modifier runIf) {
        Intrinsics.checkNotNullParameter(runIf, "$this$runIf");
        return nY(runIf);
    }

    private static final void mUb(final List list, final Object obj, final Function2 function2, final Function1 function1, Composer composer, final int i2) {
        List list2;
        int i3;
        Function1 function12;
        Composer composerKN = composer.KN(-1246991946);
        if ((i2 & 6) == 0) {
            list2 = list;
            i3 = (composerKN.E2(list2) ? 4 : 2) | i2;
        } else {
            list2 = list;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerKN.p5(obj) : composerKN.E2(obj) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function12 = function1;
            i3 |= composerKN.E2(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1246991946, i3, -1, "com.alightcreative.maineditor.templateimport.ui.components.DropdownList (AlightDropdownList.kt:95)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            composerKN.eF(-97794567);
            Object objIF = composerKN.iF();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objIF == companion3.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(IntSize.rl(IntSize.INSTANCE.n()), null, 2, null);
                composerKN.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(-97792398);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion3.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF2);
            }
            final MutableState mutableState2 = (MutableState) objIF2;
            composerKN.Xw();
            String str = (String) function2.invoke(obj, composerKN.ty(AndroidCompositionLocals_androidKt.Uo()));
            composerKN.eF(-97784468);
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion3.n()) {
                objIF3 = new Function0() { // from class: u.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Dsr.r(mutableState2);
                    }
                };
                composerKN.o(objIF3);
            }
            composerKN.Xw();
            Modifier modifierJ2 = ClickableKt.J2(companion, false, null, null, (Function0) objIF3, 7, null);
            boolean z2 = !ck(mutableState2);
            composerKN.eF(-97782399);
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion3.n()) {
                objIF4 = new Function1() { // from class: u.w6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Dsr.gh((Modifier) obj2);
                    }
                };
                composerKN.o(objIF4);
            }
            composerKN.Xw();
            Modifier modifierN = N.o.n(modifierJ2, z2, (Function1) objIF4);
            composerKN.eF(-97779139);
            Object objIF5 = composerKN.iF();
            if (objIF5 == companion3.n()) {
                objIF5 = new Function1() { // from class: u.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Dsr.qie(mutableState, (IntSize) obj2);
                    }
                };
                composerKN.o(objIF5);
            }
            composerKN.Xw();
            Z(str, ClipKt.n(OnRemeasuredModifierKt.n(modifierN, (Function1) objIF5), RoundedCornerShapeKt.t(Dp.KN(12))), 2131231667, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            composerKN.eF(-97774888);
            if (ck(mutableState2)) {
                composerKN.eF(-97774170);
                Object objIF6 = composerKN.iF();
                if (objIF6 == companion3.n()) {
                    objIF6 = new Function0() { // from class: u.I28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Dsr.az(mutableState2);
                        }
                    };
                    composerKN.o(objIF6);
                }
                composerKN.Xw();
                AndroidPopup_androidKt.t(null, 0L, (Function0) objIF6, null, ComposableLambdaKt.nr(-371845608, true, new j(list2, obj, function2, function12, mutableState, mutableState2), composerKN, 54), composerKN, 24960, 11);
                composerKN = composerKN;
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: u.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Dsr.o(list, obj, function2, function1, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(List list, Object obj, Function2 function2, Function1 function1, int i2, Composer composer, int i3) {
        mUb(list, obj, function2, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(List list, Object obj, Function2 function2, Function1 function1, String str, String str2, int i2, int i3, Composer composer, int i5) {
        KN(list, obj, function2, function1, str, str2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final void HI(MutableState mutableState, long j2) {
        mutableState.setValue(IntSize.rl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ik(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final boolean ck(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(MutableState mutableState, IntSize intSize) {
        HI(mutableState, intSize.getPackedValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(MutableState mutableState) {
        Ik(mutableState, !ck(mutableState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ty(MutableState mutableState) {
        return ((IntSize) mutableState.getValue()).getPackedValue();
    }
}
