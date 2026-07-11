package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "t", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$6\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2543:1\n85#2:2544\n81#2,7:2545\n88#2:2580\n92#2:2591\n78#3,6:2552\n85#3,4:2567\n89#3,2:2577\n93#3:2590\n368#4,9:2558\n377#4:2579\n378#4,2:2588\n4032#5,6:2571\n56#6:2581\n1223#7,6:2582\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$6\n*L\n2044#1:2544\n2044#1:2545,7\n2044#1:2580\n2044#1:2591\n2044#1:2552,6\n2044#1:2567,4\n2044#1:2577,2\n2044#1:2590\n2044#1:2558,9\n2044#1:2579\n2044#1:2588,2\n2044#1:2571,6\n2073#1:2581\n2074#1:2582,6\n*E\n"})
final class AppBarKt$TwoRowsTopAppBar$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ float E2;
    final /* synthetic */ Function2 J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final /* synthetic */ float f24391N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TopAppBarColors f24392O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Function2 f24393S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    final /* synthetic */ TextStyle f24394T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    final /* synthetic */ Function2 f24395X;
    final /* synthetic */ boolean Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ boolean f24396Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TopAppBarScrollBehavior f24397e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2 f24398g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ WindowInsets f24399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ float f24400o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ TextStyle f24401r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ float f24402t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final /* synthetic */ Ref.IntRef f24403v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppBarKt$TwoRowsTopAppBar$6(WindowInsets windowInsets, float f3, TopAppBarColors topAppBarColors, Function2 function2, TextStyle textStyle, float f4, boolean z2, Function2 function22, Function2 function23, float f5, TopAppBarScrollBehavior topAppBarScrollBehavior, Function2 function24, TextStyle textStyle2, float f6, Ref.IntRef intRef, boolean z3) {
        super(2);
        this.f24399n = windowInsets;
        this.f24402t = f3;
        this.f24392O = topAppBarColors;
        this.J2 = function2;
        this.f24401r = textStyle;
        this.f24400o = f4;
        this.f24396Z = z2;
        this.f24393S = function22;
        this.f24398g = function23;
        this.E2 = f5;
        this.f24397e = topAppBarScrollBehavior;
        this.f24395X = function24;
        this.f24394T = textStyle2;
        this.f24391N = f6;
        this.f24403v = intRef;
        this.Xw = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nr() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float O(TopAppBarScrollBehavior topAppBarScrollBehavior) {
        TopAppBarState state;
        if (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.t();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        t(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void t(Composer composer, int i2) {
        if ((i2 & 3) == 2 && composer.xMQ()) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1350062619, i2, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2043)");
        }
        WindowInsets windowInsets = this.f24399n;
        float f3 = this.f24402t;
        TopAppBarColors topAppBarColors = this.f24392O;
        Function2 function2 = this.J2;
        TextStyle textStyle = this.f24401r;
        float f4 = this.f24400o;
        boolean z2 = this.f24396Z;
        Function2 function22 = this.f24393S;
        Function2 function23 = this.f24398g;
        float f5 = this.E2;
        final TopAppBarScrollBehavior topAppBarScrollBehavior = this.f24397e;
        Function2 function24 = this.f24395X;
        TextStyle textStyle2 = this.f24394T;
        float f6 = this.f24391N;
        Ref.IntRef intRef = this.f24403v;
        boolean z3 = this.Xw;
        Modifier.Companion companion = Modifier.INSTANCE;
        Arrangement arrangement = Arrangement.f17400n;
        MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), Alignment.INSTANCE.gh(), composer, 0);
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
        AppBarKt.Ik(SizeKt.gh(ClipKt.rl(WindowInsetsPaddingKt.nr(companion, windowInsets)), 0.0f, f3, 1, null), new ScrolledOffset() { // from class: androidx.compose.material3.n
            @Override // androidx.compose.material3.ScrolledOffset
            public final float n() {
                return AppBarKt$TwoRowsTopAppBar$6.nr();
            }
        }, topAppBarColors.getNavigationIconContentColor(), topAppBarColors.getTitleContentColor(), topAppBarColors.getActionIconContentColor(), function2, textStyle, f4, arrangement.rl(), arrangement.J2(), 0, z2, function22, function23, composer, 905969712, 3078);
        Modifier modifierGh = SizeKt.gh(ClipKt.rl(WindowInsetsPaddingKt.nr(companion, WindowInsetsKt.KN(windowInsets, WindowInsetsSides.INSTANCE.Uo()))), 0.0f, Dp.KN(f5 - f3), 1, null);
        boolean zP5 = composer.p5(topAppBarScrollBehavior);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new ScrolledOffset() { // from class: androidx.compose.material3.w6
                @Override // androidx.compose.material3.ScrolledOffset
                public final float n() {
                    return AppBarKt$TwoRowsTopAppBar$6.O(topAppBarScrollBehavior);
                }
            };
            composer.o(objIF);
        }
        long navigationIconContentColor = topAppBarColors.getNavigationIconContentColor();
        long titleContentColor = topAppBarColors.getTitleContentColor();
        long actionIconContentColor = topAppBarColors.getActionIconContentColor();
        Arrangement.Vertical verticalN = arrangement.n();
        Arrangement.Horizontal horizontalJ2 = arrangement.J2();
        int i3 = intRef.element;
        ComposableSingletons$AppBarKt composableSingletons$AppBarKt = ComposableSingletons$AppBarKt.f25044n;
        AppBarKt.Ik(modifierGh, (ScrolledOffset) objIF, navigationIconContentColor, titleContentColor, actionIconContentColor, function24, textStyle2, f6, verticalN, horizontalJ2, i3, z3, composableSingletons$AppBarKt.xMQ(), composableSingletons$AppBarKt.mUb(), composer, 905969664, 3456);
        composer.XQ();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
