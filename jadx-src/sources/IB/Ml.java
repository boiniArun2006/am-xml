package IB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import z.Pmq;
import z.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f4046n;
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f4047t = new LinkedHashMap();
    private final LinkedList nr = new LinkedList();

    private final class j implements g9s {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final g9s f4048n;
        private n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ml f4049t;

        public j(Ml ml, g9s underlyingTexture) {
            Intrinsics.checkNotNullParameter(underlyingTexture, "underlyingTexture");
            this.f4049t = ml;
            this.f4048n = underlyingTexture;
            this.rl = n.f4053t;
        }

        @Override // z.Z
        public int KN() {
            n nVar = this.rl;
            if (nVar == n.f4053t) {
                return this.f4048n.KN();
            }
            throw new IllegalStateException(("The texture is not in a valid state: " + nVar).toString());
        }

        public final void P5() {
            if (this.rl != n.f4051n) {
                throw new IllegalStateException("Check failed.");
            }
            this.rl = n.f4053t;
        }

        public final boolean U() {
            return this.rl == n.f4051n;
        }

        public final int Xw() {
            if (this.rl != n.f4050O) {
                return this.f4048n.getSize();
            }
            throw new IllegalStateException("The texture was destroyed!");
        }

        public final void bzg() {
            n nVar = this.rl;
            n nVar2 = n.f4050O;
            if (nVar == nVar2) {
                throw new IllegalStateException("Check failed.");
            }
            this.f4048n.release();
            this.rl = nVar2;
        }

        @Override // z.Z
        public int g() {
            n nVar = this.rl;
            if (nVar == n.f4053t) {
                return this.f4048n.g();
            }
            throw new IllegalStateException(("The texture is not in a valid state: " + nVar).toString());
        }

        @Override // z.Z
        public int getHeight() {
            n nVar = this.rl;
            if (nVar == n.f4053t) {
                return this.f4048n.getHeight();
            }
            throw new IllegalStateException(("The texture is not in a valid state: " + nVar).toString());
        }

        @Override // z.Z
        public int getSize() {
            n nVar = this.rl;
            if (nVar == n.f4053t) {
                return this.f4048n.getSize();
            }
            throw new IllegalStateException(("The texture is not in a valid state: " + nVar).toString());
        }

        @Override // z.Z
        public int getWidth() {
            n nVar = this.rl;
            if (nVar == n.f4053t) {
                return this.f4048n.getWidth();
            }
            throw new IllegalStateException(("The texture is not in a valid state: " + nVar).toString());
        }

        public final boolean jB() {
            return this.rl == n.f4050O;
        }

        @Override // z.Z
        public int o() {
            n nVar = this.rl;
            if (nVar == n.f4053t) {
                return this.f4048n.o();
            }
            throw new IllegalStateException(("The texture is not in a valid state: " + nVar).toString());
        }

        @Override // Cp.j
        public void release() {
            Ml ml = this.f4049t;
            n nVar = this.rl;
            n nVar2 = n.f4053t;
            if (nVar != nVar2) {
                throw new IllegalStateException(("The texture is not in a valid state: " + nVar).toString());
            }
            if (nVar != nVar2) {
                throw new IllegalStateException("Check failed.");
            }
            this.rl = n.f4051n;
            ml.nr();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class n {
        private static final /* synthetic */ n[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f4052r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f4051n = new n("RECYCLED", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f4053t = new n("VALID", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f4050O = new n("DESTROYED", 2);

        static {
            n[] nVarArrN = n();
            J2 = nVarArrN;
            f4052r = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f4051n, f4053t, f4050O};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) J2.clone();
        }

        private n(String str, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nr() {
        if (this.rl <= this.f4046n || this.nr.isEmpty()) {
            return;
        }
        Iterator it = this.nr.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext() && this.rl > this.f4046n) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            j jVar = (j) next;
            if (jVar.U()) {
                int iXw = jVar.Xw();
                jVar.bzg();
                this.rl -= (long) iXw;
                it.remove();
            }
        }
    }

    public final g9s O(Pmq spec, g9s texture) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(texture, "texture");
        if (texture instanceof j) {
            throw new IllegalArgumentException("Cannot add a recyclable texture to the cache");
        }
        j jVar = new j(this, texture);
        Map map = this.f4047t;
        Object linkedList = map.get(spec);
        if (linkedList == null) {
            linkedList = new LinkedList();
            map.put(spec, linkedList);
        }
        ((LinkedList) linkedList).push(jVar);
        this.nr.addLast(jVar);
        this.rl += (long) texture.getSize();
        nr();
        return jVar;
    }

    public final List rl() {
        List listFlatten = CollectionsKt.flatten(this.f4047t.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFlatten) {
            if (!((j) obj).jB()) {
                arrayList.add(obj);
            }
        }
        this.f4047t.clear();
        this.rl = 0L;
        return arrayList;
    }

    public final g9s t(Pmq spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        LinkedList linkedList = (LinkedList) this.f4047t.get(spec);
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        Iterator it = linkedList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            j jVar = (j) next;
            if (jVar.jB()) {
                it.remove();
            }
            if (jVar.U()) {
                if (!this.nr.remove(jVar)) {
                    throw new IllegalStateException("Check failed.");
                }
                this.nr.addLast(jVar);
                jVar.P5();
                return jVar;
            }
        }
        return null;
    }

    public Ml(long j2) {
        this.f4046n = j2;
    }
}
