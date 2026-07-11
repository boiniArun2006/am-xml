package com.google.firebase.firestore.remote;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Z {

    public enum I28 {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    public static final class Ml extends Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final I28 f60416n;
        private final io.grpc.SPz nr;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final com.google.protobuf.C f60417t;

        public Ml(I28 i28, List list, com.google.protobuf.C c2, io.grpc.SPz sPz) {
            super();
            wqP.n.t(sPz == null || i28 == I28.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.f60416n = i28;
            this.rl = list;
            this.f60417t = c2;
            if (sPz == null || sPz.HI()) {
                this.nr = null;
            } else {
                this.nr = sPz;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Ml.class == obj.getClass()) {
                Ml ml = (Ml) obj;
                if (this.f60416n != ml.f60416n || !this.rl.equals(ml.rl) || !this.f60417t.equals(ml.f60417t)) {
                    return false;
                }
                io.grpc.SPz sPz = this.nr;
                if (sPz != null) {
                    return ml.nr != null && sPz.az().equals(ml.nr.az());
                }
                if (ml.nr == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = ((((this.f60416n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f60417t.hashCode()) * 31;
            io.grpc.SPz sPz = this.nr;
            return iHashCode + (sPz != null ? sPz.az().hashCode() : 0);
        }

        public io.grpc.SPz n() {
            return this.nr;
        }

        public List nr() {
            return this.rl;
        }

        public I28 rl() {
            return this.f60416n;
        }

        public com.google.protobuf.C t() {
            return this.f60417t;
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.f60416n + ", targetIds=" + this.rl + '}';
        }
    }

    public static final class n extends Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f60418n;
        private final pUk.QJ nr;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final pUk.C f60419t;

        public n(List list, List list2, pUk.C c2, pUk.QJ qj) {
            super();
            this.f60418n = list;
            this.rl = list2;
            this.f60419t = c2;
            this.nr = qj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                if (!this.f60418n.equals(nVar.f60418n) || !this.rl.equals(nVar.rl) || !this.f60419t.equals(nVar.f60419t)) {
                    return false;
                }
                pUk.QJ qj = this.nr;
                pUk.QJ qj2 = nVar.nr;
                if (qj != null) {
                    return qj.equals(qj2);
                }
                if (qj2 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = ((((this.f60418n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f60419t.hashCode()) * 31;
            pUk.QJ qj = this.nr;
            return iHashCode + (qj != null ? qj.hashCode() : 0);
        }

        public pUk.C n() {
            return this.f60419t;
        }

        public List nr() {
            return this.f60418n;
        }

        public pUk.QJ rl() {
            return this.nr;
        }

        public List t() {
            return this.rl;
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f60418n + ", removedTargetIds=" + this.rl + ", key=" + this.f60419t + ", newDocument=" + this.nr + '}';
        }
    }

    public static final class w6 extends Z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f60420n;
        private final Pe.j rl;

        public w6(int i2, Pe.j jVar) {
            super();
            this.f60420n = i2;
            this.rl = jVar;
        }

        public Pe.j n() {
            return this.rl;
        }

        public int rl() {
            return this.f60420n;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f60420n + ", existenceFilter=" + this.rl + '}';
        }
    }

    private Z() {
    }
}
