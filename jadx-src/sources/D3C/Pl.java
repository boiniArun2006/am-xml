package D3C;

import D3C.Pl;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.time.Kw.znsSxz;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Pl {

    static final class I28 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f1206n;

        I28(Function0 function0) {
            this.f1206n = function0;
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
                ComposerKt.p5(1568248299, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.NewTemplatesSection.<anonymous> (HomeScreenContent.kt:103)");
            }
            Pl.ty(this.f1206n, null, composer, 0, 2);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class Ml implements Function2 {
        final /* synthetic */ BitmapLruCache J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f1207O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f1208n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f1209r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f1210t;

        Ml(Function0 function0, List list, Function1 function1, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker) {
            this.f1208n = function0;
            this.f1210t = list;
            this.f1207O = function1;
            this.J2 = bitmapLruCache;
            this.f1209r = sceneThumbnailMaker;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            Composer composer2 = composer;
            if ((i2 & 3) == 2 && composer2.xMQ()) {
                composer2.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(2120092240, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.LatestProjectsSection.<anonymous> (HomeScreenContent.kt:132)");
            }
            Modifier modifierGh = PaddingKt.gh(Modifier.INSTANCE, Dp.KN(20), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(12));
            Function0 function0 = this.f1208n;
            List<ProjectInfo> list = this.f1210t;
            final Function1 function1 = this.f1207O;
            BitmapLruCache bitmapLruCache = this.J2;
            SceneThumbnailMaker sceneThumbnailMaker = this.f1209r;
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, Alignment.INSTANCE.gh(), composer2, 6);
            int iN = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer2, modifierGh);
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            mA.C.rl(function0, null, composer2, 0, 2);
            composer2.eF(-2121359442);
            for (final ProjectInfo projectInfo : list) {
                composer2.eF(1616900644);
                boolean zP5 = composer2.p5(function1) | composer2.p5(projectInfo);
                Object objIF = composer2.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: D3C.Xo
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Pl.Ml.t(function1, projectInfo);
                        }
                    };
                    composer2.o(objIF);
                }
                composer2.Xw();
                KA9.UGc.KN(projectInfo, false, false, null, (Function0) objIF, null, null, false, false, null, bitmapLruCache, sceneThumbnailMaker, null, composer2, 12583344, 0, 4968);
                composer2 = composer;
                function1 = function1;
            }
            composer.Xw();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function1 function1, ProjectInfo projectInfo) {
            function1.invoke(projectInfo);
            return Unit.INSTANCE;
        }
    }

    static final class Wre implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ eQ.fuX f1211O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f1212n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f1213t;

        Wre(List list, Function1 function1, eQ.fuX fux) {
            this.f1212n = list;
            this.f1213t = function1;
            this.f1211O = fux;
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
                ComposerKt.p5(-517594516, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.NewTemplatesSection.<anonymous> (HomeScreenContent.kt:106)");
            }
            if (this.f1212n != null) {
                composer.eF(1890574627);
                PB.C.Uo(this.f1212n, this.f1213t, null, PaddingKt.t(Dp.KN(20), 0.0f, 2, null), this.f1211O, composer, 3072, 4);
                composer.Xw();
            } else {
                composer.eF(1890812180);
                PB.I28.rl(PaddingKt.gh(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(20), 0.0f, 2, null), composer, 6, 0);
                composer.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f1214O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f1215n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f1216t;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public static final class Ml extends Lambda implements Function4 {
            final /* synthetic */ Function0 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f1217O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f1218n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0 f1219t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ml(List list, Function0 function0, Function0 function02, Function0 function03) {
                super(4);
                this.f1218n = list;
                this.f1219t = function0;
                this.f1217O = function02;
                this.J2 = function03;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i5;
                Function0 function0;
                if ((i3 & 6) == 0) {
                    i5 = (composer.p5(lazyItemScope) ? 4 : 2) | i3;
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
                mA.CN3 cn3 = (mA.CN3) this.f1218n.get(i2);
                composer.eF(402688470);
                int i7 = C0045j.$EnumSwitchMapping$0[cn3.ordinal()];
                if (i7 == 1) {
                    function0 = this.f1219t;
                } else if (i7 == 2) {
                    function0 = this.f1217O;
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    function0 = this.J2;
                }
                mA.Wre.t(cn3, function0, null, composer, 0, 4);
                composer.Xw();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public static final class n extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final n f1220n = new n();

            public n() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Object obj) {
                return null;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public static final class w6 extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function1 f1221n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f1222t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w6(Function1 function1, List list) {
                super(1);
                this.f1221n = function1;
                this.f1222t = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return n(((Number) obj).intValue());
            }

            public final Object n(int i2) {
                return this.f1221n.invoke(this.f1222t.get(i2));
            }
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1026251879, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.GetStartedSection.<anonymous> (HomeScreenContent.kt:161)");
            }
            PaddingValues paddingValuesT = PaddingKt.t(Dp.KN(20), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(16));
            composer.eF(-2030774046);
            boolean zP5 = composer.p5(this.f1215n) | composer.p5(this.f1216t) | composer.p5(this.f1214O);
            final Function0 function0 = this.f1215n;
            final Function0 function02 = this.f1216t;
            final Function0 function03 = this.f1214O;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: D3C.qz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Pl.j.t(function0, function02, function03, (LazyListScope) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            LazyDslKt.O(null, null, paddingValuesT, false, horizontalOrVerticalTy, null, null, false, null, (Function1) objIF, composer, 24960, 491);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: renamed from: D3C.Pl$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public /* synthetic */ class C0045j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[mA.CN3.values().length];
                try {
                    iArr[mA.CN3.f70613o.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mA.CN3.f70611Z.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[mA.CN3.f70610S.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        j(Function0 function0, Function0 function02, Function0 function03) {
            this.f1215n = function0;
            this.f1216t = function02;
            this.f1214O = function03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function0 function0, Function0 function02, Function0 function03, LazyListScope lazyListScope) {
            Intrinsics.checkNotNullParameter(lazyListScope, znsSxz.tdPBWgKzkazQKNE);
            EnumEntries enumEntriesNr = mA.CN3.nr();
            lazyListScope.qie(enumEntriesNr.size(), null, new w6(n.f1220n, enumEntriesNr), ComposableLambdaKt.rl(-632812321, true, new Ml(enumEntriesNr, function0, function02, function03)));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function3 {
        final /* synthetic */ SceneThumbnailMaker E2;
        final /* synthetic */ eQ.fuX J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f1223O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function1 f1224S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ Function0 f1225T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ Function0 f1226X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function0 f1227Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f1228e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BitmapLruCache f1229g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f1230n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f1231o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List f1232r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f1233t;

        n(List list, Function1 function1, Function0 function0, eQ.fuX fux, List list2, Function0 function02, Function0 function03, Function1 function12, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, Function0 function04, Function0 function05, Function0 function06) {
            this.f1230n = list;
            this.f1233t = function1;
            this.f1223O = function0;
            this.J2 = fux;
            this.f1232r = list2;
            this.f1231o = function02;
            this.f1227Z = function03;
            this.f1224S = function12;
            this.f1229g = bitmapLruCache;
            this.E2 = sceneThumbnailMaker;
            this.f1228e = function04;
            this.f1226X = function05;
            this.f1225T = function06;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(BoxScope PullToRefreshBox, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(PullToRefreshBox, "$this$PullToRefreshBox");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(674585519, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.HomeScreenContent.<anonymous> (HomeScreenContent.kt:64)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(24));
            Modifier modifierAz = PaddingKt.az(ScrollKt.Uo(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.t(0, composer, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, Dp.KN(16), 7, null);
            List list = this.f1230n;
            Function1 function1 = this.f1233t;
            Function0 function0 = this.f1223O;
            eQ.fuX fux = this.J2;
            List list2 = this.f1232r;
            Function0 function02 = this.f1231o;
            Function0 function03 = this.f1227Z;
            Function1 function12 = this.f1224S;
            BitmapLruCache bitmapLruCache = this.f1229g;
            SceneThumbnailMaker sceneThumbnailMaker = this.E2;
            Function0 function04 = this.f1228e;
            Function0 function05 = this.f1226X;
            Function0 function06 = this.f1225T;
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, Alignment.INSTANCE.gh(), composer, 6);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierAz);
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
            Pl.qie(list, function1, function0, null, fux, composer, 0, 8);
            Pl.mUb(list2, function02, function03, function12, null, bitmapLruCache, sceneThumbnailMaker, composer, 0, 16);
            Pl.J2(function04, function05, function06, null, composer, 0, 8);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f1234n;

        w6(Function0 function0) {
            this.f1234n = function0;
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
                ComposerKt.p5(-570871183, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.LatestProjectsSection.<anonymous> (HomeScreenContent.kt:129)");
            }
            Pl.ty(this.f1234n, null, composer, 0, 2);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final List list, final List projects, final Function0 onViewAllTemplatesClicked, final Function1 onTagClicked, final Function0 onViewAllProjectsClicked, final Function0 onCreateProjectClicked, final Function1 onProjectClicked, final Function0 onGetStartedTutorialsCardClicked, final Function0 onGetStartedProjectsCardClicked, final Function0 onGetStartedTemplatesCardClicked, final boolean z2, final Function0 onRefresh, Modifier modifier, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, eQ.fuX fux, Composer composer, final int i2, final int i3, final int i5) {
        List list2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        BitmapLruCache bitmapLruCache2;
        final Modifier modifier2;
        final SceneThumbnailMaker sceneThumbnailMaker2;
        final eQ.fuX fux2;
        Composer composer2;
        final BitmapLruCache bitmapLruCache3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i16;
        int i17;
        Intrinsics.checkNotNullParameter(projects, "projects");
        Intrinsics.checkNotNullParameter(onViewAllTemplatesClicked, "onViewAllTemplatesClicked");
        Intrinsics.checkNotNullParameter(onTagClicked, "onTagClicked");
        Intrinsics.checkNotNullParameter(onViewAllProjectsClicked, "onViewAllProjectsClicked");
        Intrinsics.checkNotNullParameter(onCreateProjectClicked, "onCreateProjectClicked");
        Intrinsics.checkNotNullParameter(onProjectClicked, "onProjectClicked");
        Intrinsics.checkNotNullParameter(onGetStartedTutorialsCardClicked, "onGetStartedTutorialsCardClicked");
        Intrinsics.checkNotNullParameter(onGetStartedProjectsCardClicked, "onGetStartedProjectsCardClicked");
        Intrinsics.checkNotNullParameter(onGetStartedTemplatesCardClicked, "onGetStartedTemplatesCardClicked");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Composer composerKN = composer.KN(-424806327);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
            list2 = list;
        } else if ((i2 & 6) == 0) {
            list2 = list;
            i7 = i2 | (composerKN.E2(list2) ? 4 : 2);
        } else {
            list2 = list;
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.E2(projects) ? 32 : 16;
        }
        int i18 = i7;
        if ((i5 & 4) != 0) {
            i18 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i18 |= composerKN.E2(onViewAllTemplatesClicked) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i18 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i18 |= composerKN.E2(onTagClicked) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i18 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i18 |= composerKN.E2(onViewAllProjectsClicked) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i18 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i18 |= composerKN.E2(onCreateProjectClicked) ? 131072 : 65536;
        }
        if ((i5 & 64) != 0) {
            i18 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i18 |= composerKN.E2(onProjectClicked) ? 1048576 : 524288;
        }
        if ((i5 & 128) == 0) {
            i17 = (12582912 & i2) == 0 ? composerKN.E2(onGetStartedTutorialsCardClicked) ? 8388608 : 4194304 : 12582912;
            if ((i5 & 256) != 0) {
                i16 = (100663296 & i2) == 0 ? composerKN.E2(onGetStartedProjectsCardClicked) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432 : 100663296;
                if ((i5 & 512) != 0) {
                    i8 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else {
                    if ((805306368 & i2) == 0) {
                        i8 = composerKN.E2(onGetStartedTemplatesCardClicked) ? 536870912 : 268435456;
                    }
                    if ((i5 & 1024) == 0) {
                        i9 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        i9 = i3 | (composerKN.n(z2) ? 4 : 2);
                    } else {
                        i9 = i3;
                    }
                    if ((i5 & 2048) == 0) {
                        i9 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i9 |= composerKN.E2(onRefresh) ? 32 : 16;
                    }
                    int i19 = i9;
                    i10 = i5 & 4096;
                    if (i10 == 0) {
                        i11 = i19 | RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else {
                        int i20 = i19;
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i20 |= composerKN.p5(modifier) ? 256 : 128;
                        }
                        i11 = i20;
                    }
                    i12 = i5 & 8192;
                    if (i12 == 0) {
                        i13 = i11 | 3072;
                    } else {
                        int i21 = i11;
                        if ((i3 & 3072) == 0) {
                            i21 |= composerKN.p5(bitmapLruCache) ? 2048 : 1024;
                        }
                        i13 = i21;
                    }
                    i14 = i5 & 16384;
                    if (i14 != 0) {
                        if ((i3 & 24576) == 0) {
                            i13 |= composerKN.E2(sceneThumbnailMaker) ? 16384 : 8192;
                        }
                        i15 = i5 & 32768;
                        if (i15 != 0) {
                            i13 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            i13 |= composerKN.E2(fux) ? 131072 : 65536;
                        }
                        if ((i18 & 306783379) == 306783378 && (74899 & i13) == 74898 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier2 = modifier;
                            bitmapLruCache3 = bitmapLruCache;
                            sceneThumbnailMaker2 = sceneThumbnailMaker;
                            fux2 = fux;
                            composer2 = composerKN;
                        } else {
                            Modifier modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier;
                            BitmapLruCache bitmapLruCache4 = i12 == 0 ? null : bitmapLruCache;
                            SceneThumbnailMaker sceneThumbnailMaker3 = i14 == 0 ? null : sceneThumbnailMaker;
                            eQ.fuX fux3 = i15 == 0 ? fux : null;
                            if (ComposerKt.v()) {
                                bitmapLruCache2 = bitmapLruCache4;
                            } else {
                                bitmapLruCache2 = bitmapLruCache4;
                                ComposerKt.p5(-424806327, i18, i13, "com.alightcreative.app.motion.activities.main.maintabs.home.HomeScreenContent (HomeScreenContent.kt:58)");
                            }
                            BitmapLruCache bitmapLruCache5 = bitmapLruCache2;
                            int i22 = i13;
                            SceneThumbnailMaker sceneThumbnailMaker4 = sceneThumbnailMaker3;
                            Modifier modifier4 = modifier3;
                            PullToRefreshKt.nr(z2, onRefresh, modifier4, null, null, null, ComposableLambdaKt.nr(674585519, true, new n(list2, onTagClicked, onViewAllTemplatesClicked, fux3, projects, onViewAllProjectsClicked, onCreateProjectClicked, onProjectClicked, bitmapLruCache5, sceneThumbnailMaker4, onGetStartedTutorialsCardClicked, onGetStartedProjectsCardClicked, onGetStartedTemplatesCardClicked), composerKN, 54), composerKN, (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896), 56);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier2 = modifier4;
                            sceneThumbnailMaker2 = sceneThumbnailMaker4;
                            fux2 = fux3;
                            composer2 = composerKN;
                            bitmapLruCache3 = bitmapLruCache5;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2() { // from class: D3C.fuX
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return Pl.xMQ(list, projects, onViewAllTemplatesClicked, onTagClicked, onViewAllProjectsClicked, onCreateProjectClicked, onProjectClicked, onGetStartedTutorialsCardClicked, onGetStartedProjectsCardClicked, onGetStartedTemplatesCardClicked, z2, onRefresh, modifier2, bitmapLruCache3, sceneThumbnailMaker2, fux2, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i13 |= 24576;
                    i15 = i5 & 32768;
                    if (i15 != 0) {
                    }
                    if ((i18 & 306783379) == 306783378) {
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        eQ.fuX fux32 = i15 == 0 ? fux : null;
                        if (ComposerKt.v()) {
                        }
                        BitmapLruCache bitmapLruCache52 = bitmapLruCache2;
                        int i222 = i13;
                        SceneThumbnailMaker sceneThumbnailMaker42 = sceneThumbnailMaker3;
                        Modifier modifier42 = modifier3;
                        PullToRefreshKt.nr(z2, onRefresh, modifier42, null, null, null, ComposableLambdaKt.nr(674585519, true, new n(list2, onTagClicked, onViewAllTemplatesClicked, fux32, projects, onViewAllProjectsClicked, onCreateProjectClicked, onProjectClicked, bitmapLruCache52, sceneThumbnailMaker42, onGetStartedTutorialsCardClicked, onGetStartedProjectsCardClicked, onGetStartedTemplatesCardClicked), composerKN, 54), composerKN, (i222 & 14) | 1572864 | (i222 & 112) | (i222 & 896), 56);
                        if (ComposerKt.v()) {
                        }
                        modifier2 = modifier42;
                        sceneThumbnailMaker2 = sceneThumbnailMaker42;
                        fux2 = fux32;
                        composer2 = composerKN;
                        bitmapLruCache3 = bitmapLruCache52;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i18 |= i8;
                if ((i5 & 1024) == 0) {
                }
                if ((i5 & 2048) == 0) {
                }
                int i192 = i9;
                i10 = i5 & 4096;
                if (i10 == 0) {
                }
                i12 = i5 & 8192;
                if (i12 == 0) {
                }
                i14 = i5 & 16384;
                if (i14 != 0) {
                }
                i15 = i5 & 32768;
                if (i15 != 0) {
                }
                if ((i18 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i18 |= i16;
            if ((i5 & 512) != 0) {
            }
            i18 |= i8;
            if ((i5 & 1024) == 0) {
            }
            if ((i5 & 2048) == 0) {
            }
            int i1922 = i9;
            i10 = i5 & 4096;
            if (i10 == 0) {
            }
            i12 = i5 & 8192;
            if (i12 == 0) {
            }
            i14 = i5 & 16384;
            if (i14 != 0) {
            }
            i15 = i5 & 32768;
            if (i15 != 0) {
            }
            if ((i18 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i18 |= i17;
        if ((i5 & 256) != 0) {
        }
        i18 |= i16;
        if ((i5 & 512) != 0) {
        }
        i18 |= i8;
        if ((i5 & 1024) == 0) {
        }
        if ((i5 & 2048) == 0) {
        }
        int i19222 = i9;
        i10 = i5 & 4096;
        if (i10 == 0) {
        }
        i12 = i5 & 8192;
        if (i12 == 0) {
        }
        i14 = i5 & 16384;
        if (i14 != 0) {
        }
        i15 = i5 & 32768;
        if (i15 != 0) {
        }
        if ((i18 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        ty(function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final Function0 onGetStartedTutorialsCardClicked, final Function0 onGetStartedProjectsCardClicked, final Function0 onGetStartedTemplatesCardClicked, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onGetStartedTutorialsCardClicked, "onGetStartedTutorialsCardClicked");
        Intrinsics.checkNotNullParameter(onGetStartedProjectsCardClicked, "onGetStartedProjectsCardClicked");
        Intrinsics.checkNotNullParameter(onGetStartedTemplatesCardClicked, "onGetStartedTemplatesCardClicked");
        Composer composerKN = composer.KN(888700653);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onGetStartedTutorialsCardClicked) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onGetStartedProjectsCardClicked) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onGetStartedTemplatesCardClicked) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(888700653, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.GetStartedSection (HomeScreenContent.kt:157)");
                }
                mA.Dsr.rl(StringResources_androidKt.t(2132019326, composerKN, 6), modifier4, null, ComposableLambdaKt.nr(-1026251879, true, new j(onGetStartedTutorialsCardClicked, onGetStartedProjectsCardClicked, onGetStartedTemplatesCardClicked), composerKN, 54), composerKN, ((i5 >> 6) & 112) | 3072, 4);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: D3C.Dsr
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Pl.Uo(onGetStartedTutorialsCardClicked, onGetStartedProjectsCardClicked, onGetStartedTemplatesCardClicked, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            mA.Dsr.rl(StringResources_androidKt.t(2132019326, composerKN, 6), modifier4, null, ComposableLambdaKt.nr(-1026251879, true, new j(onGetStartedTutorialsCardClicked, onGetStartedProjectsCardClicked, onGetStartedTemplatesCardClicked), composerKN, 54), composerKN, ((i5 >> 6) & 112) | 3072, 4);
            if (ComposerKt.v()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        J2(function0, function02, function03, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(List list, Function1 function1, Function0 function0, Modifier modifier, eQ.fuX fux, int i2, int i3, Composer composer, int i5) {
        qie(list, function1, function0, modifier, fux, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(List list, Function0 function0, Function0 function02, Function1 function1, Modifier modifier, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, int i2, int i3, Composer composer, int i5) {
        mUb(list, function0, function02, function1, modifier, bitmapLruCache, sceneThumbnailMaker, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(final List projects, final Function0 onViewAllClicked, final Function0 onCreateProjectClicked, final Function1 onProjectClicked, Modifier modifier, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        BitmapLruCache bitmapLruCache2;
        int i8;
        SceneThumbnailMaker sceneThumbnailMaker2;
        int i9;
        final BitmapLruCache bitmapLruCache3;
        final SceneThumbnailMaker sceneThumbnailMaker3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(projects, "projects");
        Intrinsics.checkNotNullParameter(onViewAllClicked, "onViewAllClicked");
        Intrinsics.checkNotNullParameter(onCreateProjectClicked, "onCreateProjectClicked");
        Intrinsics.checkNotNullParameter(onProjectClicked, "onProjectClicked");
        Composer composerKN = composer.KN(-886753372);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(projects) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onViewAllClicked) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onCreateProjectClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onProjectClicked) ? 2048 : 1024;
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i5 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i5 |= 196608;
            } else {
                if ((196608 & i2) == 0) {
                    bitmapLruCache2 = bitmapLruCache;
                    i5 |= composerKN.p5(bitmapLruCache2) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                    if ((1572864 & i2) == 0) {
                        sceneThumbnailMaker2 = sceneThumbnailMaker;
                        i5 |= composerKN.E2(sceneThumbnailMaker2) ? 1048576 : 524288;
                    }
                    i9 = i5;
                    if ((599187 & i9) == 599186 || !composerKN.xMQ()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i7 != 0) {
                            bitmapLruCache2 = null;
                        }
                        SceneThumbnailMaker sceneThumbnailMaker4 = i8 == 0 ? null : sceneThumbnailMaker2;
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-886753372, i9, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.LatestProjectsSection (HomeScreenContent.kt:127)");
                        }
                        BitmapLruCache bitmapLruCache4 = bitmapLruCache2;
                        Modifier modifier4 = modifier2;
                        mA.Dsr.rl(StringResources_androidKt.t(2132019457, composerKN, 6), modifier4, ComposableLambdaKt.nr(-570871183, true, new w6(onViewAllClicked), composerKN, 54), ComposableLambdaKt.nr(2120092240, true, new Ml(onCreateProjectClicked, projects, onProjectClicked, bitmapLruCache4, sceneThumbnailMaker4), composerKN, 54), composerKN, ((i9 >> 9) & 112) | 3456, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        bitmapLruCache3 = bitmapLruCache4;
                        sceneThumbnailMaker3 = sceneThumbnailMaker4;
                        modifier3 = modifier4;
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        bitmapLruCache3 = bitmapLruCache2;
                        sceneThumbnailMaker3 = sceneThumbnailMaker2;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: D3C.aC
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Pl.gh(projects, onViewAllClicked, onCreateProjectClicked, onProjectClicked, modifier3, bitmapLruCache3, sceneThumbnailMaker3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 1572864;
                sceneThumbnailMaker2 = sceneThumbnailMaker;
                i9 = i5;
                if ((599187 & i9) == 599186) {
                    if (i10 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    BitmapLruCache bitmapLruCache42 = bitmapLruCache2;
                    Modifier modifier42 = modifier2;
                    mA.Dsr.rl(StringResources_androidKt.t(2132019457, composerKN, 6), modifier42, ComposableLambdaKt.nr(-570871183, true, new w6(onViewAllClicked), composerKN, 54), ComposableLambdaKt.nr(2120092240, true, new Ml(onCreateProjectClicked, projects, onProjectClicked, bitmapLruCache42, sceneThumbnailMaker4), composerKN, 54), composerKN, ((i9 >> 9) & 112) | 3456, 0);
                    if (ComposerKt.v()) {
                    }
                    bitmapLruCache3 = bitmapLruCache42;
                    sceneThumbnailMaker3 = sceneThumbnailMaker4;
                    modifier3 = modifier42;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            bitmapLruCache2 = bitmapLruCache;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            sceneThumbnailMaker2 = sceneThumbnailMaker;
            i9 = i5;
            if ((599187 & i9) == 599186) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        bitmapLruCache2 = bitmapLruCache;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        sceneThumbnailMaker2 = sceneThumbnailMaker;
        i9 = i5;
        if ((599187 & i9) == 599186) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void qie(final List list, final Function1 onTagClicked, final Function0 onViewAllClicked, Modifier modifier, eQ.fuX fux, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        eQ.fuX fux2;
        final eQ.fuX fux3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onTagClicked, "onTagClicked");
        Intrinsics.checkNotNullParameter(onViewAllClicked, "onViewAllClicked");
        Composer composerKN = composer.KN(574735768);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(list) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onTagClicked) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onViewAllClicked) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    fux2 = fux;
                    i5 |= composerKN.E2(fux2) ? 16384 : 8192;
                }
                if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    fux3 = fux2;
                } else {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    fux3 = i7 == 0 ? null : fux2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(574735768, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.NewTemplatesSection (HomeScreenContent.kt:101)");
                    }
                    Modifier modifier5 = modifier4;
                    mA.Dsr.rl(StringResources_androidKt.t(2132019024, composerKN, 6), modifier5, ComposableLambdaKt.nr(1568248299, true, new I28(onViewAllClicked), composerKN, 54), ComposableLambdaKt.nr(-517594516, true, new Wre(list, onTagClicked, fux3), composerKN, 54), composerKN, ((i5 >> 6) & 112) | 3456, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: D3C.C
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Pl.az(list, onTagClicked, onViewAllClicked, modifier3, fux3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            fux2 = fux;
            if ((i5 & 9363) == 9362) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier modifier52 = modifier4;
                mA.Dsr.rl(StringResources_androidKt.t(2132019024, composerKN, 6), modifier52, ComposableLambdaKt.nr(1568248299, true, new I28(onViewAllClicked), composerKN, 54), ComposableLambdaKt.nr(-517594516, true, new Wre(list, onTagClicked, fux3), composerKN, 54), composerKN, ((i5 >> 6) & 112) | 3456, 0);
                if (ComposerKt.v()) {
                }
                modifier3 = modifier52;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        fux2 = fux;
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ty(final Function0 function0, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1836671722);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i5 & 19) == 18 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1836671722, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.ViewAllTextButton (HomeScreenContent.kt:182)");
                }
                modifier3 = modifier4;
                composer2 = composerKN;
                TextKt.t(StringResources_androidKt.t(2132020425, composerKN, 6), ClickableKt.J2(modifier3, false, null, null, function0, 7, null), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).wTp(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
                composer2 = composerKN;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: D3C.o
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Pl.HI(function0, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i5 & 19) == 18) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            modifier3 = modifier4;
            composer2 = composerKN;
            TextKt.t(StringResources_androidKt.t(2132020425, composerKN, 6), ClickableKt.J2(modifier3, false, null, null, function0, 7, null), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).wTp(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
            if (ComposerKt.v()) {
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(List list, List list2, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function1 function12, Function0 function04, Function0 function05, Function0 function06, boolean z2, Function0 function07, Modifier modifier, BitmapLruCache bitmapLruCache, SceneThumbnailMaker sceneThumbnailMaker, eQ.fuX fux, int i2, int i3, int i5, Composer composer, int i7) {
        KN(list, list2, function0, function1, function02, function03, function12, function04, function05, function06, z2, function07, modifier, bitmapLruCache, sceneThumbnailMaker, fux, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }
}
