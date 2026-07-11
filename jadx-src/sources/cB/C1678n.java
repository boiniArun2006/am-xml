package cB;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cB.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1678n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SharedPreferences f43571n;
    private final Set rl;

    public C1678n(SharedPreferences prefs, Set set) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f43571n = prefs;
        this.rl = set;
    }

    private final String n(String str) {
        Set set = this.rl;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(("Can't access key " + str + " - outside keySet: " + this.rl).toString());
    }

    public final String rl(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f43571n.getString(n(key), str);
    }

    public /* synthetic */ C1678n(SharedPreferences sharedPreferences, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, (i2 & 2) != 0 ? null : set);
    }
}
