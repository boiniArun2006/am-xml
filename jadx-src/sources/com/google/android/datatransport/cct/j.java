package com.google.android.datatransport.cct;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import veW.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements CN3 {
    private static final Set J2;
    public static final j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f57355O;
    public static final j Uo;
    static final String nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f57356t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f57357n;
    private final String rl;

    static {
        String strN = I28.n("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f57356t = strN;
        String strN2 = I28.n("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        nr = strN2;
        String strN3 = I28.n("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f57355O = strN3;
        J2 = Collections.unmodifiableSet(new HashSet(Arrays.asList(bF.n.rl("proto"), bF.n.rl("json"))));
        Uo = new j(strN, null);
        KN = new j(strN2, strN3);
    }

    public static j t(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new j(str2, str3);
    }

    public String O() {
        return this.f57357n;
    }

    @Override // veW.Wre
    public String getName() {
        return "cct";
    }

    @Override // veW.CN3
    public Set n() {
        return J2;
    }

    public String nr() {
        return this.rl;
    }

    public byte[] rl() {
        String str = this.rl;
        if (str == null && this.f57357n == null) {
            return null;
        }
        String str2 = this.f57357n;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(C.UTF8_NAME));
    }

    public j(String str, String str2) {
        this.f57357n = str;
        this.rl = str2;
    }

    @Override // veW.Wre
    public byte[] getExtras() {
        return rl();
    }
}
