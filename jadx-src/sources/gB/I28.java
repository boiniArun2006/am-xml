package gB;

import MoG.Xo;
import MoG.qz;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface I28 {

    public static final class j implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MoG.j f67168n;
        private final String rl;

        public /* synthetic */ j(MoG.j jVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(jVar, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f67168n, jVar.f67168n) && Xo.j.nr(this.rl, jVar.rl);
        }

        private j(MoG.j jVar, String str) {
            this.f67168n = jVar;
            this.rl = str;
        }

        public int hashCode() {
            return (this.f67168n.hashCode() * 31) + Xo.j.O(this.rl);
        }

        public final MoG.j n() {
            return this.f67168n;
        }

        public String toString() {
            return "Animated(asset=" + this.f67168n + ", id=" + ((Object) Xo.j.J2(this.rl)) + ')';
        }
    }

    public static final class n implements I28 {
        public abstract qz n();
    }
}
