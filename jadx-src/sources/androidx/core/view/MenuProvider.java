package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface MenuProvider {
    default void n(Menu menu) {
    }

    void nr(Menu menu, MenuInflater menuInflater);

    default void rl(Menu menu) {
    }

    boolean t(MenuItem menuItem);
}
