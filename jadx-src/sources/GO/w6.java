package GO;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w6 extends eO {
    static float[] nr(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f3 = Float.NaN;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            float f4 = fArr3[i3];
            if (f4 != f3) {
                fArr3[i2] = f4;
                i2++;
                f3 = fArr3[i3];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i2);
    }

    private static List t(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, rl((Ect.j) list.get(i2)));
        }
        return list;
    }

    private static Ect.j rl(Ect.j jVar) {
        QJ.Ml ml = (QJ.Ml) jVar.rl;
        QJ.Ml ml2 = (QJ.Ml) jVar.f2329t;
        if (ml == null || ml2 == null || ml.O().length == ml2.O().length) {
            return jVar;
        }
        float[] fArrNr = nr(ml.O(), ml2.O());
        return jVar.rl(ml.rl(fArrNr), ml2.rl(fArrNr));
    }

    @Override // GO.Xo
    public B.j n() {
        return new B.I28(this.f3528n);
    }

    public w6(List list) {
        super(t(list));
    }

    @Override // GO.eO, GO.Xo
    public /* bridge */ /* synthetic */ List getKeyframes() {
        return super.getKeyframes();
    }

    @Override // GO.eO, GO.Xo
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // GO.eO
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
