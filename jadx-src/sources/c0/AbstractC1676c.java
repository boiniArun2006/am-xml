package c0;

import FjR.fuX;
import Z.w6;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import c0.Wre;
import coil.request.NullRequestDataException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: c0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC1676c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f43496n = Constraints.INSTANCE.t(0, 0);
    private static final Z.Dsr rl = Z.aC.n(Z.fuX.nr);

    public static final Z.CN3 HI(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.INSTANCE;
        return (Intrinsics.areEqual(contentScale, companion.O()) || Intrinsics.areEqual(contentScale, companion.J2())) ? Z.CN3.f12264t : Z.CN3.f12263n;
    }

    public static final Function1 Ik(final Painter painter, final Painter painter2, final Painter painter3) {
        return (painter == null && painter2 == null && painter3 == null) ? Wre.eF.n() : new Function1() { // from class: c0.l3D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC1676c.r(painter, painter3, painter2, (Wre.n) obj);
            }
        };
    }

    public static final Modifier J2(Modifier modifier, final String str) {
        return str != null ? SemanticsModifierKt.nr(modifier, false, new Function1() { // from class: c0.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC1676c.Uo(str, (SemanticsPropertyReceiver) obj);
            }
        }, 1, null) : modifier;
    }

    public static final long KN() {
        return f43496n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Function1 function1, Function1 function12, Function1 function13, Wre.n nVar) {
        if (nVar instanceof Wre.n.w6) {
            if (function1 != null) {
                function1.invoke(nVar);
            }
        } else if (nVar instanceof Wre.n.Ml) {
            if (function12 != null) {
                function12.invoke(nVar);
            }
        } else if (nVar instanceof Wre.n.C0584n) {
            if (function13 != null) {
                function13.invoke(nVar);
            }
        } else if (!(nVar instanceof Wre.n.j)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public static final Function1 mUb(final Function1 function1, final Function1 function12, final Function1 function13) {
        if (function1 == null && function12 == null && function13 == null) {
            return null;
        }
        return new Function1() { // from class: c0.QJ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC1676c.gh(function1, function12, function13, (Wre.n) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Wre.n r(Painter painter, Painter painter2, Painter painter3, Wre.n nVar) {
        if (nVar instanceof Wre.n.w6) {
            Wre.n.w6 w6Var = (Wre.n.w6) nVar;
            return painter != null ? w6Var.rl(painter) : w6Var;
        }
        boolean z2 = nVar instanceof Wre.n.C0584n;
        Wre.n nVar2 = nVar;
        if (z2) {
            Wre.n.C0584n c0584n = (Wre.n.C0584n) nVar;
            boolean z3 = c0584n.nr().t() instanceof NullRequestDataException;
            nVar2 = c0584n;
            nVar2 = c0584n;
            if (z3) {
                if (painter2 != null) {
                    return Wre.n.C0584n.t(c0584n, painter2, null, 2, null);
                }
            } else if (painter3 != null) {
                return Wre.n.C0584n.t(c0584n, painter3, null, 2, null);
            }
        }
        return nVar2;
    }

    public static final float O(long j2, float f3) {
        return RangesKt.coerceIn(f3, Constraints.ty(j2), Constraints.qie(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.I(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.O());
        return Unit.INSTANCE;
    }

    public static final FjR.fuX az(Object obj, ContentScale contentScale, Composer composer, int i2) {
        Z.Dsr dsr;
        composer.te(1677680258);
        boolean z2 = obj instanceof FjR.fuX;
        if (z2) {
            FjR.fuX fux = (FjR.fuX) obj;
            if (fux.Ik().az() != null) {
                composer.M7();
                return fux;
            }
        }
        composer.te(408306591);
        if (Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.Uo())) {
            dsr = rl;
        } else {
            composer.te(408309406);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new C();
                composer.o(objIF);
            }
            dsr = (C) objIF;
            composer.M7();
        }
        composer.M7();
        if (z2) {
            composer.te(-227230258);
            FjR.fuX fux2 = (FjR.fuX) obj;
            composer.te(408312509);
            boolean zP5 = composer.p5(fux2) | composer.p5(dsr);
            Object objIF2 = composer.iF();
            if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = FjR.fuX.U(fux2, null, 1, null).gh(dsr).n();
                composer.o(objIF2);
            }
            FjR.fuX fux3 = (FjR.fuX) objIF2;
            composer.M7();
            composer.M7();
            composer.M7();
            return fux3;
        }
        composer.te(-227066702);
        Context context = (Context) composer.ty(AndroidCompositionLocals_androidKt.Uo());
        composer.te(408319118);
        boolean zP52 = composer.p5(context) | composer.p5(obj) | composer.p5(dsr);
        Object objIF3 = composer.iF();
        if (zP52 || objIF3 == Composer.INSTANCE.n()) {
            objIF3 = new fuX.j(context).rl(obj).gh(dsr).n();
            composer.o(objIF3);
        }
        FjR.fuX fux4 = (FjR.fuX) objIF3;
        composer.M7();
        composer.M7();
        composer.M7();
        return fux4;
    }

    public static final Z.fuX ck(long j2) {
        Z.w6 w6VarN;
        Z.w6 w6VarN2;
        if (Constraints.ck(j2)) {
            return null;
        }
        if (Constraints.KN(j2)) {
            w6VarN = Z.j.n(Constraints.qie(j2));
        } else {
            w6VarN = w6.n.f12274n;
        }
        if (Constraints.Uo(j2)) {
            w6VarN2 = Z.j.n(Constraints.gh(j2));
        } else {
            w6VarN2 = w6.n.f12274n;
        }
        return new Z.fuX(w6VarN, w6VarN2);
    }

    public static final float nr(long j2, float f3) {
        return RangesKt.coerceIn(f3, Constraints.az(j2), Constraints.gh(j2));
    }

    public static final FjR.fuX qie(Object obj, Composer composer, int i2) {
        composer.te(1087186730);
        if (obj instanceof FjR.fuX) {
            FjR.fuX fux = (FjR.fuX) obj;
            composer.M7();
            return fux;
        }
        Context context = (Context) composer.ty(AndroidCompositionLocals_androidKt.Uo());
        composer.te(-1245195153);
        boolean zP5 = composer.p5(context) | composer.p5(obj);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new fuX.j(context).rl(obj).n();
            composer.o(objIF);
        }
        FjR.fuX fux2 = (FjR.fuX) objIF;
        composer.M7();
        composer.M7();
        return fux2;
    }

    public static final long ty(long j2) {
        return IntSizeKt.n(MathKt.roundToInt(Size.gh(j2)), MathKt.roundToInt(Size.xMQ(j2)));
    }

    public static final boolean xMQ(long j2) {
        if (Size.gh(j2) >= 0.5d && Size.xMQ(j2) >= 0.5d) {
            return true;
        }
        return false;
    }
}
