package com.applovin.impl;

import com.applovin.impl.sdk.C1804o;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m4 f50686a = new m4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet f50687b = new TreeSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f50688c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50690e;

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            C1804o.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f50686a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f50686a.isEmpty()) {
            this.f50686a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f50686a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f50686a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f50686a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f50687b);
    }

    public int c() {
        int i2 = this.f50689d;
        if (i2 != -1 && this.f50690e != -1) {
            while (i2 <= this.f50690e) {
                if (g(i2) && !h(i2)) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    public int b(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return i2 + a(i2 - 1, false);
    }

    public Collection e(int i2) {
        return new TreeSet((SortedSet) this.f50687b.tailSet(Integer.valueOf(i2), false));
    }

    public void f(int i2) {
        int iB = this.f50686a.b(Integer.valueOf(i2));
        for (int size = this.f50686a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f50686a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f50686a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public boolean g(int i2) {
        return this.f50686a.contains(Integer.valueOf(i2));
    }

    public boolean h(int i2) {
        return this.f50687b.contains(Integer.valueOf(i2));
    }

    public void i(int i2) {
        int iB = this.f50686a.b(Integer.valueOf(i2));
        if (g(i2)) {
            this.f50688c.remove(Integer.valueOf(i2));
            this.f50687b.remove(Integer.valueOf(i2));
            this.f50686a.b(iB);
        }
        while (iB < this.f50686a.size()) {
            Integer num = (Integer) this.f50686a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f50686a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public w2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    public void b(int i2, int i3) {
        i(i2);
        f(i3);
    }

    public int d(int i2) {
        if (g(i2)) {
            return -1;
        }
        return i2 - a(i2, true);
    }

    public void c(int i2, int i3) {
        this.f50689d = i2;
        this.f50690e = i3;
    }

    public int c(int i2) {
        return i2 + a(i2, false);
    }

    public MaxAd a(int i2) {
        return (MaxAd) this.f50688c.get(Integer.valueOf(i2));
    }

    public void a(MaxAd maxAd, int i2) {
        this.f50688c.put(Integer.valueOf(i2), maxAd);
        this.f50687b.add(Integer.valueOf(i2));
    }

    public void a() {
        this.f50688c.clear();
        this.f50687b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f50688c.remove(num);
            this.f50687b.remove(num);
        }
    }

    private void a(int i2, int i3) {
        if (this.f50688c.containsKey(Integer.valueOf(i2))) {
            this.f50688c.put(Integer.valueOf(i3), (MaxAd) this.f50688c.get(Integer.valueOf(i2)));
            this.f50687b.add(Integer.valueOf(i3));
            this.f50688c.remove(Integer.valueOf(i2));
            this.f50687b.remove(Integer.valueOf(i2));
        }
    }

    private int a(int i2, boolean z2) {
        int iC = this.f50686a.c(Integer.valueOf(i2));
        if (!z2) {
            int i3 = i2 + iC;
            while (iC < this.f50686a.size() && i3 >= ((Integer) this.f50686a.a(iC)).intValue()) {
                i3++;
                iC++;
            }
        }
        return iC;
    }
}
