package B;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class I28 extends CN3 {
    private final QJ.Ml xMQ;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // B.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public QJ.Ml xMQ(Ect.j jVar, float f3) {
        this.xMQ.Uo((QJ.Ml) jVar.rl, (QJ.Ml) jVar.f2329t, f3);
        return this.xMQ;
    }

    public I28(List list) {
        super(list);
        int iMax = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            QJ.Ml ml = (QJ.Ml) ((Ect.j) list.get(i2)).rl;
            if (ml != null) {
                iMax = Math.max(iMax, ml.J2());
            }
        }
        this.xMQ = new QJ.Ml(new float[iMax], new int[iMax]);
    }
}
