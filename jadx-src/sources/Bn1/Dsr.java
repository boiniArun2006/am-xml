package Bn1;

import B7.Q;
import B7.qz;
import ILs.C;
import ILs.aC;
import android.view.Choreographer;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Dsr implements Q {
    private final ReentrantLock J2;
    private final TFv.Wre KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Choreographer.FrameCallback f591O;
    private boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qz f592n;
    private final ILs.CN3 nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function0 f593t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f594n = new j();

        j() {
            super(0);
        }

        public final long n() {
            return d2n.Ml.f63370t.t(System.nanoTime());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return d2n.Ml.rl(n());
        }
    }

    public Dsr(qz choreographer, boolean z2, Function0 systemTimeProvider) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        this.f592n = choreographer;
        this.rl = z2;
        this.f593t = systemTimeProvider;
        ILs.CN3 cn3Rl = aC.rl(-1, null, null, 6, null);
        this.nr = cn3Rl;
        this.f591O = new Choreographer.FrameCallback() { // from class: Bn1.fuX
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                Dsr.mUb(j2);
            }
        };
        this.J2 = new ReentrantLock();
        this.KN = TFv.fuX.ck(cn3Rl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(long j2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(Dsr this$0, long j2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ReentrantLock reentrantLock = this$0.J2;
        reentrantLock.lock();
        try {
            if (this$0.Uo) {
                this$0.gh(d2n.Ml.f63370t.t(j2), false);
                this$0.f592n.n(this$0.f591O);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void gh(long j2, boolean z2) {
        Q.j jVar = new Q.j(j2, z2, null);
        Object objNr = this.nr.nr(jVar);
        if (!this.rl || C.gh(objNr)) {
            return;
        }
        throw new IllegalStateException(("Did not succeed sending indication (" + jVar + ')').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(Dsr this$0, long j2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gh(d2n.Ml.f63370t.t(j2), true);
    }

    @Override // B7.Q
    public void n(boolean z2) {
        ReentrantLock reentrantLock = this.J2;
        reentrantLock.lock();
        try {
            if (this.Uo == z2) {
                reentrantLock.unlock();
                return;
            }
            this.Uo = z2;
            if (z2) {
                Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: Bn1.Wre
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j2) {
                        Dsr.KN(this.f614n, j2);
                    }
                };
                this.f591O = frameCallback;
                this.f592n.n(frameCallback);
            } else {
                this.f592n.rl(this.f591O);
                this.f592n.n(new Choreographer.FrameCallback() { // from class: Bn1.CN3
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j2) {
                        Dsr.xMQ(this.f590n, j2);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // B7.Q
    public TFv.Wre nr() {
        return this.KN;
    }

    @Override // B7.Q
    public boolean rl() {
        return this.Uo;
    }

    @Override // B7.Q
    public void t(boolean z2) {
        ReentrantLock reentrantLock = this.J2;
        reentrantLock.lock();
        try {
            if (rl()) {
                throw new IllegalStateException("Must not be called while currently emitting values");
            }
            gh(((d2n.Ml) this.f593t.invoke()).Ik(), z2);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ Dsr(qz qzVar, boolean z2, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new n(null, 1, null) : qzVar, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? j.f594n : function0);
    }
}
