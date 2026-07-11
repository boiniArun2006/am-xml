package FjR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class o implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f3059n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f3058t = new n(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final o f3057O = new o();

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f3060n;

        public final o n() {
            return new o(kYF.w6.rl(this.f3060n), null);
        }

        public j(o oVar) {
            this.f3060n = MapsKt.toMutableMap(oVar.f3059n);
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    public /* synthetic */ o(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.areEqual(this.f3059n, ((o) obj).f3059n);
    }

    private o(Map map) {
        this.f3059n = map;
    }

    public final j J2() {
        return new j(this);
    }

    public final Object Uo(String str) {
        android.support.v4.media.j.n(this.f3059n.get(str));
        return null;
    }

    public int hashCode() {
        return this.f3059n.hashCode();
    }

    public final boolean isEmpty() {
        return this.f3059n.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map map = this.f3059n;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            android.support.v4.media.j.n(entry.getValue());
            arrayList.add(TuplesKt.to(str, null));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(entries=" + this.f3059n + ')';
    }

    public final Map O() {
        if (isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map map = this.f3059n;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return linkedHashMap;
        }
        android.support.v4.media.j.n(((Map.Entry) it.next()).getValue());
        throw null;
    }

    public o() {
        this(MapsKt.emptyMap());
    }
}
