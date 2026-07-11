package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class BundleCompat {

    @RequiresApi
    static class Api33Impl {
        static SparseArray O(Bundle bundle, String str, Class cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }

        static Object n(Bundle bundle, String str, Class cls) {
            return bundle.getParcelable(str, cls);
        }

        static Serializable nr(Bundle bundle, String str, Class cls) {
            return bundle.getSerializable(str, cls);
        }

        static Object[] rl(Bundle bundle, String str, Class cls) {
            return bundle.getParcelableArray(str, cls);
        }

        static ArrayList t(Bundle bundle, String str, Class cls) {
            return bundle.getParcelableArrayList(str, cls);
        }
    }

    public static SparseArray O(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? Api33Impl.O(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }

    public static Object n(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.n(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static Serializable nr(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.nr(bundle, str, cls);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    public static Parcelable[] rl(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) Api33Impl.rl(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    public static ArrayList t(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? Api33Impl.t(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }
}
