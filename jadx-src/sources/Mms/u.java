package Mms;

import EJn.Xo;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class u {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object[] f6736n = new Object[8];
    private int[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f6737t;

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f6738n = new j();

        private j() {
        }
    }

    private final void O() {
        int i2 = this.f6737t * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f6736n, i2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.f6736n = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.rl, i2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.rl = iArrCopyOf;
    }

    public final void J2(Object obj) {
        int[] iArr = this.rl;
        int i2 = this.f6737t;
        if (iArr[i2] != -2) {
            int i3 = i2 + 1;
            this.f6737t = i3;
            if (i3 == this.f6736n.length) {
                O();
            }
        }
        Object[] objArr = this.f6736n;
        int i5 = this.f6737t;
        objArr[i5] = obj;
        this.rl[i5] = -2;
    }

    public final void Uo(int i2) {
        this.rl[this.f6737t] = i2;
    }

    public final String n() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i2 = this.f6737t + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = this.f6736n[i3];
            if (obj instanceof EJn.Wre) {
                EJn.Wre wre = (EJn.Wre) obj;
                if (!Intrinsics.areEqual(wre.getKind(), Xo.n.f2284n)) {
                    int i5 = this.rl[i3];
                    if (i5 >= 0) {
                        sb.append(".");
                        sb.append(wre.O(i5));
                    }
                } else if (this.rl[i3] != -1) {
                    sb.append("[");
                    sb.append(this.rl[i3]);
                    sb.append("]");
                }
            } else if (obj != j.f6738n) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        return sb.toString();
    }

    public final void nr() {
        int[] iArr = this.rl;
        int i2 = this.f6737t;
        if (iArr[i2] == -2) {
            this.f6736n[i2] = j.f6738n;
        }
    }

    public final void rl() {
        int i2 = this.f6737t;
        int[] iArr = this.rl;
        if (iArr[i2] == -2) {
            iArr[i2] = -1;
            this.f6737t = i2 - 1;
        }
        int i3 = this.f6737t;
        if (i3 != -1) {
            this.f6737t = i3 - 1;
        }
    }

    public final void t(EJn.Wre sd) {
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i2 = this.f6737t + 1;
        this.f6737t = i2;
        if (i2 == this.f6736n.length) {
            O();
        }
        this.f6736n[i2] = sd;
    }

    public u() {
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        this.rl = iArr;
        this.f6737t = -1;
    }

    public String toString() {
        return n();
    }
}
