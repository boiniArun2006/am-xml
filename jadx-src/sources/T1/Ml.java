package T1;

import android.content.Context;
import androidx.content.core.CorruptionException;
import androidx.content.core.DataStore;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.preferences.PreferenceDataStoreDelegateKt;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f10127n = {Reflection.property1(new PropertyReference1Impl(Ml.class, "preferencesDataStore", "getPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final ReadOnlyProperty rl = PreferenceDataStoreDelegateKt.rl("pico_logged_experiments", new ReplaceFileCorruptionHandler(new Function1() { // from class: T1.w6
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Ml.nr((CorruptionException) obj);
        }
    }), null, null, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences nr(CorruptionException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PreferencesFactory.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore t(Context context) {
        return (DataStore) rl.getValue(context, f10127n[0]);
    }
}
