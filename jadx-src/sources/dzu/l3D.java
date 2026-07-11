package dzu;

import GJW.DC;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l3D f63570n;
    public static final DC rl;

    static {
        l3D l3d = new l3D();
        f63570n = l3d;
        DAz.J2("kotlinx.coroutines.fast.service.loader", true);
        rl = l3d.n();
    }

    private final DC n() {
        Object next;
        DC dcO;
        try {
            List list = SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(QJ.class, QJ.class.getClassLoader()).iterator()));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iT = ((QJ) next).t();
                    do {
                        Object next2 = it.next();
                        int iT2 = ((QJ) next2).t();
                        if (iT < iT2) {
                            next = next2;
                            iT = iT2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            QJ qj = (QJ) next;
            if (qj != null && (dcO = AbstractC1958c.O(qj, list)) != null) {
                return dcO;
            }
            return AbstractC1958c.rl(null, null, 3, null);
        } catch (Throwable th) {
            return AbstractC1958c.rl(th, null, 2, null);
        }
    }

    private l3D() {
    }
}
