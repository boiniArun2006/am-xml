package com.google.firebase.firestore.remote;

import JP.AbstractC1377c;
import JP.I28;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import io.grpc.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class QJ {
    private static final QJ.CN3 KN;
    private static final QJ.CN3 Uo;
    private static volatile String mUb;
    private static final QJ.CN3 xMQ;
    private final Pe.C J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f60396O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wqP.I28 f60397n;
    private final l3D nr;
    private final VtZ.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final VtZ.j f60398t;

    class j extends I28.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC1911c f60399n;
        final /* synthetic */ JP.I28[] rl;

        @Override // JP.I28.j
        public void nr() {
        }

        j(InterfaceC1911c interfaceC1911c, JP.I28[] i28Arr) {
            this.f60399n = interfaceC1911c;
            this.rl = i28Arr;
        }

        @Override // JP.I28.j
        public void n(io.grpc.SPz sPz, io.grpc.QJ qj) {
            try {
                this.f60399n.n(sPz);
            } catch (Throwable th) {
                QJ.this.f60397n.qie(th);
            }
        }

        @Override // JP.I28.j
        public void rl(io.grpc.QJ qj) {
            try {
                this.f60399n.t(qj);
            } catch (Throwable th) {
                QJ.this.f60397n.qie(th);
            }
        }

        @Override // JP.I28.j
        public void t(Object obj) {
            try {
                this.f60399n.nr(obj);
                this.rl[0].t(1);
            } catch (Throwable th) {
                QJ.this.f60397n.qie(th);
            }
        }
    }

    class n extends AbstractC1377c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ JP.I28[] f60401n;
        final /* synthetic */ Task rl;

        n(JP.I28[] i28Arr, Task task) {
            this.f60401n = i28Arr;
            this.rl = task;
        }

        @Override // JP.AbstractC1377c, JP.u
        protected JP.I28 J2() {
            wqP.n.t(this.f60401n[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f60401n[0];
        }

        @Override // JP.AbstractC1377c, JP.u, JP.I28
        public void rl() {
            if (this.f60401n[0] == null) {
                this.rl.addOnSuccessListener(QJ.this.f60397n.mUb(), new OnSuccessListener() { // from class: Pe.w6
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        ((JP.I28) obj).rl();
                    }
                });
            } else {
                super.rl();
            }
        }
    }

    JP.I28 J2(JP.DAz dAz, final InterfaceC1911c interfaceC1911c) {
        final JP.I28[] i28Arr = {null};
        Task taskXMQ = this.nr.xMQ(dAz);
        taskXMQ.addOnCompleteListener(this.f60397n.mUb(), new OnCompleteListener() { // from class: com.google.firebase.firestore.remote.z
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                QJ.n(this.f60469n, i28Arr, interfaceC1911c, task);
            }
        });
        return new n(i28Arr, taskXMQ);
    }

    static {
        QJ.Ml ml = io.grpc.QJ.f68177O;
        Uo = QJ.CN3.O("x-goog-api-client", ml);
        KN = QJ.CN3.O("google-cloud-resource-prefix", ml);
        xMQ = QJ.CN3.O("x-goog-request-params", ml);
        mUb = "gl-java/";
    }

    private io.grpc.QJ O() {
        io.grpc.QJ qj = new io.grpc.QJ();
        qj.ck(Uo, t());
        qj.ck(KN, this.f60396O);
        qj.ck(xMQ, this.f60396O);
        Pe.C c2 = this.J2;
        if (c2 != null) {
            c2.n(qj);
        }
        return qj;
    }

    public static void Uo(String str) {
        mUb = str;
    }

    private String t() {
        return String.format("%s fire/%s grpc/", mUb, "25.1.4");
    }

    public void nr() {
        this.rl.rl();
        this.f60398t.rl();
    }

    QJ(wqP.I28 i28, VtZ.j jVar, VtZ.j jVar2, pUk.Wre wre, Pe.C c2, l3D l3d) {
        this.f60397n = i28;
        this.J2 = c2;
        this.rl = jVar;
        this.f60398t = jVar2;
        this.nr = l3d;
        this.f60396O = String.format("projects/%s/databases/%s", wre.J2(), wre.nr());
    }

    public static /* synthetic */ void n(QJ qj, JP.I28[] i28Arr, InterfaceC1911c interfaceC1911c, Task task) {
        qj.getClass();
        JP.I28 i28 = (JP.I28) task.getResult();
        i28Arr[0] = i28;
        i28.O(qj.new j(interfaceC1911c, i28Arr), qj.O());
        interfaceC1911c.rl();
        i28Arr[0].t(1);
    }
}
