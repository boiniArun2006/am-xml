package P0j;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Dsr {
    private static final Dsr gh;
    private static final Dsr mUb;
    private static final Dsr qie;
    public static final j xMQ = new j(null);
    private final Color J2;
    private final Function0 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f7560O;
    private final long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f7561n;
    private final boolean nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f7562t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Dsr n() {
            return Dsr.mUb;
        }

        public final Dsr rl() {
            return Dsr.qie;
        }
    }

    public /* synthetic */ Dsr(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Color color, long j2, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3, z4, z5, z6, color, j2, function0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return this.f7561n == dsr.f7561n && this.rl == dsr.rl && this.f7562t == dsr.f7562t && this.nr == dsr.nr && this.f7560O == dsr.f7560O && Intrinsics.areEqual(this.J2, dsr.J2) && TextUnit.O(this.Uo, dsr.Uo) && Intrinsics.areEqual(this.KN, dsr.KN);
    }

    static {
        boolean z2 = false;
        boolean z3 = false;
        mUb = new Dsr(false, z2, true, z3, false, null, 0L, null, 251, null);
        boolean z4 = false;
        boolean z5 = false;
        gh = new Dsr(z2, z4, z3, true, z5, null, 0L, null, 247, null);
        qie = new Dsr(z4, true, false, z5, false, null, 0L, null, 253, null);
    }

    private Dsr(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Color color, long j2, Function0 function0) {
        this.f7561n = z2;
        this.rl = z3;
        this.f7562t = z4;
        this.nr = z5;
        this.f7560O = z6;
        this.J2 = color;
        this.Uo = j2;
        this.KN = function0;
    }

    public final boolean J2() {
        return this.f7560O;
    }

    public final Function0 KN() {
        return this.KN;
    }

    public final long O() {
        return this.Uo;
    }

    public final boolean Uo() {
        return this.rl;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f7561n) * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f7562t)) * 31) + Boolean.hashCode(this.nr)) * 31) + Boolean.hashCode(this.f7560O)) * 31;
        Color color = this.J2;
        int iXQ = (((iHashCode + (color == null ? 0 : Color.XQ(color.getValue()))) * 31) + TextUnit.xMQ(this.Uo)) * 31;
        Function0 function0 = this.KN;
        return iXQ + (function0 != null ? function0.hashCode() : 0);
    }

    public final boolean mUb() {
        return this.f7561n;
    }

    public final Color nr() {
        return this.J2;
    }

    public final boolean t() {
        return this.f7562t;
    }

    public String toString() {
        return "StringTransformation(underline=" + this.f7561n + ", lineThrough=" + this.rl + ", bold=" + this.f7562t + pTYaLzzmJSGAPQ.VQLXMxFho + this.nr + ", italic=" + this.f7560O + ", color=" + this.J2 + ", fontSize=" + TextUnit.gh(this.Uo) + ", onClick=" + this.KN + ")";
    }

    public final boolean xMQ() {
        return this.nr;
    }

    public /* synthetic */ Dsr(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Color color, long j2, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3, (i2 & 4) != 0 ? false : z4, (i2 & 8) != 0 ? false : z5, (i2 & 16) != 0 ? false : z6, (i2 & 32) != 0 ? null : color, (i2 & 64) != 0 ? TextUnit.INSTANCE.n() : j2, (i2 & 128) == 0 ? function0 : null, null);
    }
}
