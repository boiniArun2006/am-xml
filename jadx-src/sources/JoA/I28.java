package JoA;

import Dk.InterfaceC1335n;
import GJW.vd;
import Zv.j;
import android.content.Context;
import androidx.content.core.CorruptionException;
import androidx.content.core.DataStore;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.preferences.PreferenceDataStoreFile;
import androidx.content.preferences.core.PreferenceDataStoreFactory;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesFactory;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class I28 implements j {
    private final PI.j J2;
    private final Zv.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final vd f4680O;
    private final Lazy Uo;
    private final Context nr;
    private final Function2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC1335n f4681t;

    public I28(Function2 track, InterfaceC1335n concierge, Context context, vd scope, PI.j lifecycleObserver) {
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        this.rl = track;
        this.f4681t = concierge;
        this.nr = context;
        this.f4680O = scope;
        this.J2 = lifecycleObserver;
        this.Uo = LazyKt.lazy(new Function0() { // from class: JoA.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.J2(this.f4685n);
            }
        });
        j.C0457j c0457j = Zv.j.f12606n;
        DataStore dataStoreO = O();
        YgZ.w6 w6Var = YgZ.w6.f12217n;
        this.KN = c0457j.n(track, concierge, scope, lifecycleObserver, dataStoreO, w6Var.t(context), w6Var.rl(context), (128 & 128) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore J2(final I28 i28) {
        return PreferenceDataStoreFactory.t(PreferenceDataStoreFactory.f37697n, new ReplaceFileCorruptionHandler(new Function1() { // from class: JoA.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.Uo((CorruptionException) obj);
            }
        }), null, null, new Function0() { // from class: JoA.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.KN(this.f4682n);
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File KN(I28 i28) {
        return PreferenceDataStoreFile.n(i28.nr, "com.bendingspoons.picox.ping");
    }

    private final DataStore O() {
        return (DataStore) this.Uo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences Uo(CorruptionException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PreferencesFactory.n();
    }

    @Override // JoA.j
    public void n() {
        this.KN.n();
    }
}
