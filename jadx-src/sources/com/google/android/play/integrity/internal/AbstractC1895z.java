package com.google.android.play.integrity.internal;

import android.os.Bundle;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC1895z {
    public static final List n(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l3D l3d = (l3D) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt(StatsEvent.f62830z, l3d.n());
            bundle.putLong("event_timestamp", l3d.rl());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void rl(int i2, List list) {
        list.add(l3D.t(i2, System.currentTimeMillis()));
    }
}
