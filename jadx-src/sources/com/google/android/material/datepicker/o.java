package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class o extends Fragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final LinkedHashSet f58952n = new LinkedHashSet();

    boolean WPU(C c2) {
        return this.f58952n.add(c2);
    }

    void aYN() {
        this.f58952n.clear();
    }

    o() {
    }
}
