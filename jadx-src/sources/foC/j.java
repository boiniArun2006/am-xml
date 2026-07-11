package foC;

import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {
    private final Map J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final SharedPreferences f66980O;
    private final Map Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f66981n;
    private final Moshi nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f66982t;

    /* JADX INFO: renamed from: foC.j$j, reason: collision with other inner class name */
    public static final class C0927j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f66983n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0927j) && Intrinsics.areEqual(this.f66983n, ((C0927j) obj).f66983n);
        }

        public C0927j(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f66983n = name;
        }

        public int hashCode() {
            return this.f66983n.hashCode();
        }

        public final String n() {
            return this.f66983n;
        }

        public String toString() {
            return "Key(name=" + this.f66983n + ")";
        }
    }

    public j(String name, boolean z2, boolean z3, Moshi moshi, SharedPreferences _sharedPrefs, Map _cache) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(_sharedPrefs, "_sharedPrefs");
        Intrinsics.checkNotNullParameter(_cache, "_cache");
        this.f66981n = name;
        this.rl = z2;
        this.f66982t = z3;
        this.nr = moshi;
        this.f66980O = _sharedPrefs;
        this.J2 = _cache;
        this.Uo = new LinkedHashMap();
    }

    public final SharedPreferences J2() {
        return this.f66980O;
    }

    public final Map O() {
        return this.J2;
    }

    public final void n(C0927j key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        android.support.v4.media.j.n(this.Uo.get(key));
    }

    public final Moshi nr() {
        return this.nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean rl(C0927j key) {
        boolean z2;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this) {
            if (!this.J2.containsKey(key)) {
                z2 = this.f66980O.contains(key.n());
            }
        }
        return z2;
    }

    public final boolean t() {
        return this.rl;
    }

    public /* synthetic */ j(String str, Context context, boolean z2, boolean z3, Moshi moshi, SharedPreferences sharedPreferences, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, context, (i2 & 4) != 0 ? true : z2, z3, moshi, (i2 & 32) != 0 ? n.n(context, str, z3) : sharedPreferences, (i2 & 64) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String name, Context context, boolean z2, boolean z3, Moshi moshi, SharedPreferences _sharedPrefs, Map _cache) {
        this(name, z2, z3, moshi, _sharedPrefs, _cache);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(_sharedPrefs, "_sharedPrefs");
        Intrinsics.checkNotNullParameter(_cache, "_cache");
    }
}
