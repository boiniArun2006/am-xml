package ddf;

import com.facebook.soloader.ci;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class w6 implements Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre[] f63535n;
    private int rl = 0;

    @Override // ddf.Wre
    public boolean n(UnsatisfiedLinkError unsatisfiedLinkError, ci[] ciVarArr) {
        int i2;
        Wre[] wreArr;
        do {
            i2 = this.rl;
            wreArr = this.f63535n;
            if (i2 >= wreArr.length) {
                return false;
            }
            this.rl = i2 + 1;
        } while (!wreArr[i2].n(unsatisfiedLinkError, ciVarArr));
        return true;
    }

    public w6(Wre... wreArr) {
        this.f63535n = wreArr;
    }
}
