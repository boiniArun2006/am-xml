package gB;

import gB.I28;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface j {

    /* JADX INFO: renamed from: gB.j$j, reason: collision with other inner class name */
    public static final class C0937j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f67172n;
        private final Map nr;
        private final Set rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Set f67173t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0937j)) {
                return false;
            }
            C0937j c0937j = (C0937j) obj;
            return Intrinsics.areEqual(this.f67172n, c0937j.f67172n) && Intrinsics.areEqual(this.rl, c0937j.rl) && Intrinsics.areEqual(this.f67173t, c0937j.f67173t) && Intrinsics.areEqual(this.nr, c0937j.nr);
        }

        public C0937j(Map videos, Set figures, Set hint, Map framesToPrefetch) {
            Intrinsics.checkNotNullParameter(videos, "videos");
            Intrinsics.checkNotNullParameter(figures, "figures");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(framesToPrefetch, "framesToPrefetch");
            this.f67172n = videos;
            this.rl = figures;
            this.f67173t = hint;
            this.nr = framesToPrefetch;
            Set setKeySet = videos.keySet();
            Set setKeySet2 = framesToPrefetch.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : hint) {
                if (obj instanceof I28.j) {
                    arrayList.add(obj);
                }
            }
            Set set = CollectionsKt.toSet(arrayList);
            if (SetsKt.plus(setKeySet, (Iterable) this.f67173t).containsAll(setKeySet2)) {
                return;
            }
            throw new IllegalArgumentException(("Cannot prefetch frames for videos which are not included in the current request videos nor in the hint.\nVideos to prefetch: " + setKeySet2 + "\nRequest videos: " + setKeySet + "\nHinted videos: " + set).toString());
        }

        public int hashCode() {
            return (((((this.f67172n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f67173t.hashCode()) * 31) + this.nr.hashCode();
        }

        public final Set n() {
            return this.rl;
        }

        public final Map nr() {
            return this.f67172n;
        }

        public final Map rl() {
            return this.nr;
        }

        public final Set t() {
            return this.f67173t;
        }

        public String toString() {
            return "Request(videos=" + this.f67172n + ", figures=" + this.rl + ", hint=" + this.f67173t + ", framesToPrefetch=" + this.nr + ')';
        }
    }

    Object n(Continuation continuation);

    Object rl(C0937j c0937j, Continuation continuation);
}
