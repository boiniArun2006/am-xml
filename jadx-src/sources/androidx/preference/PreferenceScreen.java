package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.PreferenceManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean Rl;

    @Override // androidx.preference.PreferenceGroup
    protected boolean ER() {
        return false;
    }

    @RestrictTo
    public PreferenceScreen(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, TypedArrayUtils.n(context, R.attr.KN, android.R.attr.preferenceScreenStyle));
        this.Rl = true;
    }

    public boolean QZ6() {
        return this.Rl;
    }

    @Override // androidx.preference.Preference
    protected void P5() {
        PreferenceManager.OnNavigateToScreenListener onNavigateToScreenListenerO;
        if (ck() == null && az() == null && tUK() != 0 && (onNavigateToScreenListenerO = nY().O()) != null) {
            onNavigateToScreenListenerO.J2(this);
        }
    }
}
