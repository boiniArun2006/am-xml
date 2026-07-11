package UiE;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.s4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class eO {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f10815t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10816n;
    private final boolean rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void n() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s4.qie()).edit();
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            editorEdit.apply();
        }

        public final eO rl() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(s4.qie());
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return null;
            }
            return new eO(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), defaultConstructorMarker);
        }
    }

    public /* synthetic */ eO(String str, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z2);
    }

    private eO(String str, boolean z2) {
        this.f10816n = str;
        this.rl = z2;
    }

    public String toString() {
        String str = this.rl ? "Applink" : "Unclassified";
        if (this.f10816n == null) {
            return str;
        }
        return str + '(' + this.f10816n + ')';
    }

    public final void n() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s4.qie()).edit();
        editorEdit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f10816n);
        editorEdit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.rl);
        editorEdit.apply();
    }
}
