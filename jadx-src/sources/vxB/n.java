package vxB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConcurrentHashMap f74772n = new ConcurrentHashMap();

    public final List n(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f74772n.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((j) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public final void rl(String appId, List gateKeeperList) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = gateKeeperList.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            concurrentHashMap.put(jVar.n(), jVar);
        }
        this.f74772n.put(appId, concurrentHashMap);
    }
}
