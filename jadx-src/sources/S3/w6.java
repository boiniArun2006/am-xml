package S3;

import S3.w6;
import TFv.Wre;
import android.content.Context;
import androidx.content.core.CorruptionException;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.preferences.PreferenceDataStoreFile;
import androidx.content.preferences.core.PreferenceDataStoreFactory;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesFactory;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f8927n = j.f8928n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f8928n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final File O(Context context) {
            return PreferenceDataStoreFile.n(context, "secret-menu-favourite-experiment");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Preferences nr(CorruptionException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return PreferencesFactory.n();
        }

        public final w6 t(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new S8.j(PreferenceDataStoreFactory.t(PreferenceDataStoreFactory.f37697n, new ReplaceFileCorruptionHandler(new Function1() { // from class: S3.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w6.j.nr((CorruptionException) obj);
                }
            }), null, null, new Function0() { // from class: S3.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.j.O(context);
                }
            }, 6, null));
        }

        private j() {
        }
    }

    Wre n();

    Object rl(Continuation continuation);

    Object t(String str, Continuation continuation);
}
