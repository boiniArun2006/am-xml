package UM;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f10644n;
    private final List rl;

    private n n(int i2) {
        if (i2 >= this.rl.size()) {
            List list = this.rl;
            n nVarUo = (n) list.get(list.size() - 1);
            for (int size = this.rl.size(); size <= i2; size++) {
                j jVar = this.f10644n;
                nVarUo = nVarUo.Uo(new n(jVar, new int[]{1, jVar.t((size - 1) + jVar.nr())}));
                this.rl.add(nVarUo);
            }
        }
        return (n) this.rl.get(i2);
    }

    public void rl(int[] iArr, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i2;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        n nVarN = n(i2);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrNr = new n(this.f10644n, iArr2).KN(i2, 1).rl(nVarN)[1].nr();
        int length2 = i2 - iArrNr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            iArr[length + i3] = 0;
        }
        System.arraycopy(iArrNr, 0, iArr, length + length2, iArrNr.length);
    }

    public w6(j jVar) {
        this.f10644n = jVar;
        ArrayList arrayList = new ArrayList();
        this.rl = arrayList;
        arrayList.add(new n(jVar, new int[]{1}));
    }
}
