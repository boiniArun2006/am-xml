package pL6;

import JP.qz;
import io.grpc.Pl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import pL6.CN3;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class aC extends CN3 {
    private final AtomicInteger az;
    protected Pl.aC ty;

    static final class j extends Pl.aC {
        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        public int hashCode() {
            return j.class.hashCode();
        }

        j() {
        }

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            return Pl.Wre.Uo();
        }
    }

    static class n extends Pl.aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f71851n;
        private final AtomicInteger rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f71852t;

        private int t() {
            return (this.rl.getAndIncrement() & Integer.MAX_VALUE) % this.f71851n.size();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (nVar == this) {
                return true;
            }
            return this.f71852t == nVar.f71852t && this.rl == nVar.rl && this.f71851n.size() == nVar.f71851n.size() && new HashSet(this.f71851n).containsAll(nVar.f71851n);
        }

        public int hashCode() {
            return this.f71852t;
        }

        @Override // io.grpc.Pl.aC
        public Pl.Wre n(Pl.CN3 cn3) {
            return ((Pl.aC) this.f71851n.get(t())).n(cn3);
        }

        public String toString() {
            return t1.Dsr.rl(n.class).nr("subchannelPickers", this.f71851n).toString();
        }

        public n(List list, AtomicInteger atomicInteger) {
            Xo.O(!list.isEmpty(), "empty list");
            this.f71851n = list;
            this.rl = (AtomicInteger) Xo.ck(atomicInteger, "index");
            Iterator it = list.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += ((Pl.aC) it.next()).hashCode();
            }
            this.f71852t = iHashCode;
        }
    }

    private void aYN(qz qzVar, Pl.aC aCVar) {
        if (qzVar == this.gh && aCVar.equals(this.ty)) {
            return;
        }
        ck().J2(qzVar, aCVar);
        this.gh = qzVar;
        this.ty = aCVar;
    }

    protected Pl.aC WPU(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((CN3.w6) it.next()).KN());
        }
        return new n(arrayList, this.az);
    }

    public aC(Pl.I28 i28) {
        super(i28);
        this.az = new AtomicInteger(new Random().nextInt());
        this.ty = new j();
    }

    @Override // pL6.CN3
    protected void S() {
        List listR = r();
        if (listR.isEmpty()) {
            Iterator it = ty().iterator();
            while (it.hasNext()) {
                qz qzVarXMQ = ((CN3.w6) it.next()).xMQ();
                qz qzVar = qz.CONNECTING;
                if (qzVarXMQ == qzVar || qzVarXMQ == qz.IDLE) {
                    aYN(qzVar, new j());
                    return;
                }
            }
            aYN(qz.TRANSIENT_FAILURE, WPU(ty()));
            return;
        }
        aYN(qz.READY, WPU(listR));
    }
}
