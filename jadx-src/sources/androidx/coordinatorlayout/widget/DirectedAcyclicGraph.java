package androidx.coordinatorlayout.widget;

import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public final class DirectedAcyclicGraph<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pools.Pool f36137n = new Pools.SimplePool(10);
    private final SimpleArrayMap rl = new SimpleArrayMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList f36138t = new ArrayList();
    private final HashSet nr = new HashSet();

    private ArrayList J2() {
        ArrayList arrayList = (ArrayList) this.f36137n.acquire();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public ArrayList KN() {
        this.f36138t.clear();
        this.nr.clear();
        int size = this.rl.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            O(this.rl.xMQ(i2), this.f36138t, this.nr);
        }
        return this.f36138t;
    }

    public List Uo(Object obj) {
        int size = this.rl.getSize();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList2 = (ArrayList) this.rl.az(i2);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.rl.xMQ(i2));
            }
        }
        return arrayList;
    }

    public void n(Object obj, Object obj2) {
        if (!this.rl.containsKey(obj) || !this.rl.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListJ2 = (ArrayList) this.rl.get(obj);
        if (arrayListJ2 == null) {
            arrayListJ2 = J2();
            this.rl.put(obj, arrayListJ2);
        }
        arrayListJ2.add(obj2);
    }

    public boolean nr(Object obj) {
        return this.rl.containsKey(obj);
    }

    public void rl(Object obj) {
        if (this.rl.containsKey(obj)) {
            return;
        }
        this.rl.put(obj, null);
    }

    public void t() {
        int size = this.rl.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = (ArrayList) this.rl.az(i2);
            if (arrayList != null) {
                mUb(arrayList);
            }
        }
        this.rl.clear();
    }

    public boolean xMQ(Object obj) {
        int size = this.rl.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = (ArrayList) this.rl.az(i2);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    private void O(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.rl.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    O(arrayList2.get(i2), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    private void mUb(ArrayList arrayList) {
        arrayList.clear();
        this.f36137n.n(arrayList);
    }
}
