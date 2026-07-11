package Q6;

import MoG.Xo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Ml {

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Set f7945n;
        private final n rl;

        /* JADX INFO: renamed from: Q6.Ml$j$j, reason: collision with other inner class name */
        static final class C0281j extends Lambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0281j f7946n = new C0281j();

            C0281j() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Xo.j.n(n((w6) obj));
            }

            public final String n(w6 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.n().n();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f7945n, jVar.f7945n) && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public j(Set requests, n hint) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.f7945n = requests;
            this.rl = hint;
            if (!v9.Wre.rl(requests, C0281j.f7946n)) {
                throw new IllegalArgumentException(("All audible items in the given requests " + requests + " must have distinct IDs.").toString());
            }
            Set set = requests;
            boolean z2 = false;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (this.rl.rl().contains(Xo.j.n(((w6) it.next()).n().n()))) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (z2) {
                Set set2 = this.f7945n;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(Xo.j.n(((w6) it2.next()).n().n()));
                }
                throw new IllegalArgumentException(("The audible items in the request must not contain elements in the unessential set\nIds in the request: " + linkedHashSet + "\nUnessential ids: " + this.rl.rl() + "\nOverlapping ids: " + CollectionsKt.intersect(linkedHashSet, this.rl.rl())).toString());
            }
        }

        public int hashCode() {
            return (this.f7945n.hashCode() * 31) + this.rl.hashCode();
        }

        public final n n() {
            return this.rl;
        }

        public final Set rl() {
            return this.f7945n;
        }

        public String toString() {
            return "Request(requests=" + this.f7945n + ", hint=" + this.rl + ')';
        }
    }

    Object n(Continuation continuation);

    Object rl(j jVar, Continuation continuation);
}
