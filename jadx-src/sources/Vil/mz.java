package Vil;

import KC.AbstractC1383Dt;
import Vil.mz;
import a.C1498j;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.maineditor.presetpreview.ui.aC;
import e.C1960j;
import ep.oxM.esLNYym;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import six.I28;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class mz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f11184n = Dp.KN(16);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class j implements Function2 {
        final /* synthetic */ Function1 E2;
        final /* synthetic */ Function0 J2;
        final /* synthetic */ Function0 M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ State f11185N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ I28.n f11186O;
        final /* synthetic */ Function0 P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ List f11187S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ MutableState f11188T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ State f11189U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ Function1 f11190X;
        final /* synthetic */ Function1 Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ C1498j f11191Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f11192e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f11193g;
        final /* synthetic */ Function1 jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f11194n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ aC.j f11195o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f11196r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Density f11197t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function1 f11198v;

        /* JADX INFO: renamed from: Vil.mz$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class C0398j implements Function3 {
            final /* synthetic */ Function1 E2;
            final /* synthetic */ Function0 J2;
            final /* synthetic */ Function0 M7;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            final /* synthetic */ State f11199N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ I28.n f11200O;
            final /* synthetic */ Function0 P5;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ List f11201S;

            /* JADX INFO: renamed from: T, reason: collision with root package name */
            final /* synthetic */ MutableState f11202T;

            /* JADX INFO: renamed from: U, reason: collision with root package name */
            final /* synthetic */ State f11203U;

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            final /* synthetic */ Function1 f11204X;
            final /* synthetic */ Function1 Xw;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ C1498j f11205Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ MutableState f11206e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0 f11207g;
            final /* synthetic */ Function1 jB;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f11208n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ aC.j f11209o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function0 f11210r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Density f11211t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Function1 f11212v;

            /* JADX INFO: renamed from: Vil.mz$j$j$j, reason: collision with other inner class name */
            static final class C0399j implements Function3 {
                final /* synthetic */ Function1 E2;
                final /* synthetic */ aC.j J2;

                /* JADX INFO: renamed from: N, reason: collision with root package name */
                final /* synthetic */ State f11213N;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Function0 f11214O;

                /* JADX INFO: renamed from: S, reason: collision with root package name */
                final /* synthetic */ List f11215S;

                /* JADX INFO: renamed from: T, reason: collision with root package name */
                final /* synthetic */ MutableState f11216T;

                /* JADX INFO: renamed from: U, reason: collision with root package name */
                final /* synthetic */ State f11217U;

                /* JADX INFO: renamed from: X, reason: collision with root package name */
                final /* synthetic */ Function1 f11218X;
                final /* synthetic */ Function1 Xw;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                final /* synthetic */ boolean f11219Z;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ MutableState f11220e;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function0 f11221g;
                final /* synthetic */ Function1 jB;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ I28.n f11222n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ BoxWithConstraintsScope f11223o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ C1498j f11224r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Function0 f11225t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ Function1 f11226v;

                /* JADX INFO: renamed from: Vil.mz$j$j$j$CN3 */
                static final class CN3 implements Function3 {
                    final /* synthetic */ State E2;
                    final /* synthetic */ aC.j J2;

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ State f11227O;

                    /* JADX INFO: renamed from: S, reason: collision with root package name */
                    final /* synthetic */ Function1 f11228S;

                    /* JADX INFO: renamed from: Z, reason: collision with root package name */
                    final /* synthetic */ Function1 f11229Z;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ Function1 f11230g;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ MutableState f11231n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    final /* synthetic */ Function1 f11232o;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ I28.n f11233r;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ C1960j f11234t;

                    /* JADX INFO: renamed from: Vil.mz$j$j$j$CN3$j, reason: collision with other inner class name */
                    static final class C0400j implements Function3 {
                        final /* synthetic */ I28.n J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ aC.j f11235O;

                        /* JADX INFO: renamed from: S, reason: collision with root package name */
                        final /* synthetic */ Function1 f11236S;

                        /* JADX INFO: renamed from: Z, reason: collision with root package name */
                        final /* synthetic */ Function1 f11237Z;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        final /* synthetic */ State f11238g;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ C1960j f11239n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        final /* synthetic */ Function1 f11240o;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        final /* synthetic */ Function1 f11241r;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ State f11242t;

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit Uo(I28.n nVar) {
                            nVar.Uo(null);
                            return Unit.INSTANCE;
                        }

                        public final void J2(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i2 & 17) == 16 && composer.xMQ()) {
                                composer.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1822681886, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetPreviewContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PresetPreviewContent.kt:138)");
                            }
                            C1960j c1960j = this.f11239n;
                            if (c1960j != null) {
                                float fKN = Dp.KN(mz.ty(this.f11238g) - ((Dp) this.f11242t.getValue()).getValue());
                                String strT = this.f11239n.t();
                                C1960j c1960jN = this.f11235O.n();
                                boolean zAreEqual = Intrinsics.areEqual(strT, c1960jN != null ? c1960jN.t() : null);
                                composer.eF(782852672);
                                boolean zP5 = composer.p5(this.J2);
                                final I28.n nVar = this.J2;
                                Object objIF = composer.iF();
                                if (zP5 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function0() { // from class: Vil.p
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return mz.j.C0398j.C0399j.CN3.C0400j.Uo(nVar);
                                        }
                                    };
                                    composer.o(objIF);
                                }
                                Function0 function0 = (Function0) objIF;
                                composer.Xw();
                                composer.eF(782855341);
                                boolean zP52 = composer.p5(this.f11241r) | composer.E2(this.f11239n);
                                final Function1 function1 = this.f11241r;
                                final C1960j c1960j2 = this.f11239n;
                                Object objIF2 = composer.iF();
                                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                                    objIF2 = new Function0() { // from class: Vil.O
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return mz.j.C0398j.C0399j.CN3.C0400j.KN(function1, c1960j2);
                                        }
                                    };
                                    composer.o(objIF2);
                                }
                                Function0 function02 = (Function0) objIF2;
                                composer.Xw();
                                composer.eF(782857421);
                                boolean zP53 = composer.p5(this.f11240o) | composer.E2(this.f11239n);
                                final Function1 function12 = this.f11240o;
                                final C1960j c1960j3 = this.f11239n;
                                Object objIF3 = composer.iF();
                                if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                                    objIF3 = new Function0() { // from class: Vil.LEl
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return mz.j.C0398j.C0399j.CN3.C0400j.xMQ(function12, c1960j3);
                                        }
                                    };
                                    composer.o(objIF3);
                                }
                                Function0 function03 = (Function0) objIF3;
                                composer.Xw();
                                composer.eF(782859501);
                                boolean zP54 = composer.p5(this.f11237Z) | composer.E2(this.f11239n);
                                final Function1 function13 = this.f11237Z;
                                final C1960j c1960j4 = this.f11239n;
                                Object objIF4 = composer.iF();
                                if (zP54 || objIF4 == Composer.INSTANCE.n()) {
                                    objIF4 = new Function0() { // from class: Vil.gnv
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return mz.j.C0398j.C0399j.CN3.C0400j.mUb(function13, c1960j4);
                                        }
                                    };
                                    composer.o(objIF4);
                                }
                                Function0 function04 = (Function0) objIF4;
                                composer.Xw();
                                composer.eF(782861581);
                                boolean zP55 = composer.p5(this.f11236S) | composer.E2(this.f11239n);
                                final Function1 function14 = this.f11236S;
                                final C1960j c1960j5 = this.f11239n;
                                Object objIF5 = composer.iF();
                                if (zP55 || objIF5 == Composer.INSTANCE.n()) {
                                    objIF5 = new Function0() { // from class: Vil.fg
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return mz.j.C0398j.C0399j.CN3.C0400j.gh(function14, c1960j5);
                                        }
                                    };
                                    composer.o(objIF5);
                                }
                                composer.Xw();
                                iwV.KN(c1960j, fKN, zAreEqual, function0, function02, function03, function04, (Function0) objIF5, composer, 0, 0);
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }

                        C0400j(C1960j c1960j, State state, aC.j jVar, I28.n nVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, State state2) {
                            this.f11239n = c1960j;
                            this.f11242t = state;
                            this.f11235O = jVar;
                            this.J2 = nVar;
                            this.f11241r = function1;
                            this.f11240o = function12;
                            this.f11237Z = function13;
                            this.f11236S = function14;
                            this.f11238g = state2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            J2((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit KN(Function1 function1, C1960j c1960j) {
                            function1.invoke(c1960j);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit gh(Function1 function1, C1960j c1960j) {
                            function1.invoke(c1960j);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit mUb(Function1 function1, C1960j c1960j) {
                            function1.invoke(c1960j);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit xMQ(Function1 function1, C1960j c1960j) {
                            function1.invoke(c1960j);
                            return Unit.INSTANCE;
                        }
                    }

                    CN3(MutableState mutableState, C1960j c1960j, State state, aC.j jVar, I28.n nVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, State state2) {
                        this.f11231n = mutableState;
                        this.f11234t = c1960j;
                        this.f11227O = state;
                        this.J2 = jVar;
                        this.f11233r = nVar;
                        this.f11232o = function1;
                        this.f11229Z = function12;
                        this.f11228S = function13;
                        this.f11230g = function14;
                        this.E2 = state2;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit t(MutableState mutableState, LayoutCoordinates it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        mutableState.setValue(Offset.nr(LayoutCoordinatesKt.J2(it)));
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        rl((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void rl(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-201203828, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetPreviewContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PresetPreviewContent.kt:133)");
                        }
                        Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
                        composer.eF(689766891);
                        final MutableState mutableState = this.f11231n;
                        Object objIF = composer.iF();
                        if (objIF == Composer.INSTANCE.n()) {
                            objIF = new Function1() { // from class: Vil.OU
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return mz.j.C0398j.C0399j.CN3.t(mutableState, (LayoutCoordinates) obj);
                                }
                            };
                            composer.o(objIF);
                        }
                        composer.Xw();
                        BoxWithConstraintsKt.n(OnGloballyPositionedModifierKt.n(modifierJ2, (Function1) objIF), null, false, ComposableLambdaKt.nr(-1822681886, true, new C0400j(this.f11234t, this.f11227O, this.J2, this.f11233r, this.f11232o, this.f11229Z, this.f11228S, this.f11230g, this.E2), composer, 54), composer, 3078, 6);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }

                /* JADX INFO: renamed from: Vil.mz$j$j$j$I28 */
                /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
                    I28(Object obj) {
                        super(0, obj, C1498j.class, "onDragStart", "onDragStart()V", 0);
                    }

                    public final void n() {
                        ((C1498j) this.receiver).gh();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        n();
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: renamed from: Vil.mz$j$j$j$Ml */
                /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
                    Ml(Object obj) {
                        super(1, obj, C1498j.class, "updatePlayerView", "updatePlayerView(Landroid/view/View;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        n((View) obj);
                        return Unit.INSTANCE;
                    }

                    public final void n(View p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        ((C1498j) this.receiver).te(p0);
                    }
                }

                /* JADX INFO: renamed from: Vil.mz$j$j$j$Wre */
                /* synthetic */ class Wre extends FunctionReferenceImpl implements Function0 {
                    Wre(Object obj) {
                        super(0, obj, C1498j.class, "onDragEnd", "onDragEnd()V", 0);
                    }

                    public final void n() {
                        ((C1498j) this.receiver).mUb();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        n();
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: renamed from: Vil.mz$j$j$j$j, reason: collision with other inner class name */
                /* synthetic */ class C0401j extends FunctionReferenceImpl implements Function0 {
                    C0401j(Object obj) {
                        super(0, obj, C1498j.class, "onPlayButtonClicked", "onPlayButtonClicked()V", 0);
                    }

                    public final void n() {
                        ((C1498j) this.receiver).qie();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        n();
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: renamed from: Vil.mz$j$j$j$n */
                /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
                    n(Object obj) {
                        super(1, obj, C1498j.class, "updatePlayerWidthPx", "updatePlayerWidthPx(I)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        n(((Number) obj).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(int i2) {
                        ((C1498j) this.receiver).r(i2);
                    }
                }

                /* JADX INFO: renamed from: Vil.mz$j$j$j$w6 */
                /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
                /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
                    w6(Object obj) {
                        super(1, obj, C1498j.class, esLNYym.cJelO, "updateProgressOnInput(F)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        n(((Number) obj).floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(float f3) {
                        ((C1498j) this.receiver).o(f3);
                    }
                }

                C0399j(I28.n nVar, Function0 function0, Function0 function02, aC.j jVar, C1498j c1498j, BoxWithConstraintsScope boxWithConstraintsScope, boolean z2, List list, Function0 function03, Function1 function1, MutableState mutableState, Function1 function12, MutableState mutableState2, State state, Function1 function13, Function1 function14, Function1 function15, State state2) {
                    this.f11222n = nVar;
                    this.f11225t = function0;
                    this.f11214O = function02;
                    this.J2 = jVar;
                    this.f11224r = c1498j;
                    this.f11223o = boxWithConstraintsScope;
                    this.f11219Z = z2;
                    this.f11215S = list;
                    this.f11221g = function03;
                    this.E2 = function1;
                    this.f11220e = mutableState;
                    this.f11218X = function12;
                    this.f11216T = mutableState2;
                    this.f11213N = state;
                    this.f11226v = function13;
                    this.Xw = function14;
                    this.jB = function15;
                    this.f11217U = state2;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
                    C1960j c1960j;
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-841963852, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetPreviewContent.<anonymous>.<anonymous>.<anonymous> (PresetPreviewContent.kt:81)");
                    }
                    Function0 function0 = this.f11225t;
                    Function0 function02 = this.f11214O;
                    aC.j jVar = this.J2;
                    C1498j c1498j = this.f11224r;
                    BoxWithConstraintsScope boxWithConstraintsScope = this.f11223o;
                    I28.n nVar = this.f11222n;
                    boolean z2 = this.f11219Z;
                    List list = this.f11215S;
                    Function0 function03 = this.f11221g;
                    Function1 function1 = this.E2;
                    MutableState mutableState = this.f11220e;
                    Function1 function12 = this.f11218X;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer, 0);
                    int iN = ComposablesKt.n(composer, 0);
                    CompositionLocalMap compositionLocalMapIk = composer.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer, companion);
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
                    float f3 = 16;
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composer, 6);
                    o7q.t(PaddingKt.gh(companion, mz.f11184n, 0.0f, 2, null), function0, function02, jVar.n() != null, composer, 6, 0);
                    Si.o oVarNr = c1498j.nr();
                    boolean zXMQ = c1498j.xMQ();
                    composer.eF(689695516);
                    boolean zP5 = composer.p5(c1498j);
                    Object objIF = composer.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new C0401j(c1498j);
                        composer.o(objIF);
                    }
                    composer.Xw();
                    s.Wre.J2(oVarNr, zXMQ, (Function0) ((KFunction) objIF), PaddingKt.xMQ(SizeKt.xMQ(companion, boxWithConstraintsScope.t()), mz.f11184n), null, null, composer, 0, 48);
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(6)), composer, 6);
                    Modifier modifierGh = PaddingKt.gh(companion, mz.f11184n, 0.0f, 2, null);
                    boolean zXMQ2 = c1498j.xMQ();
                    composer.eF(689711292);
                    boolean zP52 = composer.p5(c1498j);
                    Object objIF2 = composer.iF();
                    if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new n(c1498j);
                        composer.o(objIF2);
                    }
                    composer.Xw();
                    Function1 function13 = (Function1) ((KFunction) objIF2);
                    composer.eF(689713790);
                    boolean zP53 = composer.p5(c1498j);
                    Object objIF3 = composer.iF();
                    if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new w6(c1498j);
                        composer.o(objIF3);
                    }
                    composer.Xw();
                    Function1 function14 = (Function1) ((KFunction) objIF3);
                    composer.eF(689716441);
                    boolean zP54 = composer.p5(c1498j);
                    Object objIF4 = composer.iF();
                    if (zP54 || objIF4 == Composer.INSTANCE.n()) {
                        objIF4 = new Ml(c1498j);
                        composer.o(objIF4);
                    }
                    composer.Xw();
                    Function1 function15 = (Function1) ((KFunction) objIF4);
                    long jQm = aD.w6.qm();
                    composer.eF(689721076);
                    boolean zP55 = composer.p5(c1498j);
                    Object objIF5 = composer.iF();
                    if (zP55 || objIF5 == Composer.INSTANCE.n()) {
                        objIF5 = new I28(c1498j);
                        composer.o(objIF5);
                    }
                    composer.Xw();
                    Function0 function04 = (Function0) ((KFunction) objIF5);
                    composer.eF(689723122);
                    boolean zP56 = composer.p5(c1498j);
                    Object objIF6 = composer.iF();
                    if (zP56 || objIF6 == Composer.INSTANCE.n()) {
                        objIF6 = new Wre(c1498j);
                        composer.o(objIF6);
                    }
                    composer.Xw();
                    s.o.J2(modifierGh, zXMQ2, function13, function14, function15, jQm, function04, (Function0) ((KFunction) objIF6), true, composer, 100859910, 0);
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composer, 6);
                    AbstractC1480c.J2(nVar, jVar.rl(), z2, jVar.n(), list, nVar.gh(), null, function03, function1, mutableState, function12, composer, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 0, 64);
                    composer.XQ();
                    Integer numT = this.f11222n.t();
                    if (numT != null) {
                        c1960j = (C1960j) this.J2.rl().get(numT.intValue());
                    } else {
                        c1960j = null;
                    }
                    AnimatedVisibilityKt.mUb(c1960j != null, null, EnterExitTransitionKt.HI(AnimationSpecKt.ty(200, 0, null, 6, null), 0.0f, 2, null), ExitTransition.INSTANCE.n(), null, ComposableLambdaKt.nr(-201203828, true, new CN3(this.f11216T, c1960j, this.f11213N, this.J2, this.f11222n, this.f11218X, this.f11226v, this.Xw, this.jB, this.f11217U), composer, 54), composer, 196992, 18);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            /* JADX INFO: renamed from: Vil.mz$j$j$n */
            static final class n implements Function3 {
                final /* synthetic */ I28.n J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ aC.j f11243O;

                /* JADX INFO: renamed from: S, reason: collision with root package name */
                final /* synthetic */ MutableState f11244S;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                final /* synthetic */ Function1 f11245Z;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function1 f11246g;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Function0 f11247n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ List f11248o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ boolean f11249r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Function0 f11250t;

                n(Function0 function0, Function0 function02, aC.j jVar, I28.n nVar, boolean z2, List list, Function1 function1, MutableState mutableState, Function1 function12) {
                    this.f11247n = function0;
                    this.f11250t = function02;
                    this.f11243O = jVar;
                    this.J2 = nVar;
                    this.f11249r = z2;
                    this.f11248o = list;
                    this.f11245Z = function1;
                    this.f11244S = mutableState;
                    this.f11246g = function12;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.v()) {
                        ComposerKt.p5(404481387, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetPreviewContent.<anonymous>.<anonymous>.<anonymous> (PresetPreviewContent.kt:159)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
                    Function0 function0 = this.f11247n;
                    Function0 function02 = this.f11250t;
                    aC.j jVar = this.f11243O;
                    I28.n nVar = this.J2;
                    boolean z2 = this.f11249r;
                    List list = this.f11248o;
                    Function1 function1 = this.f11245Z;
                    MutableState mutableState = this.f11244S;
                    Function1 function12 = this.f11246g;
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer, 0);
                    int iN = ComposablesKt.n(composer, 0);
                    CompositionLocalMap compositionLocalMapIk = composer.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer, modifierJ2);
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
                    float f3 = 16;
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composer, 6);
                    o7q.t(PaddingKt.gh(companion, mz.f11184n, 0.0f, 2, null), function0, function02, jVar.n() != null, composer, 6, 0);
                    SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composer, 6);
                    AbstractC1480c.J2(nVar, jVar.rl(), z2, jVar.n(), list, nVar.gh(), PaddingKt.az(companion, 0.0f, 0.0f, 0.0f, Dp.KN(72), 7, null), null, function1, mutableState, function12, composer, 806879232, 0, 128);
                    composer.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            /* JADX INFO: renamed from: Vil.mz$j$j$w6 */
            static final class w6 implements Function3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Function0 f11251n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Function0 f11252t;

                w6(Function0 function0, Function0 function02) {
                    this.f11251n = function0;
                    this.f11252t = function02;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.v()) {
                        ComposerKt.p5(137431596, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetPreviewContent.<anonymous>.<anonymous>.<anonymous> (PresetPreviewContent.kt:189)");
                    }
                    AbstractC1383Dt.Uo(this.f11251n, null, this.f11252t, null, composer, 48, 8);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int gh(int i2) {
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int mUb(int i2) {
                return i2;
            }

            C0398j(boolean z2, Density density, I28.n nVar, Function0 function0, Function0 function02, aC.j jVar, C1498j c1498j, List list, Function0 function03, Function1 function1, MutableState mutableState, Function1 function12, MutableState mutableState2, State state, Function1 function13, Function1 function14, Function1 function15, State state2, Function0 function04, Function0 function05) {
                this.f11208n = z2;
                this.f11211t = density;
                this.f11200O = nVar;
                this.J2 = function0;
                this.f11210r = function02;
                this.f11209o = jVar;
                this.f11205Z = c1498j;
                this.f11201S = list;
                this.f11207g = function03;
                this.E2 = function1;
                this.f11206e = mutableState;
                this.f11204X = function12;
                this.f11202T = mutableState2;
                this.f11199N = state;
                this.f11212v = function13;
                this.Xw = function14;
                this.jB = function15;
                this.f11203U = state2;
                this.P5 = function04;
                this.M7 = function05;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int qie(Density density, BoxWithConstraintsScope boxWithConstraintsScope) {
                return (int) density.l(Dp.KN(Dp.KN(102) + boxWithConstraintsScope.t()));
            }

            public final void KN(final BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
                int i3;
                final State state;
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
                    ComposerKt.p5(1394616796, i3, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetPreviewContent.<anonymous>.<anonymous> (PresetPreviewContent.kt:72)");
                }
                composer.eF(-548835868);
                final Density density = this.f11211t;
                Object objIF = composer.iF();
                Composer.Companion companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                    objIF = SnapshotStateKt.O(new Function0() { // from class: Vil.P
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(mz.j.C0398j.qie(density, BoxWithConstraints));
                        }
                    });
                    composer.o(objIF);
                }
                final State state2 = (State) objIF;
                composer.Xw();
                boolean z2 = !this.f11208n;
                composer.eF(-548825100);
                Object objIF2 = composer.iF();
                if (objIF2 == companion.n()) {
                    objIF2 = new Function1() { // from class: Vil.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(mz.j.C0398j.ty(state2, ((Integer) obj).intValue()));
                        }
                    };
                    composer.o(objIF2);
                }
                composer.Xw();
                EnterTransition enterTransitionT = EnterExitTransitionKt.fD(null, (Function1) objIF2, 1, null).t(EnterExitTransitionKt.HI(AnimationSpecKt.ty(200, 0, null, 6, null), 0.0f, 2, null));
                composer.eF(-548821740);
                Object objIF3 = composer.iF();
                if (objIF3 == companion.n()) {
                    objIF3 = new Function1() { // from class: Vil.iF
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(mz.j.C0398j.HI(state2, ((Integer) obj).intValue()));
                        }
                    };
                    composer.o(objIF3);
                }
                composer.Xw();
                AnimatedVisibilityKt.mUb(z2, null, enterTransitionT, EnterExitTransitionKt.N(null, (Function1) objIF3, 1, null).t(EnterExitTransitionKt.Ik(AnimationSpecKt.ty(200, 0, null, 6, null), 0.0f, 2, null)), null, ComposableLambdaKt.nr(-841963852, true, new C0399j(this.f11200O, this.J2, this.f11210r, this.f11209o, this.f11205Z, BoxWithConstraints, this.f11208n, this.f11201S, this.f11207g, this.E2, this.f11206e, this.f11204X, this.f11202T, this.f11199N, this.f11212v, this.Xw, this.jB, this.f11203U), composer, 54), composer, 200064, 18);
                boolean z3 = this.f11208n;
                composer.eF(-548693069);
                Object objIF4 = composer.iF();
                if (objIF4 == companion.n()) {
                    state = state2;
                    objIF4 = new Function1() { // from class: Vil.yg
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(mz.j.C0398j.ck(state, ((Integer) obj).intValue()));
                        }
                    };
                    composer.o(objIF4);
                } else {
                    state = state2;
                }
                composer.Xw();
                EnterTransition enterTransitionT2 = EnterExitTransitionKt.fD(null, (Function1) objIF4, 1, null).t(EnterExitTransitionKt.HI(AnimationSpecKt.ty(200, 0, null, 6, null), 0.0f, 2, null));
                composer.eF(-548689741);
                Object objIF5 = composer.iF();
                if (objIF5 == companion.n()) {
                    objIF5 = new Function1() { // from class: Vil.pO
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(mz.j.C0398j.xMQ(state, ((Integer) obj).intValue()));
                        }
                    };
                    composer.o(objIF5);
                }
                composer.Xw();
                AnimatedVisibilityKt.mUb(z3, null, enterTransitionT2, EnterExitTransitionKt.N(null, (Function1) objIF5, 1, null).t(EnterExitTransitionKt.Ik(AnimationSpecKt.ty(200, 0, null, 6, null), 0.0f, 2, null)), null, ComposableLambdaKt.nr(404481387, true, new n(this.J2, this.f11210r, this.f11209o, this.f11200O, this.f11208n, this.f11201S, this.E2, this.f11206e, this.f11204X), composer, 54), composer, 200064, 18);
                Modifier modifierN = BoxWithConstraints.n(Modifier.INSTANCE, Alignment.INSTANCE.rl());
                composer.eF(-548641534);
                Object objIF6 = composer.iF();
                if (objIF6 == companion.n()) {
                    objIF6 = new Function1() { // from class: Vil.Sis
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(mz.j.C0398j.mUb(((Integer) obj).intValue()));
                        }
                    };
                    composer.o(objIF6);
                }
                composer.Xw();
                EnterTransition enterTransitionFD = EnterExitTransitionKt.fD(null, (Function1) objIF6, 1, null);
                composer.eF(-548639934);
                Object objIF7 = composer.iF();
                if (objIF7 == companion.n()) {
                    objIF7 = new Function1() { // from class: Vil.l4Z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(mz.j.C0398j.gh(((Integer) obj).intValue()));
                        }
                    };
                    composer.o(objIF7);
                }
                composer.Xw();
                AnimatedVisibilityKt.mUb(this.f11208n, modifierN, enterTransitionFD, EnterExitTransitionKt.N(null, (Function1) objIF7, 1, null), null, ComposableLambdaKt.nr(137431596, true, new w6(this.P5, this.M7), composer, 54), composer, 200064, 16);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                KN((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int HI(State state, int i2) {
                return -az(state);
            }

            private static final int az(State state) {
                return ((Number) state.getValue()).intValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int ck(State state, int i2) {
                return az(state);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int ty(State state, int i2) {
                return -az(state);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int xMQ(State state, int i2) {
                return az(state);
            }
        }

        j(boolean z2, Density density, I28.n nVar, Function0 function0, Function0 function02, aC.j jVar, C1498j c1498j, List list, Function0 function03, Function1 function1, MutableState mutableState, Function1 function12, MutableState mutableState2, State state, Function1 function13, Function1 function14, Function1 function15, State state2, Function0 function04, Function0 function05) {
            this.f11194n = z2;
            this.f11197t = density;
            this.f11186O = nVar;
            this.J2 = function0;
            this.f11196r = function02;
            this.f11195o = jVar;
            this.f11191Z = c1498j;
            this.f11187S = list;
            this.f11193g = function03;
            this.E2 = function1;
            this.f11192e = mutableState;
            this.f11190X = function12;
            this.f11188T = mutableState2;
            this.f11185N = state;
            this.f11198v = function13;
            this.Xw = function14;
            this.jB = function15;
            this.f11189U = state2;
            this.P5 = function04;
            this.M7 = function05;
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
                ComposerKt.p5(1458172294, i2, -1, dpcnwfoVOnrtRA.SugShXYShz);
            }
            BoxWithConstraintsKt.n(null, null, false, ComposableLambdaKt.nr(1394616796, true, new C0398j(this.f11194n, this.f11197t, this.f11186O, this.J2, this.f11196r, this.f11195o, this.f11191Z, this.f11187S, this.f11193g, this.E2, this.f11192e, this.f11190X, this.f11188T, this.f11185N, this.f11198v, this.Xw, this.jB, this.f11189U, this.P5, this.M7), composer, 54), composer, 3072, 7);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(final aC.j viewState, final I28.n presetListState, final Function0 onCloseButtonClicked, final Function0 onApplyButtonClicked, final Function0 onDiscoverMoreClicked, final boolean z2, final List selectedPresets, final Function1 onPresetClicked, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function1 function14, Function0 function02, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        boolean z3;
        int i8;
        Function1 function15;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Function1 function16;
        Function0 function03;
        Function1 function17;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        Function0 function04;
        Object objIF;
        Composer.Companion companion;
        float f3;
        Object objIF2;
        Object objIF3;
        MutableState mutableState;
        Object objIF4;
        Composer composer2;
        final Function1 function111;
        final Function0 function05;
        final Function1 function112;
        final Function0 function06;
        final Function1 function113;
        final Function1 function114;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(presetListState, "presetListState");
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Intrinsics.checkNotNullParameter(onApplyButtonClicked, "onApplyButtonClicked");
        Intrinsics.checkNotNullParameter(onDiscoverMoreClicked, "onDiscoverMoreClicked");
        Intrinsics.checkNotNullParameter(selectedPresets, "selectedPresets");
        Intrinsics.checkNotNullParameter(onPresetClicked, "onPresetClicked");
        Composer composerKN = composer.KN(1336659778);
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
            i7 |= composerKN.p5(presetListState) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(onCloseButtonClicked) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= composerKN.E2(onApplyButtonClicked) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i7 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i7 |= composerKN.E2(onDiscoverMoreClicked) ? 16384 : 8192;
        }
        if ((i5 & 32) == 0) {
            if ((i2 & 196608) == 0) {
                z3 = z2;
                i7 |= composerKN.n(z3) ? 131072 : 65536;
            }
            if ((i5 & 64) == 0) {
                i7 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i7 |= composerKN.E2(selectedPresets) ? 1048576 : 524288;
            }
            if ((i5 & 128) == 0) {
                i7 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i7 |= composerKN.E2(onPresetClicked) ? 8388608 : 4194304;
            }
            i8 = i5 & 256;
            if (i8 == 0) {
                i7 |= 100663296;
                function15 = function1;
            } else {
                function15 = function1;
                if ((i2 & 100663296) == 0) {
                    i7 |= composerKN.E2(function15) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
            }
            i9 = i5 & 512;
            if (i9 == 0) {
                i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
            } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                i7 |= composerKN.E2(function12) ? 536870912 : 268435456;
            }
            i10 = i5 & 1024;
            if (i10 == 0) {
                i12 = i3 | 6;
                i11 = i10;
            } else if ((i3 & 6) == 0) {
                i11 = i10;
                i12 = i3 | (composerKN.E2(function0) ? 4 : 2);
            } else {
                i11 = i10;
                i12 = i3;
            }
            i13 = i5 & 2048;
            if (i13 == 0) {
                i12 |= 48;
                i14 = i13;
            } else if ((i3 & 48) == 0) {
                i14 = i13;
                i12 |= composerKN.E2(function13) ? 32 : 16;
            } else {
                i14 = i13;
            }
            int i19 = i12;
            i15 = i5 & 4096;
            if (i15 == 0) {
                i16 = i19 | RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                int i20 = i19;
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i20 |= composerKN.E2(function14) ? 256 : 128;
                }
                i16 = i20;
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
                i18 = i16 | 3072;
            } else {
                int i21 = i16;
                if ((i3 & 3072) == 0) {
                    i21 |= composerKN.E2(function02) ? 2048 : 1024;
                }
                i18 = i21;
            }
            if ((i7 & 306783379) != 306783378 && (i18 & 1171) == 1170 && composerKN.xMQ()) {
                composerKN.wTp();
                function114 = function12;
                function113 = function13;
                function112 = function14;
                composer2 = composerKN;
                function111 = function15;
                function05 = function0;
                function06 = function02;
            } else {
                if (i8 != 0) {
                    composerKN.eF(1461971936);
                    Object objIF5 = composerKN.iF();
                    if (objIF5 == Composer.INSTANCE.n()) {
                        objIF5 = new Function1() { // from class: Vil.M
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return mz.gh((C1960j) obj);
                            }
                        };
                        composerKN.o(objIF5);
                    }
                    composerKN.Xw();
                    function15 = (Function1) objIF5;
                }
                if (i9 == 0) {
                    composerKN.eF(1461973248);
                    Object objIF6 = composerKN.iF();
                    if (objIF6 == Composer.INSTANCE.n()) {
                        objIF6 = new Function1() { // from class: Vil.rv6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return mz.Ik((C1960j) obj);
                            }
                        };
                        composerKN.o(objIF6);
                    }
                    function16 = (Function1) objIF6;
                    composerKN.Xw();
                } else {
                    function16 = function12;
                }
                if (i11 == 0) {
                    composerKN.eF(1461974528);
                    Object objIF7 = composerKN.iF();
                    if (objIF7 == Composer.INSTANCE.n()) {
                        objIF7 = new Function0() { // from class: Vil.vd
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return mz.r();
                            }
                        };
                        composerKN.o(objIF7);
                    }
                    function03 = (Function0) objIF7;
                    composerKN.Xw();
                } else {
                    function03 = function0;
                }
                if (i14 == 0) {
                    composerKN.eF(1461975840);
                    Object objIF8 = composerKN.iF();
                    if (objIF8 == Composer.INSTANCE.n()) {
                        objIF8 = new Function1() { // from class: Vil.Lu
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return mz.o((C1960j) obj);
                            }
                        };
                        composerKN.o(objIF8);
                    }
                    function17 = (Function1) objIF8;
                    composerKN.Xw();
                } else {
                    function17 = function13;
                }
                if (i15 == 0) {
                    composerKN.eF(1461977152);
                    Object objIF9 = composerKN.iF();
                    function18 = function16;
                    if (objIF9 == Composer.INSTANCE.n()) {
                        objIF9 = new Function1() { // from class: Vil.h
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return mz.Z((C1960j) obj);
                            }
                        };
                        composerKN.o(objIF9);
                    }
                    function19 = (Function1) objIF9;
                    composerKN.Xw();
                } else {
                    function18 = function16;
                    function19 = function14;
                }
                if (i17 == 0) {
                    composerKN.eF(1461978432);
                    Object objIF10 = composerKN.iF();
                    function110 = function19;
                    if (objIF10 == Composer.INSTANCE.n()) {
                        objIF10 = new Function0() { // from class: Vil.K
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return mz.qie();
                            }
                        };
                        composerKN.o(objIF10);
                    }
                    composerKN.Xw();
                    function04 = (Function0) objIF10;
                } else {
                    function110 = function19;
                    function04 = function02;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1336659778, i7, i18, "com.alightcreative.maineditor.presetpreview.ui.components.PresetPreviewContent (PresetPreviewContent.kt:55)");
                }
                final Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                C1498j c1498jT = viewState.t();
                composerKN.eF(1461982761);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                Function0 function07 = function03;
                if (objIF != companion.n()) {
                    f3 = 0.0f;
                    objIF = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L))), null, 2, null);
                    composerKN.o(objIF);
                } else {
                    f3 = 0.0f;
                }
                final MutableState mutableState2 = (MutableState) objIF;
                composerKN.Xw();
                composerKN.eF(1461984817);
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                    objIF2 = SnapshotStateKt.O(new Function0() { // from class: Vil.psW
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return mz.az(density, mutableState2);
                        }
                    });
                    composerKN.o(objIF2);
                }
                State state = (State) objIF2;
                composerKN.Xw();
                composerKN.eF(1461988361);
                objIF3 = composerKN.iF();
                if (objIF3 != companion.n()) {
                    mutableState = mutableState2;
                    objIF3 = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(Offset.O((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L))), null, 2, null);
                    composerKN.o(objIF3);
                } else {
                    mutableState = mutableState2;
                }
                final MutableState mutableState3 = (MutableState) objIF3;
                composerKN.Xw();
                composerKN.eF(1461990640);
                objIF4 = composerKN.iF();
                if (objIF4 == companion.n()) {
                    objIF4 = SnapshotStateKt.O(new Function0() { // from class: Vil.Md
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return mz.HI(density, mutableState3);
                        }
                    });
                    composerKN.o(objIF4);
                }
                State state2 = (State) objIF4;
                composerKN.Xw();
                Modifier modifierJ2 = SizeKt.J2(WindowInsetsPadding_androidKt.O(BackgroundKt.nr(Modifier.INSTANCE, aD.w6.qm(), null, 2, null)), f3, 1, null);
                long jQm = aD.w6.qm();
                long jMYa = aD.w6.mYa();
                Function1 function115 = function110;
                Function1 function116 = function17;
                Function1 function117 = function15;
                boolean z4 = z3;
                Function1 function118 = function18;
                Function0 function08 = function04;
                ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(1458172294, true, new j(z4, density, presetListState, onCloseButtonClicked, onApplyButtonClicked, viewState, c1498jT, selectedPresets, onDiscoverMoreClicked, onPresetClicked, mutableState, function117, mutableState3, state2, function118, function116, function115, state, function07, function04), composerKN, 54);
                composer2 = composerKN;
                SurfaceKt.n(modifierJ2, null, jQm, jMYa, null, 0.0f, composableLambdaNr, composer2, 1576320, 50);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                function111 = function117;
                function05 = function07;
                function112 = function115;
                function06 = function08;
                function113 = function116;
                function114 = function118;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: Vil.Zs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return mz.ck(viewState, presetListState, onCloseButtonClicked, onApplyButtonClicked, onDiscoverMoreClicked, z2, selectedPresets, onPresetClicked, function111, function114, function05, function113, function112, function06, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i7 |= 196608;
        z3 = z2;
        if ((i5 & 64) == 0) {
        }
        if ((i5 & 128) == 0) {
        }
        i8 = i5 & 256;
        if (i8 == 0) {
        }
        i9 = i5 & 512;
        if (i9 == 0) {
        }
        i10 = i5 & 1024;
        if (i10 == 0) {
        }
        i13 = i5 & 2048;
        if (i13 == 0) {
        }
        int i192 = i12;
        i15 = i5 & 4096;
        if (i15 == 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        if ((i7 & 306783379) != 306783378) {
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            if (i11 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (ComposerKt.v()) {
            }
            final Density density2 = (Density) composerKN.ty(CompositionLocalsKt.J2());
            C1498j c1498jT2 = viewState.t();
            composerKN.eF(1461982761);
            objIF = composerKN.iF();
            companion = Composer.INSTANCE;
            Function0 function072 = function03;
            if (objIF != companion.n()) {
            }
            final MutableState mutableState22 = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(1461984817);
            objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
            }
            State state3 = (State) objIF2;
            composerKN.Xw();
            composerKN.eF(1461988361);
            objIF3 = composerKN.iF();
            if (objIF3 != companion.n()) {
            }
            final MutableState mutableState32 = (MutableState) objIF3;
            composerKN.Xw();
            composerKN.eF(1461990640);
            objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
            }
            State state22 = (State) objIF4;
            composerKN.Xw();
            Modifier modifierJ22 = SizeKt.J2(WindowInsetsPadding_androidKt.O(BackgroundKt.nr(Modifier.INSTANCE, aD.w6.qm(), null, 2, null)), f3, 1, null);
            long jQm2 = aD.w6.qm();
            long jMYa2 = aD.w6.mYa();
            Function1 function1152 = function110;
            Function1 function1162 = function17;
            Function1 function1172 = function15;
            boolean z42 = z3;
            Function1 function1182 = function18;
            Function0 function082 = function04;
            ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(1458172294, true, new j(z42, density2, presetListState, onCloseButtonClicked, onApplyButtonClicked, viewState, c1498jT2, selectedPresets, onDiscoverMoreClicked, onPresetClicked, mutableState, function1172, mutableState32, state22, function1182, function1162, function1152, state3, function072, function04), composerKN, 54);
            composer2 = composerKN;
            SurfaceKt.n(modifierJ22, null, jQm2, jMYa2, null, 0.0f, composableLambdaNr2, composer2, 1576320, 50);
            if (ComposerKt.v()) {
            }
            function111 = function1172;
            function05 = function072;
            function112 = function1152;
            function06 = function082;
            function113 = function1162;
            function114 = function1182;
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(C1960j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(C1960j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(aC.j jVar, I28.n nVar, Function0 function0, Function0 function02, Function0 function03, boolean z2, List list, Function1 function1, Function1 function12, Function1 function13, Function0 function04, Function1 function14, Function1 function15, Function0 function05, int i2, int i3, int i5, Composer composer, int i7) {
        mUb(jVar, nVar, function0, function02, function03, z2, list, function1, function12, function13, function04, function14, function15, function05, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(C1960j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(C1960j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp HI(Density density, MutableState mutableState) {
        return Dp.nr(density.bzg(Float.intBitsToFloat((int) (((Offset) mutableState.getValue()).getPackedValue() & 4294967295L))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp az(Density density, MutableState mutableState) {
        return Dp.nr(density.bzg(Float.intBitsToFloat((int) (((Offset) mutableState.getValue()).getPackedValue() & 4294967295L))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ty(State state) {
        return ((Dp) state.getValue()).getValue();
    }
}
