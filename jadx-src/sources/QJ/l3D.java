package QJ;

import android.graphics.Paint;
import ef.C1965c;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class l3D implements w6 {
    private final GO.n J2;
    private final n KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final GO.Ml f8021O;
    private final j Uo;
    private final boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8022n;
    private final GO.j nr;
    private final GO.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f8023t;
    private final float xMQ;

    public enum j {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap rl() {
            int iOrdinal = ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum n {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join rl() {
            int iOrdinal = ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        return null;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }
    }

    public List J2() {
        return this.f8023t;
    }

    public String KN() {
        return this.f8022n;
    }

    public n O() {
        return this.KN;
    }

    public float Uo() {
        return this.xMQ;
    }

    public boolean gh() {
        return this.mUb;
    }

    public GO.n mUb() {
        return this.J2;
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new C1965c(xo, nVar, this);
    }

    public GO.n nr() {
        return this.rl;
    }

    public j rl() {
        return this.Uo;
    }

    public GO.j t() {
        return this.nr;
    }

    public GO.Ml xMQ() {
        return this.f8021O;
    }

    public l3D(String str, GO.n nVar, List list, GO.j jVar, GO.Ml ml, GO.n nVar2, j jVar2, n nVar3, float f3, boolean z2) {
        this.f8022n = str;
        this.rl = nVar;
        this.f8023t = list;
        this.nr = jVar;
        this.f8021O = ml;
        this.J2 = nVar2;
        this.Uo = jVar2;
        this.KN = nVar3;
        this.xMQ = f3;
        this.mUb = z2;
    }
}
