package jEU;

import Dj7.CM;
import Dj7.QaP;
import HI0.M5;
import SFf.Ew;
import SFf.afx;
import SFf.ci;
import SFf.g9s;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SwitchDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import jEU.Dsr;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0015¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u001b\u0010*\u001a\u00020%8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101RD\u0010<\u001a2\u0012\u0013\u0012\u001104¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0013\u0012\u001108¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u0004038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"LjEU/Dsr;", "LjEU/Xo;", "<init>", "()V", "", "J", "(Landroidx/compose/runtime/Composer;I)V", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "LSFf/g9s;", "E2", "(Landroidx/compose/runtime/Composer;I)LSFf/g9s;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "didSaveChanges", "iF", "(Z)V", "LnYs/Ml;", "jB", "LnYs/Ml;", "G7", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "U", "Z", "isFromIntroFlow", "P5", "isKoreanFlow", "LSFf/afx;", "M7", "Lkotlin/Lazy;", "X", "()LSFf/afx;", "viewModel", "LCZF/I28;", "fcU", "()LCZF/I28;", "pico", "LK0/n;", "fD", "()LK0/n;", "legal", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "actionKind", "Lpq/Ml;", "info", "e", "()Lkotlin/jvm/functions/Function2;", "trackEvent", "p5", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlightPrivacySettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlightPrivacySettingsFragment.kt\ncom/alightcreative/privacy/ui/AlightPrivacySettingsFragment\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,289:1\n113#2:290\n113#2:291\n113#2:292\n113#2:330\n113#2:341\n87#3:293\n84#3,9:294\n94#3:340\n79#4,6:303\n86#4,3:318\n89#4,2:327\n93#4:339\n347#5,9:309\n356#5:329\n357#5,2:337\n4206#6,6:321\n1247#7,6:331\n*S KotlinDebug\n*F\n+ 1 AlightPrivacySettingsFragment.kt\ncom/alightcreative/privacy/ui/AlightPrivacySettingsFragment\n*L\n134#1:290\n135#1:291\n246#1:292\n254#1:330\n280#1:341\n243#1:293\n243#1:294,9\n243#1:340\n243#1:303,6\n243#1:318,3\n243#1:327,2\n243#1:339\n243#1:309,9\n243#1:329\n243#1:337,2\n243#1:321,6\n266#1:331,6\n*E\n"})
public final class Dsr extends Pl {

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: jEU.I28
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Dsr.eWT(this.f69344n);
        }
    });

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean isKoreanFlow;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean isFromIntroFlow;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int eF = 8;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final float f69338E = Dp.KN(12);

    /* JADX INFO: renamed from: jEU.Dsr$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Dsr n(boolean z2) {
            Dsr dsr = new Dsr();
            Bundle bundle = new Bundle();
            bundle.putBoolean("keyIsFromIntroFlow", z2);
            dsr.setArguments(bundle);
            return dsr;
        }
    }

    static final class n implements Function3 {

        /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function1 {
            CN3(Object obj) {
                super(1, obj, Dsr.class, "onThirdPartyPPLinkClicked", "onThirdPartyPPLinkClicked(Ljava/lang/String;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((String) obj);
                return Unit.INSTANCE;
            }

            public final void n(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((Dsr) this.receiver).rV9(p0);
            }
        }

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function2 {
            I28(Object obj) {
                super(2, obj, Dsr.class, "onTrackerToggled", "onTrackerToggled(Lcom/bendingspoons/legal/privacy/ui/settings/TrackerListItem;Z)V", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Ew) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            public final void n(Ew p0, boolean z2) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((Dsr) this.receiver).bzg(p0, z2);
            }
        }

        /* synthetic */ class Ml extends FunctionReferenceImpl implements Function2 {
            Ml(Object obj) {
                super(2, obj, Dsr.class, "onCategoryToggled", "onCategoryToggled(Lcom/bendingspoons/legal/privacy/TrackingCategory;Z)V", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Pr.Ml) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            public final void n(Pr.Ml p0, boolean z2) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((Dsr) this.receiver).N(p0, z2);
            }
        }

        /* synthetic */ class Wre extends FunctionReferenceImpl implements Function0 {
            Wre(Object obj) {
                super(0, obj, Dsr.class, "onPrivacyPolicyLinkClicked", "onPrivacyPolicyLinkClicked()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).wTp();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        public static final class fuX implements NestedScrollConnection {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ScrollState f69341n;

            fuX(ScrollState scrollState) {
                this.f69341n = scrollState;
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long F(long j2, long j3, int i2) {
                int i3 = (int) (j3 & 4294967295L);
                if (Float.intBitsToFloat(i3) <= 0.0f) {
                    return Offset.INSTANCE.t();
                }
                return Offset.O((4294967295L & ((long) Float.floatToRawIntBits(-this.f69341n.rl(-Float.intBitsToFloat(i3))))) | (Float.floatToRawIntBits(0.0f) << 32));
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long tEO(long j2, int i2) {
                int i3 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i3) >= 0.0f) {
                    return Offset.INSTANCE.t();
                }
                float f3 = -this.f69341n.rl(-Float.intBitsToFloat(i3));
                return Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f3))));
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
            j(Object obj) {
                super(1, obj, Dsr.class, MRAIDPresenter.CLOSE, "close(Z)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void n(boolean z2) {
                ((Dsr) this.receiver).iF(z2);
            }
        }

        /* JADX INFO: renamed from: jEU.Dsr$n$n, reason: collision with other inner class name */
        /* synthetic */ class C0983n extends FunctionReferenceImpl implements Function0 {
            C0983n(Object obj) {
                super(0, obj, Dsr.class, "onAcceptAllClicked", "onAcceptAllClicked()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).T();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
            w6(Object obj) {
                super(0, obj, Dsr.class, "onDeclineAllClicked", "onDeclineAllClicked()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).s7N();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Dsr dsr, String url, Context context) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(context, "<unused var>");
            dsr.Xw(url);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            rl((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i2 & 6) == 0) {
                i3 = i2 | (composer.p5(BoxWithConstraints) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & 19) == 18 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1068477296, i3, -1, "com.alightcreative.privacy.ui.AlightPrivacySettingsFragment.KoreanFlowContent.<anonymous> (AlightPrivacySettingsFragment.kt:184)");
            }
            float fNr = BoxWithConstraints.nr();
            ScrollState scrollStateT = ScrollKt.t(0, composer, 0, 1);
            composer.eF(2025307402);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new fuX(scrollStateT);
                composer.o(objIF);
            }
            composer.Xw();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierUo = ScrollKt.Uo(NestedScrollModifierKt.rl(companion2, (fuX) objIF, null, 2, null), scrollStateT, false, null, false, 14, null);
            final Dsr dsr = Dsr.this;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierUo);
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
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            dsr.a(composer, 0);
            afx afxVarX = dsr.X();
            g9s g9sVarE2 = dsr.E2(composer, 0);
            String strT = StringResources_androidKt.t(2132019455, composer, 6);
            String strT2 = StringResources_androidKt.t(2132019454, composer, 6);
            String strT3 = StringResources_androidKt.t(2132019447, composer, 6);
            String strT4 = StringResources_androidKt.t(2132019446, composer, 6);
            String strT5 = StringResources_androidKt.t(2132019453, composer, 6);
            String strT6 = StringResources_androidKt.t(2132019452, composer, 6);
            composer.eF(-1977659731);
            boolean zE2 = composer.E2(dsr);
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new j(dsr);
                composer.o(objIF2);
            }
            KFunction kFunction = (KFunction) objIF2;
            composer.Xw();
            composer.eF(-1977658118);
            boolean zE22 = composer.E2(dsr);
            Object objIF3 = composer.iF();
            if (zE22 || objIF3 == companion.n()) {
                objIF3 = new C0983n(dsr);
                composer.o(objIF3);
            }
            KFunction kFunction2 = (KFunction) objIF3;
            composer.Xw();
            composer.eF(-1977656069);
            boolean zE23 = composer.E2(dsr);
            Object objIF4 = composer.iF();
            if (zE23 || objIF4 == companion.n()) {
                objIF4 = new w6(dsr);
                composer.o(objIF4);
            }
            KFunction kFunction3 = (KFunction) objIF4;
            composer.Xw();
            composer.eF(-1977654055);
            boolean zE24 = composer.E2(dsr);
            Object objIF5 = composer.iF();
            if (zE24 || objIF5 == companion.n()) {
                objIF5 = new Ml(dsr);
                composer.o(objIF5);
            }
            KFunction kFunction4 = (KFunction) objIF5;
            composer.Xw();
            composer.eF(-1977652136);
            boolean zE25 = composer.E2(dsr);
            Object objIF6 = composer.iF();
            if (zE25 || objIF6 == companion.n()) {
                objIF6 = new I28(dsr);
                composer.o(objIF6);
            }
            KFunction kFunction5 = (KFunction) objIF6;
            composer.Xw();
            composer.eF(-1977649918);
            boolean zE26 = composer.E2(dsr);
            Object objIF7 = composer.iF();
            if (zE26 || objIF7 == companion.n()) {
                objIF7 = new Wre(dsr);
                composer.o(objIF7);
            }
            KFunction kFunction6 = (KFunction) objIF7;
            composer.Xw();
            composer.eF(-1977647423);
            boolean zE27 = composer.E2(dsr);
            Object objIF8 = composer.iF();
            if (zE27 || objIF8 == companion.n()) {
                objIF8 = new CN3(dsr);
                composer.o(objIF8);
            }
            KFunction kFunction7 = (KFunction) objIF8;
            composer.Xw();
            Modifier modifierXMQ = SizeKt.xMQ(companion2, fNr);
            Function1 function1 = (Function1) kFunction;
            composer.eF(-1977645239);
            boolean zE28 = composer.E2(dsr);
            Object objIF9 = composer.iF();
            if (zE28 || objIF9 == companion.n()) {
                objIF9 = new Function2() { // from class: jEU.aC
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Dsr.n.t(dsr, (String) obj, (Context) obj2);
                    }
                };
                composer.o(objIF9);
            }
            composer.Xw();
            ci.ty(afxVarX, g9sVarE2, modifierXMQ, false, false, false, strT, strT2, strT3, strT4, strT5, strT6, function1, (Function2) objIF9, (Function2) kFunction4, (Function2) kFunction5, (Function0) kFunction2, (Function0) kFunction3, (Function0) kFunction6, (Function1) kFunction7, composer, afx.gh | 196608 | (g9s.f9029X << 3), 0, 24);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class w6 implements Function2 {

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, Dsr.class, "onCloseClicked", "onCloseClicked()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).nHg();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
            n(Object obj) {
                super(0, obj, Dsr.class, "onSaveClicked", "onSaveClicked()V", 0);
            }

            public final void n() {
                ((Dsr) this.receiver).v();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: jEU.Dsr$w6$w6, reason: collision with other inner class name */
        static final class C0984w6 implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Dsr f69343n;

            C0984w6(Dsr dsr) {
                this.f69343n = dsr;
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
                    ComposerKt.p5(337695671, i2, -1, "com.alightcreative.privacy.ui.AlightPrivacySettingsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (AlightPrivacySettingsFragment.kt:160)");
                }
                if (this.f69343n.isKoreanFlow) {
                    composer.eF(946930211);
                    this.f69343n.J(composer, 0);
                    composer.Xw();
                } else {
                    composer.eF(947002534);
                    this.f69343n.nY(null, composer, 0, 1);
                    composer.Xw();
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        w6() {
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
                ComposerKt.p5(-271071473, i2, -1, "com.alightcreative.privacy.ui.AlightPrivacySettingsFragment.onCreateView.<anonymous>.<anonymous> (AlightPrivacySettingsFragment.kt:155)");
            }
            Dsr dsr = Dsr.this;
            composer.eF(16437357);
            boolean zE2 = composer.E2(dsr);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(dsr);
                composer.o(objIF);
            }
            composer.Xw();
            Function0 function0 = (Function0) ((KFunction) objIF);
            Dsr dsr2 = Dsr.this;
            composer.eF(16439084);
            boolean zE22 = composer.E2(dsr2);
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new n(dsr2);
                composer.o(objIF2);
            }
            composer.Xw();
            rPd.fuX.rl(function0, (Function0) ((KFunction) objIF2), !Dsr.this.isKoreanFlow, ComposableLambdaKt.nr(337695671, true, new C0984w6(Dsr.this), composer, 54), composer, 3072, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Dsr dsr, int i2, Composer composer, int i3) {
        dsr.J(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GR(Dsr dsr, int i2, Composer composer, int i3) {
        dsr.a(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Nxk(Dsr dsr, String actionKind, pq.Ml info) {
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(info, "info");
        jgV.Wre.n(dsr.fcU(), actionKind, info);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerKN = composer.KN(100774367);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(100774367, i3, -1, "com.alightcreative.privacy.ui.AlightPrivacySettingsFragment.KoreanPreamble (AlightPrivacySettingsFragment.kt:240)");
            }
            TextStyle textStyleT = TextStyle.t(Fo.n.t().wTp(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.KN(16), null, null, null, 0, 0, null, 16646143, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 16;
            Modifier modifierMUb = PaddingKt.mUb(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), Dp.KN(12));
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierMUb);
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
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            TextKt.t(StringResources_androidKt.t(2132019451, composerKN, 6), null, aD.w6.K(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleT, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composerKN, 6);
            String strT = StringResources_androidKt.t(2132019450, composerKN, 6);
            long jK = aD.w6.K();
            Color colorXMQ = Color.xMQ(aD.w6.i());
            composerKN.eF(1870263736);
            boolean zE2 = composerKN.E2(this);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: jEU.CN3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Dsr.I(this.f69337n);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            CM.xMQ(strT, null, jK, null, textStyleT, CollectionsKt.listOf(new QaP("pp_link", new P0j.Dsr(true, false, false, false, false, colorXMQ, 0L, (Function0) objIF, 94, null))), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 10);
            composer2 = composerKN;
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: jEU.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dsr.GR(this.f69353n, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afx eWT(Dsr dsr) {
        return new afx(dsr.fD(), dsr.e(), dsr.isKoreanFlow);
    }

    @Override // SFf.o
    protected g9s E2(Composer composer, int i2) {
        composer.eF(1286076812);
        if (ComposerKt.v()) {
            ComposerKt.p5(1286076812, i2, -1, "com.alightcreative.privacy.ui.AlightPrivacySettingsFragment.getStyle (AlightPrivacySettingsFragment.kt:99)");
        }
        Fo.j jVarT = Fo.n.t();
        TextStyle textStyleN = jVarT.N();
        TextStyle textStyleNY = jVarT.nY();
        TextStyle textStyleS7N = jVarT.s7N();
        TextStyle textStyleNY2 = jVarT.nY();
        Dj7.CN3 cn3 = Dj7.CN3.f1597n;
        TextStyle textStyleT = TextStyle.t(Dj7.fuX.O(cn3, composer, 6), aD.w6.K(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        Dj7.CN3 cn32 = Dj7.CN3.f1600t;
        TextStyle textStyleT2 = TextStyle.t(Dj7.fuX.O(cn32, composer, 6), aD.w6.K(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        TextStyle textStyleT3 = TextStyle.t(jVarT.N(), aD.w6.i(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        TextStyle textStyleTe = jVarT.te();
        TextStyle textStyleWTp = jVarT.wTp();
        TextStyle textStyleViF = jVarT.ViF();
        TextStyle textStyleWTp2 = jVarT.wTp();
        TextStyle textStyleT4 = TextStyle.t(Dj7.fuX.O(cn3, composer, 6), aD.w6.K(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
        R7M.j jVarJ2 = Dj7.fuX.J2(cn3, null, null, null, null, null, composer, 6, 31);
        long jHRu = aD.w6.hRu();
        R7M.j jVarJ22 = Dj7.fuX.J2(cn3, null, null, null, null, null, composer, 6, 31);
        R7M.j jVarJ23 = Dj7.fuX.J2(cn32, null, null, null, null, null, composer, 6, 31);
        RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(f69338E);
        SwitchDefaults switchDefaults = SwitchDefaults.f28005n;
        Color.Companion companion = Color.INSTANCE;
        float f3 = 16;
        g9s g9sVar = new g9s(textStyleN, textStyleNY, textStyleS7N, textStyleNY2, textStyleT, textStyleT2, textStyleT3, textStyleTe, textStyleWTp, textStyleViF, textStyleWTp2, textStyleT4, jVarJ22, jVarJ23, jVarJ2, roundedCornerShapeT, true, switchDefaults.rl(companion.KN(), aD.w6.tUK(), 0L, 0L, companion.KN(), aD.w6.How(), aD.w6.How(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 1794102, SwitchDefaults.f28006t << 18, 65420), jHRu, aD.w6.UhV(), aD.w6.UhV(), companion.KN(), companion.J2(), 0L, 0L, Dp.KN(f3), Dp.KN(f3), null, g9s.j.C0308j.f9044n, 0.0f, null, 1769996288, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return g9sVar;
    }

    public final nYs.Ml G7() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    @Override // SFf.o
    protected afx X() {
        return (afx) this.viewModel.getValue();
    }

    @Override // SFf.o
    protected Function2 e() {
        return new Function2() { // from class: jEU.Wre
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Dsr.Nxk(this.f69351n, (String) obj, (pq.Ml) obj2);
            }
        };
    }

    @Override // SFf.o, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        nYs.j jVarInvoke;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        boolean z2 = arguments != null ? arguments.getBoolean("keyIsFromIntroFlow", false) : false;
        this.isFromIntroFlow = z2;
        this.isKoreanFlow = z2 && (jVarInvoke = G7().invoke()) != null && jVarInvoke.jB();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            M5.n(window, 0, ContextCompat.getColor(activity, 2131099665), true);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.rl);
        composeView.setContent(ComposableLambdaKt.rl(-271071473, true, new w6()));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(Dsr dsr) {
        dsr.X().nY();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Composer composer, final int i2) {
        int i3;
        int i5;
        Composer composerKN = composer.KN(2006936506);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(this)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2006936506, i3, -1, "com.alightcreative.privacy.ui.AlightPrivacySettingsFragment.KoreanFlowContent (AlightPrivacySettingsFragment.kt:182)");
            }
            BoxWithConstraintsKt.n(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.nr(-1068477296, true, new n(), composerKN, 54), composerKN, 3078, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: jEU.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dsr.D(this.f69345n, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final CZF.I28 fcU() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ((rkP.j) OM5.n.n(contextRequireContext, rkP.j.class)).nr();
    }

    @Override // SFf.o
    protected K0.n fD() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ((rkP.j) OM5.n.n(contextRequireContext, rkP.j.class)).n();
    }

    @Override // SFf.o
    protected void iF(boolean didSaveChanges) {
        FragmentKt.n(this, "requestPrivacySettings", BundleKt.n(TuplesKt.to("resultPrivacySettingsKeyDidSaveChanges", Boolean.valueOf(didSaveChanges)), TuplesKt.to("resultPrivacySettingsKeyIsFromIntroFlow", Boolean.valueOf(this.isFromIntroFlow))));
        getParentFragmentManager().Zmq();
    }
}
