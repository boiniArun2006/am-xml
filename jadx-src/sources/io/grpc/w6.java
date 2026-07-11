package io.grpc;

import JP.iwV;
import io.grpc.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 extends iwV {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n.w6 f68862n = n.w6.rl("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    public static abstract class j {
        public abstract w6 n(n nVar, QJ qj);
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final io.grpc.n f68863n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f68864t;

        public static final class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private io.grpc.n f68865n = io.grpc.n.gh;
            private int rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private boolean f68866t;

            public n n() {
                return new n(this.f68865n, this.rl, this.f68866t);
            }

            public j nr(int i2) {
                this.rl = i2;
                return this;
            }

            public j rl(io.grpc.n nVar) {
                this.f68865n = (io.grpc.n) t1.Xo.ck(nVar, "callOptions cannot be null");
                return this;
            }

            public j t(boolean z2) {
                this.f68866t = z2;
                return this;
            }

            j() {
            }
        }

        public static j n() {
            return new j();
        }

        n(io.grpc.n nVar, int i2, boolean z2) {
            this.f68863n = (io.grpc.n) t1.Xo.ck(nVar, "callOptions");
            this.rl = i2;
            this.f68864t = z2;
        }

        public String toString() {
            return t1.Dsr.t(this).nr("callOptions", this.f68863n).rl("previousAttempts", this.rl).O("isTransparentRetry", this.f68864t).toString();
        }
    }

    public void az() {
    }

    public void gh() {
    }

    public void mUb() {
    }

    public void qie(QJ qj) {
    }

    public void ty(io.grpc.j jVar, QJ qj) {
    }
}
