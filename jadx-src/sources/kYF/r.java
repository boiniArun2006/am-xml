package kYF;

import Z.w6;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class r implements s4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f69955n = new j(null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    @Override // kYF.s4
    public boolean rl() {
        return C2212c.f69942n.rl(null);
    }

    public r(SPz sPz) {
    }

    @Override // kYF.s4
    public boolean n(Z.fuX fux) {
        int i2;
        Z.w6 w6VarNr = fux.nr();
        int i3 = Integer.MAX_VALUE;
        if (w6VarNr instanceof w6.j) {
            i2 = ((w6.j) w6VarNr).f12273n;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (i2 > 100) {
            Z.w6 w6VarT = fux.t();
            if (w6VarT instanceof w6.j) {
                i3 = ((w6.j) w6VarT).f12273n;
            }
            if (i3 > 100) {
                return true;
            }
            return false;
        }
        return false;
    }
}
