package com.facebook.soloader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class SPz {
    private static boolean n(String str) {
        Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
        if (!matcher.find()) {
            return false;
        }
        qz.Uo("SoLoader", "Library name is corrupted, contains non-ASCII characters " + matcher.group());
        return true;
    }

    public static r rl(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        r rVar;
        if (unsatisfiedLinkError.getMessage() != null && unsatisfiedLinkError.getMessage().contains("ELF")) {
            qz.n("SoLoader", "Corrupted lib file detected");
            rVar = new s4(str, unsatisfiedLinkError.toString());
        } else if (n(str)) {
            qz.n("SoLoader", "Corrupted lib name detected");
            rVar = new UGc(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
        } else {
            rVar = new r(str, unsatisfiedLinkError.toString());
        }
        rVar.initCause(unsatisfiedLinkError);
        return rVar;
    }
}
