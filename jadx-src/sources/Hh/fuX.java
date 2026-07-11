package Hh;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class fuX extends HashSet {
    public static fuX rl(Object... objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        Collections.addAll(hashSet, objArr);
        return new fuX(hashSet);
    }

    private fuX(Set set) {
        super(set);
    }
}
