package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "rl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults$tabIndicatorOffset$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1361:1\n1223#2,6:1362\n81#3:1368\n81#3:1369\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults$tabIndicatorOffset$2\n*L\n1284#1:1362,6\n1273#1:1368\n1278#1:1369\n*E\n"})
final class TabRowDefaults$tabIndicatorOffset$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ TabPosition f28121n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        super(3);
        this.f28121n = tabPosition;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return rl(modifier, composer, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nr(State state) {
        return ((Dp) state.getValue()).getValue();
    }

    private static final float t(State state) {
        return ((Dp) state.getValue()).getValue();
    }

    public final Modifier rl(Modifier modifier, Composer composer, int i2) {
        composer.eF(-1541271084);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1541271084, i2, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1271)");
        }
        State stateT = AnimateAsStateKt.t(this.f28121n.getWidth(), TabRowKt.f28124t, null, null, composer, 0, 12);
        final State stateT2 = AnimateAsStateKt.t(this.f28121n.getLeft(), TabRowKt.f28124t, null, null, composer, 0, 12);
        Modifier modifierE2 = SizeKt.E2(SizeKt.KN(modifier, 0.0f, 1, null), Alignment.INSTANCE.nr(), false, 2, null);
        boolean zP5 = composer.p5(stateT2);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$2$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                    return IntOffset.t(n(density));
                }

                public final long n(Density density) {
                    return IntOffsetKt.n(density.How(TabRowDefaults$tabIndicatorOffset$2.nr(stateT2)), 0);
                }
            };
            composer.o(objIF);
        }
        Modifier modifierViF = SizeKt.ViF(OffsetKt.n(modifierE2, (Function1) objIF), t(stateT));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return modifierViF;
    }
}
