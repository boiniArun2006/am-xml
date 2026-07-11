package LRV;

import LRV.CN3;
import LRV.j;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ma.AbstractC2298aC;
import ma.InterfaceC2300j;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class CN3 {

    static final class j implements Function2 {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f6087O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ MutableIntState f6088Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LRV.j f6089n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f6090o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ MutableState f6091r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f6092t;

        j(LRV.j jVar, int i2, Function1 function1, Function2 function2, MutableState mutableState, int i3, MutableIntState mutableIntState) {
            this.f6089n = jVar;
            this.f6092t = i2;
            this.f6087O = function1;
            this.J2 = function2;
            this.f6091r = mutableState;
            this.f6090o = i3;
            this.f6088Z = mutableIntState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(MutableState mutableState, int i2, String newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            List mutableList = CollectionsKt.toMutableList((Collection) CN3.O(mutableState));
            mutableList.set(i2, new j.C0210j(newValue));
            CN3.J2(mutableState, mutableList);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        public final void O(Composer composer, int i2) {
            final MutableIntState mutableIntState;
            final MutableState mutableState;
            InterfaceC2300j c1056j;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1059062479, i2, -1, "com.bendingspoons.secretmenu.backendoverride.internal.BackendOverrideContent.<anonymous> (BackendOverrideContent.kt:39)");
            }
            Modifier modifierUo = ScrollKt.Uo(PaddingKt.xMQ(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(15)), ScrollKt.t(0, composer, 0, 1), false, null, true, 6, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(20));
            LRV.j jVar = this.f6089n;
            int i3 = this.f6092t;
            final Function1 function1 = this.f6087O;
            Function2 function2 = this.J2;
            MutableState mutableState2 = this.f6091r;
            int i5 = this.f6090o;
            MutableIntState mutableIntState2 = this.f6088Z;
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, Alignment.INSTANCE.gh(), composer, 6);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierUo);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            int i7 = i3;
            TextKt.t("Endpoint to use:", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            composer.eF(2137200908);
            List listO = CN3.O(mutableState2);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listO, 10));
            int i8 = 0;
            for (Object obj : listO) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                LRV.j jVar2 = (LRV.j) obj;
                int i10 = i7;
                List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{i8 == i5 ? "default" : null, i8 == i10 ? "current" : null});
                String str = listListOfNotNull.isEmpty() ? "" : " (" + CollectionsKt.joinToString$default(listListOfNotNull, ", ", null, null, 0, null, null, 62, null) + ")";
                composer.eF(2137215309);
                if (jVar2 instanceof j.n) {
                    j.n nVar = (j.n) jVar2;
                    c1056j = new InterfaceC2300j.n(nVar.n() + str, nVar.getUrl());
                } else {
                    if (!(jVar2 instanceof j.C0210j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j.C0210j c0210j = (j.C0210j) jVar2;
                    boolean z2 = c0210j.getUrl().length() == 0 && CN3.t(mutableIntState2) != i8;
                    String str2 = c0210j.n() + str;
                    String url = c0210j.getUrl();
                    boolean z3 = z2 || CN3.az(c0210j.getUrl());
                    composer.eF(83613612);
                    Object objIF = composer.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = new Function1() { // from class: LRV.w6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return CN3.j.KN((String) obj2);
                            }
                        };
                        composer.o(objIF);
                    }
                    composer.Xw();
                    c1056j = new InterfaceC2300j.C1056j(str2, url, z3, (Function1) objIF);
                }
                composer.Xw();
                arrayList.add(c1056j);
                i8 = i9;
                i7 = i10;
            }
            int i11 = i7;
            composer.Xw();
            int iT = CN3.t(mutableIntState2);
            composer.eF(2137242078);
            Object objIF2 = composer.iF();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objIF2 == companion2.n()) {
                mutableIntState = mutableIntState2;
                objIF2 = new Function1() { // from class: LRV.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CN3.j.xMQ(mutableIntState, ((Integer) obj2).intValue());
                    }
                };
                composer.o(objIF2);
            } else {
                mutableIntState = mutableIntState2;
            }
            Function1 function12 = (Function1) objIF2;
            composer.Xw();
            composer.eF(2137246136);
            Object objIF3 = composer.iF();
            if (objIF3 == companion2.n()) {
                mutableState = mutableState2;
                objIF3 = new Function2() { // from class: LRV.I28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CN3.j.J2(mutableState, ((Integer) obj2).intValue(), (String) obj3);
                    }
                };
                composer.o(objIF3);
            } else {
                mutableState = mutableState2;
            }
            composer.Xw();
            AbstractC2298aC.J2(arrayList, iT, function12, (Function2) objIF3, composer, 3456);
            boolean z4 = CN3.t(mutableIntState) != i11 && (jVar instanceof j.C0210j ? CN3.az(((j.C0210j) jVar).getUrl()) : true);
            Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
            composer.eF(2137260868);
            boolean zP5 = composer.p5(function1);
            Object objIF4 = composer.iF();
            if (zP5 || objIF4 == companion2.n()) {
                objIF4 = new Function0() { // from class: LRV.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CN3.j.Uo(function1, mutableState, mutableIntState);
                    }
                };
                composer.o(objIF4);
            }
            composer.Xw();
            ButtonKt.n((Function0) objIF4, modifierKN, z4, null, null, null, null, null, null, C.f6083n.rl(), composer, 805306416, 504);
            function2.invoke(composer, 0);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            O((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(Function1 function1, MutableState mutableState, MutableIntState mutableIntState) {
            function1.invoke(CN3.O(mutableState).get(CN3.t(mutableIntState)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(MutableIntState mutableIntState, int i2) {
            CN3.nr(mutableIntState, i2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(List list, int i2, int i3, Function1 function1, Function2 function2, int i5, int i7, Composer composer, int i8) {
        rl(list, i2, i3, function1, function2, composer, RecomposeScopeImplKt.n(i5 | 1), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean az(String str) {
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str);
        return httpUrl != null && httpUrl.getIsHttps() && Intrinsics.areEqual(CollectionsKt.last((List) httpUrl.pathSegments()), "") && StringsKt.contains$default((CharSequence) httpUrl.host(), (CharSequence) ".", false, 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final List endpoints, final int i2, final int i3, final Function1 onApplyChangesClicked, Function2 function2, Composer composer, final int i5, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        Function2 function2N;
        Object objIF;
        Composer.Companion companion;
        Object objIF2;
        final Function2 function22;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        Intrinsics.checkNotNullParameter(onApplyChangesClicked, "onApplyChangesClicked");
        Composer composerKN = composer.KN(-1147604522);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (composerKN.E2(endpoints) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                i9 = i2;
                i8 |= composerKN.t(i9) ? 32 : 16;
            }
            if ((i7 & 4) == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                i10 = i3;
            } else {
                i10 = i3;
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 |= composerKN.t(i10) ? 256 : 128;
                }
            }
            if ((i7 & 8) == 0) {
                i8 |= 3072;
            } else if ((i5 & 3072) == 0) {
                i8 |= composerKN.E2(onApplyChangesClicked) ? 2048 : 1024;
            }
            i11 = i7 & 16;
            if (i11 != 0) {
                if ((i5 & 24576) == 0) {
                    function2N = function2;
                    i8 |= composerKN.E2(function2N) ? 16384 : 8192;
                }
                if ((i8 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    function22 = function2N;
                } else {
                    if (i11 != 0) {
                        function2N = C.f6083n.n();
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1147604522, i8, -1, "com.bendingspoons.secretmenu.backendoverride.internal.BackendOverrideContent (BackendOverrideContent.kt:33)");
                    }
                    composerKN.eF(546539329);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = SnapshotIntStateKt.n(i9);
                        composerKN.o(objIF);
                    }
                    MutableIntState mutableIntState = (MutableIntState) objIF;
                    composerKN.Xw();
                    composerKN.eF(546541843);
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = SnapshotStateKt__SnapshotStateKt.O(endpoints, null, 2, null);
                        composerKN.o(objIF2);
                    }
                    MutableState mutableState = (MutableState) objIF2;
                    composerKN.Xw();
                    Function2 function23 = function2N;
                    SurfaceKt.n(WindowInsetsPadding_androidKt.nr(Modifier.INSTANCE), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1059062479, true, new j((LRV.j) O(mutableState).get(t(mutableIntState)), i2, onApplyChangesClicked, function23, mutableState, i10, mutableIntState), composerKN, 54), composerKN, 12582912, 126);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    function22 = function23;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: LRV.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CN3.Uo(endpoints, i2, i3, onApplyChangesClicked, function22, i5, i7, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i8 |= 24576;
            function2N = function2;
            if ((i8 & 9363) == 9362) {
                if (i11 != 0) {
                }
                if (ComposerKt.v()) {
                }
                composerKN.eF(546539329);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                MutableIntState mutableIntState2 = (MutableIntState) objIF;
                composerKN.Xw();
                composerKN.eF(546541843);
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                }
                MutableState mutableState2 = (MutableState) objIF2;
                composerKN.Xw();
                Function2 function232 = function2N;
                SurfaceKt.n(WindowInsetsPadding_androidKt.nr(Modifier.INSTANCE), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1059062479, true, new j((LRV.j) O(mutableState2).get(t(mutableIntState2)), i2, onApplyChangesClicked, function232, mutableState2, i10, mutableIntState2), composerKN, 54), composerKN, 12582912, 126);
                if (ComposerKt.v()) {
                }
                function22 = function232;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i9 = i2;
        if ((i7 & 4) == 0) {
        }
        if ((i7 & 8) == 0) {
        }
        i11 = i7 & 16;
        if (i11 != 0) {
        }
        function2N = function2;
        if ((i8 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(MutableState mutableState, List list) {
        mutableState.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List O(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(MutableIntState mutableIntState, int i2) {
        mutableIntState.KN(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(MutableIntState mutableIntState) {
        return mutableIntState.J2();
    }
}
