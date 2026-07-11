package Nh;

import i.C2167j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface I28 {

    public static final class j implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f7089n;
        private final C2167j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f7090t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f7089n, jVar.f7089n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f7090t, jVar.f7090t);
        }

        public j(String id, C2167j text, List subAnswers) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(subAnswers, "subAnswers");
            this.f7089n = id;
            this.rl = text;
            this.f7090t = subAnswers;
        }

        public int hashCode() {
            return (((this.f7089n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f7090t.hashCode();
        }

        public String n() {
            return this.f7089n;
        }

        public final List rl() {
            return this.f7090t;
        }

        public C2167j t() {
            return this.rl;
        }

        public String toString() {
            return "Group(id=" + this.f7089n + ", text=" + this.rl + ", subAnswers=" + this.f7090t + ")";
        }
    }

    public static final class n implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f7091n;
        private final C2167j rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f7091n, nVar.f7091n) && Intrinsics.areEqual(this.rl, nVar.rl);
        }

        public n(String id, C2167j text) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f7091n = id;
            this.rl = text;
        }

        public int hashCode() {
            return (this.f7091n.hashCode() * 31) + this.rl.hashCode();
        }

        public String n() {
            return this.f7091n;
        }

        public C2167j rl() {
            return this.rl;
        }

        public String toString() {
            return "Open(id=" + this.f7091n + ", text=" + this.rl + ")";
        }
    }

    public static final class w6 implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f7092n;
        private final C2167j rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f7092n, w6Var.f7092n) && Intrinsics.areEqual(this.rl, w6Var.rl);
        }

        public w6(String id, C2167j text) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f7092n = id;
            this.rl = text;
        }

        public int hashCode() {
            return (this.f7092n.hashCode() * 31) + this.rl.hashCode();
        }

        public String n() {
            return this.f7092n;
        }

        public C2167j rl() {
            return this.rl;
        }

        public String toString() {
            return "Simple(id=" + this.f7092n + ", text=" + this.rl + ")";
        }
    }
}
