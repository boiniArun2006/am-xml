package v5Z;

import android.content.Context;
import androidx.content.core.DataStore;
import androidx.content.preferences.PreferenceDataStoreDelegateKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f74654n = {Reflection.property1(new PropertyReference1Impl(n.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final ReadOnlyProperty rl = PreferenceDataStoreDelegateKt.rl("TemplatesRepository", null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore rl(Context context) {
        return (DataStore) rl.getValue(context, f74654n[0]);
    }
}
