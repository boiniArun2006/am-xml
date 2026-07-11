package cg;

import android.content.Context;
import androidx.content.DataStoreDelegateKt;
import androidx.content.core.DataStore;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f43786n = {Reflection.property1(new PropertyReference1Impl(aC.class, "creatorProgramDataStore", jhotmBbwMbr.ykGs, 1))};
    private static final ReadOnlyProperty rl = DataStoreDelegateKt.rl("creatorProgramData", I28.f43780n, null, null, null, 28, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore rl(Context context) {
        return (DataStore) rl.getValue(context, f43786n[0]);
    }
}
