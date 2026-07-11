package DSG;

import DSG.Ml;
import android.content.Context;
import androidx.content.core.CorruptionException;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.preferences.PreferenceDataStoreFile;
import androidx.content.preferences.core.PreferenceDataStoreFactory;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesFactory;
import bH.CN3;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f1440n = j.f1441n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f1441n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final File O(Context context) {
            return PreferenceDataStoreFile.n(context, "secret-menu-floating-button");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Preferences nr(CorruptionException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return PreferencesFactory.n();
        }

        public final Ml t(final Context context, CN3.n.C0572n config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            return new I28(PreferenceDataStoreFactory.t(PreferenceDataStoreFactory.f37697n, new ReplaceFileCorruptionHandler(new Function1() { // from class: DSG.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ml.j.nr((CorruptionException) obj);
                }
            }), null, null, new Function0() { // from class: DSG.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ml.j.O(context);
                }
            }, 6, null), config);
        }

        private j() {
        }
    }

    TFv.Wre n();

    Object nr(Continuation continuation);

    Object rl(boolean z2, Continuation continuation);

    Object t(DSG.j jVar, Continuation continuation);
}
