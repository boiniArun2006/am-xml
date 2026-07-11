package oLx;

import cIr.Xo;
import cIr.eO;
import com.google.android.exoplayer2.C;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Dsr implements Dh.j {
    private final eO J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Executor f71422O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71423n;
    private final Executor nr;
    private final IntegrityManager rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Xo f71424t;

    public Dsr(com.google.firebase.Wre wre, Executor executor, Executor executor2) {
        this(wre.ck().nr(), IntegrityManagerFactory.create(wre.qie()), new Xo(wre), executor, executor2, new eO());
    }

    private Task Uo() {
        final n nVar = new n();
        return Tasks.call(this.f71422O, new Callable() { // from class: oLx.CN3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Dsr dsr = this.f71421n;
                return w6.n(dsr.f71424t.t(nVar.n().getBytes(C.UTF8_NAME), dsr.J2));
            }
        }).onSuccessTask(this.nr, new SuccessContinuation() { // from class: oLx.fuX
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Dsr dsr = this.f71427n;
                return dsr.rl.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(dsr.f71423n)).setNonce(((w6) obj).rl()).build());
            }
        });
    }

    public static /* synthetic */ Task O(final Dsr dsr, IntegrityTokenResponse integrityTokenResponse) {
        dsr.getClass();
        final j jVar = new j(integrityTokenResponse.token());
        return Tasks.call(dsr.f71422O, new Callable() { // from class: oLx.Wre
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Dsr dsr2 = this.f71426n;
                return dsr2.f71424t.rl(jVar.n().getBytes(C.UTF8_NAME), 3, dsr2.J2);
            }
        });
    }

    @Override // Dh.j
    public Task n() {
        return Uo().onSuccessTask(this.nr, new SuccessContinuation() { // from class: oLx.Ml
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Dsr.O(this.f71425n, (IntegrityTokenResponse) obj);
            }
        }).onSuccessTask(this.nr, new SuccessContinuation() { // from class: oLx.I28
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(cIr.n.t((cIr.j) obj));
            }
        });
    }

    Dsr(String str, IntegrityManager integrityManager, Xo xo, Executor executor, Executor executor2, eO eOVar) {
        this.f71423n = str;
        this.rl = integrityManager;
        this.f71424t = xo;
        this.nr = executor;
        this.f71422O = executor2;
        this.J2 = eOVar;
    }
}
