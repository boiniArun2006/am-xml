package io.grpc;

import io.grpc.Pl;
import io.grpc.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j.w6 f68153n = j.w6.n("internal:io.grpc.config-selector");

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SPz f68154n;
        private final Object rl;

        public static final class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private Object f68155n;

            private j() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public n n() {
                t1.Xo.S(this.f68155n != null, "config is not set");
                return new n(SPz.f68184O, this.f68155n, null);
            }

            public j rl(Object obj) {
                this.f68155n = t1.Xo.ck(obj, "config");
                return this;
            }
        }

        public JP.Wre rl() {
            return null;
        }

        private n(SPz sPz, Object obj, JP.Wre wre) {
            this.f68154n = (SPz) t1.Xo.ck(sPz, "status");
            this.rl = obj;
        }

        public static j nr() {
            return new j();
        }

        public Object n() {
            return this.rl;
        }

        public SPz t() {
            return this.f68154n;
        }
    }

    public abstract n n(Pl.CN3 cn3);
}
