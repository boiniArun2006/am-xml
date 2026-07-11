package com.alightcreative.widget;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f47049n = new ArrayList();

    public static final boolean rl() {
        Iterator it = f47049n.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            ValueSpinner valueSpinner = (ValueSpinner) ((WeakReference) it.next()).get();
            if (valueSpinner != null && valueSpinner.nY()) {
                z2 = true;
            }
        }
        return z2;
    }
}
