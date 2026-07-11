package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f53352a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53353b;

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f53352a.isEmpty() || eVar.f53354a == null) {
            return false;
        }
        Iterator it = this.f53352a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f53354a)) {
                return !this.f53353b;
            }
        }
        return this.f53353b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "demand", this.f53352a, Boolean.valueOf(this.f53353b));
    }

    public c(JSONArray jSONArray, boolean z2) {
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                long jOptLong = jSONArray.optLong(i2);
                if (jOptLong != 0) {
                    this.f53352a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f53353b = z2;
    }
}
