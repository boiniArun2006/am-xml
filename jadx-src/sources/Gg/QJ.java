package Gg;

import Do.j;
import Dy.w6;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import hay.CN3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class QJ {
    private final Do.j J2;
    private final MR.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Executor f3705O;
    private final MR.j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f3706n;
    private final r nr;
    private final hay.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ePt.Ml f3707t;
    private final ePt.w6 xMQ;

    public static /* synthetic */ Object J2(QJ qj, veW.eO eOVar, int i2) {
        qj.nr.n(eOVar, i2 + 1);
        return null;
    }

    public static /* synthetic */ Object O(QJ qj, Iterable iterable) {
        qj.f3707t.ty(iterable);
        return null;
    }

    public static /* synthetic */ Object Uo(QJ qj, veW.eO eOVar, long j2) {
        qj.f3707t.Ik(eOVar, qj.Uo.getTime() + j2);
        return null;
    }

    public static /* synthetic */ Object rl(QJ qj, Iterable iterable, veW.eO eOVar, long j2) {
        qj.f3707t.D(iterable);
        qj.f3707t.Ik(eOVar, qj.Uo.getTime() + j2);
        return null;
    }

    public static /* synthetic */ Object t(QJ qj) {
        qj.xMQ.n();
        return null;
    }

    public void az(final veW.eO eOVar, final int i2, final Runnable runnable) {
        this.f3705O.execute(new Runnable() { // from class: Gg.CN3
            @Override // java.lang.Runnable
            public final void run() {
                QJ.xMQ(this.f3695n, eOVar, i2, runnable);
            }
        });
    }

    boolean gh() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f3706n.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public veW.Dsr mUb(hay.qz qzVar) {
        Do.j jVar = this.J2;
        final ePt.w6 w6Var = this.xMQ;
        Objects.requireNonNull(w6Var);
        return qzVar.rl(veW.Dsr.n().xMQ(this.Uo.getTime()).HI(this.KN.getTime()).ty("GDT_CLIENT_METRICS").KN(new veW.fuX(bF.n.rl("proto"), ((Dy.j) jVar.rl(new j.InterfaceC0070j() { // from class: Gg.fuX
            @Override // Do.j.InterfaceC0070j
            public final Object execute() {
                return w6Var.Z();
            }
        })).J2())).nr());
    }

    public hay.CN3 qie(final veW.eO eOVar, int i2) {
        hay.CN3 cn3N;
        hay.qz qzVar = this.rl.get(eOVar.rl());
        hay.CN3 cn3O = hay.CN3.O(0L);
        final long j2 = 0;
        while (((Boolean) this.J2.rl(new j.InterfaceC0070j() { // from class: Gg.C
            @Override // Do.j.InterfaceC0070j
            public final Object execute() {
                return Boolean.valueOf(this.f3693n.f3707t.tUK(eOVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.J2.rl(new j.InterfaceC0070j() { // from class: Gg.o
                @Override // Do.j.InterfaceC0070j
                public final Object execute() {
                    return this.f3724n.f3707t.a63(eOVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return cn3O;
            }
            if (qzVar == null) {
                l0.j.rl("Uploader", "Unknown backend for %s, deleting event batch for it...", eOVar);
                cn3N = hay.CN3.n();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ePt.C) it.next()).rl());
                }
                if (eOVar.O()) {
                    arrayList.add(mUb(qzVar));
                }
                cn3N = qzVar.n(hay.Wre.n().rl(arrayList).t(eOVar.t()).n());
            }
            cn3O = cn3N;
            if (cn3O.t() == CN3.j.TRANSIENT_ERROR) {
                final veW.eO eOVar2 = eOVar;
                this.J2.rl(new j.InterfaceC0070j() { // from class: Gg.qz
                    @Override // Do.j.InterfaceC0070j
                    public final Object execute() {
                        return QJ.rl(this.f3725n, iterable, eOVar2, j2);
                    }
                });
                this.nr.rl(eOVar2, i2 + 1, true);
                return cn3O;
            }
            veW.eO eOVar3 = eOVar;
            this.J2.rl(new j.InterfaceC0070j() { // from class: Gg.Pl
                @Override // Do.j.InterfaceC0070j
                public final Object execute() {
                    return QJ.O(this.f3702n, iterable);
                }
            });
            if (cn3O.t() == CN3.j.OK) {
                long jMax = Math.max(j2, cn3O.rl());
                if (eOVar3.O()) {
                    this.J2.rl(new j.InterfaceC0070j() { // from class: Gg.Xo
                        @Override // Do.j.InterfaceC0070j
                        public final Object execute() {
                            return QJ.t(this.f3714n);
                        }
                    });
                }
                j2 = jMax;
            } else if (cn3O.t() == CN3.j.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strTy = ((ePt.C) it2.next()).rl().ty();
                    if (map.containsKey(strTy)) {
                        map.put(strTy, Integer.valueOf(((Integer) map.get(strTy)).intValue() + 1));
                    } else {
                        map.put(strTy, 1);
                    }
                }
                this.J2.rl(new j.InterfaceC0070j() { // from class: Gg.eO
                    @Override // Do.j.InterfaceC0070j
                    public final Object execute() {
                        return QJ.KN(this.f3718n, map);
                    }
                });
            }
            eOVar = eOVar3;
        }
        final veW.eO eOVar4 = eOVar;
        this.J2.rl(new j.InterfaceC0070j() { // from class: Gg.z
            @Override // Do.j.InterfaceC0070j
            public final Object execute() {
                return QJ.Uo(this.f3732n, eOVar4, j2);
            }
        });
        return cn3O;
    }

    public QJ(Context context, hay.I28 i28, ePt.Ml ml, r rVar, Executor executor, Do.j jVar, MR.j jVar2, MR.j jVar3, ePt.w6 w6Var) {
        this.f3706n = context;
        this.rl = i28;
        this.f3707t = ml;
        this.nr = rVar;
        this.f3705O = executor;
        this.J2 = jVar;
        this.Uo = jVar2;
        this.KN = jVar3;
        this.xMQ = w6Var;
    }

    public static /* synthetic */ Object KN(QJ qj, Map map) {
        qj.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            qj.xMQ.Uo(((Integer) r0.getValue()).intValue(), w6.n.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void xMQ(final QJ qj, final veW.eO eOVar, final int i2, Runnable runnable) {
        qj.getClass();
        try {
            try {
                Do.j jVar = qj.J2;
                final ePt.Ml ml = qj.f3707t;
                Objects.requireNonNull(ml);
                jVar.rl(new j.InterfaceC0070j() { // from class: Gg.Dsr
                    @Override // Do.j.InterfaceC0070j
                    public final Object execute() {
                        return Integer.valueOf(ml.t());
                    }
                });
                if (!qj.gh()) {
                    qj.J2.rl(new j.InterfaceC0070j() { // from class: Gg.aC
                        @Override // Do.j.InterfaceC0070j
                        public final Object execute() {
                            return QJ.J2(this.f3715n, eOVar, i2);
                        }
                    });
                } else {
                    qj.qie(eOVar, i2);
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                qj.nr.n(eOVar, i2 + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
