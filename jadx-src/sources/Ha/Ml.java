package Ha;

import SL.Ml;
import SL.j;
import com.applovin.mediation.MaxError;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Ml {
    public static final SL.j n(MaxError maxError) {
        Object next;
        String message;
        Intrinsics.checkNotNullParameter(maxError, "<this>");
        Iterator<E> it = j.EnumC0310j.t().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((j.EnumC0310j) next).rl() == maxError.getCode()) {
                break;
            }
        }
        j.EnumC0310j enumC0310j = (j.EnumC0310j) next;
        if (enumC0310j == null) {
            enumC0310j = j.EnumC0310j.f9727Z;
        }
        if (enumC0310j == j.EnumC0310j.f9727Z) {
            message = "Unknown error code: " + maxError.getCode() + ". Message: " + maxError.getMessage();
        } else {
            message = maxError.getMessage();
        }
        Intrinsics.checkNotNull(message);
        int mediatedNetworkErrorCode = maxError.getMediatedNetworkErrorCode();
        String mediatedNetworkErrorMessage = maxError.getMediatedNetworkErrorMessage();
        if (mediatedNetworkErrorMessage == null) {
            mediatedNetworkErrorMessage = "";
        }
        return new SL.j(enumC0310j, message, mediatedNetworkErrorCode, mediatedNetworkErrorMessage);
    }

    public static final SL.Ml rl(MaxError maxError) {
        Object next;
        String message;
        Intrinsics.checkNotNullParameter(maxError, "<this>");
        Iterator<E> it = Ml.j.t().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Ml.j) next).rl() == maxError.getCode()) {
                break;
            }
        }
        Ml.j jVar = (Ml.j) next;
        if (jVar == null) {
            jVar = Ml.j.f9704E;
        }
        if (jVar == Ml.j.f9704E) {
            message = "Unknown error code: " + maxError.getCode() + ". Message: " + maxError.getMessage();
        } else {
            message = maxError.getMessage();
        }
        Intrinsics.checkNotNull(message);
        return new SL.Ml(jVar, message);
    }
}
