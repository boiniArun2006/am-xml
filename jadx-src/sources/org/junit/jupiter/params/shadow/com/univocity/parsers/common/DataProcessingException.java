package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class DataProcessingException extends TextParsingException {
    private int E2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private String f71579N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Map f71580T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Object f71581X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f71582e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f71583g;

    private int az() {
        int i2;
        int[] iArr = this.f71585S;
        return (iArr == null || (i2 = this.E2) >= iArr.length || i2 <= -1) ? this.E2 : iArr[i2];
    }

    public final Object HI() {
        int i2;
        if (this.f71592n == 0) {
            return null;
        }
        Object obj = this.f71581X;
        if (obj != null) {
            return obj;
        }
        Object[] objArr = this.f71582e;
        if (objArr == null || (i2 = this.E2) == -1 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public final int gh() {
        return this.E2;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException, org.junit.jupiter.params.shadow.com.univocity.parsers.common.j
    protected String n() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f71579N == null ? "" : this.f71579N + '\n');
        sb.append(super.n());
        String string = sb.toString();
        Object[] objArrTy = ty();
        if (objArrTy != null) {
            objArrTy = (Object[]) objArrTy.clone();
            for (int i2 = 0; i2 < objArrTy.length; i2++) {
                objArrTy[i2] = J2(objArrTy[i2]);
            }
        }
        return j.t(j.t(j.t(j.t(string, "row", objArrTy), "value", J2(HI())), "columnName", qie()), "columnIndex", Integer.valueOf(gh()));
    }

    public String qie() {
        String str = this.f71583g;
        if (str != null) {
            return str;
        }
        String[] strArrMUb = mUb();
        if (strArrMUb == null || az() == -1 || az() >= strArrMUb.length) {
            return null;
        }
        return strArrMUb[az()];
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException, org.junit.jupiter.params.shadow.com.univocity.parsers.common.j
    protected String rl() {
        return "Error processing parsed input";
    }

    public final Object[] ty() {
        return KN(this.f71582e);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.j
    protected final String xMQ(String str) {
        int iIndexOf;
        if (this.f71592n == 0 || str == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iIndexOf2 = str.indexOf(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, i2);
            if (iIndexOf2 == -1 || (iIndexOf = str.indexOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, iIndexOf2)) == -1) {
                break;
            }
            String strSubstring = str.substring(iIndexOf2 + 1, iIndexOf);
            Object obj = "value".equals(strSubstring) ? this.f71581X : this.f71580T.containsKey(strSubstring) ? this.f71580T.get(strSubstring) : null;
            if (obj != null) {
                String strJ2 = J2(obj);
                sb.append((CharSequence) str, i3, iIndexOf2);
                sb.append(strJ2);
                i3 = iIndexOf;
            }
            i2 = iIndexOf;
        }
        sb.append((CharSequence) str, i3 != 0 ? i3 + 1 : 0, str.length());
        return sb.toString();
    }
}
