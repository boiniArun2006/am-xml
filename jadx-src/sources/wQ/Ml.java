package wQ;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ml {
    public static final Object n(com.google.firebase.firestore.fuX fux, Class valueType) {
        Intrinsics.checkNotNullParameter(fux, "<this>");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        try {
            return fux.qie(valueType);
        } catch (Throwable unused) {
            return null;
        }
    }
}
