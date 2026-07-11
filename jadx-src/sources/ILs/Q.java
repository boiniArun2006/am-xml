package ILs;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Q {
    Object KN(Continuation continuation);

    Object O();

    Object Uo(Continuation continuation);

    void cancel(CancellationException cancellationException);

    Dsr iterator();
}
