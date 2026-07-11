package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class qz extends LinearLayoutManager {

    class j extends LinearSmoothScroller {
        j(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        protected float S(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void uQ(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        j jVar = new j(recyclerView.getContext());
        jVar.ck(i2);
        wKY(jVar);
    }

    qz(Context context, int i2, boolean z2) {
        super(context, i2, z2);
    }
}
