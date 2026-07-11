package dVI;

import MOX.w6;
import android.content.Context;
import androidx.content.core.DataStoreFactory;
import dVI.n;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f63502n = j.f63503n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f63503n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final File t(Context context) {
            return new File(context.getFilesDir(), "crash.pb");
        }

        public final n rl(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new w6(DataStoreFactory.t(DataStoreFactory.f37387n, F7.j.f2517n, null, null, null, new Function0() { // from class: dVI.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.t(context);
                }
            }, 14, null));
        }

        private j() {
        }
    }

    Object n(Continuation continuation);

    Object rl(Continuation continuation);
}
