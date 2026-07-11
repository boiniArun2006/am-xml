package wQ;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {
    public static final boolean n(FirebaseAuth firebaseAuth) {
        String email;
        Intrinsics.checkNotNullParameter(firebaseAuth, "<this>");
        FirebaseUser firebaseUserXMQ = firebaseAuth.xMQ();
        return firebaseUserXMQ != null && firebaseUserXMQ.rl() && (email = firebaseUserXMQ.getEmail()) != null && rl(email);
    }

    private static final boolean rl(String str) {
        return StringsKt.endsWith$default(str, "@alightmotion.com", false, 2, (Object) null) || StringsKt.endsWith$default(str, "@alightcreative.com", false, 2, (Object) null) || StringsKt.endsWith$default(str, "@bendingspoons.com", false, 2, (Object) null);
    }
}
