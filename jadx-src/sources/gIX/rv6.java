package gIX;

import android.graphics.Rect;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class rv6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f67445n;
    private final float nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f67446t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f67444O = new j(null);
    public static final int J2 = 8;
    private static final Rect Uo = new Rect(100, 100, 412, 412);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n extends rv6 {
        public static final n KN = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "Link";
        }

        public int hashCode() {
            return 1308065221;
        }
    }

    public static abstract class w6 extends rv6 {

        public static final class I28 extends w6 {
            public static final I28 KN = new I28();

            private I28() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof I28);
            }

            public String toString() {
                return "ThumbLight";
            }

            public int hashCode() {
                return 1818576725;
            }
        }

        public static final class Ml extends w6 {
            public static final Ml KN = new Ml();

            private Ml() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Ml);
            }

            public String toString() {
                return "ThumbDark";
            }

            public int hashCode() {
                return 1582438743;
            }
        }

        public static final class j extends w6 {
            private final int HI;
            private final int KN;
            private final Rect az;
            private final float ck;
            private final int gh;
            private final int mUb;
            private final int qie;
            private final int ty;
            private final int xMQ;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.KN == jVar.KN && this.xMQ == jVar.xMQ && this.mUb == jVar.mUb && this.gh == jVar.gh && this.qie == jVar.qie && Intrinsics.areEqual(this.az, jVar.az);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(int i2, int i3, int i5, int i7, int i8, Rect bgRect) {
                super(null);
                Intrinsics.checkNotNullParameter(bgRect, "bgRect");
                this.KN = i2;
                this.xMQ = i3;
                this.mUb = i5;
                this.gh = i7;
                this.qie = i8;
                this.az = bgRect;
                this.ty = i2;
                this.HI = i3;
            }

            @Override // gIX.rv6
            public Rect J2() {
                return this.az;
            }

            public final int KN() {
                return this.xMQ;
            }

            @Override // gIX.rv6
            public Rect O() {
                int i2 = this.KN;
                int i3 = this.mUb;
                int i5 = this.gh;
                return new Rect((i2 - i3) / 2, i5, (i2 + i3) / 2, i3 + i5);
            }

            public final int Uo() {
                return this.qie;
            }

            public int hashCode() {
                return (((((((((Integer.hashCode(this.KN) * 31) + Integer.hashCode(this.xMQ)) * 31) + Integer.hashCode(this.mUb)) * 31) + Integer.hashCode(this.gh)) * 31) + Integer.hashCode(this.qie)) * 31) + this.az.hashCode();
            }

            @Override // gIX.rv6
            public int n() {
                return this.HI;
            }

            @Override // gIX.rv6
            public float nr() {
                return this.ck;
            }

            @Override // gIX.rv6
            public int t() {
                return this.ty;
            }

            public String toString() {
                return "Custom(width=" + this.KN + ", height=" + this.xMQ + ", qrSize=" + this.mUb + ", qrTop=" + this.gh + ", bgDrawable=" + this.qie + ", bgRect=" + this.az + ")";
            }

            public final int xMQ() {
                return this.KN;
            }
        }

        public static final class n extends w6 {
            public static final n KN = new n();

            private n() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public String toString() {
                return "QrCodeDark";
            }

            public int hashCode() {
                return 2126516921;
            }
        }

        /* JADX INFO: renamed from: gIX.rv6$w6$w6, reason: collision with other inner class name */
        public static final class C0944w6 extends w6 {
            public static final C0944w6 KN = new C0944w6();

            private C0944w6() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0944w6);
            }

            public String toString() {
                return "QrCodeLight";
            }

            public int hashCode() {
                return 1505131059;
            }
        }

        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private w6() {
            super(null);
        }
    }

    public /* synthetic */ rv6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private rv6() {
        this.f67445n = 512;
        this.rl = 512;
        this.f67446t = Uo;
        this.nr = 10.5f;
    }

    public Rect J2() {
        Rect rect = new Rect();
        int iHeight = O().top + O().height();
        rect.top = iHeight;
        rect.bottom = iHeight + 70;
        rect.left = (t() / 2) - 122;
        rect.right = (t() / 2) + Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE;
        return rect;
    }

    public Rect O() {
        return this.f67446t;
    }

    public int n() {
        return this.rl;
    }

    public float nr() {
        return this.nr;
    }

    public final Rect rl() {
        return new Rect(0, 0, t(), n());
    }

    public int t() {
        return this.f67445n;
    }
}
