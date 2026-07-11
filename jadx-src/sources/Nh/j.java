package Nh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j extends Nh.n {

    /* JADX INFO: renamed from: Nh.j$j, reason: collision with other inner class name */
    public static final class C0239j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f7094n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f7095t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0239j)) {
                return false;
            }
            C0239j c0239j = (C0239j) obj;
            return Intrinsics.areEqual(this.f7094n, c0239j.f7094n) && Intrinsics.areEqual(this.rl, c0239j.rl) && Intrinsics.areEqual(this.f7095t, c0239j.f7095t);
        }

        public C0239j(String id, String text, List subAnswers) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(subAnswers, "subAnswers");
            this.f7094n = id;
            this.rl = text;
            this.f7095t = subAnswers;
        }

        @Override // Nh.n
        public String getId() {
            return this.f7094n;
        }

        public int hashCode() {
            return (((this.f7094n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f7095t.hashCode();
        }

        @Override // Nh.n
        public String n() {
            return this.rl;
        }

        public final List rl() {
            return this.f7095t;
        }

        public String toString() {
            return "Group(id=" + this.f7094n + ", text=" + this.rl + ", subAnswers=" + this.f7095t + ")";
        }
    }

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f7096n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f7096n, nVar.f7096n) && Intrinsics.areEqual(this.rl, nVar.rl);
        }

        public n(String id, String text) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f7096n = id;
            this.rl = text;
        }

        @Override // Nh.n
        public String getId() {
            return this.f7096n;
        }

        public int hashCode() {
            return (this.f7096n.hashCode() * 31) + this.rl.hashCode();
        }

        @Override // Nh.n
        public String n() {
            return this.rl;
        }

        public String toString() {
            return "Open(id=" + this.f7096n + ", text=" + this.rl + ")";
        }
    }

    public static final class w6 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f7097n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f7097n, w6Var.f7097n) && Intrinsics.areEqual(this.rl, w6Var.rl);
        }

        public w6(String id, String text) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f7097n = id;
            this.rl = text;
        }

        @Override // Nh.n
        public String getId() {
            return this.f7097n;
        }

        public int hashCode() {
            return (this.f7097n.hashCode() * 31) + this.rl.hashCode();
        }

        @Override // Nh.n
        public String n() {
            return this.rl;
        }

        public String toString() {
            return "Simple(id=" + this.f7097n + ", text=" + this.rl + ")";
        }
    }
}
