package Q6;

import MoG.Xo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface j {

    /* JADX INFO: renamed from: Q6.j$j, reason: collision with other inner class name */
    public static final class C0282j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Dsr f7949n;
        private final Set rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Set f7950t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0282j)) {
                return false;
            }
            C0282j c0282j = (C0282j) obj;
            return Intrinsics.areEqual(this.f7949n, c0282j.f7949n) && Intrinsics.areEqual(this.rl, c0282j.rl) && Intrinsics.areEqual(this.f7950t, c0282j.f7950t);
        }

        public C0282j(Dsr command, Set idsOfAnticipatedAudioStreams, Set idsOfUnnecessaryAudioStreams) {
            boolean z2;
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(idsOfAnticipatedAudioStreams, "idsOfAnticipatedAudioStreams");
            Intrinsics.checkNotNullParameter(idsOfUnnecessaryAudioStreams, "idsOfUnnecessaryAudioStreams");
            this.f7949n = command;
            this.rl = idsOfAnticipatedAudioStreams;
            this.f7950t = idsOfUnnecessaryAudioStreams;
            List listN = command.n();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(Xo.j.n(((aC) it.next()).n()));
            }
            boolean z3 = true;
            if (linkedHashSet.isEmpty()) {
                z2 = false;
            } else {
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    if (this.f7950t.contains(Xo.j.n(((Xo.j) it2.next()).Uo()))) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            }
            if (z2) {
                throw new IllegalArgumentException(("The audible items in the request must not contain elements in the unessential set\nIds in the request: " + linkedHashSet + "\nUnessential ids: " + this.f7950t + "\nOverlapping ids: " + CollectionsKt.intersect(linkedHashSet, this.f7950t)).toString());
            }
            Set set = this.rl;
            if ((set instanceof Collection) && set.isEmpty()) {
                z3 = false;
            } else {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    if (this.f7950t.contains(Xo.j.n(((Xo.j) it3.next()).Uo()))) {
                        break;
                    }
                }
                z3 = false;
            }
            if (z3) {
                throw new IllegalArgumentException(("The set of anticipated audio stream an unnecessary audio stream must be disjointed!\nAnticipated set: " + this.rl + "\nUnnecessary set: " + this.f7950t + "\nintersection: " + CollectionsKt.intersect(this.f7950t, this.rl)).toString());
            }
        }

        public int hashCode() {
            return (((this.f7949n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f7950t.hashCode();
        }

        public final Dsr n() {
            return this.f7949n;
        }

        public final Set rl() {
            return this.rl;
        }

        public final Set t() {
            return this.f7950t;
        }

        public String toString() {
            return "Request(command=" + this.f7949n + ", idsOfAnticipatedAudioStreams=" + this.rl + ", idsOfUnnecessaryAudioStreams=" + this.f7950t + ')';
        }
    }

    Object n(Continuation continuation);

    Object rl(C0282j c0282j, Continuation continuation);

    Object t(Map map, int i2, Continuation continuation);
}
