package D2t;

import D2t.n;
import android.content.Context;
import androidx.content.core.DataStoreFactory;
import com.bendingspoons.concierge.domain.entities.Id;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f1180n = j.f1181n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f1181n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final File t(Context context) {
            return new File(context.getNoBackupFilesDir(), "external_ids.pb");
        }

        public final n rl(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new m4J.j(DataStoreFactory.t(DataStoreFactory.f37387n, lm3.j.f70438n, null, null, null, new Function0() { // from class: D2t.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.t(context);
                }
            }, 14, null));
        }

        private j() {
        }
    }

    Object n(Id.Predefined.External.j jVar, Continuation continuation);

    Object rl(Id.Predefined.External external, Continuation continuation);

    Object t(Id.Predefined.External.j jVar, Continuation continuation);
}
