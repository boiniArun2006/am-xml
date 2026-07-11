package dzu;

import android.graphics.Trmy.yioUaKMByL;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class aC {
    public static Object n(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object rl(Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return n(obj);
    }

    public static final Object t(Object obj, Object obj2) {
        if (obj == null) {
            return n(obj2);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, yioUaKMByL.vUyrRMJUYbyKo);
            ((ArrayList) obj).add(obj2);
            return n(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return n(arrayList);
    }
}
