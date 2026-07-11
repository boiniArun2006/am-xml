package OQ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f7443n;
    private final int[] rl;

    boolean J2() {
        return this.rl[0] == 0;
    }

    n KN(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.f7443n.O();
        }
        int length = this.rl.length;
        int[] iArr = new int[i2 + length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = this.f7443n.KN(this.rl[i5], i3);
        }
        return new n(this.f7443n, iArr);
    }

    int O() {
        return this.rl.length - 1;
    }

    n Uo(n nVar) {
        if (!this.f7443n.equals(nVar.f7443n)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (J2() || nVar.J2()) {
            return this.f7443n.O();
        }
        int[] iArr = this.rl;
        int length = iArr.length;
        int[] iArr2 = nVar.rl;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            for (int i5 = 0; i5 < length2; i5++) {
                int i7 = i2 + i5;
                iArr3[i7] = j.n(iArr3[i7], this.f7443n.KN(i3, iArr2[i5]));
            }
        }
        return new n(this.f7443n, iArr3);
    }

    n n(n nVar) {
        if (!this.f7443n.equals(nVar.f7443n)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (J2()) {
            return nVar;
        }
        if (nVar.J2()) {
            return this;
        }
        int[] iArr = this.rl;
        int[] iArr2 = nVar.rl;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i2 = length; i2 < iArr.length; i2++) {
            iArr3[i2] = j.n(iArr2[i2 - length], iArr[i2]);
        }
        return new n(this.f7443n, iArr3);
    }

    int[] nr() {
        return this.rl;
    }

    n[] rl(n nVar) {
        if (!this.f7443n.equals(nVar.f7443n)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (nVar.J2()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        n nVarO = this.f7443n.O();
        int iJ2 = this.f7443n.J2(nVar.t(nVar.O()));
        n nVarN = this;
        while (nVarN.O() >= nVar.O() && !nVarN.J2()) {
            int iO = nVarN.O() - nVar.O();
            int iKN = this.f7443n.KN(nVarN.t(nVarN.O()), iJ2);
            n nVarKN = nVar.KN(iO, iKN);
            nVarO = nVarO.n(this.f7443n.rl(iO, iKN));
            nVarN = nVarN.n(nVarKN);
        }
        return new n[]{nVarO, nVarN};
    }

    int t(int i2) {
        return this.rl[(r0.length - 1) - i2];
    }

    n(j jVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f7443n = jVar;
            int length = iArr.length;
            int i2 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i2 < length && iArr[i2] == 0) {
                    i2++;
                }
                if (i2 == length) {
                    this.rl = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i2];
                this.rl = iArr2;
                System.arraycopy(iArr, i2, iArr2, 0, iArr2.length);
                return;
            }
            this.rl = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        if (J2()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(O() * 8);
        for (int iO = O(); iO >= 0; iO--) {
            int iT = t(iO);
            if (iT != 0) {
                if (iT < 0) {
                    if (iO == O()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    iT = -iT;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iO == 0 || iT != 1) {
                    int iUo = this.f7443n.Uo(iT);
                    if (iUo == 0) {
                        sb.append('1');
                    } else if (iUo == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iUo);
                    }
                }
                if (iO != 0) {
                    if (iO == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iO);
                    }
                }
            }
        }
        return sb.toString();
    }
}
