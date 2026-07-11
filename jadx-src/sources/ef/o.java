package ef;

import QJ.aC;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class o implements qz, aC {
    private final QJ.aC J2;
    private final String nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f63832n = new Path();
    private final Path rl = new Path();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Path f63833t = new Path();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f63831O = new ArrayList();

    private void n() {
        for (int i2 = 0; i2 < this.f63831O.size(); i2++) {
            this.f63833t.addPath(((qz) this.f63831O.get(i2)).getPath());
        }
    }

    @Override // ef.w6
    public void rl(List list, List list2) {
        for (int i2 = 0; i2 < this.f63831O.size(); i2++) {
            ((qz) this.f63831O.get(i2)).rl(list, list2);
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f63834n;

        static {
            int[] iArr = new int[aC.j.values().length];
            f63834n = iArr;
            try {
                iArr[aC.j.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63834n[aC.j.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63834n[aC.j.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63834n[aC.j.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63834n[aC.j.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void O(Path.Op op) {
        this.rl.reset();
        this.f63832n.reset();
        for (int size = this.f63831O.size() - 1; size >= 1; size--) {
            qz qzVar = (qz) this.f63831O.get(size);
            if (qzVar instanceof Ml) {
                Ml ml = (Ml) qzVar;
                List listQie = ml.qie();
                for (int size2 = listQie.size() - 1; size2 >= 0; size2--) {
                    Path path = ((qz) listQie.get(size2)).getPath();
                    path.transform(ml.az());
                    this.rl.addPath(path);
                }
            } else {
                this.rl.addPath(qzVar.getPath());
            }
        }
        qz qzVar2 = (qz) this.f63831O.get(0);
        if (qzVar2 instanceof Ml) {
            Ml ml2 = (Ml) qzVar2;
            List listQie2 = ml2.qie();
            for (int i2 = 0; i2 < listQie2.size(); i2++) {
                Path path2 = ((qz) listQie2.get(i2)).getPath();
                path2.transform(ml2.az());
                this.f63832n.addPath(path2);
            }
        } else {
            this.f63832n.set(qzVar2.getPath());
        }
        this.f63833t.op(this.f63832n, this.rl, op);
    }

    @Override // ef.qz
    public Path getPath() {
        this.f63833t.reset();
        if (this.J2.nr()) {
            return this.f63833t;
        }
        int i2 = j.f63834n[this.J2.rl().ordinal()];
        if (i2 == 1) {
            n();
        } else if (i2 == 2) {
            O(Path.Op.UNION);
        } else if (i2 == 3) {
            O(Path.Op.REVERSE_DIFFERENCE);
        } else if (i2 == 4) {
            O(Path.Op.INTERSECT);
        } else if (i2 == 5) {
            O(Path.Op.XOR);
        }
        return this.f63833t;
    }

    public o(QJ.aC aCVar) {
        this.nr = aCVar.t();
        this.J2 = aCVar;
    }

    @Override // ef.aC
    public void xMQ(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            w6 w6Var = (w6) listIterator.previous();
            if (w6Var instanceof qz) {
                this.f63831O.add((qz) w6Var);
                listIterator.remove();
            }
        }
    }
}
