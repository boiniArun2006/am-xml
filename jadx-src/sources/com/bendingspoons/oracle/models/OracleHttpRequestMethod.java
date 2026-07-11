package com.bendingspoons.oracle.models;

import androidx.annotation.Keep;
import com.safedk.android.a.g;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bendingspoons/oracle/models/OracleHttpRequestMethod;", "", "<init>", "(Ljava/lang/String;I)V", "GET", g.f61256f, "DELETE", "POST", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OracleHttpRequestMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OracleHttpRequestMethod[] $VALUES;
    public static final OracleHttpRequestMethod GET = new OracleHttpRequestMethod("GET", 0);
    public static final OracleHttpRequestMethod PUT = new OracleHttpRequestMethod(g.f61256f, 1);
    public static final OracleHttpRequestMethod DELETE = new OracleHttpRequestMethod("DELETE", 2);
    public static final OracleHttpRequestMethod POST = new OracleHttpRequestMethod("POST", 3);

    private static final /* synthetic */ OracleHttpRequestMethod[] $values() {
        return new OracleHttpRequestMethod[]{GET, PUT, DELETE, POST};
    }

    public static EnumEntries<OracleHttpRequestMethod> getEntries() {
        return $ENTRIES;
    }

    static {
        OracleHttpRequestMethod[] oracleHttpRequestMethodArr$values = $values();
        $VALUES = oracleHttpRequestMethodArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(oracleHttpRequestMethodArr$values);
    }

    public static OracleHttpRequestMethod valueOf(String str) {
        return (OracleHttpRequestMethod) Enum.valueOf(OracleHttpRequestMethod.class, str);
    }

    public static OracleHttpRequestMethod[] values() {
        return (OracleHttpRequestMethod[]) $VALUES.clone();
    }

    private OracleHttpRequestMethod(String str, int i2) {
    }
}
