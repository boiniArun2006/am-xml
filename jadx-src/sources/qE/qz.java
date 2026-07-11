package qE;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f72312n = {Reflection.property1(new PropertyReference1Impl(qz.class, "preferencesDataStore", "getPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final ReadOnlyProperty rl = PreferenceDataStoreDelegateKt.rl("oracle_preferences_datastore", new ReplaceFileCorruptionHandler(new Function1() { // from class: qE.o
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return qz.nr((CorruptionException) obj);
        }
    }), null, null, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences nr(CorruptionException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PreferencesFactory.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore t(Context context) {
        return (DataStore) rl.getValue(context, f72312n[0]);
    }
}
