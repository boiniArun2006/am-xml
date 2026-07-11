package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class PreferenceManager {
    private boolean J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private SharedPreferences.Editor f40640O;
    private String Uo;
    private OnDisplayPreferenceDialogListener az;
    private PreferenceComparisonCallback gh;
    private PreferenceScreen mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f40641n;
    private PreferenceDataStore nr;
    private OnPreferenceTreeClickListener qie;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SharedPreferences f40642t;
    private OnNavigateToScreenListener ty;
    private long rl = 0;
    private int xMQ = 0;

    public interface OnDisplayPreferenceDialogListener {
        void qie(Preference preference);
    }

    public interface OnNavigateToScreenListener {
        void J2(PreferenceScreen preferenceScreen);
    }

    public interface OnPreferenceTreeClickListener {
        boolean az(Preference preference);
    }

    public static abstract class PreferenceComparisonCallback {
        public abstract boolean n(Preference preference, Preference preference2);

        public abstract boolean rl(Preference preference, Preference preference2);
    }

    public PreferenceScreen gh(Context context, int i2, PreferenceScreen preferenceScreen) {
        qie(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new PreferenceInflater(context, this).nr(i2, preferenceScreen);
        preferenceScreen2.Xw(this);
        qie(false);
        return preferenceScreen2;
    }

    long nr() {
        long j2;
        synchronized (this) {
            j2 = this.rl;
            this.rl = 1 + j2;
        }
        return j2;
    }

    public static class SimplePreferenceComparisonCallback extends PreferenceComparisonCallback {
        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean n(Preference preference, Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.Po6()) || !TextUtils.equals(preference.fD(), preference2.fD()) || !TextUtils.equals(preference.te(), preference2.te())) {
                return false;
            }
            Drawable drawableTy = preference.ty();
            Drawable drawableTy2 = preference2.ty();
            if ((drawableTy != drawableTy2 && (drawableTy == null || !drawableTy.equals(drawableTy2))) || preference.T() != preference2.T() || preference.nHg() != preference2.nHg()) {
                return false;
            }
            if ((preference instanceof TwoStatePreference) && ((TwoStatePreference) preference).EWS() != ((TwoStatePreference) preference2).EWS()) {
                return false;
            }
            if ((preference instanceof DropDownPreference) && preference != preference2) {
                return false;
            }
            return true;
        }

        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean rl(Preference preference, Preference preference2) {
            if (preference.HI() == preference2.HI()) {
                return true;
            }
            return false;
        }
    }

    private void qie(boolean z2) {
        SharedPreferences.Editor editor;
        if (!z2 && (editor = this.f40640O) != null) {
            editor.apply();
        }
        this.J2 = z2;
    }

    private static String rl(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public void HI(OnPreferenceTreeClickListener onPreferenceTreeClickListener) {
        this.qie = onPreferenceTreeClickListener;
    }

    public void Ik(String str) {
        this.Uo = str;
        this.f40642t = null;
    }

    public OnPreferenceTreeClickListener J2() {
        return this.qie;
    }

    public PreferenceDataStore KN() {
        return this.nr;
    }

    public OnNavigateToScreenListener O() {
        return this.ty;
    }

    public PreferenceComparisonCallback Uo() {
        return this.gh;
    }

    public void az(OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener) {
        this.az = onDisplayPreferenceDialogListener;
    }

    public boolean ck(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.mUb;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.p5();
        }
        this.mUb = preferenceScreen;
        return true;
    }

    public Preference n(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.mUb;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.UhV(charSequence);
    }

    public void o(Preference preference) {
        OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener = this.az;
        if (onDisplayPreferenceDialogListener != null) {
            onDisplayPreferenceDialogListener.qie(preference);
        }
    }

    boolean r() {
        return !this.J2;
    }

    SharedPreferences.Editor t() {
        if (this.nr != null) {
            return null;
        }
        if (!this.J2) {
            return mUb().edit();
        }
        if (this.f40640O == null) {
            this.f40640O = mUb().edit();
        }
        return this.f40640O;
    }

    public void ty(OnNavigateToScreenListener onNavigateToScreenListener) {
        this.ty = onNavigateToScreenListener;
    }

    public PreferenceScreen xMQ() {
        return this.mUb;
    }

    public PreferenceManager(Context context) {
        this.f40641n = context;
        Ik(rl(context));
    }

    public SharedPreferences mUb() {
        Context contextCreateDeviceProtectedStorageContext;
        if (KN() != null) {
            return null;
        }
        if (this.f40642t == null) {
            if (this.xMQ != 1) {
                contextCreateDeviceProtectedStorageContext = this.f40641n;
            } else {
                contextCreateDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(this.f40641n);
            }
            this.f40642t = contextCreateDeviceProtectedStorageContext.getSharedPreferences(this.Uo, this.KN);
        }
        return this.f40642t;
    }
}
