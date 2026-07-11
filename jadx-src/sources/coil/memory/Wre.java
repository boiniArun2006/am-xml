package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre implements fuX {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f43886t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinkedHashMap f43887n = new LinkedHashMap();
    private int rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f43888n;
        private final int nr;
        private final WeakReference rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Map f43889t;

        public final WeakReference n() {
            return this.rl;
        }

        public final int nr() {
            return this.nr;
        }

        public final Map rl() {
            return this.f43889t;
        }

        public final int t() {
            return this.f43888n;
        }

        public n(int i2, WeakReference weakReference, Map map, int i3) {
            this.f43888n = i2;
            this.rl = weakReference;
            this.f43889t = map;
            this.nr = i3;
        }
    }

    @Override // coil.memory.fuX
    public synchronized void n(int i2) {
        if (i2 >= 10 && i2 != 20) {
            nr();
        }
    }

    public final void nr() {
        WeakReference weakReferenceN;
        this.rl = 0;
        Iterator it = this.f43887n.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                n nVar = (n) CollectionsKt.firstOrNull((List) arrayList);
                if (((nVar == null || (weakReferenceN = nVar.n()) == null) ? null : (Bitmap) weakReferenceN.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int i5 = i3 - i2;
                    if (((n) arrayList.get(i5)).n().get() == null) {
                        arrayList.remove(i5);
                        i2++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // coil.memory.fuX
    public synchronized MemoryCache.n rl(MemoryCache.Key key) {
        try {
            ArrayList arrayList = (ArrayList) this.f43887n.get(key);
            MemoryCache.n nVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i2);
                Bitmap bitmap = (Bitmap) nVar2.n().get();
                MemoryCache.n nVar3 = bitmap != null ? new MemoryCache.n(bitmap, nVar2.rl()) : null;
                if (nVar3 != null) {
                    nVar = nVar3;
                    break;
                }
                i2++;
            }
            O();
            return nVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil.memory.fuX
    public synchronized void t(MemoryCache.Key key, Bitmap bitmap, Map map, int i2) {
        try {
            LinkedHashMap linkedHashMap = this.f43887n;
            Object arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            n nVar = new n(iIdentityHashCode, new WeakReference(bitmap), map, i2);
            int size = arrayList2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    arrayList2.add(nVar);
                    break;
                }
                n nVar2 = (n) arrayList2.get(i3);
                if (i2 < nVar2.nr()) {
                    i3++;
                } else if (nVar2.t() == iIdentityHashCode && nVar2.n().get() == bitmap) {
                    arrayList2.set(i3, nVar);
                } else {
                    arrayList2.add(i3, nVar);
                }
            }
            O();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void O() {
        int i2 = this.rl;
        this.rl = i2 + 1;
        if (i2 >= 10) {
            nr();
        }
    }
}
