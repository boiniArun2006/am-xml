package qHw;

import HI0.gnv;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.alightcreative.gl.egl.il.inFlMLxL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LqHw/Md;", "Landroidx/preference/PreferenceFragmentCompat;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "rootKey", "", "E2", "(Landroid/os/Bundle;Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsFragment.kt\ncom/alightcreative/app/motion/activities/settings/SettingsFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class Md extends PreferenceFragmentCompat {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bzg(FragmentActivity fragmentActivity, Preference preference, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Qk.r.WPU(fragmentActivity);
        Qk.r.aYN(fragmentActivity);
        preference.ul("(Currently " + gnv.nr(Qk.r.g(fragmentActivity) + Qk.r.te(fragmentActivity)) + ")");
        return true;
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void E2(Bundle savedInstanceState, String rootKey) {
        final FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        WPU(2132213766);
        Preference preferenceKN = KN(inFlMLxL.MJAqpxeriVXvShU);
        if (preferenceKN != null) {
            g().kSg(preferenceKN);
        }
        final Preference preferenceKN2 = KN("com.alightcreative.motion.prefbutton.clearExportCache");
        Intrinsics.checkNotNull(preferenceKN2);
        preferenceKN2.ul("(Currently " + gnv.nr(Qk.r.g(activity) + Qk.r.te(activity)) + ")");
        preferenceKN2.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.psW
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean n(Preference preference) {
                return Md.bzg(activity, preferenceKN2, preference);
            }
        });
    }
}
