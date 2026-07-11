package FQq;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Dsr {
    private boolean HI;
    private int Ik;
    private Map J2;
    private SparseArrayCompat KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f2526O;
    private List Uo;
    private float az;
    private Rect gh;
    private List mUb;
    private Map nr;
    private float qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2528r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map f2529t;
    private float ty;
    private LongSparseArray xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final afx f2527n = new afx();
    private final HashSet rl = new HashSet();
    private int ck = 0;

    public List HI(String str) {
        return (List) this.f2529t.get(str);
    }

    public boolean Ik() {
        return this.HI;
    }

    public float J2() {
        return this.az;
    }

    public float KN(float f3) {
        return x0.o.xMQ(this.qie, this.az, f3);
    }

    public float O() {
        return this.az - this.qie;
    }

    public void S(boolean z2) {
        this.HI = z2;
    }

    public Map Uo() {
        return this.J2;
    }

    public void WPU(boolean z2) {
        this.f2527n.rl(z2);
    }

    public gL.I28 XQ(long j2) {
        return (gL.I28) this.xMQ.O(j2);
    }

    public void Z(Rect rect, float f3, float f4, float f5, List list, LongSparseArray longSparseArray, Map map, Map map2, float f6, SparseArrayCompat sparseArrayCompat, Map map3, List list2, int i2, int i3) {
        this.gh = rect;
        this.qie = f3;
        this.az = f4;
        this.ty = f5;
        this.mUb = list;
        this.xMQ = longSparseArray;
        this.f2529t = map;
        this.nr = map2;
        this.f2526O = f6;
        this.KN = sparseArrayCompat;
        this.J2 = map3;
        this.Uo = list2;
        this.Ik = i2;
        this.f2528r = i3;
    }

    public int az() {
        return this.ck;
    }

    public float ck() {
        return this.qie;
    }

    public List gh() {
        return this.mUb;
    }

    public void o(int i2) {
        this.ck += i2;
    }

    public ES.fuX qie(String str) {
        int size = this.Uo.size();
        for (int i2 = 0; i2 < size; i2++) {
            ES.fuX fux = (ES.fuX) this.Uo.get(i2);
            if (fux.n(str)) {
                return fux;
            }
        }
        return null;
    }

    public boolean r() {
        return !this.nr.isEmpty();
    }

    public Rect rl() {
        return this.gh;
    }

    public SparseArrayCompat t() {
        return this.KN;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.mUb.iterator();
        while (it.hasNext()) {
            sb.append(((gL.I28) it.next()).nY("\t"));
        }
        return sb.toString();
    }

    public afx ty() {
        return this.f2527n;
    }

    public float xMQ() {
        return this.ty;
    }

    public Map mUb() {
        float fO = x0.eO.O();
        if (fO != this.f2526O) {
            for (Map.Entry entry : this.nr.entrySet()) {
                this.nr.put((String) entry.getKey(), ((UGc) entry.getValue()).n(this.f2526O / fO));
            }
        }
        this.f2526O = fO;
        return this.nr;
    }

    public void n(String str) {
        x0.CN3.t(str);
        this.rl.add(str);
    }

    public float nr() {
        return (long) ((O() / this.ty) * 1000.0f);
    }
}
