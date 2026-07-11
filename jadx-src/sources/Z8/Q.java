package Z8;

import Z8.qz;
import android.util.SparseArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Q {

    public static abstract class j {
        public abstract Q n();

        public abstract j rl(n nVar);

        public abstract j t(w6 w6Var);
    }

    public enum n {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);


        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final SparseArray f12300E;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f12315n;

        static {
            n nVar = UNKNOWN_MOBILE_SUBTYPE;
            n nVar2 = GPRS;
            n nVar3 = EDGE;
            n nVar4 = UMTS;
            n nVar5 = CDMA;
            n nVar6 = EVDO_0;
            n nVar7 = EVDO_A;
            n nVar8 = RTT;
            n nVar9 = HSDPA;
            n nVar10 = HSUPA;
            n nVar11 = HSPA;
            n nVar12 = IDEN;
            n nVar13 = EVDO_B;
            n nVar14 = LTE;
            n nVar15 = EHRPD;
            n nVar16 = HSPAP;
            n nVar17 = GSM;
            n nVar18 = TD_SCDMA;
            n nVar19 = IWLAN;
            n nVar20 = LTE_CA;
            SparseArray sparseArray = new SparseArray();
            f12300E = sparseArray;
            sparseArray.put(0, nVar);
            sparseArray.put(1, nVar2);
            sparseArray.put(2, nVar3);
            sparseArray.put(3, nVar4);
            sparseArray.put(4, nVar5);
            sparseArray.put(5, nVar6);
            sparseArray.put(6, nVar7);
            sparseArray.put(7, nVar8);
            sparseArray.put(8, nVar9);
            sparseArray.put(9, nVar10);
            sparseArray.put(10, nVar11);
            sparseArray.put(11, nVar12);
            sparseArray.put(12, nVar13);
            sparseArray.put(13, nVar14);
            sparseArray.put(14, nVar15);
            sparseArray.put(15, nVar16);
            sparseArray.put(16, nVar17);
            sparseArray.put(17, nVar18);
            sparseArray.put(18, nVar19);
            sparseArray.put(19, nVar20);
        }

        public static n n(int i2) {
            return (n) f12300E.get(i2);
        }

        public int rl() {
            return this.f12315n;
        }

        n(int i2) {
            this.f12315n = i2;
        }
    }

    public enum w6 {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);

        private static final SparseArray p5;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f12329n;

        static {
            w6 w6Var = MOBILE;
            w6 w6Var2 = WIFI;
            w6 w6Var3 = MOBILE_MMS;
            w6 w6Var4 = MOBILE_SUPL;
            w6 w6Var5 = MOBILE_DUN;
            w6 w6Var6 = MOBILE_HIPRI;
            w6 w6Var7 = WIMAX;
            w6 w6Var8 = BLUETOOTH;
            w6 w6Var9 = DUMMY;
            w6 w6Var10 = ETHERNET;
            w6 w6Var11 = MOBILE_FOTA;
            w6 w6Var12 = MOBILE_IMS;
            w6 w6Var13 = MOBILE_CBS;
            w6 w6Var14 = WIFI_P2P;
            w6 w6Var15 = MOBILE_IA;
            w6 w6Var16 = MOBILE_EMERGENCY;
            w6 w6Var17 = PROXY;
            w6 w6Var18 = VPN;
            w6 w6Var19 = NONE;
            SparseArray sparseArray = new SparseArray();
            p5 = sparseArray;
            sparseArray.put(0, w6Var);
            sparseArray.put(1, w6Var2);
            sparseArray.put(2, w6Var3);
            sparseArray.put(3, w6Var4);
            sparseArray.put(4, w6Var5);
            sparseArray.put(5, w6Var6);
            sparseArray.put(6, w6Var7);
            sparseArray.put(7, w6Var8);
            sparseArray.put(8, w6Var9);
            sparseArray.put(9, w6Var10);
            sparseArray.put(10, w6Var11);
            sparseArray.put(11, w6Var12);
            sparseArray.put(12, w6Var13);
            sparseArray.put(13, w6Var14);
            sparseArray.put(14, w6Var15);
            sparseArray.put(15, w6Var16);
            sparseArray.put(16, w6Var17);
            sparseArray.put(17, w6Var18);
            sparseArray.put(-1, w6Var19);
        }

        public static w6 n(int i2) {
            return (w6) p5.get(i2);
        }

        public int rl() {
            return this.f12329n;
        }

        w6(int i2) {
            this.f12329n = i2;
        }
    }

    public abstract n rl();

    public abstract w6 t();

    public static j n() {
        return new qz.n();
    }
}
