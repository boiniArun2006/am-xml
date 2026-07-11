package com.google.android.material.search;

import IzQ.n;
import android.content.Context;
import android.support.v4.media.j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, n {

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        public boolean N(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean qie(CoordinatorLayout coordinatorLayout, View view, View view2) {
            j.n(view);
            return N(coordinatorLayout, null, view2);
        }
    }
}
