package aw;

import com.bendingspoons.networking.NetworkError;
import ifA.w6;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pq.I28;
import pq.Ml;
import pq.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {
    public static final w6 n(NetworkError networkError, String componentName) {
        w6.j jVar;
        String str;
        Throwable thN;
        Ml ml;
        Intrinsics.checkNotNullParameter(networkError, "<this>");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        w6.n nVar = w6.n.f68151t;
        boolean z2 = networkError instanceof NetworkError.j;
        if (z2) {
            jVar = w6.j.f68145n;
        } else if (networkError instanceof NetworkError.n) {
            jVar = w6.j.f68144O;
        } else if (networkError instanceof NetworkError.Ml) {
            jVar = w6.j.f68147t;
        } else {
            if (!(networkError instanceof NetworkError.I28) && !(networkError instanceof NetworkError.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = w6.j.f68145n;
        }
        w6.j jVar2 = jVar;
        if (z2) {
            str = "Server replied HTTP error with code " + ((NetworkError.j) networkError).rl() + ".";
        } else if (networkError instanceof NetworkError.n) {
            str = "No internet connection available.";
        } else if (networkError instanceof NetworkError.Ml) {
            str = "The server did not respond.";
        } else if (networkError instanceof NetworkError.I28) {
            str = "An unknown network error occurred.";
        } else {
            if (!(networkError instanceof NetworkError.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Error when parsing JSON of the server reply.";
        }
        String str2 = str;
        if (z2) {
            thN = null;
        } else if (networkError instanceof NetworkError.n) {
            thN = ((NetworkError.n) networkError).n();
        } else if (networkError instanceof NetworkError.Ml) {
            thN = ((NetworkError.Ml) networkError).n();
        } else if (networkError instanceof NetworkError.I28) {
            thN = ((NetworkError.I28) networkError).n();
        } else {
            if (!(networkError instanceof NetworkError.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            thN = ((NetworkError.w6) networkError).n();
        }
        Throwable th = thN;
        if (z2) {
            NetworkError.j jVar3 = (NetworkError.j) networkError;
            ml = I28.n(n.nr("httpCode", Integer.valueOf(jVar3.rl())), n.O("payload", String.valueOf(jVar3.n())));
        } else {
            ml = new Ml();
        }
        return new w6(componentName, nVar, jVar2, str2, th, ml);
    }
}
