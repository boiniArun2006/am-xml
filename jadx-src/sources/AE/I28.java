package AE;

import AE.I28;
import android.content.Context;
import androidx.content.core.CorruptionException;
import androidx.content.core.DataStoreFactory;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rB.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f34n = j.f35n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f35n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final File J2(Context context) {
            return new File(context.getNoBackupFilesDir(), "spidersense_user_info.pb");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Wre O(CorruptionException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return X9.w6.f11777n.getDefaultValue();
        }

        public final I28 nr(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new X9.j(DataStoreFactory.t(DataStoreFactory.f37387n, X9.w6.f11777n, new ReplaceFileCorruptionHandler(new Function1() { // from class: AE.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return I28.j.O((CorruptionException) obj);
                }
            }), null, null, new Function0() { // from class: AE.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.j.J2(context);
                }
            }, 12, null), new Function0() { // from class: AE.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.j.Uo();
                }
            });
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String Uo() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    Object n(Continuation continuation);
}
