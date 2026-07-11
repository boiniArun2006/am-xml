package com.bendingspoons.networking;

import com.bendingspoons.networking.NetworkError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {
    public static final String n(NetworkError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "<this>");
        if (networkError instanceof NetworkError.j) {
            NetworkError.j jVar = (NetworkError.j) networkError;
            return "Http Error: http code=" + jVar.rl() + ", data=" + jVar.n();
        }
        if (networkError instanceof NetworkError.n) {
            return "IO Error: message=" + ((NetworkError.n) networkError).n().getMessage();
        }
        if (networkError instanceof NetworkError.w6) {
            return "Json Parsing Error: message=" + ((NetworkError.w6) networkError).n().getMessage();
        }
        if (networkError instanceof NetworkError.Ml) {
            return "Timeout Error: message=" + ((NetworkError.Ml) networkError).n().getMessage();
        }
        if (!(networkError instanceof NetworkError.I28)) {
            throw new NoWhenBranchMatchedException();
        }
        return "Unknown Error: message=" + ((NetworkError.I28) networkError).n().getMessage();
    }

    public static final String rl(NetworkError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "<this>");
        if (networkError instanceof NetworkError.j) {
            return "HttpError";
        }
        if (networkError instanceof NetworkError.n) {
            return "IOError";
        }
        if (networkError instanceof NetworkError.w6) {
            return "JsonParsingError";
        }
        if (networkError instanceof NetworkError.Ml) {
            return "TimeoutError";
        }
        if (networkError instanceof NetworkError.I28) {
            return "UnknownError";
        }
        throw new NoWhenBranchMatchedException();
    }
}
