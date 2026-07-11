package com.applovin.mediation;

import com.applovin.impl.sdk.C1804o;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MaxSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f51049b;

    private void a(int i2) {
        if (i2 >= 0) {
            return;
        }
        C1804o.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i2);
    }

    public int getKey() {
        return this.f51048a;
    }

    public List<Integer> getValues() {
        return this.f51049b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f51048a + ", values=" + this.f51049b + '}';
    }

    public MaxSegment(int i2, List<Integer> list) {
        this.f51048a = i2;
        this.f51049b = list;
        a(i2);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }
}
