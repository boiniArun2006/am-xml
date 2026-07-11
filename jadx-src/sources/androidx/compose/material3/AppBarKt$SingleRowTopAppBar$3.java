package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "rl", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2543:1\n1223#2,6:2544\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$SingleRowTopAppBar$3\n*L\n1934#1:2544,6\n*E\n"})
final class AppBarKt$SingleRowTopAppBar$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TopAppBarColors J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TopAppBarScrollBehavior f24324O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Function2 f24325S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ boolean f24326Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2 f24327g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ WindowInsets f24328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ TextStyle f24329o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function2 f24330r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ float f24331t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppBarKt$SingleRowTopAppBar$3(WindowInsets windowInsets, float f3, TopAppBarScrollBehavior topAppBarScrollBehavior, TopAppBarColors topAppBarColors, Function2 function2, TextStyle textStyle, boolean z2, Function2 function22, Function2 function23) {
        super(2);
        this.f24328n = windowInsets;
        this.f24331t = f3;
        this.f24324O = topAppBarScrollBehavior;
        this.J2 = topAppBarColors;
        this.f24330r = function2;
        this.f24329o = textStyle;
        this.f24326Z = z2;
        this.f24325S = function22;
        this.f24327g = function23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(TopAppBarScrollBehavior topAppBarScrollBehavior) {
        TopAppBarState state;
        if (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.t();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        rl(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void rl(Composer composer, int i2) {
        if ((i2 & 3) == 2 && composer.xMQ()) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1943739546, i2, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1927)");
        }
        Modifier modifierGh = SizeKt.gh(ClipKt.rl(WindowInsetsPaddingKt.nr(Modifier.INSTANCE, this.f24328n)), 0.0f, this.f24331t, 1, null);
        boolean zP5 = composer.p5(this.f24324O);
        final TopAppBarScrollBehavior topAppBarScrollBehavior = this.f24324O;
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new ScrolledOffset() { // from class: androidx.compose.material3.j
                @Override // androidx.compose.material3.ScrolledOffset
                public final float n() {
                    return AppBarKt$SingleRowTopAppBar$3.t(topAppBarScrollBehavior);
                }
            };
            composer.o(objIF);
        }
        ScrolledOffset scrolledOffset = (ScrolledOffset) objIF;
        long navigationIconContentColor = this.J2.getNavigationIconContentColor();
        long titleContentColor = this.J2.getTitleContentColor();
        long actionIconContentColor = this.J2.getActionIconContentColor();
        Function2 function2 = this.f24330r;
        TextStyle textStyle = this.f24329o;
        Arrangement arrangement = Arrangement.f17400n;
        AppBarKt.Ik(modifierGh, scrolledOffset, navigationIconContentColor, titleContentColor, actionIconContentColor, function2, textStyle, 1.0f, arrangement.rl(), this.f24326Z ? arrangement.rl() : arrangement.J2(), 0, false, this.f24325S, this.f24327g, composer, 113246208, 3126);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
