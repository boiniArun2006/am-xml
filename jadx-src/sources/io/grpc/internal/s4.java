package io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface s4 extends Closeable {

    public static final class j {
        private JP.UGc nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f68725t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f68724n = "unknown-authority";
        private io.grpc.j rl = io.grpc.j.f68849t;

        public j J2(io.grpc.j jVar) {
            t1.Xo.ck(jVar, "eagAttributes");
            this.rl = jVar;
            return this;
        }

        public j KN(String str) {
            this.f68725t = str;
            return this;
        }

        public j O(String str) {
            this.f68724n = (String) t1.Xo.ck(str, "authority");
            return this;
        }

        public j Uo(JP.UGc uGc) {
            this.nr = uGc;
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f68724n.equals(jVar.f68724n) && this.rl.equals(jVar.rl) && t1.C.n(this.f68725t, jVar.f68725t) && t1.C.n(this.nr, jVar.nr);
        }

        public int hashCode() {
            return t1.C.rl(this.f68724n, this.rl, this.f68725t, this.nr);
        }

        public String n() {
            return this.f68724n;
        }

        public String nr() {
            return this.f68725t;
        }

        public io.grpc.j rl() {
            return this.rl;
        }

        public JP.UGc t() {
            return this.nr;
        }
    }

    ScheduledExecutorService J();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    Q s7N(SocketAddress socketAddress, j jVar, JP.Ml ml);

    Collection tFV();
}
