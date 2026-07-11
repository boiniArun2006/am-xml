package wQ;

import com.google.firebase.Timestamp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class z {
    public static final long n(Timestamp timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "<this>");
        return (timestamp.getSeconds() * ((long) 1000)) + (((long) timestamp.getNanoseconds()) / 1000000);
    }
}
