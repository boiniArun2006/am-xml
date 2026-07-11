package com.google.firebase.sessions;

import KfI.C1395c;
import KfI.M;
import KfI.ci;
import KfI.iwV;
import KfI.o;
import KfI.rv6;
import KfI.s4;
import KfI.vd;
import android.content.Context;
import android.util.Log;
import androidx.content.core.CorruptionException;
import androidx.content.core.DataStore;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.preferences.PreferenceDataStoreFile;
import androidx.content.preferences.core.PreferenceDataStoreFactory;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesFactory;
import java.io.File;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface n {

    public interface j {
        j J2(Context context);

        j O(CoroutineContext coroutineContext);

        n build();

        j n(oSp.n nVar);

        j nr(s9b.I28 i28);

        j rl(CoroutineContext coroutineContext);

        j t(com.google.firebase.Wre wre);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.n$n, reason: collision with other inner class name */
    public interface InterfaceC0812n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f60819n = j.f60820n;

        /* JADX INFO: renamed from: com.google.firebase.sessions.n$n$j */
        public static final class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            static final /* synthetic */ j f60820n = new j();

            /* JADX INFO: renamed from: com.google.firebase.sessions.n$n$j$Ml */
            static final class Ml extends Lambda implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Context f60821n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                Ml(Context context) {
                    super(0);
                    this.f60821n = context;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final File invoke() {
                    return PreferenceDataStoreFile.n(this.f60821n, s4.f5741n.n());
                }
            }

            /* JADX INFO: renamed from: com.google.firebase.sessions.n$n$j$j, reason: collision with other inner class name */
            static final class C0813j extends Lambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final C0813j f60822n = new C0813j();

                C0813j() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Preferences invoke(CorruptionException ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    Log.w(FirebaseSessionsRegistrar.TAG, "CorruptionException in settings DataStore in " + C1395c.f5694n.O() + '.', ex);
                    return PreferencesFactory.n();
                }
            }

            /* JADX INFO: renamed from: com.google.firebase.sessions.n$n$j$n, reason: collision with other inner class name */
            static final class C0814n extends Lambda implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Context f60823n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0814n(Context context) {
                    super(0);
                    this.f60823n = context;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final File invoke() {
                    return PreferenceDataStoreFile.n(this.f60823n, s4.f5741n.rl());
                }
            }

            /* JADX INFO: renamed from: com.google.firebase.sessions.n$n$j$w6 */
            static final class w6 extends Lambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final w6 f60824n = new w6();

                w6() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Preferences invoke(CorruptionException ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    Log.w(FirebaseSessionsRegistrar.TAG, "CorruptionException in sessions DataStore in " + C1395c.f5694n.O() + '.', ex);
                    return PreferencesFactory.n();
                }
            }

            public final rv6 O() {
                return vd.f5743n;
            }

            public final KfI.n n(com.google.firebase.Wre firebaseApp) {
                Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
                return ci.f5695n.rl(firebaseApp);
            }

            public final iwV nr() {
                return M.f5648n;
            }

            public final DataStore rl(Context appContext) {
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                return PreferenceDataStoreFactory.t(PreferenceDataStoreFactory.f37697n, new ReplaceFileCorruptionHandler(C0813j.f60822n), null, null, new C0814n(appContext), 6, null);
            }

            public final DataStore t(Context appContext) {
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                return PreferenceDataStoreFactory.t(PreferenceDataStoreFactory.f37697n, new ReplaceFileCorruptionHandler(w6.f60824n), null, null, new Ml(appContext), 6, null);
            }

            private j() {
            }
        }
    }

    fuX O();

    aC n();

    o nr();

    pu.Dsr rl();

    Dsr t();
}
