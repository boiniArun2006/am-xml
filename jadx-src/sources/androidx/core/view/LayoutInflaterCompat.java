package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class LayoutInflaterCompat {

    static class Factory2Wrapper implements LayoutInflater.Factory2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final LayoutInflaterFactory f36733n;

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f36733n.onCreateView(null, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f36733n.onCreateView(view, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.f36733n + "}";
        }
    }

    public static void n(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
