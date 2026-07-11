package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class InterstitialInfoCollection extends ConcurrentHashMap<String, n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61683a = "InterstitialInfoCollection";

    public List<n> a(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                n nVar = get(it.next());
                if (nVar != null && !nVar.f61827U && nVar.c() != null && nVar.c().equals(str)) {
                    arrayList.add(nVar);
                }
            }
        }
        return arrayList;
    }

    public n a(String str, boolean z2) {
        Logger.d(f61683a, "get by view address, viewAddress = ", str);
        if (str == null) {
            Logger.d(f61683a, "get by view address, view is null, exiting");
            return null;
        }
        if (str.contains("@")) {
            str = str.substring(str.indexOf(64) + 1);
            Logger.d(f61683a, "get by view address, viewAddress cut to ", str);
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                n nVar = get(it.next());
                if (nVar != null) {
                    if (z2 && nVar.f61827U) {
                        Logger.d(f61683a, "get by view address - skipping ad that was already finished with event id - ", nVar.w());
                    } else {
                        Logger.d(f61683a, "get by view address, searching by viewAddress ", str, ", view hierarchy : ", nVar.x(), " is ad finished? ", Boolean.valueOf(nVar.f61827U));
                        if (nVar.f61818K != null && nVar.f61818K.equals(str)) {
                            Logger.d(f61683a, "get by view address, found. viewAddress = ", str, " with event id: ", nVar.w());
                            return nVar;
                        }
                        if (nVar.x() != null && nVar.x().contains(str)) {
                            Logger.d(f61683a, "get by view address, found in views hierarchy . viewAddress = ", str, " with event id: ", nVar.w());
                            return nVar;
                        }
                    }
                }
            }
            return null;
        }
    }

    public n b(String str) {
        Logger.d(f61683a, "get by activity address, viewAddress = ", str);
        if (str == null) {
            Logger.d(f61683a, "get by activity address, view is null, exiting");
            return null;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                n nVar = get(it.next());
                if (nVar != null && nVar.ad != null && nVar.ad.endsWith(str)) {
                    Logger.d(f61683a, "get by activity address, found by ", nVar.ad);
                    return nVar;
                }
            }
            return null;
        }
    }

    public boolean c(String str) {
        Logger.d(f61683a, "contains activity address, viewAddress = ", str, ", keys = ", keySet());
        if (str == null) {
            Logger.d(f61683a, "contains activity address, view is null, exiting");
            return false;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                n nVar = get(it.next());
                if (nVar != null && nVar.ad != null && nVar.ad.endsWith(str)) {
                    Logger.d(f61683a, "contains activity address, found by ", nVar.ad);
                    return true;
                }
            }
            return false;
        }
    }

    public n d(String str) {
        if (str == null) {
            Logger.d(f61683a, "get by eventId, eventId is null, exiting");
            return null;
        }
        if (!containsKey(str)) {
            return null;
        }
        Logger.d(f61683a, "get by eventId, found by eventId ", str);
        return get(str);
    }

    public n e(String str) {
        if (str == null) {
            Logger.d(f61683a, "get by adId, adId is null, exiting");
            return null;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                n nVar = get(it.next());
                if (nVar != null && nVar.j() != null && nVar.j().N().equals(str)) {
                    Logger.d(f61683a, "get by adId, found by adid ", str);
                    return nVar;
                }
            }
            return null;
        }
    }

    public boolean a() {
        Iterator<n> it = values().iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            z2 = z2 && it.next().ar;
        }
        return z2;
    }

    public String b() {
        HashSet hashSet = new HashSet();
        synchronized (this) {
            Iterator<n> it = values().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().c());
            }
        }
        return hashSet.toString();
    }

    protected int a(boolean z2) {
        int i2;
        if (!z2) {
            return size();
        }
        synchronized (this) {
            i2 = 0;
            for (n nVar : values()) {
                if (nVar != null && nVar.aq == null) {
                    i2++;
                }
            }
        }
        return i2;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public int size() {
        return super.size();
    }

    public synchronized List<n> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (n nVar : values()) {
            if (nVar != null && nVar.aq == null) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InterstitialInfoCollection : ");
        synchronized (this) {
            for (n nVar : values()) {
                sb.append("[ ");
                if (nVar != null) {
                    if (nVar.f61840v != null) {
                        sb.append("maxSdk=");
                        sb.append(nVar.f61840v);
                    }
                    if (nVar.f61819L != null) {
                        sb.append(",eventId=");
                        sb.append(nVar.f61819L);
                    }
                    if (nVar.aq != null && nVar.aq.get() != null) {
                        sb.append(",interstitialActivity=");
                        sb.append(nVar.aq.get().toString());
                    }
                    if (nVar.f61818K != null) {
                        sb.append(",viewAddress=");
                        sb.append(nVar.f61818K);
                    }
                    sb.append(",isAdFinished=");
                    sb.append(nVar.f61827U);
                }
                sb.append(" ] ");
            }
        }
        return sb.toString();
    }
}
