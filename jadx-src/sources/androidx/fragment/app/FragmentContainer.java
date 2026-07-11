package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class FragmentContainer {
    public abstract boolean nr();

    public abstract View t(int i2);

    public Fragment rl(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
