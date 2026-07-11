package c0;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import c0.w6;
import coil.compose.ContentPainterElement;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {

    public static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f43524n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0) {
            super(0);
            this.f43524n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f43524n.invoke();
        }
    }

    static final class n implements MeasurePolicy {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f43525n = new n();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Placeable.PlacementScope placementScope) {
            return Unit.INSTANCE;
        }

        n() {
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
            return MeasureScope.ER(measureScope, Constraints.ty(j2), Constraints.az(j2), null, new Function1() { // from class: c0.Ml
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w6.n.t((Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
    }

    public static final void nr(Object obj, String str, eQ.fuX fux, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1 function1, Function1 function12, Function1 function13, Alignment alignment, ContentScale contentScale, float f3, ColorFilter colorFilter, int i2, boolean z2, Xo xo, Composer composer, int i3, int i5, int i7) {
        composer.te(-1481548872);
        Modifier modifier2 = (i7 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Painter painter4 = (i7 & 16) != 0 ? null : painter;
        Painter painter5 = (i7 & 32) != 0 ? null : painter2;
        Painter painter6 = (i7 & 64) != 0 ? painter5 : painter3;
        Function1 function14 = (i7 & 128) != 0 ? null : function1;
        Function1 function15 = (i7 & 256) != 0 ? null : function12;
        Function1 function16 = (i7 & 512) != 0 ? null : function13;
        Alignment alignmentO = (i7 & 1024) != 0 ? Alignment.INSTANCE.O() : alignment;
        ContentScale contentScaleO = (i7 & 2048) != 0 ? ContentScale.INSTANCE.O() : contentScale;
        float f4 = (i7 & 4096) != 0 ? 1.0f : f3;
        int i8 = i5 << 15;
        t(new Dsr(obj, (i7 & 65536) != 0 ? eO.n() : xo, fux), str, modifier2, AbstractC1676c.Ik(painter4, painter5, painter6), AbstractC1676c.mUb(function14, function15, function16), alignmentO, contentScaleO, f4, (i7 & 8192) == 0 ? colorFilter : null, (i7 & 16384) != 0 ? DrawScope.INSTANCE.rl() : i2, (32768 & i7) != 0 ? true : z2, composer, (i3 & 112) | ((i3 >> 3) & 896) | (458752 & i8) | (3670016 & i8) | (29360128 & i8) | (234881024 & i8) | (i8 & 1879048192), (i5 >> 15) & 14);
        composer.M7();
    }

    private static final void t(Dsr dsr, final String str, final Modifier modifier, final Function1 function1, final Function1 function12, final Alignment alignment, final ContentScale contentScale, final float f3, final ColorFilter colorFilter, final int i2, final boolean z2, Composer composer, final int i3, final int i5) {
        final Dsr dsr2;
        int i7;
        Function1 function13;
        Function1 function14;
        int i8;
        Composer composerKN = composer.KN(-421592773);
        if ((i3 & 14) == 0) {
            dsr2 = dsr;
            i7 = (composerKN.p5(dsr2) ? 4 : 2) | i3;
        } else {
            dsr2 = dsr;
            i7 = i3;
        }
        if ((i3 & 112) == 0) {
            i7 |= composerKN.p5(str) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i7 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            function13 = function1;
            i7 |= composerKN.E2(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i3 & 57344) == 0) {
            function14 = function12;
            i7 |= composerKN.E2(function14) ? 16384 : 8192;
        } else {
            function14 = function12;
        }
        if ((i3 & 458752) == 0) {
            i7 |= composerKN.p5(alignment) ? 131072 : 65536;
        }
        if ((i3 & 3670016) == 0) {
            i7 |= composerKN.p5(contentScale) ? 1048576 : 524288;
        }
        if ((i3 & 29360128) == 0) {
            i7 |= composerKN.rl(f3) ? 8388608 : 4194304;
        }
        if ((234881024 & i3) == 0) {
            i7 |= composerKN.p5(colorFilter) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & 1879048192) == 0) {
            i7 |= composerKN.t(i2) ? 536870912 : 268435456;
        }
        int i9 = i7;
        if ((i5 & 14) == 0) {
            i8 = i5 | (composerKN.n(z2) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i9 & 1533916891) == 306783378 && (i8 & 11) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            FjR.fuX fuxAz = AbstractC1676c.az(dsr2.rl(), contentScale, composerKN, ((i9 >> 15) & 112) | 8);
            int i10 = i9 >> 3;
            int i11 = i9 >> 6;
            int i12 = i11 & 57344;
            Wre wreT = fuX.t(fuxAz, dsr2.n(), function13, function14, contentScale, i2, dsr2.t(), composerKN, (i10 & 7168) | (i10 & 896) | 72 | i12 | ((i9 >> 12) & 458752), 0);
            Z.Dsr dsrS7N = fuxAz.s7N();
            J2(dsrS7N instanceof C ? modifier.Zmq((Modifier) dsrS7N) : modifier, wreT, str, alignment, contentScale, f3, colorFilter, z2, composerKN, ((i9 << 3) & 896) | (i11 & 7168) | i12 | (i11 & 458752) | (i11 & 3670016) | ((i8 << 21) & 29360128));
            composerKN = composerKN;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: c0.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w6.O(dsr2, str, modifier, function1, function12, alignment, contentScale, f3, colorFilter, i2, z2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void J2(final Modifier modifier, final Wre wre, final String str, final Alignment alignment, final ContentScale contentScale, final float f3, final ColorFilter colorFilter, final boolean z2, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(777774312);
        if ((i2 & 14) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerKN.p5(wre) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerKN.p5(str) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerKN.p5(alignment) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerKN.p5(contentScale) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerKN.rl(f3) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerKN.p5(colorFilter) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerKN.n(z2) ? 8388608 : 4194304;
        }
        if ((i3 & 23967451) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            Modifier modifierJ2 = AbstractC1676c.J2(modifier, str);
            if (z2) {
                modifierJ2 = ClipKt.rl(modifierJ2);
            }
            Modifier modifierZmq = modifierJ2.Zmq(new ContentPainterElement(wre, alignment, contentScale, f3, colorFilter));
            n nVar = n.f43525n;
            composerKN.te(544976794);
            int iN = ComposablesKt.n(composerKN, 0);
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            composerKN.te(1405779621);
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(new j(function0N));
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, nVar, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Updater.O(composerN, modifierO, companion.nr());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            composerKN.XQ();
            composerKN.M7();
            composerKN.M7();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: c0.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w6.Uo(modifier, wre, str, alignment, contentScale, f3, colorFilter, z2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Dsr dsr, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f3, ColorFilter colorFilter, int i2, boolean z2, int i3, int i5, Composer composer, int i7) {
        t(dsr, str, modifier, function1, function12, alignment, contentScale, f3, colorFilter, i2, z2, composer, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Modifier modifier, Wre wre, String str, Alignment alignment, ContentScale contentScale, float f3, ColorFilter colorFilter, boolean z2, int i2, Composer composer, int i3) {
        J2(modifier, wre, str, alignment, contentScale, f3, colorFilter, z2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
