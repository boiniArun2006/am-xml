package zT;

import Dj7.YzO;
import KA9.AbstractC1381p;
import KA9.Sis;
import KA9.iF;
import KA9.mz;
import M.eZk;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KFunction;
import six.I28;
import zT.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ln {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class j implements Function2 {
        final /* synthetic */ List E2;
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ boolean f76568N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ eZk.j f76569O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ List f76570S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ MutableState f76571T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ Function1 f76572X;
        final /* synthetic */ BitmapLruCache Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function0 f76573Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f76574e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f76575g;
        final /* synthetic */ SceneThumbnailMaker jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LazyListState f76576n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f76577o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ eQ.fuX f76578r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ I28.n f76579t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function1 f76580v;

        public static final class CN3 extends Lambda implements Function4 {
            final /* synthetic */ BitmapLruCache E2;
            final /* synthetic */ I28.n J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ List f76581O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ boolean f76582S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ MutableState f76583Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ SceneThumbnailMaker f76584e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1 f76585g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f76586n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function1 f76587o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ boolean f76588r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f76589t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CN3(List list, List list2, List list3, I28.n nVar, boolean z2, Function1 function1, MutableState mutableState, boolean z3, Function1 function12, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker) {
                super(4);
                this.f76586n = list;
                this.f76589t = list2;
                this.f76581O = list3;
                this.J2 = nVar;
                this.f76588r = z2;
                this.f76587o = function1;
                this.f76583Z = mutableState;
                this.f76582S = z3;
                this.f76585g = function12;
                this.E2 = bitmapLruCache;
                this.f76584e = sceneThumbnailMaker;
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
                ProjectInfo.n nVar = (ProjectInfo.n) this.f76586n.get(i2);
                composer.eF(-1499799471);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierGh = PaddingKt.gh(companion, Dp.KN(16), 0.0f, 2, null);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
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
                Updater.O(composerN, measurePolicyUo, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                Function2 function2Rl = companion2.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                boolean zContains = this.f76589t.contains(nVar);
                String str = (String) this.f76581O.get(i2);
                boolean zRl = this.J2.rl();
                boolean z2 = this.f76588r;
                composer.eF(-627144963);
                boolean zP5 = composer.p5(this.f76587o) | composer.p5(nVar);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new w6(this.f76587o, nVar);
                    composer.o(objIF);
                }
                Function0 function0 = (Function0) objIF;
                composer.Xw();
                composer.eF(-627142555);
                boolean zP52 = composer.p5(this.J2) | ((((i5 & 112) ^ 48) > 32 && composer.t(i2)) || (i5 & 48) == 32);
                Object objIF2 = composer.iF();
                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Ml(this.J2, i2);
                    composer.o(objIF2);
                }
                Function0 function02 = (Function0) objIF2;
                composer.Xw();
                MutableState mutableState = this.f76583Z;
                boolean z3 = this.f76582S;
                composer.eF(-627133227);
                boolean zP53 = composer.p5(this.f76585g) | composer.p5(nVar);
                Object objIF3 = composer.iF();
                if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new I28(this.f76585g, nVar);
                    composer.o(objIF3);
                }
                composer.Xw();
                KA9.UGc.KN(nVar, zContains, z2, str, function0, function02, mutableState, z3, zRl, (Function0) objIF3, this.E2, this.f76584e, null, composer, 0, 0, 4096);
                composer.XQ();
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(12)), composer, 6);
                composer.Xw();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        static final class I28 implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f76590n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ProjectInfo.n f76591t;

            I28(Function1 function1, ProjectInfo.n nVar) {
                this.f76590n = function1;
                this.f76591t = nVar;
            }

            public final void n() {
                this.f76590n.invoke(this.f76591t);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        static final class Ml implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ I28.n f76592n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f76593t;

            Ml(I28.n nVar, int i2) {
                this.f76592n = nVar;
                this.f76593t = i2;
            }

            public final void n() {
                this.f76592n.Uo(Integer.valueOf(this.f76593t));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        public static final class Wre extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f76594n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Wre(List list) {
                super(1);
                this.f76594n = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n(((Number) obj).intValue());
            }

            public final Object n(int i2) {
                this.f76594n.get(i2);
                return null;
            }
        }

        /* JADX INFO: renamed from: zT.Ln$j$j, reason: collision with other inner class name */
        static final class C1300j implements Function3 {
            final /* synthetic */ eQ.fuX J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f76595O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ eZk.j f76596n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function0 f76597o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function1 f76598r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28.n f76599t;

            C1300j(eZk.j jVar, I28.n nVar, Function0 function0, eQ.fuX fux, Function1 function1, Function0 function02) {
                this.f76596n = jVar;
                this.f76599t = nVar;
                this.f76595O = function0;
                this.J2 = fux;
                this.f76598r = function1;
                this.f76597o = function02;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                rl((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void rl(LazyItemScope item, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i2 & 17) == 16 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1404741907, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.TemplateList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TemplateList.kt:94)");
                }
                composer.eF(-1988102165);
                if (this.f76596n.O()) {
                    composer.eF(-1988098312);
                    boolean zP5 = composer.p5(this.f76599t) | composer.p5(this.f76595O);
                    final I28.n nVar = this.f76599t;
                    final Function0 function0 = this.f76595O;
                    Object objIF = composer.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: zT.qf
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Ln.j.C1300j.t(nVar, function0);
                            }
                        };
                        composer.o(objIF);
                    }
                    composer.Xw();
                    Sis.t((Function0) objIF, composer, 0, 0);
                    SpacerKt.n(SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(24)), composer, 6);
                }
                composer.Xw();
                if (this.f76596n.n()) {
                    zRY.I28.J2(this.f76596n.rl(), this.J2, this.f76598r, this.f76597o, composer, 0);
                    SpacerKt.n(SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(24)), composer, 6);
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(I28.n nVar, Function0 function0) {
                nVar.O();
                function0.invoke();
                return Unit.INSTANCE;
            }
        }

        static final class n implements Function4 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ eZk.j f76600n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28.n f76601t;

            /* JADX INFO: renamed from: zT.Ln$j$n$j, reason: collision with other inner class name */
            /* synthetic */ class C1301j extends FunctionReferenceImpl implements Function0 {
                C1301j(Object obj) {
                    super(0, obj, I28.n.class, "onSortMenuTriggered", "onSortMenuTriggered()V", 0);
                }

                public final void n() {
                    ((I28.n) this.receiver).KN();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    n();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: zT.Ln$j$n$n, reason: collision with other inner class name */
            public /* synthetic */ class C1302n {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[KA9.u.values().length];
                    try {
                        iArr[KA9.u.f5007n.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KA9.u.f5008t.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            n(eZk.j jVar, I28.n nVar) {
                this.f76600n = jVar;
                this.f76601t = nVar;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyItemScope stickyHeader, int i2, Composer composer, int i3) {
                String strT;
                Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                if ((i3 & 129) == 128 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1505161991, i3, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.TemplateList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TemplateList.kt:116)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierNr = BackgroundKt.nr(companion, aD.w6.W(), null, 2, null);
                eZk.j jVar = this.f76600n;
                I28.n nVar = this.f76601t;
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer, 0);
                int iN = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk = composer.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer, modifierNr);
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
                Updater.O(composerN, measurePolicyN, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                Function2 function2Rl = companion2.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                six.fuX fux = six.fuX.f73288O;
                int i5 = C1302n.$EnumSwitchMapping$0[jVar.nr().ordinal()];
                if (i5 == 1) {
                    composer.eF(-627173718);
                    strT = StringResources_androidKt.t(2132020184, composer, 6);
                    composer.Xw();
                } else {
                    if (i5 != 2) {
                        composer.eF(-627176653);
                        composer.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.eF(-627170390);
                    strT = StringResources_androidKt.t(2132020183, composer, 6);
                    composer.Xw();
                }
                composer.eF(-627166431);
                boolean zP5 = composer.p5(nVar);
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new C1301j(nVar);
                    composer.o(objIF);
                }
                composer.Xw();
                AbstractC1381p.rl(fux, strT, (Function0) ((KFunction) objIF), composer, 6);
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(12)), composer, 6);
                composer.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        static final class w6 implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f76602n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ProjectInfo.n f76603t;

            w6(Function1 function1, ProjectInfo.n nVar) {
                this.f76602n = function1;
                this.f76603t = nVar;
            }

            public final void n() {
                this.f76602n.invoke(this.f76603t);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        j(LazyListState lazyListState, I28.n nVar, eZk.j jVar, Function0 function0, eQ.fuX fux, Function1 function1, Function0 function02, List list, List list2, List list3, boolean z2, Function1 function12, MutableState mutableState, boolean z3, Function1 function13, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker) {
            this.f76576n = lazyListState;
            this.f76579t = nVar;
            this.f76569O = jVar;
            this.J2 = function0;
            this.f76578r = fux;
            this.f76577o = function1;
            this.f76573Z = function02;
            this.f76570S = list;
            this.f76575g = list2;
            this.E2 = list3;
            this.f76574e = z2;
            this.f76572X = function12;
            this.f76571T = mutableState;
            this.f76568N = z3;
            this.f76580v = function13;
            this.Xw = bitmapLruCache;
            this.jB = sceneThumbnailMaker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(List list, eZk.j jVar, I28.n nVar, Function0 function0, eQ.fuX fux, Function1 function1, Function0 function02, List list2, List list3, boolean z2, Function1 function12, MutableState mutableState, boolean z3, Function1 function13, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.O(LazyColumn, null, null, ComposableLambdaKt.rl(-1404741907, true, new C1300j(jVar, nVar, function0, fux, function1, function02)), 3, null);
            LazyListScope.az(LazyColumn, null, null, ComposableLambdaKt.rl(-1505161991, true, new n(jVar, nVar)), 3, null);
            LazyColumn.qie(list.size(), null, new Wre(list), ComposableLambdaKt.rl(-1091073711, true, new CN3(list, list2, list3, nVar, z2, function12, mutableState, z3, function13, bitmapLruCache, sceneThumbnailMaker)));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1578591640, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.TemplateList.<anonymous>.<anonymous> (TemplateList.kt:87)");
            }
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            LazyListState lazyListState = this.f76576n;
            boolean zRl = this.f76579t.rl();
            composer.eF(-965252162);
            boolean zE2 = composer.E2(this.f76569O) | composer.p5(this.f76579t) | composer.p5(this.J2) | composer.E2(this.f76578r) | composer.p5(this.f76577o) | composer.p5(this.f76573Z) | composer.E2(this.f76570S) | composer.E2(this.f76575g) | composer.E2(this.E2) | composer.n(this.f76574e) | composer.p5(this.f76572X) | composer.p5(this.f76571T) | composer.n(this.f76568N) | composer.p5(this.f76580v) | composer.p5(this.Xw) | composer.E2(this.jB);
            final List list = this.f76570S;
            final eZk.j jVar = this.f76569O;
            final I28.n nVar = this.f76579t;
            final Function0 function0 = this.J2;
            final eQ.fuX fux = this.f76578r;
            final Function1 function1 = this.f76577o;
            final Function0 function02 = this.f76573Z;
            final List list2 = this.f76575g;
            final List list3 = this.E2;
            final boolean z2 = this.f76574e;
            final Function1 function12 = this.f76572X;
            final MutableState mutableState = this.f76571T;
            final boolean z3 = this.f76568N;
            final Function1 function13 = this.f76580v;
            final BitmapLruCache bitmapLruCache = this.Xw;
            final SceneThumbnailMaker sceneThumbnailMaker = this.jB;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                Function1 function14 = new Function1() { // from class: zT.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Ln.j.t(list, jVar, nVar, function0, fux, function1, function02, list2, list3, z2, function12, mutableState, z3, function13, bitmapLruCache, sceneThumbnailMaker, (LazyListScope) obj);
                    }
                };
                composer.o(function14);
                objIF = function14;
            }
            composer.Xw();
            LazyDslKt.rl(modifierJ2, lazyListState, null, false, null, null, null, zRl, null, (Function1) objIF, composer, 6, 380);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final eZk.j viewState, final I28.n listTabState, final List templateList, final boolean z2, final MutableState mutableState, boolean z3, final List selectedProjects, final Function1 onSortSelected, Function1 function1, Function1 function12, Function0 function0, final BitmapLruCache thumbnailCache, SceneThumbnailMaker sceneThumbnailMaker, final eQ.fuX imageLoader, final Function1 onItemClicked, final Function0 onSeeAllClicked, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        boolean z4;
        MutableState mutableState2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z5;
        Function1 function13;
        Function1 function14;
        Function1 function15;
        Function1 function16;
        Function0 function02;
        Function0 function03;
        Object objIF;
        State state;
        Iterator it;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        final Function1 function17;
        final boolean z6;
        final Function1 function18;
        final Function0 function04;
        final SceneThumbnailMaker sceneThumbnailMaker2;
        Object obj;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(listTabState, "listTabState");
        Intrinsics.checkNotNullParameter(templateList, "templateList");
        Intrinsics.checkNotNullParameter(selectedProjects, "selectedProjects");
        Intrinsics.checkNotNullParameter(onSortSelected, "onSortSelected");
        Intrinsics.checkNotNullParameter(thumbnailCache, "thumbnailCache");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Intrinsics.checkNotNullParameter(onSeeAllClicked, "onSeeAllClicked");
        Composer composerKN = composer.KN(1723464146);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(viewState) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.p5(listTabState) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(templateList) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i7 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                z4 = z2;
                i7 |= composerKN.n(z4) ? 2048 : 1024;
            }
            if ((i5 & 16) == 0) {
                i7 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    mutableState2 = mutableState;
                    i7 |= composerKN.p5(mutableState2) ? 16384 : 8192;
                }
                i8 = i5 & 32;
                if (i8 != 0) {
                    i7 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i7 |= composerKN.n(z3) ? 131072 : 65536;
                }
                if ((i5 & 64) == 0) {
                    i18 = (i2 & 1572864) == 0 ? composerKN.E2(selectedProjects) ? 1048576 : 524288 : 1572864;
                    if ((i5 & 128) != 0) {
                        i17 = (12582912 & i2) == 0 ? composerKN.E2(onSortSelected) ? 8388608 : 4194304 : 12582912;
                        i9 = i5 & 256;
                        if (i9 != 0) {
                            i7 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i7 |= composerKN.E2(function1) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i10 = i5 & 512;
                        if (i10 == 0) {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i11 = i10;
                                i7 |= composerKN.E2(function12) ? 536870912 : 268435456;
                            }
                            i12 = i5 & 1024;
                            if (i12 == 0) {
                                i14 = i3 | 6;
                                i13 = i12;
                            } else if ((i3 & 6) == 0) {
                                i13 = i12;
                                i14 = i3 | (composerKN.E2(function0) ? 4 : 2);
                            } else {
                                i13 = i12;
                                i14 = i3;
                            }
                            if ((i5 & 2048) == 0) {
                                i14 |= 48;
                            } else if ((i3 & 48) == 0) {
                                i14 |= composerKN.p5(thumbnailCache) ? 32 : 16;
                            }
                            int i19 = i14;
                            i15 = i5 & 4096;
                            if (i15 == 0) {
                                i16 = i19 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i20 = i19;
                                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i20 |= composerKN.E2(sceneThumbnailMaker) ? 256 : 128;
                                }
                                i16 = i20;
                            }
                            if ((i5 & 8192) == 0) {
                                i16 |= 3072;
                            } else if ((i3 & 3072) == 0) {
                                i16 |= composerKN.E2(imageLoader) ? 2048 : 1024;
                            }
                            if ((i5 & 16384) == 0) {
                                i16 |= 24576;
                            } else if ((i3 & 24576) == 0) {
                                i16 |= composerKN.E2(onItemClicked) ? 16384 : 8192;
                            }
                            if ((32768 & i5) == 0) {
                                i16 |= 196608;
                            } else if ((i3 & 196608) == 0) {
                                i16 |= composerKN.E2(onSeeAllClicked) ? 131072 : 65536;
                            }
                            if ((306783379 & i7) != 306783378 && (74899 & i16) == 74898 && composerKN.xMQ()) {
                                composerKN.wTp();
                                z6 = z3;
                                function17 = function1;
                                function04 = function0;
                                sceneThumbnailMaker2 = sceneThumbnailMaker;
                                composer2 = composerKN;
                                function18 = function12;
                            } else {
                                boolean z7 = i8 == 0 ? true : z3;
                                if (i9 == 0) {
                                    composerKN.eF(1472860296);
                                    Object objIF2 = composerKN.iF();
                                    z5 = z7;
                                    if (objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = new Function1() { // from class: zT.afx
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return Ln.Uo((ProjectInfo.n) obj2);
                                            }
                                        };
                                        composerKN.o(objIF2);
                                    }
                                    function13 = (Function1) objIF2;
                                    composerKN.Xw();
                                } else {
                                    z5 = z7;
                                    function13 = function1;
                                }
                                if (i11 == 0) {
                                    composerKN.eF(1472861832);
                                    Object objIF3 = composerKN.iF();
                                    function14 = function13;
                                    if (objIF3 == Composer.INSTANCE.n()) {
                                        objIF3 = new Function1() { // from class: zT.Z
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return Ln.xMQ((ProjectInfo.n) obj2);
                                            }
                                        };
                                        composerKN.o(objIF3);
                                    }
                                    function15 = (Function1) objIF3;
                                    composerKN.Xw();
                                } else {
                                    function14 = function13;
                                    function15 = function12;
                                }
                                if (i13 == 0) {
                                    composerKN.eF(1472863240);
                                    Object objIF4 = composerKN.iF();
                                    function16 = function15;
                                    if (objIF4 == Composer.INSTANCE.n()) {
                                        objIF4 = new Function0() { // from class: zT.Ew
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Ln.mUb();
                                            }
                                        };
                                        composerKN.o(objIF4);
                                    }
                                    function02 = (Function0) objIF4;
                                    composerKN.Xw();
                                } else {
                                    function16 = function15;
                                    function02 = function0;
                                }
                                SceneThumbnailMaker sceneThumbnailMaker3 = i15 == 0 ? null : sceneThumbnailMaker;
                                if (ComposerKt.v()) {
                                    function03 = function02;
                                } else {
                                    function03 = function02;
                                    ComposerKt.p5(1723464146, i7, i16, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.TemplateList (TemplateList.kt:64)");
                                }
                                final LazyListState lazyListStateRl = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
                                composerKN.eF(1472872886);
                                objIF = composerKN.iF();
                                if (objIF == Composer.INSTANCE.n()) {
                                    objIF = SnapshotStateKt.O(new Function0() { // from class: zT.nKK
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Boolean.valueOf(Ln.gh(lazyListStateRl));
                                        }
                                    });
                                    composerKN.o(objIF);
                                }
                                state = (State) objIF;
                                composerKN.Xw();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(templateList, 10));
                                it = templateList.iterator();
                                int i21 = 0;
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    int i22 = i21 + 1;
                                    if (i21 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    long lastModified = ((ProjectInfo.n) next).getLastModified();
                                    LazyListState lazyListState = lazyListStateRl;
                                    String strN = six.aC.n(lastModified);
                                    Iterator it2 = it;
                                    if (viewState.nr() != KA9.u.f5008t || (i21 != 0 && Intrinsics.areEqual(strN, six.aC.n(((ProjectInfo.n) templateList.get(i21 - 1)).getLastModified())))) {
                                        strN = null;
                                    }
                                    arrayList.add(strN);
                                    lazyListStateRl = lazyListState;
                                    i21 = i22;
                                    it = it2;
                                }
                                LazyListState lazyListState2 = lazyListStateRl;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
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
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                function2Rl = companion2.rl();
                                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                Function0 function05 = function03;
                                boolean z9 = z5;
                                Function1 function19 = function16;
                                int i23 = i7;
                                Function1 function110 = function14;
                                CompositionLocalKt.rl(OverscrollConfiguration_androidKt.n().nr(null), ComposableLambdaKt.nr(1578591640, true, new j(lazyListState2, listTabState, viewState, function05, imageLoader, onItemClicked, onSeeAllClicked, templateList, selectedProjects, arrayList, z4, function110, mutableState2, z9, function19, thumbnailCache, sceneThumbnailMaker3), composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                                composerKN.eF(-2089631570);
                                if (((Boolean) state.getValue()).booleanValue()) {
                                    composer2 = composerKN;
                                } else {
                                    composer2 = composerKN;
                                    YzO.rl(aD.w6.tFV(), SizeKt.xMQ(PaddingKt.az(companion, 0.0f, Dp.KN(36), 0.0f, 0.0f, 13, null), Dp.KN(25)), null, composer2, 54, 4);
                                }
                                composer2.Xw();
                                composer2.eF(-2089621478);
                                if (listTabState.nr()) {
                                    KA9.u uVarNr = viewState.nr();
                                    Density density = (Density) composer2.ty(CompositionLocalsKt.J2());
                                    Iterator it3 = lazyListState2.aYN().getVisibleItemsInfo().iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        Object next2 = it3.next();
                                        if (((LazyListItemInfo) next2).getIndex() > 0) {
                                            obj = next2;
                                            break;
                                        }
                                    }
                                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj;
                                    iF.rl(boxScopeInstance, uVarNr, onSortSelected, Dp.KN(density.rV9(lazyListItemInfo != null ? lazyListItemInfo.getOffset() : 0) + Dp.KN(36)), composer2, 6 | ((i23 >> 15) & 896), 0);
                                }
                                composer2.Xw();
                                composer2.XQ();
                                if (viewState.t() != null) {
                                    mz.rl(r0.intValue() * 0.01f, composer2, 0);
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                function17 = function110;
                                z6 = z9;
                                function18 = function19;
                                function04 = function05;
                                sceneThumbnailMaker2 = sceneThumbnailMaker3;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2() { // from class: zT.DAz
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return Ln.KN(viewState, listTabState, templateList, z2, mutableState, z6, selectedProjects, onSortSelected, function17, function18, function04, thumbnailCache, sceneThumbnailMaker2, imageLoader, onItemClicked, onSeeAllClicked, i2, i3, i5, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i11 = i10;
                        i12 = i5 & 1024;
                        if (i12 == 0) {
                        }
                        if ((i5 & 2048) == 0) {
                        }
                        int i192 = i14;
                        i15 = i5 & 4096;
                        if (i15 == 0) {
                        }
                        if ((i5 & 8192) == 0) {
                        }
                        if ((i5 & 16384) == 0) {
                        }
                        if ((32768 & i5) == 0) {
                        }
                        if ((306783379 & i7) != 306783378) {
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (ComposerKt.v()) {
                            }
                            final LazyListState lazyListStateRl2 = LazyListStateKt.rl(0, 0, composerKN, 0, 3);
                            composerKN.eF(1472872886);
                            objIF = composerKN.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                            }
                            state = (State) objIF;
                            composerKN.Xw();
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(templateList, 10));
                            it = templateList.iterator();
                            int i212 = 0;
                            while (it.hasNext()) {
                            }
                            LazyListState lazyListState22 = lazyListStateRl2;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
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
                            Updater.O(composerN, measurePolicyUo2, companion22.t());
                            Updater.O(composerN, compositionLocalMapIk2, companion22.O());
                            function2Rl = companion22.rl();
                            if (!composerN.getInserting()) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                                Updater.O(composerN, modifierO2, companion22.nr());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                                Function0 function052 = function03;
                                boolean z92 = z5;
                                Function1 function192 = function16;
                                int i232 = i7;
                                Function1 function1102 = function14;
                                CompositionLocalKt.rl(OverscrollConfiguration_androidKt.n().nr(null), ComposableLambdaKt.nr(1578591640, true, new j(lazyListState22, listTabState, viewState, function052, imageLoader, onItemClicked, onSeeAllClicked, templateList, selectedProjects, arrayList2, z4, function1102, mutableState2, z92, function192, thumbnailCache, sceneThumbnailMaker3), composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                                composerKN.eF(-2089631570);
                                if (((Boolean) state.getValue()).booleanValue()) {
                                }
                                composer2.Xw();
                                composer2.eF(-2089621478);
                                if (listTabState.nr()) {
                                }
                                composer2.Xw();
                                composer2.XQ();
                                if (viewState.t() != null) {
                                }
                                if (ComposerKt.v()) {
                                }
                                function17 = function1102;
                                z6 = z92;
                                function18 = function192;
                                function04 = function052;
                                sceneThumbnailMaker2 = sceneThumbnailMaker3;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i7 |= i17;
                    i9 = i5 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i5 & 512;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    i12 = i5 & 1024;
                    if (i12 == 0) {
                    }
                    if ((i5 & 2048) == 0) {
                    }
                    int i1922 = i14;
                    i15 = i5 & 4096;
                    if (i15 == 0) {
                    }
                    if ((i5 & 8192) == 0) {
                    }
                    if ((i5 & 16384) == 0) {
                    }
                    if ((32768 & i5) == 0) {
                    }
                    if ((306783379 & i7) != 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i7 |= i18;
                if ((i5 & 128) != 0) {
                }
                i7 |= i17;
                i9 = i5 & 256;
                if (i9 != 0) {
                }
                i10 = i5 & 512;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i5 & 1024;
                if (i12 == 0) {
                }
                if ((i5 & 2048) == 0) {
                }
                int i19222 = i14;
                i15 = i5 & 4096;
                if (i15 == 0) {
                }
                if ((i5 & 8192) == 0) {
                }
                if ((i5 & 16384) == 0) {
                }
                if ((32768 & i5) == 0) {
                }
                if ((306783379 & i7) != 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            mutableState2 = mutableState;
            i8 = i5 & 32;
            if (i8 != 0) {
            }
            if ((i5 & 64) == 0) {
            }
            i7 |= i18;
            if ((i5 & 128) != 0) {
            }
            i7 |= i17;
            i9 = i5 & 256;
            if (i9 != 0) {
            }
            i10 = i5 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i5 & 1024;
            if (i12 == 0) {
            }
            if ((i5 & 2048) == 0) {
            }
            int i192222 = i14;
            i15 = i5 & 4096;
            if (i15 == 0) {
            }
            if ((i5 & 8192) == 0) {
            }
            if ((i5 & 16384) == 0) {
            }
            if ((32768 & i5) == 0) {
            }
            if ((306783379 & i7) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        z4 = z2;
        if ((i5 & 16) == 0) {
        }
        mutableState2 = mutableState;
        i8 = i5 & 32;
        if (i8 != 0) {
        }
        if ((i5 & 64) == 0) {
        }
        i7 |= i18;
        if ((i5 & 128) != 0) {
        }
        i7 |= i17;
        i9 = i5 & 256;
        if (i9 != 0) {
        }
        i10 = i5 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i5 & 1024;
        if (i12 == 0) {
        }
        if ((i5 & 2048) == 0) {
        }
        int i1922222 = i14;
        i15 = i5 & 4096;
        if (i15 == 0) {
        }
        if ((i5 & 8192) == 0) {
        }
        if ((i5 & 16384) == 0) {
        }
        if ((32768 & i5) == 0) {
        }
        if ((306783379 & i7) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(eZk.j jVar, I28.n nVar, List list, boolean z2, MutableState mutableState, boolean z3, List list2, Function1 function1, Function1 function12, Function1 function13, Function0 function0, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, eQ.fuX fux, Function1 function14, Function0 function02, int i2, int i3, int i5, Composer composer, int i7) {
        J2(jVar, nVar, list, z2, mutableState, z3, list2, function1, function12, function13, function0, bitmapLruCache, sceneThumbnailMaker, fux, function14, function02, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(ProjectInfo.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, PtsLKY.YuBkSidYpBEB);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(ProjectInfo.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gh(LazyListState lazyListState) {
        if (lazyListState.o() >= 1) {
            return true;
        }
        return false;
    }
}
